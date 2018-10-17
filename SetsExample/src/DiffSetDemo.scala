//import all
import scala.collection.immutable.ListSet
import scala.collection.mutable.BitSet
import scala.collection.mutable.HashSet
import scala.collection.mutable.LinkedHashSet
import scala.collection.mutable.SortedSet
import scala.collection.mutable.TreeSet

object DiffSetsDemo
{
  def main(args: Array[String])
  {
    //Set is immutable
    
    //HashSet: just like set use TreeSet algorithm
    var hs = HashSet(12,34,223,12,345)
    hs+(23)
    println(hs)
    println(s"HashCode: ${hs.hashCode()}")
    println(s"First element: ${hs.head}")
    println(s"Last element: ${hs.last}")
    println(s"All element Except first element: ${hs.tail}")
    println(s"All element Except the last element: ${hs.init}")
    println(s"Sum: ${hs.sum}")
    println(s"Min: ${hs.min}")
    println(s"Max: ${hs.max}")
    
    //LinkedHashSet: maintain user input order
    var lhs = LinkedHashSet(32,45,232,34)
    println(lhs)
    
    //SortedSet: will give ascending order result in TreeSet, automatically convert to TreeSet
    var ss = SortedSet(43,342,753,675)
    println(ss)
    
    //TreeSet: will give ascending order result
    var ts = TreeSet(65,239,28, 293)
    println(ts)
    
    //BitSet: doesn't allow negative value
    var bs = BitSet(87,22,97,57)
    println(bs)
    
    //ListSet: it will create the elements as node and doesn't allow duplicate value just like the combination of list and set
    var ls = ListSet(21,22,23,20,28,29)
    println(ls)
    
    
  }
}