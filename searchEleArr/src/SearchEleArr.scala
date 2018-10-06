import scala.io.StdIn._
import scala.util.control.Breaks._

object Main 
{
  //Array
  print("Enter size of Array: ")
  var ar = new Array[Int](readInt())
  //Insert Element
  println("Enter element: ")
  for(i <- 0 until ar.length)
  {
    ar(i) = readInt()
  }
  
  def main(args: Array[String]): Unit = 
  {
    //Enter Number To Search 
    print("Enter the element of array you search : ")
    var ele = readInt()
              
    //Choose Linear or Binary
    print("Enter 1 for linear_search and 2 for binary_search: ")
    
    //Call Function and return the function as value
    var result = choose(readInt()).apply(ele)
    
    //Checking Condition For Output
    if(result == ar.length) println("Not Found Value...")
    else if(result == -1) println("Invalid Input")
    else println("The position: " + result)
  }
  
  def choose(choice: Int) = 
  {
    var result = 0
    
    //Matching Condition Of Search
    choice match
    {
      case 1 => 
        {
          (ele: Int) => 
            {
              println("<<<You choose linear search>>>\n")
              var i = 0
              breakable
              {
                ar.foreach(element => {
                  if(ele == element)
                  {
                    result = ar.indexOf(ele)
                    i += 1
                    break
                  }
                })
              }
              if(i == ar.length)
                {
                  //Return Array Length To Match Condition
                  ar.length
                }
              else
                //Return The Index Of Match Element 
                result
            }
        }
        
      case 2 => 
        {
          (ele: Int) =>
            {
              println("<<<You choose binary search: Will sort array in >>>\n")
              ar = ar.sorted              
              var first = 0
	            var last = ar.length - 1
	            var mid = (first+last)/2
	            
	            breakable
	            {
	              while( first <= last )
	              {
		              if( ar(mid) < ele )
		              {
			              first = mid + 1
		              }
		              else if( ar(mid) == ele )
		              {
			              result = ar.indexOf(ele)
			              break
		              }
		              else
		              {
			              last = mid - 1;
		              }
		                mid = (first+last)/2;
	              }
	            }
              if( first > last )
	            {
                //Return Array Length To Match Condition
		            ar.length
	            }
              else 
                //Return The Index Of Match Element
                result
            }
        }
      case _ => 
        {
          (ele: Int) => { -1 }
        }
    }
  }
}