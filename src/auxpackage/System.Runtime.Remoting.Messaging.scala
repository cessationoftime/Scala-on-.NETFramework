 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.Remoting.Messaging {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IMessageSink {
  /* abstract */ def SyncProcessMessage(msg : System.Runtime.Remoting.Messaging.IMessage): System.Runtime.Remoting.Messaging.IMessage
   
  /* abstract */ def AsyncProcessMessage(msg : System.Runtime.Remoting.Messaging.IMessage, 
                                         replySink : System.Runtime.Remoting.Messaging.IMessageSink): System.Runtime.Remoting.Messaging.IMessageCtrl
   
  val NextSink : System.Runtime.Remoting.Messaging.IMessageSink = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class AsyncResult extends AnyRef with System.IAsyncResult with System.Runtime.Remoting.Messaging.IMessageSink {
  def SetMessageCtrl(mc : System.Runtime.Remoting.Messaging.IMessageCtrl): Unit
   
  def SyncProcessMessage(msg : System.Runtime.Remoting.Messaging.IMessage): System.Runtime.Remoting.Messaging.IMessage
   
  def AsyncProcessMessage(msg : System.Runtime.Remoting.Messaging.IMessage, 
                          replySink : System.Runtime.Remoting.Messaging.IMessageSink): System.Runtime.Remoting.Messaging.IMessageCtrl
   
  def GetReplyMessage: System.Runtime.Remoting.Messaging.IMessage
   
  val IsCompleted : Boolean = false
   
  val AsyncDelegate : AnyRef = null
   
  val AsyncState : AnyRef = null
   
  val CompletedSynchronously : Boolean = false
   
  var EndInvokeCalled : Boolean = false
   
  val AsyncWaitHandle : System.Threading.WaitHandle = null
   
  val NextSink : System.Runtime.Remoting.Messaging.IMessageSink = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class CallContext extends AnyRef 
object CallContext {
  def FreeNamedDataSlot(name : String): Unit  = {}
   
  def LogicalGetData(name : String): AnyRef  = null
   
  def GetData(name : String): AnyRef  = null
   
  def SetData(name : String, data : AnyRef): Unit  = {}
   
  def LogicalSetData(name : String, data : AnyRef): Unit  = {}
   
  def GetHeaders: Array[System.Runtime.Remoting.Messaging.Header]  = Array.empty[System.Runtime.Remoting.Messaging.Header]
   
  def SetHeaders(headers : Array[System.Runtime.Remoting.Messaging.Header]): Unit  = {}
   
  var HostContext : AnyRef = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ILogicalThreadAffinative 
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class LogicalCallContext extends AnyRef with System.Runtime.Serialization.ISerializable with System.ICloneable {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  def Clone: AnyRef
   
  def FreeNamedDataSlot(name : String): Unit
   
  def GetData(name : String): AnyRef
   
  def SetData(name : String, data : AnyRef): Unit
   
  val HasInfo : Boolean = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class Header extends AnyRef {
  var Name : String
   
  var Value : AnyRef
   
  var MustUnderstand : Boolean
   
  var HeaderNamespace : String
   
  def this(_Name : String, _Value : AnyRef) {}
   
  def this(_Name : String, _Value : AnyRef, _MustUnderstand : Boolean) {}
   
  def this(_Name : String, _Value : AnyRef, _MustUnderstand : Boolean, _HeaderNamespace : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class HeaderHandler extends System.MulticastDelegate {
  def Invoke(headers : Array[System.Runtime.Remoting.Messaging.Header]): AnyRef
   
  def BeginInvoke(headers : Array[System.Runtime.Remoting.Messaging.Header], 
                  callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): AnyRef
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IMessage {
  val Properties : System.Collections.IDictionary = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IMethodMessage extends System.Runtime.Remoting.Messaging.IMessage {
  /* abstract */ def GetArgName(index : Int): String
   
  /* abstract */ def GetArg(argNum : Int): AnyRef
   
  val Uri : String = ""
   
  val MethodName : String = ""
   
  val TypeName : String = ""
   
  val MethodSignature : AnyRef = null
   
  val ArgCount : Int = 0
   
  val Args : Array[AnyRef] = Array.empty[AnyRef]
   
  val HasVarArgs : Boolean = false
   
  val LogicalCallContext : System.Runtime.Remoting.Messaging.LogicalCallContext = null
   
  val MethodBase : System.Reflection.MethodBase = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IMethodCallMessage extends System.Runtime.Remoting.Messaging.IMethodMessage with 
                                 System.Runtime.Remoting.Messaging.IMessage {
  /* abstract */ def GetInArgName(index : Int): String
   
  /* abstract */ def GetInArg(argNum : Int): AnyRef
   
  val InArgCount : Int = 0
   
  val InArgs : Array[AnyRef] = Array.empty[AnyRef]
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IMethodReturnMessage extends System.Runtime.Remoting.Messaging.IMethodMessage with 
                                   System.Runtime.Remoting.Messaging.IMessage {
  /* abstract */ def GetOutArgName(index : Int): String
   
  /* abstract */ def GetOutArg(argNum : Int): AnyRef
   
  val OutArgCount : Int = 0
   
  val OutArgs : Array[AnyRef] = Array.empty[AnyRef]
   
  val Exception : System.Exception = null
   
  val ReturnValue : AnyRef = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IMessageCtrl {
  /* abstract */ def Cancel(msToCancel : Int): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IRemotingFormatter extends System.Runtime.Serialization.IFormatter {
  /* abstract */ def Deserialize(serializationStream : System.IO.Stream, 
                                 handler : System.Runtime.Remoting.Messaging.HeaderHandler): AnyRef
   
  /* abstract */ def Serialize(serializationStream : System.IO.Stream, graph : AnyRef, 
                               headers : Array[System.Runtime.Remoting.Messaging.Header]): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ReturnMessage extends AnyRef with System.Runtime.Remoting.Messaging.IMethodReturnMessage with 
                            System.Runtime.Remoting.Messaging.IMethodMessage with 
                            System.Runtime.Remoting.Messaging.IMessage {
  def GetArg(argNum : Int): AnyRef
   
  def GetArgName(index : Int): String
   
  def GetOutArg(argNum : Int): AnyRef
   
  def GetOutArgName(index : Int): String
   
  var Uri : String = ""
   
  val MethodName : String = ""
   
  val TypeName : String = ""
   
  val MethodSignature : AnyRef = null
   
  val MethodBase : System.Reflection.MethodBase = null
   
  val HasVarArgs : Boolean = false
   
  val ArgCount : Int = 0
   
  val Args : Array[AnyRef] = Array.empty[AnyRef]
   
  val OutArgCount : Int = 0
   
  val OutArgs : Array[AnyRef] = Array.empty[AnyRef]
   
  val Exception : System.Exception = null
   
  val ReturnValue : AnyRef = null
   
  val Properties : System.Collections.IDictionary = null
   
  val LogicalCallContext : System.Runtime.Remoting.Messaging.LogicalCallContext = null
   
  def this(ret : AnyRef, outArgs : Array[AnyRef], outArgsCount : Int, 
           callCtx : System.Runtime.Remoting.Messaging.LogicalCallContext, 
           mcm : System.Runtime.Remoting.Messaging.IMethodCallMessage) {}
   
  def this(e : System.Exception, mcm : System.Runtime.Remoting.Messaging.IMethodCallMessage) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.CLSCompliantAttribute(false)
class MethodCall extends AnyRef with System.Runtime.Remoting.Messaging.IMethodCallMessage with 
                         System.Runtime.Remoting.Messaging.IMethodMessage with 
                         System.Runtime.Remoting.Messaging.IMessage with 
                         System.Runtime.Serialization.ISerializable with 
                         System.Runtime.Remoting.Messaging.IInternalMessage with 
                         System.Runtime.Remoting.Messaging.ISerializationRootObject {
  def RootSetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                        ctx : System.Runtime.Serialization.StreamingContext): Unit
   
  def ResolveMethod: Unit
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  def Init: Unit
   
  def GetArg(argNum : Int): AnyRef
   
  def GetArgName(index : Int): String
   
  def GetInArg(argNum : Int): AnyRef
   
  def GetInArgName(index : Int): String
   
  def HeaderHandler(h : Array[System.Runtime.Remoting.Messaging.Header]): AnyRef
   
  protected var ExternalProperties : System.Collections.IDictionary
   
  protected var InternalProperties : System.Collections.IDictionary
   
  val ArgCount : Int = 0
   
  val Args : Array[AnyRef] = Array.empty[AnyRef]
   
  val InArgCount : Int = 0
   
  val InArgs : Array[AnyRef] = Array.empty[AnyRef]
   
  val MethodName : String = ""
   
  val TypeName : String = ""
   
  val MethodSignature : AnyRef = null
   
  val MethodBase : System.Reflection.MethodBase = null
   
  var Uri : String = ""
   
  val HasVarArgs : Boolean = false
   
  val Properties : System.Collections.IDictionary = null
   
  val LogicalCallContext : System.Runtime.Remoting.Messaging.LogicalCallContext = null
   
  def this(h1 : Array[System.Runtime.Remoting.Messaging.Header]) {}
   
  def this(msg : System.Runtime.Remoting.Messaging.IMessage) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.CLSCompliantAttribute(false)
class ConstructionCall extends System.Runtime.Remoting.Messaging.MethodCall with 
                               System.Runtime.Remoting.Activation.IConstructionCallMessage with 
                               System.Runtime.Remoting.Messaging.IMethodCallMessage with 
                               System.Runtime.Remoting.Messaging.IMethodMessage with 
                               System.Runtime.Remoting.Messaging.IMessage {
  val CallSiteActivationAttributes : Array[AnyRef] = Array.empty[AnyRef]
   
  val ActivationType : System.Type = null
   
  val ActivationTypeName : String = ""
   
  val ContextProperties : System.Collections.IList = null
   
  val Properties : System.Collections.IDictionary = null
   
  var Activator : System.Runtime.Remoting.Activation.IActivator = null
   
  def this(headers : Array[System.Runtime.Remoting.Messaging.Header]) {}
   
  def this(m : System.Runtime.Remoting.Messaging.IMessage) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.CLSCompliantAttribute(false)
class MethodResponse extends AnyRef with System.Runtime.Remoting.Messaging.IMethodReturnMessage with 
                             System.Runtime.Remoting.Messaging.IMethodMessage with 
                             System.Runtime.Remoting.Messaging.IMessage with 
                             System.Runtime.Serialization.ISerializable with 
                             System.Runtime.Remoting.Messaging.ISerializationRootObject with 
                             System.Runtime.Remoting.Messaging.IInternalMessage {
  def HeaderHandler(h : Array[System.Runtime.Remoting.Messaging.Header]): AnyRef
   
  def RootSetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                        ctx : System.Runtime.Serialization.StreamingContext): Unit
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  def GetArg(argNum : Int): AnyRef
   
  def GetArgName(index : Int): String
   
  def GetOutArg(argNum : Int): AnyRef
   
  def GetOutArgName(index : Int): String
   
  protected var InternalProperties : System.Collections.IDictionary
   
  protected var ExternalProperties : System.Collections.IDictionary
   
  var Uri : String = ""
   
  val MethodName : String = ""
   
  val TypeName : String = ""
   
  val MethodSignature : AnyRef = null
   
  val MethodBase : System.Reflection.MethodBase = null
   
  val HasVarArgs : Boolean = false
   
  val ArgCount : Int = 0
   
  val Args : Array[AnyRef] = Array.empty[AnyRef]
   
  val OutArgCount : Int = 0
   
  val OutArgs : Array[AnyRef] = Array.empty[AnyRef]
   
  val Exception : System.Exception = null
   
  val ReturnValue : AnyRef = null
   
  val Properties : System.Collections.IDictionary = null
   
  val LogicalCallContext : System.Runtime.Remoting.Messaging.LogicalCallContext = null
   
  def this(h1 : Array[System.Runtime.Remoting.Messaging.Header], 
           mcm : System.Runtime.Remoting.Messaging.IMethodCallMessage) {}
}
 
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ConstructionResponse extends System.Runtime.Remoting.Messaging.MethodResponse with 
                                   System.Runtime.Remoting.Activation.IConstructionReturnMessage with 
                                   System.Runtime.Remoting.Messaging.IMethodReturnMessage with 
                                   System.Runtime.Remoting.Messaging.IMethodMessage with 
                                   System.Runtime.Remoting.Messaging.IMessage {
  val Properties : System.Collections.IDictionary = null
   
  def this(h : Array[System.Runtime.Remoting.Messaging.Header], 
           mcm : System.Runtime.Remoting.Messaging.IMethodCallMessage) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class InternalMessageWrapper extends AnyRef {
  protected var WrappedMessage : System.Runtime.Remoting.Messaging.IMessage
   
  def this(msg : System.Runtime.Remoting.Messaging.IMessage) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class MethodCallMessageWrapper extends System.Runtime.Remoting.Messaging.InternalMessageWrapper with 
                                       System.Runtime.Remoting.Messaging.IMethodCallMessage with 
                                       System.Runtime.Remoting.Messaging.IMethodMessage with 
                                       System.Runtime.Remoting.Messaging.IMessage {
  def GetArgName(index : Int): String
   
  def GetArg(argNum : Int): AnyRef
   
  def GetInArg(argNum : Int): AnyRef
   
  def GetInArgName(index : Int): String
   
  var Uri : String = ""
   
  val MethodName : String = ""
   
  val TypeName : String = ""
   
  val MethodSignature : AnyRef = null
   
  val LogicalCallContext : System.Runtime.Remoting.Messaging.LogicalCallContext = null
   
  val MethodBase : System.Reflection.MethodBase = null
   
  val ArgCount : Int = 0
   
  var Args : Array[AnyRef] = Array.empty[AnyRef]
   
  val HasVarArgs : Boolean = false
   
  val InArgCount : Int = 0
   
  val InArgs : Array[AnyRef] = Array.empty[AnyRef]
   
  val Properties : System.Collections.IDictionary = null
   
  def this(msg : System.Runtime.Remoting.Messaging.IMethodCallMessage) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class MethodReturnMessageWrapper extends System.Runtime.Remoting.Messaging.InternalMessageWrapper with 
                                         System.Runtime.Remoting.Messaging.IMethodReturnMessage with 
                                         System.Runtime.Remoting.Messaging.IMethodMessage with 
                                         System.Runtime.Remoting.Messaging.IMessage {
  def GetArgName(index : Int): String
   
  def GetArg(argNum : Int): AnyRef
   
  def GetOutArg(argNum : Int): AnyRef
   
  def GetOutArgName(index : Int): String
   
  var Uri : String = ""
   
  val MethodName : String = ""
   
  val TypeName : String = ""
   
  val MethodSignature : AnyRef = null
   
  val LogicalCallContext : System.Runtime.Remoting.Messaging.LogicalCallContext = null
   
  val MethodBase : System.Reflection.MethodBase = null
   
  val ArgCount : Int = 0
   
  var Args : Array[AnyRef] = Array.empty[AnyRef]
   
  val HasVarArgs : Boolean = false
   
  val OutArgCount : Int = 0
   
  val OutArgs : Array[AnyRef] = Array.empty[AnyRef]
   
  var Exception : System.Exception = null
   
  var ReturnValue : AnyRef = null
   
  val Properties : System.Collections.IDictionary = null
   
  def this(msg : System.Runtime.Remoting.Messaging.IMethodReturnMessage) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(64)
class OneWayAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class MessageSurrogateFilter extends System.MulticastDelegate {
  def Invoke(key : String, value : AnyRef): Boolean
   
  def BeginInvoke(key : String, value : AnyRef, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Boolean
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class RemotingSurrogateSelector extends AnyRef with System.Runtime.Serialization.ISurrogateSelector {
  def SetRootObject(obj : AnyRef): Unit
   
  def GetRootObject: AnyRef
   
  def ChainSelector(selector : System.Runtime.Serialization.ISurrogateSelector): Unit
   
  def GetNextSelector: System.Runtime.Serialization.ISurrogateSelector
   
  def UseSoapFormat: Unit
   
  var Filter : System.Runtime.Remoting.Messaging.MessageSurrogateFilter = null
   
  def this() {}
}
 
}