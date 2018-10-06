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
		
	}
		
		var mark1 = MarkList("Wann" , 100, 100)
                                                  //> mark1  : TestingScalaObject2.MarkList = MarkList(Wann,100.0,100.0)
		var mark2 = MarkList("Linna", 99, 99)
                                                  //> mark2  : TestingScalaObject2.MarkList = MarkList(Linna,99.0,99.0)
		
		var res: MarkList= mark1+mark2    //> res  : TestingScalaObject2.MarkList = MarkList(WannLinna,199.0,199.0)
		//mark1+mark2 here is just like mark1.+(mark2)
		
		var compare : Boolean = mark1 > mark2
                                                  //> tot1 is greater
                                                  //| compare  : Boolean = true
		println(compare)                  //> true
}