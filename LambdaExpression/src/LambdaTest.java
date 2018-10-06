//Functional Interface: Function with one abstract function
interface MyInter
{
	public void test(String str);
}

//class to implement interface, it's a convention to use the same name as interface
class MyClass implements MyInter
{
	@Override
	public void test(String str)
	{
		System.out.println(str + " YO first override\noverride in class");
	}
}
public class LambdaTest {
	public static void main(String[] args)
	{
//		MyInter mi1 = new MyInter()
//		{
//			@Override
//			public void test(String str)
//			{
//				System.out.println(str + " YO second override\noverride in anonymous class");
//			}
//		};
//		mi1.test("wann");
		
//		MyInter mi2 = new MyClass();
//				mi2.test("MyString");
				
		//Lambda Expression, 
		MyInter m3 = (str) -> System.out.println("This is Lambda Function");
		m3.test("My Lambda Expression");
	
	}
}
