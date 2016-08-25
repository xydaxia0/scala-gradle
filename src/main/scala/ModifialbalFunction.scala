/**
  * Created by Xavier on 2016/7/9.
  */
object ModifialbalFunction {

  def main(args: Array[String]) {
    printStrings("java", "scala", "go")
  }

  def printStrings(args : String*): Unit = {
    var i : Int = 0
    for (arg <- args) {
      println("arg : " + arg + " i : " + i)
      i = i + 1
    }
  }

}
