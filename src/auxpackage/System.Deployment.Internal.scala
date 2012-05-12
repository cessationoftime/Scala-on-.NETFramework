 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Deployment.Internal {
 
@System.Runtime.InteropServices.ComVisibleAttribute(false)
abstract sealed class InternalApplicationIdentityHelper extends AnyRef 
object InternalApplicationIdentityHelper {
  def GetInternalAppId(id : System.ApplicationIdentity): AnyRef  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(false)
abstract sealed class InternalActivationContextHelper extends AnyRef 
object InternalActivationContextHelper {
  def GetActivationContextData(appInfo : System.ActivationContext): AnyRef  = null
   
  def GetApplicationComponentManifest(appInfo : System.ActivationContext): AnyRef  = null
   
  def GetDeploymentComponentManifest(appInfo : System.ActivationContext): AnyRef  = null
   
  def PrepareForExecution(appInfo : System.ActivationContext): Unit  = {}
   
  def IsFirstRun(appInfo : System.ActivationContext): Boolean  = false
   
  def GetApplicationManifestBytes(appInfo : System.ActivationContext): Array[UByte]  = Array.empty[UByte]
   
  def GetDeploymentManifestBytes(appInfo : System.ActivationContext): Array[UByte]  = Array.empty[UByte]
}
 
}