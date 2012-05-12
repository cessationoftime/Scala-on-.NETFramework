 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.ConstrainedExecution {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class CriticalFinalizerObject extends AnyRef {
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  protected def Finalize: Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  protected def this() {}
}
 
sealed abstract class Consistency extends System.Enum {
  def ==(that: System.Runtime.ConstrainedExecution.Consistency): Boolean = false
  def !=(that: System.Runtime.ConstrainedExecution.Consistency): Boolean = false
  def  <(that: System.Runtime.ConstrainedExecution.Consistency): Boolean = false
  def <=(that: System.Runtime.ConstrainedExecution.Consistency): Boolean = false
  def  >(that: System.Runtime.ConstrainedExecution.Consistency): Boolean = false
  def >=(that: System.Runtime.ConstrainedExecution.Consistency): Boolean = false
  def  |(that: System.Runtime.ConstrainedExecution.Consistency): Boolean = false
  def  &(that: System.Runtime.ConstrainedExecution.Consistency): Boolean = false
  def  ^(that: System.Runtime.ConstrainedExecution.Consistency): Boolean = false
}
object Consistency{
  val MayCorruptProcess	 = value(0)
  val MayCorruptAppDomain	 = value(1)
  val MayCorruptInstance	 = value(2)
  val WillNotCorruptState	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.ConstrainedExecution.Consistency = null
}
 
sealed abstract class Cer extends System.Enum {
  def ==(that: System.Runtime.ConstrainedExecution.Cer): Boolean = false
  def !=(that: System.Runtime.ConstrainedExecution.Cer): Boolean = false
  def  <(that: System.Runtime.ConstrainedExecution.Cer): Boolean = false
  def <=(that: System.Runtime.ConstrainedExecution.Cer): Boolean = false
  def  >(that: System.Runtime.ConstrainedExecution.Cer): Boolean = false
  def >=(that: System.Runtime.ConstrainedExecution.Cer): Boolean = false
  def  |(that: System.Runtime.ConstrainedExecution.Cer): Boolean = false
  def  &(that: System.Runtime.ConstrainedExecution.Cer): Boolean = false
  def  ^(that: System.Runtime.ConstrainedExecution.Cer): Boolean = false
}
object Cer{
  val None	 = value(0)
  val MayFail	 = value(1)
  val Success	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.ConstrainedExecution.Cer = null
}
 
@System.AttributeUsageAttribute(1133 /* Inherited = false */ )
sealed class ReliabilityContractAttribute extends System.Attribute {
  val ConsistencyGuarantee : System.Runtime.ConstrainedExecution.Consistency = System.Runtime.ConstrainedExecution.Consistency.MayCorruptProcess
   
  val Cer : System.Runtime.ConstrainedExecution.Cer = System.Runtime.ConstrainedExecution.Cer.None
   
  def this(consistencyGuarantee : System.Runtime.ConstrainedExecution.Consistency, 
           cer : System.Runtime.ConstrainedExecution.Cer) {}
}
 
@System.AttributeUsageAttribute(96 /* Inherited = false */ )
sealed class PrePrepareMethodAttribute extends System.Attribute {
  def this() {}
}
 
}