case class Person(name:String,
                  relation:String,
                  var topSpeed:Int){
  println("person creation started!")
  def increaseSpeed(delta:Int):Int= {
    topSpeed += delta
    topSpeed
  }
  println(s"Person has beed created with name $name")
}
