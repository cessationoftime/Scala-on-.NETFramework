 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Security.Principal {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IIdentity {
  val Name : String = ""
   
  val AuthenticationType : String = ""
   
  val IsAuthenticated : Boolean = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class GenericIdentity extends AnyRef with System.Security.Principal.IIdentity {
  val Name : String = ""
   
  val AuthenticationType : String = ""
   
  val IsAuthenticated : Boolean = false
   
  def this(name : String) {}
   
  def this(name : String, `type` : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IPrincipal {
  /* abstract */ def IsInRole(role : String): Boolean
   
  val Identity : System.Security.Principal.IIdentity = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class GenericPrincipal extends AnyRef with System.Security.Principal.IPrincipal {
  def IsInRole(role : String): Boolean
   
  val Identity : System.Security.Principal.IIdentity = null
   
  def this(identity : System.Security.Principal.IIdentity, roles : Array[String]) {}
}
 
sealed abstract class PrincipalPolicy extends System.Enum {
  def ==(that: System.Security.Principal.PrincipalPolicy): Boolean = false
  def !=(that: System.Security.Principal.PrincipalPolicy): Boolean = false
  def  <(that: System.Security.Principal.PrincipalPolicy): Boolean = false
  def <=(that: System.Security.Principal.PrincipalPolicy): Boolean = false
  def  >(that: System.Security.Principal.PrincipalPolicy): Boolean = false
  def >=(that: System.Security.Principal.PrincipalPolicy): Boolean = false
  def  |(that: System.Security.Principal.PrincipalPolicy): Boolean = false
  def  &(that: System.Security.Principal.PrincipalPolicy): Boolean = false
  def  ^(that: System.Security.Principal.PrincipalPolicy): Boolean = false
}
object PrincipalPolicy{
  val UnauthenticatedPrincipal	 = value(0)
  val NoPrincipal	 = value(1)
  val WindowsPrincipal	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Principal.PrincipalPolicy = null
}
 
sealed abstract class WindowsAccountType extends System.Enum {
  def ==(that: System.Security.Principal.WindowsAccountType): Boolean = false
  def !=(that: System.Security.Principal.WindowsAccountType): Boolean = false
  def  <(that: System.Security.Principal.WindowsAccountType): Boolean = false
  def <=(that: System.Security.Principal.WindowsAccountType): Boolean = false
  def  >(that: System.Security.Principal.WindowsAccountType): Boolean = false
  def >=(that: System.Security.Principal.WindowsAccountType): Boolean = false
  def  |(that: System.Security.Principal.WindowsAccountType): Boolean = false
  def  &(that: System.Security.Principal.WindowsAccountType): Boolean = false
  def  ^(that: System.Security.Principal.WindowsAccountType): Boolean = false
}
object WindowsAccountType{
  val Normal	 = value(0)
  val Guest	 = value(1)
  val System	 = value(2)
  val Anonymous	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Principal.WindowsAccountType = null
}
 
sealed abstract class TokenImpersonationLevel extends System.Enum {
  def ==(that: System.Security.Principal.TokenImpersonationLevel): Boolean = false
  def !=(that: System.Security.Principal.TokenImpersonationLevel): Boolean = false
  def  <(that: System.Security.Principal.TokenImpersonationLevel): Boolean = false
  def <=(that: System.Security.Principal.TokenImpersonationLevel): Boolean = false
  def  >(that: System.Security.Principal.TokenImpersonationLevel): Boolean = false
  def >=(that: System.Security.Principal.TokenImpersonationLevel): Boolean = false
  def  |(that: System.Security.Principal.TokenImpersonationLevel): Boolean = false
  def  &(that: System.Security.Principal.TokenImpersonationLevel): Boolean = false
  def  ^(that: System.Security.Principal.TokenImpersonationLevel): Boolean = false
}
object TokenImpersonationLevel{
  val None	 = value(0)
  val Anonymous	 = value(1)
  val Identification	 = value(2)
  val Impersonation	 = value(3)
  val Delegation	 = value(4)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Principal.TokenImpersonationLevel = null
}
 
sealed abstract class TokenAccessLevels extends System.Enum {
  def ==(that: System.Security.Principal.TokenAccessLevels): Boolean = false
  def !=(that: System.Security.Principal.TokenAccessLevels): Boolean = false
  def  <(that: System.Security.Principal.TokenAccessLevels): Boolean = false
  def <=(that: System.Security.Principal.TokenAccessLevels): Boolean = false
  def  >(that: System.Security.Principal.TokenAccessLevels): Boolean = false
  def >=(that: System.Security.Principal.TokenAccessLevels): Boolean = false
  def  |(that: System.Security.Principal.TokenAccessLevels): Boolean = false
  def  &(that: System.Security.Principal.TokenAccessLevels): Boolean = false
  def  ^(that: System.Security.Principal.TokenAccessLevels): Boolean = false
}
object TokenAccessLevels{
  val AssignPrimary	 = value(1)
  val Duplicate	 = value(2)
  val Impersonate	 = value(4)
  val Query	 = value(8)
  val QuerySource	 = value(16)
  val AdjustPrivileges	 = value(32)
  val AdjustGroups	 = value(64)
  val AdjustDefault	 = value(128)
  val AdjustSessionId	 = value(256)
  val Read	 = value(131080)
  val Write	 = value(131296)
  val AllAccess	 = value(983551)
  val MaximumAllowed	 = value(33554432)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Principal.TokenAccessLevels = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class WindowsIdentity extends AnyRef with System.Security.Principal.IIdentity with 
                              System.Runtime.Serialization.ISerializable with 
                              System.Runtime.Serialization.IDeserializationCallback with System.IDisposable {
  def Impersonate: System.Security.Principal.WindowsImpersonationContext
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  protected def Dispose(disposing : Boolean): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Dispose: Unit
   
  val AuthenticationType : String = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val ImpersonationLevel : System.Security.Principal.TokenImpersonationLevel = System.Security.Principal.TokenImpersonationLevel.None
   
  val IsAuthenticated : Boolean = false
   
  val IsGuest : Boolean = false
   
  val IsSystem : Boolean = false
   
  val IsAnonymous : Boolean = false
   
  val Name : String = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val Owner : System.Security.Principal.SecurityIdentifier = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val User : System.Security.Principal.SecurityIdentifier = null
   
  val Groups : System.Security.Principal.IdentityReferenceCollection = null
   
  val Token : System.IntPtr = new System.IntPtr()
   
  def this(userToken : System.IntPtr) {}
   
  def this(userToken : System.IntPtr, `type` : String) {}
   
  def this(userToken : System.IntPtr, `type` : String, 
           acctType : System.Security.Principal.WindowsAccountType) {}
   
  def this(userToken : System.IntPtr, `type` : String, 
           acctType : System.Security.Principal.WindowsAccountType, isAuthenticated : Boolean) {}
   
  def this(sUserPrincipalName : String) {}
   
  def this(sUserPrincipalName : String, `type` : String) {}
   
  def this(info : System.Runtime.Serialization.SerializationInfo, 
           context : System.Runtime.Serialization.StreamingContext) {}
}
object WindowsIdentity {
  def GetCurrent: System.Security.Principal.WindowsIdentity  = null
   
  def GetCurrent(ifImpersonating : Boolean): System.Security.Principal.WindowsIdentity  = null
   
  def GetCurrent(desiredAccess : System.Security.Principal.TokenAccessLevels): System.Security.Principal.WindowsIdentity  = null
   
  def GetAnonymous: System.Security.Principal.WindowsIdentity  = null
   
  def Impersonate(userToken : System.IntPtr): System.Security.Principal.WindowsImpersonationContext  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class WindowsImpersonationContext extends AnyRef with System.IDisposable {
  def Undo: Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  protected def Dispose(disposing : Boolean): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Dispose: Unit
}
 
sealed abstract class WindowsBuiltInRole extends System.Enum {
  def ==(that: System.Security.Principal.WindowsBuiltInRole): Boolean = false
  def !=(that: System.Security.Principal.WindowsBuiltInRole): Boolean = false
  def  <(that: System.Security.Principal.WindowsBuiltInRole): Boolean = false
  def <=(that: System.Security.Principal.WindowsBuiltInRole): Boolean = false
  def  >(that: System.Security.Principal.WindowsBuiltInRole): Boolean = false
  def >=(that: System.Security.Principal.WindowsBuiltInRole): Boolean = false
  def  |(that: System.Security.Principal.WindowsBuiltInRole): Boolean = false
  def  &(that: System.Security.Principal.WindowsBuiltInRole): Boolean = false
  def  ^(that: System.Security.Principal.WindowsBuiltInRole): Boolean = false
}
object WindowsBuiltInRole{
  val Administrator	 = value(544)
  val User	 = value(545)
  val Guest	 = value(546)
  val PowerUser	 = value(547)
  val AccountOperator	 = value(548)
  val SystemOperator	 = value(549)
  val PrintOperator	 = value(550)
  val BackupOperator	 = value(551)
  val Replicator	 = value(552)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Principal.WindowsBuiltInRole = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class WindowsPrincipal extends AnyRef with System.Security.Principal.IPrincipal {
  def IsInRole(role : String): Boolean
   
  def IsInRole(role : System.Security.Principal.WindowsBuiltInRole): Boolean
   
  def IsInRole(rid : Int): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def IsInRole(sid : System.Security.Principal.SecurityIdentifier): Boolean
   
  val Identity : System.Security.Principal.IIdentity = null
   
  def this(ntIdentity : System.Security.Principal.WindowsIdentity) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(false)
abstract class IdentityReference extends AnyRef {
  /* abstract */ def IsValidTargetType(targetType : System.Type): Boolean
   
  /* abstract */ def Translate(targetType : System.Type): System.Security.Principal.IdentityReference
   
  /* abstract */ def Equals(o : AnyRef): Boolean
   
  /* abstract */ def GetHashCode: Int
   
  /* abstract */ def ToString: String
   
  val Value : String = ""
}
object IdentityReference {
  def ==(left : System.Security.Principal.IdentityReference, 
         right : System.Security.Principal.IdentityReference): Boolean  = false
   
  def !=(left : System.Security.Principal.IdentityReference, 
         right : System.Security.Principal.IdentityReference): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(false)
@System.Reflection.DefaultMemberAttribute("Item")
class IdentityReferenceCollection extends AnyRef with 
                                          System.Collections.Generic.ICollection[System.Security.Principal.IdentityReference] with 
                                          System.Collections.Generic.IEnumerable[System.Security.Principal.IdentityReference] with 
                                          System.Collections.IEnumerable {
  def CopyTo(array : Array[System.Security.Principal.IdentityReference], offset : Int): Unit
   
  def Add(identity : System.Security.Principal.IdentityReference): Unit
   
  def Remove(identity : System.Security.Principal.IdentityReference): Boolean
   
  def Clear: Unit
   
  def Contains(identity : System.Security.Principal.IdentityReference): Boolean
   
  def GetEnumerator: System.Collections.Generic.IEnumerator[System.Security.Principal.IdentityReference]
   
  def Translate(targetType : System.Type): System.Security.Principal.IdentityReferenceCollection
   
  def Translate(targetType : System.Type, forceSuccess : Boolean): System.Security.Principal.IdentityReferenceCollection
   
  val Count : Int = 0
   
  val IsReadOnly : Boolean = false
   
  /* parameterful property Item */
  def Item_=(index : Int, value : System.Security.Principal.IdentityReference): Unit
  def Item(index : Int): System.Security.Principal.IdentityReference
   
  def this() {}
   
  def this(capacity : Int) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(false)
sealed class NTAccount extends System.Security.Principal.IdentityReference {
  def IsValidTargetType(targetType : System.Type): Boolean
   
  def Translate(targetType : System.Type): System.Security.Principal.IdentityReference
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  val Value : String = ""
   
  def this(domainName : String, accountName : String) {}
   
  def this(name : String) {}
}
object NTAccount {
  def ==(left : System.Security.Principal.NTAccount, 
         right : System.Security.Principal.NTAccount): Boolean  = false
   
  def !=(left : System.Security.Principal.NTAccount, 
         right : System.Security.Principal.NTAccount): Boolean  = false
}
 
sealed abstract class WellKnownSidType extends System.Enum {
  def ==(that: System.Security.Principal.WellKnownSidType): Boolean = false
  def !=(that: System.Security.Principal.WellKnownSidType): Boolean = false
  def  <(that: System.Security.Principal.WellKnownSidType): Boolean = false
  def <=(that: System.Security.Principal.WellKnownSidType): Boolean = false
  def  >(that: System.Security.Principal.WellKnownSidType): Boolean = false
  def >=(that: System.Security.Principal.WellKnownSidType): Boolean = false
  def  |(that: System.Security.Principal.WellKnownSidType): Boolean = false
  def  &(that: System.Security.Principal.WellKnownSidType): Boolean = false
  def  ^(that: System.Security.Principal.WellKnownSidType): Boolean = false
}
object WellKnownSidType{
  val NullSid	 = value(0)
  val WorldSid	 = value(1)
  val LocalSid	 = value(2)
  val CreatorOwnerSid	 = value(3)
  val CreatorGroupSid	 = value(4)
  val CreatorOwnerServerSid	 = value(5)
  val CreatorGroupServerSid	 = value(6)
  val NTAuthoritySid	 = value(7)
  val DialupSid	 = value(8)
  val NetworkSid	 = value(9)
  val BatchSid	 = value(10)
  val InteractiveSid	 = value(11)
  val ServiceSid	 = value(12)
  val AnonymousSid	 = value(13)
  val ProxySid	 = value(14)
  val EnterpriseControllersSid	 = value(15)
  val SelfSid	 = value(16)
  val AuthenticatedUserSid	 = value(17)
  val RestrictedCodeSid	 = value(18)
  val TerminalServerSid	 = value(19)
  val RemoteLogonIdSid	 = value(20)
  val LogonIdsSid	 = value(21)
  val LocalSystemSid	 = value(22)
  val LocalServiceSid	 = value(23)
  val NetworkServiceSid	 = value(24)
  val BuiltinDomainSid	 = value(25)
  val BuiltinAdministratorsSid	 = value(26)
  val BuiltinUsersSid	 = value(27)
  val BuiltinGuestsSid	 = value(28)
  val BuiltinPowerUsersSid	 = value(29)
  val BuiltinAccountOperatorsSid	 = value(30)
  val BuiltinSystemOperatorsSid	 = value(31)
  val BuiltinPrintOperatorsSid	 = value(32)
  val BuiltinBackupOperatorsSid	 = value(33)
  val BuiltinReplicatorSid	 = value(34)
  val BuiltinPreWindows2000CompatibleAccessSid	 = value(35)
  val BuiltinRemoteDesktopUsersSid	 = value(36)
  val BuiltinNetworkConfigurationOperatorsSid	 = value(37)
  val AccountAdministratorSid	 = value(38)
  val AccountGuestSid	 = value(39)
  val AccountKrbtgtSid	 = value(40)
  val AccountDomainAdminsSid	 = value(41)
  val AccountDomainUsersSid	 = value(42)
  val AccountDomainGuestsSid	 = value(43)
  val AccountComputersSid	 = value(44)
  val AccountControllersSid	 = value(45)
  val AccountCertAdminsSid	 = value(46)
  val AccountSchemaAdminsSid	 = value(47)
  val AccountEnterpriseAdminsSid	 = value(48)
  val AccountPolicyAdminsSid	 = value(49)
  val AccountRasAndIasServersSid	 = value(50)
  val NtlmAuthenticationSid	 = value(51)
  val DigestAuthenticationSid	 = value(52)
  val SChannelAuthenticationSid	 = value(53)
  val ThisOrganizationSid	 = value(54)
  val OtherOrganizationSid	 = value(55)
  val BuiltinIncomingForestTrustBuildersSid	 = value(56)
  val BuiltinPerformanceMonitoringUsersSid	 = value(57)
  val BuiltinPerformanceLoggingUsersSid	 = value(58)
  val BuiltinAuthorizationAccessSid	 = value(59)
  val WinBuiltinTerminalServerLicenseServersSid	 = value(60)
  val MaxDefined	 = value(60)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Principal.WellKnownSidType = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(false)
sealed class SecurityIdentifier extends System.Security.Principal.IdentityReference with 
                                        System.IComparable[System.Security.Principal.SecurityIdentifier] {
  def Equals(o : AnyRef): Boolean
   
  def Equals(sid : System.Security.Principal.SecurityIdentifier): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def IsValidTargetType(targetType : System.Type): Boolean
   
  def IsAccountSid: Boolean
   
  def Translate(targetType : System.Type): System.Security.Principal.IdentityReference
   
  def CompareTo(sid : System.Security.Principal.SecurityIdentifier): Int
   
  def IsWellKnown(`type` : System.Security.Principal.WellKnownSidType): Boolean
   
  def GetBinaryForm(binaryForm : Array[UByte], offset : Int): Unit
   
  def IsEqualDomainSid(sid : System.Security.Principal.SecurityIdentifier): Boolean
   
  val BinaryLength : Int = 0
   
  val AccountDomainSid : System.Security.Principal.SecurityIdentifier = null
   
  val Value : String = ""
   
  def this(sddlForm : String) {}
   
  def this(binaryForm : Array[UByte], offset : Int) {}
   
  def this(binaryForm : System.IntPtr) {}
   
  def this(sidType : System.Security.Principal.WellKnownSidType, 
           domainSid : System.Security.Principal.SecurityIdentifier) {}
}
object SecurityIdentifier {
  def ==(left : System.Security.Principal.SecurityIdentifier, 
         right : System.Security.Principal.SecurityIdentifier): Boolean  = false
   
  def !=(left : System.Security.Principal.SecurityIdentifier, 
         right : System.Security.Principal.SecurityIdentifier): Boolean  = false
   
  val MinBinaryLength : Int  = 0
   
  val MaxBinaryLength : Int  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(false)
sealed class IdentityNotMappedException extends System.SystemException {
  def GetObjectData(serializationInfo : System.Runtime.Serialization.SerializationInfo, 
                    streamingContext : System.Runtime.Serialization.StreamingContext): Unit
   
  val UnmappedIdentities : System.Security.Principal.IdentityReferenceCollection = null
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
}
 
}