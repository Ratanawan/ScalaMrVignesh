import scala.util.Sorting

class Student(var id:Int, var name:String) extends Ordered[Student]
{
  override def toString() = id + " : " + name 
  override def compare(s:Student):Int = 
  {
    -(this.name.compare(s.name))
  }
}

object SortByNameLength extends Ordering[Student]
{
  def compare(s1:Student, s2:Student) : Int = 
  {
    (s1.name.length() - s2.name.length())
  }
}

object compareSecondLetter extends Ordering[Student]
{
  def compare(s1: Student, s2:Student) : Int = 
  {
    s1.name.charAt(1).compare(s2.name.charAt(1))
  }
}

object compareLastLetter extends Ordering[Student]
{
  def compare(s1: Student, s2:Student) : Int = 
  {
    var len1 = (s1.name.length) -1 
    var len2 = (s2.name.length) -1 
    s1.name.charAt(len1).compare(s2.name.charAt(len2))
  }
}

object sumOfASCII extends Ordering[Student]
{
  def compare(s1: Student, s2:Student) : Int = 
  {
    var str1:String = s1.name
    var str2:String = s2.name
    
    var sum1:Int = 0
    var sum2:Int = 0 
    for(i <- str1)
    {
      sum1 = sum1 + i
    }
    for(j <- str2)
    {
      sum2 = sum2 + j
    }
    
    return sum1 - sum2
  }
}

object sumEvenPos extends Ordering[Student]
{
  def compare(s1: Student, s2: Student): Int = 
  {
 //sort by sum of even position in name
    var a1: Int = 0
    var a2: Int = 0
    for(i <- 0 until s1.name.length() by 2)
    {
      a1 = a1 + s1.name(i).toInt
    }
    for(i <- 0 until s2.name.length() by 2)
    {
     a2 = a2 + s2.name(i).toInt
    }
    a1 - a2
  }
}

object MainScala
{
  def main(args: Array[String]) : Unit = 
  {
    var s1 = new Student(1, "Lynan")
    var s2 = new Student(2, "Sothea")
    var s3 = new Student(3, "wann")
    
    var arr = Array(s1,s2,s3)
    println("SortByNameLength")
    Sorting.quickSort(arr)(SortByNameLength)
    arr.foreach(println)
    
    println("compareSecondLetter")
    Sorting.quickSort(arr)(compareSecondLetter)
    arr.foreach(println)
    
    println("compareLastLetter")
    Sorting.quickSort(arr)(compareLastLetter)
    arr.foreach(println)
    
    println("sumOfASCII")
    Sorting.quickSort(arr)(sumOfASCII)
    arr.foreach(println)
    
    println("sumEvenPos")
    Sorting.quickSort(arr)(sumEvenPos)
    arr.foreach(println)
  }
}