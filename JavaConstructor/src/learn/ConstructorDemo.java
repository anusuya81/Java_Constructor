package learn;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOpt abc=new MathOpt();
		System.out.println(abc.sum(5, 5));
		MathOpt xyz=new MathOpt(5,"Five");
		System.out.println(xyz.sum(5,15));
	}

}
