 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.Remoting.Contexts {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IContextAttribute {
  /* abstract */ def IsContextOK(ctx : System.Runtime.Remoting.Contexts.Context, 
                                 msg : System.Runtime.Remoting.Activation.IConstructionCallMessage): Boolean
   
  /* abstract */ def GetPropertiesForNewContext(msg : System.Runtime.Remoting.Activation.IConstructionCallMessage): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IContextProperty {
  /* abstract */ def IsNewContextOK(newCtx : System.Runtime.Remoting.Contexts.Context): Boolean
   
  /* abstract */ def Freeze(newContext : System.Runtime.Remoting.Contexts.Context): Unit
   
  val Name : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(4)
class ContextAttribute extends System.Attribute with System.Runtime.Remoting.Contexts.IContextAttribute with 
                               System.Runtime.Remoting.Contexts.IContextProperty {
  def IsNewContextOK(newCtx : System.Runtime.Remoting.Contexts.Context): Boolean
   
  def Freeze(newContext : System.Runtime.Remoting.Contexts.Context): Unit
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def IsContextOK(ctx : System.Runtime.Remoting.Contexts.Context, 
                  ctorMsg : System.Runtime.Remoting.Activation.IConstructionCallMessage): Boolean
   
  def GetPropertiesForNewContext(ctorMsg : System.Runtime.Remoting.Activation.IConstructionCallMessage): Unit
   
  protected var AttributeName : String
   
  val Name : String = ""
   
  def this(name : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class CrossContextDelegate extends System.MulticastDelegate {
  def Invoke: Unit
   
  def BeginInvoke(callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class Context extends AnyRef {
  protected def Finalize: Unit
   
  def GetProperty(name : String): System.Runtime.Remoting.Contexts.IContextProperty
   
  def SetProperty(prop : System.Runtime.Remoting.Contexts.IContextProperty): Unit
   
  def Freeze: Unit
   
  def ToString: String
   
  def DoCallBack(deleg : System.Runtime.Remoting.Contexts.CrossContextDelegate): Unit
   
  val ContextID : Int = 0
   
  val ContextProperties : Array[System.Runtime.Remoting.Contexts.IContextProperty] = Array.empty[System.Runtime.Remoting.Contexts.IContextProperty]
   
  def this() {}
}
object Context {
  def AllocateDataSlot: System.LocalDataStoreSlot  = null
   
  def AllocateNamedDataSlot(name : String): System.LocalDataStoreSlot  = null
   
  def GetNamedDataSlot(name : String): System.LocalDataStoreSlot  = null
   
  def FreeNamedDataSlot(name : String): Unit  = {}
   
  def SetData(slot : System.LocalDataStoreSlot, data : AnyRef): Unit  = {}
   
  def GetData(slot : System.LocalDataStoreSlot): AnyRef  = null
   
  def RegisterDynamicProperty(prop : System.Runtime.Remoting.Contexts.IDynamicProperty, 
                              obj : System.ContextBoundObject, ctx : System.Runtime.Remoting.Contexts.Context): Boolean  = false
   
  def UnregisterDynamicProperty(name : String, obj : System.ContextBoundObject, 
                                ctx : System.Runtime.Remoting.Contexts.Context): Boolean  = false
   
  val DefaultContext : System.Runtime.Remoting.Contexts.Context = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ContextProperty extends AnyRef {
  val Name : String = ""
   
  val Property : AnyRef = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IContextPropertyActivator {
  /* abstract */ def IsOKToActivate(msg : System.Runtime.Remoting.Activation.IConstructionCallMessage): Boolean
   
  /* abstract */ def CollectFromClientContext(msg : System.Runtime.Remoting.Activation.IConstructionCallMessage): Unit
   
  /* abstract */ def DeliverClientContextToServerContext(msg : System.Runtime.Remoting.Activation.IConstructionCallMessage): Boolean
   
  /* abstract */ def CollectFromServerContext(msg : System.Runtime.Remoting.Activation.IConstructionReturnMessage): Unit
   
  /* abstract */ def DeliverServerContextToClientContext(msg : System.Runtime.Remoting.Activation.IConstructionReturnMessage): Boolean
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IContributeClientContextSink {
  /* abstract */ def GetClientContextSink(nextSink : System.Runtime.Remoting.Messaging.IMessageSink): System.Runtime.Remoting.Messaging.IMessageSink
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IContributeDynamicSink {
  /* abstract */ def GetDynamicSink: System.Runtime.Remoting.Contexts.IDynamicMessageSink
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IContributeEnvoySink {
  /* abstract */ def GetEnvoySink(obj : System.MarshalByRefObject, 
                                  nextSink : System.Runtime.Remoting.Messaging.IMessageSink): System.Runtime.Remoting.Messaging.IMessageSink
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IContributeObjectSink {
  /* abstract */ def GetObjectSink(obj : System.MarshalByRefObject, 
                                   nextSink : System.Runtime.Remoting.Messaging.IMessageSink): System.Runtime.Remoting.Messaging.IMessageSink
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IContributeServerContextSink {
  /* abstract */ def GetServerContextSink(nextSink : System.Runtime.Remoting.Messaging.IMessageSink): System.Runtime.Remoting.Messaging.IMessageSink
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IDynamicProperty {
  val Name : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IDynamicMessageSink {
  /* abstract */ def ProcessMessageStart(reqMsg : System.Runtime.Remoting.Messaging.IMessage, bCliSide : Boolean, 
                                         bAsync : Boolean): Unit
   
  /* abstract */ def ProcessMessageFinish(replyMsg : System.Runtime.Remoting.Messaging.IMessage, bCliSide : Boolean, 
                                          bAsync : Boolean): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(4)
class SynchronizationAttribute extends System.Runtime.Remoting.Contexts.ContextAttribute with 
                                       System.Runtime.Remoting.Contexts.IContributeServerContextSink with 
                                       System.Runtime.Remoting.Contexts.IContributeClientContextSink {
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def IsContextOK(ctx : System.Runtime.Remoting.Contexts.Context, 
                  msg : System.Runtime.Remoting.Activation.IConstructionCallMessage): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetPropertiesForNewContext(ctorMsg : System.Runtime.Remoting.Activation.IConstructionCallMessage): Unit
   
  def GetServerContextSink(nextSink : System.Runtime.Remoting.Messaging.IMessageSink): System.Runtime.Remoting.Messaging.IMessageSink
   
  def GetClientContextSink(nextSink : System.Runtime.Remoting.Messaging.IMessageSink): System.Runtime.Remoting.Messaging.IMessageSink
   
  var Locked : Boolean = false
   
  val IsReEntrant : Boolean = false
   
  def this() {}
   
  def this(reEntrant : Boolean) {}
   
  def this(flag : Int) {}
   
  def this(flag : Int, reEntrant : Boolean) {}
}
object SynchronizationAttribute {
  val NOT_SUPPORTED : Int  = 0
   
  val SUPPORTED : Int  = 0
   
  val REQUIRED : Int  = 0
   
  val REQUIRES_NEW : Int  = 0
}
 
}