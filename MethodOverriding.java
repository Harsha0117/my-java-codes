package Oops;

public class MethodOverriding 
{
	public static void main(String[] args) 
	{
		Harsha h1=new Harsha();
		h1.sleep();
		Harsha h2=new Supriya();
		h2.sleep();
		
	}
}
class Harsha
{
	void sleep()
	{
		System.out.println("Harsha is Sleeping");
	}
}
class Supriya extends Harsha
{
	void sleep()
	{
		System.out.println("Supriya is Sleeping");
	}
}
