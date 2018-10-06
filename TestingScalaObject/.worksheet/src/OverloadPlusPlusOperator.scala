object OverloadPlusPlusOperator {
	case class myClass(var num1 : Int= 0)
	{
		def ++(num1:Int = 0) : Int =
		{
			var num1 = num1 + num1
			return num1
		}
  var obj = myClass()
  
 
}
