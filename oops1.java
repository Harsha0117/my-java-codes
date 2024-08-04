//Hybrid inheritance
package Oops;
public class oops1 
{
	public static void main(String[] args) 
	{
		
		Multplication d1=new Multplication();
		System.out.println("this is Multiplication class accesing addtion class nd substraction class");
		d1.add();
		d1.sub();
		d1.mul();
		Modulus m1=new Modulus();
		System.out.println("this is Modulus class accesing addtion class nd substraction class");
		m1.mdiv();
		m1.add();
		m1.sub();

		
	}
}
	class Addition
	{
	String name="Harsha";
	int a=53;
	int b=28;
	void add()
	{
		int sum=a+b;
		System.out.println(sum);
		System.out.println(name);
		}
	}
	class Substraction extends Addition{
	void sub()
	{
		int sub=b-a;
		System.out.println(sub);
		
		}
	}
	class Multplication extends Substraction
	{ 
		int cross=5*3;
		void mul()
		{
			System.out.println(cross);
		}
		
	}
	class Modulus extends Substraction
	{
		void mdiv()
		{
			int mod=a%b;
			System.out.println(mod);
		}
	}
	
