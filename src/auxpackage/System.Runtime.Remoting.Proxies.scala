 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.Remoting.Proxies {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(4 /* AllowMultiple = false, Inherited = true */ )
class ProxyAttribute extends System.Attribute with System.Runtime.Remoting.Contexts.IContextAttribute {
  def CreateInstance(serverType : System.Type): System.MarshalByRefObject
   
  def CreateProxy(objRef : System.Runtime.Remoting.ObjRef, serverType : System.Type, 
                  serverObject : AnyRef, serverContext : System.Runtime.Remoting.Contexts.Context): System.Runtime.Remoting.Proxies.RealProxy
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def IsContextOK(ctx : System.Runtime.Remoting.Contexts.Context, 
                  msg : System.Runtime.Remoting.Activation.IConstructionCallMessage): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetPropertiesForNewContext(msg : System.Runtime.Remoting.Activation.IConstructionCallMessage): Unit
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class RealProxy extends AnyRef {
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def InitializeServerObject(ctorMsg : System.Runtime.Remoting.Activation.IConstructionCallMessage): System.Runtime.Remoting.Activation.IConstructionReturnMessage
   
  protected def GetUnwrappedServer: System.MarshalByRefObject
   
  protected def DetachServer: System.MarshalByRefObject
   
  protected def AttachServer(s : System.MarshalByRefObject): Unit
   
  def GetProxiedType: System.Type
   
  /* abstract */ def Invoke(msg : System.Runtime.Remoting.Messaging.IMessage): System.Runtime.Remoting.Messaging.IMessage
   
  def CreateObjRef(requestedType : System.Type): System.Runtime.Remoting.ObjRef
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  def GetCOMIUnknown(fIsMarshalled : Boolean): System.IntPtr
   
  def SetCOMIUnknown(i : System.IntPtr): Unit
   
  def SupportsInterface(iid : CLRByRef[System.Guid]): System.IntPtr
   
  def GetTransparentProxy: AnyRef
   
  protected def this(classToProxy : System.Type) {}
   
  protected def this(classToProxy : System.Type, stub : System.IntPtr, stubData : AnyRef) {}
   
  protected def this() {}
}
object RealProxy {
  def SetStubData(rp : System.Runtime.Remoting.Proxies.RealProxy, stubData : AnyRef): Unit  = {}
   
  def GetStubData(rp : System.Runtime.Remoting.Proxies.RealProxy): AnyRef  = null
}
 
}