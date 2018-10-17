import scala.collection.mutable.ListMap
import scala.collection.mutable.TreeMap

class Student(var id:Int, var name:String) extends Ordered[Student]
{
  override def compare(s:Student): Unit =
  {
    this.id - s.id
  }
  
  override def toString = id + " : " + name
}

object MapObj
{
  def main(args: Array[String])
  {
      var s1 = new Student(111, "Wann")
    var s2 = new Student(122, "Sothea")
    var s3 = new Student(133, "Lynan")
    var s4 = new Student(144, "Dane")
    
    var map = Map[Int, Student]((1,s1), (2,s2), (3,s3), (4,s4))
    var newMap = TreeMap [Int, Student]((1, new Student(100, "Jamica")), (2, new Student(200, "Antonio")))
    
    println(map)
    println(newMap)
    
    var treeMap1 = TreeMap[Student,Int]((s1,1),(s2,2)) //error because it doesn't know how to sort Student
    var Map2 = Map[Int, Student]((1,s1), (2,s2), (3,s3), (4,s4))

  }
