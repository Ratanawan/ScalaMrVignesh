

class MyMainClass
{
  //function return type string
   def demoString(num : Int) : String = 
   {
     if(num>10) "Greater" else "Lesser"
   }
   
   //function return type boolean
   def demoBoolean(num : Int) : Boolean = 
   {
     if(num>10) true else false
   }
   
   //function like pattern matches (switch case)
   def patternMatches(str : String) : String = 
   {
     str match
     {
       case "A" => 
         return "Apple"
       case "B" =>
         return "Banana"
       case "C" =>
         return "Coconut"
       case _ =>
         return "Default"
     }
   }
   
   //while functions
   def whileDemo(i : Int) = 
   {
     var temp = i
     while(temp>10 && temp<20)
     {
       println("In while loop")
       temp = temp + 1
     }
     
     temp = i
     do{
       println("In do while")
       temp = temp + 1
     }
     while(temp < 20)
   }
   
   //loop the array function
   def loopArray() : Any =  
   {
     var a = Array(10,20,30,40)
     for(i <- a)
     {
       return i
     }
     
     for(n <- 0 until 10 )
     {
       println(n)
     }
   }
}

object MyObject
{
  def main(args: Array[String]) : Unit = 
  {
    var obj = new MyMainClass
    println("Enter a number: ")
    var n1 = scala.io.StdIn.readInt()
    println(obj.demoString(n1))
    println(obj.demoBoolean(n1))
    
    println("Enter a letter: ")
    var str = scala.io.StdIn.readLine()
    println(obj.patternMatches(str))
    
//    println("Enter a number: ")
//    var n2 = scala.io.StdIn.readInt()
//    println(obj.whileDemo(n2))
    
    println(obj.loopArray())
  }
}