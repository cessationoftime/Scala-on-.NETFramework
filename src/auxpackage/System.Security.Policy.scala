 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Security.Policy {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IMembershipCondition extends System.Security.ISecurityEncodable with System.Security.ISecurityPolicyEncodable {
  /* abstract */ def Check(evidence : System.Security.Policy.Evidence): Boolean
   
  /* abstract */ def Copy: System.Security.Policy.IMembershipCondition
   
  /* abstract */ def ToString: String
   
  /* abstract */ def Equals(obj : AnyRef): Boolean
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AllMembershipCondition extends AnyRef with System.Security.Policy.IConstantMembershipCondition with 
                                            System.Security.Policy.IReportMatchMembershipCondition with 
                                            System.Security.Policy.IMembershipCondition with System.Security.ISecurityEncodable with 
                                            System.Security.ISecurityPolicyEncodable {
  def Check(evidence : System.Security.Policy.Evidence): Boolean
   
  def Copy: System.Security.Policy.IMembershipCondition
   
  def ToString: String
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement): Unit
   
  def ToXml(level : System.Security.Policy.PolicyLevel): System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement, level : System.Security.Policy.PolicyLevel): Unit
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ApplicationDirectory extends AnyRef with System.Security.Policy.IBuiltInEvidence {
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def Copy: AnyRef
   
  def ToString: String
   
  val Directory : String = ""
   
  def this(name : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ApplicationDirectoryMembershipCondition extends AnyRef with System.Security.Policy.IConstantMembershipCondition with 
                                                             System.Security.Policy.IReportMatchMembershipCondition with 
                                                             System.Security.Policy.IMembershipCondition with System.Security.ISecurityEncodable with 
                                                             System.Security.ISecurityPolicyEncodable {
  def Check(evidence : System.Security.Policy.Evidence): Boolean
   
  def Copy: System.Security.Policy.IMembershipCondition
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement): Unit
   
  def ToXml(level : System.Security.Policy.PolicyLevel): System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement, level : System.Security.Policy.PolicyLevel): Unit
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ApplicationSecurityInfo extends AnyRef {
  var ApplicationId : System.ApplicationId = null
   
  var DeploymentId : System.ApplicationId = null
   
  var DefaultRequestSet : System.Security.PermissionSet = null
   
  var ApplicationEvidence : System.Security.Policy.Evidence = null
   
  def this(activationContext : System.ActivationContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract sealed class ApplicationSecurityManager extends AnyRef 
object ApplicationSecurityManager {
  def DetermineApplicationTrust(activationContext : System.ActivationContext, 
                                context : System.Security.Policy.TrustManagerContext): Boolean  = false
   
  val UserApplicationTrusts : System.Security.Policy.ApplicationTrustCollection = null
   
  val ApplicationTrustManager : System.Security.Policy.IApplicationTrustManager = null
}
 
sealed abstract class ApplicationVersionMatch extends System.Enum {
  def ==(that: System.Security.Policy.ApplicationVersionMatch): Boolean = false
  def !=(that: System.Security.Policy.ApplicationVersionMatch): Boolean = false
  def  <(that: System.Security.Policy.ApplicationVersionMatch): Boolean = false
  def <=(that: System.Security.Policy.ApplicationVersionMatch): Boolean = false
  def  >(that: System.Security.Policy.ApplicationVersionMatch): Boolean = false
  def >=(that: System.Security.Policy.ApplicationVersionMatch): Boolean = false
  def  |(that: System.Security.Policy.ApplicationVersionMatch): Boolean = false
  def  &(that: System.Security.Policy.ApplicationVersionMatch): Boolean = false
  def  ^(that: System.Security.Policy.ApplicationVersionMatch): Boolean = false
}
object ApplicationVersionMatch{
  val MatchExactVersion	 = value(0)
  val MatchAllVersions	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Policy.ApplicationVersionMatch = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ApplicationTrust extends AnyRef with System.Security.ISecurityEncodable {
  def ToXml: System.Security.SecurityElement
   
  def FromXml(element : System.Security.SecurityElement): Unit
   
  var ApplicationIdentity : System.ApplicationIdentity = null
   
  var DefaultGrantSet : System.Security.Policy.PolicyStatement = null
   
  var IsApplicationTrustedToRun : Boolean = false
   
  var Persist : Boolean = false
   
  var ExtraInfo : AnyRef = null
   
  def this(applicationIdentity : System.ApplicationIdentity) {}
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Reflection.DefaultMemberAttribute("Item")
sealed class ApplicationTrustCollection extends AnyRef with System.Collections.ICollection with System.Collections.IEnumerable {
  def Add(trust : System.Security.Policy.ApplicationTrust): Int
   
  def AddRange(trusts : Array[System.Security.Policy.ApplicationTrust]): Unit
   
  def AddRange(trusts : System.Security.Policy.ApplicationTrustCollection): Unit
   
  def Find(applicationIdentity : System.ApplicationIdentity, 
           versionMatch : System.Security.Policy.ApplicationVersionMatch): System.Security.Policy.ApplicationTrustCollection
   
  def Remove(applicationIdentity : System.ApplicationIdentity, 
             versionMatch : System.Security.Policy.ApplicationVersionMatch): Unit
   
  def Remove(trust : System.Security.Policy.ApplicationTrust): Unit
   
  def RemoveRange(trusts : Array[System.Security.Policy.ApplicationTrust]): Unit
   
  def RemoveRange(trusts : System.Security.Policy.ApplicationTrustCollection): Unit
   
  def Clear: Unit
   
  def GetEnumerator: System.Security.Policy.ApplicationTrustEnumerator
   
  def CopyTo(array : Array[System.Security.Policy.ApplicationTrust], index : Int): Unit
   
  val Count : Int = 0
   
  /* parameterful property Item */
  def Item(index : Int): System.Security.Policy.ApplicationTrust
   
  /* parameterful property Item */
  def Item(appFullName : String): System.Security.Policy.ApplicationTrust
   
  val IsSynchronized : Boolean = false
   
  val SyncRoot : AnyRef = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ApplicationTrustEnumerator extends AnyRef with System.Collections.IEnumerator {
  def MoveNext: Boolean
   
  def Reset: Unit
   
  val Current : System.Security.Policy.ApplicationTrust = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class CodeGroup extends AnyRef {
  def AddChild(group : System.Security.Policy.CodeGroup): Unit
   
  def RemoveChild(group : System.Security.Policy.CodeGroup): Unit
   
  /* abstract */ def Resolve(evidence : System.Security.Policy.Evidence): System.Security.Policy.PolicyStatement
   
  /* abstract */ def ResolveMatchingCodeGroups(evidence : System.Security.Policy.Evidence): System.Security.Policy.CodeGroup
   
  /* abstract */ def Copy: System.Security.Policy.CodeGroup
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement): Unit
   
  def ToXml(level : System.Security.Policy.PolicyLevel): System.Security.SecurityElement
   
  protected def CreateXml(element : System.Security.SecurityElement, 
                          level : System.Security.Policy.PolicyLevel): Unit
   
  def FromXml(e : System.Security.SecurityElement, level : System.Security.Policy.PolicyLevel): Unit
   
  protected def ParseXml(e : System.Security.SecurityElement, level : System.Security.Policy.PolicyLevel): Unit
   
  def Equals(o : AnyRef): Boolean
   
  def Equals(cg : System.Security.Policy.CodeGroup, compareChildren : Boolean): Boolean
   
  def GetHashCode: Int
   
  var Children : System.Collections.IList = null
   
  var MembershipCondition : System.Security.Policy.IMembershipCondition = null
   
  var PolicyStatement : System.Security.Policy.PolicyStatement = null
   
  var Name : String = ""
   
  var Description : String = ""
   
  val PermissionSetName : String = ""
   
  val AttributeString : String = ""
   
  val MergeLogic : String = ""
   
  protected def this(membershipCondition : System.Security.Policy.IMembershipCondition, 
                     policy : System.Security.Policy.PolicyStatement) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Evidence extends AnyRef with System.Collections.ICollection with System.Collections.IEnumerable {
  def AddHost(id : AnyRef): Unit
   
  def AddAssembly(id : AnyRef): Unit
   
  def Merge(evidence : System.Security.Policy.Evidence): Unit
   
  def CopyTo(array : System.Array, index : Int): Unit
   
  def GetHostEnumerator: System.Collections.IEnumerator
   
  def GetAssemblyEnumerator: System.Collections.IEnumerator
   
  def GetEnumerator: System.Collections.IEnumerator
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Clear: Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def RemoveType(t : System.Type): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Equals(obj : AnyRef): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetHashCode: Int
   
  var Locked : Boolean = false
   
  val Count : Int = 0
   
  val SyncRoot : AnyRef = null
   
  val IsSynchronized : Boolean = false
   
  val IsReadOnly : Boolean = false
   
  def this() {}
   
  def this(evidence : System.Security.Policy.Evidence) {}
   
  def this(hostEvidence : Array[AnyRef], assemblyEvidence : Array[AnyRef]) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class FileCodeGroup extends System.Security.Policy.CodeGroup with System.Security.Policy.IUnionSemanticCodeGroup {
  def Resolve(evidence : System.Security.Policy.Evidence): System.Security.Policy.PolicyStatement
   
  def ResolveMatchingCodeGroups(evidence : System.Security.Policy.Evidence): System.Security.Policy.CodeGroup
   
  def Copy: System.Security.Policy.CodeGroup
   
  protected def CreateXml(element : System.Security.SecurityElement, 
                          level : System.Security.Policy.PolicyLevel): Unit
   
  protected def ParseXml(e : System.Security.SecurityElement, level : System.Security.Policy.PolicyLevel): Unit
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  val MergeLogic : String = ""
   
  val PermissionSetName : String = ""
   
  val AttributeString : String = ""
   
  def this(membershipCondition : System.Security.Policy.IMembershipCondition, 
           access : System.Security.Permissions.FileIOPermissionAccess) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class FirstMatchCodeGroup extends System.Security.Policy.CodeGroup {
  def Resolve(evidence : System.Security.Policy.Evidence): System.Security.Policy.PolicyStatement
   
  def ResolveMatchingCodeGroups(evidence : System.Security.Policy.Evidence): System.Security.Policy.CodeGroup
   
  def Copy: System.Security.Policy.CodeGroup
   
  val MergeLogic : String = ""
   
  def this(membershipCondition : System.Security.Policy.IMembershipCondition, 
           policy : System.Security.Policy.PolicyStatement) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IIdentityPermissionFactory {
  /* abstract */ def CreateIdentityPermission(evidence : System.Security.Policy.Evidence): System.Security.IPermission
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IApplicationTrustManager extends System.Security.ISecurityEncodable {
  /* abstract */ def DetermineApplicationTrust(activationContext : System.ActivationContext, 
                                               context : System.Security.Policy.TrustManagerContext): System.Security.Policy.ApplicationTrust
}
 
sealed abstract class TrustManagerUIContext extends System.Enum {
  def ==(that: System.Security.Policy.TrustManagerUIContext): Boolean = false
  def !=(that: System.Security.Policy.TrustManagerUIContext): Boolean = false
  def  <(that: System.Security.Policy.TrustManagerUIContext): Boolean = false
  def <=(that: System.Security.Policy.TrustManagerUIContext): Boolean = false
  def  >(that: System.Security.Policy.TrustManagerUIContext): Boolean = false
  def >=(that: System.Security.Policy.TrustManagerUIContext): Boolean = false
  def  |(that: System.Security.Policy.TrustManagerUIContext): Boolean = false
  def  &(that: System.Security.Policy.TrustManagerUIContext): Boolean = false
  def  ^(that: System.Security.Policy.TrustManagerUIContext): Boolean = false
}
object TrustManagerUIContext{
  val Install	 = value(0)
  val Upgrade	 = value(1)
  val Run	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Policy.TrustManagerUIContext = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class TrustManagerContext extends AnyRef {
  var UIContext : System.Security.Policy.TrustManagerUIContext = System.Security.Policy.TrustManagerUIContext.Install
   
  var NoPrompt : Boolean = false
   
  var IgnorePersistedDecision : Boolean = false
   
  var KeepAlive : Boolean = false
   
  var Persist : Boolean = false
   
  var PreviousApplicationIdentity : System.ApplicationIdentity = null
   
  def this() {}
   
  def this(uiContext : System.Security.Policy.TrustManagerUIContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class CodeConnectAccess extends AnyRef {
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  val Scheme : String = ""
   
  val Port : Int = 0
   
  def this(allowScheme : String, allowPort : Int) {}
}
object CodeConnectAccess {
  def CreateOriginSchemeAccess(allowPort : Int): System.Security.Policy.CodeConnectAccess  = null
   
  def CreateAnySchemeAccess(allowPort : Int): System.Security.Policy.CodeConnectAccess  = null
   
  val DefaultPort : Int  = 0
   
  val OriginPort : Int  = 0
   
  val OriginScheme : String  = ""
   
  val AnyScheme : String  = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class NetCodeGroup extends System.Security.Policy.CodeGroup with System.Security.Policy.IUnionSemanticCodeGroup {
  def ResetConnectAccess: Unit
   
  def AddConnectAccess(originScheme : String, connectAccess : System.Security.Policy.CodeConnectAccess): Unit
   
  def GetConnectAccessRules: Array[System.Collections.DictionaryEntry]
   
  def Resolve(evidence : System.Security.Policy.Evidence): System.Security.Policy.PolicyStatement
   
  def ResolveMatchingCodeGroups(evidence : System.Security.Policy.Evidence): System.Security.Policy.CodeGroup
   
  def Copy: System.Security.Policy.CodeGroup
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  protected def CreateXml(element : System.Security.SecurityElement, 
                          level : System.Security.Policy.PolicyLevel): Unit
   
  protected def ParseXml(e : System.Security.SecurityElement, level : System.Security.Policy.PolicyLevel): Unit
   
  val MergeLogic : String = ""
   
  val PermissionSetName : String = ""
   
  val AttributeString : String = ""
   
  def this(membershipCondition : System.Security.Policy.IMembershipCondition) {}
}
object NetCodeGroup {
  val AnyOtherOriginScheme : String  = ""
   
  val AbsentOriginScheme : String  = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class PermissionRequestEvidence extends AnyRef with System.Security.Policy.IBuiltInEvidence {
  def Copy: System.Security.Policy.PermissionRequestEvidence
   
  def ToString: String
   
  val RequestedPermissions : System.Security.PermissionSet = null
   
  val OptionalPermissions : System.Security.PermissionSet = null
   
  val DeniedPermissions : System.Security.PermissionSet = null
   
  def this(request : System.Security.PermissionSet, optional : System.Security.PermissionSet, 
           denied : System.Security.PermissionSet) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class PolicyException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, exception : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class PolicyLevel extends AnyRef {
  def ResolveMatchingCodeGroups(evidence : System.Security.Policy.Evidence): System.Security.Policy.CodeGroup
   
  @System.ObsoleteAttribute("Because all GAC assemblies always get full trust, the full trust list is no longer meaningful. You should install any assemblies that are used in security policy in the GAC to ensure they are trusted.")
  def AddFullTrustAssembly(sn : System.Security.Policy.StrongName): Unit
   
  @System.ObsoleteAttribute("Because all GAC assemblies always get full trust, the full trust list is no longer meaningful. You should install any assemblies that are used in security policy in the GAC to ensure they are trusted.")
  def AddFullTrustAssembly(snMC : System.Security.Policy.StrongNameMembershipCondition): Unit
   
  @System.ObsoleteAttribute("Because all GAC assemblies always get full trust, the full trust list is no longer meaningful. You should install any assemblies that are used in security policy in the GAC to ensure they are trusted.")
  def RemoveFullTrustAssembly(sn : System.Security.Policy.StrongName): Unit
   
  @System.ObsoleteAttribute("Because all GAC assemblies always get full trust, the full trust list is no longer meaningful. You should install any assemblies that are used in security policy in the GAC to ensure they are trusted.")
  def RemoveFullTrustAssembly(snMC : System.Security.Policy.StrongNameMembershipCondition): Unit
   
  def AddNamedPermissionSet(permSet : System.Security.NamedPermissionSet): Unit
   
  def RemoveNamedPermissionSet(permSet : System.Security.NamedPermissionSet): System.Security.NamedPermissionSet
   
  def RemoveNamedPermissionSet(name : String): System.Security.NamedPermissionSet
   
  def ChangeNamedPermissionSet(name : String, pSet : System.Security.PermissionSet): System.Security.NamedPermissionSet
   
  def GetNamedPermissionSet(name : String): System.Security.NamedPermissionSet
   
  def Recover: Unit
   
  def Reset: Unit
   
  def Resolve(evidence : System.Security.Policy.Evidence): System.Security.Policy.PolicyStatement
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement): Unit
   
  val Label : String = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val Type : System.Security.PolicyLevelType = System.Security.PolicyLevelType.User
   
  val StoreLocation : String = ""
   
  var RootCodeGroup : System.Security.Policy.CodeGroup = null
   
  val NamedPermissionSets : System.Collections.IList = null
   
  @System.ObsoleteAttribute("Because all GAC assemblies always get full trust, the full trust list is no longer meaningful. You should install any assemblies that are used in security policy in the GAC to ensure they are trusted.")
  val FullTrustAssemblies : System.Collections.IList = null
}
object PolicyLevel {
  def CreateAppDomainLevel: System.Security.Policy.PolicyLevel  = null
}
 
sealed abstract class PolicyStatementAttribute extends System.Enum {
  def ==(that: System.Security.Policy.PolicyStatementAttribute): Boolean = false
  def !=(that: System.Security.Policy.PolicyStatementAttribute): Boolean = false
  def  <(that: System.Security.Policy.PolicyStatementAttribute): Boolean = false
  def <=(that: System.Security.Policy.PolicyStatementAttribute): Boolean = false
  def  >(that: System.Security.Policy.PolicyStatementAttribute): Boolean = false
  def >=(that: System.Security.Policy.PolicyStatementAttribute): Boolean = false
  def  |(that: System.Security.Policy.PolicyStatementAttribute): Boolean = false
  def  &(that: System.Security.Policy.PolicyStatementAttribute): Boolean = false
  def  ^(that: System.Security.Policy.PolicyStatementAttribute): Boolean = false
}
object PolicyStatementAttribute{
  val Nothing	 = value(0)
  val Exclusive	 = value(1)
  val LevelFinal	 = value(2)
  val All	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Policy.PolicyStatementAttribute = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class PolicyStatement extends AnyRef with System.Security.ISecurityEncodable with System.Security.ISecurityPolicyEncodable {
  def Copy: System.Security.Policy.PolicyStatement
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(et : System.Security.SecurityElement): Unit
   
  def ToXml(level : System.Security.Policy.PolicyLevel): System.Security.SecurityElement
   
  def FromXml(et : System.Security.SecurityElement, level : System.Security.Policy.PolicyLevel): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Equals(obj : AnyRef): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetHashCode: Int
   
  var PermissionSet : System.Security.PermissionSet = null
   
  var Attributes : System.Security.Policy.PolicyStatementAttribute = System.Security.Policy.PolicyStatementAttribute.Nothing
   
  val AttributeString : String = ""
   
  def this(permSet : System.Security.PermissionSet) {}
   
  def this(permSet : System.Security.PermissionSet, 
           attributes : System.Security.Policy.PolicyStatementAttribute) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Site extends AnyRef with System.Security.Policy.IIdentityPermissionFactory with 
                          System.Security.Policy.IBuiltInEvidence {
  def CreateIdentityPermission(evidence : System.Security.Policy.Evidence): System.Security.IPermission
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def Copy: AnyRef
   
  def ToString: String
   
  val Name : String = ""
   
  def this(name : String) {}
}
object Site {
  def CreateFromUrl(url : String): System.Security.Policy.Site  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SiteMembershipCondition extends AnyRef with System.Security.Policy.IConstantMembershipCondition with 
                                             System.Security.Policy.IReportMatchMembershipCondition with 
                                             System.Security.Policy.IMembershipCondition with System.Security.ISecurityEncodable with 
                                             System.Security.ISecurityPolicyEncodable {
  def Check(evidence : System.Security.Policy.Evidence): Boolean
   
  def Copy: System.Security.Policy.IMembershipCondition
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement): Unit
   
  def ToXml(level : System.Security.Policy.PolicyLevel): System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement, level : System.Security.Policy.PolicyLevel): Unit
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  var Site : String = ""
   
  def this(site : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class StrongName extends AnyRef with System.Security.Policy.IIdentityPermissionFactory with 
                                System.Security.Policy.IBuiltInEvidence with 
                                System.Security.Policy.IDelayEvaluatedEvidence {
  def CreateIdentityPermission(evidence : System.Security.Policy.Evidence): System.Security.IPermission
   
  def Copy: AnyRef
   
  def ToString: String
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  val PublicKey : System.Security.Permissions.StrongNamePublicKeyBlob = null
   
  val Name : String = ""
   
  val Version : System.Version = null
   
  def this(blob : System.Security.Permissions.StrongNamePublicKeyBlob, name : String, 
           version : System.Version) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class StrongNameMembershipCondition extends AnyRef with System.Security.Policy.IConstantMembershipCondition with 
                                                   System.Security.Policy.IReportMatchMembershipCondition with 
                                                   System.Security.Policy.IMembershipCondition with System.Security.ISecurityEncodable with 
                                                   System.Security.ISecurityPolicyEncodable {
  def Check(evidence : System.Security.Policy.Evidence): Boolean
   
  def Copy: System.Security.Policy.IMembershipCondition
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement): Unit
   
  def ToXml(level : System.Security.Policy.PolicyLevel): System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement, level : System.Security.Policy.PolicyLevel): Unit
   
  def ToString: String
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  var PublicKey : System.Security.Permissions.StrongNamePublicKeyBlob = null
   
  var Name : String = ""
   
  var Version : System.Version = null
   
  def this(blob : System.Security.Permissions.StrongNamePublicKeyBlob, name : String, 
           version : System.Version) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class UnionCodeGroup extends System.Security.Policy.CodeGroup with System.Security.Policy.IUnionSemanticCodeGroup {
  def Resolve(evidence : System.Security.Policy.Evidence): System.Security.Policy.PolicyStatement
   
  def ResolveMatchingCodeGroups(evidence : System.Security.Policy.Evidence): System.Security.Policy.CodeGroup
   
  def Copy: System.Security.Policy.CodeGroup
   
  val MergeLogic : String = ""
   
  def this(membershipCondition : System.Security.Policy.IMembershipCondition, 
           policy : System.Security.Policy.PolicyStatement) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Url extends AnyRef with System.Security.Policy.IIdentityPermissionFactory with 
                         System.Security.Policy.IBuiltInEvidence {
  def CreateIdentityPermission(evidence : System.Security.Policy.Evidence): System.Security.IPermission
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def Copy: AnyRef
   
  def ToString: String
   
  val Value : String = ""
   
  def this(name : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class UrlMembershipCondition extends AnyRef with System.Security.Policy.IConstantMembershipCondition with 
                                            System.Security.Policy.IReportMatchMembershipCondition with 
                                            System.Security.Policy.IMembershipCondition with System.Security.ISecurityEncodable with 
                                            System.Security.ISecurityPolicyEncodable {
  def Check(evidence : System.Security.Policy.Evidence): Boolean
   
  def Copy: System.Security.Policy.IMembershipCondition
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement): Unit
   
  def ToXml(level : System.Security.Policy.PolicyLevel): System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement, level : System.Security.Policy.PolicyLevel): Unit
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  var Url : String = ""
   
  def this(url : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Zone extends AnyRef with System.Security.Policy.IIdentityPermissionFactory with 
                          System.Security.Policy.IBuiltInEvidence {
  def CreateIdentityPermission(evidence : System.Security.Policy.Evidence): System.Security.IPermission
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def Copy: AnyRef
   
  def ToString: String
   
  val SecurityZone : System.Security.SecurityZone = System.Security.SecurityZone.MyComputer
   
  def this(zone : System.Security.SecurityZone) {}
}
object Zone {
  def CreateFromUrl(url : String): System.Security.Policy.Zone  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ZoneMembershipCondition extends AnyRef with System.Security.Policy.IConstantMembershipCondition with 
                                             System.Security.Policy.IReportMatchMembershipCondition with 
                                             System.Security.Policy.IMembershipCondition with System.Security.ISecurityEncodable with 
                                             System.Security.ISecurityPolicyEncodable {
  def Check(evidence : System.Security.Policy.Evidence): Boolean
   
  def Copy: System.Security.Policy.IMembershipCondition
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement): Unit
   
  def ToXml(level : System.Security.Policy.PolicyLevel): System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement, level : System.Security.Policy.PolicyLevel): Unit
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  var SecurityZone : System.Security.SecurityZone = System.Security.SecurityZone.MyComputer
   
  def this(zone : System.Security.SecurityZone) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class GacInstalled extends AnyRef with System.Security.Policy.IIdentityPermissionFactory with 
                                  System.Security.Policy.IBuiltInEvidence {
  def CreateIdentityPermission(evidence : System.Security.Policy.Evidence): System.Security.IPermission
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def Copy: AnyRef
   
  def ToString: String
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class GacMembershipCondition extends AnyRef with System.Security.Policy.IConstantMembershipCondition with 
                                            System.Security.Policy.IReportMatchMembershipCondition with 
                                            System.Security.Policy.IMembershipCondition with System.Security.ISecurityEncodable with 
                                            System.Security.ISecurityPolicyEncodable {
  def Check(evidence : System.Security.Policy.Evidence): Boolean
   
  def Copy: System.Security.Policy.IMembershipCondition
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement): Unit
   
  def ToXml(level : System.Security.Policy.PolicyLevel): System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement, level : System.Security.Policy.PolicyLevel): Unit
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Hash extends AnyRef with System.Runtime.Serialization.ISerializable with 
                          System.Security.Policy.IBuiltInEvidence {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  def GenerateHash(hashAlg : System.Security.Cryptography.HashAlgorithm): Array[UByte]
   
  def ToString: String
   
  val SHA1 : Array[UByte] = Array.empty[UByte]
   
  val MD5 : Array[UByte] = Array.empty[UByte]
   
  def this(assembly : System.Reflection.Assembly) {}
}
object Hash {
  def CreateSHA1(sha1 : Array[UByte]): System.Security.Policy.Hash  = null
   
  def CreateMD5(md5 : Array[UByte]): System.Security.Policy.Hash  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class HashMembershipCondition extends AnyRef with System.Runtime.Serialization.ISerializable with 
                                             System.Runtime.Serialization.IDeserializationCallback with 
                                             System.Security.Policy.IReportMatchMembershipCondition with 
                                             System.Security.Policy.IMembershipCondition with System.Security.ISecurityEncodable with 
                                             System.Security.ISecurityPolicyEncodable {
  def Check(evidence : System.Security.Policy.Evidence): Boolean
   
  def Copy: System.Security.Policy.IMembershipCondition
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement): Unit
   
  def ToXml(level : System.Security.Policy.PolicyLevel): System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement, level : System.Security.Policy.PolicyLevel): Unit
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  var HashAlgorithm : System.Security.Cryptography.HashAlgorithm = null
   
  var HashValue : Array[UByte] = Array.empty[UByte]
   
  def this(hashAlg : System.Security.Cryptography.HashAlgorithm, value : Array[UByte]) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Publisher extends AnyRef with System.Security.Policy.IIdentityPermissionFactory with 
                               System.Security.Policy.IBuiltInEvidence {
  def CreateIdentityPermission(evidence : System.Security.Policy.Evidence): System.Security.IPermission
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def Copy: AnyRef
   
  def ToString: String
   
  val Certificate : System.Security.Cryptography.X509Certificates.X509Certificate = null
   
  def this(cert : System.Security.Cryptography.X509Certificates.X509Certificate) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class PublisherMembershipCondition extends AnyRef with System.Security.Policy.IConstantMembershipCondition with 
                                                  System.Security.Policy.IReportMatchMembershipCondition with 
                                                  System.Security.Policy.IMembershipCondition with System.Security.ISecurityEncodable with 
                                                  System.Security.ISecurityPolicyEncodable {
  def ToString: String
   
  def Check(evidence : System.Security.Policy.Evidence): Boolean
   
  def Copy: System.Security.Policy.IMembershipCondition
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement): Unit
   
  def ToXml(level : System.Security.Policy.PolicyLevel): System.Security.SecurityElement
   
  def FromXml(e : System.Security.SecurityElement, level : System.Security.Policy.PolicyLevel): Unit
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  var Certificate : System.Security.Cryptography.X509Certificates.X509Certificate = null
   
  def this(certificate : System.Security.Cryptography.X509Certificates.X509Certificate) {}
}
 
}