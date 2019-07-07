package t11617

import java.util._

class Scanner {
  // empty and useless class, just here for the name clash
}

class PrecedenceTest {
  def localClassInSameFile: t11617.Scanner = new Scanner

  def localClassInOtherFile: t11617.Timer = new Timer

  def externalClass: java.util.Random = new Random
}
