package activetech.eicu.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import activetech.eicu.pojo.dto.IcuVsInfoCustom;

public class ClassUtil {
	/**
	 * @param object 旧的对象带值 
	 * @param addMap 动态需要添加的属性和属性类型 
	 * @param addValMap 动态需要添加的属性和属性值
	 * @return 新的对象 
	 * @throws Exception
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Object dynamicClass(Object object, Map addMap, Map addValMap) throws Exception {
		HashMap returnMap = new HashMap();
		HashMap typeMap = new HashMap();
		Class<?> type = object.getClass();
		BeanInfo beanInfo = Introspector.getBeanInfo(type);
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

		for (int i = 0; i < propertyDescriptors.length; i++) {
			PropertyDescriptor descriptor = propertyDescriptors[i];
			String propertyName = descriptor.getName();
			if (!propertyName.equals("class")) {
				Method readMethod = descriptor.getReadMethod();
				Object result = readMethod.invoke(object);
				// 可以判断为 NULL不赋值
				returnMap.put(propertyName, result);
				typeMap.put(propertyName, descriptor.getPropertyType());
			}
		}
		
		returnMap.putAll(addValMap);
		typeMap.putAll(addMap);
		// map转换成实体对象
		DynamicBean bean = new DynamicBean(typeMap);
		// 赋值
		Set keys = typeMap.keySet();
		for (Iterator it = keys.iterator(); it.hasNext();) {
			String key = (String) it.next();
			bean.setValue(key, returnMap.get(key));
		}
		Object obj = bean.getObject();
		return obj;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		HashMap returnMap = new HashMap();
		HashMap typeMap = new HashMap();
		IcuVsInfoCustom vsInfo= new IcuVsInfoCustom();
		Class<?> type = vsInfo.getClass();
		BeanInfo beanInfo = Introspector.getBeanInfo(type);
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for (int i = 0; i < propertyDescriptors.length; i++) {
			PropertyDescriptor descriptor = propertyDescriptors[i];
			String propertyName = descriptor.getName();
			if (!propertyName.equals("class")) {
				Method readMethod = descriptor.getReadMethod();
				Object result = readMethod.invoke(vsInfo);
				// 可以判断为 NULL不赋值
				returnMap.put(propertyName, result);
				typeMap.put(propertyName, descriptor.getPropertyType());
			}
		}
		System.out.println("a");
	}
	
}
