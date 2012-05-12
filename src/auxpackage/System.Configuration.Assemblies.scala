 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Configuration.Assemblies {
 
@System.ObsoleteAttribute("The AssemblyHash class has been deprecated. http://go.microsoft.com/fwlink/?linkid=14202")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AssemblyHash extends System.ValueType with System.ICloneable {
  @System.ObsoleteAttribute("The AssemblyHash class has been deprecated. http://go.microsoft.com/fwlink/?linkid=14202")
  def GetValue: Array[UByte]
   
  @System.ObsoleteAttribute("The AssemblyHash class has been deprecated. http://go.microsoft.com/fwlink/?linkid=14202")
  def SetValue(value : Array[UByte]): Unit
   
  @System.ObsoleteAttribute("The AssemblyHash class has been deprecated. http://go.microsoft.com/fwlink/?linkid=14202")
  def Clone: AnyRef
   
  @System.ObsoleteAttribute("The AssemblyHash class has been deprecated. http://go.microsoft.com/fwlink/?linkid=14202")
  var Algorithm : System.Configuration.Assemblies.AssemblyHashAlgorithm = System.Configuration.Assemblies.AssemblyHashAlgorithm.None
   
  @System.ObsoleteAttribute("The AssemblyHash class has been deprecated. http://go.microsoft.com/fwlink/?linkid=14202")
  def this(value : Array[UByte]) {}
   
  @System.ObsoleteAttribute("The AssemblyHash class has been deprecated. http://go.microsoft.com/fwlink/?linkid=14202")
  def this(algorithm : System.Configuration.Assemblies.AssemblyHashAlgorithm, 
           value : Array[UByte]) {}
}
object AssemblyHash {
  @System.ObsoleteAttribute("The AssemblyHash class has been deprecated. http://go.microsoft.com/fwlink/?linkid=14202")
  val Empty : System.Configuration.Assemblies.AssemblyHash  = new System.Configuration.Assemblies.AssemblyHash()
}
 
sealed abstract class AssemblyHashAlgorithm extends System.Enum {
  def ==(that: System.Configuration.Assemblies.AssemblyHashAlgorithm): Boolean = false
  def !=(that: System.Configuration.Assemblies.AssemblyHashAlgorithm): Boolean = false
  def  <(that: System.Configuration.Assemblies.AssemblyHashAlgorithm): Boolean = false
  def <=(that: System.Configuration.Assemblies.AssemblyHashAlgorithm): Boolean = false
  def  >(that: System.Configuration.Assemblies.AssemblyHashAlgorithm): Boolean = false
  def >=(that: System.Configuration.Assemblies.AssemblyHashAlgorithm): Boolean = false
  def  |(that: System.Configuration.Assemblies.AssemblyHashAlgorithm): Boolean = false
  def  &(that: System.Configuration.Assemblies.AssemblyHashAlgorithm): Boolean = false
  def  ^(that: System.Configuration.Assemblies.AssemblyHashAlgorithm): Boolean = false
}
object AssemblyHashAlgorithm{
  val None	 = value(0)
  val MD5	 = value(32771)
  val SHA1	 = value(32772)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Configuration.Assemblies.AssemblyHashAlgorithm = null
}
 
sealed abstract class AssemblyVersionCompatibility extends System.Enum {
  def ==(that: System.Configuration.Assemblies.AssemblyVersionCompatibility): Boolean = false
  def !=(that: System.Configuration.Assemblies.AssemblyVersionCompatibility): Boolean = false
  def  <(that: System.Configuration.Assemblies.AssemblyVersionCompatibility): Boolean = false
  def <=(that: System.Configuration.Assemblies.AssemblyVersionCompatibility): Boolean = false
  def  >(that: System.Configuration.Assemblies.AssemblyVersionCompatibility): Boolean = false
  def >=(that: System.Configuration.Assemblies.AssemblyVersionCompatibility): Boolean = false
  def  |(that: System.Configuration.Assemblies.AssemblyVersionCompatibility): Boolean = false
  def  &(that: System.Configuration.Assemblies.AssemblyVersionCompatibility): Boolean = false
  def  ^(that: System.Configuration.Assemblies.AssemblyVersionCompatibility): Boolean = false
}
object AssemblyVersionCompatibility{
  val SameMachine	 = value(1)
  val SameProcess	 = value(2)
  val SameDomain	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Configuration.Assemblies.AssemblyVersionCompatibility = null
}
 
}