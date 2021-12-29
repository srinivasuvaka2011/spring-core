package com.example.springioc;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionValuesInjection {

	private Map<String, Object> map;
	
	private Properties properties;
	
	private Set set;
	
	private List list;

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
	public void displayInfo() {
		System.out.println("Map Contents: \n");
		map.entrySet().forEach(e -> System.out.println("Key: "+e.getKey() + " - Value: "+e.getValue()+" \n"));
		
		System.out.println("\n Property Contents: \n");
		properties.entrySet().forEach(e -> System.out.println("Key: "+e.getKey() + " - Value: "+e.getValue()+" \n"));
		
		System.out.println("\n Set Contents: \n");
		list.forEach(e-> System.out.println("Value: "+e+" \n"));
		
		System.out.println("\n List Contents: \n");
		set.forEach(e-> System.out.println("Value: "+e+" \n"));
	}
	
}
