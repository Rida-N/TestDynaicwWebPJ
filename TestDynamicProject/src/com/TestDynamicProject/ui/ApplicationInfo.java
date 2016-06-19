package com.TestDynamicProject.ui;

import javax.annotation.ManagedBean;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@ManagedBean
@Scope("session")
public class ApplicationInfo {
	private String slogan="Promoting plants diversity thorough education";

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
}
