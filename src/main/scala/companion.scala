abstract  class exp
case class add(a:Int,b:String) extends exp
case class sub(a:Int,b:Int) extends exp
case class zzz(a:String,b:String) extends exp


object companion extends App{

  def simple(a:exp):exp={
    a match{
      case add()



    }
  }

}







