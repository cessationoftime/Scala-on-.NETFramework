 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Reflection {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.AutoDual)
abstract class Binder extends AnyRef {
  /* abstract */ def BindToField(bindingAttr : System.Reflection.BindingFlags, 
                                 `match` : Array[System.Reflection.FieldInfo], value : AnyRef, 
                                 culture : System.Globalization.CultureInfo): System.Reflection.FieldInfo
   
  /* abstract */ def SelectMethod(bindingAttr : System.Reflection.BindingFlags, 
                                  `match` : Array[System.Reflection.MethodBase], types : Array[System.Type], 
                                  modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.MethodBase
   
  /* abstract */ def SelectProperty(bindingAttr : System.Reflection.BindingFlags, 
                                    `match` : Array[System.Reflection.PropertyInfo], returnType : System.Type, 
                                    indexes : Array[System.Type], 
                                    modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.PropertyInfo
   
  /* abstract */ def ChangeType(value : AnyRef, `type` : System.Type, culture : System.Globalization.CultureInfo): AnyRef
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ICustomAttributeProvider {
  /* abstract */ def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
abstract class MemberInfo extends AnyRef with System.Reflection.ICustomAttributeProvider with 
                                  System.Runtime.InteropServices._MemberInfo {
  /* abstract */ def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  val MemberType : System.Reflection.MemberTypes = System.Reflection.MemberTypes.Constructor
   
  val Name : String = ""
   
  val DeclaringType : System.Type = null
   
  val ReflectedType : System.Type = null
   
  val MetadataToken : Int = 0
   
  val Module : System.Reflection.Module = null
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.GuidAttribute("AFBF15E5-C37C-11d2-B88E-00A0C9B471B8")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IReflect {
  /* abstract */ def GetMethod(name : String, bindingAttr : System.Reflection.BindingFlags, 
                               binder : System.Reflection.Binder, types : Array[System.Type], 
                               modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.MethodInfo
   
  /* abstract */ def GetMethod(name : String, bindingAttr : System.Reflection.BindingFlags): System.Reflection.MethodInfo
   
  /* abstract */ def GetMethods(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MethodInfo]
   
  /* abstract */ def GetField(name : String, bindingAttr : System.Reflection.BindingFlags): System.Reflection.FieldInfo
   
  /* abstract */ def GetFields(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.FieldInfo]
   
  /* abstract */ def GetProperty(name : String, bindingAttr : System.Reflection.BindingFlags): System.Reflection.PropertyInfo
   
  /* abstract */ def GetProperty(name : String, bindingAttr : System.Reflection.BindingFlags, 
                                 binder : System.Reflection.Binder, returnType : System.Type, 
                                 types : Array[System.Type], modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.PropertyInfo
   
  /* abstract */ def GetProperties(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.PropertyInfo]
   
  /* abstract */ def GetMember(name : String, bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MemberInfo]
   
  /* abstract */ def GetMembers(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MemberInfo]
   
  /* abstract */ def InvokeMember(name : String, invokeAttr : System.Reflection.BindingFlags, 
                                  binder : System.Reflection.Binder, target : AnyRef, args : Array[AnyRef], 
                                  modifiers : Array[System.Reflection.ParameterModifier], 
                                  culture : System.Globalization.CultureInfo, namedParameters : Array[String]): AnyRef
   
  val UnderlyingSystemType : System.Type = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AmbiguousMatchException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ModuleResolveEventHandler extends System.MulticastDelegate {
  def Invoke(sender : AnyRef, e : System.ResolveEventArgs): System.Reflection.Module
   
  def BeginInvoke(sender : AnyRef, e : System.ResolveEventArgs, callback : System.AsyncCallback, 
                  `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): System.Reflection.Module
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
class Assembly extends AnyRef with System.Runtime.InteropServices._Assembly with System.Security.IEvidenceFactory with 
                       System.Reflection.ICustomAttributeProvider with 
                       System.Runtime.Serialization.ISerializable {
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def add_ModuleResolve(value : System.Reflection.ModuleResolveEventHandler): Unit
   
  def remove_ModuleResolve(value : System.Reflection.ModuleResolveEventHandler): Unit
   
  def GetName: System.Reflection.AssemblyName
   
  def GetName(copiedName : Boolean): System.Reflection.AssemblyName
   
  def GetType(name : String): System.Type
   
  def GetType(name : String, throwOnError : Boolean): System.Type
   
  def GetType(name : String, throwOnError : Boolean, ignoreCase : Boolean): System.Type
   
  def GetExportedTypes: Array[System.Type]
   
  def GetTypes: Array[System.Type]
   
  def GetManifestResourceStream(`type` : System.Type, name : String): System.IO.Stream
   
  def GetManifestResourceStream(name : String): System.IO.Stream
   
  def GetSatelliteAssembly(culture : System.Globalization.CultureInfo): System.Reflection.Assembly
   
  def GetSatelliteAssembly(culture : System.Globalization.CultureInfo, version : System.Version): System.Reflection.Assembly
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  def LoadModule(moduleName : String, rawModule : Array[UByte]): System.Reflection.Module
   
  def LoadModule(moduleName : String, rawModule : Array[UByte], rawSymbolStore : Array[UByte]): System.Reflection.Module
   
  def CreateInstance(typeName : String): AnyRef
   
  def CreateInstance(typeName : String, ignoreCase : Boolean): AnyRef
   
  def CreateInstance(typeName : String, ignoreCase : Boolean, 
                     bindingAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                     args : Array[AnyRef], culture : System.Globalization.CultureInfo, 
                     activationAttributes : Array[AnyRef]): AnyRef
   
  def GetLoadedModules: Array[System.Reflection.Module]
   
  def GetLoadedModules(getResourceModules : Boolean): Array[System.Reflection.Module]
   
  def GetModules: Array[System.Reflection.Module]
   
  def GetModules(getResourceModules : Boolean): Array[System.Reflection.Module]
   
  def GetModule(name : String): System.Reflection.Module
   
  def GetFile(name : String): System.IO.FileStream
   
  def GetFiles: Array[System.IO.FileStream]
   
  def GetFiles(getResourceModules : Boolean): Array[System.IO.FileStream]
   
  def GetManifestResourceNames: Array[String]
   
  def GetReferencedAssemblies: Array[System.Reflection.AssemblyName]
   
  def GetManifestResourceInfo(resourceName : String): System.Reflection.ManifestResourceInfo
   
  def ToString: String
   
  val CodeBase : String = ""
   
  val EscapedCodeBase : String = ""
   
  val FullName : String = ""
   
  val EntryPoint : System.Reflection.MethodInfo = null
   
  val Evidence : System.Security.Policy.Evidence = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val ManifestModule : System.Reflection.Module = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val ReflectionOnly : Boolean = false
   
  val Location : String = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val ImageRuntimeVersion : String = ""
   
  val GlobalAssemblyCache : Boolean = false
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val HostContext : Long = 0
   
  /* event ModuleResolve */
  def add_ModuleResolve(value : System.Reflection.ModuleResolveEventHandler): Unit
  def remove_ModuleResolve(value : System.Reflection.ModuleResolveEventHandler): Unit
}
object Assembly {
  def CreateQualifiedName(assemblyName : String, typeName : String): String  = ""
   
  def GetAssembly(`type` : System.Type): System.Reflection.Assembly  = null
   
  def LoadFrom(assemblyFile : String): System.Reflection.Assembly  = null
   
  def ReflectionOnlyLoadFrom(assemblyFile : String): System.Reflection.Assembly  = null
   
  def LoadFrom(assemblyFile : String, securityEvidence : System.Security.Policy.Evidence): System.Reflection.Assembly  = null
   
  def LoadFrom(assemblyFile : String, securityEvidence : System.Security.Policy.Evidence, 
               hashValue : Array[UByte], 
               hashAlgorithm : System.Configuration.Assemblies.AssemblyHashAlgorithm): System.Reflection.Assembly  = null
   
  def Load(assemblyString : String): System.Reflection.Assembly  = null
   
  def ReflectionOnlyLoad(assemblyString : String): System.Reflection.Assembly  = null
   
  def Load(assemblyString : String, assemblySecurity : System.Security.Policy.Evidence): System.Reflection.Assembly  = null
   
  def Load(assemblyRef : System.Reflection.AssemblyName): System.Reflection.Assembly  = null
   
  def Load(assemblyRef : System.Reflection.AssemblyName, 
           assemblySecurity : System.Security.Policy.Evidence): System.Reflection.Assembly  = null
   
  @System.ObsoleteAttribute("This method has been deprecated. Please use Assembly.Load() instead. http://go.microsoft.com/fwlink/?linkid=14202")
  def LoadWithPartialName(partialName : String): System.Reflection.Assembly  = null
   
  @System.ObsoleteAttribute("This method has been deprecated. Please use Assembly.Load() instead. http://go.microsoft.com/fwlink/?linkid=14202")
  def LoadWithPartialName(partialName : String, securityEvidence : System.Security.Policy.Evidence): System.Reflection.Assembly  = null
   
  def Load(rawAssembly : Array[UByte]): System.Reflection.Assembly  = null
   
  def ReflectionOnlyLoad(rawAssembly : Array[UByte]): System.Reflection.Assembly  = null
   
  def Load(rawAssembly : Array[UByte], rawSymbolStore : Array[UByte]): System.Reflection.Assembly  = null
   
  def Load(rawAssembly : Array[UByte], rawSymbolStore : Array[UByte], 
           securityEvidence : System.Security.Policy.Evidence): System.Reflection.Assembly  = null
   
  def LoadFile(path : String): System.Reflection.Assembly  = null
   
  def LoadFile(path : String, securityEvidence : System.Security.Policy.Evidence): System.Reflection.Assembly  = null
   
  def GetExecutingAssembly: System.Reflection.Assembly  = null
   
  def GetCallingAssembly: System.Reflection.Assembly  = null
   
  def GetEntryAssembly: System.Reflection.Assembly  = null
}
 
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AssemblyCopyrightAttribute extends System.Attribute {
  val Copyright : String = ""
   
  def this(copyright : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
sealed class AssemblyTrademarkAttribute extends System.Attribute {
  val Trademark : String = ""
   
  def this(trademark : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
sealed class AssemblyProductAttribute extends System.Attribute {
  val Product : String = ""
   
  def this(product : String) {}
}
 
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AssemblyCompanyAttribute extends System.Attribute {
  val Company : String = ""
   
  def this(company : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
sealed class AssemblyDescriptionAttribute extends System.Attribute {
  val Description : String = ""
   
  def this(description : String) {}
}
 
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AssemblyTitleAttribute extends System.Attribute {
  val Title : String = ""
   
  def this(title : String) {}
}
 
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AssemblyConfigurationAttribute extends System.Attribute {
  val Configuration : String = ""
   
  def this(configuration : String) {}
}
 
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AssemblyDefaultAliasAttribute extends System.Attribute {
  val DefaultAlias : String = ""
   
  def this(defaultAlias : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
sealed class AssemblyInformationalVersionAttribute extends System.Attribute {
  val InformationalVersion : String = ""
   
  def this(informationalVersion : String) {}
}
 
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AssemblyFileVersionAttribute extends System.Attribute {
  val Version : String = ""
   
  def this(version : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
sealed class AssemblyCultureAttribute extends System.Attribute {
  val Culture : String = ""
   
  def this(culture : String) {}
}
 
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AssemblyVersionAttribute extends System.Attribute {
  val Version : String = ""
   
  def this(version : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
sealed class AssemblyKeyFileAttribute extends System.Attribute {
  val KeyFile : String = ""
   
  def this(keyFile : String) {}
}
 
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AssemblyDelaySignAttribute extends System.Attribute {
  val DelaySign : Boolean = false
   
  def this(delaySign : Boolean) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
sealed class AssemblyAlgorithmIdAttribute extends System.Attribute {
  @System.CLSCompliantAttribute(false)
  val AlgorithmId : UInt = 0
   
  def this(algorithmId : System.Configuration.Assemblies.AssemblyHashAlgorithm) {}
   
  @System.CLSCompliantAttribute(false)
  def this(algorithmId : UInt) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
sealed class AssemblyFlagsAttribute extends System.Attribute {
  @System.ObsoleteAttribute("This property has been deprecated. Please use AssemblyFlags instead. http://go.microsoft.com/fwlink/?linkid=14202")
  @System.CLSCompliantAttribute(false)
  val Flags : UInt = 0
   
  val AssemblyFlags : Int = 0
   
  @System.CLSCompliantAttribute(false)
  @System.ObsoleteAttribute("This constructor has been deprecated. Please use AssemblyFlagsAttribute(AssemblyNameFlags) instead. http://go.microsoft.com/fwlink/?linkid=14202")
  def this(flags : UInt) {}
   
  @System.ObsoleteAttribute("This constructor has been deprecated. Please use AssemblyFlagsAttribute(AssemblyNameFlags) instead. http://go.microsoft.com/fwlink/?linkid=14202")
  def this(assemblyFlags : Int) {}
   
  def this(assemblyFlags : System.Reflection.AssemblyNameFlags) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
sealed class AssemblyKeyNameAttribute extends System.Attribute {
  val KeyName : String = ""
   
  def this(keyName : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
sealed class AssemblyName extends AnyRef with System.Runtime.InteropServices._AssemblyName with System.ICloneable with 
                                  System.Runtime.Serialization.ISerializable with 
                                  System.Runtime.Serialization.IDeserializationCallback {
  def Clone: AnyRef
   
  def GetPublicKey: Array[UByte]
   
  def SetPublicKey(publicKey : Array[UByte]): Unit
   
  def GetPublicKeyToken: Array[UByte]
   
  def SetPublicKeyToken(publicKeyToken : Array[UByte]): Unit
   
  def ToString: String
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  def OnDeserialization(sender : AnyRef): Unit
   
  var Name : String = ""
   
  var Version : System.Version = null
   
  var CultureInfo : System.Globalization.CultureInfo = null
   
  var CodeBase : String = ""
   
  val EscapedCodeBase : String = ""
   
  var ProcessorArchitecture : System.Reflection.ProcessorArchitecture = System.Reflection.ProcessorArchitecture.None
   
  var Flags : System.Reflection.AssemblyNameFlags = System.Reflection.AssemblyNameFlags.None
   
  var HashAlgorithm : System.Configuration.Assemblies.AssemblyHashAlgorithm = System.Configuration.Assemblies.AssemblyHashAlgorithm.None
   
  var VersionCompatibility : System.Configuration.Assemblies.AssemblyVersionCompatibility = System.Configuration.Assemblies.AssemblyVersionCompatibility.SameMachine
   
  var KeyPair : System.Reflection.StrongNameKeyPair = null
   
  val FullName : String = ""
   
  def this() {}
   
  def this(assemblyName : String) {}
}
object AssemblyName {
  def GetAssemblyName(assemblyFile : String): System.Reflection.AssemblyName  = null
   
  def ReferenceMatchesDefinition(reference : System.Reflection.AssemblyName, 
                                 definition : System.Reflection.AssemblyName): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class AssemblyNameProxy extends System.MarshalByRefObject {
  def GetAssemblyName(assemblyFile : String): System.Reflection.AssemblyName
   
  def this() {}
}
 
sealed abstract class AssemblyNameFlags extends System.Enum {
  def ==(that: System.Reflection.AssemblyNameFlags): Boolean = false
  def !=(that: System.Reflection.AssemblyNameFlags): Boolean = false
  def  <(that: System.Reflection.AssemblyNameFlags): Boolean = false
  def <=(that: System.Reflection.AssemblyNameFlags): Boolean = false
  def  >(that: System.Reflection.AssemblyNameFlags): Boolean = false
  def >=(that: System.Reflection.AssemblyNameFlags): Boolean = false
  def  |(that: System.Reflection.AssemblyNameFlags): Boolean = false
  def  &(that: System.Reflection.AssemblyNameFlags): Boolean = false
  def  ^(that: System.Reflection.AssemblyNameFlags): Boolean = false
}
object AssemblyNameFlags{
  val None	 = value(0)
  val PublicKey	 = value(1)
  val EnableJITcompileOptimizer	 = value(16384)
  val EnableJITcompileTracking	 = value(32768)
  val Retargetable	 = value(256)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.AssemblyNameFlags = null
}
 
sealed abstract class ProcessorArchitecture extends System.Enum {
  def ==(that: System.Reflection.ProcessorArchitecture): Boolean = false
  def !=(that: System.Reflection.ProcessorArchitecture): Boolean = false
  def  <(that: System.Reflection.ProcessorArchitecture): Boolean = false
  def <=(that: System.Reflection.ProcessorArchitecture): Boolean = false
  def  >(that: System.Reflection.ProcessorArchitecture): Boolean = false
  def >=(that: System.Reflection.ProcessorArchitecture): Boolean = false
  def  |(that: System.Reflection.ProcessorArchitecture): Boolean = false
  def  &(that: System.Reflection.ProcessorArchitecture): Boolean = false
  def  ^(that: System.Reflection.ProcessorArchitecture): Boolean = false
}
object ProcessorArchitecture{
  val None	 = value(0)
  val MSIL	 = value(1)
  val X86	 = value(2)
  val IA64	 = value(3)
  val Amd64	 = value(4)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.ProcessorArchitecture = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class CustomAttributeFormatException extends System.FormatException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
sealed abstract class BindingFlags extends System.Enum {
  def ==(that: System.Reflection.BindingFlags): Boolean = false
  def !=(that: System.Reflection.BindingFlags): Boolean = false
  def  <(that: System.Reflection.BindingFlags): Boolean = false
  def <=(that: System.Reflection.BindingFlags): Boolean = false
  def  >(that: System.Reflection.BindingFlags): Boolean = false
  def >=(that: System.Reflection.BindingFlags): Boolean = false
  def  |(that: System.Reflection.BindingFlags): Boolean = false
  def  &(that: System.Reflection.BindingFlags): Boolean = false
  def  ^(that: System.Reflection.BindingFlags): Boolean = false
}
object BindingFlags{
  val Default	 = value(0)
  val IgnoreCase	 = value(1)
  val DeclaredOnly	 = value(2)
  val Instance	 = value(4)
  val Static	 = value(8)
  val Public	 = value(16)
  val NonPublic	 = value(32)
  val FlattenHierarchy	 = value(64)
  val InvokeMethod	 = value(256)
  val CreateInstance	 = value(512)
  val GetField	 = value(1024)
  val SetField	 = value(2048)
  val GetProperty	 = value(4096)
  val SetProperty	 = value(8192)
  val PutDispProperty	 = value(16384)
  val PutRefDispProperty	 = value(32768)
  val ExactBinding	 = value(65536)
  val SuppressChangeType	 = value(131072)
  val OptionalParamBinding	 = value(262144)
  val IgnoreReturn	 = value(16777216)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.BindingFlags = null
}
 
sealed abstract class CallingConventions extends System.Enum {
  def ==(that: System.Reflection.CallingConventions): Boolean = false
  def !=(that: System.Reflection.CallingConventions): Boolean = false
  def  <(that: System.Reflection.CallingConventions): Boolean = false
  def <=(that: System.Reflection.CallingConventions): Boolean = false
  def  >(that: System.Reflection.CallingConventions): Boolean = false
  def >=(that: System.Reflection.CallingConventions): Boolean = false
  def  |(that: System.Reflection.CallingConventions): Boolean = false
  def  &(that: System.Reflection.CallingConventions): Boolean = false
  def  ^(that: System.Reflection.CallingConventions): Boolean = false
}
object CallingConventions{
  val Standard	 = value(1)
  val VarArgs	 = value(2)
  val Any	 = value(3)
  val HasThis	 = value(32)
  val ExplicitThis	 = value(64)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.CallingConventions = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class CustomAttributeData extends AnyRef {
  def ToString: String
   
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  val Constructor : System.Reflection.ConstructorInfo = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  val ConstructorArguments : System.Collections.Generic.IList[System.Reflection.CustomAttributeTypedArgument] = null
   
  val NamedArguments : System.Collections.Generic.IList[System.Reflection.CustomAttributeNamedArgument] = null
}
object CustomAttributeData {
  def GetCustomAttributes(target : System.Reflection.MemberInfo): System.Collections.Generic.IList[System.Reflection.CustomAttributeData]  = null
   
  def GetCustomAttributes(target : System.Reflection.Module): System.Collections.Generic.IList[System.Reflection.CustomAttributeData]  = null
   
  def GetCustomAttributes(target : System.Reflection.Assembly): System.Collections.Generic.IList[System.Reflection.CustomAttributeData]  = null
   
  def GetCustomAttributes(target : System.Reflection.ParameterInfo): System.Collections.Generic.IList[System.Reflection.CustomAttributeData]  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class CustomAttributeNamedArgument extends System.ValueType {
  def ToString: String
   
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  val MemberInfo : System.Reflection.MemberInfo = null
   
  val TypedValue : System.Reflection.CustomAttributeTypedArgument = new System.Reflection.CustomAttributeTypedArgument()
}
object CustomAttributeNamedArgument {
  def ==(left : System.Reflection.CustomAttributeNamedArgument, 
         right : System.Reflection.CustomAttributeNamedArgument): Boolean  = false
   
  def !=(left : System.Reflection.CustomAttributeNamedArgument, 
         right : System.Reflection.CustomAttributeNamedArgument): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class CustomAttributeTypedArgument extends System.ValueType {
  def ToString: String
   
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  val ArgumentType : System.Type = null
   
  val Value : AnyRef = null
}
object CustomAttributeTypedArgument {
  def ==(left : System.Reflection.CustomAttributeTypedArgument, 
         right : System.Reflection.CustomAttributeTypedArgument): Boolean  = false
   
  def !=(left : System.Reflection.CustomAttributeTypedArgument, 
         right : System.Reflection.CustomAttributeTypedArgument): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1036)
sealed class DefaultMemberAttribute extends System.Attribute {
  val MemberName : String = ""
   
  def this(memberName : String) {}
}
 
sealed abstract class EventAttributes extends System.Enum {
  def ==(that: System.Reflection.EventAttributes): Boolean = false
  def !=(that: System.Reflection.EventAttributes): Boolean = false
  def  <(that: System.Reflection.EventAttributes): Boolean = false
  def <=(that: System.Reflection.EventAttributes): Boolean = false
  def  >(that: System.Reflection.EventAttributes): Boolean = false
  def >=(that: System.Reflection.EventAttributes): Boolean = false
  def  |(that: System.Reflection.EventAttributes): Boolean = false
  def  &(that: System.Reflection.EventAttributes): Boolean = false
  def  ^(that: System.Reflection.EventAttributes): Boolean = false
}
object EventAttributes{
  val None	 = value(0)
  val SpecialName	 = value(512)
  val ReservedMask	 = value(1024)
  val RTSpecialName	 = value(1024)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.EventAttributes = null
}
 
sealed abstract class FieldAttributes extends System.Enum {
  def ==(that: System.Reflection.FieldAttributes): Boolean = false
  def !=(that: System.Reflection.FieldAttributes): Boolean = false
  def  <(that: System.Reflection.FieldAttributes): Boolean = false
  def <=(that: System.Reflection.FieldAttributes): Boolean = false
  def  >(that: System.Reflection.FieldAttributes): Boolean = false
  def >=(that: System.Reflection.FieldAttributes): Boolean = false
  def  |(that: System.Reflection.FieldAttributes): Boolean = false
  def  &(that: System.Reflection.FieldAttributes): Boolean = false
  def  ^(that: System.Reflection.FieldAttributes): Boolean = false
}
object FieldAttributes{
  val FieldAccessMask	 = value(7)
  val PrivateScope	 = value(0)
  val Private	 = value(1)
  val FamANDAssem	 = value(2)
  val Assembly	 = value(3)
  val Family	 = value(4)
  val FamORAssem	 = value(5)
  val Public	 = value(6)
  val Static	 = value(16)
  val InitOnly	 = value(32)
  val Literal	 = value(64)
  val NotSerialized	 = value(128)
  val SpecialName	 = value(512)
  val PinvokeImpl	 = value(8192)
  val ReservedMask	 = value(38144)
  val RTSpecialName	 = value(1024)
  val HasFieldMarshal	 = value(4096)
  val HasDefault	 = value(32768)
  val HasFieldRVA	 = value(256)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.FieldAttributes = null
}
 
sealed abstract class GenericParameterAttributes extends System.Enum {
  def ==(that: System.Reflection.GenericParameterAttributes): Boolean = false
  def !=(that: System.Reflection.GenericParameterAttributes): Boolean = false
  def  <(that: System.Reflection.GenericParameterAttributes): Boolean = false
  def <=(that: System.Reflection.GenericParameterAttributes): Boolean = false
  def  >(that: System.Reflection.GenericParameterAttributes): Boolean = false
  def >=(that: System.Reflection.GenericParameterAttributes): Boolean = false
  def  |(that: System.Reflection.GenericParameterAttributes): Boolean = false
  def  &(that: System.Reflection.GenericParameterAttributes): Boolean = false
  def  ^(that: System.Reflection.GenericParameterAttributes): Boolean = false
}
object GenericParameterAttributes{
  val None	 = value(0)
  val VarianceMask	 = value(3)
  val Covariant	 = value(1)
  val Contravariant	 = value(2)
  val SpecialConstraintMask	 = value(28)
  val ReferenceTypeConstraint	 = value(4)
  val NotNullableValueTypeConstraint	 = value(8)
  val DefaultConstructorConstraint	 = value(16)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.GenericParameterAttributes = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class InterfaceMapping extends System.ValueType {
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  var TargetType : System.Type
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  var InterfaceType : System.Type
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  var TargetMethods : Array[System.Reflection.MethodInfo]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  var InterfaceMethods : Array[System.Reflection.MethodInfo]
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class InvalidFilterCriteriaException extends System.ApplicationException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ManifestResourceInfo extends AnyRef {
  val ReferencedAssembly : System.Reflection.Assembly = null
   
  val FileName : String = ""
   
  val ResourceLocation : System.Reflection.ResourceLocation = System.Reflection.ResourceLocation.Embedded
}
 
sealed abstract class ResourceLocation extends System.Enum {
  def ==(that: System.Reflection.ResourceLocation): Boolean = false
  def !=(that: System.Reflection.ResourceLocation): Boolean = false
  def  <(that: System.Reflection.ResourceLocation): Boolean = false
  def <=(that: System.Reflection.ResourceLocation): Boolean = false
  def  >(that: System.Reflection.ResourceLocation): Boolean = false
  def >=(that: System.Reflection.ResourceLocation): Boolean = false
  def  |(that: System.Reflection.ResourceLocation): Boolean = false
  def  &(that: System.Reflection.ResourceLocation): Boolean = false
  def  ^(that: System.Reflection.ResourceLocation): Boolean = false
}
object ResourceLocation{
  val Embedded	 = value(1)
  val ContainedInAnotherAssembly	 = value(2)
  val ContainedInManifestFile	 = value(4)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.ResourceLocation = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class MemberFilter extends System.MulticastDelegate {
  def Invoke(m : System.Reflection.MemberInfo, filterCriteria : AnyRef): Boolean
   
  def BeginInvoke(m : System.Reflection.MemberInfo, filterCriteria : AnyRef, 
                  callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Boolean
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed abstract class MemberTypes extends System.Enum {
  def ==(that: System.Reflection.MemberTypes): Boolean = false
  def !=(that: System.Reflection.MemberTypes): Boolean = false
  def  <(that: System.Reflection.MemberTypes): Boolean = false
  def <=(that: System.Reflection.MemberTypes): Boolean = false
  def  >(that: System.Reflection.MemberTypes): Boolean = false
  def >=(that: System.Reflection.MemberTypes): Boolean = false
  def  |(that: System.Reflection.MemberTypes): Boolean = false
  def  &(that: System.Reflection.MemberTypes): Boolean = false
  def  ^(that: System.Reflection.MemberTypes): Boolean = false
}
object MemberTypes{
  val Constructor	 = value(1)
  val Event	 = value(2)
  val Field	 = value(4)
  val Method	 = value(8)
  val Property	 = value(16)
  val TypeInfo	 = value(32)
  val Custom	 = value(64)
  val NestedType	 = value(128)
  val All	 = value(191)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.MemberTypes = null
}
 
sealed abstract class MethodAttributes extends System.Enum {
  def ==(that: System.Reflection.MethodAttributes): Boolean = false
  def !=(that: System.Reflection.MethodAttributes): Boolean = false
  def  <(that: System.Reflection.MethodAttributes): Boolean = false
  def <=(that: System.Reflection.MethodAttributes): Boolean = false
  def  >(that: System.Reflection.MethodAttributes): Boolean = false
  def >=(that: System.Reflection.MethodAttributes): Boolean = false
  def  |(that: System.Reflection.MethodAttributes): Boolean = false
  def  &(that: System.Reflection.MethodAttributes): Boolean = false
  def  ^(that: System.Reflection.MethodAttributes): Boolean = false
}
object MethodAttributes{
  val MemberAccessMask	 = value(7)
  val PrivateScope	 = value(0)
  val Private	 = value(1)
  val FamANDAssem	 = value(2)
  val Assembly	 = value(3)
  val Family	 = value(4)
  val FamORAssem	 = value(5)
  val Public	 = value(6)
  val Static	 = value(16)
  val Final	 = value(32)
  val Virtual	 = value(64)
  val HideBySig	 = value(128)
  val CheckAccessOnOverride	 = value(512)
  val VtableLayoutMask	 = value(256)
  val ReuseSlot	 = value(0)
  val NewSlot	 = value(256)
  val Abstract	 = value(1024)
  val SpecialName	 = value(2048)
  val PinvokeImpl	 = value(8192)
  val UnmanagedExport	 = value(8)
  val RTSpecialName	 = value(4096)
  val ReservedMask	 = value(53248)
  val HasSecurity	 = value(16384)
  val RequireSecObject	 = value(32768)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.MethodAttributes = null
}
 
sealed abstract class MethodImplAttributes extends System.Enum {
  def ==(that: System.Reflection.MethodImplAttributes): Boolean = false
  def !=(that: System.Reflection.MethodImplAttributes): Boolean = false
  def  <(that: System.Reflection.MethodImplAttributes): Boolean = false
  def <=(that: System.Reflection.MethodImplAttributes): Boolean = false
  def  >(that: System.Reflection.MethodImplAttributes): Boolean = false
  def >=(that: System.Reflection.MethodImplAttributes): Boolean = false
  def  |(that: System.Reflection.MethodImplAttributes): Boolean = false
  def  &(that: System.Reflection.MethodImplAttributes): Boolean = false
  def  ^(that: System.Reflection.MethodImplAttributes): Boolean = false
}
object MethodImplAttributes{
  val CodeTypeMask	 = value(3)
  val IL	 = value(0)
  val Native	 = value(1)
  val OPTIL	 = value(2)
  val Runtime	 = value(3)
  val ManagedMask	 = value(4)
  val Unmanaged	 = value(4)
  val Managed	 = value(0)
  val ForwardRef	 = value(16)
  val PreserveSig	 = value(128)
  val InternalCall	 = value(4096)
  val Synchronized	 = value(32)
  val NoInlining	 = value(8)
  val NoOptimization	 = value(64)
  val MaxMethodImplVal	 = value(65535)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.MethodImplAttributes = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Missing extends AnyRef with System.Runtime.Serialization.ISerializable 
object Missing {
  val Value : System.Reflection.Missing  = null
}
 
sealed abstract class PortableExecutableKinds extends System.Enum {
  def ==(that: System.Reflection.PortableExecutableKinds): Boolean = false
  def !=(that: System.Reflection.PortableExecutableKinds): Boolean = false
  def  <(that: System.Reflection.PortableExecutableKinds): Boolean = false
  def <=(that: System.Reflection.PortableExecutableKinds): Boolean = false
  def  >(that: System.Reflection.PortableExecutableKinds): Boolean = false
  def >=(that: System.Reflection.PortableExecutableKinds): Boolean = false
  def  |(that: System.Reflection.PortableExecutableKinds): Boolean = false
  def  &(that: System.Reflection.PortableExecutableKinds): Boolean = false
  def  ^(that: System.Reflection.PortableExecutableKinds): Boolean = false
}
object PortableExecutableKinds{
  val NotAPortableExecutableImage	 = value(0)
  val ILOnly	 = value(1)
  val Required32Bit	 = value(2)
  val PE32Plus	 = value(4)
  val Unmanaged32Bit	 = value(8)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.PortableExecutableKinds = null
}
 
sealed abstract class ImageFileMachine extends System.Enum {
  def ==(that: System.Reflection.ImageFileMachine): Boolean = false
  def !=(that: System.Reflection.ImageFileMachine): Boolean = false
  def  <(that: System.Reflection.ImageFileMachine): Boolean = false
  def <=(that: System.Reflection.ImageFileMachine): Boolean = false
  def  >(that: System.Reflection.ImageFileMachine): Boolean = false
  def >=(that: System.Reflection.ImageFileMachine): Boolean = false
  def  |(that: System.Reflection.ImageFileMachine): Boolean = false
  def  &(that: System.Reflection.ImageFileMachine): Boolean = false
  def  ^(that: System.Reflection.ImageFileMachine): Boolean = false
}
object ImageFileMachine{
  val I386	 = value(332)
  val IA64	 = value(512)
  val AMD64	 = value(34404)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.ImageFileMachine = null
}
 
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class Module extends AnyRef with System.Runtime.InteropServices._Module with 
                     System.Runtime.Serialization.ISerializable with 
                     System.Reflection.ICustomAttributeProvider {
  def ResolveMethod(metadataToken : Int): System.Reflection.MethodBase
   
  def ResolveSignature(metadataToken : Int): Array[UByte]
   
  def ResolveMethod(metadataToken : Int, genericTypeArguments : Array[System.Type], 
                    genericMethodArguments : Array[System.Type]): System.Reflection.MethodBase
   
  def ResolveField(metadataToken : Int): System.Reflection.FieldInfo
   
  def ResolveField(metadataToken : Int, genericTypeArguments : Array[System.Type], 
                   genericMethodArguments : Array[System.Type]): System.Reflection.FieldInfo
   
  def ResolveType(metadataToken : Int): System.Type
   
  def ResolveType(metadataToken : Int, genericTypeArguments : Array[System.Type], 
                  genericMethodArguments : Array[System.Type]): System.Type
   
  def ResolveMember(metadataToken : Int): System.Reflection.MemberInfo
   
  def ResolveMember(metadataToken : Int, genericTypeArguments : Array[System.Type], 
                    genericMethodArguments : Array[System.Type]): System.Reflection.MemberInfo
   
  def ResolveString(metadataToken : Int): String
   
  def GetPEKind(peKind : CLRByRef[System.Reflection.PortableExecutableKinds], 
                machine : CLRByRef[System.Reflection.ImageFileMachine]): Unit
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  protected def GetMethodImpl(name : String, bindingAttr : System.Reflection.BindingFlags, 
                              binder : System.Reflection.Binder, 
                              callConvention : System.Reflection.CallingConventions, types : Array[System.Type], 
                              modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.MethodInfo
   
  def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetType(className : String, ignoreCase : Boolean): System.Type
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetType(className : String): System.Type
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetType(className : String, throwOnError : Boolean, ignoreCase : Boolean): System.Type
   
  def FindTypes(filter : System.Reflection.TypeFilter, filterCriteria : AnyRef): Array[System.Type]
   
  def GetTypes: Array[System.Type]
   
  def IsResource: Boolean
   
  def GetFields: Array[System.Reflection.FieldInfo]
   
  def GetFields(bindingFlags : System.Reflection.BindingFlags): Array[System.Reflection.FieldInfo]
   
  def GetField(name : String): System.Reflection.FieldInfo
   
  def GetField(name : String, bindingAttr : System.Reflection.BindingFlags): System.Reflection.FieldInfo
   
  def GetMethods: Array[System.Reflection.MethodInfo]
   
  def GetMethods(bindingFlags : System.Reflection.BindingFlags): Array[System.Reflection.MethodInfo]
   
  def GetMethod(name : String, bindingAttr : System.Reflection.BindingFlags, 
                binder : System.Reflection.Binder, 
                callConvention : System.Reflection.CallingConventions, types : Array[System.Type], 
                modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.MethodInfo
   
  def GetMethod(name : String, types : Array[System.Type]): System.Reflection.MethodInfo
   
  def GetMethod(name : String): System.Reflection.MethodInfo
   
  def ToString: String
   
  def GetSignerCertificate: System.Security.Cryptography.X509Certificates.X509Certificate
   
  val MDStreamVersion : Int = 0
   
  val FullyQualifiedName : String = ""
   
  val ModuleVersionId : System.Guid = new System.Guid()
   
  val MetadataToken : Int = 0
   
  val ScopeName : String = ""
   
  val Name : String = ""
   
  val Assembly : System.Reflection.Assembly = null
   
  val ModuleHandle : System.ModuleHandle = new System.ModuleHandle()
}
object Module {
  val FilterTypeName : System.Reflection.TypeFilter  = null
   
  val FilterTypeNameIgnoreCase : System.Reflection.TypeFilter  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1 /* AllowMultiple = false, Inherited = false */ )
sealed class ObfuscateAssemblyAttribute extends System.Attribute {
  val AssemblyIsPrivate : Boolean = false
   
  var StripAfterObfuscation : Boolean = false
   
  def this(assemblyIsPrivate : Boolean) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(8157 /* AllowMultiple = true, Inherited = false */ )
sealed class ObfuscationAttribute extends System.Attribute {
  var StripAfterObfuscation : Boolean = false
   
  var Exclude : Boolean = false
   
  var ApplyToMembers : Boolean = false
   
  var Feature : String = ""
   
  def this() {}
}
 
sealed abstract class ExceptionHandlingClauseOptions extends System.Enum {
  def ==(that: System.Reflection.ExceptionHandlingClauseOptions): Boolean = false
  def !=(that: System.Reflection.ExceptionHandlingClauseOptions): Boolean = false
  def  <(that: System.Reflection.ExceptionHandlingClauseOptions): Boolean = false
  def <=(that: System.Reflection.ExceptionHandlingClauseOptions): Boolean = false
  def  >(that: System.Reflection.ExceptionHandlingClauseOptions): Boolean = false
  def >=(that: System.Reflection.ExceptionHandlingClauseOptions): Boolean = false
  def  |(that: System.Reflection.ExceptionHandlingClauseOptions): Boolean = false
  def  &(that: System.Reflection.ExceptionHandlingClauseOptions): Boolean = false
  def  ^(that: System.Reflection.ExceptionHandlingClauseOptions): Boolean = false
}
object ExceptionHandlingClauseOptions{
  val Clause	 = value(0)
  val Filter	 = value(1)
  val Finally	 = value(2)
  val Fault	 = value(4)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.ExceptionHandlingClauseOptions = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ExceptionHandlingClause extends AnyRef {
  def ToString: String
   
  val Flags : System.Reflection.ExceptionHandlingClauseOptions = System.Reflection.ExceptionHandlingClauseOptions.Clause
   
  val TryOffset : Int = 0
   
  val TryLength : Int = 0
   
  val HandlerOffset : Int = 0
   
  val HandlerLength : Int = 0
   
  val FilterOffset : Int = 0
   
  val CatchType : System.Type = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class MethodBody extends AnyRef {
  def GetILAsByteArray: Array[UByte]
   
  val LocalSignatureMetadataToken : Int = 0
   
  val LocalVariables : System.Collections.Generic.IList[System.Reflection.LocalVariableInfo] = null
   
  val MaxStackSize : Int = 0
   
  val InitLocals : Boolean = false
   
  val ExceptionHandlingClauses : System.Collections.Generic.IList[System.Reflection.ExceptionHandlingClause] = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class LocalVariableInfo extends AnyRef {
  def ToString: String
   
  val LocalType : System.Type = null
   
  val IsPinned : Boolean = false
   
  val LocalIndex : Int = 0
}
 
sealed abstract class ParameterAttributes extends System.Enum {
  def ==(that: System.Reflection.ParameterAttributes): Boolean = false
  def !=(that: System.Reflection.ParameterAttributes): Boolean = false
  def  <(that: System.Reflection.ParameterAttributes): Boolean = false
  def <=(that: System.Reflection.ParameterAttributes): Boolean = false
  def  >(that: System.Reflection.ParameterAttributes): Boolean = false
  def >=(that: System.Reflection.ParameterAttributes): Boolean = false
  def  |(that: System.Reflection.ParameterAttributes): Boolean = false
  def  &(that: System.Reflection.ParameterAttributes): Boolean = false
  def  ^(that: System.Reflection.ParameterAttributes): Boolean = false
}
object ParameterAttributes{
  val None	 = value(0)
  val In	 = value(1)
  val Out	 = value(2)
  val Lcid	 = value(4)
  val Retval	 = value(8)
  val Optional	 = value(16)
  val ReservedMask	 = value(61440)
  val HasDefault	 = value(4096)
  val HasFieldMarshal	 = value(8192)
  val Reserved3	 = value(16384)
  val Reserved4	 = value(32768)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.ParameterAttributes = null
}
 
@System.Reflection.DefaultMemberAttribute("Item")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ParameterModifier extends System.ValueType {
  /* parameterful property Item */
  def Item_=(index : Int, value : Boolean): Unit
  def Item(index : Int): Boolean
   
  def this(parameterCount : Int) {}
}
 
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Pointer extends AnyRef with System.Runtime.Serialization.ISerializable 
 
sealed abstract class PropertyAttributes extends System.Enum {
  def ==(that: System.Reflection.PropertyAttributes): Boolean = false
  def !=(that: System.Reflection.PropertyAttributes): Boolean = false
  def  <(that: System.Reflection.PropertyAttributes): Boolean = false
  def <=(that: System.Reflection.PropertyAttributes): Boolean = false
  def  >(that: System.Reflection.PropertyAttributes): Boolean = false
  def >=(that: System.Reflection.PropertyAttributes): Boolean = false
  def  |(that: System.Reflection.PropertyAttributes): Boolean = false
  def  &(that: System.Reflection.PropertyAttributes): Boolean = false
  def  ^(that: System.Reflection.PropertyAttributes): Boolean = false
}
object PropertyAttributes{
  val None	 = value(0)
  val SpecialName	 = value(512)
  val ReservedMask	 = value(62464)
  val RTSpecialName	 = value(1024)
  val HasDefault	 = value(4096)
  val Reserved2	 = value(8192)
  val Reserved3	 = value(16384)
  val Reserved4	 = value(32768)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.PropertyAttributes = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ReflectionTypeLoadException extends System.SystemException with System.Runtime.Serialization.ISerializable {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  val Types : Array[System.Type] = Array.empty[System.Type]
   
  val LoaderExceptions : Array[System.Exception] = Array.empty[System.Exception]
   
  def this(classes : Array[System.Type], exceptions : Array[System.Exception]) {}
   
  def this(classes : Array[System.Type], exceptions : Array[System.Exception], message : String) {}
}
 
sealed abstract class ResourceAttributes extends System.Enum {
  def ==(that: System.Reflection.ResourceAttributes): Boolean = false
  def !=(that: System.Reflection.ResourceAttributes): Boolean = false
  def  <(that: System.Reflection.ResourceAttributes): Boolean = false
  def <=(that: System.Reflection.ResourceAttributes): Boolean = false
  def  >(that: System.Reflection.ResourceAttributes): Boolean = false
  def >=(that: System.Reflection.ResourceAttributes): Boolean = false
  def  |(that: System.Reflection.ResourceAttributes): Boolean = false
  def  &(that: System.Reflection.ResourceAttributes): Boolean = false
  def  ^(that: System.Reflection.ResourceAttributes): Boolean = false
}
object ResourceAttributes{
  val Public	 = value(1)
  val Private	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.ResourceAttributes = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class StrongNameKeyPair extends AnyRef with System.Runtime.Serialization.IDeserializationCallback with 
                                System.Runtime.Serialization.ISerializable {
  val PublicKey : Array[UByte] = Array.empty[UByte]
   
  def this(keyPairFile : System.IO.FileStream) {}
   
  def this(keyPairArray : Array[UByte]) {}
   
  def this(keyPairContainer : String) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class TargetException extends System.ApplicationException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class TargetInvocationException extends System.ApplicationException {
  def this(inner : System.Exception) {}
   
  def this(message : String, inner : System.Exception) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class TargetParameterCountException extends System.ApplicationException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
}
 
sealed abstract class TypeAttributes extends System.Enum {
  def ==(that: System.Reflection.TypeAttributes): Boolean = false
  def !=(that: System.Reflection.TypeAttributes): Boolean = false
  def  <(that: System.Reflection.TypeAttributes): Boolean = false
  def <=(that: System.Reflection.TypeAttributes): Boolean = false
  def  >(that: System.Reflection.TypeAttributes): Boolean = false
  def >=(that: System.Reflection.TypeAttributes): Boolean = false
  def  |(that: System.Reflection.TypeAttributes): Boolean = false
  def  &(that: System.Reflection.TypeAttributes): Boolean = false
  def  ^(that: System.Reflection.TypeAttributes): Boolean = false
}
object TypeAttributes{
  val VisibilityMask	 = value(7)
  val NotPublic	 = value(0)
  val Public	 = value(1)
  val NestedPublic	 = value(2)
  val NestedPrivate	 = value(3)
  val NestedFamily	 = value(4)
  val NestedAssembly	 = value(5)
  val NestedFamANDAssem	 = value(6)
  val NestedFamORAssem	 = value(7)
  val LayoutMask	 = value(24)
  val AutoLayout	 = value(0)
  val SequentialLayout	 = value(8)
  val ExplicitLayout	 = value(16)
  val ClassSemanticsMask	 = value(32)
  val Class	 = value(0)
  val Interface	 = value(32)
  val Abstract	 = value(128)
  val Sealed	 = value(256)
  val SpecialName	 = value(1024)
  val Import	 = value(4096)
  val Serializable	 = value(8192)
  val StringFormatMask	 = value(196608)
  val AnsiClass	 = value(0)
  val UnicodeClass	 = value(65536)
  val AutoClass	 = value(131072)
  val CustomFormatClass	 = value(196608)
  val CustomFormatMask	 = value(12582912)
  val BeforeFieldInit	 = value(1048576)
  val ReservedMask	 = value(264192)
  val RTSpecialName	 = value(2048)
  val HasSecurity	 = value(262144)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.TypeAttributes = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class TypeDelegator extends System.Type {
  def InvokeMember(name : String, invokeAttr : System.Reflection.BindingFlags, 
                   binder : System.Reflection.Binder, target : AnyRef, args : Array[AnyRef], 
                   modifiers : Array[System.Reflection.ParameterModifier], 
                   culture : System.Globalization.CultureInfo, namedParameters : Array[String]): AnyRef
   
  protected def GetConstructorImpl(bindingAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                                   callConvention : System.Reflection.CallingConventions, types : Array[System.Type], 
                                   modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.ConstructorInfo
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetConstructors(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.ConstructorInfo]
   
  protected def GetMethodImpl(name : String, bindingAttr : System.Reflection.BindingFlags, 
                              binder : System.Reflection.Binder, 
                              callConvention : System.Reflection.CallingConventions, types : Array[System.Type], 
                              modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.MethodInfo
   
  def GetMethods(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MethodInfo]
   
  def GetField(name : String, bindingAttr : System.Reflection.BindingFlags): System.Reflection.FieldInfo
   
  def GetFields(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.FieldInfo]
   
  def GetInterface(name : String, ignoreCase : Boolean): System.Type
   
  def GetInterfaces: Array[System.Type]
   
  def GetEvent(name : String, bindingAttr : System.Reflection.BindingFlags): System.Reflection.EventInfo
   
  def GetEvents: Array[System.Reflection.EventInfo]
   
  protected def GetPropertyImpl(name : String, bindingAttr : System.Reflection.BindingFlags, 
                                binder : System.Reflection.Binder, returnType : System.Type, 
                                types : Array[System.Type], modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.PropertyInfo
   
  def GetProperties(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.PropertyInfo]
   
  def GetEvents(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.EventInfo]
   
  def GetNestedTypes(bindingAttr : System.Reflection.BindingFlags): Array[System.Type]
   
  def GetNestedType(name : String, bindingAttr : System.Reflection.BindingFlags): System.Type
   
  def GetMember(name : String, `type` : System.Reflection.MemberTypes, 
                bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MemberInfo]
   
  def GetMembers(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MemberInfo]
   
  protected def GetAttributeFlagsImpl: System.Reflection.TypeAttributes
   
  protected def IsArrayImpl: Boolean
   
  protected def IsPrimitiveImpl: Boolean
   
  protected def IsByRefImpl: Boolean
   
  protected def IsPointerImpl: Boolean
   
  protected def IsValueTypeImpl: Boolean
   
  protected def IsCOMObjectImpl: Boolean
   
  def GetElementType: System.Type
   
  protected def HasElementTypeImpl: Boolean
   
  def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetInterfaceMap(interfaceType : System.Type): System.Reflection.InterfaceMapping
   
  protected var typeImpl : System.Type
   
  val GUID : System.Guid = new System.Guid()
   
  val MetadataToken : Int = 0
   
  val Module : System.Reflection.Module = null
   
  val Assembly : System.Reflection.Assembly = null
   
  val TypeHandle : System.RuntimeTypeHandle = new System.RuntimeTypeHandle()
   
  val Name : String = ""
   
  val FullName : String = ""
   
  val Namespace : String = ""
   
  val AssemblyQualifiedName : String = ""
   
  val BaseType : System.Type = null
   
  val UnderlyingSystemType : System.Type = null
   
  protected def this() {}
   
  def this(delegatingType : System.Type) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class TypeFilter extends System.MulticastDelegate {
  def Invoke(m : System.Type, filterCriteria : AnyRef): Boolean
   
  def BeginInvoke(m : System.Type, filterCriteria : AnyRef, callback : System.AsyncCallback, 
                  `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Boolean
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
abstract class MethodBase extends System.Reflection.MemberInfo with System.Runtime.InteropServices._MethodBase {
  /* abstract */ def GetParameters: Array[System.Reflection.ParameterInfo]
   
  /* abstract */ def GetMethodImplementationFlags: System.Reflection.MethodImplAttributes
   
  /* abstract */ def Invoke(obj : AnyRef, invokeAttr : System.Reflection.BindingFlags, 
                            binder : System.Reflection.Binder, parameters : Array[AnyRef], 
                            culture : System.Globalization.CultureInfo): AnyRef
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetGenericArguments: Array[System.Type]
   
  @System.Diagnostics.DebuggerHiddenAttribute()
  @System.Diagnostics.DebuggerStepThroughAttribute()
  def Invoke(obj : AnyRef, parameters : Array[AnyRef]): AnyRef
   
  def GetMethodBody: System.Reflection.MethodBody
   
  val MethodHandle : System.RuntimeMethodHandle = new System.RuntimeMethodHandle()
   
  val Attributes : System.Reflection.MethodAttributes = System.Reflection.MethodAttributes.MemberAccessMask
   
  val CallingConvention : System.Reflection.CallingConventions = System.Reflection.CallingConventions.Standard
   
  val IsGenericMethodDefinition : Boolean = false
   
  val ContainsGenericParameters : Boolean = false
   
  val IsGenericMethod : Boolean = false
   
  val IsPublic : Boolean = false
   
  val IsPrivate : Boolean = false
   
  val IsFamily : Boolean = false
   
  val IsAssembly : Boolean = false
   
  val IsFamilyAndAssembly : Boolean = false
   
  val IsFamilyOrAssembly : Boolean = false
   
  val IsStatic : Boolean = false
   
  val IsFinal : Boolean = false
   
  val IsVirtual : Boolean = false
   
  val IsHideBySig : Boolean = false
   
  val IsAbstract : Boolean = false
   
  val IsSpecialName : Boolean = false
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  val IsConstructor : Boolean = false
   
  protected def this() {}
}
object MethodBase {
  def GetMethodFromHandle(handle : System.RuntimeMethodHandle): System.Reflection.MethodBase  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetMethodFromHandle(handle : System.RuntimeMethodHandle, declaringType : System.RuntimeTypeHandle): System.Reflection.MethodBase  = null
   
  def GetCurrentMethod: System.Reflection.MethodBase  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
abstract class ConstructorInfo extends System.Reflection.MethodBase with System.Runtime.InteropServices._ConstructorInfo {
  /* abstract */ def Invoke(invokeAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                            parameters : Array[AnyRef], culture : System.Globalization.CultureInfo): AnyRef
   
  @System.Diagnostics.DebuggerHiddenAttribute()
  @System.Diagnostics.DebuggerStepThroughAttribute()
  def Invoke(parameters : Array[AnyRef]): AnyRef
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  val MemberType : System.Reflection.MemberTypes = System.Reflection.MemberTypes.Constructor
   
  protected def this() {}
}
object ConstructorInfo {
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  val ConstructorName : String  = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  val TypeConstructorName : String  = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
abstract class MethodInfo extends System.Reflection.MethodBase with System.Runtime.InteropServices._MethodInfo {
  /* abstract */ def GetBaseDefinition: System.Reflection.MethodInfo
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetGenericArguments: Array[System.Type]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetGenericMethodDefinition: System.Reflection.MethodInfo
   
  def MakeGenericMethod(typeArguments : Array[System.Type]): System.Reflection.MethodInfo
   
  val MemberType : System.Reflection.MemberTypes = System.Reflection.MemberTypes.Constructor
   
  val ReturnType : System.Type = null
   
  val ReturnParameter : System.Reflection.ParameterInfo = null
   
  val ReturnTypeCustomAttributes : System.Reflection.ICustomAttributeProvider = null
   
  val IsGenericMethodDefinition : Boolean = false
   
  val ContainsGenericParameters : Boolean = false
   
  val IsGenericMethod : Boolean = false
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
abstract class FieldInfo extends System.Reflection.MemberInfo with System.Runtime.InteropServices._FieldInfo {
  def GetRequiredCustomModifiers: Array[System.Type]
   
  def GetOptionalCustomModifiers: Array[System.Type]
   
  @System.CLSCompliantAttribute(false)
  def SetValueDirect(obj : System.TypedReference, value : System.TypedReference): Unit
   
  @System.CLSCompliantAttribute(false)
  def GetValueDirect(obj : System.TypedReference): AnyRef
   
  /* abstract */ def GetValue(obj : AnyRef): AnyRef
   
  def GetRawConstantValue: AnyRef
   
  /* abstract */ def SetValue(obj : AnyRef, value : AnyRef, invokeAttr : System.Reflection.BindingFlags, 
                              binder : System.Reflection.Binder, culture : System.Globalization.CultureInfo): Unit
   
  @System.Diagnostics.DebuggerHiddenAttribute()
  @System.Diagnostics.DebuggerStepThroughAttribute()
  def SetValue(obj : AnyRef, value : AnyRef): Unit
   
  val MemberType : System.Reflection.MemberTypes = System.Reflection.MemberTypes.Constructor
   
  val FieldHandle : System.RuntimeFieldHandle = new System.RuntimeFieldHandle()
   
  val FieldType : System.Type = null
   
  val Attributes : System.Reflection.FieldAttributes = System.Reflection.FieldAttributes.FieldAccessMask
   
  val IsPublic : Boolean = false
   
  val IsPrivate : Boolean = false
   
  val IsFamily : Boolean = false
   
  val IsAssembly : Boolean = false
   
  val IsFamilyAndAssembly : Boolean = false
   
  val IsFamilyOrAssembly : Boolean = false
   
  val IsStatic : Boolean = false
   
  val IsInitOnly : Boolean = false
   
  val IsLiteral : Boolean = false
   
  val IsNotSerialized : Boolean = false
   
  val IsSpecialName : Boolean = false
   
  val IsPinvokeImpl : Boolean = false
   
  protected def this() {}
}
object FieldInfo {
  def GetFieldFromHandle(handle : System.RuntimeFieldHandle): System.Reflection.FieldInfo  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetFieldFromHandle(handle : System.RuntimeFieldHandle, declaringType : System.RuntimeTypeHandle): System.Reflection.FieldInfo  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
abstract class EventInfo extends System.Reflection.MemberInfo with System.Runtime.InteropServices._EventInfo {
  def GetOtherMethods(nonPublic : Boolean): Array[System.Reflection.MethodInfo]
   
  /* abstract */ def GetAddMethod(nonPublic : Boolean): System.Reflection.MethodInfo
   
  /* abstract */ def GetRemoveMethod(nonPublic : Boolean): System.Reflection.MethodInfo
   
  /* abstract */ def GetRaiseMethod(nonPublic : Boolean): System.Reflection.MethodInfo
   
  def GetOtherMethods: Array[System.Reflection.MethodInfo]
   
  def GetAddMethod: System.Reflection.MethodInfo
   
  def GetRemoveMethod: System.Reflection.MethodInfo
   
  def GetRaiseMethod: System.Reflection.MethodInfo
   
  @System.Diagnostics.DebuggerStepThroughAttribute()
  @System.Diagnostics.DebuggerHiddenAttribute()
  def AddEventHandler(target : AnyRef, handler : System.Delegate): Unit
   
  @System.Diagnostics.DebuggerHiddenAttribute()
  @System.Diagnostics.DebuggerStepThroughAttribute()
  def RemoveEventHandler(target : AnyRef, handler : System.Delegate): Unit
   
  val MemberType : System.Reflection.MemberTypes = System.Reflection.MemberTypes.Constructor
   
  val Attributes : System.Reflection.EventAttributes = System.Reflection.EventAttributes.None
   
  val EventHandlerType : System.Type = null
   
  val IsSpecialName : Boolean = false
   
  val IsMulticast : Boolean = false
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class PropertyInfo extends System.Reflection.MemberInfo with System.Runtime.InteropServices._PropertyInfo {
  def GetConstantValue: AnyRef
   
  def GetRawConstantValue: AnyRef
   
  /* abstract */ def SetValue(obj : AnyRef, value : AnyRef, invokeAttr : System.Reflection.BindingFlags, 
                              binder : System.Reflection.Binder, index : Array[AnyRef], 
                              culture : System.Globalization.CultureInfo): Unit
   
  /* abstract */ def GetAccessors(nonPublic : Boolean): Array[System.Reflection.MethodInfo]
   
  /* abstract */ def GetGetMethod(nonPublic : Boolean): System.Reflection.MethodInfo
   
  /* abstract */ def GetSetMethod(nonPublic : Boolean): System.Reflection.MethodInfo
   
  /* abstract */ def GetIndexParameters: Array[System.Reflection.ParameterInfo]
   
  @System.Diagnostics.DebuggerHiddenAttribute()
  @System.Diagnostics.DebuggerStepThroughAttribute()
  def GetValue(obj : AnyRef, index : Array[AnyRef]): AnyRef
   
  /* abstract */ def GetValue(obj : AnyRef, invokeAttr : System.Reflection.BindingFlags, 
                              binder : System.Reflection.Binder, index : Array[AnyRef], 
                              culture : System.Globalization.CultureInfo): AnyRef
   
  @System.Diagnostics.DebuggerStepThroughAttribute()
  @System.Diagnostics.DebuggerHiddenAttribute()
  def SetValue(obj : AnyRef, value : AnyRef, index : Array[AnyRef]): Unit
   
  def GetRequiredCustomModifiers: Array[System.Type]
   
  def GetOptionalCustomModifiers: Array[System.Type]
   
  def GetAccessors: Array[System.Reflection.MethodInfo]
   
  def GetGetMethod: System.Reflection.MethodInfo
   
  def GetSetMethod: System.Reflection.MethodInfo
   
  val MemberType : System.Reflection.MemberTypes = System.Reflection.MemberTypes.Constructor
   
  val PropertyType : System.Type = null
   
  val Attributes : System.Reflection.PropertyAttributes = System.Reflection.PropertyAttributes.None
   
  val CanRead : Boolean = false
   
  val CanWrite : Boolean = false
   
  val IsSpecialName : Boolean = false
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ParameterInfo extends AnyRef with System.Runtime.InteropServices._ParameterInfo with 
                            System.Reflection.ICustomAttributeProvider {
  def GetRequiredCustomModifiers: Array[System.Type]
   
  def GetOptionalCustomModifiers: Array[System.Type]
   
  def ToString: String
   
  def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  protected var NameImpl : String
   
  protected var ClassImpl : System.Type
   
  protected var PositionImpl : Int
   
  protected var AttrsImpl : System.Reflection.ParameterAttributes
   
  protected var DefaultValueImpl : AnyRef
   
  protected var MemberImpl : System.Reflection.MemberInfo
   
  val ParameterType : System.Type = null
   
  val Name : String = ""
   
  val DefaultValue : AnyRef = null
   
  val RawDefaultValue : AnyRef = null
   
  val Position : Int = 0
   
  val Attributes : System.Reflection.ParameterAttributes = System.Reflection.ParameterAttributes.None
   
  val Member : System.Reflection.MemberInfo = null
   
  val IsIn : Boolean = false
   
  val IsOut : Boolean = false
   
  val IsLcid : Boolean = false
   
  val IsRetval : Boolean = false
   
  val IsOptional : Boolean = false
   
  val MetadataToken : Int = 0
   
  protected def this() {}
}
 
}