object TestingScalaObject2 {
	case class MarkList(var name:String = "", var m1:Float = 0.0f, var m2:Float = 0.0f)
	{
		//overloading the + function to add MarkList object, user defined datatype
		def +(mark2: MarkList) : MarkList =
		{
			var res1 = this.m1 + mark2.m1
			var res2 = this.m2 + mark2.m2
			var res3 = this.name + mark2.name
			var mark3 = MarkList()
			mark3.m1 = res1
			mark3.m2 = res2
			mark3.name = res3
			return mark3
		}
		
		//overloading the > function to compare 2 MarkList objects
		def >(mark2: MarkList) : Boolean =
		{
			var tot1 = m1 + m2
			var tot2 = mark2.m1 + mark2.m2
			if(tot1 > tot2)
			{
				println("tot1 is greater")
				return true
		 	}
		 	else if(tot1 == tot2)
		 	{
		 		println("tot1 and tot2 are equal")
		 		return true
		 	}
		 	else
		 		return false
		}
		
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(858); 
		
		var mark1 = MarkList("Wann" , 100, 100);System.out.println("""mark1  : TestingScalaObject2.MarkList = """ + $show(mark1 ));$skip(40); 
		var mark2 = MarkList("Linna", 99, 99);System.out.println("""mark2  : TestingScalaObject2.MarkList = """ + $show(mark2 ));$skip(36); 
		
		var res: MarkList= mark1+mark2;System.out.println("""res  : TestingScalaObject2.MarkList = """ + $show(res ));$skip(92); 
		//mark1+mark2 here is just like mark1.+(mark2)
		
		var compare : Boolean = mark1 > mark2;System.out.println("""compare  : Boolean = """ + $show(compare ));$skip(19); 
		println(compare)}
}
