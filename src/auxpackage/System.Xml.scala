 /* assembly: System.Xml, Version=2.0.5.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\System.Xml.dll */ 
 
import auxPackage.auxiliary._
 
package System.Xml {
 
sealed abstract class ConformanceLevel extends System.Enum {
  def ==(that: System.Xml.ConformanceLevel): Boolean = false
  def !=(that: System.Xml.ConformanceLevel): Boolean = false
  def  <(that: System.Xml.ConformanceLevel): Boolean = false
  def <=(that: System.Xml.ConformanceLevel): Boolean = false
  def  >(that: System.Xml.ConformanceLevel): Boolean = false
  def >=(that: System.Xml.ConformanceLevel): Boolean = false
  def  |(that: System.Xml.ConformanceLevel): Boolean = false
  def  &(that: System.Xml.ConformanceLevel): Boolean = false
  def  ^(that: System.Xml.ConformanceLevel): Boolean = false
}
object ConformanceLevel{
  val Auto	 = value(0)
  val Document	 = value(2)
  val Fragment	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Xml.ConformanceLevel = null
}
 
sealed abstract class DtdProcessing extends System.Enum {
  def ==(that: System.Xml.DtdProcessing): Boolean = false
  def !=(that: System.Xml.DtdProcessing): Boolean = false
  def  <(that: System.Xml.DtdProcessing): Boolean = false
  def <=(that: System.Xml.DtdProcessing): Boolean = false
  def  >(that: System.Xml.DtdProcessing): Boolean = false
  def >=(that: System.Xml.DtdProcessing): Boolean = false
  def  |(that: System.Xml.DtdProcessing): Boolean = false
  def  &(that: System.Xml.DtdProcessing): Boolean = false
  def  ^(that: System.Xml.DtdProcessing): Boolean = false
}
object DtdProcessing{
  val Ignore	 = value(1)
  val Prohibit	 = value(0)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Xml.DtdProcessing = null
}
 
trait IXmlLineInfo {
  /* abstract */ def HasLineInfo: Boolean
   
  val LineNumber : Int = 0
   
  val LinePosition : Int = 0
}
 
trait IXmlNamespaceResolver {
  /* abstract */ def GetNamespacesInScope(scope : System.Xml.XmlNamespaceScope): System.Collections.Generic.IDictionary[String, String]
   
  /* abstract */ def LookupNamespace(prefix : String): String
   
  /* abstract */ def LookupPrefix(namespaceName : String): String
}
 
sealed abstract class NamespaceHandling extends System.Enum {
  def ==(that: System.Xml.NamespaceHandling): Boolean = false
  def !=(that: System.Xml.NamespaceHandling): Boolean = false
  def  <(that: System.Xml.NamespaceHandling): Boolean = false
  def <=(that: System.Xml.NamespaceHandling): Boolean = false
  def  >(that: System.Xml.NamespaceHandling): Boolean = false
  def >=(that: System.Xml.NamespaceHandling): Boolean = false
  def  |(that: System.Xml.NamespaceHandling): Boolean = false
  def  &(that: System.Xml.NamespaceHandling): Boolean = false
  def  ^(that: System.Xml.NamespaceHandling): Boolean = false
}
object NamespaceHandling{
  val Default	 = value(0)
  val OmitDuplicates	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Xml.NamespaceHandling = null
}
 
abstract class XmlNameTable extends AnyRef {
  /* abstract */ def Add(array : Array[Char], offset : Int, length : Int): String
   
  /* abstract */ def Add(array : String): String
   
  /* abstract */ def Get(array : Array[Char], offset : Int, length : Int): String
   
  /* abstract */ def Get(array : String): String
   
  protected def this() {}
}
 
class NameTable extends System.Xml.XmlNameTable {
  def Add(key : Array[Char], start : Int, len : Int): String
   
  def Add(key : String): String
   
  def Get(key : Array[Char], start : Int, len : Int): String
   
  def Get(value : String): String
   
  def this() {}
}
 
sealed abstract class NewLineHandling extends System.Enum {
  def ==(that: System.Xml.NewLineHandling): Boolean = false
  def !=(that: System.Xml.NewLineHandling): Boolean = false
  def  <(that: System.Xml.NewLineHandling): Boolean = false
  def <=(that: System.Xml.NewLineHandling): Boolean = false
  def  >(that: System.Xml.NewLineHandling): Boolean = false
  def >=(that: System.Xml.NewLineHandling): Boolean = false
  def  |(that: System.Xml.NewLineHandling): Boolean = false
  def  &(that: System.Xml.NewLineHandling): Boolean = false
  def  ^(that: System.Xml.NewLineHandling): Boolean = false
}
object NewLineHandling{
  val Entitize	 = value(1)
  val None	 = value(2)
  val Replace	 = value(0)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Xml.NewLineHandling = null
}
 
sealed abstract class ReadState extends System.Enum {
  def ==(that: System.Xml.ReadState): Boolean = false
  def !=(that: System.Xml.ReadState): Boolean = false
  def  <(that: System.Xml.ReadState): Boolean = false
  def <=(that: System.Xml.ReadState): Boolean = false
  def  >(that: System.Xml.ReadState): Boolean = false
  def >=(that: System.Xml.ReadState): Boolean = false
  def  |(that: System.Xml.ReadState): Boolean = false
  def  &(that: System.Xml.ReadState): Boolean = false
  def  ^(that: System.Xml.ReadState): Boolean = false
}
object ReadState{
  val Closed	 = value(4)
  val EndOfFile	 = value(3)
  val Error	 = value(2)
  val Initial	 = value(0)
  val Interactive	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Xml.ReadState = null
}
 
sealed abstract class WriteState extends System.Enum {
  def ==(that: System.Xml.WriteState): Boolean = false
  def !=(that: System.Xml.WriteState): Boolean = false
  def  <(that: System.Xml.WriteState): Boolean = false
  def <=(that: System.Xml.WriteState): Boolean = false
  def  >(that: System.Xml.WriteState): Boolean = false
  def >=(that: System.Xml.WriteState): Boolean = false
  def  |(that: System.Xml.WriteState): Boolean = false
  def  &(that: System.Xml.WriteState): Boolean = false
  def  ^(that: System.Xml.WriteState): Boolean = false
}
object WriteState{
  val Attribute	 = value(3)
  val Closed	 = value(5)
  val Content	 = value(4)
  val Element	 = value(2)
  val Error	 = value(6)
  val Prolog	 = value(1)
  val Start	 = value(0)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Xml.WriteState = null
}
 
abstract sealed class XmlConvert extends AnyRef 
object XmlConvert {
  def DecodeName(name : String): String  = ""
   
  def EncodeLocalName(name : String): String  = ""
   
  def EncodeName(name : String): String  = ""
   
  def EncodeNmToken(name : String): String  = ""
   
  def ToBoolean(s : String): Boolean  = false
   
  def ToByte(s : String): UByte  = 0
   
  def ToChar(s : String): Char  = '0'
   
  def ToDateTimeOffset(s : String): System.DateTimeOffset  = new System.DateTimeOffset()
   
  def ToDateTimeOffset(s : String, format : String): System.DateTimeOffset  = new System.DateTimeOffset()
   
  def ToDateTimeOffset(s : String, formats : Array[String]): System.DateTimeOffset  = new System.DateTimeOffset()
   
  def ToDecimal(s : String): System.Decimal  = new System.Decimal()
   
  def ToDouble(s : String): Double  = 0
   
  def ToGuid(s : String): System.Guid  = new System.Guid()
   
  def ToInt16(s : String): Short  = 0
   
  def ToInt32(s : String): Int  = 0
   
  def ToInt64(s : String): Long  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(s : String): Byte  = 0
   
  def ToSingle(s : String): Float  = 0
   
  def ToString(value : Boolean): String  = ""
   
  def ToString(value : Char): String  = ""
   
  def ToString(value : System.DateTimeOffset): String  = ""
   
  def ToString(value : System.DateTimeOffset, format : String): String  = ""
   
  def ToString(value : System.Decimal): String  = ""
   
  def ToString(value : Double): String  = ""
   
  def ToString(value : System.Guid): String  = ""
   
  def ToString(value : Short): String  = ""
   
  def ToString(value : Int): String  = ""
   
  def ToString(value : Long): String  = ""
   
  @System.CLSCompliantAttribute(false)
  def ToString(value : Byte): String  = ""
   
  def ToString(value : Float): String  = ""
   
  def ToString(value : System.TimeSpan): String  = ""
   
  @System.CLSCompliantAttribute(false)
  def ToString(value : UInt): String  = ""
   
  @System.CLSCompliantAttribute(false)
  def ToString(value : ULong): String  = ""
   
  def ToTimeSpan(s : String): System.TimeSpan  = new System.TimeSpan()
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(s : String): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(s : String): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(s : String): ULong  = 0
   
  def VerifyName(name : String): String  = ""
   
  def VerifyNCName(name : String): String  = ""
   
  def VerifyNMTOKEN(name : String): String  = ""
   
  def VerifyPublicId(publicId : String): String  = ""
   
  def VerifyWhitespace(content : String): String  = ""
   
  def VerifyXmlChars(content : String): String  = ""
}
 
class XmlException extends System.Exception {
  val LineNumber : Int = 0
   
  val LinePosition : Int = 0
   
  val Message : String = ""
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  def this(message : String, innerException : System.Exception, lineNumber : Int, 
           linePosition : Int) {}
}
 
class XmlNamespaceManager extends AnyRef with System.Collections.IEnumerable with System.Xml.IXmlNamespaceResolver {
  def AddNamespace(prefix : String, uri : String): Unit
   
  def GetEnumerator: System.Collections.IEnumerator
   
  def GetNamespacesInScope(scope : System.Xml.XmlNamespaceScope): System.Collections.Generic.IDictionary[String, String]
   
  def HasNamespace(prefix : String): Boolean
   
  def LookupNamespace(prefix : String): String
   
  def LookupPrefix(uri : String): String
   
  def PopScope: Boolean
   
  def PushScope: Unit
   
  def RemoveNamespace(prefix : String, uri : String): Unit
   
  val DefaultNamespace : String = ""
   
  val NameTable : System.Xml.XmlNameTable = null
   
  def this(nameTable : System.Xml.XmlNameTable) {}
}
 
sealed abstract class XmlNamespaceScope extends System.Enum {
  def ==(that: System.Xml.XmlNamespaceScope): Boolean = false
  def !=(that: System.Xml.XmlNamespaceScope): Boolean = false
  def  <(that: System.Xml.XmlNamespaceScope): Boolean = false
  def <=(that: System.Xml.XmlNamespaceScope): Boolean = false
  def  >(that: System.Xml.XmlNamespaceScope): Boolean = false
  def >=(that: System.Xml.XmlNamespaceScope): Boolean = false
  def  |(that: System.Xml.XmlNamespaceScope): Boolean = false
  def  &(that: System.Xml.XmlNamespaceScope): Boolean = false
  def  ^(that: System.Xml.XmlNamespaceScope): Boolean = false
}
object XmlNamespaceScope{
  val All	 = value(0)
  val ExcludeXml	 = value(1)
  val Local	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Xml.XmlNamespaceScope = null
}
 
sealed abstract class XmlNodeType extends System.Enum {
  def ==(that: System.Xml.XmlNodeType): Boolean = false
  def !=(that: System.Xml.XmlNodeType): Boolean = false
  def  <(that: System.Xml.XmlNodeType): Boolean = false
  def <=(that: System.Xml.XmlNodeType): Boolean = false
  def  >(that: System.Xml.XmlNodeType): Boolean = false
  def >=(that: System.Xml.XmlNodeType): Boolean = false
  def  |(that: System.Xml.XmlNodeType): Boolean = false
  def  &(that: System.Xml.XmlNodeType): Boolean = false
  def  ^(that: System.Xml.XmlNodeType): Boolean = false
}
object XmlNodeType{
  val Attribute	 = value(2)
  val CDATA	 = value(4)
  val Comment	 = value(8)
  val Document	 = value(9)
  val DocumentFragment	 = value(11)
  val DocumentType	 = value(10)
  val Element	 = value(1)
  val EndElement	 = value(15)
  val EndEntity	 = value(16)
  val Entity	 = value(6)
  val EntityReference	 = value(5)
  val None	 = value(0)
  val Notation	 = value(12)
  val ProcessingInstruction	 = value(7)
  val SignificantWhitespace	 = value(14)
  val Text	 = value(3)
  val Whitespace	 = value(13)
  val XmlDeclaration	 = value(17)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Xml.XmlNodeType = null
}
 
class XmlParserContext extends AnyRef {
  var BaseURI : String = ""
   
  var DocTypeName : String = ""
   
  var Encoding : System.Text.Encoding = null
   
  var InternalSubset : String = ""
   
  var NamespaceManager : System.Xml.XmlNamespaceManager = null
   
  var NameTable : System.Xml.XmlNameTable = null
   
  var PublicId : String = ""
   
  var SystemId : String = ""
   
  var XmlLang : String = ""
   
  var XmlSpace : System.Xml.XmlSpace = System.Xml.XmlSpace.Default
   
  def this(nt : System.Xml.XmlNameTable, nsMgr : System.Xml.XmlNamespaceManager, 
           docTypeName : String, pubId : String, sysId : String, internalSubset : String, 
           baseURI : String, xmlLang : String, xmlSpace : System.Xml.XmlSpace) {}
   
  def this(nt : System.Xml.XmlNameTable, nsMgr : System.Xml.XmlNamespaceManager, 
           docTypeName : String, pubId : String, sysId : String, internalSubset : String, 
           baseURI : String, xmlLang : String, xmlSpace : System.Xml.XmlSpace, 
           enc : System.Text.Encoding) {}
   
  def this(nt : System.Xml.XmlNameTable, nsMgr : System.Xml.XmlNamespaceManager, 
           xmlLang : String, xmlSpace : System.Xml.XmlSpace) {}
   
  def this(nt : System.Xml.XmlNameTable, nsMgr : System.Xml.XmlNamespaceManager, 
           xmlLang : String, xmlSpace : System.Xml.XmlSpace, enc : System.Text.Encoding) {}
}
 
class XmlQualifiedName extends AnyRef {
  def Equals(other : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  val IsEmpty : Boolean = false
   
  val Name : String = ""
   
  val Namespace : String = ""
   
  def this() {}
   
  def this(name : String) {}
   
  def this(name : String, ns : String) {}
}
object XmlQualifiedName {
  def ==(a : System.Xml.XmlQualifiedName, b : System.Xml.XmlQualifiedName): Boolean  = false
   
  def !=(a : System.Xml.XmlQualifiedName, b : System.Xml.XmlQualifiedName): Boolean  = false
   
  def ToString(name : String, ns : String): String  = ""
   
  val Empty : System.Xml.XmlQualifiedName  = null
}
 
@System.Reflection.DefaultMemberAttribute("Item")
abstract class XmlReader extends AnyRef with System.IDisposable {
  def Dispose: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  /* abstract */ def GetAttribute(i : Int): String
   
  /* abstract */ def GetAttribute(name : String): String
   
  /* abstract */ def GetAttribute(name : String, namespaceURI : String): String
   
  def IsStartElement: Boolean
   
  def IsStartElement(name : String): Boolean
   
  def IsStartElement(localname : String, ns : String): Boolean
   
  /* abstract */ def LookupNamespace(prefix : String): String
   
  def MoveToAttribute(i : Int): Unit
   
  /* abstract */ def MoveToAttribute(name : String): Boolean
   
  /* abstract */ def MoveToAttribute(name : String, ns : String): Boolean
   
  def MoveToContent: System.Xml.XmlNodeType
   
  /* abstract */ def MoveToElement: Boolean
   
  /* abstract */ def MoveToFirstAttribute: Boolean
   
  /* abstract */ def MoveToNextAttribute: Boolean
   
  /* abstract */ def Read: Boolean
   
  /* abstract */ def ReadAttributeValue: Boolean
   
  def ReadContentAs(returnType : System.Type, namespaceResolver : System.Xml.IXmlNamespaceResolver): AnyRef
   
  def ReadContentAsBase64(buffer : Array[UByte], index : Int, count : Int): Int
   
  def ReadContentAsBinHex(buffer : Array[UByte], index : Int, count : Int): Int
   
  def ReadContentAsBoolean: Boolean
   
  def ReadContentAsDecimal: System.Decimal
   
  def ReadContentAsDouble: Double
   
  def ReadContentAsFloat: Float
   
  def ReadContentAsInt: Int
   
  def ReadContentAsLong: Long
   
  def ReadContentAsObject: AnyRef
   
  def ReadContentAsString: String
   
  def ReadElementContentAs(returnType : System.Type, namespaceResolver : System.Xml.IXmlNamespaceResolver): AnyRef
   
  def ReadElementContentAs(returnType : System.Type, namespaceResolver : System.Xml.IXmlNamespaceResolver, 
                           localName : String, namespaceURI : String): AnyRef
   
  def ReadElementContentAsBase64(buffer : Array[UByte], index : Int, count : Int): Int
   
  def ReadElementContentAsBinHex(buffer : Array[UByte], index : Int, count : Int): Int
   
  def ReadElementContentAsBoolean: Boolean
   
  def ReadElementContentAsBoolean(localName : String, namespaceURI : String): Boolean
   
  def ReadElementContentAsDecimal: System.Decimal
   
  def ReadElementContentAsDecimal(localName : String, namespaceURI : String): System.Decimal
   
  def ReadElementContentAsDouble: Double
   
  def ReadElementContentAsDouble(localName : String, namespaceURI : String): Double
   
  def ReadElementContentAsFloat: Float
   
  def ReadElementContentAsFloat(localName : String, namespaceURI : String): Float
   
  def ReadElementContentAsInt: Int
   
  def ReadElementContentAsInt(localName : String, namespaceURI : String): Int
   
  def ReadElementContentAsLong: Long
   
  def ReadElementContentAsLong(localName : String, namespaceURI : String): Long
   
  def ReadElementContentAsObject: AnyRef
   
  def ReadElementContentAsObject(localName : String, namespaceURI : String): AnyRef
   
  def ReadElementContentAsString: String
   
  def ReadElementContentAsString(localName : String, namespaceURI : String): String
   
  def ReadEndElement: Unit
   
  def ReadInnerXml: String
   
  def ReadOuterXml: String
   
  def ReadStartElement: Unit
   
  def ReadStartElement(name : String): Unit
   
  def ReadStartElement(localname : String, ns : String): Unit
   
  def ReadSubtree: System.Xml.XmlReader
   
  def ReadToDescendant(name : String): Boolean
   
  def ReadToDescendant(localName : String, namespaceURI : String): Boolean
   
  def ReadToFollowing(name : String): Boolean
   
  def ReadToFollowing(localName : String, namespaceURI : String): Boolean
   
  def ReadToNextSibling(name : String): Boolean
   
  def ReadToNextSibling(localName : String, namespaceURI : String): Boolean
   
  def ReadValueChunk(buffer : Array[Char], index : Int, count : Int): Int
   
  /* abstract */ def ResolveEntity: Unit
   
  def Skip: Unit
   
  val AttributeCount : Int = 0
   
  val BaseURI : String = ""
   
  val CanReadBinaryContent : Boolean = false
   
  val CanReadValueChunk : Boolean = false
   
  val CanResolveEntity : Boolean = false
   
  val Depth : Int = 0
   
  val EOF : Boolean = false
   
  val HasAttributes : Boolean = false
   
  val HasValue : Boolean = false
   
  val IsDefault : Boolean = false
   
  val IsEmptyElement : Boolean = false
   
  /* parameterful property Item */
  def Item(i : Int): String
   
  /* parameterful property Item */
  def Item(name : String): String
   
  /* parameterful property Item */
  def Item(name : String, namespaceURI : String): String
   
  val LocalName : String = ""
   
  val Name : String = ""
   
  val NamespaceURI : String = ""
   
  val NameTable : System.Xml.XmlNameTable = null
   
  val NodeType : System.Xml.XmlNodeType = System.Xml.XmlNodeType.Attribute
   
  val Prefix : String = ""
   
  val ReadState : System.Xml.ReadState = System.Xml.ReadState.Closed
   
  val Settings : System.Xml.XmlReaderSettings = null
   
  val Value : String = ""
   
  val ValueType : System.Type = null
   
  val XmlLang : String = ""
   
  val XmlSpace : System.Xml.XmlSpace = System.Xml.XmlSpace.Default
   
  protected def this() {}
}
object XmlReader {
  def Create(input : System.IO.Stream): System.Xml.XmlReader  = null
   
  def Create(input : System.IO.Stream, settings : System.Xml.XmlReaderSettings): System.Xml.XmlReader  = null
   
  def Create(input : System.IO.Stream, settings : System.Xml.XmlReaderSettings, 
             inputContext : System.Xml.XmlParserContext): System.Xml.XmlReader  = null
   
  def Create(input : System.IO.TextReader): System.Xml.XmlReader  = null
   
  def Create(input : System.IO.TextReader, settings : System.Xml.XmlReaderSettings): System.Xml.XmlReader  = null
   
  def Create(input : System.IO.TextReader, settings : System.Xml.XmlReaderSettings, 
             inputContext : System.Xml.XmlParserContext): System.Xml.XmlReader  = null
   
  def Create(reader : System.Xml.XmlReader, settings : System.Xml.XmlReaderSettings): System.Xml.XmlReader  = null
   
  def IsName(str : String): Boolean  = false
   
  def IsNameToken(str : String): Boolean  = false
}
 
sealed class XmlReaderSettings extends AnyRef {
  def Clone: System.Xml.XmlReaderSettings
   
  def Reset: Unit
   
  var CheckCharacters : Boolean = false
   
  var CloseInput : Boolean = false
   
  var ConformanceLevel : System.Xml.ConformanceLevel = System.Xml.ConformanceLevel.Auto
   
  var DtdProcessing : System.Xml.DtdProcessing = System.Xml.DtdProcessing.Ignore
   
  var IgnoreComments : Boolean = false
   
  var IgnoreProcessingInstructions : Boolean = false
   
  var IgnoreWhitespace : Boolean = false
   
  var LineNumberOffset : Int = 0
   
  var LinePositionOffset : Int = 0
   
  var MaxCharactersFromEntities : Long = 0
   
  var MaxCharactersInDocument : Long = 0
   
  var NameTable : System.Xml.XmlNameTable = null
   
  def this() {}
}
 
sealed abstract class XmlSpace extends System.Enum {
  def ==(that: System.Xml.XmlSpace): Boolean = false
  def !=(that: System.Xml.XmlSpace): Boolean = false
  def  <(that: System.Xml.XmlSpace): Boolean = false
  def <=(that: System.Xml.XmlSpace): Boolean = false
  def  >(that: System.Xml.XmlSpace): Boolean = false
  def >=(that: System.Xml.XmlSpace): Boolean = false
  def  |(that: System.Xml.XmlSpace): Boolean = false
  def  &(that: System.Xml.XmlSpace): Boolean = false
  def  ^(that: System.Xml.XmlSpace): Boolean = false
}
object XmlSpace{
  val Default	 = value(1)
  val None	 = value(0)
  val Preserve	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Xml.XmlSpace = null
}
 
abstract class XmlWriter extends AnyRef with System.IDisposable {
  def Dispose: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  /* abstract */ def Flush: Unit
   
  /* abstract */ def LookupPrefix(ns : String): String
   
  def WriteAttributes(reader : System.Xml.XmlReader, defattr : Boolean): Unit
   
  def WriteAttributeString(localName : String, value : String): Unit
   
  def WriteAttributeString(localName : String, ns : String, value : String): Unit
   
  def WriteAttributeString(prefix : String, localName : String, ns : String, value : String): Unit
   
  /* abstract */ def WriteBase64(buffer : Array[UByte], index : Int, count : Int): Unit
   
  def WriteBinHex(buffer : Array[UByte], index : Int, count : Int): Unit
   
  /* abstract */ def WriteCData(text : String): Unit
   
  /* abstract */ def WriteCharEntity(ch : Char): Unit
   
  /* abstract */ def WriteChars(buffer : Array[Char], index : Int, count : Int): Unit
   
  /* abstract */ def WriteComment(text : String): Unit
   
  /* abstract */ def WriteDocType(name : String, pubid : String, sysid : String, subset : String): Unit
   
  def WriteElementString(localName : String, value : String): Unit
   
  def WriteElementString(localName : String, ns : String, value : String): Unit
   
  def WriteElementString(prefix : String, localName : String, ns : String, value : String): Unit
   
  /* abstract */ def WriteEndAttribute: Unit
   
  /* abstract */ def WriteEndDocument: Unit
   
  /* abstract */ def WriteEndElement: Unit
   
  /* abstract */ def WriteEntityRef(name : String): Unit
   
  /* abstract */ def WriteFullEndElement: Unit
   
  def WriteName(name : String): Unit
   
  def WriteNmToken(name : String): Unit
   
  def WriteNode(reader : System.Xml.XmlReader, defattr : Boolean): Unit
   
  /* abstract */ def WriteProcessingInstruction(name : String, text : String): Unit
   
  def WriteQualifiedName(localName : String, ns : String): Unit
   
  /* abstract */ def WriteRaw(buffer : Array[Char], index : Int, count : Int): Unit
   
  /* abstract */ def WriteRaw(data : String): Unit
   
  def WriteStartAttribute(localName : String): Unit
   
  def WriteStartAttribute(localName : String, ns : String): Unit
   
  /* abstract */ def WriteStartAttribute(prefix : String, localName : String, ns : String): Unit
   
  /* abstract */ def WriteStartDocument: Unit
   
  /* abstract */ def WriteStartDocument(standalone : Boolean): Unit
   
  def WriteStartElement(localName : String): Unit
   
  def WriteStartElement(localName : String, ns : String): Unit
   
  /* abstract */ def WriteStartElement(prefix : String, localName : String, ns : String): Unit
   
  /* abstract */ def WriteString(text : String): Unit
   
  /* abstract */ def WriteSurrogateCharEntity(lowChar : Char, highChar : Char): Unit
   
  def WriteValue(value : Boolean): Unit
   
  def WriteValue(value : System.Decimal): Unit
   
  def WriteValue(value : Double): Unit
   
  def WriteValue(value : Int): Unit
   
  def WriteValue(value : Long): Unit
   
  def WriteValue(value : AnyRef): Unit
   
  def WriteValue(value : Float): Unit
   
  def WriteValue(value : String): Unit
   
  /* abstract */ def WriteWhitespace(ws : String): Unit
   
  val Settings : System.Xml.XmlWriterSettings = null
   
  val WriteState : System.Xml.WriteState = System.Xml.WriteState.Attribute
   
  val XmlLang : String = ""
   
  val XmlSpace : System.Xml.XmlSpace = System.Xml.XmlSpace.Default
   
  protected def this() {}
}
object XmlWriter {
  def Create(output : System.IO.Stream): System.Xml.XmlWriter  = null
   
  def Create(output : System.IO.Stream, settings : System.Xml.XmlWriterSettings): System.Xml.XmlWriter  = null
   
  def Create(output : System.IO.TextWriter): System.Xml.XmlWriter  = null
   
  def Create(output : System.IO.TextWriter, settings : System.Xml.XmlWriterSettings): System.Xml.XmlWriter  = null
   
  def Create(output : System.Text.StringBuilder): System.Xml.XmlWriter  = null
   
  def Create(output : System.Text.StringBuilder, settings : System.Xml.XmlWriterSettings): System.Xml.XmlWriter  = null
   
  def Create(output : System.Xml.XmlWriter): System.Xml.XmlWriter  = null
   
  def Create(output : System.Xml.XmlWriter, settings : System.Xml.XmlWriterSettings): System.Xml.XmlWriter  = null
}
 
sealed class XmlWriterSettings extends AnyRef {
  def Clone: System.Xml.XmlWriterSettings
   
  def Reset: Unit
   
  var CheckCharacters : Boolean = false
   
  var CloseOutput : Boolean = false
   
  var ConformanceLevel : System.Xml.ConformanceLevel = System.Xml.ConformanceLevel.Auto
   
  var Encoding : System.Text.Encoding = null
   
  var Indent : Boolean = false
   
  var IndentChars : String = ""
   
  var NamespaceHandling : System.Xml.NamespaceHandling = System.Xml.NamespaceHandling.Default
   
  var NewLineChars : String = ""
   
  var NewLineHandling : System.Xml.NewLineHandling = System.Xml.NewLineHandling.Entitize
   
  var NewLineOnAttributes : Boolean = false
   
  var OmitXmlDeclaration : Boolean = false
   
  def this() {}
}
 
}