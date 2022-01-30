package guru.springframework;

public class Dollar {
	
	public int value;
	public Dollar(int value)
	{
		this.value=value;
	}
	
	public void multiply(int multiplyValue)
	{
		value*=multiplyValue;
	}

}
