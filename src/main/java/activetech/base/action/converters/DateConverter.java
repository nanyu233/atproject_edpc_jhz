package activetech.base.action.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

import activetech.util.StringUtils;

public class DateConverter implements Converter<String, Date> {
	
	public Date convert(String source) {

		if(StringUtils.isNotNullAndEmptyByTrim(source)){//如果从浏览器传入字符串不等于开始转换
			source = source.trim();//去除前后空格
			if(source.equals("")){ 
				source = null;
			}
			if(source!=null && source.length() ==10){//去除空格后不为空则开始转换
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
				try {
					return simpleDateFormat.parse(source);
				} catch (ParseException e) {
					e.printStackTrace();
					return null;
				}
			}else if(source!=null && source.length() == 7){
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM");
				try {
					return simpleDateFormat.parse(source);
				} catch (ParseException e) {
					e.printStackTrace();
					return null;
				}
			}else if(source!=null && source.length() == 8){
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
				try {
					return simpleDateFormat.parse(source);
				} catch (ParseException e) {
					e.printStackTrace();
					return null;
				}
			}else if(source!=null && source.length() == 4){
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
				try {
					return simpleDateFormat.parse(source);
				} catch (ParseException e) {
					e.printStackTrace();
					return null;
				}
			}else if(source!=null && source.length() == 16){
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
				try {
					return simpleDateFormat.parse(source);
				} catch (ParseException e) {
					e.printStackTrace();
					return null;
				}
			}else{
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				try {
					return simpleDateFormat.parse(source);
				} catch (ParseException e) {
					e.printStackTrace();
					return null;
				}
			}
			
		}
		return null;
		
	}
}
