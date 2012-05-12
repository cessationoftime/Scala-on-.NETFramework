 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.Remoting.Services {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class EnterpriseServicesHelper extends AnyRef {
  def this() {}
}
object EnterpriseServicesHelper {
  def WrapIUnknownWithComObject(punk : System.IntPtr): AnyRef  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def CreateConstructionReturnMessage(ctorMsg : System.Runtime.Remoting.Activation.IConstructionCallMessage, 
                                      retObj : System.MarshalByRefObject): System.Runtime.Remoting.Activation.IConstructionReturnMessage  = null
   
  def SwitchWrappers(oldcp : System.Runtime.Remoting.Proxies.RealProxy, 
                     newcp : System.Runtime.Remoting.Proxies.RealProxy): Unit  = {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ITrackingHandler {
  /* abstract */ def MarshaledObject(obj : AnyRef, or : System.Runtime.Remoting.ObjRef): Unit
   
  /* abstract */ def UnmarshaledObject(obj : AnyRef, or : System.Runtime.Remoting.ObjRef): Unit
   
  /* abstract */ def DisconnectedObject(obj : AnyRef): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class TrackingServices extends AnyRef {
  def this() {}
}
object TrackingServices {
  def RegisterTrackingHandler(handler : System.Runtime.Remoting.Services.ITrackingHandler): Unit  = {}
   
  def UnregisterTrackingHandler(handler : System.Runtime.Remoting.Services.ITrackingHandler): Unit  = {}
   
  val RegisteredHandlers : Array[System.Runtime.Remoting.Services.ITrackingHandler] = Array.empty[System.Runtime.Remoting.Services.ITrackingHandler]
}
 
}