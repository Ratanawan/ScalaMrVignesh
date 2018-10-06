class closure{
  
}

object Testing
{
  def retfun() =
  {
    () => "Hello"
//  () => "Yeah"
  }
  
  def retfun2() = 
  {
    (str1: String) =>
      {
        var sum =0
        
        for(i <- 0 to str1.length() -1)
        {
          sum = sum + str1.charAt(i).toInt
        }
        
      }
  }
  
  def main(args: Array[String]): Unit =
  {
    var s = retfun()
    var str = s()
    println(str)
    
    var s2 = retfun2()
    var ascii = s2(str)
    
    println(ascii)
  }
}