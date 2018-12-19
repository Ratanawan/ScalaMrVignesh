object OperatorOverloadingGreaterThan {
  case class MarkList(var name: String = "", var m1:Float = 0.0f, var m2:Float = 0.0f)
  {
  	def >(mark2: MarkList) : Float =
  	{
  		return (m1 + m2) - (mark2.m1 + mark2.m2)
  	}
  }
  
  var mark1 = MarkList("Wann" , 100, 100)         //> mark1  : OperatorOverloadingGreaterThan.MarkList = MarkList(Wann,100.0,100.0
                                                  //| )
  var mark2 = MarkList("Linna", 99, 99)           //> mark2  : OperatorOverloadingGreaterThan.MarkList = MarkList(Linna,99.0,99.0)
                                                  //| 
  
  var res = mark1 > mark2                         //> res  : Float = 2.0
  if(res == 0)
  {
  	println("tot1 and tot2 are equal")
  }
  else if(res > 0)
  {
  	println("tot1 is greater")
  }
  else
  	println("tot2 is greater")                //> tot1 is greater
  
}