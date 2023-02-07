package com.demo.factorymethod;

public interface Bird {

	public String getBirdDetails();
}

class Parrot implements Bird
{
	@Override
	public String getBirdDetails() {
		return "Parrot Called";
	}
}

class Crow implements Bird
{
	@Override
	public String getBirdDetails() {
		return "Crow Called";
	}
}

class Eagle implements Bird
{
	@Override
	public String getBirdDetails() {
		return "Eagle Called";
	}
}

class Sparrow implements Bird
{
	@Override
	public String getBirdDetails() {
		return "Sparrow Called";
	}
}
