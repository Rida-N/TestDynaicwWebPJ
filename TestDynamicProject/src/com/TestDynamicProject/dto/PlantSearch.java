package com.TestDynamicProject.dto;

import javax.annotation.ManagedBean;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@ManagedBean
@Scope("session")
public class PlantSearch {
	private String name="Test";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}