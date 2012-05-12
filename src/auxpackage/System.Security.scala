 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Security {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IEvidenceFactory {
  val Evidence : System.Security.Policy.Evidence = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISecurityEncodable {
  /* abstract */ def ToXml: System.Security.SecurityElement
   
  /* abstract */ def FromXml(e : System.Security.SecurityElement): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISecurityPolicyEncodable {
  /* abstract */ def ToXml(level : System.Security.Policy.PolicyLevel): System.Security.SecurityElement
   
  /* abstract */ def FromXml(e : System.Security.SecurityElement, level : System.Security.Policy.PolicyLevel): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SecurityElement extends AnyRef with System.Security.ISecurityElementFactory {
  def AddAttribute(name : String, value : String): Unit
   
  def AddChild(child : System.Security.SecurityElement): Unit
   
  def Equal(other : System.Security.SecurityElement): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Copy: System.Security.SecurityElement
   
  def ToString: String
   
  def Attribute(name : String): String
   
  def SearchForChildByTag(tag : String): System.Security.SecurityElement
   
  def SearchForTextOfTag(tag : String): String
   
  var Tag : String = ""
   
  var Attributes : System.Collections.Hashtable = null
   
  var Text : String = ""
   
  var Children : System.Collections.ArrayList = null
   
  def this(tag : String) {}
   
  def this(tag : String, text : String) {}
}
object SecurityElement {
  def FromString(xml : String): System.Security.SecurityElement  = null
   
  def IsValidTag(tag : String): Boolean  = false
   
  def IsValidText(text : String): Boolean  = false
   
  def IsValidAttributeName(name : String): Boolean  = false
   
  def IsValidAttributeValue(value : String): Boolean  = false
   
  def Escape(str : String): String  = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class XmlSyntaxException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  def this(lineNumber : Int) {}
   
  def this(lineNumber : Int, message : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IPermission extends System.Security.ISecurityEncodable {
  /* abstract */ def Copy: System.Security.IPermission
   
  /* abstract */ def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  /* abstract */ def Union(target : System.Security.IPermission): System.Security.IPermission
   
  /* abstract */ def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  /* abstract */ def Demand: Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IStackWalk {
  /* abstract */ def Assert: Unit
   
  /* abstract */ def Demand: Unit
   
  /* abstract */ def Deny: Unit
   
  /* abstract */ def PermitOnly: Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class CodeAccessPermission extends AnyRef with System.Security.IPermission with System.Security.ISecurityEncodable with 
                                            System.Security.IStackWalk {
  def Demand: Unit
   
  def Assert: Unit
   
  def Deny: Unit
   
  def PermitOnly: Unit
   
  def Union(other : System.Security.IPermission): System.Security.IPermission
   
  /* abstract */ def ToXml: System.Security.SecurityElement
   
  /* abstract */ def FromXml(elem : System.Security.SecurityElement): Unit
   
  def ToString: String
   
  /* abstract */ def Copy: System.Security.IPermission
   
  /* abstract */ def Intersect(target : System.Security.IPermission): System.Security.IPermission
   
  /* abstract */ def IsSubsetOf(target : System.Security.IPermission): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Equals(obj : AnyRef): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetHashCode: Int
   
  protected def this() {}
}
object CodeAccessPermission {
  def RevertAssert: Unit  = {}
   
  def RevertDeny: Unit  = {}
   
  def RevertPermitOnly: Unit  = {}
   
  def RevertAll: Unit  = {}
}
 
@System.AttributeUsageAttribute(5188 /* AllowMultiple = true, Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SuppressUnmanagedCodeSecurityAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(2 /* AllowMultiple = true, Inherited = false */ )
sealed class UnverifiableCodeAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1 /* AllowMultiple = false, Inherited = false */ )
sealed class AllowPartiallyTrustedCallersAttribute extends System.Attribute {
  def this() {}
}
 
sealed abstract class SecurityCriticalScope extends System.Enum {
  def ==(that: System.Security.SecurityCriticalScope): Boolean = false
  def !=(that: System.Security.SecurityCriticalScope): Boolean = false
  def  <(that: System.Security.SecurityCriticalScope): Boolean = false
  def <=(that: System.Security.SecurityCriticalScope): Boolean = false
  def  >(that: System.Security.SecurityCriticalScope): Boolean = false
  def >=(that: System.Security.SecurityCriticalScope): Boolean = false
  def  |(that: System.Security.SecurityCriticalScope): Boolean = false
  def  &(that: System.Security.SecurityCriticalScope): Boolean = false
  def  ^(that: System.Security.SecurityCriticalScope): Boolean = false
}
object SecurityCriticalScope{
  val Explicit	 = value(0)
  val Everything	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.SecurityCriticalScope = null
}
 
@System.AttributeUsageAttribute(6143 /* AllowMultiple = false, Inherited = false */ )
sealed class SecurityCriticalAttribute extends System.Attribute {
  val Scope : System.Security.SecurityCriticalScope = System.Security.SecurityCriticalScope.Explicit
   
  def this() {}
   
  def this(scope : System.Security.SecurityCriticalScope) {}
}
 
@System.AttributeUsageAttribute(32767 /* AllowMultiple = false, Inherited = false */ )
sealed class SecurityTreatAsSafeAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(32767 /* AllowMultiple = false, Inherited = false */ )
sealed class SecuritySafeCriticalAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(1 /* AllowMultiple = false, Inherited = false */ )
sealed class SecurityTransparentAttribute extends System.Attribute {
  def this() {}
}
 
sealed abstract class HostSecurityManagerOptions extends System.Enum {
  def ==(that: System.Security.HostSecurityManagerOptions): Boolean = false
  def !=(that: System.Security.HostSecurityManagerOptions): Boolean = false
  def  <(that: System.Security.HostSecurityManagerOptions): Boolean = false
  def <=(that: System.Security.HostSecurityManagerOptions): Boolean = false
  def  >(that: System.Security.HostSecurityManagerOptions): Boolean = false
  def >=(that: System.Security.HostSecurityManagerOptions): Boolean = false
  def  |(that: System.Security.HostSecurityManagerOptions): Boolean = false
  def  &(that: System.Security.HostSecurityManagerOptions): Boolean = false
  def  ^(that: System.Security.HostSecurityManagerOptions): Boolean = false
}
object HostSecurityManagerOptions{
  val None	 = value(0)
  val HostAppDomainEvidence	 = value(1)
  val HostPolicyLevel	 = value(2)
  val HostAssemblyEvidence	 = value(4)
  val HostDetermineApplicationTrust	 = value(8)
  val HostResolvePolicy	 = value(16)
  val AllFlags	 = value(31)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.HostSecurityManagerOptions = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class HostSecurityManager extends AnyRef {
  def ProvideAppDomainEvidence(inputEvidence : System.Security.Policy.Evidence): System.Security.Policy.Evidence
   
  def ProvideAssemblyEvidence(loadedAssembly : System.Reflection.Assembly, 
                              inputEvidence : System.Security.Policy.Evidence): System.Security.Policy.Evidence
   
  def DetermineApplicationTrust(applicationEvidence : System.Security.Policy.Evidence, 
                                activatorEvidence : System.Security.Policy.Evidence, 
                                context : System.Security.Policy.TrustManagerContext): System.Security.Policy.ApplicationTrust
   
  def ResolvePolicy(evidence : System.Security.Policy.Evidence): System.Security.PermissionSet
   
  val Flags : System.Security.HostSecurityManagerOptions = System.Security.HostSecurityManagerOptions.None
   
  val DomainPolicy : System.Security.Policy.PolicyLevel = null
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class PermissionSet extends AnyRef with System.Security.ISecurityEncodable with System.Collections.ICollection with 
                            System.Collections.IEnumerable with System.Security.IStackWalk with 
                            System.Runtime.Serialization.IDeserializationCallback {
  def CopyTo(array : System.Array, index : Int): Unit
   
  def IsEmpty: Boolean
   
  def GetPermission(permClass : System.Type): System.Security.IPermission
   
  def SetPermission(perm : System.Security.IPermission): System.Security.IPermission
   
  def AddPermission(perm : System.Security.IPermission): System.Security.IPermission
   
  def RemovePermission(permClass : System.Type): System.Security.IPermission
   
  def IsUnrestricted: Boolean
   
  def IsSubsetOf(target : System.Security.PermissionSet): Boolean
   
  def Intersect(other : System.Security.PermissionSet): System.Security.PermissionSet
   
  def Union(other : System.Security.PermissionSet): System.Security.PermissionSet
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Equals(obj : AnyRef): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetHashCode: Int
   
  def Demand: Unit
   
  def Assert: Unit
   
  def Deny: Unit
   
  def PermitOnly: Unit
   
  def Copy: System.Security.PermissionSet
   
  def GetEnumerator: System.Collections.IEnumerator
   
  def ToString: String
   
  def FromXml(et : System.Security.SecurityElement): Unit
   
  def ToXml: System.Security.SecurityElement
   
  def ContainsNonCodeAccessPermissions: Boolean
   
  val SyncRoot : AnyRef = null
   
  val IsSynchronized : Boolean = false
   
  val IsReadOnly : Boolean = false
   
  val Count : Int = 0
   
  def this(state : System.Security.Permissions.PermissionState) {}
   
  def this(permSet : System.Security.PermissionSet) {}
}
object PermissionSet {
  def ConvertPermissionSet(inFormat : String, inData : Array[UByte], outFormat : String): Array[UByte]  = Array.empty[UByte]
   
  def RevertAssert: Unit  = {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class NamedPermissionSet extends System.Security.PermissionSet {
  def Copy: System.Security.PermissionSet
   
  def Copy(name : String): System.Security.NamedPermissionSet
   
  def ToXml: System.Security.SecurityElement
   
  def FromXml(et : System.Security.SecurityElement): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Equals(obj : AnyRef): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetHashCode: Int
   
  var Name : String = ""
   
  var Description : String = ""
   
  def this(name : String) {}
   
  def this(name : String, state : System.Security.Permissions.PermissionState) {}
   
  def this(name : String, permSet : System.Security.PermissionSet) {}
   
  def this(permSet : System.Security.NamedPermissionSet) {}
}
 
sealed class SecureString extends AnyRef with System.IDisposable {
  def AppendChar(c : Char): Unit
   
  def Clear: Unit
   
  def Copy: System.Security.SecureString
   
  def Dispose: Unit
   
  def InsertAt(index : Int, c : Char): Unit
   
  def IsReadOnly: Boolean
   
  def MakeReadOnly: Unit
   
  def RemoveAt(index : Int): Unit
   
  def SetAt(index : Int, c : Char): Unit
   
  val Length : Int = 0
   
  def this() {}
   
  @System.CLSCompliantAttribute(false)
  def this(value : CLRPointer[Char], length : Int) {}
}
 
sealed class SecurityContext extends AnyRef {
  def CreateCopy: System.Security.SecurityContext
}
object SecurityContext {
  def SuppressFlow: System.Threading.AsyncFlowControl  = new System.Threading.AsyncFlowControl()
   
  def SuppressFlowWindowsIdentity: System.Threading.AsyncFlowControl  = new System.Threading.AsyncFlowControl()
   
  def RestoreFlow: Unit  = {}
   
  def IsFlowSuppressed: Boolean  = false
   
  def IsWindowsIdentityFlowSuppressed: Boolean  = false
   
  def Run(securityContext : System.Security.SecurityContext, 
          callback : System.Threading.ContextCallback, state : AnyRef): Unit  = {}
   
  def Capture: System.Security.SecurityContext  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SecurityException extends System.SystemException {
  def ToString: String
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var Action : System.Security.Permissions.SecurityAction = System.Security.Permissions.SecurityAction.Demand
   
  var PermissionType : System.Type = null
   
  var FirstPermissionThatFailed : System.Security.IPermission = null
   
  var PermissionState : String = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var Demanded : AnyRef = null
   
  var GrantedSet : String = ""
   
  var RefusedSet : String = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var DenySetInstance : AnyRef = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var PermitOnlySetInstance : AnyRef = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var FailedAssemblyInfo : System.Reflection.AssemblyName = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var Method : System.Reflection.MethodInfo = null
   
  var Zone : System.Security.SecurityZone = System.Security.SecurityZone.MyComputer
   
  var Url : String = ""
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, `type` : System.Type) {}
   
  def this(message : String, `type` : System.Type, state : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
   
  def this(message : String, assemblyName : System.Reflection.AssemblyName, 
           grant : System.Security.PermissionSet, refused : System.Security.PermissionSet, 
           method : System.Reflection.MethodInfo, 
           action : System.Security.Permissions.SecurityAction, demanded : AnyRef, 
           permThatFailed : System.Security.IPermission, 
           evidence : System.Security.Policy.Evidence) {}
   
  def this(message : String, deny : AnyRef, permitOnly : AnyRef, 
           method : System.Reflection.MethodInfo, demanded : AnyRef, 
           permThatFailed : System.Security.IPermission) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class HostProtectionException extends System.SystemException {
  def ToString: String
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  val ProtectedResources : System.Security.Permissions.HostProtectionResource = System.Security.Permissions.HostProtectionResource.None
   
  val DemandedResources : System.Security.Permissions.HostProtectionResource = System.Security.Permissions.HostProtectionResource.None
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, e : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
   
  def this(message : String, 
           protectedResources : System.Security.Permissions.HostProtectionResource, 
           demandedResources : System.Security.Permissions.HostProtectionResource) {}
}
 
sealed abstract class PolicyLevelType extends System.Enum {
  def ==(that: System.Security.PolicyLevelType): Boolean = false
  def !=(that: System.Security.PolicyLevelType): Boolean = false
  def  <(that: System.Security.PolicyLevelType): Boolean = false
  def <=(that: System.Security.PolicyLevelType): Boolean = false
  def  >(that: System.Security.PolicyLevelType): Boolean = false
  def >=(that: System.Security.PolicyLevelType): Boolean = false
  def  |(that: System.Security.PolicyLevelType): Boolean = false
  def  &(that: System.Security.PolicyLevelType): Boolean = false
  def  ^(that: System.Security.PolicyLevelType): Boolean = false
}
object PolicyLevelType{
  val User	 = value(0)
  val Machine	 = value(1)
  val Enterprise	 = value(2)
  val AppDomain	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.PolicyLevelType = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract sealed class SecurityManager extends AnyRef 
object SecurityManager {
  def IsGranted(perm : System.Security.IPermission): Boolean  = false
   
  def LoadPolicyLevelFromFile(path : String, `type` : System.Security.PolicyLevelType): System.Security.Policy.PolicyLevel  = null
   
  def LoadPolicyLevelFromString(str : String, `type` : System.Security.PolicyLevelType): System.Security.Policy.PolicyLevel  = null
   
  def SavePolicyLevel(level : System.Security.Policy.PolicyLevel): Unit  = {}
   
  def ResolvePolicy(evidence : System.Security.Policy.Evidence): System.Security.PermissionSet  = null
   
  def ResolvePolicy(evidences : Array[System.Security.Policy.Evidence]): System.Security.PermissionSet  = null
   
  def ResolveSystemPolicy(evidence : System.Security.Policy.Evidence): System.Security.PermissionSet  = null
   
  def ResolvePolicyGroups(evidence : System.Security.Policy.Evidence): System.Collections.IEnumerator  = null
   
  def PolicyHierarchy: System.Collections.IEnumerator  = null
   
  def SavePolicy: Unit  = {}
   
  var CheckExecutionRights : Boolean = false
   
  @System.ObsoleteAttribute("Because security can no longer be turned off permanently, setting the SecurityEnabled property no longer has any effect. Reading the property will still indicate whether security has been turned off temporarily.")
  var SecurityEnabled : Boolean = false
}
 
abstract class SecurityState extends AnyRef {
  def IsStateAvailable: Boolean
   
  /* abstract */ def EnsureState: Unit
   
  protected def this() {}
}
 
sealed abstract class SecurityZone extends System.Enum {
  def ==(that: System.Security.SecurityZone): Boolean = false
  def !=(that: System.Security.SecurityZone): Boolean = false
  def  <(that: System.Security.SecurityZone): Boolean = false
  def <=(that: System.Security.SecurityZone): Boolean = false
  def  >(that: System.Security.SecurityZone): Boolean = false
  def >=(that: System.Security.SecurityZone): Boolean = false
  def  |(that: System.Security.SecurityZone): Boolean = false
  def  &(that: System.Security.SecurityZone): Boolean = false
  def  ^(that: System.Security.SecurityZone): Boolean = false
}
object SecurityZone{
  val MyComputer	 = value(0)
  val Intranet	 = value(1)
  val Trusted	 = value(2)
  val Internet	 = value(3)
  val Untrusted	 = value(4)
  val NoZone	 = value(-1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.SecurityZone = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class VerificationException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
}