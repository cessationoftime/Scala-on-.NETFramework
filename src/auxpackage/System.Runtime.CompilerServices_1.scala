 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.CompilerServices {
 
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
sealed class StringFreezingAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(256)
sealed class AccessedThroughPropertyAttribute extends System.Attribute {
  val PropertyName : String = ""
   
  def this(propertyName : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class CallConvCdecl extends AnyRef {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class CallConvStdcall extends AnyRef {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class CallConvThiscall extends AnyRef {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class CallConvFastcall extends AnyRef {
  def this() {}
}
 
abstract sealed class RuntimeHelpers extends AnyRef 
object RuntimeHelpers {
  def InitializeArray(array : System.Array, fldHandle : System.RuntimeFieldHandle): Unit  = {}
   
  def GetObjectValue(obj : AnyRef): AnyRef  = null
   
  def RunClassConstructor(`type` : System.RuntimeTypeHandle): Unit  = {}
   
  def RunModuleConstructor(module : System.ModuleHandle): Unit  = {}
   
  def PrepareMethod(method : System.RuntimeMethodHandle): Unit  = {}
   
  def PrepareMethod(method : System.RuntimeMethodHandle, 
                    instantiation : Array[System.RuntimeTypeHandle]): Unit  = {}
   
  def PrepareDelegate(d : System.Delegate): Unit  = {}
   
  def GetHashCode(o : AnyRef): Int  = 0
   
  def Equals(o1 : AnyRef, o2 : AnyRef): Boolean  = false
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def ProbeForSufficientStack: Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def PrepareConstrainedRegions: Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def PrepareConstrainedRegionsNoOP: Unit  = {}
   
  def ExecuteCodeWithGuaranteedCleanup(code : System.Runtime.CompilerServices.RuntimeHelpers.TryCode, 
                                       backoutCode : System.Runtime.CompilerServices.RuntimeHelpers.CleanupCode, 
                                       userData : AnyRef): Unit  = {}
   
  val OffsetToStringData : Int = 0
   
  sealed class TryCode extends System.MulticastDelegate {
    def Invoke(userData : AnyRef): Unit
     
    def BeginInvoke(userData : AnyRef, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
     
    def EndInvoke(result : System.IAsyncResult): Unit
     
    def this(`object` : AnyRef, method : System.IntPtr) {}
  }
   
  sealed class CleanupCode extends System.MulticastDelegate {
    def Invoke(userData : AnyRef, exceptionThrown : Boolean): Unit
     
    def BeginInvoke(userData : AnyRef, exceptionThrown : Boolean, callback : System.AsyncCallback, 
                    `object` : AnyRef): System.IAsyncResult
     
    def EndInvoke(result : System.IAsyncResult): Unit
     
    def this(`object` : AnyRef, method : System.IntPtr) {}
  }
}
 
@System.AttributeUsageAttribute(32767 /* Inherited = true */ )
sealed class CompilerGeneratedAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(2304 /* Inherited = false */ )
abstract class CustomConstantAttribute extends System.Attribute {
  val Value : AnyRef = null
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(2304 /* Inherited = false */ )
sealed class DateTimeConstantAttribute extends System.Runtime.CompilerServices.CustomConstantAttribute {
  val Value : AnyRef = null
   
  def this(ticks : Long) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class DiscardableAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(2304 /* Inherited = false */ )
sealed class DecimalConstantAttribute extends System.Attribute {
  val Value : System.Decimal = new System.Decimal()
   
  @System.CLSCompliantAttribute(false)
  def this(scale : UByte, sign : UByte, hi : UInt, mid : UInt, low : UInt) {}
   
  def this(scale : UByte, sign : UByte, hi : Int, mid : Int, low : Int) {}
}
 
sealed abstract class CompilationRelaxations extends System.Enum {
  def ==(that: System.Runtime.CompilerServices.CompilationRelaxations): Boolean = false
  def !=(that: System.Runtime.CompilerServices.CompilationRelaxations): Boolean = false
  def  <(that: System.Runtime.CompilerServices.CompilationRelaxations): Boolean = false
  def <=(that: System.Runtime.CompilerServices.CompilationRelaxations): Boolean = false
  def  >(that: System.Runtime.CompilerServices.CompilationRelaxations): Boolean = false
  def >=(that: System.Runtime.CompilerServices.CompilationRelaxations): Boolean = false
  def  |(that: System.Runtime.CompilerServices.CompilationRelaxations): Boolean = false
  def  &(that: System.Runtime.CompilerServices.CompilationRelaxations): Boolean = false
  def  ^(that: System.Runtime.CompilerServices.CompilationRelaxations): Boolean = false
}
object CompilationRelaxations{
  val NoStringInterning	 = value(8)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.CompilerServices.CompilationRelaxations = null
}
 
@System.AttributeUsageAttribute(71)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class CompilationRelaxationsAttribute extends System.Attribute {
  val CompilationRelaxations : Int = 0
   
  def this(relaxations : Int) {}
   
  def this(relaxations : System.Runtime.CompilerServices.CompilationRelaxations) {}
}
 
@System.AttributeUsageAttribute(4)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class CompilerGlobalScopeAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(256 /* Inherited = false */ )
sealed class FixedBufferAttribute extends System.Attribute {
  val ElementType : System.Type = null
   
  val Length : Int = 0
   
  def this(elementType : System.Type, length : Int) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(128 /* Inherited = true */ )
sealed class IndexerNameAttribute extends System.Attribute {
  def this(indexerName : String) {}
}
 
@System.AttributeUsageAttribute(1 /* AllowMultiple = true, Inherited = false */ )
sealed class InternalsVisibleToAttribute extends System.Attribute {
  val AssemblyName : String = ""
   
  var AllInternalsVisible : Boolean = false
   
  def this(assemblyName : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract sealed class IsVolatile extends AnyRef 
 
sealed abstract class MethodImplOptions extends System.Enum {
  def ==(that: System.Runtime.CompilerServices.MethodImplOptions): Boolean = false
  def !=(that: System.Runtime.CompilerServices.MethodImplOptions): Boolean = false
  def  <(that: System.Runtime.CompilerServices.MethodImplOptions): Boolean = false
  def <=(that: System.Runtime.CompilerServices.MethodImplOptions): Boolean = false
  def  >(that: System.Runtime.CompilerServices.MethodImplOptions): Boolean = false
  def >=(that: System.Runtime.CompilerServices.MethodImplOptions): Boolean = false
  def  |(that: System.Runtime.CompilerServices.MethodImplOptions): Boolean = false
  def  &(that: System.Runtime.CompilerServices.MethodImplOptions): Boolean = false
  def  ^(that: System.Runtime.CompilerServices.MethodImplOptions): Boolean = false
}
object MethodImplOptions{
  val Unmanaged	 = value(4)
  val ForwardRef	 = value(16)
  val PreserveSig	 = value(128)
  val InternalCall	 = value(4096)
  val Synchronized	 = value(32)
  val NoInlining	 = value(8)
  val NoOptimization	 = value(64)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.CompilerServices.MethodImplOptions = null
}
 
sealed abstract class MethodCodeType extends System.Enum {
  def ==(that: System.Runtime.CompilerServices.MethodCodeType): Boolean = false
  def !=(that: System.Runtime.CompilerServices.MethodCodeType): Boolean = false
  def  <(that: System.Runtime.CompilerServices.MethodCodeType): Boolean = false
  def <=(that: System.Runtime.CompilerServices.MethodCodeType): Boolean = false
  def  >(that: System.Runtime.CompilerServices.MethodCodeType): Boolean = false
  def >=(that: System.Runtime.CompilerServices.MethodCodeType): Boolean = false
  def  |(that: System.Runtime.CompilerServices.MethodCodeType): Boolean = false
  def  &(that: System.Runtime.CompilerServices.MethodCodeType): Boolean = false
  def  ^(that: System.Runtime.CompilerServices.MethodCodeType): Boolean = false
}
object MethodCodeType{
  val IL	 = value(0)
  val Native	 = value(1)
  val OPTIL	 = value(2)
  val Runtime	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.CompilerServices.MethodCodeType = null
}
 
@System.AttributeUsageAttribute(96 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class MethodImplAttribute extends System.Attribute {
  var MethodCodeType : System.Runtime.CompilerServices.MethodCodeType
   
  val Value : System.Runtime.CompilerServices.MethodImplOptions = System.Runtime.CompilerServices.MethodImplOptions.Unmanaged
   
  def this(methodImplOptions : System.Runtime.CompilerServices.MethodImplOptions) {}
   
  def this(value : Short) {}
   
  def this() {}
}
 
@System.AttributeUsageAttribute(256)
sealed class FixedAddressValueTypeAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(8)
sealed class UnsafeValueTypeAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(1052 /* AllowMultiple = true, Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class RequiredAttributeAttribute extends System.Attribute {
  val RequiredContract : System.Type = null
   
  def this(requiredContract : System.Type) {}
}
 
sealed abstract class LoadHint extends System.Enum {
  def ==(that: System.Runtime.CompilerServices.LoadHint): Boolean = false
  def !=(that: System.Runtime.CompilerServices.LoadHint): Boolean = false
  def  <(that: System.Runtime.CompilerServices.LoadHint): Boolean = false
  def <=(that: System.Runtime.CompilerServices.LoadHint): Boolean = false
  def  >(that: System.Runtime.CompilerServices.LoadHint): Boolean = false
  def >=(that: System.Runtime.CompilerServices.LoadHint): Boolean = false
  def  |(that: System.Runtime.CompilerServices.LoadHint): Boolean = false
  def  &(that: System.Runtime.CompilerServices.LoadHint): Boolean = false
  def  ^(that: System.Runtime.CompilerServices.LoadHint): Boolean = false
}
object LoadHint{
  val Default	 = value(0)
  val Always	 = value(1)
  val Sometimes	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.CompilerServices.LoadHint = null
}
 
@System.AttributeUsageAttribute(1)
sealed class DefaultDependencyAttribute extends System.Attribute {
  val LoadHint : System.Runtime.CompilerServices.LoadHint = System.Runtime.CompilerServices.LoadHint.Default
   
  def this(loadHintArgument : System.Runtime.CompilerServices.LoadHint) {}
}
 
@System.AttributeUsageAttribute(1 /* AllowMultiple = true */ )
sealed class DependencyAttribute extends System.Attribute {
  val DependentAssembly : String = ""
   
  val LoadHint : System.Runtime.CompilerServices.LoadHint = System.Runtime.CompilerServices.LoadHint.Default
   
  def this(dependentAssemblyArgument : String, 
           loadHintArgument : System.Runtime.CompilerServices.LoadHint) {}
}
 
abstract sealed class CompilerMarshalOverride extends AnyRef 
 
@System.AttributeUsageAttribute(8)
sealed class HasCopySemanticsAttribute extends System.Attribute {
  def this() {}
}
 
abstract sealed class IsBoxed extends AnyRef 
 
abstract sealed class IsByValue extends AnyRef 
 
abstract sealed class IsConst extends AnyRef 
 
abstract sealed class IsExplicitlyDereferenced extends AnyRef 
 
abstract sealed class IsImplicitlyDereferenced extends AnyRef 
 
abstract sealed class IsJitIntrinsic extends AnyRef 
 
abstract sealed class IsLong extends AnyRef 
 
abstract sealed class IsPinned extends AnyRef 
 
abstract sealed class IsSignUnspecifiedByte extends AnyRef 
 
abstract sealed class IsUdtReturn extends AnyRef 
 
@System.AttributeUsageAttribute(16)
sealed class ScopelessEnumAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(972)
sealed class SpecialNameAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract sealed class IsCopyConstructed extends AnyRef 
 
@System.AttributeUsageAttribute(3)
sealed class SuppressIldasmAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(8 /* Inherited = true */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class NativeCppClassAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(1 /* AllowMultiple = true, Inherited = false */ )
sealed class TypeForwardedToAttribute extends System.Attribute {
  val Destination : System.Type = null
   
  def this(destination : System.Type) {}
}
 
@System.AttributeUsageAttribute(1 /* Inherited = false, AllowMultiple = false */ )
sealed class RuntimeCompatibilityAttribute extends System.Attribute {
  var WrapNonExceptionThrows : Boolean = false
   
  def this() {}
}
 
sealed class RuntimeWrappedException extends System.Exception {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  val WrappedException : AnyRef = null
}
 
@System.AttributeUsageAttribute(2304 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class IDispatchConstantAttribute extends System.Runtime.CompilerServices.CustomConstantAttribute {
  val Value : AnyRef = null
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(2304 /* Inherited = false */ )
sealed class IUnknownConstantAttribute extends System.Runtime.CompilerServices.CustomConstantAttribute {
  val Value : AnyRef = null
   
  def this() {}
}
 
}