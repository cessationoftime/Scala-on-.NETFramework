 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.Remoting.Metadata {
 
sealed abstract class SoapOption extends System.Enum {
  def ==(that: System.Runtime.Remoting.Metadata.SoapOption): Boolean = false
  def !=(that: System.Runtime.Remoting.Metadata.SoapOption): Boolean = false
  def  <(that: System.Runtime.Remoting.Metadata.SoapOption): Boolean = false
  def <=(that: System.Runtime.Remoting.Metadata.SoapOption): Boolean = false
  def  >(that: System.Runtime.Remoting.Metadata.SoapOption): Boolean = false
  def >=(that: System.Runtime.Remoting.Metadata.SoapOption): Boolean = false
  def  |(that: System.Runtime.Remoting.Metadata.SoapOption): Boolean = false
  def  &(that: System.Runtime.Remoting.Metadata.SoapOption): Boolean = false
  def  ^(that: System.Runtime.Remoting.Metadata.SoapOption): Boolean = false
}
object SoapOption{
  val None	 = value(0)
  val AlwaysIncludeTypes	 = value(1)
  val XsdString	 = value(2)
  val EmbedAll	 = value(4)
  val Option1	 = value(8)
  val Option2	 = value(16)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.Remoting.Metadata.SoapOption = null
}
 
sealed abstract class XmlFieldOrderOption extends System.Enum {
  def ==(that: System.Runtime.Remoting.Metadata.XmlFieldOrderOption): Boolean = false
  def !=(that: System.Runtime.Remoting.Metadata.XmlFieldOrderOption): Boolean = false
  def  <(that: System.Runtime.Remoting.Metadata.XmlFieldOrderOption): Boolean = false
  def <=(that: System.Runtime.Remoting.Metadata.XmlFieldOrderOption): Boolean = false
  def  >(that: System.Runtime.Remoting.Metadata.XmlFieldOrderOption): Boolean = false
  def >=(that: System.Runtime.Remoting.Metadata.XmlFieldOrderOption): Boolean = false
  def  |(that: System.Runtime.Remoting.Metadata.XmlFieldOrderOption): Boolean = false
  def  &(that: System.Runtime.Remoting.Metadata.XmlFieldOrderOption): Boolean = false
  def  ^(that: System.Runtime.Remoting.Metadata.XmlFieldOrderOption): Boolean = false
}
object XmlFieldOrderOption{
  val All	 = value(0)
  val Sequence	 = value(1)
  val Choice	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.Remoting.Metadata.XmlFieldOrderOption = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SoapAttribute extends System.Attribute {
  protected var ProtXmlNamespace : String
   
  protected var ReflectInfo : AnyRef
   
  var XmlNamespace : String = ""
   
  var UseAttribute : Boolean = false
   
  var Embedded : Boolean = false
   
  def this() {}
}
 
@System.AttributeUsageAttribute(1052)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapTypeAttribute extends System.Runtime.Remoting.Metadata.SoapAttribute {
  var SoapOptions : System.Runtime.Remoting.Metadata.SoapOption = System.Runtime.Remoting.Metadata.SoapOption.None
   
  var XmlElementName : String = ""
   
  var XmlNamespace : String = ""
   
  var XmlTypeName : String = ""
   
  var XmlTypeNamespace : String = ""
   
  var XmlFieldOrder : System.Runtime.Remoting.Metadata.XmlFieldOrderOption = System.Runtime.Remoting.Metadata.XmlFieldOrderOption.All
   
  var UseAttribute : Boolean = false
   
  def this() {}
}
 
@System.AttributeUsageAttribute(64)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapMethodAttribute extends System.Runtime.Remoting.Metadata.SoapAttribute {
  var SoapAction : String = ""
   
  var UseAttribute : Boolean = false
   
  var XmlNamespace : String = ""
   
  var ResponseXmlElementName : String = ""
   
  var ResponseXmlNamespace : String = ""
   
  var ReturnXmlElementName : String = ""
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(256)
sealed class SoapFieldAttribute extends System.Runtime.Remoting.Metadata.SoapAttribute {
  def IsInteropXmlElement: Boolean
   
  var XmlElementName : String = ""
   
  var Order : Int = 0
   
  def this() {}
}
 
@System.AttributeUsageAttribute(2048)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapParameterAttribute extends System.Runtime.Remoting.Metadata.SoapAttribute {
  def this() {}
}
 
}