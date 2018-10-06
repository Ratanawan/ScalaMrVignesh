//abstract class1
abstract class AbsClass1
{
  def fun1 //Abstract function
  
  def fun2()
  {
    println("Concreate function from AbsClass1")
  }
}

//abstract class2
abstract class AbsClass2
{
  def fun1 //Abstract function
  
  def fun2()
  {
    println("Concreate function from AbsClass2")
  }
}

//every elements in the class are instance
class MainClass extends AbsClass1{
  def test(a: Int = 10) : Int = 
  {
    println("Hello from test class")
    return a 
  }
  
  @Override //override here is an Annotation
  override def fun1() // override here is a keyword
  {
    println("Override fun1()...")
  }
}

//every elements in the object are static by default
//the main class should be created in object
object MainObj
{
  def main(a: Array[String])
  {
    var mc = new MainClass
    println("Hello from Main: "+ mc.test(10))
    mc.fun1()
  }
}