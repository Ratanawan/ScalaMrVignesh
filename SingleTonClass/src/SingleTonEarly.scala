
class SingleTonEarly private(id:Int) //private constructor in scala
{
    var id = 20
    def MyFunction(){
      println("Fun1")
    }
}

object single //Early singleton pattern, coz whenever you run the program JVM will create object for this class
{
  var id = 10 //static
  def print() //static
  {
    println("I'm a singleton element.")
    
  }
}

object SingleTonEarly
{
  def main(args: Array[String]) : Unit = 
  {
    single.print()
    SingleTonEarly.MyFunction()
    
  }
}