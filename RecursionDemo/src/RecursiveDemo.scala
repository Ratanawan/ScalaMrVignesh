

class RecursiveDemo {
  
}

object Main
{
 //main function
  def main(args: Array[String])
  {
    //invoking recursive
    println("\nThis recursive")
    sample(20)
    
    //invoking nested function
    println("\nThis is nested function")
    nested(20,30)
    
    //composing function
    println("\nThis is composing function")
    println(addNum(subNum(20,30),100))
    
    //Function currying
    //passing the primary argument first, for the second argument use 'wild card' for any argument later
    //primary argument is always the first argument
    println("\nThis is curry function")
    var x = curry(10)_
    //pass the second argument later
    var y = x(20)
    println(x(20))
    
    //curryLambda
    println("This is curry Lambda")
    var n = curryLambda(10)(_)
    var m = n(21)
    println(m)
    
    //multiple arguments in curry function 
    println("\nThis is multiple arguments in curry function")
    var a = multiCurryLambda(1)(_)
    var b = a(2)(_)
    var c = b(3)(_)
    var d = c(4)
    println(d)
    
  }
    
  //Recursive Function
  def sample(i:Int)
  {
    if(i>10)
    {
      println("Hello..")
      sample(i-1)
    }
    else
      println("Finished...")
  }
   
  //Nested Function
  def nested(x:Int, y:Int)
  {
    def inner(a:Int)
    {
      println(s"I am the inner\nMy 'x' value is $x")
    }
    inner(x)
    
    var myFun = (b:Int) =>
      {
        println(s"I am in lambda function\nMy 'y' value is $y")
        
      }
    myFun(y)
   }
  
  //Composing Function: calling a function to use in another function argument
  def addNum(a:Int, b:Int) = a + b
  def subNum(a:Int, b:Int) = a - b
  
  //Function currying: function that we can pass argument whenever we want. It gives ability to pass the argument later.
  // _ this is called 'wild card'
  //it is used for partial operation, pass one and then return one and then pass another argument and then do another operation to the next step
  //Real time example is Science Mathematics Calculation
  def curry(a:Int)(b:Int):Int =
  {
    a+b //it is optional to use return keyword here
  }
  
  //function currying with lambda expression
  def curryLambda(a:Int) = 
  {
    (b:Int) =>
      {
        a+b
      }
  }
  
  
  //curry with multiple arguments
  def multiCurryLambda(a:Int) = 
  {
    (b:Int) =>
      {
        (c:Int) => 
          {
            (d:Int) =>
              {
                a+b+c+d
              }
          }
      }
  }
  
}
