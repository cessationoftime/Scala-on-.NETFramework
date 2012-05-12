 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Resources {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IResourceReader extends System.Collections.IEnumerable with System.IDisposable {
  /* abstract */ def Close: Unit
   
  /* abstract */ def GetEnumerator: System.Collections.IDictionaryEnumerator
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IResourceWriter extends System.IDisposable {
  /* abstract */ def AddResource(name : String, value : String): Unit
   
  /* abstract */ def AddResource(name : String, value : AnyRef): Unit
   
  /* abstract */ def AddResource(name : String, value : Array[UByte]): Unit
   
  /* abstract */ def Close: Unit
   
  /* abstract */ def Generate: Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class MissingManifestResourceException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class MissingSatelliteAssemblyException extends System.SystemException {
  val CultureName : String = ""
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, cultureName : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(1 /* AllowMultiple = false */ )
sealed class NeutralResourcesLanguageAttribute extends System.Attribute {
  val CultureName : String = ""
   
  val Location : System.Resources.UltimateResourceFallbackLocation = System.Resources.UltimateResourceFallbackLocation.MainAssembly
   
  def this(cultureName : String) {}
   
  def this(cultureName : String, location : System.Resources.UltimateResourceFallbackLocation) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ResourceManager extends AnyRef {
  protected def get_FallbackLocation: System.Resources.UltimateResourceFallbackLocation
   
  protected def set_FallbackLocation(value : System.Resources.UltimateResourceFallbackLocation): Unit
   
  def ReleaseAllResources: Unit
   
  protected def GetResourceFileName(culture : System.Globalization.CultureInfo): String
   
  def GetResourceSet(culture : System.Globalization.CultureInfo, createIfNotExists : Boolean, 
                     tryParents : Boolean): System.Resources.ResourceSet
   
  protected def InternalGetResourceSet(culture : System.Globalization.CultureInfo, createIfNotExists : Boolean, 
                                       tryParents : Boolean): System.Resources.ResourceSet
   
  def GetString(name : String): String
   
  def GetString(name : String, culture : System.Globalization.CultureInfo): String
   
  def GetObject(name : String): AnyRef
   
  def GetObject(name : String, culture : System.Globalization.CultureInfo): AnyRef
   
  @System.CLSCompliantAttribute(false)
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetStream(name : String): System.IO.UnmanagedMemoryStream
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  @System.CLSCompliantAttribute(false)
  def GetStream(name : String, culture : System.Globalization.CultureInfo): System.IO.UnmanagedMemoryStream
   
  protected var BaseNameField : String
   
  protected var ResourceSets : System.Collections.Hashtable
   
  protected var MainAssembly : System.Reflection.Assembly
   
  val BaseName : String = ""
   
  var IgnoreCase : Boolean = false
   
  val ResourceSetType : System.Type = null
   
  protected def this() {}
   
  def this(baseName : String, assembly : System.Reflection.Assembly) {}
   
  def this(baseName : String, assembly : System.Reflection.Assembly, 
           usingResourceSet : System.Type) {}
   
  def this(resourceSource : System.Type) {}
}
object ResourceManager {
  def CreateFileBasedResourceManager(baseName : String, resourceDir : String, usingResourceSet : System.Type): System.Resources.ResourceManager  = null
   
  protected def GetSatelliteContractVersion(a : System.Reflection.Assembly): System.Version  = null
   
  protected def GetNeutralResourcesLanguage(a : System.Reflection.Assembly): System.Globalization.CultureInfo  = null
   
  val MagicNumber : Int  = 0
   
  val HeaderVersionNumber : Int  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ResourceReader extends AnyRef with System.Resources.IResourceReader with System.Collections.IEnumerable with 
                                    System.IDisposable {
  def Close: Unit
   
  def GetEnumerator: System.Collections.IDictionaryEnumerator
   
  def this(fileName : String) {}
   
  def this(stream : System.IO.Stream) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ResourceSet extends AnyRef with System.IDisposable with System.Collections.IEnumerable {
  def Close: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  def Dispose: Unit
   
  def GetDefaultReader: System.Type
   
  def GetDefaultWriter: System.Type
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetEnumerator: System.Collections.IDictionaryEnumerator
   
  def GetString(name : String): String
   
  def GetString(name : String, ignoreCase : Boolean): String
   
  def GetObject(name : String): AnyRef
   
  def GetObject(name : String, ignoreCase : Boolean): AnyRef
   
  protected def ReadResources: Unit
   
  protected var Reader : System.Resources.IResourceReader
   
  protected var Table : System.Collections.Hashtable
   
  protected def this() {}
   
  def this(fileName : String) {}
   
  def this(stream : System.IO.Stream) {}
   
  def this(reader : System.Resources.IResourceReader) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ResourceWriter extends AnyRef with System.Resources.IResourceWriter with System.IDisposable {
  def AddResource(name : String, value : String): Unit
   
  def AddResource(name : String, value : AnyRef): Unit
   
  def AddResource(name : String, value : Array[UByte]): Unit
   
  def AddResourceData(name : String, typeName : String, serializedData : Array[UByte]): Unit
   
  def Close: Unit
   
  def Dispose: Unit
   
  def Generate: Unit
   
  def this(fileName : String) {}
   
  def this(stream : System.IO.Stream) {}
}
 
@System.AttributeUsageAttribute(1 /* AllowMultiple = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SatelliteContractVersionAttribute extends System.Attribute {
  val Version : String = ""
   
  def this(version : String) {}
}
 
sealed abstract class UltimateResourceFallbackLocation extends System.Enum {
  def ==(that: System.Resources.UltimateResourceFallbackLocation): Boolean = false
  def !=(that: System.Resources.UltimateResourceFallbackLocation): Boolean = false
  def  <(that: System.Resources.UltimateResourceFallbackLocation): Boolean = false
  def <=(that: System.Resources.UltimateResourceFallbackLocation): Boolean = false
  def  >(that: System.Resources.UltimateResourceFallbackLocation): Boolean = false
  def >=(that: System.Resources.UltimateResourceFallbackLocation): Boolean = false
  def  |(that: System.Resources.UltimateResourceFallbackLocation): Boolean = false
  def  &(that: System.Resources.UltimateResourceFallbackLocation): Boolean = false
  def  ^(that: System.Resources.UltimateResourceFallbackLocation): Boolean = false
}
object UltimateResourceFallbackLocation{
  val MainAssembly	 = value(0)
  val Satellite	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Resources.UltimateResourceFallbackLocation = null
}
 
}