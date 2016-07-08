/**
  * Created by Xavier on 2016/7/8.
  */
object HelloScala {

  def main(args: Array[String]) {
    delayed(time())
  }

  def time() = {
    println("获取时间 ： 单位为纳秒")
    System.nanoTime()
  }

  def delayed( t: => Long) = {
    println("在delayed 方法中")
    println("参数 ： " + t)
    t
  }


}
