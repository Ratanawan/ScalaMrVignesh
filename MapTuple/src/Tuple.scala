class TupleTest {
  
}

object TupleTest 
{
  def main(args: Array[String])
  {
    //first way to create tuple
    var tuple1 = (11,12,13)
    //second way to create tuple
    var tuple2 = new Tuple4(21,22,23,24)
    //third way to create tuple
    var tuple3 = (1 ->"Nan"->22)
    
    var tuple4 = (41,42,43)
    var tuple5 = (51,52,53)
    var tuple6 = (61,62,63)
    
    var list = List(tuple4,tuple5,tuple6)
    
    println("Tuple 4"+ tuple4)
   // println(tuple2)
    println(tuple3)
    
    println(tuple1._2)
    
    tuple2.productIterator.foreach
    {
      (t) =>
        {
          println(t)
        }
    }
    //in tuple we can't add and update element

    var tupleOftuples = ((1,2,3),(4,5,6),(7,8,9),(9,8,7))
    println(tupleOftuples)         //it will print all
    println(tupleOftuples._1)      //it will print (1,2,3)
    println(tupleOftuples._1._2)   //it will print 2
    
    tupleOftuples.productIterator.foreach
    {
      (x) =>
        {
          println(x)
        }
    }
    
    var map = Map((1 -> "Wann" -> true),(2 -> "Lynan" -> false),(123->"Testing"->false))
    map.foreach
    {  
      (m) => 
      {
        println(m)
      }       
    }
    
    var MyMap = Map(21 - > (123->"Test")  , (12, "test"), (123, "WOrd) 
        {                                             }