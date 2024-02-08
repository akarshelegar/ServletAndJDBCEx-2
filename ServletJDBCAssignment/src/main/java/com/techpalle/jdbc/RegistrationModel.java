package com.techpalle.jdbc;

public class RegistrationModel {
	
	private String name;
	private String email;
	private String qual;
	private String pwd;
	private String state;
	
	public RegistrationModel(String name, String email, String qual, String pwd, String state)
	{
		this.name=name;
		this.email=email;
		this.qual=qual;
		this.pwd=pwd;
		this.state=state;
		
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getQual()
	{
		return qual;
	}
	public void setQual(String qual)
	{
		this.qual=qual;
	}
	public String getPwd()
	{
		return pwd;
	}
	public void setPwd(String pwd)
	{
		this.pwd=pwd;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state=state;
	}

}
