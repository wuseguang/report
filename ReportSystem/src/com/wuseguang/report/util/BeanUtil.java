package com.wuseguang.report.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BeanUtil {
	private static void injectAttribute(Object bean,List<String> keylist,String value){
		try{
			if(value==null||value.trim().isEmpty())return;
			String key=keylist.get(0);
			String setMethodName="set"+key.substring(0, 1).toUpperCase()+key.substring(1);
			Class[] parameterTypes = new Class[1];        
		    Field field = bean.getClass().getDeclaredField(key);       
		    parameterTypes[0] = field.getType();      
			Method setMethod=bean.getClass().getMethod(setMethodName,parameterTypes);
			Class<?>[] classes=setMethod.getParameterTypes();
			if(classes.length!=1)return;
			Class<?> argClass=classes[0];
			if(argClass==int.class||argClass==Integer.class)
				setMethod.invoke(bean, new Object[]{Integer.parseInt(value)});
			else if(argClass==String.class)
				setMethod.invoke(bean, new Object[]{value});
			else if(argClass==Date.class){
				SimpleDateFormat simFormat = new SimpleDateFormat("yyyy-MM-dd");
				setMethod.invoke(bean, new Object[]{simFormat.parse(value)});
			}
		}catch(Exception ex){
			ex.printStackTrace();
			return;
		}
	}
	public static Object createBean(Map<String,String[]> parameters,String beanClassName,String beanName){
		try{
			Object bean=Class.forName(beanClassName).newInstance();
			for(Entry<String, String[]> entry:parameters.entrySet()){
				String keys=entry.getKey();
				String[] value=entry.getValue();
				if(!keys.contains("."))continue;
				List<String> keylist=new ArrayList<String>();
				for(String key:keys.split("\\."))
					keylist.add(key);
				//System.out.println(key)
				//System.out.println(JsonUtil.toJson(key.split("\\.")));
				if(!keylist.remove(0).equals(beanName))continue;
				injectAttribute(bean,keylist,(value==null||value.length==0)?null:value[0]);
			}
			return bean;
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
		
	}
}
