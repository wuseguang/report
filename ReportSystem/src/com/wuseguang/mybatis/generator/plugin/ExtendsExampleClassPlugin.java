package com.wuseguang.mybatis.generator.plugin;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Element;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

public class ExtendsExampleClassPlugin extends PluginAdapter {
	private String supserClassName;

	@Override
	public boolean validate(List<String> arg0) {
		// TODO Auto-generated method stub
		this.supserClassName = properties.getProperty("supserClassName");
		return supserClassName != null;
	}

	@Override
	public boolean modelExampleClassGenerated(TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		// add field, getter, setter for limit clause
		FullyQualifiedJavaType superType = new FullyQualifiedJavaType(
				supserClassName);
		topLevelClass.setSuperClass(superType);
		for (InnerClass iclass : topLevelClass.getInnerClasses()) {
			if (!iclass.getType().getFullyQualifiedName()
					.equals("GeneratedCriteria"))
				continue;
			String cmd = "";
			for (Method method : iclass.getMethods()) {
				if (!method.getName().equals("addCriterion"))
					continue;
				// method.addBodyLine("test");
				List<String> bodyLines = method.getBodyLines();
				String firstLine = bodyLines.get(0);
				String lastLine = bodyLines.get(bodyLines.size() - 1);
				bodyLines.clear();
				bodyLines.add(firstLine.replace("{", "return;"));
				bodyLines.add(lastLine);

				cmd += method.getName();
			}
			
		}
		return super.modelExampleClassGenerated(topLevelClass,
				introspectedTable);
	}

	@Override
	public boolean sqlMapBaseColumnListElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {
		List<Element> elist = element.getElements();
		// Element old=elist.get(0);
		// elist.clear();
		XmlElement isNotNullElement = new XmlElement("if");
		isNotNullElement.addAttribute(new Attribute("test", "columns!=null"));
		isNotNullElement.addElement(new TextElement(" ${columns} "));
		XmlElement isNullElement = new XmlElement("if");
		isNullElement.addAttribute(new Attribute("test", "columns==null"));
		//isNullElement.addElement(elist.get(elist.size()-1));
		for(int i=5;i<elist.size();i++)
			isNullElement.addElement(elist.get(i));
		while(elist.size()>5)
			elist.remove(elist.size()-1);
		elist.add(isNotNullElement);
		elist.add(isNullElement);
		//this.sqlMapSelectByPrimaryKeyElementGenerated(arg0, arg1)
		return super.sqlMapBaseColumnListElementGenerated(element,
				introspectedTable);
		
	}
	@Override
	public boolean sqlMapSelectByPrimaryKeyElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable){
		List<Element> elist=element.getElements();
		Attribute attribute=new Attribute("parameterType","map");
		for(Attribute attr:element.getAttributes()){
			if(!attr.getName().equals("parameterType"))continue;
			element.getAttributes().remove(attr);
			element.addAttribute(attribute);
			break;
		}
		return super.sqlMapSelectByPrimaryKeyElementGenerated(element, introspectedTable);
	}
	@Override
	public boolean clientSelectByPrimaryKeyMethodGenerated(Method method,  
            Interface interfaze, IntrospectedTable introspectedTable){
		//Parameter p=new Parameter(null, supserClassName);
		//p.
		Parameter id=method.getParameters().remove(0);
		id.addAnnotation("@Param(\"id\")");
		Parameter columns=new Parameter(new FullyQualifiedJavaType("String"), "columns");
		columns.addAnnotation("@Param(\"columns\")");
		method.addParameter(columns);
		method.addParameter(id);
		return super.clientSelectByPrimaryKeyMethodGenerated(method, interfaze, introspectedTable);
		
	}
	@Override
	public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(
			XmlElement element, IntrospectedTable introspectedTable) {
		// XmlElement isParameterPresenteElemen = (XmlElement) element
		// .getElements().get(element.getElements().size() - 1);
		XmlElement isNotNullElement = new XmlElement("if"); //$NON-NLS-1$  
		isNotNullElement.addAttribute(new Attribute(
				"test", "limitStart != null and limitStart>=0")); //$NON-NLS-1$ //$NON-NLS-2$  
		//	      isNotNullElement.addAttribute(new Attribute("compareValue", "0")); //$NON-NLS-1$ //$NON-NLS-2$  
		isNotNullElement.addElement(new TextElement(
				"limit #{limitStart} , #{limitEnd}"));
		// isParameterPresenteElemen.addElement(isNotNullElement);
		element.addElement(isNotNullElement);
		return super.sqlMapUpdateByExampleWithoutBLOBsElementGenerated(element,
				introspectedTable);
	}

}
