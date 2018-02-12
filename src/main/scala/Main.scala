import  edu.umass.cs.CSV

object CSVWrangling {

  val births = CSV.fromFile("ssa-baby-names.csv")
  val lifeExpectancy = CSV.fromFile("cdc-life-exppectancy.csv")

  def yearGT(data: List[List[String]], bound: Int): List[List[String]] = ???

  def yearLT(data: List[List[String]], bound: Int): List[List[String]] = ???

  def onlyName(data: List[List[String]], name: String): List[List[String]] = ???

  def mostPopular(data: List[List[String]]): (String, Int) = ???

  def countGirlsAndBoys(data: List[List[String]]): (Int, Int) = ???

  def unisexNames(data: List[List[String]]): Set[String] = ???

  def expectedAlive(gender: String, birthYear: Int, currentYear: Int): Boolean = ???

  def estimatePopulation(data: List[List[String]], year: Int): Int = ???
}