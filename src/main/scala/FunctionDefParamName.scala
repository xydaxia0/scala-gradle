/**
  * Created by Xavier on 2016/7/8.
  */
object FunctionDefParamName {

  def main(args: Array[String]) {
    printInt(1, 2)
    printInt(b = 5, a = 3)
  }

  def printInt(a : => Int, b : => Int) = {
      println("value of a : " + a)
      println("value of b : " + b)
  }

}
