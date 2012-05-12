 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.Remoting.Metadata.W3cXsd2001 {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISoapXsd {
  /* abstract */ def GetXsdType: String
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapDateTime extends AnyRef {
  def this() {}
}
object SoapDateTime {
  def ToString(value : System.DateTime): String  = ""
   
  def Parse(value : String): System.DateTime  = new System.DateTime()
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapDuration extends AnyRef {
  def this() {}
}
object SoapDuration {
  def ToString(timeSpan : System.TimeSpan): String  = ""
   
  def Parse(value : String): System.TimeSpan  = new System.TimeSpan()
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapTime extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : System.DateTime = new System.DateTime()
   
  def this() {}
   
  def this(value : System.DateTime) {}
}
object SoapTime {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapTime  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapDate extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : System.DateTime = new System.DateTime()
   
  var Sign : Int = 0
   
  def this() {}
   
  def this(value : System.DateTime) {}
   
  def this(value : System.DateTime, sign : Int) {}
}
object SoapDate {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapDate  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapYearMonth extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : System.DateTime = new System.DateTime()
   
  var Sign : Int = 0
   
  def this() {}
   
  def this(value : System.DateTime) {}
   
  def this(value : System.DateTime, sign : Int) {}
}
object SoapYearMonth {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapYearMonth  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapYear extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : System.DateTime = new System.DateTime()
   
  var Sign : Int = 0
   
  def this() {}
   
  def this(value : System.DateTime) {}
   
  def this(value : System.DateTime, sign : Int) {}
}
object SoapYear {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapYear  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapMonthDay extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : System.DateTime = new System.DateTime()
   
  def this() {}
   
  def this(value : System.DateTime) {}
}
object SoapMonthDay {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapMonthDay  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapDay extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : System.DateTime = new System.DateTime()
   
  def this() {}
   
  def this(value : System.DateTime) {}
}
object SoapDay {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapDay  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapMonth extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : System.DateTime = new System.DateTime()
   
  def this() {}
   
  def this(value : System.DateTime) {}
}
object SoapMonth {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapMonth  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapHexBinary extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : Array[UByte] = Array.empty[UByte]
   
  def this() {}
   
  def this(value : Array[UByte]) {}
}
object SoapHexBinary {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapHexBinary  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapBase64Binary extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : Array[UByte] = Array.empty[UByte]
   
  def this() {}
   
  def this(value : Array[UByte]) {}
}
object SoapBase64Binary {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapBase64Binary  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapInteger extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : System.Decimal = new System.Decimal()
   
  def this() {}
   
  def this(value : System.Decimal) {}
}
object SoapInteger {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapInteger  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapPositiveInteger extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : System.Decimal = new System.Decimal()
   
  def this() {}
   
  def this(value : System.Decimal) {}
}
object SoapPositiveInteger {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapPositiveInteger  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapNonPositiveInteger extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : System.Decimal = new System.Decimal()
   
  def this() {}
   
  def this(value : System.Decimal) {}
}
object SoapNonPositiveInteger {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapNonPositiveInteger  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapNonNegativeInteger extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : System.Decimal = new System.Decimal()
   
  def this() {}
   
  def this(value : System.Decimal) {}
}
object SoapNonNegativeInteger {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapNonNegativeInteger  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapNegativeInteger extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : System.Decimal = new System.Decimal()
   
  def this() {}
   
  def this(value : System.Decimal) {}
}
object SoapNegativeInteger {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapNegativeInteger  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapAnyUri extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : String = ""
   
  def this() {}
   
  def this(value : String) {}
}
object SoapAnyUri {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapAnyUri  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapQName extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Name : String = ""
   
  var Namespace : String = ""
   
  var Key : String = ""
   
  def this() {}
   
  def this(value : String) {}
   
  def this(key : String, name : String) {}
   
  def this(key : String, name : String, namespaceValue : String) {}
}
object SoapQName {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapQName  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapNotation extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : String = ""
   
  def this() {}
   
  def this(value : String) {}
}
object SoapNotation {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapNotation  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapNormalizedString extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : String = ""
   
  def this() {}
   
  def this(value : String) {}
}
object SoapNormalizedString {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapNormalizedString  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapToken extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : String = ""
   
  def this() {}
   
  def this(value : String) {}
}
object SoapToken {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapToken  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapLanguage extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : String = ""
   
  def this() {}
   
  def this(value : String) {}
}
object SoapLanguage {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapLanguage  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapName extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : String = ""
   
  def this() {}
   
  def this(value : String) {}
}
object SoapName {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapName  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapIdrefs extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : String = ""
   
  def this() {}
   
  def this(value : String) {}
}
object SoapIdrefs {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapIdrefs  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapEntities extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : String = ""
   
  def this() {}
   
  def this(value : String) {}
}
object SoapEntities {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapEntities  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapNmtoken extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : String = ""
   
  def this() {}
   
  def this(value : String) {}
}
object SoapNmtoken {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapNmtoken  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapNmtokens extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : String = ""
   
  def this() {}
   
  def this(value : String) {}
}
object SoapNmtokens {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapNmtokens  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapNcName extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : String = ""
   
  def this() {}
   
  def this(value : String) {}
}
object SoapNcName {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapNcName  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapId extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : String = ""
   
  def this() {}
   
  def this(value : String) {}
}
object SoapId {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapId  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapIdref extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : String = ""
   
  def this() {}
   
  def this(value : String) {}
}
object SoapIdref {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapIdref  = null
   
  val XsdType : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SoapEntity extends AnyRef with System.Runtime.Remoting.Metadata.W3cXsd2001.ISoapXsd {
  def GetXsdType: String
   
  def ToString: String
   
  var Value : String = ""
   
  def this() {}
   
  def this(value : String) {}
}
object SoapEntity {
  def Parse(value : String): System.Runtime.Remoting.Metadata.W3cXsd2001.SoapEntity  = null
   
  val XsdType : String = ""
}
 
}