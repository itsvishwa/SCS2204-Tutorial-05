def gcd(a: Int, b: Int): Int = b match{
    case 0 => a;
    case x if x > a => gcd(b, a);
    case _ => gcd(b, a%b); 
}

def isPrime(p: Int, n: Int=2): Boolean = n match{
    case x if (x == p) => true;
    case x if gcd(p, x) >= 1 => false;
    case x => isPrime(p, x+1)
}

object Question01 extends App{
    print("Enter a number: ");
    val data = scala.io.StdIn.readInt();
    println(isPrime(data));
}
