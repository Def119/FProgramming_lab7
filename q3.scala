def findPrime(numbers: List[Int]): List[Int] = {
    // Lambda function to check if a number is prime
    val checkprime: Int => Boolean = n => {
      if (n <= 1) false
      else if (n == 2) true
      else !(2 to (n - 1)).exists(i => n % i == 0)
    }
    
    numbers.filter(checkprime)
  }

@main def main()={
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val filtered = findPrime(numbers)
    println(filtered)
}