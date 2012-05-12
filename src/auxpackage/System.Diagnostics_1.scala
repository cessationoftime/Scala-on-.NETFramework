 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Diagnostics {
 
@System.AttributeUsageAttribute(68 /* AllowMultiple = true */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ConditionalAttribute extends System.Attribute {
  val ConditionString : String = ""
   
  def this(conditionString : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Debugger extends AnyRef {
  def this() {}
}
object Debugger {
  def Break: Unit  = {}
   
  def Launch: Boolean  = false
   
  def Log(level : Int, category : String, message : String): Unit  = {}
   
  def IsLogging: Boolean  = false
   
  val DefaultCategory : String  = ""
   
  val IsAttached : Boolean = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(108 /* Inherited = false */ )
sealed class DebuggerStepThroughAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(96 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class DebuggerStepperBoundaryAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(224 /* Inherited = false */ )
sealed class DebuggerHiddenAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(236 /* Inherited = false */ )
sealed class DebuggerNonUserCodeAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(3 /* AllowMultiple = false */ )
sealed class DebuggableAttribute extends System.Attribute {
  val IsJITTrackingEnabled : Boolean = false
   
  val IsJITOptimizerDisabled : Boolean = false
   
  val DebuggingFlags : System.Diagnostics.DebuggableAttribute.DebuggingModes = System.Diagnostics.DebuggableAttribute.DebuggingModes.None
   
  def this(isJITTrackingEnabled : Boolean, isJITOptimizerDisabled : Boolean) {}
   
  def this(modes : System.Diagnostics.DebuggableAttribute.DebuggingModes) {}
}
object DebuggableAttribute {
  sealed abstract class DebuggingModes extends System.Enum {
    def ==(that: System.Diagnostics.DebuggableAttribute.DebuggingModes): Boolean = false
    def !=(that: System.Diagnostics.DebuggableAttribute.DebuggingModes): Boolean = false
    def  <(that: System.Diagnostics.DebuggableAttribute.DebuggingModes): Boolean = false
    def <=(that: System.Diagnostics.DebuggableAttribute.DebuggingModes): Boolean = false
    def  >(that: System.Diagnostics.DebuggableAttribute.DebuggingModes): Boolean = false
    def >=(that: System.Diagnostics.DebuggableAttribute.DebuggingModes): Boolean = false
    def  |(that: System.Diagnostics.DebuggableAttribute.DebuggingModes): Boolean = false
    def  &(that: System.Diagnostics.DebuggableAttribute.DebuggingModes): Boolean = false
    def  ^(that: System.Diagnostics.DebuggableAttribute.DebuggingModes): Boolean = false
  }
  object DebuggingModes{
    val None	 = value(0)
    val Default	 = value(1)
    val DisableOptimizations	 = value(256)
    val IgnoreSymbolStoreSequencePoints	 = value(2)
    val EnableEditAndContinue	 = value(4)
     
    /* an artifact for CLR enums */ private def value(i: Int): System.Diagnostics.DebuggableAttribute.DebuggingModes = null
  }
}
 
sealed abstract class DebuggerBrowsableState extends System.Enum {
  def ==(that: System.Diagnostics.DebuggerBrowsableState): Boolean = false
  def !=(that: System.Diagnostics.DebuggerBrowsableState): Boolean = false
  def  <(that: System.Diagnostics.DebuggerBrowsableState): Boolean = false
  def <=(that: System.Diagnostics.DebuggerBrowsableState): Boolean = false
  def  >(that: System.Diagnostics.DebuggerBrowsableState): Boolean = false
  def >=(that: System.Diagnostics.DebuggerBrowsableState): Boolean = false
  def  |(that: System.Diagnostics.DebuggerBrowsableState): Boolean = false
  def  &(that: System.Diagnostics.DebuggerBrowsableState): Boolean = false
  def  ^(that: System.Diagnostics.DebuggerBrowsableState): Boolean = false
}
object DebuggerBrowsableState{
  val Never	 = value(0)
  val Collapsed	 = value(2)
  val RootHidden	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Diagnostics.DebuggerBrowsableState = null
}
 
@System.AttributeUsageAttribute(384 /* AllowMultiple = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class DebuggerBrowsableAttribute extends System.Attribute {
  val State : System.Diagnostics.DebuggerBrowsableState = System.Diagnostics.DebuggerBrowsableState.Never
   
  def this(state : System.Diagnostics.DebuggerBrowsableState) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(13 /* AllowMultiple = true */ )
sealed class DebuggerTypeProxyAttribute extends System.Attribute {
  val ProxyTypeName : String = ""
   
  var Target : System.Type = null
   
  var TargetTypeName : String = ""
   
  def this(`type` : System.Type) {}
   
  def this(typeName : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(4509 /* AllowMultiple = true */ )
sealed class DebuggerDisplayAttribute extends System.Attribute {
  val Value : String = ""
   
  var Name : String = ""
   
  var Type : String = ""
   
  var Target : System.Type = null
   
  var TargetTypeName : String = ""
   
  def this(value : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(13 /* AllowMultiple = true */ )
sealed class DebuggerVisualizerAttribute extends System.Attribute {
  val VisualizerObjectSourceTypeName : String = ""
   
  val VisualizerTypeName : String = ""
   
  var Description : String = ""
   
  var Target : System.Type = null
   
  var TargetTypeName : String = ""
   
  def this(visualizerTypeName : String) {}
   
  def this(visualizerTypeName : String, visualizerObjectSourceTypeName : String) {}
   
  def this(visualizerTypeName : String, visualizerObjectSource : System.Type) {}
   
  def this(visualizer : System.Type) {}
   
  def this(visualizer : System.Type, visualizerObjectSource : System.Type) {}
   
  def this(visualizer : System.Type, visualizerObjectSourceTypeName : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class StackTrace extends AnyRef {
  def GetFrame(index : Int): System.Diagnostics.StackFrame
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetFrames: Array[System.Diagnostics.StackFrame]
   
  def ToString: String
   
  val FrameCount : Int = 0
   
  def this() {}
   
  def this(fNeedFileInfo : Boolean) {}
   
  def this(skipFrames : Int) {}
   
  def this(skipFrames : Int, fNeedFileInfo : Boolean) {}
   
  def this(e : System.Exception) {}
   
  def this(e : System.Exception, fNeedFileInfo : Boolean) {}
   
  def this(e : System.Exception, skipFrames : Int) {}
   
  def this(e : System.Exception, skipFrames : Int, fNeedFileInfo : Boolean) {}
   
  def this(frame : System.Diagnostics.StackFrame) {}
   
  def this(targetThread : System.Threading.Thread, needFileInfo : Boolean) {}
}
object StackTrace {
  val METHODS_TO_SKIP : Int  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class StackFrame extends AnyRef {
  def GetMethod: System.Reflection.MethodBase
   
  def GetNativeOffset: Int
   
  def GetILOffset: Int
   
  def GetFileName: String
   
  def GetFileLineNumber: Int
   
  def GetFileColumnNumber: Int
   
  def ToString: String
   
  def this() {}
   
  def this(fNeedFileInfo : Boolean) {}
   
  def this(skipFrames : Int) {}
   
  def this(skipFrames : Int, fNeedFileInfo : Boolean) {}
   
  def this(fileName : String, lineNumber : Int) {}
   
  def this(fileName : String, lineNumber : Int, colNumber : Int) {}
}
object StackFrame {
  val OFFSET_UNKNOWN : Int  = 0
}
 
}