

class PassingFunctionArgs {
  
}

object MainClass
{
  def demo1(f : () => Unit, a:Int)
  {
    f()
  }
  
  def main(args: Array[String]): Unit = 
  {
    var a:Int = 21 //declare a variable and assigned 21 value
    
    var f = () => //declare a variable and assigned a function with lambda expression 
      {
        println("Wann")
      }
    demo1(f,a)
  }
}