 /* assembly: System.Core, Version=2.0.5.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\System.Core.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.CompilerServices {
 
@System.AttributeUsageAttribute(69)
sealed class ExtensionAttribute extends System.Attribute {
  def this() {}
}
 
trait IStrongBox {
  var Value : AnyRef = null
}
 
class StrongBox[T] extends AnyRef with System.Runtime.CompilerServices.IStrongBox {
  var Value : T
   
  def this(value : T) {}
}
 
}