def isEven(n: Int): Boolean = n match {
    case 0 => true;
    case _ => isOdd(n-1);
}

def isOdd(n: Int): Boolean = ! (isEven(n));

object Question04 extends App{
    print("Enter a number: ");
    val data = scala.io.StdIn.readInt();
    if (isEven(data)) println("Even number") else println("Odd number");
}
