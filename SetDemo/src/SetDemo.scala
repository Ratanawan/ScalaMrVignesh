
import scala.collection.mutable.Set

class SetDemo {
  
}

object SetDemo
{
  def main(args: Array[String])
  {
    var set = Set(10,10,20,30,20,40,50)
    
    set += 1000
    println(s"Hashcode of the set ${set.hashCode()}")
    println(set)
    
    set +(220, 200, 300)
    println(set)
    
    //print the first element
    println(s"First Element: ${set.head}")
    
    //print the last element
    println(s"Last Element: ${set.tail}")
    
    //print all element except the first element
    println(s"Except the first element: ${set.last}")
    
    //print all elements except the last element
    println(s"Except the last element: ${set.init}")
    
    //check whether set contains 220, it will return boolean value
    println(s"Check if contain 220: ${set.contains(220)}")

    //new set
    set  = set+(340, 250, 360)
    println(s"New  set ${set}")
    
    //max value 
    println(s"Max value is ${set.max}")
    //minimum value 
    println(s"Min value is ${set.min}")
    //sum all elements
    println(s"Sum all elements is ${set.sum}")
    
    //for loop to iterate all elements in the set
    println("Looping all elements in the set")
    for(i <- set)
    {
      println(i+1)
    }
    
    set.foreach(println)
    
    set.foreach((f) => 
      {
        println(f+10)
      })
      
    //remove element from the set, in this case remove number 20 in the set
    set = set - 20
    set = set -1002
    
    println(s"The set after removing: ${set}")
    
    //
  }
}