object TestingScalaObject {
  case class MarkList(var name:String = "no name", var m1:Float = 0.0f, var m2:Float = 0.0f)
  {
  	def sayHello(myname:String = name) : Boolean =
  	{
  		println(s"My name is $name")
  		return true;
  	}
  }
  //creating object for MarkList class
  var mark = MarkList()                           //> mark  : TestingScalaObject.MarkList = MarkList(no name,0.0,0.0)
  //use the object to call sayHello()
  var b = mark.sayHello()                         //> My name is no name
                                                  //| b  : Boolean = true
  
  //case class will be constructor overloading unless you assign the default value to the variables
  var mark1 = MarkList()             //You can't use this if you don't assign the default value to the variables
                                                  //> mark1  : TestingScalaObject.MarkList = MarkList(no name,0.0,0.0)
  var mark2 = MarkList("wann", 100, 100)          //> mark2  : TestingScalaObject.MarkList = MarkList(wann,100.0,100.0)
  var mark3 = MarkList(m1 = 100)                  //> mark3  : TestingScalaObject.MarkList = MarkList(no name,100.0,0.0)
  var mark4 = MarkList(m2 = 33, m1 = 50)          //> mark4  : TestingScalaObject.MarkList = MarkList(no name,50.0,33.0)
  var mark5 = MarkList("wann", 100, 100)          //> mark5  : TestingScalaObject.MarkList = MarkList(wann,100.0,100.0)
  
  println(mark1)                                  //> MarkList(no name,0.0,0.0)
  println(mark2)                                  //> MarkList(wann,100.0,100.0)
  
  if(mark2.equals(mark5))
  {
    	println("equal")
  }
  else
  {
  	println("Not equal")
  }                                               //> equal
  
}