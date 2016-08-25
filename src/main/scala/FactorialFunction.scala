/**
  * Created by Xavier on 2016/7/9.
  */
object FactorialFunction {

  def main(args: Array[String]) {
    for (i <- 1 to 20)
    println(i + "的阶乘是：" + factorial(i))
    for (i <- 1 to 20)
      println("test")
  }

  def factorial(n : BigInt) : BigInt = {
    if (n <= 1)
      1
    else
      n * factorial(n - 1)
  }

}
