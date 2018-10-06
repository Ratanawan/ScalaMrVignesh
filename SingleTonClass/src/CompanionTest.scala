
class CompanionTest 
{
  private var id1:Int = 19
  private var name1:String = "Chhay"
  def printClass()
  {
    var c = new CompanionTest
    println(c.id1 + " : " + c.name1)
  }
}

object CompanionTest
{
   private var id2:Int = 17
   private var name2:String = "Sothea"
   
   def printObj()
   {
     println(id2 + " : " + name2)
   }
}

object MainClass
{
  def main(args: Array[String])
  {
    var ct = new CompanionTest()
    ct.printClass()
    CompanionTest.printObj()
    
  }
}