
import scala.collection.mutable.TreeSet

class Student (var id:Int, var name:String) extends Ordered[Student]
{
//  def compare(s: Student):Int = 
//  {
//    this.id.compare(s.id)
//  }
  def compare(s: Student):Int =
  {
    this.name.compareTo(s.name)
  }
  
  override def toString() = id + " : " + name
}

object compareObj
{
  def main(args: Array[String]): Unit = 
  {
    var s1 = new Student(3, "Lynan")
    var s2 = new Student(2, "Richard")
    var s3 = new Student(5, "Lucky")
    
    var ts = TreeSet(s1,s2,s3)
    println(ts)
  }
}