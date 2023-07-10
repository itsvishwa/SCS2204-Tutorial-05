def sum(n: Int): Int = n match{
    case 1 => 1;
    case _ => n + sum(n-1);
}

object Question03 extends App{
    print("Enter a number: ");
    val data = scala.io.StdIn.readInt();
    println(sum(data));
}