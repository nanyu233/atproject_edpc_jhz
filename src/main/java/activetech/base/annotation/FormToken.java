package activetech.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
 * 页面form   token 
 */  
@Target(ElementType.METHOD)  
@Retention(RetentionPolicy.RUNTIME)  
public @interface FormToken {  
  
    boolean save() default false;  
  
    boolean remove() default false;  
    
    String name() default "token";
}  