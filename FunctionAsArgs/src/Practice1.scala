class Practice1 {
  
}

class Main
{
  def loop(i:Int, f:()=>Unit)
  {
    for(n <- 1 to i)
    {
      print(n + " : ")
      f()
    }
  }
  
  def recursive(i:Int, f : () => Unit)
  {
    if(i>0)
    {
      f()
      recursive(i-1,f)
    }
  }
  
  
  def printMyName(num:Int, name: (String) => Unit)
  {
    if(num > 0)
    {
      name("Thepanom Ratanawan")
      printMyName(num-1, name)
    }
  }
  
  def anotherName(num:Int, name:String, FunName:(String) => Unit)
  {
     if(num>0)
     {
       FunName(name)
       anotherName(num-1, name, FunName)
     }
  }
  
  def adding(a:Int, b:Int, add: (Int,Int) => Unit)
  {
    add(a,b)
  }
  
  def returnString(f : () => String)
  {
    f()
  }
}
  
object TheMain
{
   //Main Function
  def main(args: Array[String])
  {
    println("Input a number: ")
    var n: Int = scala.io.StdIn.readInt()
    
    //Loop Function
    var f1 = () =>
      {
        println("Wann")
      }
    loop(n, f1)
    
    //recursive function
    var f2 = () =>
      {
        println("In recursive")
      }
    recursive(n,f2)
    
    //printMyName function
    var name = (str : String)=>
      {
        println (s"My name is: $str")
      }
    printMyName(n , name)
    
    //anotherName function
    var myName = "Salaza212"
    var FunName = (str: String) =>
      {
        println(str)
      }
    anotherName(n,myName,FunName)
    
    //adding function
    println("Enter num1: ")
    var a  = scala.io.StdIn.readInt()
    println("Enter num2: ")
    var b = scala.io.StdIn.readInt()
    var add = (n1:Int, n2:Int) =>
      {
        var sum = a + b
        println(s"The sum of 'a' and 'b' is $sum")
      }
    adding(a,b,add)
    
    //No argument with string return type
    //returnString function
    var f = ()=>
      {
        "My String"
      }
    println(returnString(f))
  }
 }