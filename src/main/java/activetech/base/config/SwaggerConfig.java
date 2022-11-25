package activetech.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.util.UriComponentsBuilder;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.AbstractPathProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import static com.google.common.base.Strings.isNullOrEmpty;
import static springfox.documentation.spring.web.paths.Paths.removeAdjacentForwardSlashes;

/**
 * <h1>swagger 配置类</h1>
 * <h2>扫描指定包里的 Controller</h2>
 * <h3>包扫描单选</h3>
 * apis ( RequestHandlerSelectors.basePackage("activetech.edpc.action"))
 * <h3>包扫描多选</h3>
 * apis(Predicates.or(RequestHandlerSelectors.basePackage("activetech.edpc.action")
 * ,RequestHandlerSelectors.basePackage("activetech.edpc.action"))
 * <h2>扫描注解</h2>
 * <h3>注解扫描单选</h3>
 * RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)
 * Controller层的方法上配置了注解@ApiOperation，就会被扫描处理。
 * 注：ApiOperation.class swagger 包里的注解 可以换成其他注解类  Controller  RestController
 * <h3>注解扫描多选</h3>
 * apis(Predicates.or(RequestHandlerSelectors.withClassAnnotation(RestController.class)
 * ,RequestHandlerSelectors.withClassAnnotation(Controller.class)))
 *
 *
 * @author chenys
 * @date 2022/11/25 13:29
 */

@EnableSwagger2
@Configuration
@EnableWebMvc
public class SwaggerConfig {
    @Resource
    private ServletContext servletContext;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
//                .pathMapping("/")
                .useDefaultResponseMessages(false)
                .pathProvider(new CuRelativePathProvide(servletContext))
                .select()
//                .apis(RequestHandlerSelectors.basePackage("activetech.edpc.action"))
                //扫描所有 org.springframework.stereotype.Controller 注解的类
                .apis(RequestHandlerSelectors.withClassAnnotation(Controller.class))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(
                        new ApiInfoBuilder()
                                .contact(
                                        new Contact("chenYs", "", "")
                                )
                                .title("Swagger")
                                .description("三大中心")
                                .version("1.0")
                                .build()
                );
    }

    /**
     * 继承 AbstractPathProvider 接口  来 替换 RelativePathProvider
     * 内部类 初始化swagger 用的,目前只为了给url加后缀 .do
     * getOperationPath 处修改
     */
    public static class CuRelativePathProvide extends AbstractPathProvider {
        public static final String ROOT = "/";
        public static final String URL_SUFFIX = ".do";
        private final ServletContext servletContext;

        public CuRelativePathProvide(ServletContext servletContext) {
            this.servletContext = servletContext;
        }

        @Override
        public String getOperationPath(String operationPath) {
            UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromPath("/");
            return removeAdjacentForwardSlashes(uriComponentsBuilder.path(operationPath).build().toString() + URL_SUFFIX);
        }

        @Override
        protected String applicationPath() {
           return isNullOrEmpty(servletContext.getContextPath()) ? ROOT : servletContext.getContextPath();
        }

        @Override
        protected String getDocumentationPath() {
            return ROOT;
        }
    }
}

