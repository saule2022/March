object Day15MatchingExercise extends App {
  def getDay(day: Int): String = {
    day match {
      case 1 => "Monday"
      case 2 => "Tuesday"
      case 3 => "Wednesday"
      case 4 => "Thursday"
      case 5 => "Friday"
      case 6 => "Saturday !"
      case 7 => "Sunday !"
      case whoa => "No such Day!: "
    }
  }
  def getDayType(day: String): String = {
    day match {
      case "Monday" | "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "WorkDay !"
      case "Saturday" | "Sunday" => "Weekend !"
    }
  }
  println(getDayType("Monday"))
  println(getDay(4))
}




//TODO write a function getDay(day: Int): String that returns day of the week in English Monday, Tuesday and so on until Sunday
//Given an index 1 to 7
//if value is outside you return Unknown Weekday


//TODO write a function getDayType(day: String): String
// that returns "Workday" for "Monday" to "Friday" and "Weekend" for "Saturday" and "Sunday"
// default can be "Groundhog Day" or something equally silly

//TODO test the functions with some data!