package Package1;


public class Testclass {

	public class A
	{
		int a=1;
		public void test1(int a) 
		{
			
			System.out.println("Class A method with value of a is  "+ a);
			
		}
		
	}
	 class B extends A
	{
		public void test() 
		{
			System.out.println("Class B method " +a);
		}
		
	}
	 public static void main(String[] args)
	{
		Testclass test = new Testclass();
		B b1 = test.new B();
		b1.test1(2);
		b1.test();
	}
}
