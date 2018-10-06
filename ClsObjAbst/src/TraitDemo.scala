//Trait1
trait trait1
{
  def fun1() //abstract function
  
  def fun2()
  {
    println("This is fun2")
  }
  println("This is trait1")
}

//Trait2
trait trait2
{
  def fun3() //abstract function
  
  def fun4()
  {
    println("This is fun4")
  }
  println("This is trait2")
}

class TraitDemo extends trait1 with trait2{
  println("In TraitDemo class")
   def fun1()
  {
    println("Override fun1")
  }
  
  override def fun3()
  {
    println("Override fun3")
  }
}

object TraitDemo
{
  def main(a: Array[String])
  {
    var td = new TraitDemo
    td.fun1
    td.fun2
    td.fun3
    td.fun4
  }
}