 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.Versioning {
 
@System.AttributeUsageAttribute(224 /* Inherited = false */ )
@System.Diagnostics.ConditionalAttribute("RESOURCE_ANNOTATION_WORK")
sealed class ResourceConsumptionAttribute extends System.Attribute {
  val ResourceScope : System.Runtime.Versioning.ResourceScope = System.Runtime.Versioning.ResourceScope.None
   
  val ConsumptionScope : System.Runtime.Versioning.ResourceScope = System.Runtime.Versioning.ResourceScope.None
   
  def this(resourceScope : System.Runtime.Versioning.ResourceScope) {}
   
  def this(resourceScope : System.Runtime.Versioning.ResourceScope, 
           consumptionScope : System.Runtime.Versioning.ResourceScope) {}
}
 
@System.AttributeUsageAttribute(480 /* Inherited = false */ )
@System.Diagnostics.ConditionalAttribute("RESOURCE_ANNOTATION_WORK")
sealed class ResourceExposureAttribute extends System.Attribute {
  val ResourceExposureLevel : System.Runtime.Versioning.ResourceScope = System.Runtime.Versioning.ResourceScope.None
   
  def this(exposureLevel : System.Runtime.Versioning.ResourceScope) {}
}
 
sealed abstract class ResourceScope extends System.Enum {
  def ==(that: System.Runtime.Versioning.ResourceScope): Boolean = false
  def !=(that: System.Runtime.Versioning.ResourceScope): Boolean = false
  def  <(that: System.Runtime.Versioning.ResourceScope): Boolean = false
  def <=(that: System.Runtime.Versioning.ResourceScope): Boolean = false
  def  >(that: System.Runtime.Versioning.ResourceScope): Boolean = false
  def >=(that: System.Runtime.Versioning.ResourceScope): Boolean = false
  def  |(that: System.Runtime.Versioning.ResourceScope): Boolean = false
  def  &(that: System.Runtime.Versioning.ResourceScope): Boolean = false
  def  ^(that: System.Runtime.Versioning.ResourceScope): Boolean = false
}
object ResourceScope{
  val None	 = value(0)
  val Machine	 = value(1)
  val Process	 = value(2)
  val AppDomain	 = value(4)
  val Library	 = value(8)
  val Private	 = value(16)
  val Assembly	 = value(32)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.Versioning.ResourceScope = null
}
 
abstract sealed class VersioningHelper extends AnyRef 
object VersioningHelper {
  def MakeVersionSafeName(name : String, from : System.Runtime.Versioning.ResourceScope, 
                          to : System.Runtime.Versioning.ResourceScope): String  = ""
   
  def MakeVersionSafeName(name : String, from : System.Runtime.Versioning.ResourceScope, 
                          to : System.Runtime.Versioning.ResourceScope, `type` : System.Type): String  = ""
}
 
}