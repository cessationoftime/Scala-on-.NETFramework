 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Reflection.Emit {
 
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AssemblyBuilder extends System.Reflection.Assembly with System.Runtime.InteropServices._AssemblyBuilder {
  def DefineDynamicModule(name : String): System.Reflection.Emit.ModuleBuilder
   
  def DefineDynamicModule(name : String, emitSymbolInfo : Boolean): System.Reflection.Emit.ModuleBuilder
   
  def DefineDynamicModule(name : String, fileName : String): System.Reflection.Emit.ModuleBuilder
   
  def DefineDynamicModule(name : String, fileName : String, emitSymbolInfo : Boolean): System.Reflection.Emit.ModuleBuilder
   
  def DefineResource(name : String, description : String, fileName : String): System.Resources.IResourceWriter
   
  def DefineResource(name : String, description : String, fileName : String, 
                     attribute : System.Reflection.ResourceAttributes): System.Resources.IResourceWriter
   
  def AddResourceFile(name : String, fileName : String): Unit
   
  def AddResourceFile(name : String, fileName : String, attribute : System.Reflection.ResourceAttributes): Unit
   
  def GetManifestResourceNames: Array[String]
   
  def GetFile(name : String): System.IO.FileStream
   
  def GetFiles(getResourceModules : Boolean): Array[System.IO.FileStream]
   
  def GetManifestResourceStream(`type` : System.Type, name : String): System.IO.Stream
   
  def GetManifestResourceStream(name : String): System.IO.Stream
   
  def GetManifestResourceInfo(resourceName : String): System.Reflection.ManifestResourceInfo
   
  def GetExportedTypes: Array[System.Type]
   
  def DefineVersionInfoResource(product : String, productVersion : String, company : String, copyright : String, 
                                trademark : String): Unit
   
  def DefineVersionInfoResource: Unit
   
  def DefineUnmanagedResource(resource : Array[UByte]): Unit
   
  def DefineUnmanagedResource(resourceFileName : String): Unit
   
  def GetDynamicModule(name : String): System.Reflection.Emit.ModuleBuilder
   
  def SetEntryPoint(entryMethod : System.Reflection.MethodInfo): Unit
   
  def SetEntryPoint(entryMethod : System.Reflection.MethodInfo, 
                    fileKind : System.Reflection.Emit.PEFileKinds): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def SetCustomAttribute(con : System.Reflection.ConstructorInfo, binaryAttribute : Array[UByte]): Unit
   
  def SetCustomAttribute(customBuilder : System.Reflection.Emit.CustomAttributeBuilder): Unit
   
  def Save(assemblyFileName : String): Unit
   
  def Save(assemblyFileName : String, 
           portableExecutableKind : System.Reflection.PortableExecutableKinds, 
           imageFileMachine : System.Reflection.ImageFileMachine): Unit
   
  val Location : String = ""
   
  val ImageRuntimeVersion : String = ""
   
  val CodeBase : String = ""
   
  val EntryPoint : System.Reflection.MethodInfo = null
}
 
sealed abstract class AssemblyBuilderAccess extends System.Enum {
  def ==(that: System.Reflection.Emit.AssemblyBuilderAccess): Boolean = false
  def !=(that: System.Reflection.Emit.AssemblyBuilderAccess): Boolean = false
  def  <(that: System.Reflection.Emit.AssemblyBuilderAccess): Boolean = false
  def <=(that: System.Reflection.Emit.AssemblyBuilderAccess): Boolean = false
  def  >(that: System.Reflection.Emit.AssemblyBuilderAccess): Boolean = false
  def >=(that: System.Reflection.Emit.AssemblyBuilderAccess): Boolean = false
  def  |(that: System.Reflection.Emit.AssemblyBuilderAccess): Boolean = false
  def  &(that: System.Reflection.Emit.AssemblyBuilderAccess): Boolean = false
  def  ^(that: System.Reflection.Emit.AssemblyBuilderAccess): Boolean = false
}
object AssemblyBuilderAccess{
  val Run	 = value(1)
  val Save	 = value(2)
  val RunAndSave	 = value(3)
  val ReflectionOnly	 = value(6)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.Emit.AssemblyBuilderAccess = null
}
 
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
sealed class ConstructorBuilder extends System.Reflection.ConstructorInfo with 
                                        System.Runtime.InteropServices._ConstructorBuilder {
  def ToString: String
   
  def Invoke(obj : AnyRef, invokeAttr : System.Reflection.BindingFlags, 
             binder : System.Reflection.Binder, parameters : Array[AnyRef], 
             culture : System.Globalization.CultureInfo): AnyRef
   
  def GetParameters: Array[System.Reflection.ParameterInfo]
   
  def GetMethodImplementationFlags: System.Reflection.MethodImplAttributes
   
  def Invoke(invokeAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
             parameters : Array[AnyRef], culture : System.Globalization.CultureInfo): AnyRef
   
  def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  def GetToken: System.Reflection.Emit.MethodToken
   
  def DefineParameter(iSequence : Int, attributes : System.Reflection.ParameterAttributes, 
                      strParamName : String): System.Reflection.Emit.ParameterBuilder
   
  def SetSymCustomAttribute(name : String, data : Array[UByte]): Unit
   
  def GetILGenerator: System.Reflection.Emit.ILGenerator
   
  def GetILGenerator(streamSize : Int): System.Reflection.Emit.ILGenerator
   
  def AddDeclarativeSecurity(action : System.Security.Permissions.SecurityAction, 
                             pset : System.Security.PermissionSet): Unit
   
  def GetModule: System.Reflection.Module
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def SetCustomAttribute(con : System.Reflection.ConstructorInfo, binaryAttribute : Array[UByte]): Unit
   
  def SetCustomAttribute(customBuilder : System.Reflection.Emit.CustomAttributeBuilder): Unit
   
  def SetImplementationFlags(attributes : System.Reflection.MethodImplAttributes): Unit
   
  val Module : System.Reflection.Module = null
   
  val ReflectedType : System.Type = null
   
  val DeclaringType : System.Type = null
   
  val Name : String = ""
   
  val Attributes : System.Reflection.MethodAttributes = System.Reflection.MethodAttributes.MemberAccessMask
   
  val MethodHandle : System.RuntimeMethodHandle = new System.RuntimeMethodHandle()
   
  val CallingConvention : System.Reflection.CallingConventions = System.Reflection.CallingConventions.Standard
   
  val ReturnType : System.Type = null
   
  val Signature : String = ""
   
  var InitLocals : Boolean = false
}
 
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
class ILGenerator extends AnyRef with System.Runtime.InteropServices._ILGenerator {
  def Emit(opcode : System.Reflection.Emit.OpCode): Unit
   
  def Emit(opcode : System.Reflection.Emit.OpCode, arg : UByte): Unit
   
  @System.CLSCompliantAttribute(false)
  def Emit(opcode : System.Reflection.Emit.OpCode, arg : Byte): Unit
   
  def Emit(opcode : System.Reflection.Emit.OpCode, arg : Short): Unit
   
  def Emit(opcode : System.Reflection.Emit.OpCode, arg : Int): Unit
   
  def Emit(opcode : System.Reflection.Emit.OpCode, meth : System.Reflection.MethodInfo): Unit
   
  def EmitCalli(opcode : System.Reflection.Emit.OpCode, 
                callingConvention : System.Reflection.CallingConventions, returnType : System.Type, 
                parameterTypes : Array[System.Type], optionalParameterTypes : Array[System.Type]): Unit
   
  def EmitCalli(opcode : System.Reflection.Emit.OpCode, 
                unmanagedCallConv : System.Runtime.InteropServices.CallingConvention, 
                returnType : System.Type, parameterTypes : Array[System.Type]): Unit
   
  def EmitCall(opcode : System.Reflection.Emit.OpCode, methodInfo : System.Reflection.MethodInfo, 
               optionalParameterTypes : Array[System.Type]): Unit
   
  def Emit(opcode : System.Reflection.Emit.OpCode, 
           signature : System.Reflection.Emit.SignatureHelper): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def Emit(opcode : System.Reflection.Emit.OpCode, con : System.Reflection.ConstructorInfo): Unit
   
  def Emit(opcode : System.Reflection.Emit.OpCode, cls : System.Type): Unit
   
  def Emit(opcode : System.Reflection.Emit.OpCode, arg : Long): Unit
   
  def Emit(opcode : System.Reflection.Emit.OpCode, arg : Float): Unit
   
  def Emit(opcode : System.Reflection.Emit.OpCode, arg : Double): Unit
   
  def Emit(opcode : System.Reflection.Emit.OpCode, label : System.Reflection.Emit.Label): Unit
   
  def Emit(opcode : System.Reflection.Emit.OpCode, 
           labels : Array[System.Reflection.Emit.Label]): Unit
   
  def Emit(opcode : System.Reflection.Emit.OpCode, field : System.Reflection.FieldInfo): Unit
   
  def Emit(opcode : System.Reflection.Emit.OpCode, str : String): Unit
   
  def Emit(opcode : System.Reflection.Emit.OpCode, 
           local : System.Reflection.Emit.LocalBuilder): Unit
   
  def BeginExceptionBlock: System.Reflection.Emit.Label
   
  def EndExceptionBlock: Unit
   
  def BeginExceptFilterBlock: Unit
   
  def BeginCatchBlock(exceptionType : System.Type): Unit
   
  def BeginFaultBlock: Unit
   
  def BeginFinallyBlock: Unit
   
  def DefineLabel: System.Reflection.Emit.Label
   
  def MarkLabel(loc : System.Reflection.Emit.Label): Unit
   
  def ThrowException(excType : System.Type): Unit
   
  def EmitWriteLine(value : String): Unit
   
  def EmitWriteLine(localBuilder : System.Reflection.Emit.LocalBuilder): Unit
   
  def EmitWriteLine(fld : System.Reflection.FieldInfo): Unit
   
  def DeclareLocal(localType : System.Type): System.Reflection.Emit.LocalBuilder
   
  def DeclareLocal(localType : System.Type, pinned : Boolean): System.Reflection.Emit.LocalBuilder
   
  def UsingNamespace(usingNamespace : String): Unit
   
  def MarkSequencePoint(document : System.Diagnostics.SymbolStore.ISymbolDocumentWriter, startLine : Int, 
                        startColumn : Int, endLine : Int, endColumn : Int): Unit
   
  def BeginScope: Unit
   
  def EndScope: Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class DynamicILInfo extends AnyRef {
  def SetCode(code : Array[UByte], maxStackSize : Int): Unit
   
  def SetExceptions(exceptions : Array[UByte]): Unit
   
  def SetLocalSignature(localSignature : Array[UByte]): Unit
   
  def GetTokenFor(method : System.RuntimeMethodHandle): Int
   
  def GetTokenFor(method : System.Reflection.Emit.DynamicMethod): Int
   
  def GetTokenFor(method : System.RuntimeMethodHandle, contextType : System.RuntimeTypeHandle): Int
   
  def GetTokenFor(field : System.RuntimeFieldHandle): Int
   
  def GetTokenFor(`type` : System.RuntimeTypeHandle): Int
   
  def GetTokenFor(literal : String): Int
   
  def GetTokenFor(signature : Array[UByte]): Int
   
  val DynamicMethod : System.Reflection.Emit.DynamicMethod = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class DynamicMethod extends System.Reflection.MethodInfo {
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def CreateDelegate(delegateType : System.Type): System.Delegate
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def CreateDelegate(delegateType : System.Type, target : AnyRef): System.Delegate
   
  def ToString: String
   
  def GetBaseDefinition: System.Reflection.MethodInfo
   
  def GetParameters: Array[System.Reflection.ParameterInfo]
   
  def GetMethodImplementationFlags: System.Reflection.MethodImplAttributes
   
  def Invoke(obj : AnyRef, invokeAttr : System.Reflection.BindingFlags, 
             binder : System.Reflection.Binder, parameters : Array[AnyRef], 
             culture : System.Globalization.CultureInfo): AnyRef
   
  def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  def DefineParameter(position : Int, attributes : System.Reflection.ParameterAttributes, 
                      parameterName : String): System.Reflection.Emit.ParameterBuilder
   
  def GetDynamicILInfo: System.Reflection.Emit.DynamicILInfo
   
  def GetILGenerator: System.Reflection.Emit.ILGenerator
   
  def GetILGenerator(streamSize : Int): System.Reflection.Emit.ILGenerator
   
  val Name : String = ""
   
  val DeclaringType : System.Type = null
   
  val ReflectedType : System.Type = null
   
  val Module : System.Reflection.Module = null
   
  val MethodHandle : System.RuntimeMethodHandle = new System.RuntimeMethodHandle()
   
  val Attributes : System.Reflection.MethodAttributes = System.Reflection.MethodAttributes.MemberAccessMask
   
  val CallingConvention : System.Reflection.CallingConventions = System.Reflection.CallingConventions.Standard
   
  val ReturnType : System.Type = null
   
  val ReturnParameter : System.Reflection.ParameterInfo = null
   
  val ReturnTypeCustomAttributes : System.Reflection.ICustomAttributeProvider = null
   
  var InitLocals : Boolean = false
   
  def this(name : String, returnType : System.Type, parameterTypes : Array[System.Type]) {}
   
  def this(name : String, returnType : System.Type, parameterTypes : Array[System.Type], 
           restrictedSkipVisibility : Boolean) {}
   
  def this(name : String, returnType : System.Type, parameterTypes : Array[System.Type], 
           m : System.Reflection.Module) {}
   
  def this(name : String, returnType : System.Type, parameterTypes : Array[System.Type], 
           m : System.Reflection.Module, skipVisibility : Boolean) {}
   
  def this(name : String, attributes : System.Reflection.MethodAttributes, 
           callingConvention : System.Reflection.CallingConventions, returnType : System.Type, 
           parameterTypes : Array[System.Type], m : System.Reflection.Module, 
           skipVisibility : Boolean) {}
   
  def this(name : String, returnType : System.Type, parameterTypes : Array[System.Type], 
           owner : System.Type) {}
   
  def this(name : String, returnType : System.Type, parameterTypes : Array[System.Type], 
           owner : System.Type, skipVisibility : Boolean) {}
   
  def this(name : String, attributes : System.Reflection.MethodAttributes, 
           callingConvention : System.Reflection.CallingConventions, returnType : System.Type, 
           parameterTypes : Array[System.Type], owner : System.Type, skipVisibility : Boolean) {}
}
 
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
sealed class EventBuilder extends AnyRef with System.Runtime.InteropServices._EventBuilder {
  def GetEventToken: System.Reflection.Emit.EventToken
   
  def SetAddOnMethod(mdBuilder : System.Reflection.Emit.MethodBuilder): Unit
   
  def SetRemoveOnMethod(mdBuilder : System.Reflection.Emit.MethodBuilder): Unit
   
  def SetRaiseMethod(mdBuilder : System.Reflection.Emit.MethodBuilder): Unit
   
  def AddOtherMethod(mdBuilder : System.Reflection.Emit.MethodBuilder): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def SetCustomAttribute(con : System.Reflection.ConstructorInfo, binaryAttribute : Array[UByte]): Unit
   
  def SetCustomAttribute(customBuilder : System.Reflection.Emit.CustomAttributeBuilder): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class EventToken extends System.ValueType {
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : System.Reflection.Emit.EventToken): Boolean
   
  val Token : Int = 0
}
object EventToken {
  def ==(a : System.Reflection.Emit.EventToken, b : System.Reflection.Emit.EventToken): Boolean  = false
   
  def !=(a : System.Reflection.Emit.EventToken, b : System.Reflection.Emit.EventToken): Boolean  = false
   
  val Empty : System.Reflection.Emit.EventToken  = new System.Reflection.Emit.EventToken()
}
 
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class FieldBuilder extends System.Reflection.FieldInfo with System.Runtime.InteropServices._FieldBuilder {
  def GetValue(obj : AnyRef): AnyRef
   
  def SetValue(obj : AnyRef, `val` : AnyRef, invokeAttr : System.Reflection.BindingFlags, 
               binder : System.Reflection.Binder, culture : System.Globalization.CultureInfo): Unit
   
  def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  def GetToken: System.Reflection.Emit.FieldToken
   
  def SetOffset(iOffset : Int): Unit
   
  @System.ObsoleteAttribute("An alternate API is available: Emit the MarshalAs custom attribute instead. http://go.microsoft.com/fwlink/?linkid=14202")
  def SetMarshal(unmanagedMarshal : System.Reflection.Emit.UnmanagedMarshal): Unit
   
  def SetConstant(defaultValue : AnyRef): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def SetCustomAttribute(con : System.Reflection.ConstructorInfo, binaryAttribute : Array[UByte]): Unit
   
  def SetCustomAttribute(customBuilder : System.Reflection.Emit.CustomAttributeBuilder): Unit
   
  val Module : System.Reflection.Module = null
   
  val Name : String = ""
   
  val DeclaringType : System.Type = null
   
  val ReflectedType : System.Type = null
   
  val FieldType : System.Type = null
   
  val FieldHandle : System.RuntimeFieldHandle = new System.RuntimeFieldHandle()
   
  val Attributes : System.Reflection.FieldAttributes = System.Reflection.FieldAttributes.FieldAccessMask
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class FieldToken extends System.ValueType {
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : System.Reflection.Emit.FieldToken): Boolean
   
  val Token : Int = 0
}
object FieldToken {
  def ==(a : System.Reflection.Emit.FieldToken, b : System.Reflection.Emit.FieldToken): Boolean  = false
   
  def !=(a : System.Reflection.Emit.FieldToken, b : System.Reflection.Emit.FieldToken): Boolean  = false
   
  val Empty : System.Reflection.Emit.FieldToken  = new System.Reflection.Emit.FieldToken()
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Label extends System.ValueType {
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : System.Reflection.Emit.Label): Boolean
}
object Label {
  def ==(a : System.Reflection.Emit.Label, b : System.Reflection.Emit.Label): Boolean  = false
   
  def !=(a : System.Reflection.Emit.Label, b : System.Reflection.Emit.Label): Boolean  = false
}
 
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class LocalBuilder extends System.Reflection.LocalVariableInfo with System.Runtime.InteropServices._LocalBuilder {
  def SetLocalSymInfo(name : String): Unit
   
  def SetLocalSymInfo(name : String, startOffset : Int, endOffset : Int): Unit
   
  val IsPinned : Boolean = false
   
  val LocalType : System.Type = null
   
  val LocalIndex : Int = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
sealed class MethodBuilder extends System.Reflection.MethodInfo with System.Runtime.InteropServices._MethodBuilder {
  def Equals(obj : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def Invoke(obj : AnyRef, invokeAttr : System.Reflection.BindingFlags, 
             binder : System.Reflection.Binder, parameters : Array[AnyRef], 
             culture : System.Globalization.CultureInfo): AnyRef
   
  def GetMethodImplementationFlags: System.Reflection.MethodImplAttributes
   
  def GetBaseDefinition: System.Reflection.MethodInfo
   
  def GetParameters: Array[System.Reflection.ParameterInfo]
   
  def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  def GetGenericMethodDefinition: System.Reflection.MethodInfo
   
  def GetGenericArguments: Array[System.Type]
   
  def MakeGenericMethod(typeArguments : Array[System.Type]): System.Reflection.MethodInfo
   
  def DefineGenericParameters(names : Array[String]): Array[System.Reflection.Emit.GenericTypeParameterBuilder]
   
  def GetToken: System.Reflection.Emit.MethodToken
   
  def SetParameters(parameterTypes : Array[System.Type]): Unit
   
  def SetReturnType(returnType : System.Type): Unit
   
  def SetSignature(returnType : System.Type, returnTypeRequiredCustomModifiers : Array[System.Type], 
                   returnTypeOptionalCustomModifiers : Array[System.Type], 
                   parameterTypes : Array[System.Type], 
                   parameterTypeRequiredCustomModifiers : Array[Array[System.Type]], 
                   parameterTypeOptionalCustomModifiers : Array[Array[System.Type]]): Unit
   
  def DefineParameter(position : Int, attributes : System.Reflection.ParameterAttributes, 
                      strParamName : String): System.Reflection.Emit.ParameterBuilder
   
  @System.ObsoleteAttribute("An alternate API is available: Emit the MarshalAs custom attribute instead. http://go.microsoft.com/fwlink/?linkid=14202")
  def SetMarshal(unmanagedMarshal : System.Reflection.Emit.UnmanagedMarshal): Unit
   
  def SetSymCustomAttribute(name : String, data : Array[UByte]): Unit
   
  def AddDeclarativeSecurity(action : System.Security.Permissions.SecurityAction, 
                             pset : System.Security.PermissionSet): Unit
   
  def CreateMethodBody(il : Array[UByte], count : Int): Unit
   
  def SetImplementationFlags(attributes : System.Reflection.MethodImplAttributes): Unit
   
  def GetILGenerator: System.Reflection.Emit.ILGenerator
   
  def GetILGenerator(size : Int): System.Reflection.Emit.ILGenerator
   
  def GetModule: System.Reflection.Module
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def SetCustomAttribute(con : System.Reflection.ConstructorInfo, binaryAttribute : Array[UByte]): Unit
   
  def SetCustomAttribute(customBuilder : System.Reflection.Emit.CustomAttributeBuilder): Unit
   
  val Name : String = ""
   
  val Module : System.Reflection.Module = null
   
  val DeclaringType : System.Type = null
   
  val ReturnTypeCustomAttributes : System.Reflection.ICustomAttributeProvider = null
   
  val ReflectedType : System.Type = null
   
  val Attributes : System.Reflection.MethodAttributes = System.Reflection.MethodAttributes.MemberAccessMask
   
  val CallingConvention : System.Reflection.CallingConventions = System.Reflection.CallingConventions.Standard
   
  val MethodHandle : System.RuntimeMethodHandle = new System.RuntimeMethodHandle()
   
  val ReturnParameter : System.Reflection.ParameterInfo = null
   
  val IsGenericMethodDefinition : Boolean = false
   
  val ContainsGenericParameters : Boolean = false
   
  val IsGenericMethod : Boolean = false
   
  var InitLocals : Boolean = false
   
  val Signature : String = ""
}
 
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
class CustomAttributeBuilder extends AnyRef with System.Runtime.InteropServices._CustomAttributeBuilder {
  def this(con : System.Reflection.ConstructorInfo, constructorArgs : Array[AnyRef]) {}
   
  def this(con : System.Reflection.ConstructorInfo, constructorArgs : Array[AnyRef], 
           namedProperties : Array[System.Reflection.PropertyInfo], 
           propertyValues : Array[AnyRef]) {}
   
  def this(con : System.Reflection.ConstructorInfo, constructorArgs : Array[AnyRef], 
           namedFields : Array[System.Reflection.FieldInfo], fieldValues : Array[AnyRef]) {}
   
  def this(con : System.Reflection.ConstructorInfo, constructorArgs : Array[AnyRef], 
           namedProperties : Array[System.Reflection.PropertyInfo], 
           propertyValues : Array[AnyRef], namedFields : Array[System.Reflection.FieldInfo], 
           fieldValues : Array[AnyRef]) {}
}
 
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class MethodRental extends AnyRef with System.Runtime.InteropServices._MethodRental 
object MethodRental {
  def SwapMethodBody(cls : System.Type, methodtoken : Int, rgIL : System.IntPtr, methodSize : Int, 
                     flags : Int): Unit  = {}
   
  val JitOnDemand : Int  = 0
   
  val JitImmediate : Int  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class MethodToken extends System.ValueType {
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : System.Reflection.Emit.MethodToken): Boolean
   
  val Token : Int = 0
}
object MethodToken {
  def ==(a : System.Reflection.Emit.MethodToken, b : System.Reflection.Emit.MethodToken): Boolean  = false
   
  def !=(a : System.Reflection.Emit.MethodToken, b : System.Reflection.Emit.MethodToken): Boolean  = false
   
  val Empty : System.Reflection.Emit.MethodToken  = new System.Reflection.Emit.MethodToken()
}
 
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
class ModuleBuilder extends System.Reflection.Module with System.Runtime.InteropServices._ModuleBuilder {
  def GetTypes: Array[System.Type]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetType(className : String): System.Type
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetType(className : String, ignoreCase : Boolean): System.Type
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetType(className : String, throwOnError : Boolean, ignoreCase : Boolean): System.Type
   
  def DefineType(name : String): System.Reflection.Emit.TypeBuilder
   
  def DefineType(name : String, attr : System.Reflection.TypeAttributes): System.Reflection.Emit.TypeBuilder
   
  def DefineType(name : String, attr : System.Reflection.TypeAttributes, parent : System.Type): System.Reflection.Emit.TypeBuilder
   
  def DefineType(name : String, attr : System.Reflection.TypeAttributes, parent : System.Type, 
                 typesize : Int): System.Reflection.Emit.TypeBuilder
   
  def DefineType(name : String, attr : System.Reflection.TypeAttributes, parent : System.Type, 
                 packingSize : System.Reflection.Emit.PackingSize, typesize : Int): System.Reflection.Emit.TypeBuilder
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def DefineType(name : String, attr : System.Reflection.TypeAttributes, parent : System.Type, 
                 interfaces : Array[System.Type]): System.Reflection.Emit.TypeBuilder
   
  def DefineType(name : String, attr : System.Reflection.TypeAttributes, parent : System.Type, 
                 packsize : System.Reflection.Emit.PackingSize): System.Reflection.Emit.TypeBuilder
   
  def DefineEnum(name : String, visibility : System.Reflection.TypeAttributes, 
                 underlyingType : System.Type): System.Reflection.Emit.EnumBuilder
   
  def DefineResource(name : String, description : String): System.Resources.IResourceWriter
   
  def DefineResource(name : String, description : String, 
                     attribute : System.Reflection.ResourceAttributes): System.Resources.IResourceWriter
   
  def DefineManifestResource(name : String, stream : System.IO.Stream, 
                             attribute : System.Reflection.ResourceAttributes): Unit
   
  def DefineUnmanagedResource(resource : Array[UByte]): Unit
   
  def DefineUnmanagedResource(resourceFileName : String): Unit
   
  def DefineGlobalMethod(name : String, attributes : System.Reflection.MethodAttributes, 
                         returnType : System.Type, parameterTypes : Array[System.Type]): System.Reflection.Emit.MethodBuilder
   
  def DefineGlobalMethod(name : String, attributes : System.Reflection.MethodAttributes, 
                         callingConvention : System.Reflection.CallingConventions, returnType : System.Type, 
                         parameterTypes : Array[System.Type]): System.Reflection.Emit.MethodBuilder
   
  def DefineGlobalMethod(name : String, attributes : System.Reflection.MethodAttributes, 
                         callingConvention : System.Reflection.CallingConventions, returnType : System.Type, 
                         requiredReturnTypeCustomModifiers : Array[System.Type], 
                         optionalReturnTypeCustomModifiers : Array[System.Type], 
                         parameterTypes : Array[System.Type], 
                         requiredParameterTypeCustomModifiers : Array[Array[System.Type]], 
                         optionalParameterTypeCustomModifiers : Array[Array[System.Type]]): System.Reflection.Emit.MethodBuilder
   
  def DefinePInvokeMethod(name : String, dllName : String, attributes : System.Reflection.MethodAttributes, 
                          callingConvention : System.Reflection.CallingConventions, returnType : System.Type, 
                          parameterTypes : Array[System.Type], 
                          nativeCallConv : System.Runtime.InteropServices.CallingConvention, 
                          nativeCharSet : System.Runtime.InteropServices.CharSet): System.Reflection.Emit.MethodBuilder
   
  def DefinePInvokeMethod(name : String, dllName : String, entryName : String, 
                          attributes : System.Reflection.MethodAttributes, 
                          callingConvention : System.Reflection.CallingConventions, returnType : System.Type, 
                          parameterTypes : Array[System.Type], 
                          nativeCallConv : System.Runtime.InteropServices.CallingConvention, 
                          nativeCharSet : System.Runtime.InteropServices.CharSet): System.Reflection.Emit.MethodBuilder
   
  def CreateGlobalFunctions: Unit
   
  def DefineInitializedData(name : String, data : Array[UByte], attributes : System.Reflection.FieldAttributes): System.Reflection.Emit.FieldBuilder
   
  def DefineUninitializedData(name : String, size : Int, attributes : System.Reflection.FieldAttributes): System.Reflection.Emit.FieldBuilder
   
  def GetTypeToken(`type` : System.Type): System.Reflection.Emit.TypeToken
   
  def GetTypeToken(name : String): System.Reflection.Emit.TypeToken
   
  def GetMethodToken(method : System.Reflection.MethodInfo): System.Reflection.Emit.MethodToken
   
  def GetArrayMethodToken(arrayClass : System.Type, methodName : String, 
                          callingConvention : System.Reflection.CallingConventions, returnType : System.Type, 
                          parameterTypes : Array[System.Type]): System.Reflection.Emit.MethodToken
   
  def GetArrayMethod(arrayClass : System.Type, methodName : String, 
                     callingConvention : System.Reflection.CallingConventions, returnType : System.Type, 
                     parameterTypes : Array[System.Type]): System.Reflection.MethodInfo
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetConstructorToken(con : System.Reflection.ConstructorInfo): System.Reflection.Emit.MethodToken
   
  def GetFieldToken(field : System.Reflection.FieldInfo): System.Reflection.Emit.FieldToken
   
  def GetStringConstant(str : String): System.Reflection.Emit.StringToken
   
  def GetSignatureToken(sigHelper : System.Reflection.Emit.SignatureHelper): System.Reflection.Emit.SignatureToken
   
  def GetSignatureToken(sigBytes : Array[UByte], sigLength : Int): System.Reflection.Emit.SignatureToken
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def SetCustomAttribute(con : System.Reflection.ConstructorInfo, binaryAttribute : Array[UByte]): Unit
   
  def SetCustomAttribute(customBuilder : System.Reflection.Emit.CustomAttributeBuilder): Unit
   
  def GetSymWriter: System.Diagnostics.SymbolStore.ISymbolWriter
   
  def DefineDocument(url : String, language : System.Guid, languageVendor : System.Guid, 
                     documentType : System.Guid): System.Diagnostics.SymbolStore.ISymbolDocumentWriter
   
  def SetUserEntryPoint(entryPoint : System.Reflection.MethodInfo): Unit
   
  def SetSymCustomAttribute(name : String, data : Array[UByte]): Unit
   
  def IsTransient: Boolean
   
  val FullyQualifiedName : String = ""
}
 
sealed abstract class PEFileKinds extends System.Enum {
  def ==(that: System.Reflection.Emit.PEFileKinds): Boolean = false
  def !=(that: System.Reflection.Emit.PEFileKinds): Boolean = false
  def  <(that: System.Reflection.Emit.PEFileKinds): Boolean = false
  def <=(that: System.Reflection.Emit.PEFileKinds): Boolean = false
  def  >(that: System.Reflection.Emit.PEFileKinds): Boolean = false
  def >=(that: System.Reflection.Emit.PEFileKinds): Boolean = false
  def  |(that: System.Reflection.Emit.PEFileKinds): Boolean = false
  def  &(that: System.Reflection.Emit.PEFileKinds): Boolean = false
  def  ^(that: System.Reflection.Emit.PEFileKinds): Boolean = false
}
object PEFileKinds{
  val Dll	 = value(1)
  val ConsoleApplication	 = value(2)
  val WindowApplication	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.Emit.PEFileKinds = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class OpCodes extends AnyRef 
object OpCodes {
  def TakesSingleByteArgument(inst : System.Reflection.Emit.OpCode): Boolean  = false
   
  val Nop : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Break : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldarg_0 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldarg_1 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldarg_2 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldarg_3 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldloc_0 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldloc_1 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldloc_2 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldloc_3 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stloc_0 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stloc_1 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stloc_2 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stloc_3 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldarg_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldarga_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Starg_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldloc_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldloca_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stloc_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldnull : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldc_I4_M1 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldc_I4_0 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldc_I4_1 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldc_I4_2 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldc_I4_3 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldc_I4_4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldc_I4_5 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldc_I4_6 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldc_I4_7 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldc_I4_8 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldc_I4_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldc_I4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldc_I8 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldc_R4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldc_R8 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Dup : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Pop : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Jmp : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Call : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Calli : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ret : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Br_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Brfalse_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Brtrue_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Beq_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Bge_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Bgt_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ble_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Blt_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Bne_Un_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Bge_Un_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Bgt_Un_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ble_Un_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Blt_Un_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Br : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Brfalse : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Brtrue : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Beq : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Bge : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Bgt : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ble : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Blt : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Bne_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Bge_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Bgt_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ble_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Blt_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Switch : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldind_I1 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldind_U1 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldind_I2 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldind_U2 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldind_I4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldind_U4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldind_I8 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldind_I : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldind_R4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldind_R8 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldind_Ref : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stind_Ref : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stind_I1 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stind_I2 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stind_I4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stind_I8 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stind_R4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stind_R8 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Add : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Sub : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Mul : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Div : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Div_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Rem : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Rem_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val And : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Or : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Xor : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Shl : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Shr : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Shr_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Neg : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Not : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_I1 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_I2 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_I4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_I8 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_R4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_R8 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_U4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_U8 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Callvirt : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Cpobj : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldobj : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldstr : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Newobj : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  val Castclass : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Isinst : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_R_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Unbox : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Throw : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldfld : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldflda : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stfld : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldsfld : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldsflda : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stsfld : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stobj : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_I1_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_I2_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_I4_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_I8_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_U1_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_U2_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_U4_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_U8_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_I_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_U_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Box : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Newarr : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldlen : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldelema : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldelem_I1 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldelem_U1 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldelem_I2 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldelem_U2 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldelem_I4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldelem_U4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldelem_I8 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldelem_I : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldelem_R4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldelem_R8 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldelem_Ref : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stelem_I : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stelem_I1 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stelem_I2 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stelem_I4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stelem_I8 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stelem_R4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stelem_R8 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stelem_Ref : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldelem : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stelem : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Unbox_Any : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_I1 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_U1 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_I2 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_U2 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_I4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_U4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_I8 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_U8 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Refanyval : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ckfinite : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Mkrefany : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldtoken : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_U2 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_U1 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_I : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_I : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_Ovf_U : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Add_Ovf : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Add_Ovf_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Mul_Ovf : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Mul_Ovf_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Sub_Ovf : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Sub_Ovf_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Endfinally : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Leave : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Leave_S : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stind_I : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Conv_U : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Prefix7 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Prefix6 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Prefix5 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Prefix4 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Prefix3 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Prefix2 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Prefix1 : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Prefixref : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Arglist : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ceq : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Cgt : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Cgt_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Clt : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Clt_Un : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldftn : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldvirtftn : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldarg : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldarga : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Starg : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldloc : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Ldloca : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Stloc : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Localloc : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Endfilter : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Unaligned : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Volatile : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Tailcall : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Initobj : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Constrained : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Cpblk : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Initblk : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Rethrow : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Sizeof : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Refanytype : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
   
  val Readonly : System.Reflection.Emit.OpCode  = new System.Reflection.Emit.OpCode()
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class OpCode extends System.ValueType {
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : System.Reflection.Emit.OpCode): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  val OperandType : System.Reflection.Emit.OperandType = System.Reflection.Emit.OperandType.InlineBrTarget
   
  val FlowControl : System.Reflection.Emit.FlowControl = System.Reflection.Emit.FlowControl.Branch
   
  val OpCodeType : System.Reflection.Emit.OpCodeType = System.Reflection.Emit.OpCodeType.Annotation
   
  val StackBehaviourPop : System.Reflection.Emit.StackBehaviour = System.Reflection.Emit.StackBehaviour.Pop0
   
  val StackBehaviourPush : System.Reflection.Emit.StackBehaviour = System.Reflection.Emit.StackBehaviour.Pop0
   
  val Size : Int = 0
   
  val Value : Short = 0
   
  val Name : String = ""
}
object OpCode {
  def ==(a : System.Reflection.Emit.OpCode, b : System.Reflection.Emit.OpCode): Boolean  = false
   
  def !=(a : System.Reflection.Emit.OpCode, b : System.Reflection.Emit.OpCode): Boolean  = false
}
 
sealed abstract class OpCodeType extends System.Enum {
  def ==(that: System.Reflection.Emit.OpCodeType): Boolean = false
  def !=(that: System.Reflection.Emit.OpCodeType): Boolean = false
  def  <(that: System.Reflection.Emit.OpCodeType): Boolean = false
  def <=(that: System.Reflection.Emit.OpCodeType): Boolean = false
  def  >(that: System.Reflection.Emit.OpCodeType): Boolean = false
  def >=(that: System.Reflection.Emit.OpCodeType): Boolean = false
  def  |(that: System.Reflection.Emit.OpCodeType): Boolean = false
  def  &(that: System.Reflection.Emit.OpCodeType): Boolean = false
  def  ^(that: System.Reflection.Emit.OpCodeType): Boolean = false
}
object OpCodeType{
  val Annotation	 = value(0)
  val Macro	 = value(1)
  val Nternal	 = value(2)
  val Objmodel	 = value(3)
  val Prefix	 = value(4)
  val Primitive	 = value(5)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.Emit.OpCodeType = null
}
 
sealed abstract class StackBehaviour extends System.Enum {
  def ==(that: System.Reflection.Emit.StackBehaviour): Boolean = false
  def !=(that: System.Reflection.Emit.StackBehaviour): Boolean = false
  def  <(that: System.Reflection.Emit.StackBehaviour): Boolean = false
  def <=(that: System.Reflection.Emit.StackBehaviour): Boolean = false
  def  >(that: System.Reflection.Emit.StackBehaviour): Boolean = false
  def >=(that: System.Reflection.Emit.StackBehaviour): Boolean = false
  def  |(that: System.Reflection.Emit.StackBehaviour): Boolean = false
  def  &(that: System.Reflection.Emit.StackBehaviour): Boolean = false
  def  ^(that: System.Reflection.Emit.StackBehaviour): Boolean = false
}
object StackBehaviour{
  val Pop0	 = value(0)
  val Pop1	 = value(1)
  val Pop1_pop1	 = value(2)
  val Popi	 = value(3)
  val Popi_pop1	 = value(4)
  val Popi_popi	 = value(5)
  val Popi_popi8	 = value(6)
  val Popi_popi_popi	 = value(7)
  val Popi_popr4	 = value(8)
  val Popi_popr8	 = value(9)
  val Popref	 = value(10)
  val Popref_pop1	 = value(11)
  val Popref_popi	 = value(12)
  val Popref_popi_popi	 = value(13)
  val Popref_popi_popi8	 = value(14)
  val Popref_popi_popr4	 = value(15)
  val Popref_popi_popr8	 = value(16)
  val Popref_popi_popref	 = value(17)
  val Push0	 = value(18)
  val Push1	 = value(19)
  val Push1_push1	 = value(20)
  val Pushi	 = value(21)
  val Pushi8	 = value(22)
  val Pushr4	 = value(23)
  val Pushr8	 = value(24)
  val Pushref	 = value(25)
  val Varpop	 = value(26)
  val Varpush	 = value(27)
  val Popref_popi_pop1	 = value(28)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.Emit.StackBehaviour = null
}
 
sealed abstract class OperandType extends System.Enum {
  def ==(that: System.Reflection.Emit.OperandType): Boolean = false
  def !=(that: System.Reflection.Emit.OperandType): Boolean = false
  def  <(that: System.Reflection.Emit.OperandType): Boolean = false
  def <=(that: System.Reflection.Emit.OperandType): Boolean = false
  def  >(that: System.Reflection.Emit.OperandType): Boolean = false
  def >=(that: System.Reflection.Emit.OperandType): Boolean = false
  def  |(that: System.Reflection.Emit.OperandType): Boolean = false
  def  &(that: System.Reflection.Emit.OperandType): Boolean = false
  def  ^(that: System.Reflection.Emit.OperandType): Boolean = false
}
object OperandType{
  val InlineBrTarget	 = value(0)
  val InlineField	 = value(1)
  val InlineI	 = value(2)
  val InlineI8	 = value(3)
  val InlineMethod	 = value(4)
  val InlineNone	 = value(5)
  val InlinePhi	 = value(6)
  val InlineR	 = value(7)
  val InlineSig	 = value(9)
  val InlineString	 = value(10)
  val InlineSwitch	 = value(11)
  val InlineTok	 = value(12)
  val InlineType	 = value(13)
  val InlineVar	 = value(14)
  val ShortInlineBrTarget	 = value(15)
  val ShortInlineI	 = value(16)
  val ShortInlineR	 = value(17)
  val ShortInlineVar	 = value(18)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.Emit.OperandType = null
}
 
sealed abstract class FlowControl extends System.Enum {
  def ==(that: System.Reflection.Emit.FlowControl): Boolean = false
  def !=(that: System.Reflection.Emit.FlowControl): Boolean = false
  def  <(that: System.Reflection.Emit.FlowControl): Boolean = false
  def <=(that: System.Reflection.Emit.FlowControl): Boolean = false
  def  >(that: System.Reflection.Emit.FlowControl): Boolean = false
  def >=(that: System.Reflection.Emit.FlowControl): Boolean = false
  def  |(that: System.Reflection.Emit.FlowControl): Boolean = false
  def  &(that: System.Reflection.Emit.FlowControl): Boolean = false
  def  ^(that: System.Reflection.Emit.FlowControl): Boolean = false
}
object FlowControl{
  val Branch	 = value(0)
  val Break	 = value(1)
  val Call	 = value(2)
  val Cond_Branch	 = value(3)
  val Meta	 = value(4)
  val Next	 = value(5)
  val Phi	 = value(6)
  val Return	 = value(7)
  val Throw	 = value(8)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.Emit.FlowControl = null
}
 
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
class ParameterBuilder extends AnyRef with System.Runtime.InteropServices._ParameterBuilder {
  @System.ObsoleteAttribute("An alternate API is available: Emit the MarshalAs custom attribute instead. http://go.microsoft.com/fwlink/?linkid=14202")
  def SetMarshal(unmanagedMarshal : System.Reflection.Emit.UnmanagedMarshal): Unit
   
  def SetConstant(defaultValue : AnyRef): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def SetCustomAttribute(con : System.Reflection.ConstructorInfo, binaryAttribute : Array[UByte]): Unit
   
  def SetCustomAttribute(customBuilder : System.Reflection.Emit.CustomAttributeBuilder): Unit
   
  def GetToken: System.Reflection.Emit.ParameterToken
   
  val Name : String = ""
   
  val Position : Int = 0
   
  val Attributes : Int = 0
   
  val IsIn : Boolean = false
   
  val IsOut : Boolean = false
   
  val IsOptional : Boolean = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ParameterToken extends System.ValueType {
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : System.Reflection.Emit.ParameterToken): Boolean
   
  val Token : Int = 0
}
object ParameterToken {
  def ==(a : System.Reflection.Emit.ParameterToken, 
         b : System.Reflection.Emit.ParameterToken): Boolean  = false
   
  def !=(a : System.Reflection.Emit.ParameterToken, 
         b : System.Reflection.Emit.ParameterToken): Boolean  = false
   
  val Empty : System.Reflection.Emit.ParameterToken  = new System.Reflection.Emit.ParameterToken()
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
sealed class PropertyBuilder extends System.Reflection.PropertyInfo with System.Runtime.InteropServices._PropertyBuilder {
  def SetConstant(defaultValue : AnyRef): Unit
   
  def SetGetMethod(mdBuilder : System.Reflection.Emit.MethodBuilder): Unit
   
  def SetSetMethod(mdBuilder : System.Reflection.Emit.MethodBuilder): Unit
   
  def AddOtherMethod(mdBuilder : System.Reflection.Emit.MethodBuilder): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def SetCustomAttribute(con : System.Reflection.ConstructorInfo, binaryAttribute : Array[UByte]): Unit
   
  def SetCustomAttribute(customBuilder : System.Reflection.Emit.CustomAttributeBuilder): Unit
   
  def GetValue(obj : AnyRef, index : Array[AnyRef]): AnyRef
   
  def GetValue(obj : AnyRef, invokeAttr : System.Reflection.BindingFlags, 
               binder : System.Reflection.Binder, index : Array[AnyRef], 
               culture : System.Globalization.CultureInfo): AnyRef
   
  def SetValue(obj : AnyRef, value : AnyRef, index : Array[AnyRef]): Unit
   
  def SetValue(obj : AnyRef, value : AnyRef, invokeAttr : System.Reflection.BindingFlags, 
               binder : System.Reflection.Binder, index : Array[AnyRef], 
               culture : System.Globalization.CultureInfo): Unit
   
  def GetAccessors(nonPublic : Boolean): Array[System.Reflection.MethodInfo]
   
  def GetGetMethod(nonPublic : Boolean): System.Reflection.MethodInfo
   
  def GetSetMethod(nonPublic : Boolean): System.Reflection.MethodInfo
   
  def GetIndexParameters: Array[System.Reflection.ParameterInfo]
   
  def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  val PropertyToken : System.Reflection.Emit.PropertyToken = new System.Reflection.Emit.PropertyToken()
   
  val Module : System.Reflection.Module = null
   
  val PropertyType : System.Type = null
   
  val Attributes : System.Reflection.PropertyAttributes = System.Reflection.PropertyAttributes.None
   
  val CanRead : Boolean = false
   
  val CanWrite : Boolean = false
   
  val Name : String = ""
   
  val DeclaringType : System.Type = null
   
  val ReflectedType : System.Type = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class PropertyToken extends System.ValueType {
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : System.Reflection.Emit.PropertyToken): Boolean
   
  val Token : Int = 0
}
object PropertyToken {
  def ==(a : System.Reflection.Emit.PropertyToken, b : System.Reflection.Emit.PropertyToken): Boolean  = false
   
  def !=(a : System.Reflection.Emit.PropertyToken, b : System.Reflection.Emit.PropertyToken): Boolean  = false
   
  val Empty : System.Reflection.Emit.PropertyToken  = new System.Reflection.Emit.PropertyToken()
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
sealed class SignatureHelper extends AnyRef with System.Runtime.InteropServices._SignatureHelper {
  def AddArgument(clsArgument : System.Type): Unit
   
  def AddArgument(argument : System.Type, pinned : Boolean): Unit
   
  def AddArguments(arguments : Array[System.Type], 
                   requiredCustomModifiers : Array[Array[System.Type]], 
                   optionalCustomModifiers : Array[Array[System.Type]]): Unit
   
  def AddArgument(argument : System.Type, requiredCustomModifiers : Array[System.Type], 
                  optionalCustomModifiers : Array[System.Type]): Unit
   
  def AddSentinel: Unit
   
  def Equals(obj : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def GetSignature: Array[UByte]
   
  def ToString: String
}
object SignatureHelper {
  def GetMethodSigHelper(mod : System.Reflection.Module, returnType : System.Type, 
                         parameterTypes : Array[System.Type]): System.Reflection.Emit.SignatureHelper  = null
   
  def GetMethodSigHelper(mod : System.Reflection.Module, 
                         callingConvention : System.Reflection.CallingConventions, returnType : System.Type): System.Reflection.Emit.SignatureHelper  = null
   
  def GetMethodSigHelper(mod : System.Reflection.Module, 
                         unmanagedCallConv : System.Runtime.InteropServices.CallingConvention, 
                         returnType : System.Type): System.Reflection.Emit.SignatureHelper  = null
   
  def GetLocalVarSigHelper: System.Reflection.Emit.SignatureHelper  = null
   
  def GetMethodSigHelper(callingConvention : System.Reflection.CallingConventions, returnType : System.Type): System.Reflection.Emit.SignatureHelper  = null
   
  def GetMethodSigHelper(unmanagedCallingConvention : System.Runtime.InteropServices.CallingConvention, 
                         returnType : System.Type): System.Reflection.Emit.SignatureHelper  = null
   
  def GetLocalVarSigHelper(mod : System.Reflection.Module): System.Reflection.Emit.SignatureHelper  = null
   
  def GetFieldSigHelper(mod : System.Reflection.Module): System.Reflection.Emit.SignatureHelper  = null
   
  def GetPropertySigHelper(mod : System.Reflection.Module, returnType : System.Type, 
                           parameterTypes : Array[System.Type]): System.Reflection.Emit.SignatureHelper  = null
   
  def GetPropertySigHelper(mod : System.Reflection.Module, returnType : System.Type, 
                           requiredReturnTypeCustomModifiers : Array[System.Type], 
                           optionalReturnTypeCustomModifiers : Array[System.Type], 
                           parameterTypes : Array[System.Type], 
                           requiredParameterTypeCustomModifiers : Array[Array[System.Type]], 
                           optionalParameterTypeCustomModifiers : Array[Array[System.Type]]): System.Reflection.Emit.SignatureHelper  = null
   
  def GetPropertySigHelper(mod : System.Reflection.Module, 
                           callingConvention : System.Reflection.CallingConventions, returnType : System.Type, 
                           requiredReturnTypeCustomModifiers : Array[System.Type], 
                           optionalReturnTypeCustomModifiers : Array[System.Type], 
                           parameterTypes : Array[System.Type], 
                           requiredParameterTypeCustomModifiers : Array[Array[System.Type]], 
                           optionalParameterTypeCustomModifiers : Array[Array[System.Type]]): System.Reflection.Emit.SignatureHelper  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SignatureToken extends System.ValueType {
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : System.Reflection.Emit.SignatureToken): Boolean
   
  val Token : Int = 0
}
object SignatureToken {
  def ==(a : System.Reflection.Emit.SignatureToken, 
         b : System.Reflection.Emit.SignatureToken): Boolean  = false
   
  def !=(a : System.Reflection.Emit.SignatureToken, 
         b : System.Reflection.Emit.SignatureToken): Boolean  = false
   
  val Empty : System.Reflection.Emit.SignatureToken  = new System.Reflection.Emit.SignatureToken()
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class StringToken extends System.ValueType {
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : System.Reflection.Emit.StringToken): Boolean
   
  val Token : Int = 0
}
object StringToken {
  def ==(a : System.Reflection.Emit.StringToken, b : System.Reflection.Emit.StringToken): Boolean  = false
   
  def !=(a : System.Reflection.Emit.StringToken, b : System.Reflection.Emit.StringToken): Boolean  = false
}
 
sealed abstract class PackingSize extends System.Enum {
  def ==(that: System.Reflection.Emit.PackingSize): Boolean = false
  def !=(that: System.Reflection.Emit.PackingSize): Boolean = false
  def  <(that: System.Reflection.Emit.PackingSize): Boolean = false
  def <=(that: System.Reflection.Emit.PackingSize): Boolean = false
  def  >(that: System.Reflection.Emit.PackingSize): Boolean = false
  def >=(that: System.Reflection.Emit.PackingSize): Boolean = false
  def  |(that: System.Reflection.Emit.PackingSize): Boolean = false
  def  &(that: System.Reflection.Emit.PackingSize): Boolean = false
  def  ^(that: System.Reflection.Emit.PackingSize): Boolean = false
}
object PackingSize{
  val Unspecified	 = value(0)
  val Size1	 = value(1)
  val Size2	 = value(2)
  val Size4	 = value(4)
  val Size8	 = value(8)
  val Size16	 = value(16)
  val Size32	 = value(32)
  val Size64	 = value(64)
  val Size128	 = value(128)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Reflection.Emit.PackingSize = null
}
 
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class TypeBuilder extends System.Type with System.Runtime.InteropServices._TypeBuilder {
  def IsCreated: Boolean
   
  def ToString: String
   
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
   
  def GetNestedTypes(bindingAttr : System.Reflection.BindingFlags): Array[System.Type]
   
  def GetNestedType(name : String, bindingAttr : System.Reflection.BindingFlags): System.Type
   
  def GetMember(name : String, `type` : System.Reflection.MemberTypes, 
                bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MemberInfo]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetInterfaceMap(interfaceType : System.Type): System.Reflection.InterfaceMapping
   
  def GetEvents(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.EventInfo]
   
  def GetMembers(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MemberInfo]
   
  def IsAssignableFrom(c : System.Type): Boolean
   
  protected def GetAttributeFlagsImpl: System.Reflection.TypeAttributes
   
  protected def IsArrayImpl: Boolean
   
  protected def IsByRefImpl: Boolean
   
  protected def IsPointerImpl: Boolean
   
  protected def IsPrimitiveImpl: Boolean
   
  protected def IsCOMObjectImpl: Boolean
   
  def GetElementType: System.Type
   
  protected def HasElementTypeImpl: Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def IsSubclassOf(c : System.Type): Boolean
   
  def MakePointerType: System.Type
   
  def MakeByRefType: System.Type
   
  def MakeArrayType: System.Type
   
  def MakeArrayType(rank : Int): System.Type
   
  def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  def DefineGenericParameters(names : Array[String]): Array[System.Reflection.Emit.GenericTypeParameterBuilder]
   
  def MakeGenericType(typeArguments : Array[System.Type]): System.Type
   
  def GetGenericArguments: Array[System.Type]
   
  def GetGenericTypeDefinition: System.Type
   
  def DefineMethodOverride(methodInfoBody : System.Reflection.MethodInfo, 
                           methodInfoDeclaration : System.Reflection.MethodInfo): Unit
   
  def DefineMethod(name : String, attributes : System.Reflection.MethodAttributes, 
                   returnType : System.Type, parameterTypes : Array[System.Type]): System.Reflection.Emit.MethodBuilder
   
  def DefineMethod(name : String, attributes : System.Reflection.MethodAttributes): System.Reflection.Emit.MethodBuilder
   
  def DefineMethod(name : String, attributes : System.Reflection.MethodAttributes, 
                   callingConvention : System.Reflection.CallingConventions): System.Reflection.Emit.MethodBuilder
   
  def DefineMethod(name : String, attributes : System.Reflection.MethodAttributes, 
                   callingConvention : System.Reflection.CallingConventions, returnType : System.Type, 
                   parameterTypes : Array[System.Type]): System.Reflection.Emit.MethodBuilder
   
  def DefineMethod(name : String, attributes : System.Reflection.MethodAttributes, 
                   callingConvention : System.Reflection.CallingConventions, returnType : System.Type, 
                   returnTypeRequiredCustomModifiers : Array[System.Type], 
                   returnTypeOptionalCustomModifiers : Array[System.Type], 
                   parameterTypes : Array[System.Type], 
                   parameterTypeRequiredCustomModifiers : Array[Array[System.Type]], 
                   parameterTypeOptionalCustomModifiers : Array[Array[System.Type]]): System.Reflection.Emit.MethodBuilder
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def DefineTypeInitializer: System.Reflection.Emit.ConstructorBuilder
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def DefineDefaultConstructor(attributes : System.Reflection.MethodAttributes): System.Reflection.Emit.ConstructorBuilder
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def DefineConstructor(attributes : System.Reflection.MethodAttributes, 
                        callingConvention : System.Reflection.CallingConventions, 
                        parameterTypes : Array[System.Type]): System.Reflection.Emit.ConstructorBuilder
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def DefineConstructor(attributes : System.Reflection.MethodAttributes, 
                        callingConvention : System.Reflection.CallingConventions, 
                        parameterTypes : Array[System.Type], 
                        requiredCustomModifiers : Array[Array[System.Type]], 
                        optionalCustomModifiers : Array[Array[System.Type]]): System.Reflection.Emit.ConstructorBuilder
   
  def DefinePInvokeMethod(name : String, dllName : String, attributes : System.Reflection.MethodAttributes, 
                          callingConvention : System.Reflection.CallingConventions, returnType : System.Type, 
                          parameterTypes : Array[System.Type], 
                          nativeCallConv : System.Runtime.InteropServices.CallingConvention, 
                          nativeCharSet : System.Runtime.InteropServices.CharSet): System.Reflection.Emit.MethodBuilder
   
  def DefinePInvokeMethod(name : String, dllName : String, entryName : String, 
                          attributes : System.Reflection.MethodAttributes, 
                          callingConvention : System.Reflection.CallingConventions, returnType : System.Type, 
                          parameterTypes : Array[System.Type], 
                          nativeCallConv : System.Runtime.InteropServices.CallingConvention, 
                          nativeCharSet : System.Runtime.InteropServices.CharSet): System.Reflection.Emit.MethodBuilder
   
  def DefinePInvokeMethod(name : String, dllName : String, entryName : String, 
                          attributes : System.Reflection.MethodAttributes, 
                          callingConvention : System.Reflection.CallingConventions, returnType : System.Type, 
                          returnTypeRequiredCustomModifiers : Array[System.Type], 
                          returnTypeOptionalCustomModifiers : Array[System.Type], 
                          parameterTypes : Array[System.Type], 
                          parameterTypeRequiredCustomModifiers : Array[Array[System.Type]], 
                          parameterTypeOptionalCustomModifiers : Array[Array[System.Type]], 
                          nativeCallConv : System.Runtime.InteropServices.CallingConvention, 
                          nativeCharSet : System.Runtime.InteropServices.CharSet): System.Reflection.Emit.MethodBuilder
   
  def DefineNestedType(name : String): System.Reflection.Emit.TypeBuilder
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def DefineNestedType(name : String, attr : System.Reflection.TypeAttributes, parent : System.Type, 
                       interfaces : Array[System.Type]): System.Reflection.Emit.TypeBuilder
   
  def DefineNestedType(name : String, attr : System.Reflection.TypeAttributes, parent : System.Type): System.Reflection.Emit.TypeBuilder
   
  def DefineNestedType(name : String, attr : System.Reflection.TypeAttributes): System.Reflection.Emit.TypeBuilder
   
  def DefineNestedType(name : String, attr : System.Reflection.TypeAttributes, parent : System.Type, 
                       typeSize : Int): System.Reflection.Emit.TypeBuilder
   
  def DefineNestedType(name : String, attr : System.Reflection.TypeAttributes, parent : System.Type, 
                       packSize : System.Reflection.Emit.PackingSize): System.Reflection.Emit.TypeBuilder
   
  def DefineField(fieldName : String, `type` : System.Type, 
                  attributes : System.Reflection.FieldAttributes): System.Reflection.Emit.FieldBuilder
   
  def DefineField(fieldName : String, `type` : System.Type, 
                  requiredCustomModifiers : Array[System.Type], 
                  optionalCustomModifiers : Array[System.Type], 
                  attributes : System.Reflection.FieldAttributes): System.Reflection.Emit.FieldBuilder
   
  def DefineInitializedData(name : String, data : Array[UByte], attributes : System.Reflection.FieldAttributes): System.Reflection.Emit.FieldBuilder
   
  def DefineUninitializedData(name : String, size : Int, attributes : System.Reflection.FieldAttributes): System.Reflection.Emit.FieldBuilder
   
  def DefineProperty(name : String, attributes : System.Reflection.PropertyAttributes, 
                     returnType : System.Type, parameterTypes : Array[System.Type]): System.Reflection.Emit.PropertyBuilder
   
  def DefineProperty(name : String, attributes : System.Reflection.PropertyAttributes, 
                     returnType : System.Type, returnTypeRequiredCustomModifiers : Array[System.Type], 
                     returnTypeOptionalCustomModifiers : Array[System.Type], 
                     parameterTypes : Array[System.Type], 
                     parameterTypeRequiredCustomModifiers : Array[Array[System.Type]], 
                     parameterTypeOptionalCustomModifiers : Array[Array[System.Type]]): System.Reflection.Emit.PropertyBuilder
   
  def DefineProperty(name : String, attributes : System.Reflection.PropertyAttributes, 
                     callingConvention : System.Reflection.CallingConventions, returnType : System.Type, 
                     returnTypeRequiredCustomModifiers : Array[System.Type], 
                     returnTypeOptionalCustomModifiers : Array[System.Type], 
                     parameterTypes : Array[System.Type], 
                     parameterTypeRequiredCustomModifiers : Array[Array[System.Type]], 
                     parameterTypeOptionalCustomModifiers : Array[Array[System.Type]]): System.Reflection.Emit.PropertyBuilder
   
  def DefineEvent(name : String, attributes : System.Reflection.EventAttributes, 
                  eventtype : System.Type): System.Reflection.Emit.EventBuilder
   
  def CreateType: System.Type
   
  def SetParent(parent : System.Type): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def AddInterfaceImplementation(interfaceType : System.Type): Unit
   
  def AddDeclarativeSecurity(action : System.Security.Permissions.SecurityAction, 
                             pset : System.Security.PermissionSet): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def SetCustomAttribute(con : System.Reflection.ConstructorInfo, binaryAttribute : Array[UByte]): Unit
   
  def SetCustomAttribute(customBuilder : System.Reflection.Emit.CustomAttributeBuilder): Unit
   
  val DeclaringType : System.Type = null
   
  val ReflectedType : System.Type = null
   
  val Name : String = ""
   
  val Module : System.Reflection.Module = null
   
  val GUID : System.Guid = new System.Guid()
   
  val Assembly : System.Reflection.Assembly = null
   
  val TypeHandle : System.RuntimeTypeHandle = new System.RuntimeTypeHandle()
   
  val FullName : String = ""
   
  val Namespace : String = ""
   
  val AssemblyQualifiedName : String = ""
   
  val BaseType : System.Type = null
   
  val UnderlyingSystemType : System.Type = null
   
  val GenericParameterAttributes : System.Reflection.GenericParameterAttributes = System.Reflection.GenericParameterAttributes.None
   
  val IsGenericTypeDefinition : Boolean = false
   
  val IsGenericType : Boolean = false
   
  val IsGenericParameter : Boolean = false
   
  val GenericParameterPosition : Int = 0
   
  val DeclaringMethod : System.Reflection.MethodBase = null
   
  val Size : Int = 0
   
  val PackingSize : System.Reflection.Emit.PackingSize = System.Reflection.Emit.PackingSize.Unspecified
   
  val TypeToken : System.Reflection.Emit.TypeToken = new System.Reflection.Emit.TypeToken()
}
object TypeBuilder {
  def GetMethod(`type` : System.Type, method : System.Reflection.MethodInfo): System.Reflection.MethodInfo  = null
   
  def GetConstructor(`type` : System.Type, constructor : System.Reflection.ConstructorInfo): System.Reflection.ConstructorInfo  = null
   
  def GetField(`type` : System.Type, field : System.Reflection.FieldInfo): System.Reflection.FieldInfo  = null
   
  val UnspecifiedTypeSize : Int  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class GenericTypeParameterBuilder extends System.Type {
  def ToString: String
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def MakePointerType: System.Type
   
  def MakeByRefType: System.Type
   
  def MakeArrayType: System.Type
   
  def MakeArrayType(rank : Int): System.Type
   
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
   
  def GetNestedTypes(bindingAttr : System.Reflection.BindingFlags): Array[System.Type]
   
  def GetNestedType(name : String, bindingAttr : System.Reflection.BindingFlags): System.Type
   
  def GetMember(name : String, `type` : System.Reflection.MemberTypes, 
                bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MemberInfo]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetInterfaceMap(interfaceType : System.Type): System.Reflection.InterfaceMapping
   
  def GetEvents(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.EventInfo]
   
  def GetMembers(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MemberInfo]
   
  protected def GetAttributeFlagsImpl: System.Reflection.TypeAttributes
   
  protected def IsArrayImpl: Boolean
   
  protected def IsByRefImpl: Boolean
   
  protected def IsPointerImpl: Boolean
   
  protected def IsPrimitiveImpl: Boolean
   
  protected def IsCOMObjectImpl: Boolean
   
  def GetElementType: System.Type
   
  protected def HasElementTypeImpl: Boolean
   
  def GetGenericArguments: Array[System.Type]
   
  def GetGenericTypeDefinition: System.Type
   
  def MakeGenericType(typeArguments : Array[System.Type]): System.Type
   
  protected def IsValueTypeImpl: Boolean
   
  def IsAssignableFrom(c : System.Type): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def IsSubclassOf(c : System.Type): Boolean
   
  def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  def SetCustomAttribute(con : System.Reflection.ConstructorInfo, binaryAttribute : Array[UByte]): Unit
   
  def SetCustomAttribute(customBuilder : System.Reflection.Emit.CustomAttributeBuilder): Unit
   
  def SetBaseTypeConstraint(baseTypeConstraint : System.Type): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def SetInterfaceConstraints(interfaceConstraints : Array[System.Type]): Unit
   
  def SetGenericParameterAttributes(genericParameterAttributes : System.Reflection.GenericParameterAttributes): Unit
   
  val DeclaringType : System.Type = null
   
  val ReflectedType : System.Type = null
   
  val Name : String = ""
   
  val Module : System.Reflection.Module = null
   
  val GUID : System.Guid = new System.Guid()
   
  val Assembly : System.Reflection.Assembly = null
   
  val TypeHandle : System.RuntimeTypeHandle = new System.RuntimeTypeHandle()
   
  val FullName : String = ""
   
  val Namespace : String = ""
   
  val AssemblyQualifiedName : String = ""
   
  val BaseType : System.Type = null
   
  val UnderlyingSystemType : System.Type = null
   
  val IsGenericTypeDefinition : Boolean = false
   
  val IsGenericType : Boolean = false
   
  val IsGenericParameter : Boolean = false
   
  val GenericParameterPosition : Int = 0
   
  val ContainsGenericParameters : Boolean = false
   
  val DeclaringMethod : System.Reflection.MethodBase = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
sealed class EnumBuilder extends System.Type with System.Runtime.InteropServices._EnumBuilder {
  def DefineLiteral(literalName : String, literalValue : AnyRef): System.Reflection.Emit.FieldBuilder
   
  def CreateType: System.Type
   
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
   
  def GetNestedTypes(bindingAttr : System.Reflection.BindingFlags): Array[System.Type]
   
  def GetNestedType(name : String, bindingAttr : System.Reflection.BindingFlags): System.Type
   
  def GetMember(name : String, `type` : System.Reflection.MemberTypes, 
                bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MemberInfo]
   
  def GetMembers(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MemberInfo]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetInterfaceMap(interfaceType : System.Type): System.Reflection.InterfaceMapping
   
  def GetEvents(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.EventInfo]
   
  protected def GetAttributeFlagsImpl: System.Reflection.TypeAttributes
   
  protected def IsArrayImpl: Boolean
   
  protected def IsPrimitiveImpl: Boolean
   
  protected def IsValueTypeImpl: Boolean
   
  protected def IsByRefImpl: Boolean
   
  protected def IsPointerImpl: Boolean
   
  protected def IsCOMObjectImpl: Boolean
   
  def GetElementType: System.Type
   
  protected def HasElementTypeImpl: Boolean
   
  def GetCustomAttributes(inherit : Boolean): Array[AnyRef]
   
  def GetCustomAttributes(attributeType : System.Type, inherit : Boolean): Array[AnyRef]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def SetCustomAttribute(con : System.Reflection.ConstructorInfo, binaryAttribute : Array[UByte]): Unit
   
  def SetCustomAttribute(customBuilder : System.Reflection.Emit.CustomAttributeBuilder): Unit
   
  def IsDefined(attributeType : System.Type, inherit : Boolean): Boolean
   
  def MakePointerType: System.Type
   
  def MakeByRefType: System.Type
   
  def MakeArrayType: System.Type
   
  def MakeArrayType(rank : Int): System.Type
   
  val TypeToken : System.Reflection.Emit.TypeToken = new System.Reflection.Emit.TypeToken()
   
  val UnderlyingField : System.Reflection.Emit.FieldBuilder = null
   
  val Name : String = ""
   
  val GUID : System.Guid = new System.Guid()
   
  val Module : System.Reflection.Module = null
   
  val Assembly : System.Reflection.Assembly = null
   
  val TypeHandle : System.RuntimeTypeHandle = new System.RuntimeTypeHandle()
   
  val FullName : String = ""
   
  val AssemblyQualifiedName : String = ""
   
  val Namespace : String = ""
   
  val BaseType : System.Type = null
   
  val UnderlyingSystemType : System.Type = null
   
  val DeclaringType : System.Type = null
   
  val ReflectedType : System.Type = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class TypeToken extends System.ValueType {
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : System.Reflection.Emit.TypeToken): Boolean
   
  val Token : Int = 0
}
object TypeToken {
  def ==(a : System.Reflection.Emit.TypeToken, b : System.Reflection.Emit.TypeToken): Boolean  = false
   
  def !=(a : System.Reflection.Emit.TypeToken, b : System.Reflection.Emit.TypeToken): Boolean  = false
   
  val Empty : System.Reflection.Emit.TypeToken  = new System.Reflection.Emit.TypeToken()
}
 
@System.ObsoleteAttribute("An alternate API is available: Emit the MarshalAs custom attribute instead. http://go.microsoft.com/fwlink/?linkid=14202")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class UnmanagedMarshal extends AnyRef {
  val GetUnmanagedType : System.Runtime.InteropServices.UnmanagedType = System.Runtime.InteropServices.UnmanagedType.Bool
   
  val IIDGuid : System.Guid = new System.Guid()
   
  val ElementCount : Int = 0
   
  val BaseType : System.Runtime.InteropServices.UnmanagedType = System.Runtime.InteropServices.UnmanagedType.Bool
}
object UnmanagedMarshal {
  def DefineUnmanagedMarshal(unmanagedType : System.Runtime.InteropServices.UnmanagedType): System.Reflection.Emit.UnmanagedMarshal  = null
   
  def DefineByValTStr(elemCount : Int): System.Reflection.Emit.UnmanagedMarshal  = null
   
  def DefineSafeArray(elemType : System.Runtime.InteropServices.UnmanagedType): System.Reflection.Emit.UnmanagedMarshal  = null
   
  def DefineByValArray(elemCount : Int): System.Reflection.Emit.UnmanagedMarshal  = null
   
  def DefineLPArray(elemType : System.Runtime.InteropServices.UnmanagedType): System.Reflection.Emit.UnmanagedMarshal  = null
}
 
}