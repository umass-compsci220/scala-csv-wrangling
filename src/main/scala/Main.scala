import  hw.csv._

sealed trait Gender
case class Male() extends Gender
case class Female() extends Gender

case class SSARow(birthYear: Int, name: String, gender: Gender, count: Int)

case class CDCRow(birthYear: Int, maleLifeExpectancy: Int,
  femaleLifeExpectancy: Int)

object Main {

  def readSSARow(row: List[String]): SSARow = ???

  def readCDCRow(row: List[String]): CDCRow = ???

  def yearIs(rows: List[SSARow], bound: Int): List[SSARow] = ???

  def yearGT(rows: List[SSARow], bound: Int): List[SSARow] = ???

  def yearLT(rows: List[SSARow], bound: Int): List[SSARow] = ???

  def onlyName(rows: List[SSARow], name: String): List[SSARow] = ???

  def mostPopular(rows: List[SSARow]): (String, Int) = ???

  def count(rows: List[SSARow]): Int = ???

  def countGirlsAndBoys(rows: List[SSARow]): (Int, Int) = ???

  def genderNeutralNames(rows: List[SSARow]): Set[String] = ???

  def expectedAlive(gender: Gender, birthYear: Int, currentYear: Int,
    lifeExpectancies: List[CDCRow]): Boolean = ???

  def estimatePopulation(rows: List[SSARow], year: Int,
    lifeExpectancies: List[CDCRow]): Int = ???

}