package ch.epfl.insynth

import java.util.logging._

object Config {
  
  final val getTimeOutSlot = 500
  
  val inSynthLogger = Logger.getLogger("insynth.library")
  inSynthLogger.setUseParentHandlers(false)
  inSynthLogger.setLevel(Level.ALL)
  
  def setLoggerHandler(handler: Handler) {
    inSynthLogger.addHandler(handler)
  }
    
  def removeLoggerHandler(handler: Handler) {
    inSynthLogger.removeHandler(handler)
  }

}