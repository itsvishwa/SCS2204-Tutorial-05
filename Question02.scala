def gcd(a: Int, b: Int): Int = b match {
  case 0 => a;
  case x if x > b => gcd(b, a);
  case _ => gcd(b, a % b);
}

def isPrime(p: Int, n: Int = 2): Boolean = n match {
  case x if x == p => true;
  case x if gcd(p, x) > 1 => false;
  case x => isPrime(p, x + 1);
}

def primeSeq(n: Int, s: Int = 2): Unit = {
    if (s < n){
        if(isPrime(s)) println(s);
        primeSeq(n, s+1);
    }
}

object Question02 extends App{
    print("Enter a number: ");
    val n = scala.io.StdIn.readInt();
    primeSeq(n)
}