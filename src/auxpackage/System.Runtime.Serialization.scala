 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.Serialization {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISerializable {
  /* abstract */ def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                                   context : System.Runtime.Serialization.StreamingContext): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IDeserializationCallback {
  /* abstract */ def OnDeserialization(sender : AnyRef): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IObjectReference {
  /* abstract */ def GetRealObject(context : System.Runtime.Serialization.StreamingContext): AnyRef
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IFormatter {
  /* abstract */ def Deserialize(serializationStream : System.IO.Stream): AnyRef
   
  /* abstract */ def Serialize(serializationStream : System.IO.Stream, graph : AnyRef): Unit
   
  var SurrogateSelector : System.Runtime.Serialization.ISurrogateSelector = null
   
  var Binder : System.Runtime.Serialization.SerializationBinder = null
   
  var Context : System.Runtime.Serialization.StreamingContext = new System.Runtime.Serialization.StreamingContext()
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.CLSCompliantAttribute(false)
abstract class Formatter extends AnyRef with System.Runtime.Serialization.IFormatter {
  /* abstract */ def Deserialize(serializationStream : System.IO.Stream): AnyRef
   
  protected def GetNext(objID : CLRByRef[Long]): AnyRef
   
  protected def Schedule(obj : AnyRef): Long
   
  /* abstract */ def Serialize(serializationStream : System.IO.Stream, graph : AnyRef): Unit
   
  protected /* abstract */ def WriteArray(obj : AnyRef, name : String, memberType : System.Type): Unit
   
  protected /* abstract */ def WriteBoolean(`val` : Boolean, name : String): Unit
   
  protected /* abstract */ def WriteByte(`val` : UByte, name : String): Unit
   
  protected /* abstract */ def WriteChar(`val` : Char, name : String): Unit
   
  protected /* abstract */ def WriteDateTime(`val` : System.DateTime, name : String): Unit
   
  protected /* abstract */ def WriteDecimal(`val` : System.Decimal, name : String): Unit
   
  protected /* abstract */ def WriteDouble(`val` : Double, name : String): Unit
   
  protected /* abstract */ def WriteInt16(`val` : Short, name : String): Unit
   
  protected /* abstract */ def WriteInt32(`val` : Int, name : String): Unit
   
  protected /* abstract */ def WriteInt64(`val` : Long, name : String): Unit
   
  protected /* abstract */ def WriteObjectRef(obj : AnyRef, name : String, memberType : System.Type): Unit
   
  protected def WriteMember(memberName : String, data : AnyRef): Unit
   
  @System.CLSCompliantAttribute(false)
  protected /* abstract */ def WriteSByte(`val` : Byte, name : String): Unit
   
  protected /* abstract */ def WriteSingle(`val` : Float, name : String): Unit
   
  protected /* abstract */ def WriteTimeSpan(`val` : System.TimeSpan, name : String): Unit
   
  @System.CLSCompliantAttribute(false)
  protected /* abstract */ def WriteUInt16(`val` : UShort, name : String): Unit
   
  @System.CLSCompliantAttribute(false)
  protected /* abstract */ def WriteUInt32(`val` : UInt, name : String): Unit
   
  @System.CLSCompliantAttribute(false)
  protected /* abstract */ def WriteUInt64(`val` : ULong, name : String): Unit
   
  protected /* abstract */ def WriteValueType(obj : AnyRef, name : String, memberType : System.Type): Unit
   
  protected var m_idGenerator : System.Runtime.Serialization.ObjectIDGenerator
   
  protected var m_objectQueue : System.Collections.Queue
   
  var SurrogateSelector : System.Runtime.Serialization.ISurrogateSelector = null
   
  var Binder : System.Runtime.Serialization.SerializationBinder = null
   
  var Context : System.Runtime.Serialization.StreamingContext = new System.Runtime.Serialization.StreamingContext()
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.CLSCompliantAttribute(false)
trait IFormatterConverter {
  /* abstract */ def Convert(value : AnyRef, `type` : System.Type): AnyRef
   
  /* abstract */ def Convert(value : AnyRef, typeCode : System.TypeCode): AnyRef
   
  /* abstract */ def ToBoolean(value : AnyRef): Boolean
   
  /* abstract */ def ToChar(value : AnyRef): Char
   
  /* abstract */ def ToSByte(value : AnyRef): Byte
   
  /* abstract */ def ToByte(value : AnyRef): UByte
   
  /* abstract */ def ToInt16(value : AnyRef): Short
   
  /* abstract */ def ToUInt16(value : AnyRef): UShort
   
  /* abstract */ def ToInt32(value : AnyRef): Int
   
  /* abstract */ def ToUInt32(value : AnyRef): UInt
   
  /* abstract */ def ToInt64(value : AnyRef): Long
   
  /* abstract */ def ToUInt64(value : AnyRef): ULong
   
  /* abstract */ def ToSingle(value : AnyRef): Float
   
  /* abstract */ def ToDouble(value : AnyRef): Double
   
  /* abstract */ def ToDecimal(value : AnyRef): System.Decimal
   
  /* abstract */ def ToDateTime(value : AnyRef): System.DateTime
   
  /* abstract */ def ToString(value : AnyRef): String
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class FormatterConverter extends AnyRef with System.Runtime.Serialization.IFormatterConverter {
  def Convert(value : AnyRef, `type` : System.Type): AnyRef
   
  def Convert(value : AnyRef, typeCode : System.TypeCode): AnyRef
   
  def ToBoolean(value : AnyRef): Boolean
   
  def ToChar(value : AnyRef): Char
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : AnyRef): Byte
   
  def ToByte(value : AnyRef): UByte
   
  def ToInt16(value : AnyRef): Short
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : AnyRef): UShort
   
  def ToInt32(value : AnyRef): Int
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : AnyRef): UInt
   
  def ToInt64(value : AnyRef): Long
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : AnyRef): ULong
   
  def ToSingle(value : AnyRef): Float
   
  def ToDouble(value : AnyRef): Double
   
  def ToDecimal(value : AnyRef): System.Decimal
   
  def ToDateTime(value : AnyRef): System.DateTime
   
  def ToString(value : AnyRef): String
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class FormatterServices extends AnyRef 
object FormatterServices {
  def GetSerializableMembers(`type` : System.Type): Array[System.Reflection.MemberInfo]  = Array.empty[System.Reflection.MemberInfo]
   
  def GetSerializableMembers(`type` : System.Type, context : System.Runtime.Serialization.StreamingContext): Array[System.Reflection.MemberInfo]  = Array.empty[System.Reflection.MemberInfo]
   
  def CheckTypeSecurity(t : System.Type, 
                        securityLevel : System.Runtime.Serialization.Formatters.TypeFilterLevel): Unit  = {}
   
  def GetUninitializedObject(`type` : System.Type): AnyRef  = null
   
  def GetSafeUninitializedObject(`type` : System.Type): AnyRef  = null
   
  def PopulateObjectMembers(obj : AnyRef, members : Array[System.Reflection.MemberInfo], data : Array[AnyRef]): AnyRef  = null
   
  def GetObjectData(obj : AnyRef, members : Array[System.Reflection.MemberInfo]): Array[AnyRef]  = Array.empty[AnyRef]
   
  def GetSurrogateForCyclicalReference(innerSurrogate : System.Runtime.Serialization.ISerializationSurrogate): System.Runtime.Serialization.ISerializationSurrogate  = null
   
  def GetTypeFromAssembly(assem : System.Reflection.Assembly, name : String): System.Type  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISerializationSurrogate {
  /* abstract */ def GetObjectData(obj : AnyRef, info : System.Runtime.Serialization.SerializationInfo, 
                                   context : System.Runtime.Serialization.StreamingContext): Unit
   
  /* abstract */ def SetObjectData(obj : AnyRef, info : System.Runtime.Serialization.SerializationInfo, 
                                   context : System.Runtime.Serialization.StreamingContext, 
                                   selector : System.Runtime.Serialization.ISurrogateSelector): AnyRef
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISurrogateSelector {
  /* abstract */ def ChainSelector(selector : System.Runtime.Serialization.ISurrogateSelector): Unit
   
  /* abstract */ def GetNextSelector: System.Runtime.Serialization.ISurrogateSelector
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ObjectIDGenerator extends AnyRef {
  def GetId(obj : AnyRef, firstTime : CLRByRef[Boolean]): Long
   
  def HasId(obj : AnyRef, firstTime : CLRByRef[Boolean]): Long
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ObjectManager extends AnyRef {
  def GetObject(objectID : Long): AnyRef
   
  def RegisterObject(obj : AnyRef, objectID : Long): Unit
   
  def RegisterObject(obj : AnyRef, objectID : Long, info : System.Runtime.Serialization.SerializationInfo): Unit
   
  def RegisterObject(obj : AnyRef, objectID : Long, info : System.Runtime.Serialization.SerializationInfo, 
                     idOfContainingObj : Long, member : System.Reflection.MemberInfo): Unit
   
  def RegisterObject(obj : AnyRef, objectID : Long, info : System.Runtime.Serialization.SerializationInfo, 
                     idOfContainingObj : Long, member : System.Reflection.MemberInfo, 
                     arrayIndex : Array[Int]): Unit
   
  def DoFixups: Unit
   
  def RecordFixup(objectToBeFixed : Long, member : System.Reflection.MemberInfo, objectRequired : Long): Unit
   
  def RecordDelayedFixup(objectToBeFixed : Long, memberName : String, objectRequired : Long): Unit
   
  def RecordArrayElementFixup(arrayToBeFixed : Long, index : Int, objectRequired : Long): Unit
   
  def RecordArrayElementFixup(arrayToBeFixed : Long, indices : Array[Int], objectRequired : Long): Unit
   
  def RaiseDeserializationEvent: Unit
   
  def RaiseOnDeserializingEvent(obj : AnyRef): Unit
   
  def this(selector : System.Runtime.Serialization.ISurrogateSelector, 
           context : System.Runtime.Serialization.StreamingContext) {}
}
 
sealed class SerializationObjectManager extends AnyRef {
  def RegisterObject(obj : AnyRef): Unit
   
  def RaiseOnSerializedEvent: Unit
   
  def this(context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.AttributeUsageAttribute(256 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class OptionalFieldAttribute extends System.Attribute {
  var VersionAdded : Int = 0
   
  def this() {}
}
 
@System.AttributeUsageAttribute(64 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class OnSerializingAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(64 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class OnSerializedAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(64 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class OnDeserializingAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(64 /* Inherited = false */ )
sealed class OnDeserializedAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class SerializationBinder extends AnyRef {
  /* abstract */ def BindToType(assemblyName : String, typeName : String): System.Type
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SerializationInfo extends AnyRef {
  def SetType(`type` : System.Type): Unit
   
  def GetEnumerator: System.Runtime.Serialization.SerializationInfoEnumerator
   
  def AddValue(name : String, value : AnyRef, `type` : System.Type): Unit
   
  def AddValue(name : String, value : AnyRef): Unit
   
  def AddValue(name : String, value : Boolean): Unit
   
  def AddValue(name : String, value : Char): Unit
   
  @System.CLSCompliantAttribute(false)
  def AddValue(name : String, value : Byte): Unit
   
  def AddValue(name : String, value : UByte): Unit
   
  def AddValue(name : String, value : Short): Unit
   
  @System.CLSCompliantAttribute(false)
  def AddValue(name : String, value : UShort): Unit
   
  def AddValue(name : String, value : Int): Unit
   
  @System.CLSCompliantAttribute(false)
  def AddValue(name : String, value : UInt): Unit
   
  def AddValue(name : String, value : Long): Unit
   
  @System.CLSCompliantAttribute(false)
  def AddValue(name : String, value : ULong): Unit
   
  def AddValue(name : String, value : Float): Unit
   
  def AddValue(name : String, value : Double): Unit
   
  def AddValue(name : String, value : System.Decimal): Unit
   
  def AddValue(name : String, value : System.DateTime): Unit
   
  def GetValue(name : String, `type` : System.Type): AnyRef
   
  def GetBoolean(name : String): Boolean
   
  def GetChar(name : String): Char
   
  @System.CLSCompliantAttribute(false)
  def GetSByte(name : String): Byte
   
  def GetByte(name : String): UByte
   
  def GetInt16(name : String): Short
   
  @System.CLSCompliantAttribute(false)
  def GetUInt16(name : String): UShort
   
  def GetInt32(name : String): Int
   
  @System.CLSCompliantAttribute(false)
  def GetUInt32(name : String): UInt
   
  def GetInt64(name : String): Long
   
  @System.CLSCompliantAttribute(false)
  def GetUInt64(name : String): ULong
   
  def GetSingle(name : String): Float
   
  def GetDouble(name : String): Double
   
  def GetDecimal(name : String): System.Decimal
   
  def GetDateTime(name : String): System.DateTime
   
  def GetString(name : String): String
   
  var FullTypeName : String = ""
   
  var AssemblyName : String = ""
   
  val MemberCount : Int = 0
   
  @System.CLSCompliantAttribute(false)
  def this(`type` : System.Type, converter : System.Runtime.Serialization.IFormatterConverter) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SerializationEntry extends System.ValueType {
  val Value : AnyRef = null
   
  val Name : String = ""
   
  val ObjectType : System.Type = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SerializationInfoEnumerator extends AnyRef with System.Collections.IEnumerator {
  def MoveNext: Boolean
   
  def Reset: Unit
   
  val Current : System.Runtime.Serialization.SerializationEntry = new System.Runtime.Serialization.SerializationEntry()
   
  val Name : String = ""
   
  val Value : AnyRef = null
   
  val ObjectType : System.Type = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SerializationException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class StreamingContext extends System.ValueType {
  def Equals(obj : AnyRef): Boolean
   
  def GetHashCode: Int
   
  val Context : AnyRef = null
   
  val State : System.Runtime.Serialization.StreamingContextStates = System.Runtime.Serialization.StreamingContextStates.CrossProcess
   
  def this(state : System.Runtime.Serialization.StreamingContextStates) {}
   
  def this(state : System.Runtime.Serialization.StreamingContextStates, additional : AnyRef) {}
}
 
sealed abstract class StreamingContextStates extends System.Enum {
  def ==(that: System.Runtime.Serialization.StreamingContextStates): Boolean = false
  def !=(that: System.Runtime.Serialization.StreamingContextStates): Boolean = false
  def  <(that: System.Runtime.Serialization.StreamingContextStates): Boolean = false
  def <=(that: System.Runtime.Serialization.StreamingContextStates): Boolean = false
  def  >(that: System.Runtime.Serialization.StreamingContextStates): Boolean = false
  def >=(that: System.Runtime.Serialization.StreamingContextStates): Boolean = false
  def  |(that: System.Runtime.Serialization.StreamingContextStates): Boolean = false
  def  &(that: System.Runtime.Serialization.StreamingContextStates): Boolean = false
  def  ^(that: System.Runtime.Serialization.StreamingContextStates): Boolean = false
}
object StreamingContextStates{
  val CrossProcess	 = value(1)
  val CrossMachine	 = value(2)
  val File	 = value(4)
  val Persistence	 = value(8)
  val Remoting	 = value(16)
  val Other	 = value(32)
  val Clone	 = value(64)
  val CrossAppDomain	 = value(128)
  val All	 = value(255)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.Serialization.StreamingContextStates = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SurrogateSelector extends AnyRef with System.Runtime.Serialization.ISurrogateSelector {
  def AddSurrogate(`type` : System.Type, context : System.Runtime.Serialization.StreamingContext, 
                   surrogate : System.Runtime.Serialization.ISerializationSurrogate): Unit
   
  def ChainSelector(selector : System.Runtime.Serialization.ISurrogateSelector): Unit
   
  def GetNextSelector: System.Runtime.Serialization.ISurrogateSelector
   
  def RemoveSurrogate(`type` : System.Type, context : System.Runtime.Serialization.StreamingContext): Unit
   
  def this() {}
}
 
}