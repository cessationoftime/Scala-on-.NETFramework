 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.IO.IsolatedStorage {
 
sealed abstract class IsolatedStorageScope extends System.Enum {
  def ==(that: System.IO.IsolatedStorage.IsolatedStorageScope): Boolean = false
  def !=(that: System.IO.IsolatedStorage.IsolatedStorageScope): Boolean = false
  def  <(that: System.IO.IsolatedStorage.IsolatedStorageScope): Boolean = false
  def <=(that: System.IO.IsolatedStorage.IsolatedStorageScope): Boolean = false
  def  >(that: System.IO.IsolatedStorage.IsolatedStorageScope): Boolean = false
  def >=(that: System.IO.IsolatedStorage.IsolatedStorageScope): Boolean = false
  def  |(that: System.IO.IsolatedStorage.IsolatedStorageScope): Boolean = false
  def  &(that: System.IO.IsolatedStorage.IsolatedStorageScope): Boolean = false
  def  ^(that: System.IO.IsolatedStorage.IsolatedStorageScope): Boolean = false
}
object IsolatedStorageScope{
  val None	 = value(0)
  val User	 = value(1)
  val Domain	 = value(2)
  val Assembly	 = value(4)
  val Roaming	 = value(8)
  val Machine	 = value(16)
  val Application	 = value(32)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.IO.IsolatedStorage.IsolatedStorageScope = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class IsolatedStorage extends System.MarshalByRefObject {
  protected def get_SeparatorExternal: Char
   
  protected def get_SeparatorInternal: Char
   
  protected def InitStore(scope : System.IO.IsolatedStorage.IsolatedStorageScope, 
                          domainEvidenceType : System.Type, assemblyEvidenceType : System.Type): Unit
   
  protected def InitStore(scope : System.IO.IsolatedStorage.IsolatedStorageScope, 
                          appEvidenceType : System.Type): Unit
   
  /* abstract */ def Remove: Unit
   
  protected /* abstract */ def GetPermission(ps : System.Security.PermissionSet): System.Security.Permissions.IsolatedStoragePermission
   
  @System.CLSCompliantAttribute(false)
  val MaximumSize : ULong = 0
   
  @System.CLSCompliantAttribute(false)
  val CurrentSize : ULong = 0
   
  val DomainIdentity : AnyRef = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val ApplicationIdentity : AnyRef = null
   
  val AssemblyIdentity : AnyRef = null
   
  val Scope : System.IO.IsolatedStorage.IsolatedStorageScope = System.IO.IsolatedStorage.IsolatedStorageScope.None
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class IsolatedStorageFile extends System.IO.IsolatedStorage.IsolatedStorage with System.IDisposable {
  def DeleteFile(file : String): Unit
   
  def CreateDirectory(dir : String): Unit
   
  def DeleteDirectory(dir : String): Unit
   
  def GetFileNames(searchPattern : String): Array[String]
   
  def GetDirectoryNames(searchPattern : String): Array[String]
   
  def Remove: Unit
   
  def Close: Unit
   
  def Dispose: Unit
   
  protected def Finalize: Unit
   
  protected def GetPermission(ps : System.Security.PermissionSet): System.Security.Permissions.IsolatedStoragePermission
   
  @System.CLSCompliantAttribute(false)
  val CurrentSize : ULong = 0
   
  @System.CLSCompliantAttribute(false)
  val MaximumSize : ULong = 0
}
object IsolatedStorageFile {
  def GetUserStoreForDomain: System.IO.IsolatedStorage.IsolatedStorageFile  = null
   
  def GetUserStoreForAssembly: System.IO.IsolatedStorage.IsolatedStorageFile  = null
   
  def GetUserStoreForApplication: System.IO.IsolatedStorage.IsolatedStorageFile  = null
   
  def GetMachineStoreForDomain: System.IO.IsolatedStorage.IsolatedStorageFile  = null
   
  def GetMachineStoreForAssembly: System.IO.IsolatedStorage.IsolatedStorageFile  = null
   
  def GetMachineStoreForApplication: System.IO.IsolatedStorage.IsolatedStorageFile  = null
   
  def GetStore(scope : System.IO.IsolatedStorage.IsolatedStorageScope, 
               domainEvidenceType : System.Type, assemblyEvidenceType : System.Type): System.IO.IsolatedStorage.IsolatedStorageFile  = null
   
  def GetStore(scope : System.IO.IsolatedStorage.IsolatedStorageScope, domainIdentity : AnyRef, 
               assemblyIdentity : AnyRef): System.IO.IsolatedStorage.IsolatedStorageFile  = null
   
  def GetStore(scope : System.IO.IsolatedStorage.IsolatedStorageScope, 
               domainEvidence : System.Security.Policy.Evidence, domainEvidenceType : System.Type, 
               assemblyEvidence : System.Security.Policy.Evidence, 
               assemblyEvidenceType : System.Type): System.IO.IsolatedStorage.IsolatedStorageFile  = null
   
  def GetStore(scope : System.IO.IsolatedStorage.IsolatedStorageScope, 
               applicationEvidenceType : System.Type): System.IO.IsolatedStorage.IsolatedStorageFile  = null
   
  def GetStore(scope : System.IO.IsolatedStorage.IsolatedStorageScope, 
               applicationIdentity : AnyRef): System.IO.IsolatedStorage.IsolatedStorageFile  = null
   
  def Remove(scope : System.IO.IsolatedStorage.IsolatedStorageScope): Unit  = {}
   
  def GetEnumerator(scope : System.IO.IsolatedStorage.IsolatedStorageScope): System.Collections.IEnumerator  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class IsolatedStorageFileStream extends System.IO.FileStream {
  protected def Dispose(disposing : Boolean): Unit
   
  def Flush: Unit
   
  def SetLength(value : Long): Unit
   
  def Read(buffer : Array[UByte], offset : Int, count : Int): Int
   
  def ReadByte: Int
   
  def Seek(offset : Long, origin : System.IO.SeekOrigin): Long
   
  def Write(buffer : Array[UByte], offset : Int, count : Int): Unit
   
  def WriteByte(value : UByte): Unit
   
  def BeginRead(buffer : Array[UByte], offset : Int, numBytes : Int, 
                userCallback : System.AsyncCallback, stateObject : AnyRef): System.IAsyncResult
   
  def EndRead(asyncResult : System.IAsyncResult): Int
   
  def BeginWrite(buffer : Array[UByte], offset : Int, numBytes : Int, 
                 userCallback : System.AsyncCallback, stateObject : AnyRef): System.IAsyncResult
   
  def EndWrite(asyncResult : System.IAsyncResult): Unit
   
  val CanRead : Boolean = false
   
  val CanWrite : Boolean = false
   
  val CanSeek : Boolean = false
   
  val IsAsync : Boolean = false
   
  val Length : Long = 0
   
  var Position : Long = 0
   
  @System.ObsoleteAttribute("This property has been deprecated.  Please use IsolatedStorageFileStream\'s SafeFileHandle property instead.  http://go.microsoft.com/fwlink/?linkid=14202")
  val Handle : System.IntPtr = new System.IntPtr()
   
  val SafeFileHandle : Microsoft.Win32.SafeHandles.SafeFileHandle = null
   
  def this(path : String, mode : System.IO.FileMode) {}
   
  def this(path : String, mode : System.IO.FileMode, 
           isf : System.IO.IsolatedStorage.IsolatedStorageFile) {}
   
  def this(path : String, mode : System.IO.FileMode, access : System.IO.FileAccess) {}
   
  def this(path : String, mode : System.IO.FileMode, access : System.IO.FileAccess, 
           isf : System.IO.IsolatedStorage.IsolatedStorageFile) {}
   
  def this(path : String, mode : System.IO.FileMode, access : System.IO.FileAccess, 
           share : System.IO.FileShare) {}
   
  def this(path : String, mode : System.IO.FileMode, access : System.IO.FileAccess, 
           share : System.IO.FileShare, isf : System.IO.IsolatedStorage.IsolatedStorageFile) {}
   
  def this(path : String, mode : System.IO.FileMode, access : System.IO.FileAccess, 
           share : System.IO.FileShare, bufferSize : Int) {}
   
  def this(path : String, mode : System.IO.FileMode, access : System.IO.FileAccess, 
           share : System.IO.FileShare, bufferSize : Int, 
           isf : System.IO.IsolatedStorage.IsolatedStorageFile) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class IsolatedStorageException extends System.Exception {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait INormalizeForIsolatedStorage {
  /* abstract */ def Normalize: AnyRef
}
 
}