/**
  * Created by Xavier on 2016/7/19.
  */
object HighOrderFunction {

  def main(args: Array[String]): Unit = {
    println(apply(layout, 10))
  }

  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x : A) = "[" + x.toString + "]"

}
