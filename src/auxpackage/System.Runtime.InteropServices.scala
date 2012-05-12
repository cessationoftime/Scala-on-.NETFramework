 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.InteropServices {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("b36b5c63-42ef-38bc-a07e-0b34c98f164a")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsDual)
@System.CLSCompliantAttribute(false)
trait _Exception {
  /* abstract */ def ToString: String
   
  /* abstract */ def Equals(obj : AnyRef): Boolean
   
  /* abstract */ def GetHashCode: Int
   
  /* abstract */ def GetType: System.Type
   
  /* abstract */ def GetBaseException: System.Exception
   
  /* abstract */ def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                                   context : System.Runtime.Serialization.StreamingContext): Unit
   
  val Message : String = ""
   
  val StackTrace : String = ""
   
  var HelpLink : String = ""
   
  var Source : String = ""
   
  val InnerException : System.Exception = null
   
  val TargetSite : System.Reflection.MethodBase = null
}
 
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("03973551-57A1-3900-A2B5-9083E3FF2943")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.CLSCompliantAttribute(false)
trait _Activator {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("917B14D0-2D9E-38B8-92A9-381ACF52F7C0")
@System.CLSCompliantAttribute(false)
trait _Attribute {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("C281C7F1-4AA9-3517-961A-463CFED57E75")
trait _Thread {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.GuidAttribute("f7102fa9-cabb-3a74-a6da-b4567ef1b079")
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait _MemberInfo {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
   
  /* abstract */ def ToString: String
   
  /* abstract */ def Equals(other : AnyRef): Boolean
   
  /* abstract */ def GetHashCode: Int
   
  /* abstract */ def GetType: System.Type
   
  /* abstract */ def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  val MemberType : System.Reflection.MemberTypes = System.Reflection.MemberTypes.Constructor
   
  val Name : String = ""
   
  val DeclaringType : System.Type = null
   
  val ReflectedType : System.Type = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("BCA8B44D-AAD6-3A86-8AB7-03349F4F2DA2")
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
trait _Type {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
   
  /* abstract */ def ToString: String
   
  /* abstract */ def Equals(other : AnyRef): Boolean
   
  /* abstract */ def GetHashCode: Int
   
  /* abstract */ def GetType: System.Type
   
  /* abstract */ def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  /* abstract */ def GetArrayRank: Int
   
  /* abstract */ def GetConstructors(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.ConstructorInfo]
   
  /* abstract */ def GetInterface(name : String, ignoreCase : Boolean): System.Type
   
  /* abstract */ def GetInterfaces: Array[System.Type]
   
  /* abstract */ def FindInterfaces(filter : System.Reflection.TypeFilter, filterCriteria : AnyRef): Array[System.Type]
   
  /* abstract */ def GetEvent(name : String, bindingAttr : System.Reflection.BindingFlags): System.Reflection.EventInfo
   
  /* abstract */ def GetEvents: Array[System.Reflection.EventInfo]
   
  /* abstract */ def GetEvents(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.EventInfo]
   
  /* abstract */ def GetNestedTypes(bindingAttr : System.Reflection.BindingFlags): Array[System.Type]
   
  /* abstract */ def GetNestedType(name : String, bindingAttr : System.Reflection.BindingFlags): System.Type
   
  /* abstract */ def GetMember(name : String, `type` : System.Reflection.MemberTypes, 
                               bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MemberInfo]
   
  /* abstract */ def GetDefaultMembers: Array[System.Reflection.MemberInfo]
   
  /* abstract */ def FindMembers(memberType : System.Reflection.MemberTypes, 
                                 bindingAttr : System.Reflection.BindingFlags, 
                                 filter : System.Reflection.MemberFilter, filterCriteria : AnyRef): Array[System.Reflection.MemberInfo]
   
  /* abstract */ def GetElementType: System.Type
   
  /* abstract */ def IsSubclassOf(c : System.Type): Boolean
   
  /* abstract */ def IsInstanceOfType(o : AnyRef): Boolean
   
  /* abstract */ def IsAssignableFrom(c : System.Type): Boolean
   
  /* abstract */ def GetInterfaceMap(interfaceType : System.Type): System.Reflection.InterfaceMapping
   
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
   
  /* abstract */ def InvokeMember(name : String, invokeAttr : System.Reflection.BindingFlags, 
                                  binder : System.Reflection.Binder, target : AnyRef, args : Array[AnyRef], 
                                  culture : System.Globalization.CultureInfo): AnyRef
   
  /* abstract */ def InvokeMember(name : String, invokeAttr : System.Reflection.BindingFlags, 
                                  binder : System.Reflection.Binder, target : AnyRef, args : Array[AnyRef]): AnyRef
   
  /* abstract */ def GetConstructor(bindingAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                                    callConvention : System.Reflection.CallingConventions, types : Array[System.Type], 
                                    modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.ConstructorInfo
   
  /* abstract */ def GetConstructor(bindingAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                                    types : Array[System.Type], modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.ConstructorInfo
   
  /* abstract */ def GetConstructor(types : Array[System.Type]): System.Reflection.ConstructorInfo
   
  /* abstract */ def GetConstructors: Array[System.Reflection.ConstructorInfo]
   
  /* abstract */ def GetMethod(name : String, bindingAttr : System.Reflection.BindingFlags, 
                               binder : System.Reflection.Binder, 
                               callConvention : System.Reflection.CallingConventions, types : Array[System.Type], 
                               modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.MethodInfo
   
  /* abstract */ def GetMethod(name : String, types : Array[System.Type], 
                               modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.MethodInfo
   
  /* abstract */ def GetMethod(name : String, types : Array[System.Type]): System.Reflection.MethodInfo
   
  /* abstract */ def GetMethod(name : String): System.Reflection.MethodInfo
   
  /* abstract */ def GetMethods: Array[System.Reflection.MethodInfo]
   
  /* abstract */ def GetField(name : String): System.Reflection.FieldInfo
   
  /* abstract */ def GetFields: Array[System.Reflection.FieldInfo]
   
  /* abstract */ def GetInterface(name : String): System.Type
   
  /* abstract */ def GetEvent(name : String): System.Reflection.EventInfo
   
  /* abstract */ def GetProperty(name : String, returnType : System.Type, types : Array[System.Type], 
                                 modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.PropertyInfo
   
  /* abstract */ def GetProperty(name : String, returnType : System.Type, types : Array[System.Type]): System.Reflection.PropertyInfo
   
  /* abstract */ def GetProperty(name : String, types : Array[System.Type]): System.Reflection.PropertyInfo
   
  /* abstract */ def GetProperty(name : String, returnType : System.Type): System.Reflection.PropertyInfo
   
  /* abstract */ def GetProperty(name : String): System.Reflection.PropertyInfo
   
  /* abstract */ def GetProperties: Array[System.Reflection.PropertyInfo]
   
  /* abstract */ def GetNestedTypes: Array[System.Type]
   
  /* abstract */ def GetNestedType(name : String): System.Type
   
  /* abstract */ def GetMember(name : String): Array[System.Reflection.MemberInfo]
   
  /* abstract */ def GetMembers: Array[System.Reflection.MemberInfo]
   
  /* abstract */ def Equals(o : System.Type): Boolean
   
  val MemberType : System.Reflection.MemberTypes = System.Reflection.MemberTypes.Constructor
   
  val Name : String = ""
   
  val DeclaringType : System.Type = null
   
  val ReflectedType : System.Type = null
   
  val GUID : System.Guid = new System.Guid()
   
  val Module : System.Reflection.Module = null
   
  val Assembly : System.Reflection.Assembly = null
   
  val TypeHandle : System.RuntimeTypeHandle = new System.RuntimeTypeHandle()
   
  val FullName : String = ""
   
  val Namespace : String = ""
   
  val AssemblyQualifiedName : String = ""
   
  val BaseType : System.Type = null
   
  val UnderlyingSystemType : System.Type = null
   
  val TypeInitializer : System.Reflection.ConstructorInfo = null
   
  val Attributes : System.Reflection.TypeAttributes = System.Reflection.TypeAttributes.VisibilityMask
   
  val IsNotPublic : Boolean = false
   
  val IsPublic : Boolean = false
   
  val IsNestedPublic : Boolean = false
   
  val IsNestedPrivate : Boolean = false
   
  val IsNestedFamily : Boolean = false
   
  val IsNestedAssembly : Boolean = false
   
  val IsNestedFamANDAssem : Boolean = false
   
  val IsNestedFamORAssem : Boolean = false
   
  val IsAutoLayout : Boolean = false
   
  val IsLayoutSequential : Boolean = false
   
  val IsExplicitLayout : Boolean = false
   
  val IsClass : Boolean = false
   
  val IsInterface : Boolean = false
   
  val IsValueType : Boolean = false
   
  val IsAbstract : Boolean = false
   
  val IsSealed : Boolean = false
   
  val IsEnum : Boolean = false
   
  val IsSpecialName : Boolean = false
   
  val IsImport : Boolean = false
   
  val IsSerializable : Boolean = false
   
  val IsAnsiClass : Boolean = false
   
  val IsUnicodeClass : Boolean = false
   
  val IsAutoClass : Boolean = false
   
  val IsArray : Boolean = false
   
  val IsByRef : Boolean = false
   
  val IsPointer : Boolean = false
   
  val IsPrimitive : Boolean = false
   
  val IsCOMObject : Boolean = false
   
  val HasElementType : Boolean = false
   
  val IsContextful : Boolean = false
   
  val IsMarshalByRef : Boolean = false
}
 
abstract class SafeHandle extends System.Runtime.ConstrainedExecution.CriticalFinalizerObject with System.IDisposable {
  protected def Finalize: Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  protected def SetHandle(handle : System.IntPtr): Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def DangerousGetHandle: System.IntPtr
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Close: Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Dispose: Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  protected def Dispose(disposing : Boolean): Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def SetHandleAsInvalid: Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  protected /* abstract */ def ReleaseHandle: Boolean
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def DangerousAddRef(success : CLRByRef[Boolean]): Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def DangerousRelease: Unit
   
  protected var handle : System.IntPtr
   
  val IsClosed : Boolean = false
   
  val IsInvalid : Boolean = false
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  protected def this(invalidHandleValue : System.IntPtr, ownsHandle : Boolean) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsDual)
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.GuidAttribute("17156360-2f1a-384a-bc52-fde93c215c5b")
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
trait _Assembly {
  /* abstract */ def ToString: String
   
  /* abstract */ def Equals(other : AnyRef): Boolean
   
  /* abstract */ def GetHashCode: Int
   
  /* abstract */ def GetType: System.Type
   
  /* abstract */ def GetName: System.Reflection.AssemblyName
   
  /* abstract */ def GetName(copiedName : Boolean): System.Reflection.AssemblyName
   
  /* abstract */ def GetType(name : String): System.Type
   
  /* abstract */ def GetType(name : String, throwOnError : Boolean): System.Type
   
  /* abstract */ def GetExportedTypes: Array[System.Type]
   
  /* abstract */ def GetTypes: Array[System.Type]
   
  /* abstract */ def GetManifestResourceStream(`type` : System.Type, name : String): System.IO.Stream
   
  /* abstract */ def GetManifestResourceStream(name : String): System.IO.Stream
   
  /* abstract */ def GetFile(name : String): System.IO.FileStream
   
  /* abstract */ def GetFiles: Array[System.IO.FileStream]
   
  /* abstract */ def GetFiles(getResourceModules : Boolean): Array[System.IO.FileStream]
   
  /* abstract */ def GetManifestResourceNames: Array[String]
   
  /* abstract */ def GetManifestResourceInfo(resourceName : String): System.Reflection.ManifestResourceInfo
   
  /* abstract */ def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  /* abstract */ def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                                   context : System.Runtime.Serialization.StreamingContext): Unit
   
  /* abstract */ def add_ModuleResolve(value : System.Reflection.ModuleResolveEventHandler): Unit
   
  /* abstract */ def remove_ModuleResolve(value : System.Reflection.ModuleResolveEventHandler): Unit
   
  /* abstract */ def GetType(name : String, throwOnError : Boolean, ignoreCase : Boolean): System.Type
   
  /* abstract */ def GetSatelliteAssembly(culture : System.Globalization.CultureInfo): System.Reflection.Assembly
   
  /* abstract */ def GetSatelliteAssembly(culture : System.Globalization.CultureInfo, version : System.Version): System.Reflection.Assembly
   
  /* abstract */ def LoadModule(moduleName : String, rawModule : Array[UByte]): System.Reflection.Module
   
  /* abstract */ def LoadModule(moduleName : String, rawModule : Array[UByte], rawSymbolStore : Array[UByte]): System.Reflection.Module
   
  /* abstract */ def CreateInstance(typeName : String): AnyRef
   
  /* abstract */ def CreateInstance(typeName : String, ignoreCase : Boolean): AnyRef
   
  /* abstract */ def CreateInstance(typeName : String, ignoreCase : Boolean, 
                                    bindingAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                                    args : Array[AnyRef], culture : System.Globalization.CultureInfo, 
                                    activationAttributes : Array[AnyRef]): AnyRef
   
  /* abstract */ def GetLoadedModules: Array[System.Reflection.Module]
   
  /* abstract */ def GetLoadedModules(getResourceModules : Boolean): Array[System.Reflection.Module]
   
  /* abstract */ def GetModules: Array[System.Reflection.Module]
   
  /* abstract */ def GetModules(getResourceModules : Boolean): Array[System.Reflection.Module]
   
  /* abstract */ def GetModule(name : String): System.Reflection.Module
   
  /* abstract */ def GetReferencedAssemblies: Array[System.Reflection.AssemblyName]
   
  val CodeBase : String = ""
   
  val EscapedCodeBase : String = ""
   
  val FullName : String = ""
   
  val EntryPoint : System.Reflection.MethodInfo = null
   
  val Location : String = ""
   
  val Evidence : System.Security.Policy.Evidence = null
   
  val GlobalAssemblyCache : Boolean = false
   
  /* event ModuleResolve */
  /* abstract */ def add_ModuleResolve(value : System.Reflection.ModuleResolveEventHandler): Unit
  /* abstract */ def remove_ModuleResolve(value : System.Reflection.ModuleResolveEventHandler): Unit
}
 
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.GuidAttribute("B42B6AAC-317E-34D5-9FA9-093BB4160C50")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait _AssemblyName {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("6240837A-707F-3181-8E98-A36AE086766B")
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
trait _MethodBase {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
   
  /* abstract */ def ToString: String
   
  /* abstract */ def Equals(other : AnyRef): Boolean
   
  /* abstract */ def GetHashCode: Int
   
  /* abstract */ def GetType: System.Type
   
  /* abstract */ def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  /* abstract */ def GetParameters: Array[System.Reflection.ParameterInfo]
   
  /* abstract */ def GetMethodImplementationFlags: System.Reflection.MethodImplAttributes
   
  /* abstract */ def Invoke(obj : AnyRef, invokeAttr : System.Reflection.BindingFlags, 
                            binder : System.Reflection.Binder, parameters : Array[AnyRef], 
                            culture : System.Globalization.CultureInfo): AnyRef
   
  /* abstract */ def Invoke(obj : AnyRef, parameters : Array[AnyRef]): AnyRef
   
  val MemberType : System.Reflection.MemberTypes = System.Reflection.MemberTypes.Constructor
   
  val Name : String = ""
   
  val DeclaringType : System.Type = null
   
  val ReflectedType : System.Type = null
   
  val MethodHandle : System.RuntimeMethodHandle = new System.RuntimeMethodHandle()
   
  val Attributes : System.Reflection.MethodAttributes = System.Reflection.MethodAttributes.MemberAccessMask
   
  val CallingConvention : System.Reflection.CallingConventions = System.Reflection.CallingConventions.Standard
   
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
   
  val IsConstructor : Boolean = false
}
 
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("FFCC1B5D-ECB8-38DD-9B01-3DC8ABC2AA5F")
trait _MethodInfo {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
   
  /* abstract */ def ToString: String
   
  /* abstract */ def Equals(other : AnyRef): Boolean
   
  /* abstract */ def GetHashCode: Int
   
  /* abstract */ def GetType: System.Type
   
  /* abstract */ def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  /* abstract */ def GetParameters: Array[System.Reflection.ParameterInfo]
   
  /* abstract */ def GetMethodImplementationFlags: System.Reflection.MethodImplAttributes
   
  /* abstract */ def Invoke(obj : AnyRef, invokeAttr : System.Reflection.BindingFlags, 
                            binder : System.Reflection.Binder, parameters : Array[AnyRef], 
                            culture : System.Globalization.CultureInfo): AnyRef
   
  /* abstract */ def Invoke(obj : AnyRef, parameters : Array[AnyRef]): AnyRef
   
  /* abstract */ def GetBaseDefinition: System.Reflection.MethodInfo
   
  val MemberType : System.Reflection.MemberTypes = System.Reflection.MemberTypes.Constructor
   
  val Name : String = ""
   
  val DeclaringType : System.Type = null
   
  val ReflectedType : System.Type = null
   
  val MethodHandle : System.RuntimeMethodHandle = new System.RuntimeMethodHandle()
   
  val Attributes : System.Reflection.MethodAttributes = System.Reflection.MethodAttributes.MemberAccessMask
   
  val CallingConvention : System.Reflection.CallingConventions = System.Reflection.CallingConventions.Standard
   
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
   
  val IsConstructor : Boolean = false
   
  val ReturnType : System.Type = null
   
  val ReturnTypeCustomAttributes : System.Reflection.ICustomAttributeProvider = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.GuidAttribute("E9A19478-9646-3679-9B10-8411AE1FD57D")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait _ConstructorInfo {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
   
  /* abstract */ def ToString: String
   
  /* abstract */ def Equals(other : AnyRef): Boolean
   
  /* abstract */ def GetHashCode: Int
   
  /* abstract */ def GetType: System.Type
   
  /* abstract */ def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  /* abstract */ def GetParameters: Array[System.Reflection.ParameterInfo]
   
  /* abstract */ def GetMethodImplementationFlags: System.Reflection.MethodImplAttributes
   
  /* abstract */ def Invoke_2(obj : AnyRef, invokeAttr : System.Reflection.BindingFlags, 
                              binder : System.Reflection.Binder, parameters : Array[AnyRef], 
                              culture : System.Globalization.CultureInfo): AnyRef
   
  /* abstract */ def Invoke_3(obj : AnyRef, parameters : Array[AnyRef]): AnyRef
   
  /* abstract */ def Invoke_4(invokeAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                              parameters : Array[AnyRef], culture : System.Globalization.CultureInfo): AnyRef
   
  /* abstract */ def Invoke_5(parameters : Array[AnyRef]): AnyRef
   
  val MemberType : System.Reflection.MemberTypes = System.Reflection.MemberTypes.Constructor
   
  val Name : String = ""
   
  val DeclaringType : System.Type = null
   
  val ReflectedType : System.Type = null
   
  val MethodHandle : System.RuntimeMethodHandle = new System.RuntimeMethodHandle()
   
  val Attributes : System.Reflection.MethodAttributes = System.Reflection.MethodAttributes.MemberAccessMask
   
  val CallingConvention : System.Reflection.CallingConventions = System.Reflection.CallingConventions.Standard
   
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
   
  val IsConstructor : Boolean = false
}
 
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.GuidAttribute("8A7C1442-A9FB-366B-80D8-4939FFA6DBE0")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait _FieldInfo {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
   
  /* abstract */ def ToString: String
   
  /* abstract */ def Equals(other : AnyRef): Boolean
   
  /* abstract */ def GetHashCode: Int
   
  /* abstract */ def GetType: System.Type
   
  /* abstract */ def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  /* abstract */ def GetValue(obj : AnyRef): AnyRef
   
  /* abstract */ def GetValueDirect(obj : System.TypedReference): AnyRef
   
  /* abstract */ def SetValue(obj : AnyRef, value : AnyRef, invokeAttr : System.Reflection.BindingFlags, 
                              binder : System.Reflection.Binder, culture : System.Globalization.CultureInfo): Unit
   
  /* abstract */ def SetValueDirect(obj : System.TypedReference, value : System.TypedReference): Unit
   
  /* abstract */ def SetValue(obj : AnyRef, value : AnyRef): Unit
   
  val MemberType : System.Reflection.MemberTypes = System.Reflection.MemberTypes.Constructor
   
  val Name : String = ""
   
  val DeclaringType : System.Type = null
   
  val ReflectedType : System.Type = null
   
  val FieldType : System.Type = null
   
  val FieldHandle : System.RuntimeFieldHandle = new System.RuntimeFieldHandle()
   
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
}
 
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.GuidAttribute("F59ED4E4-E68F-3218-BD77-061AA82824BF")
trait _PropertyInfo {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
   
  /* abstract */ def ToString: String
   
  /* abstract */ def Equals(other : AnyRef): Boolean
   
  /* abstract */ def GetHashCode: Int
   
  /* abstract */ def GetType: System.Type
   
  /* abstract */ def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  /* abstract */ def GetValue(obj : AnyRef, index : Array[AnyRef]): AnyRef
   
  /* abstract */ def GetValue(obj : AnyRef, invokeAttr : System.Reflection.BindingFlags, 
                              binder : System.Reflection.Binder, index : Array[AnyRef], 
                              culture : System.Globalization.CultureInfo): AnyRef
   
  /* abstract */ def SetValue(obj : AnyRef, value : AnyRef, index : Array[AnyRef]): Unit
   
  /* abstract */ def SetValue(obj : AnyRef, value : AnyRef, invokeAttr : System.Reflection.BindingFlags, 
                              binder : System.Reflection.Binder, index : Array[AnyRef], 
                              culture : System.Globalization.CultureInfo): Unit
   
  /* abstract */ def GetAccessors(nonPublic : Boolean): Array[System.Reflection.MethodInfo]
   
  /* abstract */ def GetGetMethod(nonPublic : Boolean): System.Reflection.MethodInfo
   
  /* abstract */ def GetSetMethod(nonPublic : Boolean): System.Reflection.MethodInfo
   
  /* abstract */ def GetIndexParameters: Array[System.Reflection.ParameterInfo]
   
  /* abstract */ def GetAccessors: Array[System.Reflection.MethodInfo]
   
  /* abstract */ def GetGetMethod: System.Reflection.MethodInfo
   
  /* abstract */ def GetSetMethod: System.Reflection.MethodInfo
   
  val MemberType : System.Reflection.MemberTypes = System.Reflection.MemberTypes.Constructor
   
  val Name : String = ""
   
  val DeclaringType : System.Type = null
   
  val ReflectedType : System.Type = null
   
  val PropertyType : System.Type = null
   
  val Attributes : System.Reflection.PropertyAttributes = System.Reflection.PropertyAttributes.None
   
  val CanRead : Boolean = false
   
  val CanWrite : Boolean = false
   
  val IsSpecialName : Boolean = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("9DE59C64-D889-35A1-B897-587D74469E5B")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
trait _EventInfo {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
   
  /* abstract */ def ToString: String
   
  /* abstract */ def Equals(other : AnyRef): Boolean
   
  /* abstract */ def GetHashCode: Int
   
  /* abstract */ def GetType: System.Type
   
  /* abstract */ def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  /* abstract */ def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  /* abstract */ def GetAddMethod(nonPublic : Boolean): System.Reflection.MethodInfo
   
  /* abstract */ def GetRemoveMethod(nonPublic : Boolean): System.Reflection.MethodInfo
   
  /* abstract */ def GetRaiseMethod(nonPublic : Boolean): System.Reflection.MethodInfo
   
  /* abstract */ def GetAddMethod: System.Reflection.MethodInfo
   
  /* abstract */ def GetRemoveMethod: System.Reflection.MethodInfo
   
  /* abstract */ def GetRaiseMethod: System.Reflection.MethodInfo
   
  /* abstract */ def AddEventHandler(target : AnyRef, handler : System.Delegate): Unit
   
  /* abstract */ def RemoveEventHandler(target : AnyRef, handler : System.Delegate): Unit
   
  val MemberType : System.Reflection.MemberTypes = System.Reflection.MemberTypes.Constructor
   
  val Name : String = ""
   
  val DeclaringType : System.Type = null
   
  val ReflectedType : System.Type = null
   
  val Attributes : System.Reflection.EventAttributes = System.Reflection.EventAttributes.None
   
  val EventHandlerType : System.Type = null
   
  val IsSpecialName : Boolean = false
   
  val IsMulticast : Boolean = false
}
 
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.GuidAttribute("993634C4-E47A-32CC-BE08-85F567DC27D6")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait _ParameterInfo {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.GuidAttribute("D002E9BA-D9E3-3749-B1D3-D565A08B13E7")
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait _Module {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
abstract class CriticalHandle extends System.Runtime.ConstrainedExecution.CriticalFinalizerObject with System.IDisposable {
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  protected def Finalize: Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  protected def SetHandle(handle : System.IntPtr): Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Close: Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Dispose: Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  protected def Dispose(disposing : Boolean): Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def SetHandleAsInvalid: Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  protected /* abstract */ def ReleaseHandle: Boolean
   
  protected var handle : System.IntPtr
   
  val IsClosed : Boolean = false
   
  val IsInvalid : Boolean = false
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  protected def this(invalidHandleValue : System.IntPtr) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ArrayWithOffset extends System.ValueType {
  def GetArray: AnyRef
   
  def GetOffset: Int
   
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : System.Runtime.InteropServices.ArrayWithOffset): Boolean
   
  def this(array : AnyRef, offset : Int) {}
}
object ArrayWithOffset {
  def ==(a : System.Runtime.InteropServices.ArrayWithOffset, 
         b : System.Runtime.InteropServices.ArrayWithOffset): Boolean  = false
   
  def !=(a : System.Runtime.InteropServices.ArrayWithOffset, 
         b : System.Runtime.InteropServices.ArrayWithOffset): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(4096 /* AllowMultiple = false, Inherited = false */ )
sealed class UnmanagedFunctionPointerAttribute extends System.Attribute {
  var CharSet : System.Runtime.InteropServices.CharSet
   
  var BestFitMapping : Boolean
   
  var ThrowOnUnmappableChar : Boolean
   
  var SetLastError : Boolean
   
  val CallingConvention : System.Runtime.InteropServices.CallingConvention = System.Runtime.InteropServices.CallingConvention.Winapi
   
  def this(callingConvention : System.Runtime.InteropServices.CallingConvention) {}
}
 
@System.AttributeUsageAttribute(64 /* AllowMultiple = false, Inherited = false */ )
sealed class AllowReversePInvokeCallsAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(960 /* Inherited = false */ )
sealed class DispIdAttribute extends System.Attribute {
  val Value : Int = 0
   
  def this(dispId : Int) {}
}
 
sealed abstract class ComInterfaceType extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ComInterfaceType): Boolean = false
  def !=(that: System.Runtime.InteropServices.ComInterfaceType): Boolean = false
  def  <(that: System.Runtime.InteropServices.ComInterfaceType): Boolean = false
  def <=(that: System.Runtime.InteropServices.ComInterfaceType): Boolean = false
  def  >(that: System.Runtime.InteropServices.ComInterfaceType): Boolean = false
  def >=(that: System.Runtime.InteropServices.ComInterfaceType): Boolean = false
  def  |(that: System.Runtime.InteropServices.ComInterfaceType): Boolean = false
  def  &(that: System.Runtime.InteropServices.ComInterfaceType): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ComInterfaceType): Boolean = false
}
object ComInterfaceType{
  val InterfaceIsDual	 = value(0)
  val InterfaceIsIUnknown	 = value(1)
  val InterfaceIsIDispatch	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.ComInterfaceType = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1024 /* Inherited = false */ )
sealed class InterfaceTypeAttribute extends System.Attribute {
  val Value : System.Runtime.InteropServices.ComInterfaceType = System.Runtime.InteropServices.ComInterfaceType.InterfaceIsDual
   
  def this(interfaceType : System.Runtime.InteropServices.ComInterfaceType) {}
   
  def this(interfaceType : Short) {}
}
 
@System.AttributeUsageAttribute(4 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ComDefaultInterfaceAttribute extends System.Attribute {
  val Value : System.Type = null
   
  def this(defaultInterface : System.Type) {}
}
 
sealed abstract class ClassInterfaceType extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ClassInterfaceType): Boolean = false
  def !=(that: System.Runtime.InteropServices.ClassInterfaceType): Boolean = false
  def  <(that: System.Runtime.InteropServices.ClassInterfaceType): Boolean = false
  def <=(that: System.Runtime.InteropServices.ClassInterfaceType): Boolean = false
  def  >(that: System.Runtime.InteropServices.ClassInterfaceType): Boolean = false
  def >=(that: System.Runtime.InteropServices.ClassInterfaceType): Boolean = false
  def  |(that: System.Runtime.InteropServices.ClassInterfaceType): Boolean = false
  def  &(that: System.Runtime.InteropServices.ClassInterfaceType): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ClassInterfaceType): Boolean = false
}
object ClassInterfaceType{
  val None	 = value(0)
  val AutoDispatch	 = value(1)
  val AutoDual	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.ClassInterfaceType = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(5 /* Inherited = false */ )
sealed class ClassInterfaceAttribute extends System.Attribute {
  val Value : System.Runtime.InteropServices.ClassInterfaceType = System.Runtime.InteropServices.ClassInterfaceType.None
   
  def this(classInterfaceType : System.Runtime.InteropServices.ClassInterfaceType) {}
   
  def this(classInterfaceType : Short) {}
}
 
@System.AttributeUsageAttribute(5597 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ComVisibleAttribute extends System.Attribute {
  val Value : Boolean = false
   
  def this(visibility : Boolean) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1024 /* Inherited = false */ )
sealed class TypeLibImportClassAttribute extends System.Attribute {
  val Value : String = ""
   
  def this(importClass : System.Type) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(64 /* Inherited = false */ )
sealed class LCIDConversionAttribute extends System.Attribute {
  val Value : Int = 0
   
  def this(lcid : Int) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(64 /* Inherited = false */ )
sealed class ComRegisterFunctionAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(64 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ComUnregisterFunctionAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(4 /* Inherited = false */ )
sealed class ProgIdAttribute extends System.Attribute {
  val Value : String = ""
   
  def this(progId : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
sealed class ImportedFromTypeLibAttribute extends System.Attribute {
  val Value : String = ""
   
  def this(tlbFile : String) {}
}
 
sealed abstract class IDispatchImplType extends System.Enum {
  def ==(that: System.Runtime.InteropServices.IDispatchImplType): Boolean = false
  def !=(that: System.Runtime.InteropServices.IDispatchImplType): Boolean = false
  def  <(that: System.Runtime.InteropServices.IDispatchImplType): Boolean = false
  def <=(that: System.Runtime.InteropServices.IDispatchImplType): Boolean = false
  def  >(that: System.Runtime.InteropServices.IDispatchImplType): Boolean = false
  def >=(that: System.Runtime.InteropServices.IDispatchImplType): Boolean = false
  def  |(that: System.Runtime.InteropServices.IDispatchImplType): Boolean = false
  def  &(that: System.Runtime.InteropServices.IDispatchImplType): Boolean = false
  def  ^(that: System.Runtime.InteropServices.IDispatchImplType): Boolean = false
}
object IDispatchImplType{
  val SystemDefinedImpl	 = value(0)
  val InternalImpl	 = value(1)
  val CompatibleImpl	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.IDispatchImplType = null
}
 
@System.ObsoleteAttribute("This attribute is deprecated and will be removed in a future version.", false)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(5 /* Inherited = false */ )
sealed class IDispatchImplAttribute extends System.Attribute {
  val Value : System.Runtime.InteropServices.IDispatchImplType = System.Runtime.InteropServices.IDispatchImplType.SystemDefinedImpl
   
  def this(implType : System.Runtime.InteropServices.IDispatchImplType) {}
   
  def this(implType : Short) {}
}
 
@System.AttributeUsageAttribute(4 /* Inherited = true */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ComSourceInterfacesAttribute extends System.Attribute {
  val Value : String = ""
   
  def this(sourceInterfaces : String) {}
   
  def this(sourceInterface : System.Type) {}
   
  def this(sourceInterface1 : System.Type, sourceInterface2 : System.Type) {}
   
  def this(sourceInterface1 : System.Type, sourceInterface2 : System.Type, 
           sourceInterface3 : System.Type) {}
   
  def this(sourceInterface1 : System.Type, sourceInterface2 : System.Type, 
           sourceInterface3 : System.Type, sourceInterface4 : System.Type) {}
}
 
@System.AttributeUsageAttribute(32767 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ComConversionLossAttribute extends System.Attribute {
  def this() {}
}
 
sealed abstract class TypeLibTypeFlags extends System.Enum {
  def ==(that: System.Runtime.InteropServices.TypeLibTypeFlags): Boolean = false
  def !=(that: System.Runtime.InteropServices.TypeLibTypeFlags): Boolean = false
  def  <(that: System.Runtime.InteropServices.TypeLibTypeFlags): Boolean = false
  def <=(that: System.Runtime.InteropServices.TypeLibTypeFlags): Boolean = false
  def  >(that: System.Runtime.InteropServices.TypeLibTypeFlags): Boolean = false
  def >=(that: System.Runtime.InteropServices.TypeLibTypeFlags): Boolean = false
  def  |(that: System.Runtime.InteropServices.TypeLibTypeFlags): Boolean = false
  def  &(that: System.Runtime.InteropServices.TypeLibTypeFlags): Boolean = false
  def  ^(that: System.Runtime.InteropServices.TypeLibTypeFlags): Boolean = false
}
object TypeLibTypeFlags{
  val FAppObject	 = value(1)
  val FCanCreate	 = value(2)
  val FLicensed	 = value(4)
  val FPreDeclId	 = value(8)
  val FHidden	 = value(16)
  val FControl	 = value(32)
  val FDual	 = value(64)
  val FNonExtensible	 = value(128)
  val FOleAutomation	 = value(256)
  val FRestricted	 = value(512)
  val FAggregatable	 = value(1024)
  val FReplaceable	 = value(2048)
  val FDispatchable	 = value(4096)
  val FReverseBind	 = value(8192)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.TypeLibTypeFlags = null
}
 
sealed abstract class TypeLibFuncFlags extends System.Enum {
  def ==(that: System.Runtime.InteropServices.TypeLibFuncFlags): Boolean = false
  def !=(that: System.Runtime.InteropServices.TypeLibFuncFlags): Boolean = false
  def  <(that: System.Runtime.InteropServices.TypeLibFuncFlags): Boolean = false
  def <=(that: System.Runtime.InteropServices.TypeLibFuncFlags): Boolean = false
  def  >(that: System.Runtime.InteropServices.TypeLibFuncFlags): Boolean = false
  def >=(that: System.Runtime.InteropServices.TypeLibFuncFlags): Boolean = false
  def  |(that: System.Runtime.InteropServices.TypeLibFuncFlags): Boolean = false
  def  &(that: System.Runtime.InteropServices.TypeLibFuncFlags): Boolean = false
  def  ^(that: System.Runtime.InteropServices.TypeLibFuncFlags): Boolean = false
}
object TypeLibFuncFlags{
  val FRestricted	 = value(1)
  val FSource	 = value(2)
  val FBindable	 = value(4)
  val FRequestEdit	 = value(8)
  val FDisplayBind	 = value(16)
  val FDefaultBind	 = value(32)
  val FHidden	 = value(64)
  val FUsesGetLastError	 = value(128)
  val FDefaultCollelem	 = value(256)
  val FUiDefault	 = value(512)
  val FNonBrowsable	 = value(1024)
  val FReplaceable	 = value(2048)
  val FImmediateBind	 = value(4096)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.TypeLibFuncFlags = null
}
 
sealed abstract class TypeLibVarFlags extends System.Enum {
  def ==(that: System.Runtime.InteropServices.TypeLibVarFlags): Boolean = false
  def !=(that: System.Runtime.InteropServices.TypeLibVarFlags): Boolean = false
  def  <(that: System.Runtime.InteropServices.TypeLibVarFlags): Boolean = false
  def <=(that: System.Runtime.InteropServices.TypeLibVarFlags): Boolean = false
  def  >(that: System.Runtime.InteropServices.TypeLibVarFlags): Boolean = false
  def >=(that: System.Runtime.InteropServices.TypeLibVarFlags): Boolean = false
  def  |(that: System.Runtime.InteropServices.TypeLibVarFlags): Boolean = false
  def  &(that: System.Runtime.InteropServices.TypeLibVarFlags): Boolean = false
  def  ^(that: System.Runtime.InteropServices.TypeLibVarFlags): Boolean = false
}
object TypeLibVarFlags{
  val FReadOnly	 = value(1)
  val FSource	 = value(2)
  val FBindable	 = value(4)
  val FRequestEdit	 = value(8)
  val FDisplayBind	 = value(16)
  val FDefaultBind	 = value(32)
  val FHidden	 = value(64)
  val FRestricted	 = value(128)
  val FDefaultCollelem	 = value(256)
  val FUiDefault	 = value(512)
  val FNonBrowsable	 = value(1024)
  val FReplaceable	 = value(2048)
  val FImmediateBind	 = value(4096)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.TypeLibVarFlags = null
}
 
@System.AttributeUsageAttribute(1052 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class TypeLibTypeAttribute extends System.Attribute {
  val Value : System.Runtime.InteropServices.TypeLibTypeFlags = System.Runtime.InteropServices.TypeLibTypeFlags.FAppObject
   
  def this(flags : System.Runtime.InteropServices.TypeLibTypeFlags) {}
   
  def this(flags : Short) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(64 /* Inherited = false */ )
sealed class TypeLibFuncAttribute extends System.Attribute {
  val Value : System.Runtime.InteropServices.TypeLibFuncFlags = System.Runtime.InteropServices.TypeLibFuncFlags.FRestricted
   
  def this(flags : System.Runtime.InteropServices.TypeLibFuncFlags) {}
   
  def this(flags : Short) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(256 /* Inherited = false */ )
sealed class TypeLibVarAttribute extends System.Attribute {
  val Value : System.Runtime.InteropServices.TypeLibVarFlags = System.Runtime.InteropServices.TypeLibVarFlags.FReadOnly
   
  def this(flags : System.Runtime.InteropServices.TypeLibVarFlags) {}
   
  def this(flags : Short) {}
}
 
sealed abstract class VarEnum extends System.Enum {
  def ==(that: System.Runtime.InteropServices.VarEnum): Boolean = false
  def !=(that: System.Runtime.InteropServices.VarEnum): Boolean = false
  def  <(that: System.Runtime.InteropServices.VarEnum): Boolean = false
  def <=(that: System.Runtime.InteropServices.VarEnum): Boolean = false
  def  >(that: System.Runtime.InteropServices.VarEnum): Boolean = false
  def >=(that: System.Runtime.InteropServices.VarEnum): Boolean = false
  def  |(that: System.Runtime.InteropServices.VarEnum): Boolean = false
  def  &(that: System.Runtime.InteropServices.VarEnum): Boolean = false
  def  ^(that: System.Runtime.InteropServices.VarEnum): Boolean = false
}
object VarEnum{
  val VT_EMPTY	 = value(0)
  val VT_NULL	 = value(1)
  val VT_I2	 = value(2)
  val VT_I4	 = value(3)
  val VT_R4	 = value(4)
  val VT_R8	 = value(5)
  val VT_CY	 = value(6)
  val VT_DATE	 = value(7)
  val VT_BSTR	 = value(8)
  val VT_DISPATCH	 = value(9)
  val VT_ERROR	 = value(10)
  val VT_BOOL	 = value(11)
  val VT_VARIANT	 = value(12)
  val VT_UNKNOWN	 = value(13)
  val VT_DECIMAL	 = value(14)
  val VT_I1	 = value(16)
  val VT_UI1	 = value(17)
  val VT_UI2	 = value(18)
  val VT_UI4	 = value(19)
  val VT_I8	 = value(20)
  val VT_UI8	 = value(21)
  val VT_INT	 = value(22)
  val VT_UINT	 = value(23)
  val VT_VOID	 = value(24)
  val VT_HRESULT	 = value(25)
  val VT_PTR	 = value(26)
  val VT_SAFEARRAY	 = value(27)
  val VT_CARRAY	 = value(28)
  val VT_USERDEFINED	 = value(29)
  val VT_LPSTR	 = value(30)
  val VT_LPWSTR	 = value(31)
  val VT_RECORD	 = value(36)
  val VT_FILETIME	 = value(64)
  val VT_BLOB	 = value(65)
  val VT_STREAM	 = value(66)
  val VT_STORAGE	 = value(67)
  val VT_STREAMED_OBJECT	 = value(68)
  val VT_STORED_OBJECT	 = value(69)
  val VT_BLOB_OBJECT	 = value(70)
  val VT_CF	 = value(71)
  val VT_CLSID	 = value(72)
  val VT_VECTOR	 = value(4096)
  val VT_ARRAY	 = value(8192)
  val VT_BYREF	 = value(16384)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.VarEnum = null
}
 
sealed abstract class UnmanagedType extends System.Enum {
  def ==(that: System.Runtime.InteropServices.UnmanagedType): Boolean = false
  def !=(that: System.Runtime.InteropServices.UnmanagedType): Boolean = false
  def  <(that: System.Runtime.InteropServices.UnmanagedType): Boolean = false
  def <=(that: System.Runtime.InteropServices.UnmanagedType): Boolean = false
  def  >(that: System.Runtime.InteropServices.UnmanagedType): Boolean = false
  def >=(that: System.Runtime.InteropServices.UnmanagedType): Boolean = false
  def  |(that: System.Runtime.InteropServices.UnmanagedType): Boolean = false
  def  &(that: System.Runtime.InteropServices.UnmanagedType): Boolean = false
  def  ^(that: System.Runtime.InteropServices.UnmanagedType): Boolean = false
}
object UnmanagedType{
  val Bool	 = value(2)
  val I1	 = value(3)
  val U1	 = value(4)
  val I2	 = value(5)
  val U2	 = value(6)
  val I4	 = value(7)
  val U4	 = value(8)
  val I8	 = value(9)
  val U8	 = value(10)
  val R4	 = value(11)
  val R8	 = value(12)
  val Currency	 = value(15)
  val BStr	 = value(19)
  val LPStr	 = value(20)
  val LPWStr	 = value(21)
  val LPTStr	 = value(22)
  val ByValTStr	 = value(23)
  val IUnknown	 = value(25)
  val IDispatch	 = value(26)
  val Struct	 = value(27)
  val Interface	 = value(28)
  val SafeArray	 = value(29)
  val ByValArray	 = value(30)
  val SysInt	 = value(31)
  val SysUInt	 = value(32)
  val VBByRefStr	 = value(34)
  val AnsiBStr	 = value(35)
  val TBStr	 = value(36)
  val VariantBool	 = value(37)
  val FunctionPtr	 = value(38)
  val AsAny	 = value(40)
  val LPArray	 = value(42)
  val LPStruct	 = value(43)
  val CustomMarshaler	 = value(44)
  val Error	 = value(45)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.UnmanagedType = null
}
 
@System.AttributeUsageAttribute(10496 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class MarshalAsAttribute extends System.Attribute {
  var SafeArraySubType : System.Runtime.InteropServices.VarEnum
   
  var SafeArrayUserDefinedSubType : System.Type
   
  var IidParameterIndex : Int
   
  var ArraySubType : System.Runtime.InteropServices.UnmanagedType
   
  var SizeParamIndex : Short
   
  var SizeConst : Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  var MarshalType : String
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  var MarshalTypeRef : System.Type
   
  var MarshalCookie : String
   
  val Value : System.Runtime.InteropServices.UnmanagedType = System.Runtime.InteropServices.UnmanagedType.Bool
   
  def this(unmanagedType : System.Runtime.InteropServices.UnmanagedType) {}
   
  def this(unmanagedType : Short) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1028 /* Inherited = false */ )
sealed class ComImportAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(5149 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class GuidAttribute extends System.Attribute {
  val Value : String = ""
   
  def this(guid : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(64 /* Inherited = false */ )
sealed class PreserveSigAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(2048 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class InAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(2048 /* Inherited = false */ )
sealed class OutAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(2048 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class OptionalAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(64 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class DllImportAttribute extends System.Attribute {
  var EntryPoint : String
   
  var CharSet : System.Runtime.InteropServices.CharSet
   
  var SetLastError : Boolean
   
  var ExactSpelling : Boolean
   
  var PreserveSig : Boolean
   
  var CallingConvention : System.Runtime.InteropServices.CallingConvention
   
  var BestFitMapping : Boolean
   
  var ThrowOnUnmappableChar : Boolean
   
  val Value : String = ""
   
  def this(dllName : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(12 /* Inherited = false */ )
sealed class StructLayoutAttribute extends System.Attribute {
  var Pack : Int
   
  var Size : Int
   
  var CharSet : System.Runtime.InteropServices.CharSet
   
  val Value : System.Runtime.InteropServices.LayoutKind = System.Runtime.InteropServices.LayoutKind.Sequential
   
  def this(layoutKind : System.Runtime.InteropServices.LayoutKind) {}
   
  def this(layoutKind : Short) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(256 /* Inherited = false */ )
sealed class FieldOffsetAttribute extends System.Attribute {
  val Value : Int = 0
   
  def this(offset : Int) {}
}
 
@System.AttributeUsageAttribute(10624 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ComAliasNameAttribute extends System.Attribute {
  val Value : String = ""
   
  def this(alias : String) {}
}
 
@System.AttributeUsageAttribute(1029 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AutomationProxyAttribute extends System.Attribute {
  val Value : Boolean = false
   
  def this(`val` : Boolean) {}
}
 
@System.AttributeUsageAttribute(1 /* Inherited = false, AllowMultiple = true */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class PrimaryInteropAssemblyAttribute extends System.Attribute {
  val MajorVersion : Int = 0
   
  val MinorVersion : Int = 0
   
  def this(major : Int, minor : Int) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1024 /* Inherited = false */ )
sealed class CoClassAttribute extends System.Attribute {
  val CoClass : System.Type = null
   
  def this(coClass : System.Type) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1024 /* Inherited = false */ )
sealed class ComEventInterfaceAttribute extends System.Attribute {
  val SourceInterface : System.Type = null
   
  val EventProvider : System.Type = null
   
  def this(SourceInterface : System.Type, EventProvider : System.Type) {}
}
 
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class TypeLibVersionAttribute extends System.Attribute {
  val MajorVersion : Int = 0
   
  val MinorVersion : Int = 0
   
  def this(major : Int, minor : Int) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
sealed class ComCompatibleVersionAttribute extends System.Attribute {
  val MajorVersion : Int = 0
   
  val MinorVersion : Int = 0
   
  val BuildNumber : Int = 0
   
  val RevisionNumber : Int = 0
   
  def this(major : Int, minor : Int, build : Int, revision : Int) {}
}
 
@System.AttributeUsageAttribute(1037 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class BestFitMappingAttribute extends System.Attribute {
  var ThrowOnUnmappableChar : Boolean
   
  val BestFitMapping : Boolean = false
   
  def this(BestFitMapping : Boolean) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(2 /* Inherited = false */ )
sealed class DefaultCharSetAttribute extends System.Attribute {
  val CharSet : System.Runtime.InteropServices.CharSet = System.Runtime.InteropServices.CharSet.None
   
  def this(charSet : System.Runtime.InteropServices.CharSet) {}
}
 
@System.ObsoleteAttribute("This attribute has been deprecated.  Application Domains no longer respect Activation Context boundaries in IDispatch calls.", false)
@System.AttributeUsageAttribute(1 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SetWin32ContextInIDispatchAttribute extends System.Attribute {
  def this() {}
}
 
sealed abstract class CallingConvention extends System.Enum {
  def ==(that: System.Runtime.InteropServices.CallingConvention): Boolean = false
  def !=(that: System.Runtime.InteropServices.CallingConvention): Boolean = false
  def  <(that: System.Runtime.InteropServices.CallingConvention): Boolean = false
  def <=(that: System.Runtime.InteropServices.CallingConvention): Boolean = false
  def  >(that: System.Runtime.InteropServices.CallingConvention): Boolean = false
  def >=(that: System.Runtime.InteropServices.CallingConvention): Boolean = false
  def  |(that: System.Runtime.InteropServices.CallingConvention): Boolean = false
  def  &(that: System.Runtime.InteropServices.CallingConvention): Boolean = false
  def  ^(that: System.Runtime.InteropServices.CallingConvention): Boolean = false
}
object CallingConvention{
  val Winapi	 = value(1)
  val Cdecl	 = value(2)
  val StdCall	 = value(3)
  val ThisCall	 = value(4)
  val FastCall	 = value(5)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.CallingConvention = null
}
 
sealed abstract class CharSet extends System.Enum {
  def ==(that: System.Runtime.InteropServices.CharSet): Boolean = false
  def !=(that: System.Runtime.InteropServices.CharSet): Boolean = false
  def  <(that: System.Runtime.InteropServices.CharSet): Boolean = false
  def <=(that: System.Runtime.InteropServices.CharSet): Boolean = false
  def  >(that: System.Runtime.InteropServices.CharSet): Boolean = false
  def >=(that: System.Runtime.InteropServices.CharSet): Boolean = false
  def  |(that: System.Runtime.InteropServices.CharSet): Boolean = false
  def  &(that: System.Runtime.InteropServices.CharSet): Boolean = false
  def  ^(that: System.Runtime.InteropServices.CharSet): Boolean = false
}
object CharSet{
  val None	 = value(1)
  val Ansi	 = value(2)
  val Unicode	 = value(3)
  val Auto	 = value(4)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.CharSet = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ExternalException extends System.SystemException {
  val ErrorCode : Int = 0
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  def this(message : String, errorCode : Int) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class COMException extends System.Runtime.InteropServices.ExternalException {
  def ToString: String
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  def this(message : String, errorCode : Int) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
sealed abstract class GCHandleType extends System.Enum {
  def ==(that: System.Runtime.InteropServices.GCHandleType): Boolean = false
  def !=(that: System.Runtime.InteropServices.GCHandleType): Boolean = false
  def  <(that: System.Runtime.InteropServices.GCHandleType): Boolean = false
  def <=(that: System.Runtime.InteropServices.GCHandleType): Boolean = false
  def  >(that: System.Runtime.InteropServices.GCHandleType): Boolean = false
  def >=(that: System.Runtime.InteropServices.GCHandleType): Boolean = false
  def  |(that: System.Runtime.InteropServices.GCHandleType): Boolean = false
  def  &(that: System.Runtime.InteropServices.GCHandleType): Boolean = false
  def  ^(that: System.Runtime.InteropServices.GCHandleType): Boolean = false
}
object GCHandleType{
  val Weak	 = value(0)
  val WeakTrackResurrection	 = value(1)
  val Normal	 = value(2)
  val Pinned	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.GCHandleType = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class GCHandle extends System.ValueType {
  def Free: Unit
   
  def AddrOfPinnedObject: System.IntPtr
   
  def GetHashCode: Int
   
  def Equals(o : AnyRef): Boolean
   
  var Target : AnyRef = null
   
  val IsAllocated : Boolean = false
}
object GCHandle {
  def Alloc(value : AnyRef): System.Runtime.InteropServices.GCHandle  = new System.Runtime.InteropServices.GCHandle()
   
  def Alloc(value : AnyRef, `type` : System.Runtime.InteropServices.GCHandleType): System.Runtime.InteropServices.GCHandle  = new System.Runtime.InteropServices.GCHandle()
   
  def op_Explicit(value : System.IntPtr): System.Runtime.InteropServices.GCHandle  = new System.Runtime.InteropServices.GCHandle()
   
  def FromIntPtr(value : System.IntPtr): System.Runtime.InteropServices.GCHandle  = new System.Runtime.InteropServices.GCHandle()
   
  def op_Explicit(value : System.Runtime.InteropServices.GCHandle): System.IntPtr  = new System.IntPtr()
   
  def ToIntPtr(value : System.Runtime.InteropServices.GCHandle): System.IntPtr  = new System.IntPtr()
   
  def ==(a : System.Runtime.InteropServices.GCHandle, 
         b : System.Runtime.InteropServices.GCHandle): Boolean  = false
   
  def !=(a : System.Runtime.InteropServices.GCHandle, 
         b : System.Runtime.InteropServices.GCHandle): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class HandleRef extends System.ValueType {
  val Wrapper : AnyRef = null
   
  val Handle : System.IntPtr = new System.IntPtr()
   
  def this(wrapper : AnyRef, handle : System.IntPtr) {}
}
object HandleRef {
  def op_Explicit(value : System.Runtime.InteropServices.HandleRef): System.IntPtr  = new System.IntPtr()
   
  def ToIntPtr(value : System.Runtime.InteropServices.HandleRef): System.IntPtr  = new System.IntPtr()
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ICustomMarshaler {
  /* abstract */ def MarshalNativeToManaged(pNativeData : System.IntPtr): AnyRef
   
  /* abstract */ def MarshalManagedToNative(ManagedObj : AnyRef): System.IntPtr
   
  /* abstract */ def CleanUpNativeData(pNativeData : System.IntPtr): Unit
   
  /* abstract */ def CleanUpManagedData(ManagedObj : AnyRef): Unit
   
  /* abstract */ def GetNativeDataSize: Int
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class InvalidOleVariantTypeException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
sealed abstract class LayoutKind extends System.Enum {
  def ==(that: System.Runtime.InteropServices.LayoutKind): Boolean = false
  def !=(that: System.Runtime.InteropServices.LayoutKind): Boolean = false
  def  <(that: System.Runtime.InteropServices.LayoutKind): Boolean = false
  def <=(that: System.Runtime.InteropServices.LayoutKind): Boolean = false
  def  >(that: System.Runtime.InteropServices.LayoutKind): Boolean = false
  def >=(that: System.Runtime.InteropServices.LayoutKind): Boolean = false
  def  |(that: System.Runtime.InteropServices.LayoutKind): Boolean = false
  def  &(that: System.Runtime.InteropServices.LayoutKind): Boolean = false
  def  ^(that: System.Runtime.InteropServices.LayoutKind): Boolean = false
}
object LayoutKind{
  val Sequential	 = value(0)
  val Explicit	 = value(2)
  val Auto	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.LayoutKind = null
}
 
@System.Security.SuppressUnmanagedCodeSecurityAttribute()
abstract sealed class Marshal extends AnyRef 
object Marshal {
  def PtrToStringAnsi(ptr : System.IntPtr): String  = ""
   
  def PtrToStringAnsi(ptr : System.IntPtr, len : Int): String  = ""
   
  def PtrToStringUni(ptr : System.IntPtr, len : Int): String  = ""
   
  def PtrToStringAuto(ptr : System.IntPtr, len : Int): String  = ""
   
  def PtrToStringUni(ptr : System.IntPtr): String  = ""
   
  def PtrToStringAuto(ptr : System.IntPtr): String  = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def SizeOf(structure : AnyRef): Int  = 0
   
  def SizeOf(t : System.Type): Int  = 0
   
  def OffsetOf(t : System.Type, fieldName : String): System.IntPtr  = new System.IntPtr()
   
  def UnsafeAddrOfPinnedArrayElement(arr : System.Array, index : Int): System.IntPtr  = new System.IntPtr()
   
  def Copy(source : Array[Int], startIndex : Int, destination : System.IntPtr, length : Int): Unit  = {}
   
  def Copy(source : Array[Char], startIndex : Int, destination : System.IntPtr, length : Int): Unit  = {}
   
  def Copy(source : Array[Short], startIndex : Int, destination : System.IntPtr, length : Int): Unit  = {}
   
  def Copy(source : Array[Long], startIndex : Int, destination : System.IntPtr, length : Int): Unit  = {}
   
  def Copy(source : Array[Float], startIndex : Int, destination : System.IntPtr, length : Int): Unit  = {}
   
  def Copy(source : Array[Double], startIndex : Int, destination : System.IntPtr, length : Int): Unit  = {}
   
  def Copy(source : Array[UByte], startIndex : Int, destination : System.IntPtr, length : Int): Unit  = {}
   
  def Copy(source : Array[System.IntPtr], startIndex : Int, destination : System.IntPtr, 
           length : Int): Unit  = {}
   
  def Copy(source : System.IntPtr, destination : Array[Int], startIndex : Int, length : Int): Unit  = {}
   
  def Copy(source : System.IntPtr, destination : Array[Char], startIndex : Int, length : Int): Unit  = {}
   
  def Copy(source : System.IntPtr, destination : Array[Short], startIndex : Int, length : Int): Unit  = {}
   
  def Copy(source : System.IntPtr, destination : Array[Long], startIndex : Int, length : Int): Unit  = {}
   
  def Copy(source : System.IntPtr, destination : Array[Float], startIndex : Int, length : Int): Unit  = {}
   
  def Copy(source : System.IntPtr, destination : Array[Double], startIndex : Int, length : Int): Unit  = {}
   
  def Copy(source : System.IntPtr, destination : Array[UByte], startIndex : Int, length : Int): Unit  = {}
   
  def Copy(source : System.IntPtr, destination : Array[System.IntPtr], startIndex : Int, 
           length : Int): Unit  = {}
   
  def ReadByte(ptr : AnyRef, ofs : Int): UByte  = 0
   
  def ReadByte(ptr : System.IntPtr, ofs : Int): UByte  = 0
   
  def ReadByte(ptr : System.IntPtr): UByte  = 0
   
  def ReadInt16(ptr : AnyRef, ofs : Int): Short  = 0
   
  def ReadInt16(ptr : System.IntPtr, ofs : Int): Short  = 0
   
  def ReadInt16(ptr : System.IntPtr): Short  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def ReadInt32(ptr : AnyRef, ofs : Int): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def ReadInt32(ptr : System.IntPtr, ofs : Int): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def ReadInt32(ptr : System.IntPtr): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def ReadIntPtr(ptr : AnyRef, ofs : Int): System.IntPtr  = new System.IntPtr()
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def ReadIntPtr(ptr : System.IntPtr, ofs : Int): System.IntPtr  = new System.IntPtr()
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def ReadIntPtr(ptr : System.IntPtr): System.IntPtr  = new System.IntPtr()
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def ReadInt64(ptr : AnyRef, ofs : Int): Long  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def ReadInt64(ptr : System.IntPtr, ofs : Int): Long  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def ReadInt64(ptr : System.IntPtr): Long  = 0
   
  def WriteByte(ptr : System.IntPtr, ofs : Int, `val` : UByte): Unit  = {}
   
  def WriteByte(ptr : AnyRef, ofs : Int, `val` : UByte): Unit  = {}
   
  def WriteByte(ptr : System.IntPtr, `val` : UByte): Unit  = {}
   
  def WriteInt16(ptr : System.IntPtr, ofs : Int, `val` : Short): Unit  = {}
   
  def WriteInt16(ptr : AnyRef, ofs : Int, `val` : Short): Unit  = {}
   
  def WriteInt16(ptr : System.IntPtr, `val` : Short): Unit  = {}
   
  def WriteInt16(ptr : System.IntPtr, ofs : Int, `val` : Char): Unit  = {}
   
  def WriteInt16(ptr : AnyRef, ofs : Int, `val` : Char): Unit  = {}
   
  def WriteInt16(ptr : System.IntPtr, `val` : Char): Unit  = {}
   
  def WriteInt32(ptr : System.IntPtr, ofs : Int, `val` : Int): Unit  = {}
   
  def WriteInt32(ptr : AnyRef, ofs : Int, `val` : Int): Unit  = {}
   
  def WriteInt32(ptr : System.IntPtr, `val` : Int): Unit  = {}
   
  def WriteIntPtr(ptr : System.IntPtr, ofs : Int, `val` : System.IntPtr): Unit  = {}
   
  def WriteIntPtr(ptr : AnyRef, ofs : Int, `val` : System.IntPtr): Unit  = {}
   
  def WriteIntPtr(ptr : System.IntPtr, `val` : System.IntPtr): Unit  = {}
   
  def WriteInt64(ptr : System.IntPtr, ofs : Int, `val` : Long): Unit  = {}
   
  def WriteInt64(ptr : AnyRef, ofs : Int, `val` : Long): Unit  = {}
   
  def WriteInt64(ptr : System.IntPtr, `val` : Long): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def GetLastWin32Error: Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def GetHRForLastWin32Error: Int  = 0
   
  def Prelink(m : System.Reflection.MethodInfo): Unit  = {}
   
  def PrelinkAll(c : System.Type): Unit  = {}
   
  def NumParamBytes(m : System.Reflection.MethodInfo): Int  = 0
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetExceptionPointers: System.IntPtr  = new System.IntPtr()
   
  def GetExceptionCode: Int  = 0
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def StructureToPtr(structure : AnyRef, ptr : System.IntPtr, fDeleteOld : Boolean): Unit  = {}
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def PtrToStructure(ptr : System.IntPtr, structure : AnyRef): Unit  = {}
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def PtrToStructure(ptr : System.IntPtr, structureType : System.Type): AnyRef  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def DestroyStructure(ptr : System.IntPtr, structuretype : System.Type): Unit  = {}
   
  def GetHINSTANCE(m : System.Reflection.Module): System.IntPtr  = new System.IntPtr()
   
  def ThrowExceptionForHR(errorCode : Int): Unit  = {}
   
  def ThrowExceptionForHR(errorCode : Int, errorInfo : System.IntPtr): Unit  = {}
   
  def GetExceptionForHR(errorCode : Int): System.Exception  = null
   
  def GetExceptionForHR(errorCode : Int, errorInfo : System.IntPtr): System.Exception  = null
   
  def GetHRForException(e : System.Exception): Int  = 0
   
  @System.ObsoleteAttribute("The GetUnmanagedThunkForManagedMethodPtr method has been deprecated and will be removed in a future release.", false)
  def GetUnmanagedThunkForManagedMethodPtr(pfnMethodToWrap : System.IntPtr, pbSignature : System.IntPtr, cbSignature : Int): System.IntPtr  = new System.IntPtr()
   
  @System.ObsoleteAttribute("The GetManagedThunkForUnmanagedMethodPtr method has been deprecated and will be removed in a future release.", false)
  def GetManagedThunkForUnmanagedMethodPtr(pfnMethodToWrap : System.IntPtr, pbSignature : System.IntPtr, cbSignature : Int): System.IntPtr  = new System.IntPtr()
   
  @System.ObsoleteAttribute("The GetThreadFromFiberCookie method has been deprecated.  Use the hosting API to perform this operation.", false)
  def GetThreadFromFiberCookie(cookie : Int): System.Threading.Thread  = null
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def AllocHGlobal(cb : System.IntPtr): System.IntPtr  = new System.IntPtr()
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def AllocHGlobal(cb : Int): System.IntPtr  = new System.IntPtr()
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def FreeHGlobal(hglobal : System.IntPtr): Unit  = {}
   
  def ReAllocHGlobal(pv : System.IntPtr, cb : System.IntPtr): System.IntPtr  = new System.IntPtr()
   
  def StringToHGlobalAnsi(s : String): System.IntPtr  = new System.IntPtr()
   
  def StringToCoTaskMemAnsi(s : String): System.IntPtr  = new System.IntPtr()
   
  def StringToHGlobalUni(s : String): System.IntPtr  = new System.IntPtr()
   
  def StringToHGlobalAuto(s : String): System.IntPtr  = new System.IntPtr()
   
  @System.ObsoleteAttribute("Use System.Runtime.InteropServices.Marshal.GetTypeLibName(ITypeLib pTLB) instead. http://go.microsoft.com/fwlink/?linkid=14202&ID=0000011.", false)
  def GetTypeLibName(pTLB : System.Runtime.InteropServices.UCOMITypeLib): String  = ""
   
  def GetTypeLibName(typelib : System.Runtime.InteropServices.ComTypes.ITypeLib): String  = ""
   
  @System.ObsoleteAttribute("Use System.Runtime.InteropServices.Marshal.GetTypeLibGuid(ITypeLib pTLB) instead. http://go.microsoft.com/fwlink/?linkid=14202&ID=0000011.", false)
  def GetTypeLibGuid(pTLB : System.Runtime.InteropServices.UCOMITypeLib): System.Guid  = new System.Guid()
   
  def GetTypeLibGuid(typelib : System.Runtime.InteropServices.ComTypes.ITypeLib): System.Guid  = new System.Guid()
   
  @System.ObsoleteAttribute("Use System.Runtime.InteropServices.Marshal.GetTypeLibLcid(ITypeLib pTLB) instead. http://go.microsoft.com/fwlink/?linkid=14202&ID=0000011.", false)
  def GetTypeLibLcid(pTLB : System.Runtime.InteropServices.UCOMITypeLib): Int  = 0
   
  def GetTypeLibLcid(typelib : System.Runtime.InteropServices.ComTypes.ITypeLib): Int  = 0
   
  def GetTypeLibGuidForAssembly(asm : System.Reflection.Assembly): System.Guid  = new System.Guid()
   
  def GetTypeLibVersionForAssembly(inputAssembly : System.Reflection.Assembly, majorVersion : CLRByRef[Int], 
                                   minorVersion : CLRByRef[Int]): Unit  = {}
   
  @System.ObsoleteAttribute("Use System.Runtime.InteropServices.Marshal.GetTypeInfoName(ITypeInfo pTLB) instead. http://go.microsoft.com/fwlink/?linkid=14202&ID=0000011.", false)
  def GetTypeInfoName(pTI : System.Runtime.InteropServices.UCOMITypeInfo): String  = ""
   
  def GetTypeInfoName(typeInfo : System.Runtime.InteropServices.ComTypes.ITypeInfo): String  = ""
   
  def GetTypeForITypeInfo(piTypeInfo : System.IntPtr): System.Type  = null
   
  def GetITypeInfoForType(t : System.Type): System.IntPtr  = new System.IntPtr()
   
  def GetIUnknownForObject(o : AnyRef): System.IntPtr  = new System.IntPtr()
   
  def GetIUnknownForObjectInContext(o : AnyRef): System.IntPtr  = new System.IntPtr()
   
  def GetIDispatchForObject(o : AnyRef): System.IntPtr  = new System.IntPtr()
   
  def GetIDispatchForObjectInContext(o : AnyRef): System.IntPtr  = new System.IntPtr()
   
  def GetComInterfaceForObject(o : AnyRef, T : System.Type): System.IntPtr  = new System.IntPtr()
   
  def GetComInterfaceForObjectInContext(o : AnyRef, t : System.Type): System.IntPtr  = new System.IntPtr()
   
  def GetObjectForIUnknown(pUnk : System.IntPtr): AnyRef  = null
   
  def GetUniqueObjectForIUnknown(unknown : System.IntPtr): AnyRef  = null
   
  def GetTypedObjectForIUnknown(pUnk : System.IntPtr, t : System.Type): AnyRef  = null
   
  def CreateAggregatedObject(pOuter : System.IntPtr, o : AnyRef): System.IntPtr  = new System.IntPtr()
   
  def IsComObject(o : AnyRef): Boolean  = false
   
  def ReleaseComObject(o : AnyRef): Int  = 0
   
  def FinalReleaseComObject(o : AnyRef): Int  = 0
   
  def GetComObjectData(obj : AnyRef, key : AnyRef): AnyRef  = null
   
  def SetComObjectData(obj : AnyRef, key : AnyRef, data : AnyRef): Boolean  = false
   
  def CreateWrapperOfType(o : AnyRef, t : System.Type): AnyRef  = null
   
  @System.ObsoleteAttribute("This API did not perform any operation and will be removed in future versions of the CLR.", false)
  def ReleaseThreadCache: Unit  = {}
   
  def IsTypeVisibleFromCom(t : System.Type): Boolean  = false
   
  def QueryInterface(pUnk : System.IntPtr, iid : CLRByRef[System.Guid], ppv : CLRByRef[System.IntPtr]): Int  = 0
   
  def AddRef(pUnk : System.IntPtr): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Release(pUnk : System.IntPtr): Int  = 0
   
  def AllocCoTaskMem(cb : Int): System.IntPtr  = new System.IntPtr()
   
  def ReAllocCoTaskMem(pv : System.IntPtr, cb : Int): System.IntPtr  = new System.IntPtr()
   
  def FreeCoTaskMem(ptr : System.IntPtr): Unit  = {}
   
  def FreeBSTR(ptr : System.IntPtr): Unit  = {}
   
  def StringToCoTaskMemUni(s : String): System.IntPtr  = new System.IntPtr()
   
  def StringToCoTaskMemAuto(s : String): System.IntPtr  = new System.IntPtr()
   
  def StringToBSTR(s : String): System.IntPtr  = new System.IntPtr()
   
  def PtrToStringBSTR(ptr : System.IntPtr): String  = ""
   
  def GetNativeVariantForObject(obj : AnyRef, pDstNativeVariant : System.IntPtr): Unit  = {}
   
  def GetObjectForNativeVariant(pSrcNativeVariant : System.IntPtr): AnyRef  = null
   
  def GetObjectsForNativeVariants(aSrcNativeVariant : System.IntPtr, cVars : Int): Array[AnyRef]  = Array.empty[AnyRef]
   
  def GetStartComSlot(t : System.Type): Int  = 0
   
  def GetEndComSlot(t : System.Type): Int  = 0
   
  def GetMethodInfoForComSlot(t : System.Type, slot : Int, 
                              memberType : CLRByRef[System.Runtime.InteropServices.ComMemberType]): System.Reflection.MemberInfo  = null
   
  def GetComSlotForMethodInfo(m : System.Reflection.MemberInfo): Int  = 0
   
  def GenerateGuidForType(`type` : System.Type): System.Guid  = new System.Guid()
   
  def GenerateProgIdForType(`type` : System.Type): String  = ""
   
  def BindToMoniker(monikerName : String): AnyRef  = null
   
  def GetActiveObject(progID : String): AnyRef  = null
   
  def ChangeWrapperHandleStrength(otp : AnyRef, fIsWeak : Boolean): Unit  = {}
   
  def GetDelegateForFunctionPointer(ptr : System.IntPtr, t : System.Type): System.Delegate  = null
   
  def GetFunctionPointerForDelegate(d : System.Delegate): System.IntPtr  = new System.IntPtr()
   
  def SecureStringToBSTR(s : System.Security.SecureString): System.IntPtr  = new System.IntPtr()
   
  def SecureStringToCoTaskMemAnsi(s : System.Security.SecureString): System.IntPtr  = new System.IntPtr()
   
  def SecureStringToGlobalAllocAnsi(s : System.Security.SecureString): System.IntPtr  = new System.IntPtr()
   
  def SecureStringToCoTaskMemUnicode(s : System.Security.SecureString): System.IntPtr  = new System.IntPtr()
   
  def SecureStringToGlobalAllocUnicode(s : System.Security.SecureString): System.IntPtr  = new System.IntPtr()
   
  def ZeroFreeBSTR(s : System.IntPtr): Unit  = {}
   
  def ZeroFreeCoTaskMemAnsi(s : System.IntPtr): Unit  = {}
   
  def ZeroFreeGlobalAllocAnsi(s : System.IntPtr): Unit  = {}
   
  def ZeroFreeCoTaskMemUnicode(s : System.IntPtr): Unit  = {}
   
  def ZeroFreeGlobalAllocUnicode(s : System.IntPtr): Unit  = {}
   
  val SystemDefaultCharSize : Int  = 0
   
  val SystemMaxDBCSCharSize : Int  = 0
}
 
@System.Runtime.InteropServices.GuidAttribute("F1C3BF76-C3E4-11d3-88E7-00902754C43A")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ITypeLibImporterNotifySink {
  /* abstract */ def ReportEvent(eventKind : System.Runtime.InteropServices.ImporterEventKind, eventCode : Int, 
                                 eventMsg : String): Unit
   
  /* abstract */ def ResolveRef(typeLib : AnyRef): System.Reflection.Assembly
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class MarshalDirectiveException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class RuntimeEnvironment extends AnyRef {
  def this() {}
}
object RuntimeEnvironment {
  def FromGlobalAccessCache(a : System.Reflection.Assembly): Boolean  = false
   
  def GetSystemVersion: String  = ""
   
  def GetRuntimeDirectory: String  = ""
   
  val SystemConfigurationFile : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SEHException extends System.Runtime.InteropServices.ExternalException {
  def CanResume: Boolean
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class BStrWrapper extends AnyRef {
  val WrappedObject : String = ""
   
  def this(value : String) {}
}
 
sealed abstract class ComMemberType extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ComMemberType): Boolean = false
  def !=(that: System.Runtime.InteropServices.ComMemberType): Boolean = false
  def  <(that: System.Runtime.InteropServices.ComMemberType): Boolean = false
  def <=(that: System.Runtime.InteropServices.ComMemberType): Boolean = false
  def  >(that: System.Runtime.InteropServices.ComMemberType): Boolean = false
  def >=(that: System.Runtime.InteropServices.ComMemberType): Boolean = false
  def  |(that: System.Runtime.InteropServices.ComMemberType): Boolean = false
  def  &(that: System.Runtime.InteropServices.ComMemberType): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ComMemberType): Boolean = false
}
object ComMemberType{
  val Method	 = value(0)
  val PropGet	 = value(1)
  val PropSet	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.ComMemberType = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class CurrencyWrapper extends AnyRef {
  val WrappedObject : System.Decimal = new System.Decimal()
   
  def this(obj : System.Decimal) {}
   
  def this(obj : AnyRef) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class DispatchWrapper extends AnyRef {
  val WrappedObject : AnyRef = null
   
  def this(obj : AnyRef) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ErrorWrapper extends AnyRef {
  val ErrorCode : Int = 0
   
  def this(errorCode : Int) {}
   
  def this(errorCode : AnyRef) {}
   
  def this(e : System.Exception) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ExtensibleClassFactory extends AnyRef 
object ExtensibleClassFactory {
  def RegisterObjectCreationCallback(callback : System.Runtime.InteropServices.ObjectCreationDelegate): Unit  = {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ICustomAdapter {
  /* abstract */ def GetUnderlyingObject: AnyRef
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ICustomFactory {
  /* abstract */ def CreateInstance(serverType : System.Type): System.MarshalByRefObject
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class InvalidComObjectException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
sealed abstract class AssemblyRegistrationFlags extends System.Enum {
  def ==(that: System.Runtime.InteropServices.AssemblyRegistrationFlags): Boolean = false
  def !=(that: System.Runtime.InteropServices.AssemblyRegistrationFlags): Boolean = false
  def  <(that: System.Runtime.InteropServices.AssemblyRegistrationFlags): Boolean = false
  def <=(that: System.Runtime.InteropServices.AssemblyRegistrationFlags): Boolean = false
  def  >(that: System.Runtime.InteropServices.AssemblyRegistrationFlags): Boolean = false
  def >=(that: System.Runtime.InteropServices.AssemblyRegistrationFlags): Boolean = false
  def  |(that: System.Runtime.InteropServices.AssemblyRegistrationFlags): Boolean = false
  def  &(that: System.Runtime.InteropServices.AssemblyRegistrationFlags): Boolean = false
  def  ^(that: System.Runtime.InteropServices.AssemblyRegistrationFlags): Boolean = false
}
object AssemblyRegistrationFlags{
  val None	 = value(0)
  val SetCodeBase	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.AssemblyRegistrationFlags = null
}
 
@System.Runtime.InteropServices.GuidAttribute("CCBD682C-73A5-4568-B8B0-C7007E11ABA2")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IRegistrationServices {
  /* abstract */ def RegisterAssembly(assembly : System.Reflection.Assembly, 
                                      flags : System.Runtime.InteropServices.AssemblyRegistrationFlags): Boolean
   
  /* abstract */ def UnregisterAssembly(assembly : System.Reflection.Assembly): Boolean
   
  /* abstract */ def GetRegistrableTypesInAssembly(assembly : System.Reflection.Assembly): Array[System.Type]
   
  /* abstract */ def GetProgIdForType(`type` : System.Type): String
   
  /* abstract */ def RegisterTypeForComClients(`type` : System.Type, g : CLRByRef[System.Guid]): Unit
   
  /* abstract */ def GetManagedCategoryGuid: System.Guid
   
  /* abstract */ def TypeRequiresRegistration(`type` : System.Type): Boolean
   
  /* abstract */ def TypeRepresentsComType(`type` : System.Type): Boolean
}
 
sealed abstract class TypeLibImporterFlags extends System.Enum {
  def ==(that: System.Runtime.InteropServices.TypeLibImporterFlags): Boolean = false
  def !=(that: System.Runtime.InteropServices.TypeLibImporterFlags): Boolean = false
  def  <(that: System.Runtime.InteropServices.TypeLibImporterFlags): Boolean = false
  def <=(that: System.Runtime.InteropServices.TypeLibImporterFlags): Boolean = false
  def  >(that: System.Runtime.InteropServices.TypeLibImporterFlags): Boolean = false
  def >=(that: System.Runtime.InteropServices.TypeLibImporterFlags): Boolean = false
  def  |(that: System.Runtime.InteropServices.TypeLibImporterFlags): Boolean = false
  def  &(that: System.Runtime.InteropServices.TypeLibImporterFlags): Boolean = false
  def  ^(that: System.Runtime.InteropServices.TypeLibImporterFlags): Boolean = false
}
object TypeLibImporterFlags{
  val None	 = value(0)
  val PrimaryInteropAssembly	 = value(1)
  val UnsafeInterfaces	 = value(2)
  val SafeArrayAsSystemArray	 = value(4)
  val TransformDispRetVals	 = value(8)
  val PreventClassMembers	 = value(16)
  val SerializableValueClasses	 = value(32)
  val ImportAsX86	 = value(256)
  val ImportAsX64	 = value(512)
  val ImportAsItanium	 = value(1024)
  val ImportAsAgnostic	 = value(2048)
  val ReflectionOnlyLoading	 = value(4096)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.TypeLibImporterFlags = null
}
 
sealed abstract class TypeLibExporterFlags extends System.Enum {
  def ==(that: System.Runtime.InteropServices.TypeLibExporterFlags): Boolean = false
  def !=(that: System.Runtime.InteropServices.TypeLibExporterFlags): Boolean = false
  def  <(that: System.Runtime.InteropServices.TypeLibExporterFlags): Boolean = false
  def <=(that: System.Runtime.InteropServices.TypeLibExporterFlags): Boolean = false
  def  >(that: System.Runtime.InteropServices.TypeLibExporterFlags): Boolean = false
  def >=(that: System.Runtime.InteropServices.TypeLibExporterFlags): Boolean = false
  def  |(that: System.Runtime.InteropServices.TypeLibExporterFlags): Boolean = false
  def  &(that: System.Runtime.InteropServices.TypeLibExporterFlags): Boolean = false
  def  ^(that: System.Runtime.InteropServices.TypeLibExporterFlags): Boolean = false
}
object TypeLibExporterFlags{
  val None	 = value(0)
  val OnlyReferenceRegistered	 = value(1)
  val CallerResolvedReferences	 = value(2)
  val OldNames	 = value(4)
  val ExportAs32Bit	 = value(16)
  val ExportAs64Bit	 = value(32)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.TypeLibExporterFlags = null
}
 
sealed abstract class ImporterEventKind extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ImporterEventKind): Boolean = false
  def !=(that: System.Runtime.InteropServices.ImporterEventKind): Boolean = false
  def  <(that: System.Runtime.InteropServices.ImporterEventKind): Boolean = false
  def <=(that: System.Runtime.InteropServices.ImporterEventKind): Boolean = false
  def  >(that: System.Runtime.InteropServices.ImporterEventKind): Boolean = false
  def >=(that: System.Runtime.InteropServices.ImporterEventKind): Boolean = false
  def  |(that: System.Runtime.InteropServices.ImporterEventKind): Boolean = false
  def  &(that: System.Runtime.InteropServices.ImporterEventKind): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ImporterEventKind): Boolean = false
}
object ImporterEventKind{
  val NOTIF_TYPECONVERTED	 = value(0)
  val NOTIF_CONVERTWARNING	 = value(1)
  val ERROR_REFTOINVALIDTYPELIB	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.ImporterEventKind = null
}
 
sealed abstract class ExporterEventKind extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ExporterEventKind): Boolean = false
  def !=(that: System.Runtime.InteropServices.ExporterEventKind): Boolean = false
  def  <(that: System.Runtime.InteropServices.ExporterEventKind): Boolean = false
  def <=(that: System.Runtime.InteropServices.ExporterEventKind): Boolean = false
  def  >(that: System.Runtime.InteropServices.ExporterEventKind): Boolean = false
  def >=(that: System.Runtime.InteropServices.ExporterEventKind): Boolean = false
  def  |(that: System.Runtime.InteropServices.ExporterEventKind): Boolean = false
  def  &(that: System.Runtime.InteropServices.ExporterEventKind): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ExporterEventKind): Boolean = false
}
object ExporterEventKind{
  val NOTIF_TYPECONVERTED	 = value(0)
  val NOTIF_CONVERTWARNING	 = value(1)
  val ERROR_REFTOINVALIDASSEMBLY	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.ExporterEventKind = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("F1C3BF77-C3E4-11d3-88E7-00902754C43A")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait ITypeLibExporterNotifySink {
  /* abstract */ def ReportEvent(eventKind : System.Runtime.InteropServices.ExporterEventKind, eventCode : Int, 
                                 eventMsg : String): Unit
   
  /* abstract */ def ResolveRef(param0 : System.Reflection.Assembly): AnyRef
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("F1C3BF78-C3E4-11d3-88E7-00902754C43A")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ITypeLibConverter {
  /* abstract */ def ConvertTypeLibToAssembly(typeLib : AnyRef, asmFileName : String, 
                                              flags : System.Runtime.InteropServices.TypeLibImporterFlags, 
                                              notifySink : System.Runtime.InteropServices.ITypeLibImporterNotifySink, 
                                              publicKey : Array[UByte], keyPair : System.Reflection.StrongNameKeyPair, 
                                              asmNamespace : String, asmVersion : System.Version): System.Reflection.Emit.AssemblyBuilder
   
  /* abstract */ def ConvertAssemblyToTypeLib(assembly : System.Reflection.Assembly, typeLibName : String, 
                                              flags : System.Runtime.InteropServices.TypeLibExporterFlags, 
                                              param0 : System.Runtime.InteropServices.ITypeLibExporterNotifySink): AnyRef
   
  /* abstract */ def ConvertTypeLibToAssembly(typeLib : AnyRef, asmFileName : String, flags : Int, 
                                              notifySink : System.Runtime.InteropServices.ITypeLibImporterNotifySink, 
                                              publicKey : Array[UByte], keyPair : System.Reflection.StrongNameKeyPair, 
                                              unsafeInterfaces : Boolean): System.Reflection.Emit.AssemblyBuilder
}
 
@System.Runtime.InteropServices.GuidAttribute("FA1F3615-ACB9-486d-9EAC-1BEF87E36B09")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ITypeLibExporterNameProvider {
  /* abstract */ def GetNames: Array[String]
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ObjectCreationDelegate extends System.MulticastDelegate {
  def Invoke(aggregator : System.IntPtr): System.IntPtr
   
  def BeginInvoke(aggregator : System.IntPtr, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): System.IntPtr
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed abstract class RegistrationClassContext extends System.Enum {
  def ==(that: System.Runtime.InteropServices.RegistrationClassContext): Boolean = false
  def !=(that: System.Runtime.InteropServices.RegistrationClassContext): Boolean = false
  def  <(that: System.Runtime.InteropServices.RegistrationClassContext): Boolean = false
  def <=(that: System.Runtime.InteropServices.RegistrationClassContext): Boolean = false
  def  >(that: System.Runtime.InteropServices.RegistrationClassContext): Boolean = false
  def >=(that: System.Runtime.InteropServices.RegistrationClassContext): Boolean = false
  def  |(that: System.Runtime.InteropServices.RegistrationClassContext): Boolean = false
  def  &(that: System.Runtime.InteropServices.RegistrationClassContext): Boolean = false
  def  ^(that: System.Runtime.InteropServices.RegistrationClassContext): Boolean = false
}
object RegistrationClassContext{
  val InProcessServer	 = value(1)
  val InProcessHandler	 = value(2)
  val LocalServer	 = value(4)
  val InProcessServer16	 = value(8)
  val RemoteServer	 = value(16)
  val InProcessHandler16	 = value(32)
  val Reserved1	 = value(64)
  val Reserved2	 = value(128)
  val Reserved3	 = value(256)
  val Reserved4	 = value(512)
  val NoCodeDownload	 = value(1024)
  val Reserved5	 = value(2048)
  val NoCustomMarshal	 = value(4096)
  val EnableCodeDownload	 = value(8192)
  val NoFailureLog	 = value(16384)
  val DisableActivateAsActivator	 = value(32768)
  val EnableActivateAsActivator	 = value(65536)
  val FromDefaultContext	 = value(131072)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.RegistrationClassContext = null
}
 
sealed abstract class RegistrationConnectionType extends System.Enum {
  def ==(that: System.Runtime.InteropServices.RegistrationConnectionType): Boolean = false
  def !=(that: System.Runtime.InteropServices.RegistrationConnectionType): Boolean = false
  def  <(that: System.Runtime.InteropServices.RegistrationConnectionType): Boolean = false
  def <=(that: System.Runtime.InteropServices.RegistrationConnectionType): Boolean = false
  def  >(that: System.Runtime.InteropServices.RegistrationConnectionType): Boolean = false
  def >=(that: System.Runtime.InteropServices.RegistrationConnectionType): Boolean = false
  def  |(that: System.Runtime.InteropServices.RegistrationConnectionType): Boolean = false
  def  &(that: System.Runtime.InteropServices.RegistrationConnectionType): Boolean = false
  def  ^(that: System.Runtime.InteropServices.RegistrationConnectionType): Boolean = false
}
object RegistrationConnectionType{
  val SingleUse	 = value(0)
  val MultipleUse	 = value(1)
  val MultiSeparate	 = value(2)
  val Suspended	 = value(4)
  val Surrogate	 = value(8)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.RegistrationConnectionType = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("475E398F-8AFA-43a7-A3BE-F4EF8D6787C9")
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
class RegistrationServices extends AnyRef with System.Runtime.InteropServices.IRegistrationServices {
  def RegisterAssembly(assembly : System.Reflection.Assembly, 
                       flags : System.Runtime.InteropServices.AssemblyRegistrationFlags): Boolean
   
  def UnregisterAssembly(assembly : System.Reflection.Assembly): Boolean
   
  def GetRegistrableTypesInAssembly(assembly : System.Reflection.Assembly): Array[System.Type]
   
  def GetProgIdForType(`type` : System.Type): String
   
  def RegisterTypeForComClients(`type` : System.Type, g : CLRByRef[System.Guid]): Unit
   
  def GetManagedCategoryGuid: System.Guid
   
  def TypeRequiresRegistration(`type` : System.Type): Boolean
   
  def TypeRepresentsComType(`type` : System.Type): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def RegisterTypeForComClients(`type` : System.Type, 
                                classContext : System.Runtime.InteropServices.RegistrationClassContext, 
                                flags : System.Runtime.InteropServices.RegistrationConnectionType): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def UnregisterTypeForComClients(cookie : Int): Unit
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SafeArrayRankMismatchException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SafeArrayTypeMismatchException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.GuidAttribute("F1C3BF79-C3E4-11d3-88E7-00902754C43A")
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class TypeLibConverter extends AnyRef with System.Runtime.InteropServices.ITypeLibConverter {
  def ConvertTypeLibToAssembly(typeLib : AnyRef, asmFileName : String, flags : Int, 
                               notifySink : System.Runtime.InteropServices.ITypeLibImporterNotifySink, 
                               publicKey : Array[UByte], keyPair : System.Reflection.StrongNameKeyPair, 
                               unsafeInterfaces : Boolean): System.Reflection.Emit.AssemblyBuilder
   
  def ConvertTypeLibToAssembly(typeLib : AnyRef, asmFileName : String, 
                               flags : System.Runtime.InteropServices.TypeLibImporterFlags, 
                               notifySink : System.Runtime.InteropServices.ITypeLibImporterNotifySink, 
                               publicKey : Array[UByte], keyPair : System.Reflection.StrongNameKeyPair, 
                               asmNamespace : String, asmVersion : System.Version): System.Reflection.Emit.AssemblyBuilder
   
  def ConvertAssemblyToTypeLib(assembly : System.Reflection.Assembly, strTypeLibName : String, 
                               flags : System.Runtime.InteropServices.TypeLibExporterFlags, 
                               param0 : System.Runtime.InteropServices.ITypeLibExporterNotifySink): AnyRef
   
  def this() {}
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.BIND_OPTS instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
sealed class BIND_OPTS extends System.ValueType {
  var cbStruct : Int
   
  var grfFlags : Int
   
  var grfMode : Int
   
  var dwTickCountDeadline : Int
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("0000000e-0000-0000-C000-000000000046")
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.IBindCtx instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
trait UCOMIBindCtx {
  /* abstract */ def RegisterObjectBound(punk : AnyRef): Unit
   
  /* abstract */ def RevokeObjectBound(punk : AnyRef): Unit
   
  /* abstract */ def ReleaseBoundObjects: Unit
   
  /* abstract */ def SetBindOptions(pbindopts : CLRByRef[System.Runtime.InteropServices.BIND_OPTS]): Unit
   
  /* abstract */ def GetBindOptions(pbindopts : CLRByRef[System.Runtime.InteropServices.BIND_OPTS]): Unit
   
  /* abstract */ def RegisterObjectParam(pszKey : String, punk : AnyRef): Unit
   
  /* abstract */ def RevokeObjectParam(pszKey : String): Unit
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.IConnectionPointContainer instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
@System.Runtime.InteropServices.GuidAttribute("B196B284-BAB4-101A-B69C-00AA00341D07")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait UCOMIConnectionPointContainer 
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.IConnectionPoint instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
@System.Runtime.InteropServices.GuidAttribute("B196B286-BAB4-101A-B69C-00AA00341D07")
trait UCOMIConnectionPoint {
  /* abstract */ def GetConnectionInterface(pIID : CLRByRef[System.Guid]): Unit
   
  /* abstract */ def Advise(pUnkSink : AnyRef, pdwCookie : CLRByRef[Int]): Unit
   
  /* abstract */ def Unadvise(dwCookie : Int): Unit
}
 
@System.Runtime.InteropServices.GuidAttribute("00000102-0000-0000-C000-000000000046")
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.IEnumMoniker instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait UCOMIEnumMoniker {
  /* abstract */ def Next(celt : Int, rgelt : Array[System.Runtime.InteropServices.UCOMIMoniker], 
                          pceltFetched : CLRByRef[Int]): Int
   
  /* abstract */ def Skip(celt : Int): Int
   
  /* abstract */ def Reset: Int
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.CONNECTDATA instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
sealed class CONNECTDATA extends System.ValueType {
  var pUnk : AnyRef
   
  var dwCookie : Int
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.IEnumConnections instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
@System.Runtime.InteropServices.GuidAttribute("B196B287-BAB4-101A-B69C-00AA00341D07")
trait UCOMIEnumConnections {
  /* abstract */ def Next(celt : Int, rgelt : Array[System.Runtime.InteropServices.CONNECTDATA], 
                          pceltFetched : CLRByRef[Int]): Int
   
  /* abstract */ def Skip(celt : Int): Int
   
  /* abstract */ def Reset: Unit
}
 
@System.Runtime.InteropServices.GuidAttribute("B196B285-BAB4-101A-B69C-00AA00341D07")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.IEnumConnectionPoints instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
trait UCOMIEnumConnectionPoints {
  /* abstract */ def Next(celt : Int, rgelt : Array[System.Runtime.InteropServices.UCOMIConnectionPoint], 
                          pceltFetched : CLRByRef[Int]): Int
   
  /* abstract */ def Skip(celt : Int): Int
   
  /* abstract */ def Reset: Int
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.IEnumString instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
@System.Runtime.InteropServices.GuidAttribute("00000101-0000-0000-C000-000000000046")
trait UCOMIEnumString {
  /* abstract */ def Next(celt : Int, rgelt : Array[String], pceltFetched : CLRByRef[Int]): Int
   
  /* abstract */ def Skip(celt : Int): Int
   
  /* abstract */ def Reset: Int
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.IEnumVARIANT instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("00020404-0000-0000-C000-000000000046")
trait UCOMIEnumVARIANT {
  /* abstract */ def Next(celt : Int, rgvar : Int, pceltFetched : Int): Int
   
  /* abstract */ def Skip(celt : Int): Int
   
  /* abstract */ def Reset: Int
   
  /* abstract */ def Clone(ppenum : Int): Unit
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.FILETIME instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
sealed class FILETIME extends System.ValueType {
  var dwLowDateTime : Int
   
  var dwHighDateTime : Int
}
 
@System.Runtime.InteropServices.GuidAttribute("0000000f-0000-0000-C000-000000000046")
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.IMoniker instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait UCOMIMoniker {
  /* abstract */ def GetClassID(pClassID : CLRByRef[System.Guid]): Unit
   
  /* abstract */ def IsDirty: Int
   
  /* abstract */ def Load(pStm : System.Runtime.InteropServices.UCOMIStream): Unit
   
  /* abstract */ def Save(pStm : System.Runtime.InteropServices.UCOMIStream, fClearDirty : Boolean): Unit
   
  /* abstract */ def GetSizeMax(pcbSize : CLRByRef[Long]): Unit
   
  /* abstract */ def IsEqual(pmkOtherMoniker : System.Runtime.InteropServices.UCOMIMoniker): Unit
   
  /* abstract */ def Hash(pdwHash : CLRByRef[Int]): Unit
   
  /* abstract */ def IsRunning(pbc : System.Runtime.InteropServices.UCOMIBindCtx, 
                               pmkToLeft : System.Runtime.InteropServices.UCOMIMoniker, 
                               pmkNewlyRunning : System.Runtime.InteropServices.UCOMIMoniker): Unit
   
  /* abstract */ def GetTimeOfLastChange(pbc : System.Runtime.InteropServices.UCOMIBindCtx, 
                                         pmkToLeft : System.Runtime.InteropServices.UCOMIMoniker, 
                                         pFileTime : CLRByRef[System.Runtime.InteropServices.FILETIME]): Unit
   
  /* abstract */ def IsSystemMoniker(pdwMksys : CLRByRef[Int]): Unit
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.IPersistFile instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
@System.Runtime.InteropServices.GuidAttribute("0000010b-0000-0000-C000-000000000046")
trait UCOMIPersistFile {
  /* abstract */ def GetClassID(pClassID : CLRByRef[System.Guid]): Unit
   
  /* abstract */ def IsDirty: Int
   
  /* abstract */ def Load(pszFileName : String, dwMode : Int): Unit
   
  /* abstract */ def Save(pszFileName : String, fRemember : Boolean): Unit
   
  /* abstract */ def SaveCompleted(pszFileName : String): Unit
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.IRunningObjectTable instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("00000010-0000-0000-C000-000000000046")
trait UCOMIRunningObjectTable {
  /* abstract */ def Register(grfFlags : Int, punkObject : AnyRef, 
                              pmkObjectName : System.Runtime.InteropServices.UCOMIMoniker, 
                              pdwRegister : CLRByRef[Int]): Unit
   
  /* abstract */ def Revoke(dwRegister : Int): Unit
   
  /* abstract */ def IsRunning(pmkObjectName : System.Runtime.InteropServices.UCOMIMoniker): Unit
   
  /* abstract */ def NoteChangeTime(dwRegister : Int, pfiletime : CLRByRef[System.Runtime.InteropServices.FILETIME]): Unit
   
  /* abstract */ def GetTimeOfLastChange(pmkObjectName : System.Runtime.InteropServices.UCOMIMoniker, 
                                         pfiletime : CLRByRef[System.Runtime.InteropServices.FILETIME]): Unit
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.STATSTG instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
sealed class STATSTG extends System.ValueType {
  var pwcsName : String
   
  var `type` : Int
   
  var cbSize : Long
   
  var mtime : System.Runtime.InteropServices.FILETIME
   
  var ctime : System.Runtime.InteropServices.FILETIME
   
  var atime : System.Runtime.InteropServices.FILETIME
   
  var grfMode : Int
   
  var grfLocksSupported : Int
   
  var clsid : System.Guid
   
  var grfStateBits : Int
   
  var reserved : Int
}
 
@System.Runtime.InteropServices.GuidAttribute("0000000c-0000-0000-C000-000000000046")
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.IStream instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait UCOMIStream {
  /* abstract */ def Read(pv : Array[UByte], cb : Int, pcbRead : System.IntPtr): Unit
   
  /* abstract */ def Write(pv : Array[UByte], cb : Int, pcbWritten : System.IntPtr): Unit
   
  /* abstract */ def Seek(dlibMove : Long, dwOrigin : Int, plibNewPosition : System.IntPtr): Unit
   
  /* abstract */ def SetSize(libNewSize : Long): Unit
   
  /* abstract */ def CopyTo(pstm : System.Runtime.InteropServices.UCOMIStream, cb : Long, 
                            pcbRead : System.IntPtr, pcbWritten : System.IntPtr): Unit
   
  /* abstract */ def Commit(grfCommitFlags : Int): Unit
   
  /* abstract */ def Revert: Unit
   
  /* abstract */ def LockRegion(libOffset : Long, cb : Long, dwLockType : Int): Unit
   
  /* abstract */ def UnlockRegion(libOffset : Long, cb : Long, dwLockType : Int): Unit
   
  /* abstract */ def Stat(pstatstg : CLRByRef[System.Runtime.InteropServices.STATSTG], grfStatFlag : Int): Unit
}
 
sealed abstract class DESCKIND extends System.Enum {
  def ==(that: System.Runtime.InteropServices.DESCKIND): Boolean = false
  def !=(that: System.Runtime.InteropServices.DESCKIND): Boolean = false
  def  <(that: System.Runtime.InteropServices.DESCKIND): Boolean = false
  def <=(that: System.Runtime.InteropServices.DESCKIND): Boolean = false
  def  >(that: System.Runtime.InteropServices.DESCKIND): Boolean = false
  def >=(that: System.Runtime.InteropServices.DESCKIND): Boolean = false
  def  |(that: System.Runtime.InteropServices.DESCKIND): Boolean = false
  def  &(that: System.Runtime.InteropServices.DESCKIND): Boolean = false
  def  ^(that: System.Runtime.InteropServices.DESCKIND): Boolean = false
}
object DESCKIND{
  val DESCKIND_NONE	 = value(0)
  val DESCKIND_FUNCDESC	 = value(1)
  val DESCKIND_VARDESC	 = value(2)
  val DESCKIND_TYPECOMP	 = value(3)
  val DESCKIND_IMPLICITAPPOBJ	 = value(4)
  val DESCKIND_MAX	 = value(5)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.DESCKIND = null
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.BINDPTR instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
sealed class BINDPTR extends System.ValueType {
  var lpfuncdesc : System.IntPtr
   
  var lpvardesc : System.IntPtr
   
  var lptcomp : System.IntPtr
}
 
@System.Runtime.InteropServices.GuidAttribute("00020403-0000-0000-C000-000000000046")
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.ITypeComp instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait UCOMITypeComp 
 
sealed abstract class TYPEKIND extends System.Enum {
  def ==(that: System.Runtime.InteropServices.TYPEKIND): Boolean = false
  def !=(that: System.Runtime.InteropServices.TYPEKIND): Boolean = false
  def  <(that: System.Runtime.InteropServices.TYPEKIND): Boolean = false
  def <=(that: System.Runtime.InteropServices.TYPEKIND): Boolean = false
  def  >(that: System.Runtime.InteropServices.TYPEKIND): Boolean = false
  def >=(that: System.Runtime.InteropServices.TYPEKIND): Boolean = false
  def  |(that: System.Runtime.InteropServices.TYPEKIND): Boolean = false
  def  &(that: System.Runtime.InteropServices.TYPEKIND): Boolean = false
  def  ^(that: System.Runtime.InteropServices.TYPEKIND): Boolean = false
}
object TYPEKIND{
  val TKIND_ENUM	 = value(0)
  val TKIND_RECORD	 = value(1)
  val TKIND_MODULE	 = value(2)
  val TKIND_INTERFACE	 = value(3)
  val TKIND_DISPATCH	 = value(4)
  val TKIND_COCLASS	 = value(5)
  val TKIND_ALIAS	 = value(6)
  val TKIND_UNION	 = value(7)
  val TKIND_MAX	 = value(8)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.TYPEKIND = null
}
 
sealed abstract class TYPEFLAGS extends System.Enum {
  def ==(that: System.Runtime.InteropServices.TYPEFLAGS): Boolean = false
  def !=(that: System.Runtime.InteropServices.TYPEFLAGS): Boolean = false
  def  <(that: System.Runtime.InteropServices.TYPEFLAGS): Boolean = false
  def <=(that: System.Runtime.InteropServices.TYPEFLAGS): Boolean = false
  def  >(that: System.Runtime.InteropServices.TYPEFLAGS): Boolean = false
  def >=(that: System.Runtime.InteropServices.TYPEFLAGS): Boolean = false
  def  |(that: System.Runtime.InteropServices.TYPEFLAGS): Boolean = false
  def  &(that: System.Runtime.InteropServices.TYPEFLAGS): Boolean = false
  def  ^(that: System.Runtime.InteropServices.TYPEFLAGS): Boolean = false
}
object TYPEFLAGS{
  val TYPEFLAG_FAPPOBJECT	 = value(1)
  val TYPEFLAG_FCANCREATE	 = value(2)
  val TYPEFLAG_FLICENSED	 = value(4)
  val TYPEFLAG_FPREDECLID	 = value(8)
  val TYPEFLAG_FHIDDEN	 = value(16)
  val TYPEFLAG_FCONTROL	 = value(32)
  val TYPEFLAG_FDUAL	 = value(64)
  val TYPEFLAG_FNONEXTENSIBLE	 = value(128)
  val TYPEFLAG_FOLEAUTOMATION	 = value(256)
  val TYPEFLAG_FRESTRICTED	 = value(512)
  val TYPEFLAG_FAGGREGATABLE	 = value(1024)
  val TYPEFLAG_FREPLACEABLE	 = value(2048)
  val TYPEFLAG_FDISPATCHABLE	 = value(4096)
  val TYPEFLAG_FREVERSEBIND	 = value(8192)
  val TYPEFLAG_FPROXY	 = value(16384)
   
  /* an artifact for CLR enums */ private def value(i: Short): System.Runtime.InteropServices.TYPEFLAGS = null
}
 
sealed abstract class IMPLTYPEFLAGS extends System.Enum {
  def ==(that: System.Runtime.InteropServices.IMPLTYPEFLAGS): Boolean = false
  def !=(that: System.Runtime.InteropServices.IMPLTYPEFLAGS): Boolean = false
  def  <(that: System.Runtime.InteropServices.IMPLTYPEFLAGS): Boolean = false
  def <=(that: System.Runtime.InteropServices.IMPLTYPEFLAGS): Boolean = false
  def  >(that: System.Runtime.InteropServices.IMPLTYPEFLAGS): Boolean = false
  def >=(that: System.Runtime.InteropServices.IMPLTYPEFLAGS): Boolean = false
  def  |(that: System.Runtime.InteropServices.IMPLTYPEFLAGS): Boolean = false
  def  &(that: System.Runtime.InteropServices.IMPLTYPEFLAGS): Boolean = false
  def  ^(that: System.Runtime.InteropServices.IMPLTYPEFLAGS): Boolean = false
}
object IMPLTYPEFLAGS{
  val IMPLTYPEFLAG_FDEFAULT	 = value(1)
  val IMPLTYPEFLAG_FSOURCE	 = value(2)
  val IMPLTYPEFLAG_FRESTRICTED	 = value(4)
  val IMPLTYPEFLAG_FDEFAULTVTABLE	 = value(8)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.IMPLTYPEFLAGS = null
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.TYPEATTR instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
sealed class TYPEATTR extends System.ValueType {
  var guid : System.Guid
   
  var lcid : Int
   
  var dwReserved : Int
   
  var memidConstructor : Int
   
  var memidDestructor : Int
   
  var lpstrSchema : System.IntPtr
   
  var cbSizeInstance : Int
   
  var typekind : System.Runtime.InteropServices.TYPEKIND
   
  var cFuncs : Short
   
  var cVars : Short
   
  var cImplTypes : Short
   
  var cbSizeVft : Short
   
  var cbAlignment : Short
   
  var wTypeFlags : System.Runtime.InteropServices.TYPEFLAGS
   
  var wMajorVerNum : Short
   
  var wMinorVerNum : Short
   
  var tdescAlias : System.Runtime.InteropServices.TYPEDESC
   
  var idldescType : System.Runtime.InteropServices.IDLDESC
}
object TYPEATTR {
  val MEMBER_ID_NIL : Int  = 0
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.FUNCDESC instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
sealed class FUNCDESC extends System.ValueType {
  var memid : Int
   
  var lprgscode : System.IntPtr
   
  var lprgelemdescParam : System.IntPtr
   
  var funckind : System.Runtime.InteropServices.FUNCKIND
   
  var invkind : System.Runtime.InteropServices.INVOKEKIND
   
  var callconv : System.Runtime.InteropServices.CALLCONV
   
  var cParams : Short
   
  var cParamsOpt : Short
   
  var oVft : Short
   
  var cScodes : Short
   
  var elemdescFunc : System.Runtime.InteropServices.ELEMDESC
   
  var wFuncFlags : Short
}
 
sealed abstract class IDLFLAG extends System.Enum {
  def ==(that: System.Runtime.InteropServices.IDLFLAG): Boolean = false
  def !=(that: System.Runtime.InteropServices.IDLFLAG): Boolean = false
  def  <(that: System.Runtime.InteropServices.IDLFLAG): Boolean = false
  def <=(that: System.Runtime.InteropServices.IDLFLAG): Boolean = false
  def  >(that: System.Runtime.InteropServices.IDLFLAG): Boolean = false
  def >=(that: System.Runtime.InteropServices.IDLFLAG): Boolean = false
  def  |(that: System.Runtime.InteropServices.IDLFLAG): Boolean = false
  def  &(that: System.Runtime.InteropServices.IDLFLAG): Boolean = false
  def  ^(that: System.Runtime.InteropServices.IDLFLAG): Boolean = false
}
object IDLFLAG{
  val IDLFLAG_NONE	 = value(0)
  val IDLFLAG_FIN	 = value(1)
  val IDLFLAG_FOUT	 = value(2)
  val IDLFLAG_FLCID	 = value(4)
  val IDLFLAG_FRETVAL	 = value(8)
   
  /* an artifact for CLR enums */ private def value(i: Short): System.Runtime.InteropServices.IDLFLAG = null
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.IDLDESC instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
sealed class IDLDESC extends System.ValueType {
  var dwReserved : Int
   
  var wIDLFlags : System.Runtime.InteropServices.IDLFLAG
}
 
sealed abstract class PARAMFLAG extends System.Enum {
  def ==(that: System.Runtime.InteropServices.PARAMFLAG): Boolean = false
  def !=(that: System.Runtime.InteropServices.PARAMFLAG): Boolean = false
  def  <(that: System.Runtime.InteropServices.PARAMFLAG): Boolean = false
  def <=(that: System.Runtime.InteropServices.PARAMFLAG): Boolean = false
  def  >(that: System.Runtime.InteropServices.PARAMFLAG): Boolean = false
  def >=(that: System.Runtime.InteropServices.PARAMFLAG): Boolean = false
  def  |(that: System.Runtime.InteropServices.PARAMFLAG): Boolean = false
  def  &(that: System.Runtime.InteropServices.PARAMFLAG): Boolean = false
  def  ^(that: System.Runtime.InteropServices.PARAMFLAG): Boolean = false
}
object PARAMFLAG{
  val PARAMFLAG_NONE	 = value(0)
  val PARAMFLAG_FIN	 = value(1)
  val PARAMFLAG_FOUT	 = value(2)
  val PARAMFLAG_FLCID	 = value(4)
  val PARAMFLAG_FRETVAL	 = value(8)
  val PARAMFLAG_FOPT	 = value(16)
  val PARAMFLAG_FHASDEFAULT	 = value(32)
  val PARAMFLAG_FHASCUSTDATA	 = value(64)
   
  /* an artifact for CLR enums */ private def value(i: Short): System.Runtime.InteropServices.PARAMFLAG = null
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.PARAMDESC instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
sealed class PARAMDESC extends System.ValueType {
  var lpVarValue : System.IntPtr
   
  var wParamFlags : System.Runtime.InteropServices.PARAMFLAG
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.TYPEDESC instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
sealed class TYPEDESC extends System.ValueType {
  var lpValue : System.IntPtr
   
  var vt : Short
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.ELEMDESC instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
sealed class ELEMDESC extends System.ValueType {
  var tdesc : System.Runtime.InteropServices.TYPEDESC
   
  var desc : System.Runtime.InteropServices.ELEMDESC.DESCUNION
}
object ELEMDESC {
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  sealed class DESCUNION extends System.ValueType {
    var idldesc : System.Runtime.InteropServices.IDLDESC
     
    var paramdesc : System.Runtime.InteropServices.PARAMDESC
  }
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.VARDESC instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
sealed class VARDESC extends System.ValueType {
  var memid : Int
   
  var lpstrSchema : String
   
  var elemdescVar : System.Runtime.InteropServices.ELEMDESC
   
  var wVarFlags : Short
   
  var varkind : System.Runtime.InteropServices.VarEnum
}
object VARDESC {
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  sealed class DESCUNION extends System.ValueType {
    var oInst : Int
     
    var lpvarValue : System.IntPtr
  }
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.DISPPARAMS instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
sealed class DISPPARAMS extends System.ValueType {
  var rgvarg : System.IntPtr
   
  var rgdispidNamedArgs : System.IntPtr
   
  var cArgs : Int
   
  var cNamedArgs : Int
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.EXCEPINFO instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
sealed class EXCEPINFO extends System.ValueType {
  var wCode : Short
   
  var wReserved : Short
   
  var bstrSource : String
   
  var bstrDescription : String
   
  var bstrHelpFile : String
   
  var dwHelpContext : Int
   
  var pvReserved : System.IntPtr
   
  var pfnDeferredFillIn : System.IntPtr
}
 
sealed abstract class FUNCKIND extends System.Enum {
  def ==(that: System.Runtime.InteropServices.FUNCKIND): Boolean = false
  def !=(that: System.Runtime.InteropServices.FUNCKIND): Boolean = false
  def  <(that: System.Runtime.InteropServices.FUNCKIND): Boolean = false
  def <=(that: System.Runtime.InteropServices.FUNCKIND): Boolean = false
  def  >(that: System.Runtime.InteropServices.FUNCKIND): Boolean = false
  def >=(that: System.Runtime.InteropServices.FUNCKIND): Boolean = false
  def  |(that: System.Runtime.InteropServices.FUNCKIND): Boolean = false
  def  &(that: System.Runtime.InteropServices.FUNCKIND): Boolean = false
  def  ^(that: System.Runtime.InteropServices.FUNCKIND): Boolean = false
}
object FUNCKIND{
  val FUNC_VIRTUAL	 = value(0)
  val FUNC_PUREVIRTUAL	 = value(1)
  val FUNC_NONVIRTUAL	 = value(2)
  val FUNC_STATIC	 = value(3)
  val FUNC_DISPATCH	 = value(4)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.FUNCKIND = null
}
 
sealed abstract class INVOKEKIND extends System.Enum {
  def ==(that: System.Runtime.InteropServices.INVOKEKIND): Boolean = false
  def !=(that: System.Runtime.InteropServices.INVOKEKIND): Boolean = false
  def  <(that: System.Runtime.InteropServices.INVOKEKIND): Boolean = false
  def <=(that: System.Runtime.InteropServices.INVOKEKIND): Boolean = false
  def  >(that: System.Runtime.InteropServices.INVOKEKIND): Boolean = false
  def >=(that: System.Runtime.InteropServices.INVOKEKIND): Boolean = false
  def  |(that: System.Runtime.InteropServices.INVOKEKIND): Boolean = false
  def  &(that: System.Runtime.InteropServices.INVOKEKIND): Boolean = false
  def  ^(that: System.Runtime.InteropServices.INVOKEKIND): Boolean = false
}
object INVOKEKIND{
  val INVOKE_FUNC	 = value(1)
  val INVOKE_PROPERTYGET	 = value(2)
  val INVOKE_PROPERTYPUT	 = value(4)
  val INVOKE_PROPERTYPUTREF	 = value(8)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.INVOKEKIND = null
}
 
sealed abstract class CALLCONV extends System.Enum {
  def ==(that: System.Runtime.InteropServices.CALLCONV): Boolean = false
  def !=(that: System.Runtime.InteropServices.CALLCONV): Boolean = false
  def  <(that: System.Runtime.InteropServices.CALLCONV): Boolean = false
  def <=(that: System.Runtime.InteropServices.CALLCONV): Boolean = false
  def  >(that: System.Runtime.InteropServices.CALLCONV): Boolean = false
  def >=(that: System.Runtime.InteropServices.CALLCONV): Boolean = false
  def  |(that: System.Runtime.InteropServices.CALLCONV): Boolean = false
  def  &(that: System.Runtime.InteropServices.CALLCONV): Boolean = false
  def  ^(that: System.Runtime.InteropServices.CALLCONV): Boolean = false
}
object CALLCONV{
  val CC_CDECL	 = value(1)
  val CC_MSCPASCAL	 = value(2)
  val CC_PASCAL	 = value(2)
  val CC_MACPASCAL	 = value(3)
  val CC_STDCALL	 = value(4)
  val CC_RESERVED	 = value(5)
  val CC_SYSCALL	 = value(6)
  val CC_MPWCDECL	 = value(7)
  val CC_MPWPASCAL	 = value(8)
  val CC_MAX	 = value(9)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.CALLCONV = null
}
 
sealed abstract class FUNCFLAGS extends System.Enum {
  def ==(that: System.Runtime.InteropServices.FUNCFLAGS): Boolean = false
  def !=(that: System.Runtime.InteropServices.FUNCFLAGS): Boolean = false
  def  <(that: System.Runtime.InteropServices.FUNCFLAGS): Boolean = false
  def <=(that: System.Runtime.InteropServices.FUNCFLAGS): Boolean = false
  def  >(that: System.Runtime.InteropServices.FUNCFLAGS): Boolean = false
  def >=(that: System.Runtime.InteropServices.FUNCFLAGS): Boolean = false
  def  |(that: System.Runtime.InteropServices.FUNCFLAGS): Boolean = false
  def  &(that: System.Runtime.InteropServices.FUNCFLAGS): Boolean = false
  def  ^(that: System.Runtime.InteropServices.FUNCFLAGS): Boolean = false
}
object FUNCFLAGS{
  val FUNCFLAG_FRESTRICTED	 = value(1)
  val FUNCFLAG_FSOURCE	 = value(2)
  val FUNCFLAG_FBINDABLE	 = value(4)
  val FUNCFLAG_FREQUESTEDIT	 = value(8)
  val FUNCFLAG_FDISPLAYBIND	 = value(16)
  val FUNCFLAG_FDEFAULTBIND	 = value(32)
  val FUNCFLAG_FHIDDEN	 = value(64)
  val FUNCFLAG_FUSESGETLASTERROR	 = value(128)
  val FUNCFLAG_FDEFAULTCOLLELEM	 = value(256)
  val FUNCFLAG_FUIDEFAULT	 = value(512)
  val FUNCFLAG_FNONBROWSABLE	 = value(1024)
  val FUNCFLAG_FREPLACEABLE	 = value(2048)
  val FUNCFLAG_FIMMEDIATEBIND	 = value(4096)
   
  /* an artifact for CLR enums */ private def value(i: Short): System.Runtime.InteropServices.FUNCFLAGS = null
}
 
sealed abstract class VARFLAGS extends System.Enum {
  def ==(that: System.Runtime.InteropServices.VARFLAGS): Boolean = false
  def !=(that: System.Runtime.InteropServices.VARFLAGS): Boolean = false
  def  <(that: System.Runtime.InteropServices.VARFLAGS): Boolean = false
  def <=(that: System.Runtime.InteropServices.VARFLAGS): Boolean = false
  def  >(that: System.Runtime.InteropServices.VARFLAGS): Boolean = false
  def >=(that: System.Runtime.InteropServices.VARFLAGS): Boolean = false
  def  |(that: System.Runtime.InteropServices.VARFLAGS): Boolean = false
  def  &(that: System.Runtime.InteropServices.VARFLAGS): Boolean = false
  def  ^(that: System.Runtime.InteropServices.VARFLAGS): Boolean = false
}
object VARFLAGS{
  val VARFLAG_FREADONLY	 = value(1)
  val VARFLAG_FSOURCE	 = value(2)
  val VARFLAG_FBINDABLE	 = value(4)
  val VARFLAG_FREQUESTEDIT	 = value(8)
  val VARFLAG_FDISPLAYBIND	 = value(16)
  val VARFLAG_FDEFAULTBIND	 = value(32)
  val VARFLAG_FHIDDEN	 = value(64)
  val VARFLAG_FRESTRICTED	 = value(128)
  val VARFLAG_FDEFAULTCOLLELEM	 = value(256)
  val VARFLAG_FUIDEFAULT	 = value(512)
  val VARFLAG_FNONBROWSABLE	 = value(1024)
  val VARFLAG_FREPLACEABLE	 = value(2048)
  val VARFLAG_FIMMEDIATEBIND	 = value(4096)
   
  /* an artifact for CLR enums */ private def value(i: Short): System.Runtime.InteropServices.VARFLAGS = null
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.ITypeInfo instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("00020401-0000-0000-C000-000000000046")
trait UCOMITypeInfo {
  /* abstract */ def GetTypeAttr(ppTypeAttr : CLRByRef[System.IntPtr]): Unit
   
  /* abstract */ def GetFuncDesc(index : Int, ppFuncDesc : CLRByRef[System.IntPtr]): Unit
   
  /* abstract */ def GetVarDesc(index : Int, ppVarDesc : CLRByRef[System.IntPtr]): Unit
   
  /* abstract */ def GetNames(memid : Int, rgBstrNames : Array[String], cMaxNames : Int, pcNames : CLRByRef[Int]): Unit
   
  /* abstract */ def GetRefTypeOfImplType(index : Int, href : CLRByRef[Int]): Unit
   
  /* abstract */ def GetImplTypeFlags(index : Int, pImplTypeFlags : CLRByRef[Int]): Unit
   
  /* abstract */ def GetIDsOfNames(rgszNames : Array[String], cNames : Int, pMemId : Array[Int]): Unit
   
  /* abstract */ def AddressOfMember(memid : Int, invKind : System.Runtime.InteropServices.INVOKEKIND, 
                                     ppv : CLRByRef[System.IntPtr]): Unit
   
  /* abstract */ def ReleaseTypeAttr(pTypeAttr : System.IntPtr): Unit
   
  /* abstract */ def ReleaseFuncDesc(pFuncDesc : System.IntPtr): Unit
   
  /* abstract */ def ReleaseVarDesc(pVarDesc : System.IntPtr): Unit
}
 
sealed abstract class SYSKIND extends System.Enum {
  def ==(that: System.Runtime.InteropServices.SYSKIND): Boolean = false
  def !=(that: System.Runtime.InteropServices.SYSKIND): Boolean = false
  def  <(that: System.Runtime.InteropServices.SYSKIND): Boolean = false
  def <=(that: System.Runtime.InteropServices.SYSKIND): Boolean = false
  def  >(that: System.Runtime.InteropServices.SYSKIND): Boolean = false
  def >=(that: System.Runtime.InteropServices.SYSKIND): Boolean = false
  def  |(that: System.Runtime.InteropServices.SYSKIND): Boolean = false
  def  &(that: System.Runtime.InteropServices.SYSKIND): Boolean = false
  def  ^(that: System.Runtime.InteropServices.SYSKIND): Boolean = false
}
object SYSKIND{
  val SYS_WIN16	 = value(0)
  val SYS_WIN32	 = value(1)
  val SYS_MAC	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.SYSKIND = null
}
 
sealed abstract class LIBFLAGS extends System.Enum {
  def ==(that: System.Runtime.InteropServices.LIBFLAGS): Boolean = false
  def !=(that: System.Runtime.InteropServices.LIBFLAGS): Boolean = false
  def  <(that: System.Runtime.InteropServices.LIBFLAGS): Boolean = false
  def <=(that: System.Runtime.InteropServices.LIBFLAGS): Boolean = false
  def  >(that: System.Runtime.InteropServices.LIBFLAGS): Boolean = false
  def >=(that: System.Runtime.InteropServices.LIBFLAGS): Boolean = false
  def  |(that: System.Runtime.InteropServices.LIBFLAGS): Boolean = false
  def  &(that: System.Runtime.InteropServices.LIBFLAGS): Boolean = false
  def  ^(that: System.Runtime.InteropServices.LIBFLAGS): Boolean = false
}
object LIBFLAGS{
  val LIBFLAG_FRESTRICTED	 = value(1)
  val LIBFLAG_FCONTROL	 = value(2)
  val LIBFLAG_FHIDDEN	 = value(4)
  val LIBFLAG_FHASDISKIMAGE	 = value(8)
   
  /* an artifact for CLR enums */ private def value(i: Short): System.Runtime.InteropServices.LIBFLAGS = null
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.TYPELIBATTR instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
sealed class TYPELIBATTR extends System.ValueType {
  var guid : System.Guid
   
  var lcid : Int
   
  var syskind : System.Runtime.InteropServices.SYSKIND
   
  var wMajorVerNum : Short
   
  var wMinorVerNum : Short
   
  var wLibFlags : System.Runtime.InteropServices.LIBFLAGS
}
 
@System.ObsoleteAttribute("Use System.Runtime.InteropServices.ComTypes.ITypeLib instead. http://go.microsoft.com/fwlink/?linkid=14202", false)
@System.Runtime.InteropServices.GuidAttribute("00020402-0000-0000-C000-000000000046")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait UCOMITypeLib {
  /* abstract */ def GetTypeInfoCount: Int
   
  /* abstract */ def GetTypeInfoType(index : Int, pTKind : CLRByRef[System.Runtime.InteropServices.TYPEKIND]): Unit
   
  /* abstract */ def GetLibAttr(ppTLibAttr : CLRByRef[System.IntPtr]): Unit
   
  /* abstract */ def IsName(szNameBuf : String, param0 : Int): Boolean
   
  /* abstract */ def FindName(szNameBuf : String, lHashVal : Int, 
                              ppTInfo : Array[System.Runtime.InteropServices.UCOMITypeInfo], 
                              rgMemId : Array[Int], pcFound : CLRByRef[Short]): Unit
   
  /* abstract */ def ReleaseTLibAttr(pTLibAttr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class UnknownWrapper extends AnyRef {
  val WrappedObject : AnyRef = null
   
  def this(obj : AnyRef) {}
}
 
sealed class VariantWrapper extends AnyRef {
  val WrappedObject : AnyRef = null
   
  def this(obj : AnyRef) {}
}
 
@System.Runtime.InteropServices.GuidAttribute("BEBB2505-8B54-3443-AEAD-142A16DD9CC7")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
trait _AssemblyBuilder {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.GuidAttribute("ED3E4384-D7E2-3FA7-8FFD-8940D330519A")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
trait _ConstructorBuilder {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.GuidAttribute("BE9ACCE8-AAFF-3B91-81AE-8211663F5CAD")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.CLSCompliantAttribute(false)
trait _CustomAttributeBuilder {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("C7BD73DE-9F85-3290-88EE-090B8BDFE2DF")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
trait _EnumBuilder {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("AADABA99-895D-3D65-9760-B1F12621FAE8")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
trait _EventBuilder {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.GuidAttribute("CE1A3BF5-975E-30CC-97C9-1EF70F8F3993")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait _FieldBuilder {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.GuidAttribute("A4924B27-6E3B-37F7-9B83-A4501955E6A7")
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
trait _ILGenerator {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.GuidAttribute("4E6350D1-A08B-3DEC-9A3E-C465F9AEEC0C")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
trait _LocalBuilder {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.GuidAttribute("007D8A14-FDF3-363E-9A0B-FEC0618260A2")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait _MethodBuilder {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("C2323C25-F57F-3880-8A4D-12EBEA7A5852")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
trait _MethodRental {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.GuidAttribute("D05FFA9A-04AF-3519-8EE1-8D93AD73430B")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
trait _ModuleBuilder {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("36329EBA-F97A-3565-BC07-0ED5C6EF19FC")
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
trait _ParameterBuilder {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("15F9A479-9397-3A63-ACBD-F51977FB0F02")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
trait _PropertyBuilder {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("7D13DD37-5A04-393C-BBCA-A5FEA802893D")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.CLSCompliantAttribute(false)
trait _SignatureHelper {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.TypeLibImportClassAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("7E5678EE-48B3-3F83-B076-C58543498A58")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.CLSCompliantAttribute(false)
trait _TypeBuilder {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
}
 
}