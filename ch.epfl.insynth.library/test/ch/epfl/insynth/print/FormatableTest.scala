package ch.epfl.insynth.print

import ch.epfl.insynth.env._
import ch.epfl.insynth.trees._
import ch.epfl.scala.trees.{Instance => ScalaInstance, Const => ScalaConst, _}
import org.junit.Test
import org.junit.Assert._
import scala.text.Document
import org.junit.Ignore

class FormatableTest {

  @Test
  def testDeclaration1() {
  	import FormatHelpers._
  	import Document._
      	  	
  	assertEquals(
	    "a, b, c",
	    Formatable(foldDoc(List[Document](empty, "a", "b", empty, "c", empty, empty), ", ")).toString
    )
    
  	assertEquals(
	    "a,b,c",
	    Formatable(foldDoc(List[Document](empty, "a", "b", empty, "c", empty, empty), ",")).toString
    )
    
  }
  
}