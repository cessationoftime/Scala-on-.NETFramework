 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Security.Permissions {
 
sealed abstract class EnvironmentPermissionAccess extends System.Enum {
  def ==(that: System.Security.Permissions.EnvironmentPermissionAccess): Boolean = false
  def !=(that: System.Security.Permissions.EnvironmentPermissionAccess): Boolean = false
  def  <(that: System.Security.Permissions.EnvironmentPermissionAccess): Boolean = false
  def <=(that: System.Security.Permissions.EnvironmentPermissionAccess): Boolean = false
  def  >(that: System.Security.Permissions.EnvironmentPermissionAccess): Boolean = false
  def >=(that: System.Security.Permissions.EnvironmentPermissionAccess): Boolean = false
  def  |(that: System.Security.Permissions.EnvironmentPermissionAccess): Boolean = false
  def  &(that: System.Security.Permissions.EnvironmentPermissionAccess): Boolean = false
  def  ^(that: System.Security.Permissions.EnvironmentPermissionAccess): Boolean = false
}
object EnvironmentPermissionAccess{
  val NoAccess	 = value(0)
  val Read	 = value(1)
  val Write	 = value(2)
  val AllAccess	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Permissions.EnvironmentPermissionAccess = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IUnrestrictedPermission {
  /* abstract */ def IsUnrestricted: Boolean
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class EnvironmentPermission extends System.Security.CodeAccessPermission with 
                                           System.Security.Permissions.IUnrestrictedPermission with 
                                           System.Security.Permissions.IBuiltInPermission {
  def SetPathList(flag : System.Security.Permissions.EnvironmentPermissionAccess, pathList : String): Unit
   
  def AddPathList(flag : System.Security.Permissions.EnvironmentPermissionAccess, pathList : String): Unit
   
  def GetPathList(flag : System.Security.Permissions.EnvironmentPermissionAccess): String
   
  def IsUnrestricted: Boolean
   
  def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  def Union(other : System.Security.IPermission): System.Security.IPermission
   
  def Copy: System.Security.IPermission
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(esd : System.Security.SecurityElement): Unit
   
  def this(state : System.Security.Permissions.PermissionState) {}
   
  def this(flag : System.Security.Permissions.EnvironmentPermissionAccess, pathList : String) {}
}
 
sealed abstract class FileDialogPermissionAccess extends System.Enum {
  def ==(that: System.Security.Permissions.FileDialogPermissionAccess): Boolean = false
  def !=(that: System.Security.Permissions.FileDialogPermissionAccess): Boolean = false
  def  <(that: System.Security.Permissions.FileDialogPermissionAccess): Boolean = false
  def <=(that: System.Security.Permissions.FileDialogPermissionAccess): Boolean = false
  def  >(that: System.Security.Permissions.FileDialogPermissionAccess): Boolean = false
  def >=(that: System.Security.Permissions.FileDialogPermissionAccess): Boolean = false
  def  |(that: System.Security.Permissions.FileDialogPermissionAccess): Boolean = false
  def  &(that: System.Security.Permissions.FileDialogPermissionAccess): Boolean = false
  def  ^(that: System.Security.Permissions.FileDialogPermissionAccess): Boolean = false
}
object FileDialogPermissionAccess{
  val None	 = value(0)
  val Open	 = value(1)
  val Save	 = value(2)
  val OpenSave	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Permissions.FileDialogPermissionAccess = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class FileDialogPermission extends System.Security.CodeAccessPermission with 
                                          System.Security.Permissions.IUnrestrictedPermission with 
                                          System.Security.Permissions.IBuiltInPermission {
  def Copy: System.Security.IPermission
   
  def FromXml(esd : System.Security.SecurityElement): Unit
   
  def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  def IsUnrestricted: Boolean
   
  def ToXml: System.Security.SecurityElement
   
  def Union(target : System.Security.IPermission): System.Security.IPermission
   
  var Access : System.Security.Permissions.FileDialogPermissionAccess = System.Security.Permissions.FileDialogPermissionAccess.None
   
  def this(state : System.Security.Permissions.PermissionState) {}
   
  def this(access : System.Security.Permissions.FileDialogPermissionAccess) {}
}
 
sealed abstract class FileIOPermissionAccess extends System.Enum {
  def ==(that: System.Security.Permissions.FileIOPermissionAccess): Boolean = false
  def !=(that: System.Security.Permissions.FileIOPermissionAccess): Boolean = false
  def  <(that: System.Security.Permissions.FileIOPermissionAccess): Boolean = false
  def <=(that: System.Security.Permissions.FileIOPermissionAccess): Boolean = false
  def  >(that: System.Security.Permissions.FileIOPermissionAccess): Boolean = false
  def >=(that: System.Security.Permissions.FileIOPermissionAccess): Boolean = false
  def  |(that: System.Security.Permissions.FileIOPermissionAccess): Boolean = false
  def  &(that: System.Security.Permissions.FileIOPermissionAccess): Boolean = false
  def  ^(that: System.Security.Permissions.FileIOPermissionAccess): Boolean = false
}
object FileIOPermissionAccess{
  val NoAccess	 = value(0)
  val Read	 = value(1)
  val Write	 = value(2)
  val Append	 = value(4)
  val PathDiscovery	 = value(8)
  val AllAccess	 = value(15)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Permissions.FileIOPermissionAccess = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class FileIOPermission extends System.Security.CodeAccessPermission with 
                                      System.Security.Permissions.IUnrestrictedPermission with 
                                      System.Security.Permissions.IBuiltInPermission {
  def SetPathList(access : System.Security.Permissions.FileIOPermissionAccess, path : String): Unit
   
  def SetPathList(access : System.Security.Permissions.FileIOPermissionAccess, 
                  pathList : Array[String]): Unit
   
  def AddPathList(access : System.Security.Permissions.FileIOPermissionAccess, path : String): Unit
   
  def AddPathList(access : System.Security.Permissions.FileIOPermissionAccess, 
                  pathList : Array[String]): Unit
   
  def GetPathList(access : System.Security.Permissions.FileIOPermissionAccess): Array[String]
   
  def IsUnrestricted: Boolean
   
  def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  def Union(other : System.Security.IPermission): System.Security.IPermission
   
  def Copy: System.Security.IPermission
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(esd : System.Security.SecurityElement): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Equals(obj : AnyRef): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetHashCode: Int
   
  var AllLocalFiles : System.Security.Permissions.FileIOPermissionAccess = System.Security.Permissions.FileIOPermissionAccess.NoAccess
   
  var AllFiles : System.Security.Permissions.FileIOPermissionAccess = System.Security.Permissions.FileIOPermissionAccess.NoAccess
   
  def this(state : System.Security.Permissions.PermissionState) {}
   
  def this(access : System.Security.Permissions.FileIOPermissionAccess, path : String) {}
   
  def this(access : System.Security.Permissions.FileIOPermissionAccess, 
           pathList : Array[String]) {}
   
  def this(access : System.Security.Permissions.FileIOPermissionAccess, 
           control : System.Security.AccessControl.AccessControlActions, path : String) {}
   
  def this(access : System.Security.Permissions.FileIOPermissionAccess, 
           control : System.Security.AccessControl.AccessControlActions, 
           pathList : Array[String]) {}
}
 
sealed abstract class HostProtectionResource extends System.Enum {
  def ==(that: System.Security.Permissions.HostProtectionResource): Boolean = false
  def !=(that: System.Security.Permissions.HostProtectionResource): Boolean = false
  def  <(that: System.Security.Permissions.HostProtectionResource): Boolean = false
  def <=(that: System.Security.Permissions.HostProtectionResource): Boolean = false
  def  >(that: System.Security.Permissions.HostProtectionResource): Boolean = false
  def >=(that: System.Security.Permissions.HostProtectionResource): Boolean = false
  def  |(that: System.Security.Permissions.HostProtectionResource): Boolean = false
  def  &(that: System.Security.Permissions.HostProtectionResource): Boolean = false
  def  ^(that: System.Security.Permissions.HostProtectionResource): Boolean = false
}
object HostProtectionResource{
  val None	 = value(0)
  val Synchronization	 = value(1)
  val SharedState	 = value(2)
  val ExternalProcessMgmt	 = value(4)
  val SelfAffectingProcessMgmt	 = value(8)
  val ExternalThreading	 = value(16)
  val SelfAffectingThreading	 = value(32)
  val SecurityInfrastructure	 = value(64)
  val UI	 = value(128)
  val MayLeakOnAbort	 = value(256)
  val All	 = value(511)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Permissions.HostProtectionResource = null
}
 
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class SecurityAttribute extends System.Attribute {
  /* abstract */ def CreatePermission: System.Security.IPermission
   
  var Action : System.Security.Permissions.SecurityAction = System.Security.Permissions.SecurityAction.Demand
   
  var Unrestricted : Boolean = false
   
  protected def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class CodeAccessSecurityAttribute extends System.Security.Permissions.SecurityAttribute {
  protected def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.AttributeUsageAttribute(4205 /* AllowMultiple = true, Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class HostProtectionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  var Resources : System.Security.Permissions.HostProtectionResource = System.Security.Permissions.HostProtectionResource.None
   
  var Synchronization : Boolean = false
   
  var SharedState : Boolean = false
   
  var ExternalProcessMgmt : Boolean = false
   
  var SelfAffectingProcessMgmt : Boolean = false
   
  var ExternalThreading : Boolean = false
   
  var SelfAffectingThreading : Boolean = false
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  var SecurityInfrastructure : Boolean = false
   
  var UI : Boolean = false
   
  var MayLeakOnAbort : Boolean = false
   
  def this() {}
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
sealed abstract class IsolatedStorageContainment extends System.Enum {
  def ==(that: System.Security.Permissions.IsolatedStorageContainment): Boolean = false
  def !=(that: System.Security.Permissions.IsolatedStorageContainment): Boolean = false
  def  <(that: System.Security.Permissions.IsolatedStorageContainment): Boolean = false
  def <=(that: System.Security.Permissions.IsolatedStorageContainment): Boolean = false
  def  >(that: System.Security.Permissions.IsolatedStorageContainment): Boolean = false
  def >=(that: System.Security.Permissions.IsolatedStorageContainment): Boolean = false
  def  |(that: System.Security.Permissions.IsolatedStorageContainment): Boolean = false
  def  &(that: System.Security.Permissions.IsolatedStorageContainment): Boolean = false
  def  ^(that: System.Security.Permissions.IsolatedStorageContainment): Boolean = false
}
object IsolatedStorageContainment{
  val None	 = value(0)
  val DomainIsolationByUser	 = value(16)
  val ApplicationIsolationByUser	 = value(21)
  val AssemblyIsolationByUser	 = value(32)
  val DomainIsolationByMachine	 = value(48)
  val AssemblyIsolationByMachine	 = value(64)
  val ApplicationIsolationByMachine	 = value(69)
  val DomainIsolationByRoamingUser	 = value(80)
  val AssemblyIsolationByRoamingUser	 = value(96)
  val ApplicationIsolationByRoamingUser	 = value(101)
  val AdministerIsolatedStorageByUser	 = value(112)
  val UnrestrictedIsolatedStorage	 = value(240)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Permissions.IsolatedStorageContainment = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class IsolatedStoragePermission extends System.Security.CodeAccessPermission with 
                                                 System.Security.Permissions.IUnrestrictedPermission {
  def IsUnrestricted: Boolean
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(esd : System.Security.SecurityElement): Unit
   
  var UserQuota : Long = 0
   
  var UsageAllowed : System.Security.Permissions.IsolatedStorageContainment = System.Security.Permissions.IsolatedStorageContainment.None
   
  protected def this(state : System.Security.Permissions.PermissionState) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class IsolatedStorageFilePermission extends System.Security.Permissions.IsolatedStoragePermission with 
                                                   System.Security.Permissions.IBuiltInPermission {
  def Union(target : System.Security.IPermission): System.Security.IPermission
   
  def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  def Copy: System.Security.IPermission
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def ToXml: System.Security.SecurityElement
   
  def this(state : System.Security.Permissions.PermissionState) {}
}
 
sealed abstract class PermissionState extends System.Enum {
  def ==(that: System.Security.Permissions.PermissionState): Boolean = false
  def !=(that: System.Security.Permissions.PermissionState): Boolean = false
  def  <(that: System.Security.Permissions.PermissionState): Boolean = false
  def <=(that: System.Security.Permissions.PermissionState): Boolean = false
  def  >(that: System.Security.Permissions.PermissionState): Boolean = false
  def >=(that: System.Security.Permissions.PermissionState): Boolean = false
  def  |(that: System.Security.Permissions.PermissionState): Boolean = false
  def  &(that: System.Security.Permissions.PermissionState): Boolean = false
  def  ^(that: System.Security.Permissions.PermissionState): Boolean = false
}
object PermissionState{
  val Unrestricted	 = value(1)
  val None	 = value(0)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Permissions.PermissionState = null
}
 
sealed abstract class SecurityAction extends System.Enum {
  def ==(that: System.Security.Permissions.SecurityAction): Boolean = false
  def !=(that: System.Security.Permissions.SecurityAction): Boolean = false
  def  <(that: System.Security.Permissions.SecurityAction): Boolean = false
  def <=(that: System.Security.Permissions.SecurityAction): Boolean = false
  def  >(that: System.Security.Permissions.SecurityAction): Boolean = false
  def >=(that: System.Security.Permissions.SecurityAction): Boolean = false
  def  |(that: System.Security.Permissions.SecurityAction): Boolean = false
  def  &(that: System.Security.Permissions.SecurityAction): Boolean = false
  def  ^(that: System.Security.Permissions.SecurityAction): Boolean = false
}
object SecurityAction{
  val Demand	 = value(2)
  val Assert	 = value(3)
  val Deny	 = value(4)
  val PermitOnly	 = value(5)
  val LinkDemand	 = value(6)
  val InheritanceDemand	 = value(7)
  val RequestMinimum	 = value(8)
  val RequestOptional	 = value(9)
  val RequestRefuse	 = value(10)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Permissions.SecurityAction = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
sealed class EnvironmentPermissionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  var Read : String = ""
   
  var Write : String = ""
   
  var All : String = ""
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class FileDialogPermissionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  var Open : Boolean = false
   
  var Save : Boolean = false
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
sealed class FileIOPermissionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  var Read : String = ""
   
  var Write : String = ""
   
  var Append : String = ""
   
  var PathDiscovery : String = ""
   
  var ViewAccessControl : String = ""
   
  var ChangeAccessControl : String = ""
   
  @System.ObsoleteAttribute("Please use the ViewAndModify property instead.")
  var All : String = ""
   
  var ViewAndModify : String = ""
   
  var AllFiles : System.Security.Permissions.FileIOPermissionAccess = System.Security.Permissions.FileIOPermissionAccess.NoAccess
   
  var AllLocalFiles : System.Security.Permissions.FileIOPermissionAccess = System.Security.Permissions.FileIOPermissionAccess.NoAccess
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class KeyContainerPermissionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  var KeyStore : String = ""
   
  var ProviderName : String = ""
   
  var ProviderType : Int = 0
   
  var KeyContainerName : String = ""
   
  var KeySpec : Int = 0
   
  var Flags : System.Security.Permissions.KeyContainerPermissionFlags = System.Security.Permissions.KeyContainerPermissionFlags.NoFlags
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.AttributeUsageAttribute(68 /* AllowMultiple = true, Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class PrincipalPermissionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  var Name : String = ""
   
  var Role : String = ""
   
  var Authenticated : Boolean = false
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
sealed class ReflectionPermissionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  var Flags : System.Security.Permissions.ReflectionPermissionFlag = System.Security.Permissions.ReflectionPermissionFlag.NoFlags
   
  @System.ObsoleteAttribute("This API has been deprecated. http://go.microsoft.com/fwlink/?linkid=14202")
  var TypeInformation : Boolean = false
   
  var MemberAccess : Boolean = false
   
  var ReflectionEmit : Boolean = false
   
  var RestrictedMemberAccess : Boolean = false
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
sealed class RegistryPermissionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  var Read : String = ""
   
  var Write : String = ""
   
  var Create : String = ""
   
  var ViewAccessControl : String = ""
   
  var ChangeAccessControl : String = ""
   
  var ViewAndModify : String = ""
   
  @System.ObsoleteAttribute("Please use the ViewAndModify property instead.")
  var All : String = ""
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SecurityPermissionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  var Flags : System.Security.Permissions.SecurityPermissionFlag = System.Security.Permissions.SecurityPermissionFlag.NoFlags
   
  var Assertion : Boolean = false
   
  var UnmanagedCode : Boolean = false
   
  var SkipVerification : Boolean = false
   
  var Execution : Boolean = false
   
  var ControlThread : Boolean = false
   
  var ControlEvidence : Boolean = false
   
  var ControlPolicy : Boolean = false
   
  var SerializationFormatter : Boolean = false
   
  var ControlDomainPolicy : Boolean = false
   
  var ControlPrincipal : Boolean = false
   
  var ControlAppDomain : Boolean = false
   
  var RemotingConfiguration : Boolean = false
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  var Infrastructure : Boolean = false
   
  var BindingRedirects : Boolean = false
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class UIPermissionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  var Window : System.Security.Permissions.UIPermissionWindow = System.Security.Permissions.UIPermissionWindow.NoWindows
   
  var Clipboard : System.Security.Permissions.UIPermissionClipboard = System.Security.Permissions.UIPermissionClipboard.NoClipboard
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ZoneIdentityPermissionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  var Zone : System.Security.SecurityZone = System.Security.SecurityZone.MyComputer
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
sealed class StrongNameIdentityPermissionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  var Name : String = ""
   
  var Version : String = ""
   
  var PublicKey : String = ""
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SiteIdentityPermissionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  var Site : String = ""
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class UrlIdentityPermissionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  var Url : String = ""
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class PublisherIdentityPermissionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  var X509Certificate : String = ""
   
  var CertFile : String = ""
   
  var SignedFile : String = ""
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
abstract class IsolatedStoragePermissionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  var UserQuota : Long = 0
   
  var UsageAllowed : System.Security.Permissions.IsolatedStorageContainment = System.Security.Permissions.IsolatedStorageContainment.None
   
  protected def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class IsolatedStorageFilePermissionAttribute extends System.Security.Permissions.IsolatedStoragePermissionAttribute {
  def CreatePermission: System.Security.IPermission
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
sealed class PermissionSetAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  def CreatePermissionSet: System.Security.PermissionSet
   
  var File : String = ""
   
  var UnicodeEncoded : Boolean = false
   
  var Name : String = ""
   
  var XML : String = ""
   
  var Hex : String = ""
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
sealed abstract class ReflectionPermissionFlag extends System.Enum {
  def ==(that: System.Security.Permissions.ReflectionPermissionFlag): Boolean = false
  def !=(that: System.Security.Permissions.ReflectionPermissionFlag): Boolean = false
  def  <(that: System.Security.Permissions.ReflectionPermissionFlag): Boolean = false
  def <=(that: System.Security.Permissions.ReflectionPermissionFlag): Boolean = false
  def  >(that: System.Security.Permissions.ReflectionPermissionFlag): Boolean = false
  def >=(that: System.Security.Permissions.ReflectionPermissionFlag): Boolean = false
  def  |(that: System.Security.Permissions.ReflectionPermissionFlag): Boolean = false
  def  &(that: System.Security.Permissions.ReflectionPermissionFlag): Boolean = false
  def  ^(that: System.Security.Permissions.ReflectionPermissionFlag): Boolean = false
}
object ReflectionPermissionFlag{
  val NoFlags	 = value(0)
  val TypeInformation	 = value(1)
  val MemberAccess	 = value(2)
  val ReflectionEmit	 = value(4)
  val RestrictedMemberAccess	 = value(8)
  val AllFlags	 = value(7)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Permissions.ReflectionPermissionFlag = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ReflectionPermission extends System.Security.CodeAccessPermission with 
                                          System.Security.Permissions.IUnrestrictedPermission with 
                                          System.Security.Permissions.IBuiltInPermission {
  def IsUnrestricted: Boolean
   
  def Union(other : System.Security.IPermission): System.Security.IPermission
   
  def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  def Copy: System.Security.IPermission
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(esd : System.Security.SecurityElement): Unit
   
  var Flags : System.Security.Permissions.ReflectionPermissionFlag = System.Security.Permissions.ReflectionPermissionFlag.NoFlags
   
  def this(state : System.Security.Permissions.PermissionState) {}
   
  def this(flag : System.Security.Permissions.ReflectionPermissionFlag) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class PrincipalPermission extends AnyRef with System.Security.IPermission with 
                                         System.Security.Permissions.IUnrestrictedPermission with 
                                         System.Security.ISecurityEncodable with System.Security.Permissions.IBuiltInPermission {
  def IsUnrestricted: Boolean
   
  def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  def Union(other : System.Security.IPermission): System.Security.IPermission
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Equals(obj : AnyRef): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetHashCode: Int
   
  def Copy: System.Security.IPermission
   
  def Demand: Unit
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(elem : System.Security.SecurityElement): Unit
   
  def ToString: String
   
  def this(state : System.Security.Permissions.PermissionState) {}
   
  def this(name : String, role : String) {}
   
  def this(name : String, role : String, isAuthenticated : Boolean) {}
}
 
sealed abstract class SecurityPermissionFlag extends System.Enum {
  def ==(that: System.Security.Permissions.SecurityPermissionFlag): Boolean = false
  def !=(that: System.Security.Permissions.SecurityPermissionFlag): Boolean = false
  def  <(that: System.Security.Permissions.SecurityPermissionFlag): Boolean = false
  def <=(that: System.Security.Permissions.SecurityPermissionFlag): Boolean = false
  def  >(that: System.Security.Permissions.SecurityPermissionFlag): Boolean = false
  def >=(that: System.Security.Permissions.SecurityPermissionFlag): Boolean = false
  def  |(that: System.Security.Permissions.SecurityPermissionFlag): Boolean = false
  def  &(that: System.Security.Permissions.SecurityPermissionFlag): Boolean = false
  def  ^(that: System.Security.Permissions.SecurityPermissionFlag): Boolean = false
}
object SecurityPermissionFlag{
  val NoFlags	 = value(0)
  val Assertion	 = value(1)
  val UnmanagedCode	 = value(2)
  val SkipVerification	 = value(4)
  val Execution	 = value(8)
  val ControlThread	 = value(16)
  val ControlEvidence	 = value(32)
  val ControlPolicy	 = value(64)
  val SerializationFormatter	 = value(128)
  val ControlDomainPolicy	 = value(256)
  val ControlPrincipal	 = value(512)
  val ControlAppDomain	 = value(1024)
  val RemotingConfiguration	 = value(2048)
  val Infrastructure	 = value(4096)
  val BindingRedirects	 = value(8192)
  val AllFlags	 = value(16383)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Permissions.SecurityPermissionFlag = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SecurityPermission extends System.Security.CodeAccessPermission with 
                                        System.Security.Permissions.IUnrestrictedPermission with 
                                        System.Security.Permissions.IBuiltInPermission {
  def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  def Union(target : System.Security.IPermission): System.Security.IPermission
   
  def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  def Copy: System.Security.IPermission
   
  def IsUnrestricted: Boolean
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(esd : System.Security.SecurityElement): Unit
   
  var Flags : System.Security.Permissions.SecurityPermissionFlag = System.Security.Permissions.SecurityPermissionFlag.NoFlags
   
  def this(state : System.Security.Permissions.PermissionState) {}
   
  def this(flag : System.Security.Permissions.SecurityPermissionFlag) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SiteIdentityPermission extends System.Security.CodeAccessPermission with 
                                            System.Security.Permissions.IBuiltInPermission {
  def Copy: System.Security.IPermission
   
  def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  def Union(target : System.Security.IPermission): System.Security.IPermission
   
  def FromXml(esd : System.Security.SecurityElement): Unit
   
  def ToXml: System.Security.SecurityElement
   
  var Site : String = ""
   
  def this(state : System.Security.Permissions.PermissionState) {}
   
  def this(site : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class StrongNameIdentityPermission extends System.Security.CodeAccessPermission with 
                                                  System.Security.Permissions.IBuiltInPermission {
  def Copy: System.Security.IPermission
   
  def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  def Union(target : System.Security.IPermission): System.Security.IPermission
   
  def FromXml(e : System.Security.SecurityElement): Unit
   
  def ToXml: System.Security.SecurityElement
   
  var PublicKey : System.Security.Permissions.StrongNamePublicKeyBlob = null
   
  var Name : String = ""
   
  var Version : System.Version = null
   
  def this(state : System.Security.Permissions.PermissionState) {}
   
  def this(blob : System.Security.Permissions.StrongNamePublicKeyBlob, name : String, 
           version : System.Version) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class StrongNamePublicKeyBlob extends AnyRef {
  def Equals(obj : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def this(publicKey : Array[UByte]) {}
}
 
sealed abstract class UIPermissionWindow extends System.Enum {
  def ==(that: System.Security.Permissions.UIPermissionWindow): Boolean = false
  def !=(that: System.Security.Permissions.UIPermissionWindow): Boolean = false
  def  <(that: System.Security.Permissions.UIPermissionWindow): Boolean = false
  def <=(that: System.Security.Permissions.UIPermissionWindow): Boolean = false
  def  >(that: System.Security.Permissions.UIPermissionWindow): Boolean = false
  def >=(that: System.Security.Permissions.UIPermissionWindow): Boolean = false
  def  |(that: System.Security.Permissions.UIPermissionWindow): Boolean = false
  def  &(that: System.Security.Permissions.UIPermissionWindow): Boolean = false
  def  ^(that: System.Security.Permissions.UIPermissionWindow): Boolean = false
}
object UIPermissionWindow{
  val NoWindows	 = value(0)
  val SafeSubWindows	 = value(1)
  val SafeTopLevelWindows	 = value(2)
  val AllWindows	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Permissions.UIPermissionWindow = null
}
 
sealed abstract class UIPermissionClipboard extends System.Enum {
  def ==(that: System.Security.Permissions.UIPermissionClipboard): Boolean = false
  def !=(that: System.Security.Permissions.UIPermissionClipboard): Boolean = false
  def  <(that: System.Security.Permissions.UIPermissionClipboard): Boolean = false
  def <=(that: System.Security.Permissions.UIPermissionClipboard): Boolean = false
  def  >(that: System.Security.Permissions.UIPermissionClipboard): Boolean = false
  def >=(that: System.Security.Permissions.UIPermissionClipboard): Boolean = false
  def  |(that: System.Security.Permissions.UIPermissionClipboard): Boolean = false
  def  &(that: System.Security.Permissions.UIPermissionClipboard): Boolean = false
  def  ^(that: System.Security.Permissions.UIPermissionClipboard): Boolean = false
}
object UIPermissionClipboard{
  val NoClipboard	 = value(0)
  val OwnClipboard	 = value(1)
  val AllClipboard	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Permissions.UIPermissionClipboard = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class UIPermission extends System.Security.CodeAccessPermission with 
                                  System.Security.Permissions.IUnrestrictedPermission with 
                                  System.Security.Permissions.IBuiltInPermission {
  def IsUnrestricted: Boolean
   
  def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  def Union(target : System.Security.IPermission): System.Security.IPermission
   
  def Copy: System.Security.IPermission
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(esd : System.Security.SecurityElement): Unit
   
  var Window : System.Security.Permissions.UIPermissionWindow = System.Security.Permissions.UIPermissionWindow.NoWindows
   
  var Clipboard : System.Security.Permissions.UIPermissionClipboard = System.Security.Permissions.UIPermissionClipboard.NoClipboard
   
  def this(state : System.Security.Permissions.PermissionState) {}
   
  def this(windowFlag : System.Security.Permissions.UIPermissionWindow, 
           clipboardFlag : System.Security.Permissions.UIPermissionClipboard) {}
   
  def this(windowFlag : System.Security.Permissions.UIPermissionWindow) {}
   
  def this(clipboardFlag : System.Security.Permissions.UIPermissionClipboard) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class UrlIdentityPermission extends System.Security.CodeAccessPermission with 
                                           System.Security.Permissions.IBuiltInPermission {
  def Copy: System.Security.IPermission
   
  def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  def Union(target : System.Security.IPermission): System.Security.IPermission
   
  def FromXml(esd : System.Security.SecurityElement): Unit
   
  def ToXml: System.Security.SecurityElement
   
  var Url : String = ""
   
  def this(state : System.Security.Permissions.PermissionState) {}
   
  def this(site : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ZoneIdentityPermission extends System.Security.CodeAccessPermission with 
                                            System.Security.Permissions.IBuiltInPermission {
  def Copy: System.Security.IPermission
   
  def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  def Union(target : System.Security.IPermission): System.Security.IPermission
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(esd : System.Security.SecurityElement): Unit
   
  var SecurityZone : System.Security.SecurityZone = System.Security.SecurityZone.MyComputer
   
  def this(state : System.Security.Permissions.PermissionState) {}
   
  def this(zone : System.Security.SecurityZone) {}
}
 
@System.AttributeUsageAttribute(109 /* AllowMultiple = true, Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class GacIdentityPermissionAttribute extends System.Security.Permissions.CodeAccessSecurityAttribute {
  def CreatePermission: System.Security.IPermission
   
  def this(action : System.Security.Permissions.SecurityAction) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class GacIdentityPermission extends System.Security.CodeAccessPermission with 
                                           System.Security.Permissions.IBuiltInPermission {
  def Copy: System.Security.IPermission
   
  def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  def Union(target : System.Security.IPermission): System.Security.IPermission
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(securityElement : System.Security.SecurityElement): Unit
   
  def this(state : System.Security.Permissions.PermissionState) {}
   
  def this() {}
}
 
sealed abstract class KeyContainerPermissionFlags extends System.Enum {
  def ==(that: System.Security.Permissions.KeyContainerPermissionFlags): Boolean = false
  def !=(that: System.Security.Permissions.KeyContainerPermissionFlags): Boolean = false
  def  <(that: System.Security.Permissions.KeyContainerPermissionFlags): Boolean = false
  def <=(that: System.Security.Permissions.KeyContainerPermissionFlags): Boolean = false
  def  >(that: System.Security.Permissions.KeyContainerPermissionFlags): Boolean = false
  def >=(that: System.Security.Permissions.KeyContainerPermissionFlags): Boolean = false
  def  |(that: System.Security.Permissions.KeyContainerPermissionFlags): Boolean = false
  def  &(that: System.Security.Permissions.KeyContainerPermissionFlags): Boolean = false
  def  ^(that: System.Security.Permissions.KeyContainerPermissionFlags): Boolean = false
}
object KeyContainerPermissionFlags{
  val NoFlags	 = value(0)
  val Create	 = value(1)
  val Open	 = value(2)
  val Delete	 = value(4)
  val Import	 = value(16)
  val Export	 = value(32)
  val Sign	 = value(256)
  val Decrypt	 = value(512)
  val ViewAcl	 = value(4096)
  val ChangeAcl	 = value(8192)
  val AllFlags	 = value(13111)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Permissions.KeyContainerPermissionFlags = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class KeyContainerPermissionAccessEntry extends AnyRef {
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  var KeyStore : String = ""
   
  var ProviderName : String = ""
   
  var ProviderType : Int = 0
   
  var KeyContainerName : String = ""
   
  var KeySpec : Int = 0
   
  var Flags : System.Security.Permissions.KeyContainerPermissionFlags = System.Security.Permissions.KeyContainerPermissionFlags.NoFlags
   
  def this(keyContainerName : String, 
           flags : System.Security.Permissions.KeyContainerPermissionFlags) {}
   
  def this(parameters : System.Security.Cryptography.CspParameters, 
           flags : System.Security.Permissions.KeyContainerPermissionFlags) {}
   
  def this(keyStore : String, providerName : String, providerType : Int, 
           keyContainerName : String, keySpec : Int, 
           flags : System.Security.Permissions.KeyContainerPermissionFlags) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Reflection.DefaultMemberAttribute("Item")
sealed class KeyContainerPermissionAccessEntryCollection extends AnyRef with System.Collections.ICollection with System.Collections.IEnumerable {
  def Add(accessEntry : System.Security.Permissions.KeyContainerPermissionAccessEntry): Int
   
  def Clear: Unit
   
  def IndexOf(accessEntry : System.Security.Permissions.KeyContainerPermissionAccessEntry): Int
   
  def Remove(accessEntry : System.Security.Permissions.KeyContainerPermissionAccessEntry): Unit
   
  def GetEnumerator: System.Security.Permissions.KeyContainerPermissionAccessEntryEnumerator
   
  def CopyTo(array : Array[System.Security.Permissions.KeyContainerPermissionAccessEntry], 
             index : Int): Unit
   
  /* parameterful property Item */
  def Item(index : Int): System.Security.Permissions.KeyContainerPermissionAccessEntry
   
  val Count : Int = 0
   
  val IsSynchronized : Boolean = false
   
  val SyncRoot : AnyRef = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class KeyContainerPermissionAccessEntryEnumerator extends AnyRef with System.Collections.IEnumerator {
  def MoveNext: Boolean
   
  def Reset: Unit
   
  val Current : System.Security.Permissions.KeyContainerPermissionAccessEntry = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class KeyContainerPermission extends System.Security.CodeAccessPermission with 
                                            System.Security.Permissions.IUnrestrictedPermission with 
                                            System.Security.Permissions.IBuiltInPermission {
  def IsUnrestricted: Boolean
   
  def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  def Union(target : System.Security.IPermission): System.Security.IPermission
   
  def Copy: System.Security.IPermission
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(securityElement : System.Security.SecurityElement): Unit
   
  val Flags : System.Security.Permissions.KeyContainerPermissionFlags = System.Security.Permissions.KeyContainerPermissionFlags.NoFlags
   
  val AccessEntries : System.Security.Permissions.KeyContainerPermissionAccessEntryCollection = null
   
  def this(state : System.Security.Permissions.PermissionState) {}
   
  def this(flags : System.Security.Permissions.KeyContainerPermissionFlags) {}
   
  def this(flags : System.Security.Permissions.KeyContainerPermissionFlags, 
           accessList : Array[System.Security.Permissions.KeyContainerPermissionAccessEntry]) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class PublisherIdentityPermission extends System.Security.CodeAccessPermission with 
                                                 System.Security.Permissions.IBuiltInPermission {
  def Copy: System.Security.IPermission
   
  def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  def Union(target : System.Security.IPermission): System.Security.IPermission
   
  def FromXml(esd : System.Security.SecurityElement): Unit
   
  def ToXml: System.Security.SecurityElement
   
  var Certificate : System.Security.Cryptography.X509Certificates.X509Certificate = null
   
  def this(state : System.Security.Permissions.PermissionState) {}
   
  def this(certificate : System.Security.Cryptography.X509Certificates.X509Certificate) {}
}
 
sealed abstract class RegistryPermissionAccess extends System.Enum {
  def ==(that: System.Security.Permissions.RegistryPermissionAccess): Boolean = false
  def !=(that: System.Security.Permissions.RegistryPermissionAccess): Boolean = false
  def  <(that: System.Security.Permissions.RegistryPermissionAccess): Boolean = false
  def <=(that: System.Security.Permissions.RegistryPermissionAccess): Boolean = false
  def  >(that: System.Security.Permissions.RegistryPermissionAccess): Boolean = false
  def >=(that: System.Security.Permissions.RegistryPermissionAccess): Boolean = false
  def  |(that: System.Security.Permissions.RegistryPermissionAccess): Boolean = false
  def  &(that: System.Security.Permissions.RegistryPermissionAccess): Boolean = false
  def  ^(that: System.Security.Permissions.RegistryPermissionAccess): Boolean = false
}
object RegistryPermissionAccess{
  val NoAccess	 = value(0)
  val Read	 = value(1)
  val Write	 = value(2)
  val Create	 = value(4)
  val AllAccess	 = value(7)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Permissions.RegistryPermissionAccess = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class RegistryPermission extends System.Security.CodeAccessPermission with 
                                        System.Security.Permissions.IUnrestrictedPermission with 
                                        System.Security.Permissions.IBuiltInPermission {
  def SetPathList(access : System.Security.Permissions.RegistryPermissionAccess, pathList : String): Unit
   
  def AddPathList(access : System.Security.Permissions.RegistryPermissionAccess, pathList : String): Unit
   
  def AddPathList(access : System.Security.Permissions.RegistryPermissionAccess, 
                  control : System.Security.AccessControl.AccessControlActions, pathList : String): Unit
   
  def GetPathList(access : System.Security.Permissions.RegistryPermissionAccess): String
   
  def IsUnrestricted: Boolean
   
  def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  def Union(other : System.Security.IPermission): System.Security.IPermission
   
  def Copy: System.Security.IPermission
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(esd : System.Security.SecurityElement): Unit
   
  def this(state : System.Security.Permissions.PermissionState) {}
   
  def this(access : System.Security.Permissions.RegistryPermissionAccess, pathList : String) {}
   
  def this(access : System.Security.Permissions.RegistryPermissionAccess, 
           control : System.Security.AccessControl.AccessControlActions, pathList : String) {}
}
 
}