 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Security.AccessControl {
 
sealed abstract class AceType extends System.Enum {
  def ==(that: System.Security.AccessControl.AceType): Boolean = false
  def !=(that: System.Security.AccessControl.AceType): Boolean = false
  def  <(that: System.Security.AccessControl.AceType): Boolean = false
  def <=(that: System.Security.AccessControl.AceType): Boolean = false
  def  >(that: System.Security.AccessControl.AceType): Boolean = false
  def >=(that: System.Security.AccessControl.AceType): Boolean = false
  def  |(that: System.Security.AccessControl.AceType): Boolean = false
  def  &(that: System.Security.AccessControl.AceType): Boolean = false
  def  ^(that: System.Security.AccessControl.AceType): Boolean = false
}
object AceType{
  val AccessAllowed	 = value(0)
  val AccessDenied	 = value(1)
  val SystemAudit	 = value(2)
  val SystemAlarm	 = value(3)
  val AccessAllowedCompound	 = value(4)
  val AccessAllowedObject	 = value(5)
  val AccessDeniedObject	 = value(6)
  val SystemAuditObject	 = value(7)
  val SystemAlarmObject	 = value(8)
  val AccessAllowedCallback	 = value(9)
  val AccessDeniedCallback	 = value(10)
  val AccessAllowedCallbackObject	 = value(11)
  val AccessDeniedCallbackObject	 = value(12)
  val SystemAuditCallback	 = value(13)
  val SystemAlarmCallback	 = value(14)
  val SystemAuditCallbackObject	 = value(15)
  val SystemAlarmCallbackObject	 = value(16)
  val MaxDefinedAceType	 = value(16)
   
  /* an artifact for CLR enums */ private def value(i: UByte): System.Security.AccessControl.AceType = null
}
 
sealed abstract class AceFlags extends System.Enum {
  def ==(that: System.Security.AccessControl.AceFlags): Boolean = false
  def !=(that: System.Security.AccessControl.AceFlags): Boolean = false
  def  <(that: System.Security.AccessControl.AceFlags): Boolean = false
  def <=(that: System.Security.AccessControl.AceFlags): Boolean = false
  def  >(that: System.Security.AccessControl.AceFlags): Boolean = false
  def >=(that: System.Security.AccessControl.AceFlags): Boolean = false
  def  |(that: System.Security.AccessControl.AceFlags): Boolean = false
  def  &(that: System.Security.AccessControl.AceFlags): Boolean = false
  def  ^(that: System.Security.AccessControl.AceFlags): Boolean = false
}
object AceFlags{
  val None	 = value(0)
  val ObjectInherit	 = value(1)
  val ContainerInherit	 = value(2)
  val NoPropagateInherit	 = value(4)
  val InheritOnly	 = value(8)
  val Inherited	 = value(16)
  val SuccessfulAccess	 = value(64)
  val FailedAccess	 = value(-128)
  val InheritanceFlags	 = value(15)
  val AuditFlags	 = value(-64)
   
  /* an artifact for CLR enums */ private def value(i: UByte): System.Security.AccessControl.AceFlags = null
}
 
abstract class GenericAce extends AnyRef {
  /* abstract */ def GetBinaryForm(binaryForm : Array[UByte], offset : Int): Unit
   
  def Copy: System.Security.AccessControl.GenericAce
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  val AceType : System.Security.AccessControl.AceType = System.Security.AccessControl.AceType.AccessAllowed
   
  var AceFlags : System.Security.AccessControl.AceFlags = System.Security.AccessControl.AceFlags.None
   
  val IsInherited : Boolean = false
   
  val InheritanceFlags : System.Security.AccessControl.InheritanceFlags = System.Security.AccessControl.InheritanceFlags.None
   
  val PropagationFlags : System.Security.AccessControl.PropagationFlags = System.Security.AccessControl.PropagationFlags.None
   
  val AuditFlags : System.Security.AccessControl.AuditFlags = System.Security.AccessControl.AuditFlags.None
   
  val BinaryLength : Int = 0
}
object GenericAce {
  def CreateFromBinaryForm(binaryForm : Array[UByte], offset : Int): System.Security.AccessControl.GenericAce  = null
   
  def ==(left : System.Security.AccessControl.GenericAce, 
         right : System.Security.AccessControl.GenericAce): Boolean  = false
   
  def !=(left : System.Security.AccessControl.GenericAce, 
         right : System.Security.AccessControl.GenericAce): Boolean  = false
}
 
abstract class KnownAce extends System.Security.AccessControl.GenericAce {
  var AccessMask : Int = 0
   
  var SecurityIdentifier : System.Security.Principal.SecurityIdentifier = null
}
 
sealed class CustomAce extends System.Security.AccessControl.GenericAce {
  def GetOpaque: Array[UByte]
   
  def SetOpaque(opaque : Array[UByte]): Unit
   
  def GetBinaryForm(binaryForm : Array[UByte], offset : Int): Unit
   
  val OpaqueLength : Int = 0
   
  val BinaryLength : Int = 0
   
  def this(`type` : System.Security.AccessControl.AceType, 
           flags : System.Security.AccessControl.AceFlags, opaque : Array[UByte]) {}
}
object CustomAce {
  val MaxOpaqueLength : Int  = 0
}
 
sealed abstract class CompoundAceType extends System.Enum {
  def ==(that: System.Security.AccessControl.CompoundAceType): Boolean = false
  def !=(that: System.Security.AccessControl.CompoundAceType): Boolean = false
  def  <(that: System.Security.AccessControl.CompoundAceType): Boolean = false
  def <=(that: System.Security.AccessControl.CompoundAceType): Boolean = false
  def  >(that: System.Security.AccessControl.CompoundAceType): Boolean = false
  def >=(that: System.Security.AccessControl.CompoundAceType): Boolean = false
  def  |(that: System.Security.AccessControl.CompoundAceType): Boolean = false
  def  &(that: System.Security.AccessControl.CompoundAceType): Boolean = false
  def  ^(that: System.Security.AccessControl.CompoundAceType): Boolean = false
}
object CompoundAceType{
  val Impersonation	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.CompoundAceType = null
}
 
sealed class CompoundAce extends System.Security.AccessControl.KnownAce {
  def GetBinaryForm(binaryForm : Array[UByte], offset : Int): Unit
   
  var CompoundAceType : System.Security.AccessControl.CompoundAceType = System.Security.AccessControl.CompoundAceType.Impersonation
   
  val BinaryLength : Int = 0
   
  def this(flags : System.Security.AccessControl.AceFlags, accessMask : Int, 
           compoundAceType : System.Security.AccessControl.CompoundAceType, 
           sid : System.Security.Principal.SecurityIdentifier) {}
}
 
sealed abstract class AceQualifier extends System.Enum {
  def ==(that: System.Security.AccessControl.AceQualifier): Boolean = false
  def !=(that: System.Security.AccessControl.AceQualifier): Boolean = false
  def  <(that: System.Security.AccessControl.AceQualifier): Boolean = false
  def <=(that: System.Security.AccessControl.AceQualifier): Boolean = false
  def  >(that: System.Security.AccessControl.AceQualifier): Boolean = false
  def >=(that: System.Security.AccessControl.AceQualifier): Boolean = false
  def  |(that: System.Security.AccessControl.AceQualifier): Boolean = false
  def  &(that: System.Security.AccessControl.AceQualifier): Boolean = false
  def  ^(that: System.Security.AccessControl.AceQualifier): Boolean = false
}
object AceQualifier{
  val AccessAllowed	 = value(0)
  val AccessDenied	 = value(1)
  val SystemAudit	 = value(2)
  val SystemAlarm	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.AceQualifier = null
}
 
abstract class QualifiedAce extends System.Security.AccessControl.KnownAce {
  def GetOpaque: Array[UByte]
   
  def SetOpaque(opaque : Array[UByte]): Unit
   
  val AceQualifier : System.Security.AccessControl.AceQualifier = System.Security.AccessControl.AceQualifier.AccessAllowed
   
  val IsCallback : Boolean = false
   
  val OpaqueLength : Int = 0
}
 
sealed class CommonAce extends System.Security.AccessControl.QualifiedAce {
  def GetBinaryForm(binaryForm : Array[UByte], offset : Int): Unit
   
  val BinaryLength : Int = 0
   
  def this(flags : System.Security.AccessControl.AceFlags, 
           qualifier : System.Security.AccessControl.AceQualifier, accessMask : Int, 
           sid : System.Security.Principal.SecurityIdentifier, isCallback : Boolean, 
           opaque : Array[UByte]) {}
}
object CommonAce {
  def MaxOpaqueLength(isCallback : Boolean): Int  = 0
}
 
sealed abstract class ObjectAceFlags extends System.Enum {
  def ==(that: System.Security.AccessControl.ObjectAceFlags): Boolean = false
  def !=(that: System.Security.AccessControl.ObjectAceFlags): Boolean = false
  def  <(that: System.Security.AccessControl.ObjectAceFlags): Boolean = false
  def <=(that: System.Security.AccessControl.ObjectAceFlags): Boolean = false
  def  >(that: System.Security.AccessControl.ObjectAceFlags): Boolean = false
  def >=(that: System.Security.AccessControl.ObjectAceFlags): Boolean = false
  def  |(that: System.Security.AccessControl.ObjectAceFlags): Boolean = false
  def  &(that: System.Security.AccessControl.ObjectAceFlags): Boolean = false
  def  ^(that: System.Security.AccessControl.ObjectAceFlags): Boolean = false
}
object ObjectAceFlags{
  val None	 = value(0)
  val ObjectAceTypePresent	 = value(1)
  val InheritedObjectAceTypePresent	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.ObjectAceFlags = null
}
 
sealed class ObjectAce extends System.Security.AccessControl.QualifiedAce {
  def GetBinaryForm(binaryForm : Array[UByte], offset : Int): Unit
   
  var ObjectAceFlags : System.Security.AccessControl.ObjectAceFlags = System.Security.AccessControl.ObjectAceFlags.None
   
  var ObjectAceType : System.Guid = new System.Guid()
   
  var InheritedObjectAceType : System.Guid = new System.Guid()
   
  val BinaryLength : Int = 0
   
  def this(aceFlags : System.Security.AccessControl.AceFlags, 
           qualifier : System.Security.AccessControl.AceQualifier, accessMask : Int, 
           sid : System.Security.Principal.SecurityIdentifier, 
           flags : System.Security.AccessControl.ObjectAceFlags, `type` : System.Guid, 
           inheritedType : System.Guid, isCallback : Boolean, opaque : Array[UByte]) {}
}
object ObjectAce {
  def MaxOpaqueLength(isCallback : Boolean): Int  = 0
}
 
sealed class AceEnumerator extends AnyRef with System.Collections.IEnumerator {
  def MoveNext: Boolean
   
  def Reset: Unit
   
  val Current : System.Security.AccessControl.GenericAce = null
}
 
@System.Reflection.DefaultMemberAttribute("Item")
abstract class GenericAcl extends AnyRef with System.Collections.ICollection with System.Collections.IEnumerable {
  /* abstract */ def GetBinaryForm(binaryForm : Array[UByte], offset : Int): Unit
   
  def CopyTo(array : Array[System.Security.AccessControl.GenericAce], index : Int): Unit
   
  def GetEnumerator: System.Security.AccessControl.AceEnumerator
   
  val Revision : UByte = 0
   
  val BinaryLength : Int = 0
   
  /* parameterful property Item */
  /* abstract */ def Item_=(index : Int, value : System.Security.AccessControl.GenericAce): Unit
  /* abstract */ def Item(index : Int): System.Security.AccessControl.GenericAce
   
  val Count : Int = 0
   
  val IsSynchronized : Boolean = false
   
  val SyncRoot : AnyRef = null
   
  protected def this() {}
}
object GenericAcl {
  val AclRevision : UByte  = 0
   
  val AclRevisionDS : UByte  = 0
   
  val MaxBinaryLength : Int  = 0
}
 
@System.Reflection.DefaultMemberAttribute("Item")
sealed class RawAcl extends System.Security.AccessControl.GenericAcl {
  def GetBinaryForm(binaryForm : Array[UByte], offset : Int): Unit
   
  def InsertAce(index : Int, ace : System.Security.AccessControl.GenericAce): Unit
   
  def RemoveAce(index : Int): Unit
   
  val Revision : UByte = 0
   
  val Count : Int = 0
   
  val BinaryLength : Int = 0
   
  /* parameterful property Item */
  def Item_=(index : Int, value : System.Security.AccessControl.GenericAce): Unit
  def Item(index : Int): System.Security.AccessControl.GenericAce
   
  def this(revision : UByte, capacity : Int) {}
   
  def this(binaryForm : Array[UByte], offset : Int) {}
}
 
@System.Reflection.DefaultMemberAttribute("Item")
abstract class CommonAcl extends System.Security.AccessControl.GenericAcl {
  def GetBinaryForm(binaryForm : Array[UByte], offset : Int): Unit
   
  def RemoveInheritedAces: Unit
   
  def Purge(sid : System.Security.Principal.SecurityIdentifier): Unit
   
  val Revision : UByte = 0
   
  val Count : Int = 0
   
  val BinaryLength : Int = 0
   
  val IsCanonical : Boolean = false
   
  val IsContainer : Boolean = false
   
  val IsDS : Boolean = false
   
  /* parameterful property Item */
  def Item_=(index : Int, value : System.Security.AccessControl.GenericAce): Unit
  def Item(index : Int): System.Security.AccessControl.GenericAce
}
 
sealed class SystemAcl extends System.Security.AccessControl.CommonAcl {
  def AddAudit(auditFlags : System.Security.AccessControl.AuditFlags, 
               sid : System.Security.Principal.SecurityIdentifier, accessMask : Int, 
               inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
               propagationFlags : System.Security.AccessControl.PropagationFlags): Unit
   
  def SetAudit(auditFlags : System.Security.AccessControl.AuditFlags, 
               sid : System.Security.Principal.SecurityIdentifier, accessMask : Int, 
               inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
               propagationFlags : System.Security.AccessControl.PropagationFlags): Unit
   
  def RemoveAudit(auditFlags : System.Security.AccessControl.AuditFlags, 
                  sid : System.Security.Principal.SecurityIdentifier, accessMask : Int, 
                  inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                  propagationFlags : System.Security.AccessControl.PropagationFlags): Boolean
   
  def RemoveAuditSpecific(auditFlags : System.Security.AccessControl.AuditFlags, 
                          sid : System.Security.Principal.SecurityIdentifier, accessMask : Int, 
                          inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                          propagationFlags : System.Security.AccessControl.PropagationFlags): Unit
   
  def AddAudit(auditFlags : System.Security.AccessControl.AuditFlags, 
               sid : System.Security.Principal.SecurityIdentifier, accessMask : Int, 
               inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
               propagationFlags : System.Security.AccessControl.PropagationFlags, 
               objectFlags : System.Security.AccessControl.ObjectAceFlags, 
               objectType : System.Guid, inheritedObjectType : System.Guid): Unit
   
  def SetAudit(auditFlags : System.Security.AccessControl.AuditFlags, 
               sid : System.Security.Principal.SecurityIdentifier, accessMask : Int, 
               inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
               propagationFlags : System.Security.AccessControl.PropagationFlags, 
               objectFlags : System.Security.AccessControl.ObjectAceFlags, 
               objectType : System.Guid, inheritedObjectType : System.Guid): Unit
   
  def RemoveAudit(auditFlags : System.Security.AccessControl.AuditFlags, 
                  sid : System.Security.Principal.SecurityIdentifier, accessMask : Int, 
                  inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                  propagationFlags : System.Security.AccessControl.PropagationFlags, 
                  objectFlags : System.Security.AccessControl.ObjectAceFlags, 
                  objectType : System.Guid, inheritedObjectType : System.Guid): Boolean
   
  def RemoveAuditSpecific(auditFlags : System.Security.AccessControl.AuditFlags, 
                          sid : System.Security.Principal.SecurityIdentifier, accessMask : Int, 
                          inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                          propagationFlags : System.Security.AccessControl.PropagationFlags, 
                          objectFlags : System.Security.AccessControl.ObjectAceFlags, 
                          objectType : System.Guid, inheritedObjectType : System.Guid): Unit
   
  def this(isContainer : Boolean, isDS : Boolean, capacity : Int) {}
   
  def this(isContainer : Boolean, isDS : Boolean, revision : UByte, capacity : Int) {}
   
  def this(isContainer : Boolean, isDS : Boolean, rawAcl : System.Security.AccessControl.RawAcl) {}
}
 
sealed class DiscretionaryAcl extends System.Security.AccessControl.CommonAcl {
  def AddAccess(accessType : System.Security.AccessControl.AccessControlType, 
                sid : System.Security.Principal.SecurityIdentifier, accessMask : Int, 
                inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                propagationFlags : System.Security.AccessControl.PropagationFlags): Unit
   
  def SetAccess(accessType : System.Security.AccessControl.AccessControlType, 
                sid : System.Security.Principal.SecurityIdentifier, accessMask : Int, 
                inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                propagationFlags : System.Security.AccessControl.PropagationFlags): Unit
   
  def RemoveAccess(accessType : System.Security.AccessControl.AccessControlType, 
                   sid : System.Security.Principal.SecurityIdentifier, accessMask : Int, 
                   inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                   propagationFlags : System.Security.AccessControl.PropagationFlags): Boolean
   
  def RemoveAccessSpecific(accessType : System.Security.AccessControl.AccessControlType, 
                           sid : System.Security.Principal.SecurityIdentifier, accessMask : Int, 
                           inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                           propagationFlags : System.Security.AccessControl.PropagationFlags): Unit
   
  def AddAccess(accessType : System.Security.AccessControl.AccessControlType, 
                sid : System.Security.Principal.SecurityIdentifier, accessMask : Int, 
                inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                propagationFlags : System.Security.AccessControl.PropagationFlags, 
                objectFlags : System.Security.AccessControl.ObjectAceFlags, 
                objectType : System.Guid, inheritedObjectType : System.Guid): Unit
   
  def SetAccess(accessType : System.Security.AccessControl.AccessControlType, 
                sid : System.Security.Principal.SecurityIdentifier, accessMask : Int, 
                inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                propagationFlags : System.Security.AccessControl.PropagationFlags, 
                objectFlags : System.Security.AccessControl.ObjectAceFlags, 
                objectType : System.Guid, inheritedObjectType : System.Guid): Unit
   
  def RemoveAccess(accessType : System.Security.AccessControl.AccessControlType, 
                   sid : System.Security.Principal.SecurityIdentifier, accessMask : Int, 
                   inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                   propagationFlags : System.Security.AccessControl.PropagationFlags, 
                   objectFlags : System.Security.AccessControl.ObjectAceFlags, 
                   objectType : System.Guid, inheritedObjectType : System.Guid): Boolean
   
  def RemoveAccessSpecific(accessType : System.Security.AccessControl.AccessControlType, 
                           sid : System.Security.Principal.SecurityIdentifier, accessMask : Int, 
                           inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                           propagationFlags : System.Security.AccessControl.PropagationFlags, 
                           objectFlags : System.Security.AccessControl.ObjectAceFlags, 
                           objectType : System.Guid, inheritedObjectType : System.Guid): Unit
   
  def this(isContainer : Boolean, isDS : Boolean, capacity : Int) {}
   
  def this(isContainer : Boolean, isDS : Boolean, revision : UByte, capacity : Int) {}
   
  def this(isContainer : Boolean, isDS : Boolean, rawAcl : System.Security.AccessControl.RawAcl) {}
}
 
sealed abstract class CryptoKeyRights extends System.Enum {
  def ==(that: System.Security.AccessControl.CryptoKeyRights): Boolean = false
  def !=(that: System.Security.AccessControl.CryptoKeyRights): Boolean = false
  def  <(that: System.Security.AccessControl.CryptoKeyRights): Boolean = false
  def <=(that: System.Security.AccessControl.CryptoKeyRights): Boolean = false
  def  >(that: System.Security.AccessControl.CryptoKeyRights): Boolean = false
  def >=(that: System.Security.AccessControl.CryptoKeyRights): Boolean = false
  def  |(that: System.Security.AccessControl.CryptoKeyRights): Boolean = false
  def  &(that: System.Security.AccessControl.CryptoKeyRights): Boolean = false
  def  ^(that: System.Security.AccessControl.CryptoKeyRights): Boolean = false
}
object CryptoKeyRights{
  val ReadData	 = value(1)
  val WriteData	 = value(2)
  val ReadExtendedAttributes	 = value(8)
  val WriteExtendedAttributes	 = value(16)
  val ReadAttributes	 = value(128)
  val WriteAttributes	 = value(256)
  val Delete	 = value(65536)
  val ReadPermissions	 = value(131072)
  val ChangePermissions	 = value(262144)
  val TakeOwnership	 = value(524288)
  val Synchronize	 = value(1048576)
  val FullControl	 = value(2032027)
  val GenericAll	 = value(268435456)
  val GenericExecute	 = value(536870912)
  val GenericWrite	 = value(1073741824)
  val GenericRead	 = value(-2147483648)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.CryptoKeyRights = null
}
 
abstract class AuthorizationRule extends AnyRef {
  protected def get_AccessMask: Int
   
  val IdentityReference : System.Security.Principal.IdentityReference = null
   
  val IsInherited : Boolean = false
   
  val InheritanceFlags : System.Security.AccessControl.InheritanceFlags = System.Security.AccessControl.InheritanceFlags.None
   
  val PropagationFlags : System.Security.AccessControl.PropagationFlags = System.Security.AccessControl.PropagationFlags.None
   
  protected def this(identity : System.Security.Principal.IdentityReference, accessMask : Int, 
                     isInherited : Boolean, 
                     inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                     propagationFlags : System.Security.AccessControl.PropagationFlags) {}
}
 
abstract class AccessRule extends System.Security.AccessControl.AuthorizationRule {
  val AccessControlType : System.Security.AccessControl.AccessControlType = System.Security.AccessControl.AccessControlType.Allow
   
  protected def this(identity : System.Security.Principal.IdentityReference, accessMask : Int, 
                     isInherited : Boolean, 
                     inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                     propagationFlags : System.Security.AccessControl.PropagationFlags, 
                     `type` : System.Security.AccessControl.AccessControlType) {}
}
 
sealed class CryptoKeyAccessRule extends System.Security.AccessControl.AccessRule {
  val CryptoKeyRights : System.Security.AccessControl.CryptoKeyRights = System.Security.AccessControl.CryptoKeyRights.ReadData
   
  def this(identity : System.Security.Principal.IdentityReference, 
           cryptoKeyRights : System.Security.AccessControl.CryptoKeyRights, 
           `type` : System.Security.AccessControl.AccessControlType) {}
   
  def this(identity : String, cryptoKeyRights : System.Security.AccessControl.CryptoKeyRights, 
           `type` : System.Security.AccessControl.AccessControlType) {}
}
 
abstract class AuditRule extends System.Security.AccessControl.AuthorizationRule {
  val AuditFlags : System.Security.AccessControl.AuditFlags = System.Security.AccessControl.AuditFlags.None
   
  protected def this(identity : System.Security.Principal.IdentityReference, accessMask : Int, 
                     isInherited : Boolean, 
                     inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                     propagationFlags : System.Security.AccessControl.PropagationFlags, 
                     auditFlags : System.Security.AccessControl.AuditFlags) {}
}
 
sealed class CryptoKeyAuditRule extends System.Security.AccessControl.AuditRule {
  val CryptoKeyRights : System.Security.AccessControl.CryptoKeyRights = System.Security.AccessControl.CryptoKeyRights.ReadData
   
  def this(identity : System.Security.Principal.IdentityReference, 
           cryptoKeyRights : System.Security.AccessControl.CryptoKeyRights, 
           flags : System.Security.AccessControl.AuditFlags) {}
   
  def this(identity : String, cryptoKeyRights : System.Security.AccessControl.CryptoKeyRights, 
           flags : System.Security.AccessControl.AuditFlags) {}
}
 
abstract class ObjectSecurity extends AnyRef {
  protected def ReadLock: Unit
   
  protected def ReadUnlock: Unit
   
  protected def WriteLock: Unit
   
  protected def WriteUnlock: Unit
   
  protected def get_OwnerModified: Boolean
   
  protected def set_OwnerModified(value : Boolean): Unit
   
  protected def get_GroupModified: Boolean
   
  protected def set_GroupModified(value : Boolean): Unit
   
  protected def get_AuditRulesModified: Boolean
   
  protected def set_AuditRulesModified(value : Boolean): Unit
   
  protected def get_AccessRulesModified: Boolean
   
  protected def set_AccessRulesModified(value : Boolean): Unit
   
  protected def get_IsContainer: Boolean
   
  protected def get_IsDS: Boolean
   
  protected def Persist(name : String, 
                        includeSections : System.Security.AccessControl.AccessControlSections): Unit
   
  protected def Persist(enableOwnershipPrivilege : Boolean, name : String, 
                        includeSections : System.Security.AccessControl.AccessControlSections): Unit
   
  protected def Persist(handle : System.Runtime.InteropServices.SafeHandle, 
                        includeSections : System.Security.AccessControl.AccessControlSections): Unit
   
  def GetOwner(targetType : System.Type): System.Security.Principal.IdentityReference
   
  def SetOwner(identity : System.Security.Principal.IdentityReference): Unit
   
  def GetGroup(targetType : System.Type): System.Security.Principal.IdentityReference
   
  def SetGroup(identity : System.Security.Principal.IdentityReference): Unit
   
  def PurgeAccessRules(identity : System.Security.Principal.IdentityReference): Unit
   
  def PurgeAuditRules(identity : System.Security.Principal.IdentityReference): Unit
   
  def SetAccessRuleProtection(isProtected : Boolean, preserveInheritance : Boolean): Unit
   
  def SetAuditRuleProtection(isProtected : Boolean, preserveInheritance : Boolean): Unit
   
  def GetSecurityDescriptorSddlForm(includeSections : System.Security.AccessControl.AccessControlSections): String
   
  def SetSecurityDescriptorSddlForm(sddlForm : String): Unit
   
  def SetSecurityDescriptorSddlForm(sddlForm : String, 
                                    includeSections : System.Security.AccessControl.AccessControlSections): Unit
   
  def GetSecurityDescriptorBinaryForm: Array[UByte]
   
  def SetSecurityDescriptorBinaryForm(binaryForm : Array[UByte]): Unit
   
  def SetSecurityDescriptorBinaryForm(binaryForm : Array[UByte], 
                                      includeSections : System.Security.AccessControl.AccessControlSections): Unit
   
  protected /* abstract */ def ModifyAccess(modification : System.Security.AccessControl.AccessControlModification, 
                                            rule : System.Security.AccessControl.AccessRule, modified : CLRByRef[Boolean]): Boolean
   
  protected /* abstract */ def ModifyAudit(modification : System.Security.AccessControl.AccessControlModification, 
                                           rule : System.Security.AccessControl.AuditRule, modified : CLRByRef[Boolean]): Boolean
   
  def ModifyAccessRule(modification : System.Security.AccessControl.AccessControlModification, 
                       rule : System.Security.AccessControl.AccessRule, modified : CLRByRef[Boolean]): Boolean
   
  def ModifyAuditRule(modification : System.Security.AccessControl.AccessControlModification, 
                      rule : System.Security.AccessControl.AuditRule, modified : CLRByRef[Boolean]): Boolean
   
  /* abstract */ def AccessRuleFactory(identityReference : System.Security.Principal.IdentityReference, accessMask : Int, 
                                       isInherited : Boolean, 
                                       inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                                       propagationFlags : System.Security.AccessControl.PropagationFlags, 
                                       `type` : System.Security.AccessControl.AccessControlType): System.Security.AccessControl.AccessRule
   
  /* abstract */ def AuditRuleFactory(identityReference : System.Security.Principal.IdentityReference, accessMask : Int, 
                                      isInherited : Boolean, 
                                      inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                                      propagationFlags : System.Security.AccessControl.PropagationFlags, 
                                      flags : System.Security.AccessControl.AuditFlags): System.Security.AccessControl.AuditRule
   
  val AreAccessRulesProtected : Boolean = false
   
  val AreAuditRulesProtected : Boolean = false
   
  val AreAccessRulesCanonical : Boolean = false
   
  val AreAuditRulesCanonical : Boolean = false
   
  val AccessRightType : System.Type = null
   
  val AccessRuleType : System.Type = null
   
  val AuditRuleType : System.Type = null
   
  protected def this(isContainer : Boolean, isDS : Boolean) {}
}
object ObjectSecurity {
  def IsSddlConversionSupported: Boolean  = false
}
 
abstract class CommonObjectSecurity extends System.Security.AccessControl.ObjectSecurity {
  protected def ModifyAccess(modification : System.Security.AccessControl.AccessControlModification, 
                             rule : System.Security.AccessControl.AccessRule, modified : CLRByRef[Boolean]): Boolean
   
  protected def ModifyAudit(modification : System.Security.AccessControl.AccessControlModification, 
                            rule : System.Security.AccessControl.AuditRule, modified : CLRByRef[Boolean]): Boolean
   
  protected def AddAccessRule(rule : System.Security.AccessControl.AccessRule): Unit
   
  protected def SetAccessRule(rule : System.Security.AccessControl.AccessRule): Unit
   
  protected def ResetAccessRule(rule : System.Security.AccessControl.AccessRule): Unit
   
  protected def RemoveAccessRule(rule : System.Security.AccessControl.AccessRule): Boolean
   
  protected def RemoveAccessRuleAll(rule : System.Security.AccessControl.AccessRule): Unit
   
  protected def RemoveAccessRuleSpecific(rule : System.Security.AccessControl.AccessRule): Unit
   
  protected def AddAuditRule(rule : System.Security.AccessControl.AuditRule): Unit
   
  protected def SetAuditRule(rule : System.Security.AccessControl.AuditRule): Unit
   
  protected def RemoveAuditRule(rule : System.Security.AccessControl.AuditRule): Boolean
   
  protected def RemoveAuditRuleAll(rule : System.Security.AccessControl.AuditRule): Unit
   
  protected def RemoveAuditRuleSpecific(rule : System.Security.AccessControl.AuditRule): Unit
   
  def GetAccessRules(includeExplicit : Boolean, includeInherited : Boolean, targetType : System.Type): System.Security.AccessControl.AuthorizationRuleCollection
   
  def GetAuditRules(includeExplicit : Boolean, includeInherited : Boolean, targetType : System.Type): System.Security.AccessControl.AuthorizationRuleCollection
   
  protected def this(isContainer : Boolean) {}
}
 
abstract class NativeObjectSecurity extends System.Security.AccessControl.CommonObjectSecurity {
  protected def Persist(name : String, 
                        includeSections : System.Security.AccessControl.AccessControlSections): Unit
   
  protected def Persist(name : String, 
                        includeSections : System.Security.AccessControl.AccessControlSections, 
                        exceptionContext : AnyRef): Unit
   
  protected def Persist(handle : System.Runtime.InteropServices.SafeHandle, 
                        includeSections : System.Security.AccessControl.AccessControlSections): Unit
   
  protected def Persist(handle : System.Runtime.InteropServices.SafeHandle, 
                        includeSections : System.Security.AccessControl.AccessControlSections, 
                        exceptionContext : AnyRef): Unit
   
  protected def this(isContainer : Boolean, resourceType : System.Security.AccessControl.ResourceType) {}
   
  protected def this(isContainer : Boolean, resourceType : System.Security.AccessControl.ResourceType, 
                     exceptionFromErrorCode : System.Security.AccessControl.NativeObjectSecurity.ExceptionFromErrorCode, 
                     exceptionContext : AnyRef) {}
   
  protected def this(isContainer : Boolean, resourceType : System.Security.AccessControl.ResourceType, 
                     name : String, 
                     includeSections : System.Security.AccessControl.AccessControlSections, 
                     exceptionFromErrorCode : System.Security.AccessControl.NativeObjectSecurity.ExceptionFromErrorCode, 
                     exceptionContext : AnyRef) {}
   
  protected def this(isContainer : Boolean, resourceType : System.Security.AccessControl.ResourceType, 
                     name : String, 
                     includeSections : System.Security.AccessControl.AccessControlSections) {}
   
  protected def this(isContainer : Boolean, resourceType : System.Security.AccessControl.ResourceType, 
                     handle : System.Runtime.InteropServices.SafeHandle, 
                     includeSections : System.Security.AccessControl.AccessControlSections, 
                     exceptionFromErrorCode : System.Security.AccessControl.NativeObjectSecurity.ExceptionFromErrorCode, 
                     exceptionContext : AnyRef) {}
   
  protected def this(isContainer : Boolean, resourceType : System.Security.AccessControl.ResourceType, 
                     handle : System.Runtime.InteropServices.SafeHandle, 
                     includeSections : System.Security.AccessControl.AccessControlSections) {}
}
object NativeObjectSecurity {
  protected sealed class ExceptionFromErrorCode extends System.MulticastDelegate {
    def Invoke(errorCode : Int, name : String, handle : System.Runtime.InteropServices.SafeHandle, 
               context : AnyRef): System.Exception
     
    def BeginInvoke(errorCode : Int, name : String, handle : System.Runtime.InteropServices.SafeHandle, 
                    context : AnyRef, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
     
    def EndInvoke(result : System.IAsyncResult): System.Exception
     
    def this(`object` : AnyRef, method : System.IntPtr) {}
  }
}
 
sealed class CryptoKeySecurity extends System.Security.AccessControl.NativeObjectSecurity {
  def AccessRuleFactory(identityReference : System.Security.Principal.IdentityReference, accessMask : Int, 
                        isInherited : Boolean, 
                        inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                        propagationFlags : System.Security.AccessControl.PropagationFlags, 
                        `type` : System.Security.AccessControl.AccessControlType): System.Security.AccessControl.AccessRule
   
  def AuditRuleFactory(identityReference : System.Security.Principal.IdentityReference, accessMask : Int, 
                       isInherited : Boolean, 
                       inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                       propagationFlags : System.Security.AccessControl.PropagationFlags, 
                       flags : System.Security.AccessControl.AuditFlags): System.Security.AccessControl.AuditRule
   
  def AddAccessRule(rule : System.Security.AccessControl.CryptoKeyAccessRule): Unit
   
  def SetAccessRule(rule : System.Security.AccessControl.CryptoKeyAccessRule): Unit
   
  def ResetAccessRule(rule : System.Security.AccessControl.CryptoKeyAccessRule): Unit
   
  def RemoveAccessRule(rule : System.Security.AccessControl.CryptoKeyAccessRule): Boolean
   
  def RemoveAccessRuleAll(rule : System.Security.AccessControl.CryptoKeyAccessRule): Unit
   
  def RemoveAccessRuleSpecific(rule : System.Security.AccessControl.CryptoKeyAccessRule): Unit
   
  def AddAuditRule(rule : System.Security.AccessControl.CryptoKeyAuditRule): Unit
   
  def SetAuditRule(rule : System.Security.AccessControl.CryptoKeyAuditRule): Unit
   
  def RemoveAuditRule(rule : System.Security.AccessControl.CryptoKeyAuditRule): Boolean
   
  def RemoveAuditRuleAll(rule : System.Security.AccessControl.CryptoKeyAuditRule): Unit
   
  def RemoveAuditRuleSpecific(rule : System.Security.AccessControl.CryptoKeyAuditRule): Unit
   
  val AccessRightType : System.Type = null
   
  val AccessRuleType : System.Type = null
   
  val AuditRuleType : System.Type = null
   
  def this() {}
   
  def this(securityDescriptor : System.Security.AccessControl.CommonSecurityDescriptor) {}
}
 
sealed abstract class InheritanceFlags extends System.Enum {
  def ==(that: System.Security.AccessControl.InheritanceFlags): Boolean = false
  def !=(that: System.Security.AccessControl.InheritanceFlags): Boolean = false
  def  <(that: System.Security.AccessControl.InheritanceFlags): Boolean = false
  def <=(that: System.Security.AccessControl.InheritanceFlags): Boolean = false
  def  >(that: System.Security.AccessControl.InheritanceFlags): Boolean = false
  def >=(that: System.Security.AccessControl.InheritanceFlags): Boolean = false
  def  |(that: System.Security.AccessControl.InheritanceFlags): Boolean = false
  def  &(that: System.Security.AccessControl.InheritanceFlags): Boolean = false
  def  ^(that: System.Security.AccessControl.InheritanceFlags): Boolean = false
}
object InheritanceFlags{
  val None	 = value(0)
  val ContainerInherit	 = value(1)
  val ObjectInherit	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.InheritanceFlags = null
}
 
sealed abstract class PropagationFlags extends System.Enum {
  def ==(that: System.Security.AccessControl.PropagationFlags): Boolean = false
  def !=(that: System.Security.AccessControl.PropagationFlags): Boolean = false
  def  <(that: System.Security.AccessControl.PropagationFlags): Boolean = false
  def <=(that: System.Security.AccessControl.PropagationFlags): Boolean = false
  def  >(that: System.Security.AccessControl.PropagationFlags): Boolean = false
  def >=(that: System.Security.AccessControl.PropagationFlags): Boolean = false
  def  |(that: System.Security.AccessControl.PropagationFlags): Boolean = false
  def  &(that: System.Security.AccessControl.PropagationFlags): Boolean = false
  def  ^(that: System.Security.AccessControl.PropagationFlags): Boolean = false
}
object PropagationFlags{
  val None	 = value(0)
  val NoPropagateInherit	 = value(1)
  val InheritOnly	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.PropagationFlags = null
}
 
sealed abstract class AuditFlags extends System.Enum {
  def ==(that: System.Security.AccessControl.AuditFlags): Boolean = false
  def !=(that: System.Security.AccessControl.AuditFlags): Boolean = false
  def  <(that: System.Security.AccessControl.AuditFlags): Boolean = false
  def <=(that: System.Security.AccessControl.AuditFlags): Boolean = false
  def  >(that: System.Security.AccessControl.AuditFlags): Boolean = false
  def >=(that: System.Security.AccessControl.AuditFlags): Boolean = false
  def  |(that: System.Security.AccessControl.AuditFlags): Boolean = false
  def  &(that: System.Security.AccessControl.AuditFlags): Boolean = false
  def  ^(that: System.Security.AccessControl.AuditFlags): Boolean = false
}
object AuditFlags{
  val None	 = value(0)
  val Success	 = value(1)
  val Failure	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.AuditFlags = null
}
 
sealed abstract class SecurityInfos extends System.Enum {
  def ==(that: System.Security.AccessControl.SecurityInfos): Boolean = false
  def !=(that: System.Security.AccessControl.SecurityInfos): Boolean = false
  def  <(that: System.Security.AccessControl.SecurityInfos): Boolean = false
  def <=(that: System.Security.AccessControl.SecurityInfos): Boolean = false
  def  >(that: System.Security.AccessControl.SecurityInfos): Boolean = false
  def >=(that: System.Security.AccessControl.SecurityInfos): Boolean = false
  def  |(that: System.Security.AccessControl.SecurityInfos): Boolean = false
  def  &(that: System.Security.AccessControl.SecurityInfos): Boolean = false
  def  ^(that: System.Security.AccessControl.SecurityInfos): Boolean = false
}
object SecurityInfos{
  val Owner	 = value(1)
  val Group	 = value(2)
  val DiscretionaryAcl	 = value(4)
  val SystemAcl	 = value(8)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.SecurityInfos = null
}
 
sealed abstract class ResourceType extends System.Enum {
  def ==(that: System.Security.AccessControl.ResourceType): Boolean = false
  def !=(that: System.Security.AccessControl.ResourceType): Boolean = false
  def  <(that: System.Security.AccessControl.ResourceType): Boolean = false
  def <=(that: System.Security.AccessControl.ResourceType): Boolean = false
  def  >(that: System.Security.AccessControl.ResourceType): Boolean = false
  def >=(that: System.Security.AccessControl.ResourceType): Boolean = false
  def  |(that: System.Security.AccessControl.ResourceType): Boolean = false
  def  &(that: System.Security.AccessControl.ResourceType): Boolean = false
  def  ^(that: System.Security.AccessControl.ResourceType): Boolean = false
}
object ResourceType{
  val Unknown	 = value(0)
  val FileObject	 = value(1)
  val Service	 = value(2)
  val Printer	 = value(3)
  val RegistryKey	 = value(4)
  val LMShare	 = value(5)
  val KernelObject	 = value(6)
  val WindowObject	 = value(7)
  val DSObject	 = value(8)
  val DSObjectAll	 = value(9)
  val ProviderDefined	 = value(10)
  val WmiGuidObject	 = value(11)
  val RegistryWow6432Key	 = value(12)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.ResourceType = null
}
 
sealed abstract class AccessControlSections extends System.Enum {
  def ==(that: System.Security.AccessControl.AccessControlSections): Boolean = false
  def !=(that: System.Security.AccessControl.AccessControlSections): Boolean = false
  def  <(that: System.Security.AccessControl.AccessControlSections): Boolean = false
  def <=(that: System.Security.AccessControl.AccessControlSections): Boolean = false
  def  >(that: System.Security.AccessControl.AccessControlSections): Boolean = false
  def >=(that: System.Security.AccessControl.AccessControlSections): Boolean = false
  def  |(that: System.Security.AccessControl.AccessControlSections): Boolean = false
  def  &(that: System.Security.AccessControl.AccessControlSections): Boolean = false
  def  ^(that: System.Security.AccessControl.AccessControlSections): Boolean = false
}
object AccessControlSections{
  val None	 = value(0)
  val Audit	 = value(1)
  val Access	 = value(2)
  val Owner	 = value(4)
  val Group	 = value(8)
  val All	 = value(15)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.AccessControlSections = null
}
 
sealed abstract class AccessControlActions extends System.Enum {
  def ==(that: System.Security.AccessControl.AccessControlActions): Boolean = false
  def !=(that: System.Security.AccessControl.AccessControlActions): Boolean = false
  def  <(that: System.Security.AccessControl.AccessControlActions): Boolean = false
  def <=(that: System.Security.AccessControl.AccessControlActions): Boolean = false
  def  >(that: System.Security.AccessControl.AccessControlActions): Boolean = false
  def >=(that: System.Security.AccessControl.AccessControlActions): Boolean = false
  def  |(that: System.Security.AccessControl.AccessControlActions): Boolean = false
  def  &(that: System.Security.AccessControl.AccessControlActions): Boolean = false
  def  ^(that: System.Security.AccessControl.AccessControlActions): Boolean = false
}
object AccessControlActions{
  val None	 = value(0)
  val View	 = value(1)
  val Change	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.AccessControlActions = null
}
 
sealed abstract class EventWaitHandleRights extends System.Enum {
  def ==(that: System.Security.AccessControl.EventWaitHandleRights): Boolean = false
  def !=(that: System.Security.AccessControl.EventWaitHandleRights): Boolean = false
  def  <(that: System.Security.AccessControl.EventWaitHandleRights): Boolean = false
  def <=(that: System.Security.AccessControl.EventWaitHandleRights): Boolean = false
  def  >(that: System.Security.AccessControl.EventWaitHandleRights): Boolean = false
  def >=(that: System.Security.AccessControl.EventWaitHandleRights): Boolean = false
  def  |(that: System.Security.AccessControl.EventWaitHandleRights): Boolean = false
  def  &(that: System.Security.AccessControl.EventWaitHandleRights): Boolean = false
  def  ^(that: System.Security.AccessControl.EventWaitHandleRights): Boolean = false
}
object EventWaitHandleRights{
  val Modify	 = value(2)
  val Delete	 = value(65536)
  val ReadPermissions	 = value(131072)
  val ChangePermissions	 = value(262144)
  val TakeOwnership	 = value(524288)
  val Synchronize	 = value(1048576)
  val FullControl	 = value(2031619)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.EventWaitHandleRights = null
}
 
sealed class EventWaitHandleAccessRule extends System.Security.AccessControl.AccessRule {
  val EventWaitHandleRights : System.Security.AccessControl.EventWaitHandleRights = System.Security.AccessControl.EventWaitHandleRights.Modify
   
  def this(identity : System.Security.Principal.IdentityReference, 
           eventRights : System.Security.AccessControl.EventWaitHandleRights, 
           `type` : System.Security.AccessControl.AccessControlType) {}
   
  def this(identity : String, 
           eventRights : System.Security.AccessControl.EventWaitHandleRights, 
           `type` : System.Security.AccessControl.AccessControlType) {}
}
 
sealed class EventWaitHandleAuditRule extends System.Security.AccessControl.AuditRule {
  val EventWaitHandleRights : System.Security.AccessControl.EventWaitHandleRights = System.Security.AccessControl.EventWaitHandleRights.Modify
   
  def this(identity : System.Security.Principal.IdentityReference, 
           eventRights : System.Security.AccessControl.EventWaitHandleRights, 
           flags : System.Security.AccessControl.AuditFlags) {}
}
 
sealed class EventWaitHandleSecurity extends System.Security.AccessControl.NativeObjectSecurity {
  def AccessRuleFactory(identityReference : System.Security.Principal.IdentityReference, accessMask : Int, 
                        isInherited : Boolean, 
                        inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                        propagationFlags : System.Security.AccessControl.PropagationFlags, 
                        `type` : System.Security.AccessControl.AccessControlType): System.Security.AccessControl.AccessRule
   
  def AuditRuleFactory(identityReference : System.Security.Principal.IdentityReference, accessMask : Int, 
                       isInherited : Boolean, 
                       inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                       propagationFlags : System.Security.AccessControl.PropagationFlags, 
                       flags : System.Security.AccessControl.AuditFlags): System.Security.AccessControl.AuditRule
   
  def AddAccessRule(rule : System.Security.AccessControl.EventWaitHandleAccessRule): Unit
   
  def SetAccessRule(rule : System.Security.AccessControl.EventWaitHandleAccessRule): Unit
   
  def ResetAccessRule(rule : System.Security.AccessControl.EventWaitHandleAccessRule): Unit
   
  def RemoveAccessRule(rule : System.Security.AccessControl.EventWaitHandleAccessRule): Boolean
   
  def RemoveAccessRuleAll(rule : System.Security.AccessControl.EventWaitHandleAccessRule): Unit
   
  def RemoveAccessRuleSpecific(rule : System.Security.AccessControl.EventWaitHandleAccessRule): Unit
   
  def AddAuditRule(rule : System.Security.AccessControl.EventWaitHandleAuditRule): Unit
   
  def SetAuditRule(rule : System.Security.AccessControl.EventWaitHandleAuditRule): Unit
   
  def RemoveAuditRule(rule : System.Security.AccessControl.EventWaitHandleAuditRule): Boolean
   
  def RemoveAuditRuleAll(rule : System.Security.AccessControl.EventWaitHandleAuditRule): Unit
   
  def RemoveAuditRuleSpecific(rule : System.Security.AccessControl.EventWaitHandleAuditRule): Unit
   
  val AccessRightType : System.Type = null
   
  val AccessRuleType : System.Type = null
   
  val AuditRuleType : System.Type = null
   
  def this() {}
}
 
sealed abstract class FileSystemRights extends System.Enum {
  def ==(that: System.Security.AccessControl.FileSystemRights): Boolean = false
  def !=(that: System.Security.AccessControl.FileSystemRights): Boolean = false
  def  <(that: System.Security.AccessControl.FileSystemRights): Boolean = false
  def <=(that: System.Security.AccessControl.FileSystemRights): Boolean = false
  def  >(that: System.Security.AccessControl.FileSystemRights): Boolean = false
  def >=(that: System.Security.AccessControl.FileSystemRights): Boolean = false
  def  |(that: System.Security.AccessControl.FileSystemRights): Boolean = false
  def  &(that: System.Security.AccessControl.FileSystemRights): Boolean = false
  def  ^(that: System.Security.AccessControl.FileSystemRights): Boolean = false
}
object FileSystemRights{
  val ReadData	 = value(1)
  val ListDirectory	 = value(1)
  val WriteData	 = value(2)
  val CreateFiles	 = value(2)
  val AppendData	 = value(4)
  val CreateDirectories	 = value(4)
  val ReadExtendedAttributes	 = value(8)
  val WriteExtendedAttributes	 = value(16)
  val ExecuteFile	 = value(32)
  val Traverse	 = value(32)
  val DeleteSubdirectoriesAndFiles	 = value(64)
  val ReadAttributes	 = value(128)
  val WriteAttributes	 = value(256)
  val Delete	 = value(65536)
  val ReadPermissions	 = value(131072)
  val ChangePermissions	 = value(262144)
  val TakeOwnership	 = value(524288)
  val Synchronize	 = value(1048576)
  val FullControl	 = value(2032127)
  val Read	 = value(131209)
  val ReadAndExecute	 = value(131241)
  val Write	 = value(278)
  val Modify	 = value(197055)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.FileSystemRights = null
}
 
sealed class FileSystemAccessRule extends System.Security.AccessControl.AccessRule {
  val FileSystemRights : System.Security.AccessControl.FileSystemRights = System.Security.AccessControl.FileSystemRights.ReadData
   
  def this(identity : System.Security.Principal.IdentityReference, 
           fileSystemRights : System.Security.AccessControl.FileSystemRights, 
           `type` : System.Security.AccessControl.AccessControlType) {}
   
  def this(identity : String, 
           fileSystemRights : System.Security.AccessControl.FileSystemRights, 
           `type` : System.Security.AccessControl.AccessControlType) {}
   
  def this(identity : System.Security.Principal.IdentityReference, 
           fileSystemRights : System.Security.AccessControl.FileSystemRights, 
           inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
           propagationFlags : System.Security.AccessControl.PropagationFlags, 
           `type` : System.Security.AccessControl.AccessControlType) {}
   
  def this(identity : String, 
           fileSystemRights : System.Security.AccessControl.FileSystemRights, 
           inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
           propagationFlags : System.Security.AccessControl.PropagationFlags, 
           `type` : System.Security.AccessControl.AccessControlType) {}
}
 
sealed class FileSystemAuditRule extends System.Security.AccessControl.AuditRule {
  val FileSystemRights : System.Security.AccessControl.FileSystemRights = System.Security.AccessControl.FileSystemRights.ReadData
   
  def this(identity : System.Security.Principal.IdentityReference, 
           fileSystemRights : System.Security.AccessControl.FileSystemRights, 
           flags : System.Security.AccessControl.AuditFlags) {}
   
  def this(identity : System.Security.Principal.IdentityReference, 
           fileSystemRights : System.Security.AccessControl.FileSystemRights, 
           inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
           propagationFlags : System.Security.AccessControl.PropagationFlags, 
           flags : System.Security.AccessControl.AuditFlags) {}
   
  def this(identity : String, 
           fileSystemRights : System.Security.AccessControl.FileSystemRights, 
           flags : System.Security.AccessControl.AuditFlags) {}
   
  def this(identity : String, 
           fileSystemRights : System.Security.AccessControl.FileSystemRights, 
           inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
           propagationFlags : System.Security.AccessControl.PropagationFlags, 
           flags : System.Security.AccessControl.AuditFlags) {}
}
 
abstract class FileSystemSecurity extends System.Security.AccessControl.NativeObjectSecurity {
  def AccessRuleFactory(identityReference : System.Security.Principal.IdentityReference, accessMask : Int, 
                        isInherited : Boolean, 
                        inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                        propagationFlags : System.Security.AccessControl.PropagationFlags, 
                        `type` : System.Security.AccessControl.AccessControlType): System.Security.AccessControl.AccessRule
   
  def AuditRuleFactory(identityReference : System.Security.Principal.IdentityReference, accessMask : Int, 
                       isInherited : Boolean, 
                       inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                       propagationFlags : System.Security.AccessControl.PropagationFlags, 
                       flags : System.Security.AccessControl.AuditFlags): System.Security.AccessControl.AuditRule
   
  def AddAccessRule(rule : System.Security.AccessControl.FileSystemAccessRule): Unit
   
  def SetAccessRule(rule : System.Security.AccessControl.FileSystemAccessRule): Unit
   
  def ResetAccessRule(rule : System.Security.AccessControl.FileSystemAccessRule): Unit
   
  def RemoveAccessRule(rule : System.Security.AccessControl.FileSystemAccessRule): Boolean
   
  def RemoveAccessRuleAll(rule : System.Security.AccessControl.FileSystemAccessRule): Unit
   
  def RemoveAccessRuleSpecific(rule : System.Security.AccessControl.FileSystemAccessRule): Unit
   
  def AddAuditRule(rule : System.Security.AccessControl.FileSystemAuditRule): Unit
   
  def SetAuditRule(rule : System.Security.AccessControl.FileSystemAuditRule): Unit
   
  def RemoveAuditRule(rule : System.Security.AccessControl.FileSystemAuditRule): Boolean
   
  def RemoveAuditRuleAll(rule : System.Security.AccessControl.FileSystemAuditRule): Unit
   
  def RemoveAuditRuleSpecific(rule : System.Security.AccessControl.FileSystemAuditRule): Unit
   
  val AccessRightType : System.Type = null
   
  val AccessRuleType : System.Type = null
   
  val AuditRuleType : System.Type = null
}
 
sealed class FileSecurity extends System.Security.AccessControl.FileSystemSecurity {
  def this() {}
   
  def this(fileName : String, 
           includeSections : System.Security.AccessControl.AccessControlSections) {}
}
 
sealed class DirectorySecurity extends System.Security.AccessControl.FileSystemSecurity {
  def this() {}
   
  def this(name : String, 
           includeSections : System.Security.AccessControl.AccessControlSections) {}
}
 
sealed abstract class MutexRights extends System.Enum {
  def ==(that: System.Security.AccessControl.MutexRights): Boolean = false
  def !=(that: System.Security.AccessControl.MutexRights): Boolean = false
  def  <(that: System.Security.AccessControl.MutexRights): Boolean = false
  def <=(that: System.Security.AccessControl.MutexRights): Boolean = false
  def  >(that: System.Security.AccessControl.MutexRights): Boolean = false
  def >=(that: System.Security.AccessControl.MutexRights): Boolean = false
  def  |(that: System.Security.AccessControl.MutexRights): Boolean = false
  def  &(that: System.Security.AccessControl.MutexRights): Boolean = false
  def  ^(that: System.Security.AccessControl.MutexRights): Boolean = false
}
object MutexRights{
  val Modify	 = value(1)
  val Delete	 = value(65536)
  val ReadPermissions	 = value(131072)
  val ChangePermissions	 = value(262144)
  val TakeOwnership	 = value(524288)
  val Synchronize	 = value(1048576)
  val FullControl	 = value(2031617)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.MutexRights = null
}
 
sealed class MutexAccessRule extends System.Security.AccessControl.AccessRule {
  val MutexRights : System.Security.AccessControl.MutexRights = System.Security.AccessControl.MutexRights.Modify
   
  def this(identity : System.Security.Principal.IdentityReference, 
           eventRights : System.Security.AccessControl.MutexRights, 
           `type` : System.Security.AccessControl.AccessControlType) {}
   
  def this(identity : String, eventRights : System.Security.AccessControl.MutexRights, 
           `type` : System.Security.AccessControl.AccessControlType) {}
}
 
sealed class MutexAuditRule extends System.Security.AccessControl.AuditRule {
  val MutexRights : System.Security.AccessControl.MutexRights = System.Security.AccessControl.MutexRights.Modify
   
  def this(identity : System.Security.Principal.IdentityReference, 
           eventRights : System.Security.AccessControl.MutexRights, 
           flags : System.Security.AccessControl.AuditFlags) {}
}
 
sealed class MutexSecurity extends System.Security.AccessControl.NativeObjectSecurity {
  def AccessRuleFactory(identityReference : System.Security.Principal.IdentityReference, accessMask : Int, 
                        isInherited : Boolean, 
                        inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                        propagationFlags : System.Security.AccessControl.PropagationFlags, 
                        `type` : System.Security.AccessControl.AccessControlType): System.Security.AccessControl.AccessRule
   
  def AuditRuleFactory(identityReference : System.Security.Principal.IdentityReference, accessMask : Int, 
                       isInherited : Boolean, 
                       inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                       propagationFlags : System.Security.AccessControl.PropagationFlags, 
                       flags : System.Security.AccessControl.AuditFlags): System.Security.AccessControl.AuditRule
   
  def AddAccessRule(rule : System.Security.AccessControl.MutexAccessRule): Unit
   
  def SetAccessRule(rule : System.Security.AccessControl.MutexAccessRule): Unit
   
  def ResetAccessRule(rule : System.Security.AccessControl.MutexAccessRule): Unit
   
  def RemoveAccessRule(rule : System.Security.AccessControl.MutexAccessRule): Boolean
   
  def RemoveAccessRuleAll(rule : System.Security.AccessControl.MutexAccessRule): Unit
   
  def RemoveAccessRuleSpecific(rule : System.Security.AccessControl.MutexAccessRule): Unit
   
  def AddAuditRule(rule : System.Security.AccessControl.MutexAuditRule): Unit
   
  def SetAuditRule(rule : System.Security.AccessControl.MutexAuditRule): Unit
   
  def RemoveAuditRule(rule : System.Security.AccessControl.MutexAuditRule): Boolean
   
  def RemoveAuditRuleAll(rule : System.Security.AccessControl.MutexAuditRule): Unit
   
  def RemoveAuditRuleSpecific(rule : System.Security.AccessControl.MutexAuditRule): Unit
   
  val AccessRightType : System.Type = null
   
  val AccessRuleType : System.Type = null
   
  val AuditRuleType : System.Type = null
   
  def this() {}
   
  def this(name : String, 
           includeSections : System.Security.AccessControl.AccessControlSections) {}
}
 
sealed abstract class AccessControlModification extends System.Enum {
  def ==(that: System.Security.AccessControl.AccessControlModification): Boolean = false
  def !=(that: System.Security.AccessControl.AccessControlModification): Boolean = false
  def  <(that: System.Security.AccessControl.AccessControlModification): Boolean = false
  def <=(that: System.Security.AccessControl.AccessControlModification): Boolean = false
  def  >(that: System.Security.AccessControl.AccessControlModification): Boolean = false
  def >=(that: System.Security.AccessControl.AccessControlModification): Boolean = false
  def  |(that: System.Security.AccessControl.AccessControlModification): Boolean = false
  def  &(that: System.Security.AccessControl.AccessControlModification): Boolean = false
  def  ^(that: System.Security.AccessControl.AccessControlModification): Boolean = false
}
object AccessControlModification{
  val Add	 = value(0)
  val Set	 = value(1)
  val Reset	 = value(2)
  val Remove	 = value(3)
  val RemoveAll	 = value(4)
  val RemoveSpecific	 = value(5)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.AccessControlModification = null
}
 
abstract class DirectoryObjectSecurity extends System.Security.AccessControl.ObjectSecurity {
  def AccessRuleFactory(identityReference : System.Security.Principal.IdentityReference, accessMask : Int, 
                        isInherited : Boolean, 
                        inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                        propagationFlags : System.Security.AccessControl.PropagationFlags, 
                        `type` : System.Security.AccessControl.AccessControlType, objectType : System.Guid, 
                        inheritedObjectType : System.Guid): System.Security.AccessControl.AccessRule
   
  def AuditRuleFactory(identityReference : System.Security.Principal.IdentityReference, accessMask : Int, 
                       isInherited : Boolean, 
                       inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                       propagationFlags : System.Security.AccessControl.PropagationFlags, 
                       flags : System.Security.AccessControl.AuditFlags, objectType : System.Guid, 
                       inheritedObjectType : System.Guid): System.Security.AccessControl.AuditRule
   
  protected def ModifyAccess(modification : System.Security.AccessControl.AccessControlModification, 
                             rule : System.Security.AccessControl.AccessRule, modified : CLRByRef[Boolean]): Boolean
   
  protected def ModifyAudit(modification : System.Security.AccessControl.AccessControlModification, 
                            rule : System.Security.AccessControl.AuditRule, modified : CLRByRef[Boolean]): Boolean
   
  protected def AddAccessRule(rule : System.Security.AccessControl.ObjectAccessRule): Unit
   
  protected def SetAccessRule(rule : System.Security.AccessControl.ObjectAccessRule): Unit
   
  protected def ResetAccessRule(rule : System.Security.AccessControl.ObjectAccessRule): Unit
   
  protected def RemoveAccessRule(rule : System.Security.AccessControl.ObjectAccessRule): Boolean
   
  protected def RemoveAccessRuleAll(rule : System.Security.AccessControl.ObjectAccessRule): Unit
   
  protected def RemoveAccessRuleSpecific(rule : System.Security.AccessControl.ObjectAccessRule): Unit
   
  protected def AddAuditRule(rule : System.Security.AccessControl.ObjectAuditRule): Unit
   
  protected def SetAuditRule(rule : System.Security.AccessControl.ObjectAuditRule): Unit
   
  protected def RemoveAuditRule(rule : System.Security.AccessControl.ObjectAuditRule): Boolean
   
  protected def RemoveAuditRuleAll(rule : System.Security.AccessControl.ObjectAuditRule): Unit
   
  protected def RemoveAuditRuleSpecific(rule : System.Security.AccessControl.ObjectAuditRule): Unit
   
  def GetAccessRules(includeExplicit : Boolean, includeInherited : Boolean, targetType : System.Type): System.Security.AccessControl.AuthorizationRuleCollection
   
  def GetAuditRules(includeExplicit : Boolean, includeInherited : Boolean, targetType : System.Type): System.Security.AccessControl.AuthorizationRuleCollection
   
  protected def this() {}
   
  protected def this(securityDescriptor : System.Security.AccessControl.CommonSecurityDescriptor) {}
}
 
sealed class PrivilegeNotHeldException extends System.UnauthorizedAccessException with System.Runtime.Serialization.ISerializable {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  val PrivilegeName : String = ""
   
  def this() {}
   
  def this(privilege : String) {}
   
  def this(privilege : String, inner : System.Exception) {}
}
 
sealed abstract class RegistryRights extends System.Enum {
  def ==(that: System.Security.AccessControl.RegistryRights): Boolean = false
  def !=(that: System.Security.AccessControl.RegistryRights): Boolean = false
  def  <(that: System.Security.AccessControl.RegistryRights): Boolean = false
  def <=(that: System.Security.AccessControl.RegistryRights): Boolean = false
  def  >(that: System.Security.AccessControl.RegistryRights): Boolean = false
  def >=(that: System.Security.AccessControl.RegistryRights): Boolean = false
  def  |(that: System.Security.AccessControl.RegistryRights): Boolean = false
  def  &(that: System.Security.AccessControl.RegistryRights): Boolean = false
  def  ^(that: System.Security.AccessControl.RegistryRights): Boolean = false
}
object RegistryRights{
  val QueryValues	 = value(1)
  val SetValue	 = value(2)
  val CreateSubKey	 = value(4)
  val EnumerateSubKeys	 = value(8)
  val Notify	 = value(16)
  val CreateLink	 = value(32)
  val ExecuteKey	 = value(131097)
  val ReadKey	 = value(131097)
  val WriteKey	 = value(131078)
  val Delete	 = value(65536)
  val ReadPermissions	 = value(131072)
  val ChangePermissions	 = value(262144)
  val TakeOwnership	 = value(524288)
  val FullControl	 = value(983103)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.RegistryRights = null
}
 
sealed class RegistryAccessRule extends System.Security.AccessControl.AccessRule {
  val RegistryRights : System.Security.AccessControl.RegistryRights = System.Security.AccessControl.RegistryRights.QueryValues
   
  def this(identity : System.Security.Principal.IdentityReference, 
           registryRights : System.Security.AccessControl.RegistryRights, 
           `type` : System.Security.AccessControl.AccessControlType) {}
   
  def this(identity : String, registryRights : System.Security.AccessControl.RegistryRights, 
           `type` : System.Security.AccessControl.AccessControlType) {}
   
  def this(identity : System.Security.Principal.IdentityReference, 
           registryRights : System.Security.AccessControl.RegistryRights, 
           inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
           propagationFlags : System.Security.AccessControl.PropagationFlags, 
           `type` : System.Security.AccessControl.AccessControlType) {}
   
  def this(identity : String, registryRights : System.Security.AccessControl.RegistryRights, 
           inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
           propagationFlags : System.Security.AccessControl.PropagationFlags, 
           `type` : System.Security.AccessControl.AccessControlType) {}
}
 
sealed class RegistryAuditRule extends System.Security.AccessControl.AuditRule {
  val RegistryRights : System.Security.AccessControl.RegistryRights = System.Security.AccessControl.RegistryRights.QueryValues
   
  def this(identity : System.Security.Principal.IdentityReference, 
           registryRights : System.Security.AccessControl.RegistryRights, 
           inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
           propagationFlags : System.Security.AccessControl.PropagationFlags, 
           flags : System.Security.AccessControl.AuditFlags) {}
   
  def this(identity : String, registryRights : System.Security.AccessControl.RegistryRights, 
           inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
           propagationFlags : System.Security.AccessControl.PropagationFlags, 
           flags : System.Security.AccessControl.AuditFlags) {}
}
 
sealed class RegistrySecurity extends System.Security.AccessControl.NativeObjectSecurity {
  def AccessRuleFactory(identityReference : System.Security.Principal.IdentityReference, accessMask : Int, 
                        isInherited : Boolean, 
                        inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                        propagationFlags : System.Security.AccessControl.PropagationFlags, 
                        `type` : System.Security.AccessControl.AccessControlType): System.Security.AccessControl.AccessRule
   
  def AuditRuleFactory(identityReference : System.Security.Principal.IdentityReference, accessMask : Int, 
                       isInherited : Boolean, 
                       inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                       propagationFlags : System.Security.AccessControl.PropagationFlags, 
                       flags : System.Security.AccessControl.AuditFlags): System.Security.AccessControl.AuditRule
   
  def AddAccessRule(rule : System.Security.AccessControl.RegistryAccessRule): Unit
   
  def SetAccessRule(rule : System.Security.AccessControl.RegistryAccessRule): Unit
   
  def ResetAccessRule(rule : System.Security.AccessControl.RegistryAccessRule): Unit
   
  def RemoveAccessRule(rule : System.Security.AccessControl.RegistryAccessRule): Boolean
   
  def RemoveAccessRuleAll(rule : System.Security.AccessControl.RegistryAccessRule): Unit
   
  def RemoveAccessRuleSpecific(rule : System.Security.AccessControl.RegistryAccessRule): Unit
   
  def AddAuditRule(rule : System.Security.AccessControl.RegistryAuditRule): Unit
   
  def SetAuditRule(rule : System.Security.AccessControl.RegistryAuditRule): Unit
   
  def RemoveAuditRule(rule : System.Security.AccessControl.RegistryAuditRule): Boolean
   
  def RemoveAuditRuleAll(rule : System.Security.AccessControl.RegistryAuditRule): Unit
   
  def RemoveAuditRuleSpecific(rule : System.Security.AccessControl.RegistryAuditRule): Unit
   
  val AccessRightType : System.Type = null
   
  val AccessRuleType : System.Type = null
   
  val AuditRuleType : System.Type = null
   
  def this() {}
}
 
sealed abstract class AccessControlType extends System.Enum {
  def ==(that: System.Security.AccessControl.AccessControlType): Boolean = false
  def !=(that: System.Security.AccessControl.AccessControlType): Boolean = false
  def  <(that: System.Security.AccessControl.AccessControlType): Boolean = false
  def <=(that: System.Security.AccessControl.AccessControlType): Boolean = false
  def  >(that: System.Security.AccessControl.AccessControlType): Boolean = false
  def >=(that: System.Security.AccessControl.AccessControlType): Boolean = false
  def  |(that: System.Security.AccessControl.AccessControlType): Boolean = false
  def  &(that: System.Security.AccessControl.AccessControlType): Boolean = false
  def  ^(that: System.Security.AccessControl.AccessControlType): Boolean = false
}
object AccessControlType{
  val Allow	 = value(0)
  val Deny	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.AccessControlType = null
}
 
abstract class ObjectAccessRule extends System.Security.AccessControl.AccessRule {
  val ObjectType : System.Guid = new System.Guid()
   
  val InheritedObjectType : System.Guid = new System.Guid()
   
  val ObjectFlags : System.Security.AccessControl.ObjectAceFlags = System.Security.AccessControl.ObjectAceFlags.None
   
  protected def this(identity : System.Security.Principal.IdentityReference, accessMask : Int, 
                     isInherited : Boolean, 
                     inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                     propagationFlags : System.Security.AccessControl.PropagationFlags, 
                     objectType : System.Guid, inheritedObjectType : System.Guid, 
                     `type` : System.Security.AccessControl.AccessControlType) {}
}
 
abstract class ObjectAuditRule extends System.Security.AccessControl.AuditRule {
  val ObjectType : System.Guid = new System.Guid()
   
  val InheritedObjectType : System.Guid = new System.Guid()
   
  val ObjectFlags : System.Security.AccessControl.ObjectAceFlags = System.Security.AccessControl.ObjectAceFlags.None
   
  protected def this(identity : System.Security.Principal.IdentityReference, accessMask : Int, 
                     isInherited : Boolean, 
                     inheritanceFlags : System.Security.AccessControl.InheritanceFlags, 
                     propagationFlags : System.Security.AccessControl.PropagationFlags, 
                     objectType : System.Guid, inheritedObjectType : System.Guid, 
                     auditFlags : System.Security.AccessControl.AuditFlags) {}
}
 
@System.Reflection.DefaultMemberAttribute("Item")
sealed class AuthorizationRuleCollection extends System.Collections.ReadOnlyCollectionBase {
  def CopyTo(rules : Array[System.Security.AccessControl.AuthorizationRule], index : Int): Unit
   
  /* parameterful property Item */
  def Item(index : Int): System.Security.AccessControl.AuthorizationRule
}
 
sealed abstract class ControlFlags extends System.Enum {
  def ==(that: System.Security.AccessControl.ControlFlags): Boolean = false
  def !=(that: System.Security.AccessControl.ControlFlags): Boolean = false
  def  <(that: System.Security.AccessControl.ControlFlags): Boolean = false
  def <=(that: System.Security.AccessControl.ControlFlags): Boolean = false
  def  >(that: System.Security.AccessControl.ControlFlags): Boolean = false
  def >=(that: System.Security.AccessControl.ControlFlags): Boolean = false
  def  |(that: System.Security.AccessControl.ControlFlags): Boolean = false
  def  &(that: System.Security.AccessControl.ControlFlags): Boolean = false
  def  ^(that: System.Security.AccessControl.ControlFlags): Boolean = false
}
object ControlFlags{
  val None	 = value(0)
  val OwnerDefaulted	 = value(1)
  val GroupDefaulted	 = value(2)
  val DiscretionaryAclPresent	 = value(4)
  val DiscretionaryAclDefaulted	 = value(8)
  val SystemAclPresent	 = value(16)
  val SystemAclDefaulted	 = value(32)
  val DiscretionaryAclUntrusted	 = value(64)
  val ServerSecurity	 = value(128)
  val DiscretionaryAclAutoInheritRequired	 = value(256)
  val SystemAclAutoInheritRequired	 = value(512)
  val DiscretionaryAclAutoInherited	 = value(1024)
  val SystemAclAutoInherited	 = value(2048)
  val DiscretionaryAclProtected	 = value(4096)
  val SystemAclProtected	 = value(8192)
  val RMControlValid	 = value(16384)
  val SelfRelative	 = value(32768)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.AccessControl.ControlFlags = null
}
 
abstract class GenericSecurityDescriptor extends AnyRef {
  def GetSddlForm(includeSections : System.Security.AccessControl.AccessControlSections): String
   
  def GetBinaryForm(binaryForm : Array[UByte], offset : Int): Unit
   
  val ControlFlags : System.Security.AccessControl.ControlFlags = System.Security.AccessControl.ControlFlags.None
   
  var Owner : System.Security.Principal.SecurityIdentifier = null
   
  var Group : System.Security.Principal.SecurityIdentifier = null
   
  val BinaryLength : Int = 0
   
  protected def this() {}
}
object GenericSecurityDescriptor {
  def IsSddlConversionSupported: Boolean  = false
   
  val Revision : UByte = 0
}
 
sealed class RawSecurityDescriptor extends System.Security.AccessControl.GenericSecurityDescriptor {
  def SetFlags(flags : System.Security.AccessControl.ControlFlags): Unit
   
  val ControlFlags : System.Security.AccessControl.ControlFlags = System.Security.AccessControl.ControlFlags.None
   
  var Owner : System.Security.Principal.SecurityIdentifier = null
   
  var Group : System.Security.Principal.SecurityIdentifier = null
   
  var SystemAcl : System.Security.AccessControl.RawAcl = null
   
  var DiscretionaryAcl : System.Security.AccessControl.RawAcl = null
   
  var ResourceManagerControl : UByte = 0
   
  def this(flags : System.Security.AccessControl.ControlFlags, 
           owner : System.Security.Principal.SecurityIdentifier, 
           group : System.Security.Principal.SecurityIdentifier, 
           systemAcl : System.Security.AccessControl.RawAcl, 
           discretionaryAcl : System.Security.AccessControl.RawAcl) {}
   
  def this(sddlForm : String) {}
   
  def this(binaryForm : Array[UByte], offset : Int) {}
}
 
sealed class CommonSecurityDescriptor extends System.Security.AccessControl.GenericSecurityDescriptor {
  def SetSystemAclProtection(isProtected : Boolean, preserveInheritance : Boolean): Unit
   
  def SetDiscretionaryAclProtection(isProtected : Boolean, preserveInheritance : Boolean): Unit
   
  def PurgeAccessControl(sid : System.Security.Principal.SecurityIdentifier): Unit
   
  def PurgeAudit(sid : System.Security.Principal.SecurityIdentifier): Unit
   
  val IsContainer : Boolean = false
   
  val IsDS : Boolean = false
   
  val ControlFlags : System.Security.AccessControl.ControlFlags = System.Security.AccessControl.ControlFlags.None
   
  var Owner : System.Security.Principal.SecurityIdentifier = null
   
  var Group : System.Security.Principal.SecurityIdentifier = null
   
  var SystemAcl : System.Security.AccessControl.SystemAcl = null
   
  var DiscretionaryAcl : System.Security.AccessControl.DiscretionaryAcl = null
   
  val IsSystemAclCanonical : Boolean = false
   
  val IsDiscretionaryAclCanonical : Boolean = false
   
  def this(isContainer : Boolean, isDS : Boolean, 
           flags : System.Security.AccessControl.ControlFlags, 
           owner : System.Security.Principal.SecurityIdentifier, 
           group : System.Security.Principal.SecurityIdentifier, 
           systemAcl : System.Security.AccessControl.SystemAcl, 
           discretionaryAcl : System.Security.AccessControl.DiscretionaryAcl) {}
   
  def this(isContainer : Boolean, isDS : Boolean, 
           rawSecurityDescriptor : System.Security.AccessControl.RawSecurityDescriptor) {}
   
  def this(isContainer : Boolean, isDS : Boolean, sddlForm : String) {}
   
  def this(isContainer : Boolean, isDS : Boolean, binaryForm : Array[UByte], offset : Int) {}
}
 
}