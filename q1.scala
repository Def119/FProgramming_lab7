@main def main()={

    val numbers = List(5, 12, 3, 13,2,44,100)

    val filter_even = (x:List[Int]) => x.filter(_%2 == 0)

    println(filter_even(numbers))

}