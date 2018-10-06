

class FunAsArgsHelloWorld {
  
}

object MyMain
{
  def SayHelloWorld(f : () => Unit)
  {
    f()
  }
  
  def main(args: Array[String])
  {
    var f = () => 
      {
        println("Hello World")
      }
    SayHelloWorld(f)
  }
}