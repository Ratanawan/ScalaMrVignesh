
class MainClass 
{
  
}

object MyObject
{
  def main(args: Array[String]): Unit = 
  {
    var res = for(n <- 1 until 100 by 3) yield n
    
    var sum = 0
    var str = " "
    for(n <- res)
    {
      sum = sum + n
      str = str + sum + "\n"
    }
    
    println("The elements are: ")
    println(str)
    println(sum)
    
    //using foreach loop to iterate all the elements in the collection
    res.foreach((ele:Int) =>
        {
          println(ele)
          println("*******")
          sum = sum + ele
        })
    println(s"The sum of all elements in the vector is: $sum")
    
    //Looping array of string
    var arr1 = Array("String1", "Hello", "World", "Wann")
    arr1.foreach((st:String) =>
      {
        if(st == "Hello")
        {
          println(s"$st Welcome to KIT")
        }
        else if(st == "Wann")
        {
          println(s"$st is my name")
        }
        else if(st == "World")
        {
          println(s"You are my $st")
        }
        else
        {
          println("I am nothing")
        }
      })
  }
}





