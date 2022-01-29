package main.java.guru.springframework;

public class Dollar {
	
	public int value;
	public Dollar(int value)
	{
		this.value=0;
	}
	
	public void multiply(int multiplyValue)
	{
		value*=multiplyValue;
	}

}
