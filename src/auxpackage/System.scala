 /* assembly: System, Version=2.0.5.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\System.dll */ 
 
import auxPackage.auxiliary._
 
package System {
 
class Uri extends AnyRef {
  def Equals(comparand : AnyRef): Boolean
   
  def GetComponents(components : System.UriComponents, format : System.UriFormat): String
   
  def GetHashCode: Int
   
  def IsBaseOf(uri : System.Uri): Boolean
   
  def MakeRelativeUri(uri : System.Uri): System.Uri
   
  def ToString: String
   
  val AbsolutePath : String = ""
   
  val AbsoluteUri : String = ""
   
  val DnsSafeHost : String = ""
   
  val Fragment : String = ""
   
  val Host : String = ""
   
  val IsAbsoluteUri : Boolean = false
   
  val IsUnc : Boolean = false
   
  val LocalPath : String = ""
   
  val OriginalString : String = ""
   
  val Port : Int = 0
   
  val Query : String = ""
   
  val Scheme : String = ""
   
  val UserEscaped : Boolean = false
   
  val UserInfo : String = ""
   
  def this(uriString : String) {}
   
  def this(uriString : String, uriKind : System.UriKind) {}
   
  def this(baseUri : System.Uri, relativeUri : String) {}
   
  def this(baseUri : System.Uri, relativeUri : System.Uri) {}
}
object Uri {
  def CheckSchemeName(schemeName : String): Boolean  = false
   
  def Compare(uri1 : System.Uri, uri2 : System.Uri, partsToCompare : System.UriComponents, 
              compareFormat : System.UriFormat, comparisonType : System.StringComparison): Int  = 0
   
  def EscapeDataString(stringToEscape : String): String  = ""
   
  def EscapeUriString(stringToEscape : String): String  = ""
   
  def IsWellFormedUriString(uriString : String, uriKind : System.UriKind): Boolean  = false
   
  def ==(uri1 : System.Uri, uri2 : System.Uri): Boolean  = false
   
  def !=(uri1 : System.Uri, uri2 : System.Uri): Boolean  = false
   
  def UnescapeDataString(stringToUnescape : String): String  = ""
}
 
class UriBuilder extends AnyRef {
  def Equals(rparam : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  var Fragment : String = ""
   
  var Host : String = ""
   
  var Password : String = ""
   
  var Path : String = ""
   
  var Port : Int = 0
   
  var Query : String = ""
   
  var Scheme : String = ""
   
  val Uri : System.Uri = null
   
  var UserName : String = ""
   
  def this() {}
   
  def this(uri : String) {}
   
  def this(schemeName : String, hostName : String) {}
   
  def this(scheme : String, host : String, portNumber : Int) {}
   
  def this(scheme : String, host : String, port : Int, pathValue : String) {}
   
  def this(scheme : String, host : String, port : Int, path : String, extraValue : String) {}
   
  def this(uri : System.Uri) {}
}
 
sealed abstract class UriComponents extends System.Enum {
  def ==(that: System.UriComponents): Boolean = false
  def !=(that: System.UriComponents): Boolean = false
  def  <(that: System.UriComponents): Boolean = false
  def <=(that: System.UriComponents): Boolean = false
  def  >(that: System.UriComponents): Boolean = false
  def >=(that: System.UriComponents): Boolean = false
  def  |(that: System.UriComponents): Boolean = false
  def  &(that: System.UriComponents): Boolean = false
  def  ^(that: System.UriComponents): Boolean = false
}
object UriComponents{
  val AbsoluteUri	 = value(127)
  val Fragment	 = value(64)
  val Host	 = value(4)
  val HostAndPort	 = value(132)
  val HttpRequestUrl	 = value(61)
  val KeepDelimiter	 = value(1073741824)
  val Path	 = value(16)
  val PathAndQuery	 = value(48)
  val Port	 = value(8)
  val Query	 = value(32)
  val Scheme	 = value(1)
  val SchemeAndServer	 = value(13)
  val SerializationInfoString	 = value(-2147483648)
  val StrongAuthority	 = value(134)
  val StrongPort	 = value(128)
  val UserInfo	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.UriComponents = null
}
 
sealed abstract class UriFormat extends System.Enum {
  def ==(that: System.UriFormat): Boolean = false
  def !=(that: System.UriFormat): Boolean = false
  def  <(that: System.UriFormat): Boolean = false
  def <=(that: System.UriFormat): Boolean = false
  def  >(that: System.UriFormat): Boolean = false
  def >=(that: System.UriFormat): Boolean = false
  def  |(that: System.UriFormat): Boolean = false
  def  &(that: System.UriFormat): Boolean = false
  def  ^(that: System.UriFormat): Boolean = false
}
object UriFormat{
  val SafeUnescaped	 = value(3)
  val Unescaped	 = value(2)
  val UriEscaped	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.UriFormat = null
}
 
sealed abstract class UriKind extends System.Enum {
  def ==(that: System.UriKind): Boolean = false
  def !=(that: System.UriKind): Boolean = false
  def  <(that: System.UriKind): Boolean = false
  def <=(that: System.UriKind): Boolean = false
  def  >(that: System.UriKind): Boolean = false
  def >=(that: System.UriKind): Boolean = false
  def  |(that: System.UriKind): Boolean = false
  def  &(that: System.UriKind): Boolean = false
  def  ^(that: System.UriKind): Boolean = false
}
object UriKind{
  val Absolute	 = value(1)
  val Relative	 = value(2)
  val RelativeOrAbsolute	 = value(0)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.UriKind = null
}
 
}