 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Threading {
 
@System.Runtime.InteropServices.ComVisibleAttribute(false)
class AbandonedMutexException extends System.SystemException {
  val Mutex : System.Threading.Mutex = null
   
  val MutexIndex : Int = 0
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  def this(location : Int, handle : System.Threading.WaitHandle) {}
   
  def this(message : String, location : Int, handle : System.Threading.WaitHandle) {}
   
  def this(message : String, inner : System.Exception, location : Int, 
           handle : System.Threading.WaitHandle) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class WaitHandle extends System.MarshalByRefObject with System.IDisposable {
  def WaitOne(millisecondsTimeout : Int, exitContext : Boolean): Boolean
   
  def WaitOne(timeout : System.TimeSpan, exitContext : Boolean): Boolean
   
  def WaitOne: Boolean
   
  def WaitOne(millisecondsTimeout : Int): Boolean
   
  def WaitOne(timeout : System.TimeSpan): Boolean
   
  def Close: Unit
   
  protected def Dispose(explicitDisposing : Boolean): Unit
   
  @System.ObsoleteAttribute("Use the SafeWaitHandle property instead.")
  var Handle : System.IntPtr = new System.IntPtr()
   
  var SafeWaitHandle : Microsoft.Win32.SafeHandles.SafeWaitHandle = null
   
  protected def this() {}
}
object WaitHandle {
  def WaitAll(waitHandles : Array[System.Threading.WaitHandle], millisecondsTimeout : Int, 
              exitContext : Boolean): Boolean  = false
   
  def WaitAll(waitHandles : Array[System.Threading.WaitHandle], timeout : System.TimeSpan, 
              exitContext : Boolean): Boolean  = false
   
  def WaitAll(waitHandles : Array[System.Threading.WaitHandle]): Boolean  = false
   
  def WaitAll(waitHandles : Array[System.Threading.WaitHandle], millisecondsTimeout : Int): Boolean  = false
   
  def WaitAll(waitHandles : Array[System.Threading.WaitHandle], timeout : System.TimeSpan): Boolean  = false
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def WaitAny(waitHandles : Array[System.Threading.WaitHandle], millisecondsTimeout : Int, 
              exitContext : Boolean): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def WaitAny(waitHandles : Array[System.Threading.WaitHandle], timeout : System.TimeSpan, 
              exitContext : Boolean): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def WaitAny(waitHandles : Array[System.Threading.WaitHandle]): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def WaitAny(waitHandles : Array[System.Threading.WaitHandle], millisecondsTimeout : Int): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def WaitAny(waitHandles : Array[System.Threading.WaitHandle], timeout : System.TimeSpan): Int  = 0
   
  def SignalAndWait(toSignal : System.Threading.WaitHandle, toWaitOn : System.Threading.WaitHandle): Boolean  = false
   
  def SignalAndWait(toSignal : System.Threading.WaitHandle, toWaitOn : System.Threading.WaitHandle, 
                    timeout : System.TimeSpan, exitContext : Boolean): Boolean  = false
   
  def SignalAndWait(toSignal : System.Threading.WaitHandle, toWaitOn : System.Threading.WaitHandle, 
                    millisecondsTimeout : Int, exitContext : Boolean): Boolean  = false
   
  val WaitTimeout : Int  = 0
   
  protected val InvalidHandle : System.IntPtr  = new System.IntPtr()
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class EventWaitHandle extends System.Threading.WaitHandle {
  def Reset: Boolean
   
  def Set: Boolean
   
  def GetAccessControl: System.Security.AccessControl.EventWaitHandleSecurity
   
  def SetAccessControl(eventSecurity : System.Security.AccessControl.EventWaitHandleSecurity): Unit
   
  def this(initialState : Boolean, mode : System.Threading.EventResetMode) {}
   
  def this(initialState : Boolean, mode : System.Threading.EventResetMode, name : String) {}
   
  def this(initialState : Boolean, mode : System.Threading.EventResetMode, name : String, 
           createdNew : CLRByRef[Boolean]) {}
   
  def this(initialState : Boolean, mode : System.Threading.EventResetMode, name : String, 
           createdNew : CLRByRef[Boolean], 
           eventSecurity : System.Security.AccessControl.EventWaitHandleSecurity) {}
}
object EventWaitHandle {
  def OpenExisting(name : String): System.Threading.EventWaitHandle  = null
   
  def OpenExisting(name : String, rights : System.Security.AccessControl.EventWaitHandleRights): System.Threading.EventWaitHandle  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AutoResetEvent extends System.Threading.EventWaitHandle {
  def this(initialState : Boolean) {}
}
 
sealed class SendOrPostCallback extends System.MulticastDelegate {
  def Invoke(state : AnyRef): Unit
   
  def BeginInvoke(state : AnyRef, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
class SynchronizationContext extends AnyRef {
  protected def SetWaitNotificationRequired: Unit
   
  def IsWaitNotificationRequired: Boolean
   
  def Send(d : System.Threading.SendOrPostCallback, state : AnyRef): Unit
   
  def Post(d : System.Threading.SendOrPostCallback, state : AnyRef): Unit
   
  def OperationStarted: Unit
   
  def OperationCompleted: Unit
   
  @System.Runtime.ConstrainedExecution.PrePrepareMethodAttribute()
  @System.CLSCompliantAttribute(false)
  def Wait(waitHandles : Array[System.IntPtr], waitAll : Boolean, millisecondsTimeout : Int): Int
   
  def CreateCopy: System.Threading.SynchronizationContext
   
  def this() {}
}
object SynchronizationContext {
  @System.CLSCompliantAttribute(false)
  @System.Runtime.ConstrainedExecution.PrePrepareMethodAttribute()
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  protected def WaitHelper(waitHandles : Array[System.IntPtr], waitAll : Boolean, millisecondsTimeout : Int): Int  = 0
   
  def SetSynchronizationContext(syncContext : System.Threading.SynchronizationContext): Unit  = {}
   
  val Current : System.Threading.SynchronizationContext = null
}
 
sealed class CompressedStack extends AnyRef with System.Runtime.Serialization.ISerializable {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def CreateCopy: System.Threading.CompressedStack
}
object CompressedStack {
  def GetCompressedStack: System.Threading.CompressedStack  = null
   
  def Capture: System.Threading.CompressedStack  = null
   
  def Run(compressedStack : System.Threading.CompressedStack, 
          callback : System.Threading.ContextCallback, state : AnyRef): Unit  = {}
}
 
sealed abstract class EventResetMode extends System.Enum {
  def ==(that: System.Threading.EventResetMode): Boolean = false
  def !=(that: System.Threading.EventResetMode): Boolean = false
  def  <(that: System.Threading.EventResetMode): Boolean = false
  def <=(that: System.Threading.EventResetMode): Boolean = false
  def  >(that: System.Threading.EventResetMode): Boolean = false
  def >=(that: System.Threading.EventResetMode): Boolean = false
  def  |(that: System.Threading.EventResetMode): Boolean = false
  def  &(that: System.Threading.EventResetMode): Boolean = false
  def  ^(that: System.Threading.EventResetMode): Boolean = false
}
object EventResetMode{
  val AutoReset	 = value(0)
  val ManualReset	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Threading.EventResetMode = null
}
 
sealed class AsyncFlowControl extends System.ValueType with System.IDisposable {
  def Undo: Unit
   
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : System.Threading.AsyncFlowControl): Boolean
}
object AsyncFlowControl {
  def ==(a : System.Threading.AsyncFlowControl, b : System.Threading.AsyncFlowControl): Boolean  = false
   
  def !=(a : System.Threading.AsyncFlowControl, b : System.Threading.AsyncFlowControl): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ContextCallback extends System.MulticastDelegate {
  def Invoke(state : AnyRef): Unit
   
  def BeginInvoke(state : AnyRef, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed class ExecutionContext extends AnyRef with System.Runtime.Serialization.ISerializable {
  def CreateCopy: System.Threading.ExecutionContext
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
}
object ExecutionContext {
  def Run(executionContext : System.Threading.ExecutionContext, 
          callback : System.Threading.ContextCallback, state : AnyRef): Unit  = {}
   
  def SuppressFlow: System.Threading.AsyncFlowControl  = new System.Threading.AsyncFlowControl()
   
  def RestoreFlow: Unit  = {}
   
  def IsFlowSuppressed: Boolean  = false
   
  def Capture: System.Threading.ExecutionContext  = null
}
 
abstract sealed class Interlocked extends AnyRef 
object Interlocked {
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Increment(location : CLRByRef[Int]): Int  = 0
   
  def Increment(location : CLRByRef[Long]): Long  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Decrement(location : CLRByRef[Int]): Int  = 0
   
  def Decrement(location : CLRByRef[Long]): Long  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Exchange(location1 : CLRByRef[Int], value : Int): Int  = 0
   
  def Exchange(location1 : CLRByRef[Long], value : Long): Long  = 0
   
  def Exchange(location1 : CLRByRef[Float], value : Float): Float  = 0
   
  def Exchange(location1 : CLRByRef[Double], value : Double): Double  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Exchange(location1 : CLRByRef[System.IntPtr], value : System.IntPtr): System.IntPtr  = new System.IntPtr()
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def CompareExchange(location1 : CLRByRef[Int], value : Int, comparand : Int): Int  = 0
   
  def CompareExchange(location1 : CLRByRef[Long], value : Long, comparand : Long): Long  = 0
   
  def CompareExchange(location1 : CLRByRef[Float], value : Float, comparand : Float): Float  = 0
   
  def CompareExchange(location1 : CLRByRef[Double], value : Double, comparand : Double): Double  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def CompareExchange(location1 : CLRByRef[System.IntPtr], value : System.IntPtr, 
                      comparand : System.IntPtr): System.IntPtr  = new System.IntPtr()
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Add(location1 : CLRByRef[Int], value : Int): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Add(location1 : CLRByRef[Long], value : Long): Long  = 0
   
  def Read(location : CLRByRef[Long]): Long  = 0
}
 
class HostExecutionContext extends AnyRef {
  protected def get_State: AnyRef
   
  protected def set_State(value : AnyRef): Unit
   
  def CreateCopy: System.Threading.HostExecutionContext
   
  def this() {}
   
  def this(state : AnyRef) {}
}
 
class HostExecutionContextManager extends AnyRef {
  def Capture: System.Threading.HostExecutionContext
   
  def SetHostExecutionContext(hostExecutionContext : System.Threading.HostExecutionContext): AnyRef
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Revert(previousState : AnyRef): Unit
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class LockCookie extends System.ValueType {
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : System.Threading.LockCookie): Boolean
}
object LockCookie {
  def ==(a : System.Threading.LockCookie, b : System.Threading.LockCookie): Boolean  = false
   
  def !=(a : System.Threading.LockCookie, b : System.Threading.LockCookie): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ManualResetEvent extends System.Threading.EventWaitHandle {
  def this(initialState : Boolean) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract sealed class Monitor extends AnyRef 
object Monitor {
  def Enter(obj : AnyRef): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Exit(obj : AnyRef): Unit  = {}
   
  def TryEnter(obj : AnyRef): Boolean  = false
   
  def TryEnter(obj : AnyRef, millisecondsTimeout : Int): Boolean  = false
   
  def TryEnter(obj : AnyRef, timeout : System.TimeSpan): Boolean  = false
   
  def Wait(obj : AnyRef, millisecondsTimeout : Int, exitContext : Boolean): Boolean  = false
   
  def Wait(obj : AnyRef, timeout : System.TimeSpan, exitContext : Boolean): Boolean  = false
   
  def Wait(obj : AnyRef, millisecondsTimeout : Int): Boolean  = false
   
  def Wait(obj : AnyRef, timeout : System.TimeSpan): Boolean  = false
   
  def Wait(obj : AnyRef): Boolean  = false
   
  def Pulse(obj : AnyRef): Unit  = {}
   
  def PulseAll(obj : AnyRef): Unit  = {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Mutex extends System.Threading.WaitHandle {
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def ReleaseMutex: Unit
   
  def GetAccessControl: System.Security.AccessControl.MutexSecurity
   
  def SetAccessControl(mutexSecurity : System.Security.AccessControl.MutexSecurity): Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def this(initiallyOwned : Boolean, name : String, createdNew : CLRByRef[Boolean]) {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def this(initiallyOwned : Boolean, name : String, createdNew : CLRByRef[Boolean], 
           mutexSecurity : System.Security.AccessControl.MutexSecurity) {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def this(initiallyOwned : Boolean, name : String) {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def this(initiallyOwned : Boolean) {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def this() {}
}
object Mutex {
  def OpenExisting(name : String): System.Threading.Mutex  = null
   
  def OpenExisting(name : String, rights : System.Security.AccessControl.MutexRights): System.Threading.Mutex  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class NativeOverlapped extends System.ValueType {
  var InternalLow : System.IntPtr
   
  var InternalHigh : System.IntPtr
   
  var OffsetLow : Int
   
  var OffsetHigh : Int
   
  var EventHandle : System.IntPtr
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class Overlapped extends AnyRef {
  var AsyncResult : System.IAsyncResult = null
   
  var OffsetLow : Int = 0
   
  var OffsetHigh : Int = 0
   
  @System.ObsoleteAttribute("This property is not 64-bit compatible.  Use EventHandleIntPtr instead.  http://go.microsoft.com/fwlink/?linkid=14202")
  var EventHandle : Int = 0
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var EventHandleIntPtr : System.IntPtr = new System.IntPtr()
   
  def this() {}
   
  def this(offsetLo : Int, offsetHi : Int, hEvent : System.IntPtr, ar : System.IAsyncResult) {}
   
  @System.ObsoleteAttribute("This constructor is not 64-bit compatible.  Use the constructor that takes an IntPtr for the event handle.  http://go.microsoft.com/fwlink/?linkid=14202")
  def this(offsetLo : Int, offsetHi : Int, hEvent : Int, ar : System.IAsyncResult) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(false)
sealed class ParameterizedThreadStart extends System.MulticastDelegate {
  def Invoke(obj : AnyRef): Unit
   
  def BeginInvoke(obj : AnyRef, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ReaderWriterLock extends System.Runtime.ConstrainedExecution.CriticalFinalizerObject {
  protected def Finalize: Unit
   
  def AcquireReaderLock(millisecondsTimeout : Int): Unit
   
  def AcquireReaderLock(timeout : System.TimeSpan): Unit
   
  def AcquireWriterLock(millisecondsTimeout : Int): Unit
   
  def AcquireWriterLock(timeout : System.TimeSpan): Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def ReleaseReaderLock: Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def ReleaseWriterLock: Unit
   
  def UpgradeToWriterLock(millisecondsTimeout : Int): System.Threading.LockCookie
   
  def UpgradeToWriterLock(timeout : System.TimeSpan): System.Threading.LockCookie
   
  def DowngradeFromWriterLock(lockCookie : CLRByRef[System.Threading.LockCookie]): Unit
   
  def ReleaseLock: System.Threading.LockCookie
   
  def RestoreLock(lockCookie : CLRByRef[System.Threading.LockCookie]): Unit
   
  def AnyWritersSince(seqNum : Int): Boolean
   
  val IsReaderLockHeld : Boolean = false
   
  val IsWriterLockHeld : Boolean = false
   
  val WriterSeqNum : Int = 0
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SynchronizationLockException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Thread extends System.Runtime.ConstrainedExecution.CriticalFinalizerObject with 
                            System.Runtime.InteropServices._Thread {
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetHashCode: Int
   
  def Start: Unit
   
  def Start(parameter : AnyRef): Unit
   
  @System.ObsoleteAttribute("Thread.SetCompressedStack is no longer supported. Please use the System.Threading.CompressedStack class")
  def SetCompressedStack(stack : System.Threading.CompressedStack): Unit
   
  @System.ObsoleteAttribute("Thread.GetCompressedStack is no longer supported. Please use the System.Threading.CompressedStack class")
  def GetCompressedStack: System.Threading.CompressedStack
   
  def Abort(stateInfo : AnyRef): Unit
   
  def Abort: Unit
   
  @System.ObsoleteAttribute("Thread.Suspend has been deprecated.  Please use other classes in System.Threading, such as Monitor, Mutex, Event, and Semaphore, to synchronize Threads or protect resources.  http://go.microsoft.com/fwlink/?linkid=14202", false)
  def Suspend: Unit
   
  @System.ObsoleteAttribute("Thread.Resume has been deprecated.  Please use other classes in System.Threading, such as Monitor, Mutex, Event, and Semaphore, to synchronize Threads or protect resources.  http://go.microsoft.com/fwlink/?linkid=14202", false)
  def Resume: Unit
   
  def Interrupt: Unit
   
  def Join: Unit
   
  def Join(millisecondsTimeout : Int): Boolean
   
  def Join(timeout : System.TimeSpan): Boolean
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  protected def Finalize: Unit
   
  def GetApartmentState: System.Threading.ApartmentState
   
  def TrySetApartmentState(state : System.Threading.ApartmentState): Boolean
   
  def SetApartmentState(state : System.Threading.ApartmentState): Unit
   
  val ManagedThreadId : Int = 0
   
  val ExecutionContext : System.Threading.ExecutionContext = null
   
  var Priority : System.Threading.ThreadPriority = System.Threading.ThreadPriority.Lowest
   
  val IsAlive : Boolean = false
   
  val IsThreadPoolThread : Boolean = false
   
  var IsBackground : Boolean = false
   
  val ThreadState : System.Threading.ThreadState = System.Threading.ThreadState.Running
   
  @System.ObsoleteAttribute("The ApartmentState property has been deprecated.  Use GetApartmentState, SetApartmentState or TrySetApartmentState instead.", false)
  var ApartmentState : System.Threading.ApartmentState = System.Threading.ApartmentState.STA
   
  var CurrentUICulture : System.Globalization.CultureInfo = null
   
  var CurrentCulture : System.Globalization.CultureInfo = null
   
  var Name : String = ""
   
  def this(start : System.Threading.ThreadStart) {}
   
  def this(start : System.Threading.ThreadStart, maxStackSize : Int) {}
   
  def this(start : System.Threading.ParameterizedThreadStart) {}
   
  def this(start : System.Threading.ParameterizedThreadStart, maxStackSize : Int) {}
}
object Thread {
  def ResetAbort: Unit  = {}
   
  def Sleep(millisecondsTimeout : Int): Unit  = {}
   
  def Sleep(timeout : System.TimeSpan): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def SpinWait(iterations : Int): Unit  = {}
   
  def AllocateDataSlot: System.LocalDataStoreSlot  = null
   
  def AllocateNamedDataSlot(name : String): System.LocalDataStoreSlot  = null
   
  def GetNamedDataSlot(name : String): System.LocalDataStoreSlot  = null
   
  def FreeNamedDataSlot(name : String): Unit  = {}
   
  def GetData(slot : System.LocalDataStoreSlot): AnyRef  = null
   
  def SetData(slot : System.LocalDataStoreSlot, data : AnyRef): Unit  = {}
   
  def GetDomain: System.AppDomain  = null
   
  def GetDomainID: Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def BeginCriticalRegion: Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def EndCriticalRegion: Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def BeginThreadAffinity: Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def EndThreadAffinity: Unit  = {}
   
  def VolatileRead(address : CLRByRef[UByte]): UByte  = 0
   
  def VolatileRead(address : CLRByRef[Short]): Short  = 0
   
  def VolatileRead(address : CLRByRef[Int]): Int  = 0
   
  def VolatileRead(address : CLRByRef[Long]): Long  = 0
   
  @System.CLSCompliantAttribute(false)
  def VolatileRead(address : CLRByRef[Byte]): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def VolatileRead(address : CLRByRef[UShort]): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def VolatileRead(address : CLRByRef[UInt]): UInt  = 0
   
  def VolatileRead(address : CLRByRef[System.IntPtr]): System.IntPtr  = new System.IntPtr()
   
  @System.CLSCompliantAttribute(false)
  def VolatileRead(address : CLRByRef[System.UIntPtr]): System.UIntPtr  = new System.UIntPtr()
   
  @System.CLSCompliantAttribute(false)
  def VolatileRead(address : CLRByRef[ULong]): ULong  = 0
   
  def VolatileRead(address : CLRByRef[Float]): Float  = 0
   
  def VolatileRead(address : CLRByRef[Double]): Double  = 0
   
  def VolatileWrite(address : CLRByRef[UByte], value : UByte): Unit  = {}
   
  def VolatileWrite(address : CLRByRef[Short], value : Short): Unit  = {}
   
  def VolatileWrite(address : CLRByRef[Int], value : Int): Unit  = {}
   
  def VolatileWrite(address : CLRByRef[Long], value : Long): Unit  = {}
   
  @System.CLSCompliantAttribute(false)
  def VolatileWrite(address : CLRByRef[Byte], value : Byte): Unit  = {}
   
  @System.CLSCompliantAttribute(false)
  def VolatileWrite(address : CLRByRef[UShort], value : UShort): Unit  = {}
   
  @System.CLSCompliantAttribute(false)
  def VolatileWrite(address : CLRByRef[UInt], value : UInt): Unit  = {}
   
  def VolatileWrite(address : CLRByRef[System.IntPtr], value : System.IntPtr): Unit  = {}
   
  @System.CLSCompliantAttribute(false)
  def VolatileWrite(address : CLRByRef[System.UIntPtr], value : System.UIntPtr): Unit  = {}
   
  @System.CLSCompliantAttribute(false)
  def VolatileWrite(address : CLRByRef[ULong], value : ULong): Unit  = {}
   
  def VolatileWrite(address : CLRByRef[Float], value : Float): Unit  = {}
   
  def VolatileWrite(address : CLRByRef[Double], value : Double): Unit  = {}
   
  def MemoryBarrier: Unit  = {}
   
  val CurrentThread : System.Threading.Thread = null
   
  val CurrentContext : System.Runtime.Remoting.Contexts.Context = null
   
  var CurrentPrincipal : System.Security.Principal.IPrincipal = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ThreadAbortException extends System.SystemException {
  val ExceptionState : AnyRef = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ThreadInterruptedException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class RegisteredWaitHandle extends System.MarshalByRefObject {
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def Unregister(waitObject : System.Threading.WaitHandle): Boolean
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class WaitCallback extends System.MulticastDelegate {
  def Invoke(state : AnyRef): Unit
   
  def BeginInvoke(state : AnyRef, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class WaitOrTimerCallback extends System.MulticastDelegate {
  def Invoke(state : AnyRef, timedOut : Boolean): Unit
   
  def BeginInvoke(state : AnyRef, timedOut : Boolean, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.CLSCompliantAttribute(false)
sealed class IOCompletionCallback extends System.MulticastDelegate {
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
abstract sealed class ThreadPool extends AnyRef 
object ThreadPool {
  def SetMaxThreads(workerThreads : Int, completionPortThreads : Int): Boolean  = false
   
  def GetMaxThreads(workerThreads : CLRByRef[Int], completionPortThreads : CLRByRef[Int]): Unit  = {}
   
  def SetMinThreads(workerThreads : Int, completionPortThreads : Int): Boolean  = false
   
  def GetMinThreads(workerThreads : CLRByRef[Int], completionPortThreads : CLRByRef[Int]): Unit  = {}
   
  def GetAvailableThreads(workerThreads : CLRByRef[Int], completionPortThreads : CLRByRef[Int]): Unit  = {}
   
  @System.CLSCompliantAttribute(false)
  def RegisterWaitForSingleObject(waitObject : System.Threading.WaitHandle, 
                                  callBack : System.Threading.WaitOrTimerCallback, state : AnyRef, 
                                  millisecondsTimeOutInterval : UInt, executeOnlyOnce : Boolean): System.Threading.RegisteredWaitHandle  = null
   
  @System.CLSCompliantAttribute(false)
  def UnsafeRegisterWaitForSingleObject(waitObject : System.Threading.WaitHandle, 
                                        callBack : System.Threading.WaitOrTimerCallback, state : AnyRef, 
                                        millisecondsTimeOutInterval : UInt, executeOnlyOnce : Boolean): System.Threading.RegisteredWaitHandle  = null
   
  def RegisterWaitForSingleObject(waitObject : System.Threading.WaitHandle, 
                                  callBack : System.Threading.WaitOrTimerCallback, state : AnyRef, 
                                  millisecondsTimeOutInterval : Int, executeOnlyOnce : Boolean): System.Threading.RegisteredWaitHandle  = null
   
  def UnsafeRegisterWaitForSingleObject(waitObject : System.Threading.WaitHandle, 
                                        callBack : System.Threading.WaitOrTimerCallback, state : AnyRef, 
                                        millisecondsTimeOutInterval : Int, executeOnlyOnce : Boolean): System.Threading.RegisteredWaitHandle  = null
   
  def RegisterWaitForSingleObject(waitObject : System.Threading.WaitHandle, 
                                  callBack : System.Threading.WaitOrTimerCallback, state : AnyRef, 
                                  millisecondsTimeOutInterval : Long, executeOnlyOnce : Boolean): System.Threading.RegisteredWaitHandle  = null
   
  def UnsafeRegisterWaitForSingleObject(waitObject : System.Threading.WaitHandle, 
                                        callBack : System.Threading.WaitOrTimerCallback, state : AnyRef, 
                                        millisecondsTimeOutInterval : Long, executeOnlyOnce : Boolean): System.Threading.RegisteredWaitHandle  = null
   
  def RegisterWaitForSingleObject(waitObject : System.Threading.WaitHandle, 
                                  callBack : System.Threading.WaitOrTimerCallback, state : AnyRef, 
                                  timeout : System.TimeSpan, executeOnlyOnce : Boolean): System.Threading.RegisteredWaitHandle  = null
   
  def UnsafeRegisterWaitForSingleObject(waitObject : System.Threading.WaitHandle, 
                                        callBack : System.Threading.WaitOrTimerCallback, state : AnyRef, 
                                        timeout : System.TimeSpan, executeOnlyOnce : Boolean): System.Threading.RegisteredWaitHandle  = null
   
  def QueueUserWorkItem(callBack : System.Threading.WaitCallback, state : AnyRef): Boolean  = false
   
  def QueueUserWorkItem(callBack : System.Threading.WaitCallback): Boolean  = false
   
  def UnsafeQueueUserWorkItem(callBack : System.Threading.WaitCallback, state : AnyRef): Boolean  = false
   
  @System.ObsoleteAttribute("ThreadPool.BindHandle(IntPtr) has been deprecated.  Please use ThreadPool.BindHandle(SafeHandle) instead.", false)
  def BindHandle(osHandle : System.IntPtr): Boolean  = false
   
  def BindHandle(osHandle : System.Runtime.InteropServices.SafeHandle): Boolean  = false
}
 
sealed abstract class ThreadPriority extends System.Enum {
  def ==(that: System.Threading.ThreadPriority): Boolean = false
  def !=(that: System.Threading.ThreadPriority): Boolean = false
  def  <(that: System.Threading.ThreadPriority): Boolean = false
  def <=(that: System.Threading.ThreadPriority): Boolean = false
  def  >(that: System.Threading.ThreadPriority): Boolean = false
  def >=(that: System.Threading.ThreadPriority): Boolean = false
  def  |(that: System.Threading.ThreadPriority): Boolean = false
  def  &(that: System.Threading.ThreadPriority): Boolean = false
  def  ^(that: System.Threading.ThreadPriority): Boolean = false
}
object ThreadPriority{
  val Lowest	 = value(0)
  val BelowNormal	 = value(1)
  val Normal	 = value(2)
  val AboveNormal	 = value(3)
  val Highest	 = value(4)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Threading.ThreadPriority = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ThreadStart extends System.MulticastDelegate {
  def Invoke: Unit
   
  def BeginInvoke(callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed abstract class ThreadState extends System.Enum {
  def ==(that: System.Threading.ThreadState): Boolean = false
  def !=(that: System.Threading.ThreadState): Boolean = false
  def  <(that: System.Threading.ThreadState): Boolean = false
  def <=(that: System.Threading.ThreadState): Boolean = false
  def  >(that: System.Threading.ThreadState): Boolean = false
  def >=(that: System.Threading.ThreadState): Boolean = false
  def  |(that: System.Threading.ThreadState): Boolean = false
  def  &(that: System.Threading.ThreadState): Boolean = false
  def  ^(that: System.Threading.ThreadState): Boolean = false
}
object ThreadState{
  val Running	 = value(0)
  val StopRequested	 = value(1)
  val SuspendRequested	 = value(2)
  val Background	 = value(4)
  val Unstarted	 = value(8)
  val Stopped	 = value(16)
  val WaitSleepJoin	 = value(32)
  val Suspended	 = value(64)
  val AbortRequested	 = value(128)
  val Aborted	 = value(256)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Threading.ThreadState = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ThreadStateException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
sealed class ThreadStartException extends System.SystemException 
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract sealed class Timeout extends AnyRef 
object Timeout {
  val Infinite : Int  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class TimerCallback extends System.MulticastDelegate {
  def Invoke(state : AnyRef): Unit
   
  def BeginInvoke(state : AnyRef, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Timer extends System.MarshalByRefObject with System.IDisposable {
  def Change(dueTime : Int, period : Int): Boolean
   
  def Change(dueTime : System.TimeSpan, period : System.TimeSpan): Boolean
   
  @System.CLSCompliantAttribute(false)
  def Change(dueTime : UInt, period : UInt): Boolean
   
  def Change(dueTime : Long, period : Long): Boolean
   
  def Dispose(notifyObject : System.Threading.WaitHandle): Boolean
   
  def Dispose: Unit
   
  def this(callback : System.Threading.TimerCallback, state : AnyRef, dueTime : Int, period : Int) {}
   
  def this(callback : System.Threading.TimerCallback, state : AnyRef, dueTime : System.TimeSpan, 
           period : System.TimeSpan) {}
   
  @System.CLSCompliantAttribute(false)
  def this(callback : System.Threading.TimerCallback, state : AnyRef, dueTime : UInt, 
           period : UInt) {}
   
  def this(callback : System.Threading.TimerCallback, state : AnyRef, dueTime : Long, 
           period : Long) {}
   
  def this(callback : System.Threading.TimerCallback) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(false)
class WaitHandleCannotBeOpenedException extends System.ApplicationException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
sealed abstract class ApartmentState extends System.Enum {
  def ==(that: System.Threading.ApartmentState): Boolean = false
  def !=(that: System.Threading.ApartmentState): Boolean = false
  def  <(that: System.Threading.ApartmentState): Boolean = false
  def <=(that: System.Threading.ApartmentState): Boolean = false
  def  >(that: System.Threading.ApartmentState): Boolean = false
  def >=(that: System.Threading.ApartmentState): Boolean = false
  def  |(that: System.Threading.ApartmentState): Boolean = false
  def  &(that: System.Threading.ApartmentState): Boolean = false
  def  ^(that: System.Threading.ApartmentState): Boolean = false
}
object ApartmentState{
  val STA	 = value(0)
  val MTA	 = value(1)
  val Unknown	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Threading.ApartmentState = null
}
 
}