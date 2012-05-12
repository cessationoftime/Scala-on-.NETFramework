 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.Remoting {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("C460E2B4-E199-412a-8456-84DC3E4838C3")
trait IObjectHandle {
  /* abstract */ def Unwrap: AnyRef
}
 
sealed abstract class WellKnownObjectMode extends System.Enum {
  def ==(that: System.Runtime.Remoting.WellKnownObjectMode): Boolean = false
  def !=(that: System.Runtime.Remoting.WellKnownObjectMode): Boolean = false
  def  <(that: System.Runtime.Remoting.WellKnownObjectMode): Boolean = false
  def <=(that: System.Runtime.Remoting.WellKnownObjectMode): Boolean = false
  def  >(that: System.Runtime.Remoting.WellKnownObjectMode): Boolean = false
  def >=(that: System.Runtime.Remoting.WellKnownObjectMode): Boolean = false
  def  |(that: System.Runtime.Remoting.WellKnownObjectMode): Boolean = false
  def  &(that: System.Runtime.Remoting.WellKnownObjectMode): Boolean = false
  def  ^(that: System.Runtime.Remoting.WellKnownObjectMode): Boolean = false
}
object WellKnownObjectMode{
  val Singleton	 = value(1)
  val SingleCall	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.Remoting.WellKnownObjectMode = null
}
 
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.AutoDual)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ObjectHandle extends System.MarshalByRefObject with System.Runtime.Remoting.IObjectHandle {
  def Unwrap: AnyRef
   
  def InitializeLifetimeService: AnyRef
   
  def this(o : AnyRef) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IRemotingTypeInfo {
  /* abstract */ def CanCastTo(fromType : System.Type, o : AnyRef): Boolean
   
  var TypeName : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IChannelInfo {
  var ChannelData : Array[AnyRef] = Array.empty[AnyRef]
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IEnvoyInfo {
  var EnvoySinks : System.Runtime.Remoting.Messaging.IMessageSink = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ObjRef extends AnyRef with System.Runtime.Serialization.IObjectReference with 
                     System.Runtime.Serialization.ISerializable {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  def GetRealObject(context : System.Runtime.Serialization.StreamingContext): AnyRef
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def IsFromThisProcess: Boolean
   
  def IsFromThisAppDomain: Boolean
   
  var URI : String = ""
   
  var TypeInfo : System.Runtime.Remoting.IRemotingTypeInfo = null
   
  var EnvoyInfo : System.Runtime.Remoting.IEnvoyInfo = null
   
  var ChannelInfo : System.Runtime.Remoting.IChannelInfo = null
   
  def this(o : System.MarshalByRefObject, requestedType : System.Type) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract sealed class RemotingConfiguration extends AnyRef 
object RemotingConfiguration {
  @System.ObsoleteAttribute("Use System.Runtime.Remoting.RemotingConfiguration.Configure(string fileName, bool ensureSecurity) instead.", false)
  def Configure(filename : String): Unit  = {}
   
  def Configure(filename : String, ensureSecurity : Boolean): Unit  = {}
   
  def CustomErrorsEnabled(isLocalRequest : Boolean): Boolean  = false
   
  def RegisterActivatedServiceType(`type` : System.Type): Unit  = {}
   
  def RegisterActivatedServiceType(entry : System.Runtime.Remoting.ActivatedServiceTypeEntry): Unit  = {}
   
  def RegisterWellKnownServiceType(`type` : System.Type, objectUri : String, 
                                   mode : System.Runtime.Remoting.WellKnownObjectMode): Unit  = {}
   
  def RegisterWellKnownServiceType(entry : System.Runtime.Remoting.WellKnownServiceTypeEntry): Unit  = {}
   
  def RegisterActivatedClientType(`type` : System.Type, appUrl : String): Unit  = {}
   
  def RegisterActivatedClientType(entry : System.Runtime.Remoting.ActivatedClientTypeEntry): Unit  = {}
   
  def RegisterWellKnownClientType(`type` : System.Type, objectUrl : String): Unit  = {}
   
  def RegisterWellKnownClientType(entry : System.Runtime.Remoting.WellKnownClientTypeEntry): Unit  = {}
   
  def GetRegisteredActivatedServiceTypes: Array[System.Runtime.Remoting.ActivatedServiceTypeEntry]  = Array.empty[System.Runtime.Remoting.ActivatedServiceTypeEntry]
   
  def GetRegisteredWellKnownServiceTypes: Array[System.Runtime.Remoting.WellKnownServiceTypeEntry]  = Array.empty[System.Runtime.Remoting.WellKnownServiceTypeEntry]
   
  def GetRegisteredActivatedClientTypes: Array[System.Runtime.Remoting.ActivatedClientTypeEntry]  = Array.empty[System.Runtime.Remoting.ActivatedClientTypeEntry]
   
  def GetRegisteredWellKnownClientTypes: Array[System.Runtime.Remoting.WellKnownClientTypeEntry]  = Array.empty[System.Runtime.Remoting.WellKnownClientTypeEntry]
   
  def IsRemotelyActivatedClientType(svrType : System.Type): System.Runtime.Remoting.ActivatedClientTypeEntry  = null
   
  def IsRemotelyActivatedClientType(typeName : String, assemblyName : String): System.Runtime.Remoting.ActivatedClientTypeEntry  = null
   
  def IsWellKnownClientType(svrType : System.Type): System.Runtime.Remoting.WellKnownClientTypeEntry  = null
   
  def IsWellKnownClientType(typeName : String, assemblyName : String): System.Runtime.Remoting.WellKnownClientTypeEntry  = null
   
  def IsActivationAllowed(svrType : System.Type): Boolean  = false
   
  var ApplicationName : String = ""
   
  val ApplicationId : String = ""
   
  val ProcessId : String = ""
   
  var CustomErrorsMode : System.Runtime.Remoting.CustomErrorsModes = System.Runtime.Remoting.CustomErrorsModes.On
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class TypeEntry extends AnyRef {
  var TypeName : String = ""
   
  var AssemblyName : String = ""
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ActivatedClientTypeEntry extends System.Runtime.Remoting.TypeEntry {
  def ToString: String
   
  val ApplicationUrl : String = ""
   
  val ObjectType : System.Type = null
   
  var ContextAttributes : Array[System.Runtime.Remoting.Contexts.IContextAttribute] = Array.empty[System.Runtime.Remoting.Contexts.IContextAttribute]
   
  def this(typeName : String, assemblyName : String, appUrl : String) {}
   
  def this(`type` : System.Type, appUrl : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ActivatedServiceTypeEntry extends System.Runtime.Remoting.TypeEntry {
  def ToString: String
   
  val ObjectType : System.Type = null
   
  var ContextAttributes : Array[System.Runtime.Remoting.Contexts.IContextAttribute] = Array.empty[System.Runtime.Remoting.Contexts.IContextAttribute]
   
  def this(typeName : String, assemblyName : String) {}
   
  def this(`type` : System.Type) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class WellKnownClientTypeEntry extends System.Runtime.Remoting.TypeEntry {
  def ToString: String
   
  val ObjectUrl : String = ""
   
  val ObjectType : System.Type = null
   
  var ApplicationUrl : String = ""
   
  def this(typeName : String, assemblyName : String, objectUrl : String) {}
   
  def this(`type` : System.Type, objectUrl : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class WellKnownServiceTypeEntry extends System.Runtime.Remoting.TypeEntry {
  def ToString: String
   
  val ObjectUri : String = ""
   
  val Mode : System.Runtime.Remoting.WellKnownObjectMode = System.Runtime.Remoting.WellKnownObjectMode.Singleton
   
  val ObjectType : System.Type = null
   
  var ContextAttributes : Array[System.Runtime.Remoting.Contexts.IContextAttribute] = Array.empty[System.Runtime.Remoting.Contexts.IContextAttribute]
   
  def this(typeName : String, assemblyName : String, objectUri : String, 
           mode : System.Runtime.Remoting.WellKnownObjectMode) {}
   
  def this(`type` : System.Type, objectUri : String, 
           mode : System.Runtime.Remoting.WellKnownObjectMode) {}
}
 
sealed abstract class CustomErrorsModes extends System.Enum {
  def ==(that: System.Runtime.Remoting.CustomErrorsModes): Boolean = false
  def !=(that: System.Runtime.Remoting.CustomErrorsModes): Boolean = false
  def  <(that: System.Runtime.Remoting.CustomErrorsModes): Boolean = false
  def <=(that: System.Runtime.Remoting.CustomErrorsModes): Boolean = false
  def  >(that: System.Runtime.Remoting.CustomErrorsModes): Boolean = false
  def >=(that: System.Runtime.Remoting.CustomErrorsModes): Boolean = false
  def  |(that: System.Runtime.Remoting.CustomErrorsModes): Boolean = false
  def  &(that: System.Runtime.Remoting.CustomErrorsModes): Boolean = false
  def  ^(that: System.Runtime.Remoting.CustomErrorsModes): Boolean = false
}
object CustomErrorsModes{
  val On	 = value(0)
  val Off	 = value(1)
  val RemoteOnly	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.Remoting.CustomErrorsModes = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class RemotingException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, InnerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ServerException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, InnerException : System.Exception) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class RemotingTimeoutException extends System.Runtime.Remoting.RemotingException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, InnerException : System.Exception) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class RemotingServices extends AnyRef 
object RemotingServices {
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def IsTransparentProxy(proxy : AnyRef): Boolean  = false
   
  def IsObjectOutOfContext(tp : AnyRef): Boolean  = false
   
  def IsObjectOutOfAppDomain(tp : AnyRef): Boolean  = false
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def GetRealProxy(proxy : AnyRef): System.Runtime.Remoting.Proxies.RealProxy  = null
   
  def GetSessionIdForMethodMessage(msg : System.Runtime.Remoting.Messaging.IMethodMessage): String  = ""
   
  def GetLifetimeService(obj : System.MarshalByRefObject): AnyRef  = null
   
  def GetObjectUri(obj : System.MarshalByRefObject): String  = ""
   
  def SetObjectUriForMarshal(obj : System.MarshalByRefObject, uri : String): Unit  = {}
   
  def Marshal(Obj : System.MarshalByRefObject): System.Runtime.Remoting.ObjRef  = null
   
  def Marshal(Obj : System.MarshalByRefObject, URI : String): System.Runtime.Remoting.ObjRef  = null
   
  def Marshal(Obj : System.MarshalByRefObject, ObjURI : String, RequestedType : System.Type): System.Runtime.Remoting.ObjRef  = null
   
  def GetObjectData(obj : AnyRef, info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit  = {}
   
  def Unmarshal(objectRef : System.Runtime.Remoting.ObjRef): AnyRef  = null
   
  def Unmarshal(objectRef : System.Runtime.Remoting.ObjRef, fRefine : Boolean): AnyRef  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def Connect(classToProxy : System.Type, url : String): AnyRef  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def Connect(classToProxy : System.Type, url : String, data : AnyRef): AnyRef  = null
   
  def Disconnect(obj : System.MarshalByRefObject): Boolean  = false
   
  def GetEnvoyChainForProxy(obj : System.MarshalByRefObject): System.Runtime.Remoting.Messaging.IMessageSink  = null
   
  def GetObjRefForProxy(obj : System.MarshalByRefObject): System.Runtime.Remoting.ObjRef  = null
   
  def GetMethodBaseFromMethodMessage(msg : System.Runtime.Remoting.Messaging.IMethodMessage): System.Reflection.MethodBase  = null
   
  def IsMethodOverloaded(msg : System.Runtime.Remoting.Messaging.IMethodMessage): Boolean  = false
   
  def IsOneWay(method : System.Reflection.MethodBase): Boolean  = false
   
  def GetServerTypeForUri(URI : String): System.Type  = null
   
  def ExecuteMessage(target : System.MarshalByRefObject, 
                     reqMsg : System.Runtime.Remoting.Messaging.IMethodCallMessage): System.Runtime.Remoting.Messaging.IMethodReturnMessage  = null
   
  @System.Diagnostics.ConditionalAttribute("REMOTING_PERF")
  @System.ObsoleteAttribute("Use of this method is not recommended. The LogRemotingStage existed for internal diagnostic purposes only.")
  def LogRemotingStage(stage : Int): Unit  = {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class InternalRemotingServices extends AnyRef {
  def this() {}
}
object InternalRemotingServices {
  @System.Diagnostics.ConditionalAttribute("_LOGGING")
  def DebugOutChnl(s : String): Unit  = {}
   
  @System.Diagnostics.ConditionalAttribute("_LOGGING")
  def RemotingTrace(messages : Array[AnyRef]): Unit  = {}
   
  @System.Diagnostics.ConditionalAttribute("_DEBUG")
  def RemotingAssert(condition : Boolean, message : String): Unit  = {}
   
  @System.CLSCompliantAttribute(false)
  def SetServerIdentity(m : System.Runtime.Remoting.Messaging.MethodCall, srvID : AnyRef): Unit  = {}
   
  def GetCachedSoapAttribute(reflectionObject : AnyRef): System.Runtime.Remoting.Metadata.SoapAttribute  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SoapServices extends AnyRef 
object SoapServices {
  def RegisterInteropXmlElement(xmlElement : String, xmlNamespace : String, `type` : System.Type): Unit  = {}
   
  def RegisterInteropXmlType(xmlType : String, xmlTypeNamespace : String, `type` : System.Type): Unit  = {}
   
  def PreLoad(`type` : System.Type): Unit  = {}
   
  def PreLoad(assembly : System.Reflection.Assembly): Unit  = {}
   
  def GetInteropTypeFromXmlElement(xmlElement : String, xmlNamespace : String): System.Type  = null
   
  def GetInteropTypeFromXmlType(xmlType : String, xmlTypeNamespace : String): System.Type  = null
   
  def GetXmlNamespaceForMethodCall(mb : System.Reflection.MethodBase): String  = ""
   
  def GetXmlNamespaceForMethodResponse(mb : System.Reflection.MethodBase): String  = ""
   
  def RegisterSoapActionForMethodBase(mb : System.Reflection.MethodBase): Unit  = {}
   
  def RegisterSoapActionForMethodBase(mb : System.Reflection.MethodBase, soapAction : String): Unit  = {}
   
  def GetSoapActionFromMethodBase(mb : System.Reflection.MethodBase): String  = ""
   
  def IsSoapActionValidForMethodBase(soapAction : String, mb : System.Reflection.MethodBase): Boolean  = false
   
  def IsClrTypeNamespace(namespaceString : String): Boolean  = false
   
  def CodeXmlNamespaceForClrTypeNamespace(typeNamespace : String, assemblyName : String): String  = ""
   
  val XmlNsForClrType : String = ""
   
  val XmlNsForClrTypeWithAssembly : String = ""
   
  val XmlNsForClrTypeWithNs : String = ""
   
  val XmlNsForClrTypeWithNsAndAssembly : String = ""
}
 
}