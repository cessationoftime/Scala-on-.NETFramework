 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package Microsoft.Win32.SafeHandles {
 
abstract class SafeHandleZeroOrMinusOneIsInvalid extends System.Runtime.InteropServices.SafeHandle {
  val IsInvalid : Boolean = false
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  protected def this(ownsHandle : Boolean) {}
}
 
sealed class SafeFileHandle extends Microsoft.Win32.SafeHandles.SafeHandleZeroOrMinusOneIsInvalid {
  protected def ReleaseHandle: Boolean
   
  def this(preexistingHandle : System.IntPtr, ownsHandle : Boolean) {}
}
 
sealed class SafeWaitHandle extends Microsoft.Win32.SafeHandles.SafeHandleZeroOrMinusOneIsInvalid {
  protected def ReleaseHandle: Boolean
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def this(existingHandle : System.IntPtr, ownsHandle : Boolean) {}
}
 
abstract class SafeHandleMinusOneIsInvalid extends System.Runtime.InteropServices.SafeHandle {
  val IsInvalid : Boolean = false
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  protected def this(ownsHandle : Boolean) {}
}
 
abstract class CriticalHandleZeroOrMinusOneIsInvalid extends System.Runtime.InteropServices.CriticalHandle {
  val IsInvalid : Boolean = false
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  protected def this() {}
}
 
abstract class CriticalHandleMinusOneIsInvalid extends System.Runtime.InteropServices.CriticalHandle {
  val IsInvalid : Boolean = false
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  protected def this() {}
}
 
}