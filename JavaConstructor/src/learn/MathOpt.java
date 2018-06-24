package learn;

public class MathOpt {
	static int z;
	public static int sum(int a,int b)
	{
		int result;
		return result=a+b;
	}
   public MathOpt()
	{
		z=10;
		System.out.println(z);
		System.out.println("i am from Constructor");
	}//default Constructor
	public MathOpt(int x,String y)
	{
		System.out.println(x + " "+ y);
	}//parameterized Constructor
	public static void MathOpt()//you can create a method with same name as class name
	{
		System.out.println("i am a method");
	}

}
