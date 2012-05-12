 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.Remoting.Activation {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IActivator {
  /* abstract */ def Activate(msg : System.Runtime.Remoting.Activation.IConstructionCallMessage): System.Runtime.Remoting.Activation.IConstructionReturnMessage
   
  var NextActivator : System.Runtime.Remoting.Activation.IActivator = null
   
  val Level : System.Runtime.Remoting.Activation.ActivatorLevel = System.Runtime.Remoting.Activation.ActivatorLevel.Construction
}
 
sealed abstract class ActivatorLevel extends System.Enum {
  def ==(that: System.Runtime.Remoting.Activation.ActivatorLevel): Boolean = false
  def !=(that: System.Runtime.Remoting.Activation.ActivatorLevel): Boolean = false
  def  <(that: System.Runtime.Remoting.Activation.ActivatorLevel): Boolean = false
  def <=(that: System.Runtime.Remoting.Activation.ActivatorLevel): Boolean = false
  def  >(that: System.Runtime.Remoting.Activation.ActivatorLevel): Boolean = false
  def >=(that: System.Runtime.Remoting.Activation.ActivatorLevel): Boolean = false
  def  |(that: System.Runtime.Remoting.Activation.ActivatorLevel): Boolean = false
  def  &(that: System.Runtime.Remoting.Activation.ActivatorLevel): Boolean = false
  def  ^(that: System.Runtime.Remoting.Activation.ActivatorLevel): Boolean = false
}
object ActivatorLevel{
  val Construction	 = value(4)
  val Context	 = value(8)
  val AppDomain	 = value(12)
  val Process	 = value(16)
  val Machine	 = value(20)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.Remoting.Activation.ActivatorLevel = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IConstructionCallMessage extends System.Runtime.Remoting.Messaging.IMethodCallMessage with 
                                       System.Runtime.Remoting.Messaging.IMethodMessage with 
                                       System.Runtime.Remoting.Messaging.IMessage {
  var Activator : System.Runtime.Remoting.Activation.IActivator = null
   
  val CallSiteActivationAttributes : Array[AnyRef] = Array.empty[AnyRef]
   
  val ActivationTypeName : String = ""
   
  val ActivationType : System.Type = null
   
  val ContextProperties : System.Collections.IList = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IConstructionReturnMessage extends System.Runtime.Remoting.Messaging.IMethodReturnMessage with 
                                         System.Runtime.Remoting.Messaging.IMethodMessage with 
                                         System.Runtime.Remoting.Messaging.IMessage 
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class UrlAttribute extends System.Runtime.Remoting.Contexts.ContextAttribute {
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def IsContextOK(ctx : System.Runtime.Remoting.Contexts.Context, 
                  msg : System.Runtime.Remoting.Activation.IConstructionCallMessage): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetPropertiesForNewContext(ctorMsg : System.Runtime.Remoting.Activation.IConstructionCallMessage): Unit
   
  val UrlValue : String = ""
   
  def this(callsiteURL : String) {}
}
 
}