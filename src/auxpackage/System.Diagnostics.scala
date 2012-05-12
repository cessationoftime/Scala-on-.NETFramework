 /* assembly: System, Version=2.0.5.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\System.dll */ 
 
import auxPackage.auxiliary._
 
package System.Diagnostics {
 
abstract sealed class Debug extends AnyRef 
object Debug {
  @System.Diagnostics.ConditionalAttribute("DEBUG")
  def Assert(condition : Boolean): Unit  = {}
   
  @System.Diagnostics.ConditionalAttribute("DEBUG")
  def Assert(condition : Boolean, message : String): Unit  = {}
   
  @System.Diagnostics.ConditionalAttribute("DEBUG")
  def Assert(condition : Boolean, message : String, detailMessage : String): Unit  = {}
   
  @System.Diagnostics.ConditionalAttribute("DEBUG")
  def WriteLine(value : AnyRef): Unit  = {}
   
  @System.Diagnostics.ConditionalAttribute("DEBUG")
  def WriteLine(message : String): Unit  = {}
   
  @System.Diagnostics.ConditionalAttribute("DEBUG")
  def WriteLine(format : String, args : Array[AnyRef]): Unit  = {}
}
 
}