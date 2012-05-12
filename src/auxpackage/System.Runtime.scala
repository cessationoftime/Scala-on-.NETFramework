 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime {
 
sealed class MemoryFailPoint extends System.Runtime.ConstrainedExecution.CriticalFinalizerObject with System.IDisposable {
  protected def Finalize: Unit
   
  def Dispose: Unit
   
  def this(sizeInMegabytes : Int) {}
}
 
sealed abstract class GCLatencyMode extends System.Enum {
  def ==(that: System.Runtime.GCLatencyMode): Boolean = false
  def !=(that: System.Runtime.GCLatencyMode): Boolean = false
  def  <(that: System.Runtime.GCLatencyMode): Boolean = false
  def <=(that: System.Runtime.GCLatencyMode): Boolean = false
  def  >(that: System.Runtime.GCLatencyMode): Boolean = false
  def >=(that: System.Runtime.GCLatencyMode): Boolean = false
  def  |(that: System.Runtime.GCLatencyMode): Boolean = false
  def  &(that: System.Runtime.GCLatencyMode): Boolean = false
  def  ^(that: System.Runtime.GCLatencyMode): Boolean = false
}
object GCLatencyMode{
  val Batch	 = value(0)
  val Interactive	 = value(1)
  val LowLatency	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.GCLatencyMode = null
}
 
abstract sealed class GCSettings extends AnyRef 
object GCSettings {
  var LatencyMode : System.Runtime.GCLatencyMode = System.Runtime.GCLatencyMode.Batch
   
  val IsServerGC : Boolean = false
}
 
}