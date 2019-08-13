import scala.annotation.tailrec

object assign {


  def main(args: Array[String]): Unit = {
   print(pascal(2,1))
  }


  val square=(l:Int,b:Int)=> {l*l+b*b}
  val cubes = (l:Int,b:Int)=>(l*l*l+b*b*b)
  val int = (l:Int,b:Int)=>l+b

  def sum(f:(Int,Int)=>Int,l:Int,b:Int,name:String):Int={
    name match{
      case "square" => square(l,b)
      case "cubes" => cubes(l,b)
      case "int" => int(l,b)
      case _ => 0
    }
  }

@tailrec
def sum(list:List[Int],a:Int):Int={
  list match{
    case Nil => a
    case x::xs => sum(xs,x+a)
  }
}
  @tailrec
  def product(list:List[Int],a:Int):Int={
    list match{
      case Nil => a
      case x::xs => product(xs,x*a)
    }
  }

  @tailrec
  def max(list:List[Int],maxvalue:Int):Int={
     list match{
       case Nil => maxvalue
       case x::xs => max(xs,if(maxvalue<x)x else maxvalue)
     }
  }

  def operatelist(list:List[Int],operation:String,f:(List[Int],Int)=>Int)={
    operation match{
      case "sum"=> sum(list,0)
      case "product"=> product(list,1)
      case "max" => max(list,0)
      case _ => 0
    }
  }

  
  def pascal(row:Int,col:Int):Int={
    if(col==0)
      1
    else if(row==0)
      0
    else pascal(row-1,col)+pascal(row-1,col-1)
  }
}