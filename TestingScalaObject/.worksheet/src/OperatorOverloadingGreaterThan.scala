object OperatorOverloadingGreaterThan {
  case class MarkList(var name: String = "", var m1:Float = 0.0f, var m2:Float = 0.0f)
  {
  	def >(mark2: MarkList) : Float =
  	{
  		return (m1 + m2) - (mark2.m1 + mark2.m2)
  	}
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(270); 
  
  var mark1 = MarkList("Wann" , 100, 100);System.out.println("""mark1  : OperatorOverloadingGreaterThan.MarkList = """ + $show(mark1 ));$skip(40); 
  var mark2 = MarkList("Linna", 99, 99);System.out.println("""mark2  : OperatorOverloadingGreaterThan.MarkList = """ + $show(mark2 ));$skip(29); 
  
  var res = mark1 > mark2;System.out.println("""res  : Float = """ + $show(res ));$skip(155); 
  if(res == 0)
  {
  	println("tot1 and tot2 are equal")
  }
  else if(res > 0)
  {
  	println("tot1 is greater")
  }
  else
  	println("tot2 is greater")}
  
}
