 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.Serialization.Formatters {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IFieldInfo {
  var FieldNames : Array[String] = Array.empty[String]
   
  var FieldTypes : Array[System.Type] = Array.empty[System.Type]
}
 
sealed abstract class FormatterTypeStyle extends System.Enum {
  def ==(that: System.Runtime.Serialization.Formatters.FormatterTypeStyle): Boolean = false
  def !=(that: System.Runtime.Serialization.Formatters.FormatterTypeStyle): Boolean = false
  def  <(that: System.Runtime.Serialization.Formatters.FormatterTypeStyle): Boolean = false
  def <=(that: System.Runtime.Serialization.Formatters.FormatterTypeStyle): Boolean = false
  def  >(that: System.Runtime.Serialization.Formatters.FormatterTypeStyle): Boolean = false
  def >=(that: System.Runtime.Serialization.Formatters.FormatterTypeStyle): Boolean = false
  def  |(that: System.Runtime.Serialization.Formatters.FormatterTypeStyle): Boolean = false
  def  &(that: System.Runtime.Serialization.Formatters.FormatterTypeStyle): Boolean = false
  def  ^(that: System.Runtime.Serialization.Formatters.FormatterTypeStyle): Boolean = false
}
object FormatterTypeStyle{
  val TypesWhenNeeded	 = value(0)
  val TypesAlways	 = value(1)
  val XsdString	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.Serialization.Formatters.FormatterTypeStyle = null
}
 
sealed abstract class FormatterAssemblyStyle extends System.Enum {
  def ==(that: System.Runtime.Serialization.Formatters.FormatterAssemblyStyle): Boolean = false
  def !=(that: System.Runtime.Serialization.Formatters.FormatterAssemblyStyle): Boolean = false
  def  <(that: System.Runtime.Serialization.Formatters.FormatterAssemblyStyle): Boolean = false
  def <=(that: System.Runtime.Serialization.Formatters.FormatterAssemblyStyle): Boolean = false
  def  >(that: System.Runtime.Serialization.Formatters.FormatterAssemblyStyle): Boolean = false
  def >=(that: System.Runtime.Serialization.Formatters.FormatterAssemblyStyle): Boolean = false
  def  |(that: System.Runtime.Serialization.Formatters.FormatterAssemblyStyle): Boolean = false
  def  &(that: System.Runtime.Serialization.Formatters.FormatterAssemblyStyle): Boolean = false
  def  ^(that: System.Runtime.Serialization.Formatters.FormatterAssemblyStyle): Boolean = false
}
object FormatterAssemblyStyle{
  val Simple	 = value(0)
  val Full	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.Serialization.Formatters.FormatterAssemblyStyle = null
}
 
sealed abstract class TypeFilterLevel extends System.Enum {
  def ==(that: System.Runtime.Serialization.Formatters.TypeFilterLevel): Boolean = false
  def !=(that: System.Runtime.Serialization.Formatters.TypeFilterLevel): Boolean = false
  def  <(that: System.Runtime.Serialization.Formatters.TypeFilterLevel): Boolean = false
  def <=(that: System.Runtime.Serialization.Formatters.TypeFilterLevel): Boolean = false
  def  >(that: System.Runtime.Serialization.Formatters.TypeFilterLevel): Boolean = false
  def >=(that: System.Runtime.Serialization.Formatters.TypeFilterLevel): Boolean = false
  def  |(that: System.Runtime.Serialization.Formatters.TypeFilterLevel): Boolean = false
  def  &(that: System.Runtime.Serialization.Formatters.TypeFilterLevel): Boolean = false
  def  ^(that: System.Runtime.Serialization.Formatters.TypeFilterLevel): Boolean = false
}
object TypeFilterLevel{
  val Low	 = value(2)
  val Full	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.Serialization.Formatters.TypeFilterLevel = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISoapMessage {
  var ParamNames : Array[String] = Array.empty[String]
   
  var ParamValues : Array[AnyRef] = Array.empty[AnyRef]
   
  var ParamTypes : Array[System.Type] = Array.empty[System.Type]
   
  var MethodName : String = ""
   
  var XmlNameSpace : String = ""
   
  var Headers : Array[System.Runtime.Remoting.Messaging.Header] = Array.empty[System.Runtime.Remoting.Messaging.Header]
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class InternalRM extends AnyRef {
  def this() {}
}
object InternalRM {
  @System.Diagnostics.ConditionalAttribute("_LOGGING")
  def InfoSoap(messages : Array[AnyRef]): Unit  = {}
   
  def SoapCheckEnabled: Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class InternalST extends AnyRef 
object InternalST {
  @System.Diagnostics.ConditionalAttribute("_LOGGING")
  def InfoSoap(messages : Array[AnyRef]): Unit  = {}
   
  def SoapCheckEnabled: Boolean  = false
   
  @System.Diagnostics.ConditionalAttribute("SER_LOGGING")
  def Soap(messages : Array[AnyRef]): Unit  = {}
   
  @System.Diagnostics.ConditionalAttribute("_DEBUG")
  def SoapAssert(condition : Boolean, message : String): Unit  = {}
   
  def SerializationSetValue(fi : System.Reflection.FieldInfo, target : AnyRef, value : AnyRef): Unit  = {}
   
  def LoadAssemblyFromString(assemblyString : String): System.Reflection.Assembly  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SoapMessage extends AnyRef with System.Runtime.Serialization.Formatters.ISoapMessage {
  var ParamNames : Array[String] = Array.empty[String]
   
  var ParamValues : Array[AnyRef] = Array.empty[AnyRef]
   
  var ParamTypes : Array[System.Type] = Array.empty[System.Type]
   
  var MethodName : String = ""
   
  var XmlNameSpace : String = ""
   
  var Headers : Array[System.Runtime.Remoting.Messaging.Header] = Array.empty[System.Runtime.Remoting.Messaging.Header]
   
  def this() {}
}
 
@System.Runtime.Remoting.Metadata.SoapTypeAttribute( /* Embedded = true */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapFault extends AnyRef with System.Runtime.Serialization.ISerializable {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  var FaultCode : String = ""
   
  var FaultString : String = ""
   
  var FaultActor : String = ""
   
  var Detail : AnyRef = null
   
  def this() {}
   
  def this(faultCode : String, faultString : String, faultActor : String, 
           serverFault : System.Runtime.Serialization.Formatters.ServerFault) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.Remoting.Metadata.SoapTypeAttribute( /* Embedded = true */ )
sealed class ServerFault extends AnyRef {
  var ExceptionType : String = ""
   
  var ExceptionMessage : String = ""
   
  var StackTrace : String = ""
   
  def this(exceptionType : String, message : String, stackTrace : String) {}
}
 
}