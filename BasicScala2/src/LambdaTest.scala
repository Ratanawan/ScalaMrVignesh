
class LambdaTest {
  
}

object MyObj
{
  def main(args: Array[String])
  {
    //Lambda Expression: it doesn't have interface but this one implements a function
    //It may looks like a variable but actually it is a function 
    var myVar1 = (num1: Int, num2:Int) => { num1+num2 }
    println(myVar1(12,21))
    
    //normal function, same same as the Lambda function
    def MyFunc(num1: Int, num2:Int): Int =
    {
      return num1 + num2
    }
    println(MyFunc(12,21))
    
    //anonymous variable (_:Int)
    var myVar2 = (_:Int) - (_:Int)
    println(myVar2(21,4));
  }
}