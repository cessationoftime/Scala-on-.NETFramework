 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.Hosting {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ApplicationActivator extends AnyRef {
  def CreateInstance(activationContext : System.ActivationContext): System.Runtime.Remoting.ObjectHandle
   
  def CreateInstance(activationContext : System.ActivationContext, activationCustomData : Array[String]): System.Runtime.Remoting.ObjectHandle
   
  def this() {}
}
object ApplicationActivator {
  protected def CreateInstanceHelper(adSetup : System.AppDomainSetup): System.Runtime.Remoting.ObjectHandle  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ActivationArguments extends AnyRef {
  val ApplicationIdentity : System.ApplicationIdentity = null
   
  val ActivationContext : System.ActivationContext = null
   
  val ActivationData : Array[String] = Array.empty[String]
   
  def this(applicationIdentity : System.ApplicationIdentity) {}
   
  def this(applicationIdentity : System.ApplicationIdentity, activationData : Array[String]) {}
   
  def this(activationData : System.ActivationContext) {}
   
  def this(activationContext : System.ActivationContext, activationData : Array[String]) {}
}
 
}