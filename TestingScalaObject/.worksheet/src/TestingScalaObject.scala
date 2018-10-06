object TestingScalaObject {
  case class MarkList(var name:String = "no name", var m1:Float = 0.0f, var m2:Float = 0.0f)
  {
  	def sayHello(myname:String = name) : Boolean =
  	{
  		println(s"My name is $name")
  		return true;
  	}
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(301); 
  //creating object for MarkList class
  var mark = MarkList();System.out.println("""mark  : TestingScalaObject.MarkList = """ + $show(mark ));$skip(64); 
  //use the object to call sayHello()
  var b = mark.sayHello();System.out.println("""b  : Boolean = """ + $show(b ));$skip(216); 
  
  //case class will be constructor overloading unless you assign the default value to the variables
  var mark1 = MarkList();System.out.println("""mark1  : TestingScalaObject.MarkList = """ + $show(mark1 ));$skip(41);              //You can't use this if you don't assign the default value to the variables
  var mark2 = MarkList("wann", 100, 100);System.out.println("""mark2  : TestingScalaObject.MarkList = """ + $show(mark2 ));$skip(33); 
  var mark3 = MarkList(m1 = 100);System.out.println("""mark3  : TestingScalaObject.MarkList = """ + $show(mark3 ));$skip(41); 
  var mark4 = MarkList(m2 = 33, m1 = 50);System.out.println("""mark4  : TestingScalaObject.MarkList = """ + $show(mark4 ));$skip(41); 
  var mark5 = MarkList("wann", 100, 100);System.out.println("""mark5  : TestingScalaObject.MarkList = """ + $show(mark5 ));$skip(21); 
  
  println(mark1);$skip(17); 
  println(mark2);$skip(98); 
  
  if(mark2.equals(mark5))
  {
    	println("equal")
  }
  else
  {
  	println("Not equal")
  }}
  
}
