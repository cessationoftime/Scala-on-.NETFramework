 /* assembly: System.Core, Version=2.0.5.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\System.Core.dll */ 
 
import auxPackage.auxiliary._
 
package System.Threading {
 
sealed abstract class LazyThreadSafetyMode extends System.Enum {
  def ==(that: System.Threading.LazyThreadSafetyMode): Boolean = false
  def !=(that: System.Threading.LazyThreadSafetyMode): Boolean = false
  def  <(that: System.Threading.LazyThreadSafetyMode): Boolean = false
  def <=(that: System.Threading.LazyThreadSafetyMode): Boolean = false
  def  >(that: System.Threading.LazyThreadSafetyMode): Boolean = false
  def >=(that: System.Threading.LazyThreadSafetyMode): Boolean = false
  def  |(that: System.Threading.LazyThreadSafetyMode): Boolean = false
  def  &(that: System.Threading.LazyThreadSafetyMode): Boolean = false
  def  ^(that: System.Threading.LazyThreadSafetyMode): Boolean = false
}
object LazyThreadSafetyMode{
  val ExecutionAndPublication	 = value(2)
  val None	 = value(0)
  val PublicationOnly	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Threading.LazyThreadSafetyMode = null
}
 
}