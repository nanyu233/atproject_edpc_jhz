package activetech.base.action.converters;

import org.springframework.core.convert.converter.Converter;
/**
 * 
 * <p>Title:StringTrimConverter</p>
 * <p>Description:参数去除空格转化器</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-2-4 下午4:37:59
 *
 */
public class StringTrimConverter implements Converter<String, String> {

	public String convert(String source) {
		//如果源字符串不为空则进行转换
		if(source != null){
			//去除源字符串前后空格
			source = source.trim();
			if(source.equals("")){ 
				source = null;
			}
		}
		return source;
	}
}
