

class Practice2 {
  
}

object TheMain
{
  def arithmetic(n1:Int, n2:Int, operate : (Int,Int) => Unit)
  {
    operate(n1,n2)
  }
  
  def main(args: Array[String])
  {
    //arithmetic function
    println("Enter num1: ")
    var n1 = scala.io.StdIn.readInt()
    println("Enter num2: ")
    var n2 = scala.io.StdIn.readInt()
    var sumf = (n1:Int, n2:Int) =>
      {
        var sum = n1 + n2
        println(s"The sum of n1 and n2 is $sum")
      }
     var subf = (n1:Int, n2:Int) =>
      {
        var sub = n1 - n2
        println(s"The subtraction of n1 and n2 is $sub")
      }
       var mulf = (n1:Int, n2:Int) =>
      {
        var mul = n1 * n2
        println(s"The multiple of n1 and n2 is $mul")
      }
       var divf = (n1:Int, n2:Int) =>
      {
        var div = n1 / n2
        println(s"The division of n1 and n2 is $div")
      }
       var modf = (n1:Int, n2:Int) =>
      {
        var mod = n1 % n2
        println(s"The modolation of n1 and n2 is $mod")
      }
      arithmetic(n1,n2,sumf)
      arithmetic(n1,n2,subf)
      arithmetic(n1,n2,mulf)
      arithmetic(n1,n2,divf)
      arithmetic(n1,n2,modf)
      
  }
}