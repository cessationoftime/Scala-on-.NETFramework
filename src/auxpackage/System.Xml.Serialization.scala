 /* assembly: System.Xml, Version=2.0.5.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\System.Xml.dll */ 
 
import auxPackage.auxiliary._
 
package System.Xml.Serialization {
 
trait IXmlSerializable {
  /* abstract */ def GetSchema: System.Xml.Schema.XmlSchema
   
  /* abstract */ def ReadXml(reader : System.Xml.XmlReader): Unit
   
  /* abstract */ def WriteXml(writer : System.Xml.XmlWriter): Unit
}
 
@System.AttributeUsageAttribute(10624 /* AllowMultiple = false */ )
class XmlArrayAttribute extends System.Attribute {
  var ElementName : String = ""
   
  var Form : System.Xml.Schema.XmlSchemaForm = System.Xml.Schema.XmlSchemaForm.None
   
  var IsNullable : Boolean = false
   
  var Namespace : String = ""
   
  var Order : Int = 0
   
  def this() {}
   
  def this(elementName : String) {}
}
 
@System.AttributeUsageAttribute(10624 /* AllowMultiple = true */ )
class XmlArrayItemAttribute extends System.Attribute {
  var DataType : String = ""
   
  var ElementName : String = ""
   
  var Form : System.Xml.Schema.XmlSchemaForm = System.Xml.Schema.XmlSchemaForm.None
   
  var IsNullable : Boolean = false
   
  var Namespace : String = ""
   
  var NestingLevel : Int = 0
   
  var Type : System.Type = null
   
  def this() {}
   
  def this(elementName : String) {}
   
  def this(elementName : String, `type` : System.Type) {}
   
  def this(`type` : System.Type) {}
}
 
@System.AttributeUsageAttribute(10624)
class XmlAttributeAttribute extends System.Attribute {
  var AttributeName : String = ""
   
  var DataType : String = ""
   
  var Form : System.Xml.Schema.XmlSchemaForm = System.Xml.Schema.XmlSchemaForm.None
   
  var Namespace : String = ""
   
  var Type : System.Type = null
   
  def this() {}
   
  def this(attributeName : String) {}
   
  def this(attributeName : String, `type` : System.Type) {}
   
  def this(`type` : System.Type) {}
}
 
@System.AttributeUsageAttribute(10624 /* AllowMultiple = false */ )
class XmlChoiceIdentifierAttribute extends System.Attribute {
  var MemberName : String = ""
   
  def this() {}
   
  def this(name : String) {}
}
 
@System.AttributeUsageAttribute(10624 /* AllowMultiple = true */ )
class XmlElementAttribute extends System.Attribute {
  var DataType : String = ""
   
  var ElementName : String = ""
   
  var Form : System.Xml.Schema.XmlSchemaForm = System.Xml.Schema.XmlSchemaForm.None
   
  var IsNullable : Boolean = false
   
  var Namespace : String = ""
   
  var Order : Int = 0
   
  var Type : System.Type = null
   
  def this() {}
   
  def this(elementName : String) {}
   
  def this(elementName : String, `type` : System.Type) {}
   
  def this(`type` : System.Type) {}
}
 
@System.AttributeUsageAttribute(256)
class XmlEnumAttribute extends System.Attribute {
  var Name : String = ""
   
  def this() {}
   
  def this(name : String) {}
}
 
@System.AttributeUsageAttribute(10624)
class XmlIgnoreAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(76 /* AllowMultiple = true */ )
class XmlIncludeAttribute extends System.Attribute {
  var Type : System.Type = null
   
  def this(`type` : System.Type) {}
}
 
@System.AttributeUsageAttribute(9244)
class XmlRootAttribute extends System.Attribute {
  var DataType : String = ""
   
  var ElementName : String = ""
   
  var IsNullable : Boolean = false
   
  var Namespace : String = ""
   
  def this() {}
   
  def this(elementName : String) {}
}
 
@System.AttributeUsageAttribute(1036)
sealed class XmlSchemaProviderAttribute extends System.Attribute {
  var IsAny : Boolean = false
   
  val MethodName : String = ""
   
  def this(methodName : String) {}
}
 
@System.AttributeUsageAttribute(10624)
class XmlTextAttribute extends System.Attribute {
  var DataType : String = ""
   
  var Type : System.Type = null
   
  def this() {}
   
  def this(`type` : System.Type) {}
}
 
@System.AttributeUsageAttribute(1052)
class XmlTypeAttribute extends System.Attribute {
  var AnonymousType : Boolean = false
   
  var IncludeInSchema : Boolean = false
   
  var Namespace : String = ""
   
  var TypeName : String = ""
   
  def this() {}
   
  def this(typeName : String) {}
}
 
}