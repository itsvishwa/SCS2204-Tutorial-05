def fib(n: Int, a: Int = 0, b: Int = 1): Unit = n match {
    case 1 => println(a);
    case _ => {println(a); fib(n-1, b, a+b)}
}

object Question06 extends App {
  print("Enter a number: ")
  val data = scala.io.StdIn.readInt()
  fib(data)
}