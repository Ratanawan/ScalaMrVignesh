import scala.collection.immutable.HashMap
import scala.collection.mutable.LinkedHashMap


class PassingMap
{
  def passMap1(map:Map[Int,String])
  {
    println(map)
  }
}
object Main {
  def main(args: Array[String]):Unit = {
    var hmap = HashMap[Int,String] ((123,"s1"),(124,"s2"))
    var tmap = LinkedHashMap[Int,String]((123,"s1"),(124,"s2"))
    var obj = new PassingMap
    
    obj.passMap1(hmap)
    obj.passMap1(tmap)
  }
}