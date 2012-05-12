 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Diagnostics.CodeAnalysis {
 
@System.AttributeUsageAttribute(32767 /* Inherited = false, AllowMultiple = true */ )
@System.Diagnostics.ConditionalAttribute("CODE_ANALYSIS")
sealed class SuppressMessageAttribute extends System.Attribute {
  val Category : String = ""
   
  val CheckId : String = ""
   
  var Scope : String = ""
   
  var Target : String = ""
   
  var MessageId : String = ""
   
  var Justification : String = ""
   
  def this(category : String, checkId : String) {}
}
 
}