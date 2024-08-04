package Oops;

public class MethodOverriding1 
{
	public static void main(String[] args) 
	{
		X y1=new X();
		y1.x1("This is claas X,method x1",5);
		X y2=new Y();
		y2.x1("this class Y,method x1",8);
		
	}
}
class X
{
	void x1(String x,int a)
	{
		int b=a*3;
		System.out.println(x);
		System.out.println(b);
	}
}
class Y extends X
{
	void x1(String x,int a)
	{
		int c=a*4-5;
		System.out.println(x);
		System.out.println(c);
	}
}
