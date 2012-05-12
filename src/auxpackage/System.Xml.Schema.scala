 /* assembly: System.Xml, Version=2.0.5.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\System.Xml.dll */ 
 
import auxPackage.auxiliary._
 
package System.Xml.Schema {
 
class XmlSchema extends AnyRef 
 
sealed abstract class XmlSchemaForm extends System.Enum {
  def ==(that: System.Xml.Schema.XmlSchemaForm): Boolean = false
  def !=(that: System.Xml.Schema.XmlSchemaForm): Boolean = false
  def  <(that: System.Xml.Schema.XmlSchemaForm): Boolean = false
  def <=(that: System.Xml.Schema.XmlSchemaForm): Boolean = false
  def  >(that: System.Xml.Schema.XmlSchemaForm): Boolean = false
  def >=(that: System.Xml.Schema.XmlSchemaForm): Boolean = false
  def  |(that: System.Xml.Schema.XmlSchemaForm): Boolean = false
  def  &(that: System.Xml.Schema.XmlSchemaForm): Boolean = false
  def  ^(that: System.Xml.Schema.XmlSchemaForm): Boolean = false
}
object XmlSchemaForm{
  val None	 = value(0)
  val Qualified	 = value(1)
  val Unqualified	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Xml.Schema.XmlSchemaForm = null
}
 
}