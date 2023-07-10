def even(n: Int): Boolean = n match {
    case 0 => true;
    case 1 => false;
    case _ => even(n-2);
}

object Question04 extends App{
    print("Enter a number: ");
    val data = scala.io.StdIn.readInt();
    if (even(data)) println("Even number") else println("Odd number");
}