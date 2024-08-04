package Oops;

public class Methodoverloading1 
{
	public static void main(String[] args) 
	{
		A1 a1=new A1();
		a1.sum(5.3,6.0);
		a1.sum(5, 6);
		
	}
}
class A1
{
	void sum(double a,double b)
	{
		double d=a%b;
		System.out.println(d);
	}
	void sum(float a,float b)
	{
		float e=a/b;
		System.out.println(e);
	}
} 