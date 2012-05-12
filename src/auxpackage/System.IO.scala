 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.IO {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class Stream extends System.MarshalByRefObject with System.IDisposable {
  def Close: Unit
   
  def Dispose: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  /* abstract */ def Flush: Unit
   
  @System.ObsoleteAttribute("CreateWaitHandle will be removed eventually.  Please use \"new ManualResetEvent(false)\" instead.")
  protected def CreateWaitHandle: System.Threading.WaitHandle
   
  def BeginRead(buffer : Array[UByte], offset : Int, count : Int, callback : System.AsyncCallback, 
                state : AnyRef): System.IAsyncResult
   
  def EndRead(asyncResult : System.IAsyncResult): Int
   
  def BeginWrite(buffer : Array[UByte], offset : Int, count : Int, callback : System.AsyncCallback, 
                 state : AnyRef): System.IAsyncResult
   
  def EndWrite(asyncResult : System.IAsyncResult): Unit
   
  /* abstract */ def Seek(offset : Long, origin : System.IO.SeekOrigin): Long
   
  /* abstract */ def SetLength(value : Long): Unit
   
  /* abstract */ def Read(buffer : Array[UByte], offset : Int, count : Int): Int
   
  def ReadByte: Int
   
  /* abstract */ def Write(buffer : Array[UByte], offset : Int, count : Int): Unit
   
  def WriteByte(value : UByte): Unit
   
  val CanRead : Boolean = false
   
  val CanSeek : Boolean = false
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val CanTimeout : Boolean = false
   
  val CanWrite : Boolean = false
   
  val Length : Long = 0
   
  var Position : Long = 0
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var ReadTimeout : Int = 0
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var WriteTimeout : Int = 0
   
  protected def this() {}
}
object Stream {
  def Synchronized(stream : System.IO.Stream): System.IO.Stream  = null
   
  val Null : System.IO.Stream  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class BinaryReader extends AnyRef with System.IDisposable {
  def Close: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  def PeekChar: Int
   
  def Read: Int
   
  def ReadBoolean: Boolean
   
  def ReadByte: UByte
   
  @System.CLSCompliantAttribute(false)
  def ReadSByte: Byte
   
  def ReadChar: Char
   
  def ReadInt16: Short
   
  @System.CLSCompliantAttribute(false)
  def ReadUInt16: UShort
   
  def ReadInt32: Int
   
  @System.CLSCompliantAttribute(false)
  def ReadUInt32: UInt
   
  def ReadInt64: Long
   
  @System.CLSCompliantAttribute(false)
  def ReadUInt64: ULong
   
  def ReadSingle: Float
   
  def ReadDouble: Double
   
  def ReadDecimal: System.Decimal
   
  def ReadString: String
   
  def Read(buffer : Array[Char], index : Int, count : Int): Int
   
  def ReadChars(count : Int): Array[Char]
   
  def Read(buffer : Array[UByte], index : Int, count : Int): Int
   
  def ReadBytes(count : Int): Array[UByte]
   
  protected def FillBuffer(numBytes : Int): Unit
   
  protected def Read7BitEncodedInt: Int
   
  val BaseStream : System.IO.Stream = null
   
  def this(input : System.IO.Stream) {}
   
  def this(input : System.IO.Stream, encoding : System.Text.Encoding) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class BinaryWriter extends AnyRef with System.IDisposable {
  def Close: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  def Flush: Unit
   
  def Seek(offset : Int, origin : System.IO.SeekOrigin): Long
   
  def Write(value : Boolean): Unit
   
  def Write(value : UByte): Unit
   
  @System.CLSCompliantAttribute(false)
  def Write(value : Byte): Unit
   
  def Write(buffer : Array[UByte]): Unit
   
  def Write(buffer : Array[UByte], index : Int, count : Int): Unit
   
  def Write(ch : Char): Unit
   
  def Write(chars : Array[Char]): Unit
   
  def Write(chars : Array[Char], index : Int, count : Int): Unit
   
  def Write(value : Double): Unit
   
  def Write(value : System.Decimal): Unit
   
  def Write(value : Short): Unit
   
  @System.CLSCompliantAttribute(false)
  def Write(value : UShort): Unit
   
  def Write(value : Int): Unit
   
  @System.CLSCompliantAttribute(false)
  def Write(value : UInt): Unit
   
  def Write(value : Long): Unit
   
  @System.CLSCompliantAttribute(false)
  def Write(value : ULong): Unit
   
  def Write(value : Float): Unit
   
  def Write(value : String): Unit
   
  protected def Write7BitEncodedInt(value : Int): Unit
   
  protected var OutStream : System.IO.Stream
   
  val BaseStream : System.IO.Stream = null
   
  protected def this() {}
   
  def this(output : System.IO.Stream) {}
   
  def this(output : System.IO.Stream, encoding : System.Text.Encoding) {}
}
object BinaryWriter {
  val Null : System.IO.BinaryWriter  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class BufferedStream extends System.IO.Stream {
  protected def Dispose(disposing : Boolean): Unit
   
  def Flush: Unit
   
  def Read(array : Array[UByte], offset : Int, count : Int): Int
   
  def ReadByte: Int
   
  def Write(array : Array[UByte], offset : Int, count : Int): Unit
   
  def WriteByte(value : UByte): Unit
   
  def Seek(offset : Long, origin : System.IO.SeekOrigin): Long
   
  def SetLength(value : Long): Unit
   
  val CanRead : Boolean = false
   
  val CanWrite : Boolean = false
   
  val CanSeek : Boolean = false
   
  val Length : Long = 0
   
  var Position : Long = 0
   
  def this(stream : System.IO.Stream) {}
   
  def this(stream : System.IO.Stream, bufferSize : Int) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract sealed class Directory extends AnyRef 
object Directory {
  def GetParent(path : String): System.IO.DirectoryInfo  = null
   
  def CreateDirectory(path : String): System.IO.DirectoryInfo  = null
   
  def CreateDirectory(path : String, directorySecurity : System.Security.AccessControl.DirectorySecurity): System.IO.DirectoryInfo  = null
   
  def Exists(path : String): Boolean  = false
   
  def SetCreationTime(path : String, creationTime : System.DateTime): Unit  = {}
   
  def SetCreationTimeUtc(path : String, creationTimeUtc : System.DateTime): Unit  = {}
   
  def GetCreationTime(path : String): System.DateTime  = new System.DateTime()
   
  def GetCreationTimeUtc(path : String): System.DateTime  = new System.DateTime()
   
  def SetLastWriteTime(path : String, lastWriteTime : System.DateTime): Unit  = {}
   
  def SetLastWriteTimeUtc(path : String, lastWriteTimeUtc : System.DateTime): Unit  = {}
   
  def GetLastWriteTime(path : String): System.DateTime  = new System.DateTime()
   
  def GetLastWriteTimeUtc(path : String): System.DateTime  = new System.DateTime()
   
  def SetLastAccessTime(path : String, lastAccessTime : System.DateTime): Unit  = {}
   
  def SetLastAccessTimeUtc(path : String, lastAccessTimeUtc : System.DateTime): Unit  = {}
   
  def GetLastAccessTime(path : String): System.DateTime  = new System.DateTime()
   
  def GetLastAccessTimeUtc(path : String): System.DateTime  = new System.DateTime()
   
  def GetAccessControl(path : String): System.Security.AccessControl.DirectorySecurity  = null
   
  def GetAccessControl(path : String, 
                       includeSections : System.Security.AccessControl.AccessControlSections): System.Security.AccessControl.DirectorySecurity  = null
   
  def SetAccessControl(path : String, directorySecurity : System.Security.AccessControl.DirectorySecurity): Unit  = {}
   
  def GetFiles(path : String): Array[String]  = Array.empty[String]
   
  def GetFiles(path : String, searchPattern : String): Array[String]  = Array.empty[String]
   
  def GetFiles(path : String, searchPattern : String, searchOption : System.IO.SearchOption): Array[String]  = Array.empty[String]
   
  def GetDirectories(path : String): Array[String]  = Array.empty[String]
   
  def GetDirectories(path : String, searchPattern : String): Array[String]  = Array.empty[String]
   
  def GetDirectories(path : String, searchPattern : String, searchOption : System.IO.SearchOption): Array[String]  = Array.empty[String]
   
  def GetFileSystemEntries(path : String): Array[String]  = Array.empty[String]
   
  def GetFileSystemEntries(path : String, searchPattern : String): Array[String]  = Array.empty[String]
   
  def GetLogicalDrives: Array[String]  = Array.empty[String]
   
  def GetDirectoryRoot(path : String): String  = ""
   
  def GetCurrentDirectory: String  = ""
   
  def SetCurrentDirectory(path : String): Unit  = {}
   
  def Move(sourceDirName : String, destDirName : String): Unit  = {}
   
  def Delete(path : String): Unit  = {}
   
  def Delete(path : String, recursive : Boolean): Unit  = {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class FileSystemInfo extends System.MarshalByRefObject with System.Runtime.Serialization.ISerializable {
  /* abstract */ def Delete: Unit
   
  def Refresh: Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  protected var FullPath : String
   
  protected var OriginalPath : String
   
  val FullName : String = ""
   
  val Extension : String = ""
   
  val Name : String = ""
   
  val Exists : Boolean = false
   
  var CreationTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var CreationTimeUtc : System.DateTime = new System.DateTime()
   
  var LastAccessTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var LastAccessTimeUtc : System.DateTime = new System.DateTime()
   
  var LastWriteTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var LastWriteTimeUtc : System.DateTime = new System.DateTime()
   
  var Attributes : System.IO.FileAttributes = System.IO.FileAttributes.ReadOnly
   
  protected def this() {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class DirectoryInfo extends System.IO.FileSystemInfo {
  def CreateSubdirectory(path : String): System.IO.DirectoryInfo
   
  def CreateSubdirectory(path : String, directorySecurity : System.Security.AccessControl.DirectorySecurity): System.IO.DirectoryInfo
   
  def Create: Unit
   
  def Create(directorySecurity : System.Security.AccessControl.DirectorySecurity): Unit
   
  def GetAccessControl: System.Security.AccessControl.DirectorySecurity
   
  def GetAccessControl(includeSections : System.Security.AccessControl.AccessControlSections): System.Security.AccessControl.DirectorySecurity
   
  def SetAccessControl(directorySecurity : System.Security.AccessControl.DirectorySecurity): Unit
   
  def GetFiles(searchPattern : String): Array[System.IO.FileInfo]
   
  def GetFiles(searchPattern : String, searchOption : System.IO.SearchOption): Array[System.IO.FileInfo]
   
  def GetFiles: Array[System.IO.FileInfo]
   
  def GetDirectories: Array[System.IO.DirectoryInfo]
   
  def GetFileSystemInfos(searchPattern : String): Array[System.IO.FileSystemInfo]
   
  def GetFileSystemInfos: Array[System.IO.FileSystemInfo]
   
  def GetDirectories(searchPattern : String): Array[System.IO.DirectoryInfo]
   
  def GetDirectories(searchPattern : String, searchOption : System.IO.SearchOption): Array[System.IO.DirectoryInfo]
   
  def MoveTo(destDirName : String): Unit
   
  def Delete: Unit
   
  def Delete(recursive : Boolean): Unit
   
  def ToString: String
   
  val Name : String = ""
   
  val Parent : System.IO.DirectoryInfo = null
   
  val Exists : Boolean = false
   
  val Root : System.IO.DirectoryInfo = null
   
  def this(path : String) {}
}
 
sealed abstract class SearchOption extends System.Enum {
  def ==(that: System.IO.SearchOption): Boolean = false
  def !=(that: System.IO.SearchOption): Boolean = false
  def  <(that: System.IO.SearchOption): Boolean = false
  def <=(that: System.IO.SearchOption): Boolean = false
  def  >(that: System.IO.SearchOption): Boolean = false
  def >=(that: System.IO.SearchOption): Boolean = false
  def  |(that: System.IO.SearchOption): Boolean = false
  def  &(that: System.IO.SearchOption): Boolean = false
  def  ^(that: System.IO.SearchOption): Boolean = false
}
object SearchOption{
  val TopDirectoryOnly	 = value(0)
  val AllDirectories	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.IO.SearchOption = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class IOException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, hresult : Int) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class DirectoryNotFoundException extends System.IO.IOException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
sealed abstract class DriveType extends System.Enum {
  def ==(that: System.IO.DriveType): Boolean = false
  def !=(that: System.IO.DriveType): Boolean = false
  def  <(that: System.IO.DriveType): Boolean = false
  def <=(that: System.IO.DriveType): Boolean = false
  def  >(that: System.IO.DriveType): Boolean = false
  def >=(that: System.IO.DriveType): Boolean = false
  def  |(that: System.IO.DriveType): Boolean = false
  def  &(that: System.IO.DriveType): Boolean = false
  def  ^(that: System.IO.DriveType): Boolean = false
}
object DriveType{
  val Unknown	 = value(0)
  val NoRootDirectory	 = value(1)
  val Removable	 = value(2)
  val Fixed	 = value(3)
  val Network	 = value(4)
  val CDRom	 = value(5)
  val Ram	 = value(6)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.IO.DriveType = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class DriveInfo extends AnyRef with System.Runtime.Serialization.ISerializable {
  def ToString: String
   
  val Name : String = ""
   
  val DriveType : System.IO.DriveType = System.IO.DriveType.Unknown
   
  val DriveFormat : String = ""
   
  val IsReady : Boolean = false
   
  val AvailableFreeSpace : Long = 0
   
  val TotalFreeSpace : Long = 0
   
  val TotalSize : Long = 0
   
  val RootDirectory : System.IO.DirectoryInfo = null
   
  var VolumeLabel : String = ""
   
  def this(driveName : String) {}
}
object DriveInfo {
  def GetDrives: Array[System.IO.DriveInfo]  = Array.empty[System.IO.DriveInfo]
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class DriveNotFoundException extends System.IO.IOException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class EndOfStreamException extends System.IO.IOException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract sealed class File extends AnyRef 
object File {
  def OpenText(path : String): System.IO.StreamReader  = null
   
  def CreateText(path : String): System.IO.StreamWriter  = null
   
  def AppendText(path : String): System.IO.StreamWriter  = null
   
  def Copy(sourceFileName : String, destFileName : String): Unit  = {}
   
  def Copy(sourceFileName : String, destFileName : String, overwrite : Boolean): Unit  = {}
   
  def Create(path : String): System.IO.FileStream  = null
   
  def Create(path : String, bufferSize : Int): System.IO.FileStream  = null
   
  def Create(path : String, bufferSize : Int, options : System.IO.FileOptions): System.IO.FileStream  = null
   
  def Create(path : String, bufferSize : Int, options : System.IO.FileOptions, 
             fileSecurity : System.Security.AccessControl.FileSecurity): System.IO.FileStream  = null
   
  def Delete(path : String): Unit  = {}
   
  def Decrypt(path : String): Unit  = {}
   
  def Encrypt(path : String): Unit  = {}
   
  def Exists(path : String): Boolean  = false
   
  def Open(path : String, mode : System.IO.FileMode): System.IO.FileStream  = null
   
  def Open(path : String, mode : System.IO.FileMode, access : System.IO.FileAccess): System.IO.FileStream  = null
   
  def Open(path : String, mode : System.IO.FileMode, access : System.IO.FileAccess, 
           share : System.IO.FileShare): System.IO.FileStream  = null
   
  def SetCreationTime(path : String, creationTime : System.DateTime): Unit  = {}
   
  def SetCreationTimeUtc(path : String, creationTimeUtc : System.DateTime): Unit  = {}
   
  def GetCreationTime(path : String): System.DateTime  = new System.DateTime()
   
  def GetCreationTimeUtc(path : String): System.DateTime  = new System.DateTime()
   
  def SetLastAccessTime(path : String, lastAccessTime : System.DateTime): Unit  = {}
   
  def SetLastAccessTimeUtc(path : String, lastAccessTimeUtc : System.DateTime): Unit  = {}
   
  def GetLastAccessTime(path : String): System.DateTime  = new System.DateTime()
   
  def GetLastAccessTimeUtc(path : String): System.DateTime  = new System.DateTime()
   
  def SetLastWriteTime(path : String, lastWriteTime : System.DateTime): Unit  = {}
   
  def SetLastWriteTimeUtc(path : String, lastWriteTimeUtc : System.DateTime): Unit  = {}
   
  def GetLastWriteTime(path : String): System.DateTime  = new System.DateTime()
   
  def GetLastWriteTimeUtc(path : String): System.DateTime  = new System.DateTime()
   
  def GetAttributes(path : String): System.IO.FileAttributes  = System.IO.FileAttributes.ReadOnly
   
  def SetAttributes(path : String, fileAttributes : System.IO.FileAttributes): Unit  = {}
   
  def GetAccessControl(path : String): System.Security.AccessControl.FileSecurity  = null
   
  def GetAccessControl(path : String, 
                       includeSections : System.Security.AccessControl.AccessControlSections): System.Security.AccessControl.FileSecurity  = null
   
  def SetAccessControl(path : String, fileSecurity : System.Security.AccessControl.FileSecurity): Unit  = {}
   
  def OpenRead(path : String): System.IO.FileStream  = null
   
  def OpenWrite(path : String): System.IO.FileStream  = null
   
  def ReadAllText(path : String): String  = ""
   
  def ReadAllText(path : String, encoding : System.Text.Encoding): String  = ""
   
  def WriteAllText(path : String, contents : String): Unit  = {}
   
  def WriteAllText(path : String, contents : String, encoding : System.Text.Encoding): Unit  = {}
   
  def ReadAllBytes(path : String): Array[UByte]  = Array.empty[UByte]
   
  def WriteAllBytes(path : String, bytes : Array[UByte]): Unit  = {}
   
  def ReadAllLines(path : String): Array[String]  = Array.empty[String]
   
  def ReadAllLines(path : String, encoding : System.Text.Encoding): Array[String]  = Array.empty[String]
   
  def WriteAllLines(path : String, contents : Array[String]): Unit  = {}
   
  def WriteAllLines(path : String, contents : Array[String], encoding : System.Text.Encoding): Unit  = {}
   
  def AppendAllText(path : String, contents : String): Unit  = {}
   
  def AppendAllText(path : String, contents : String, encoding : System.Text.Encoding): Unit  = {}
   
  def Move(sourceFileName : String, destFileName : String): Unit  = {}
   
  def Replace(sourceFileName : String, destinationFileName : String, 
              destinationBackupFileName : String): Unit  = {}
   
  def Replace(sourceFileName : String, destinationFileName : String, 
              destinationBackupFileName : String, ignoreMetadataErrors : Boolean): Unit  = {}
}
 
sealed abstract class FileAccess extends System.Enum {
  def ==(that: System.IO.FileAccess): Boolean = false
  def !=(that: System.IO.FileAccess): Boolean = false
  def  <(that: System.IO.FileAccess): Boolean = false
  def <=(that: System.IO.FileAccess): Boolean = false
  def  >(that: System.IO.FileAccess): Boolean = false
  def >=(that: System.IO.FileAccess): Boolean = false
  def  |(that: System.IO.FileAccess): Boolean = false
  def  &(that: System.IO.FileAccess): Boolean = false
  def  ^(that: System.IO.FileAccess): Boolean = false
}
object FileAccess{
  val Read	 = value(1)
  val Write	 = value(2)
  val ReadWrite	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.IO.FileAccess = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class FileInfo extends System.IO.FileSystemInfo {
  def GetAccessControl: System.Security.AccessControl.FileSecurity
   
  def GetAccessControl(includeSections : System.Security.AccessControl.AccessControlSections): System.Security.AccessControl.FileSecurity
   
  def SetAccessControl(fileSecurity : System.Security.AccessControl.FileSecurity): Unit
   
  def OpenText: System.IO.StreamReader
   
  def CreateText: System.IO.StreamWriter
   
  def AppendText: System.IO.StreamWriter
   
  def CopyTo(destFileName : String): System.IO.FileInfo
   
  def CopyTo(destFileName : String, overwrite : Boolean): System.IO.FileInfo
   
  def Create: System.IO.FileStream
   
  def Delete: Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Decrypt: Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Encrypt: Unit
   
  def Open(mode : System.IO.FileMode): System.IO.FileStream
   
  def Open(mode : System.IO.FileMode, access : System.IO.FileAccess): System.IO.FileStream
   
  def Open(mode : System.IO.FileMode, access : System.IO.FileAccess, 
           share : System.IO.FileShare): System.IO.FileStream
   
  def OpenRead: System.IO.FileStream
   
  def OpenWrite: System.IO.FileStream
   
  def MoveTo(destFileName : String): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Replace(destinationFileName : String, destinationBackupFileName : String): System.IO.FileInfo
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Replace(destinationFileName : String, destinationBackupFileName : String, 
              ignoreMetadataErrors : Boolean): System.IO.FileInfo
   
  def ToString: String
   
  val Name : String = ""
   
  val Length : Long = 0
   
  val DirectoryName : String = ""
   
  val Directory : System.IO.DirectoryInfo = null
   
  var IsReadOnly : Boolean = false
   
  val Exists : Boolean = false
   
  def this(fileName : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class FileLoadException extends System.IO.IOException {
  def ToString: String
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  val Message : String = ""
   
  val FileName : String = ""
   
  val FusionLog : String = ""
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  def this(message : String, fileName : String) {}
   
  def this(message : String, fileName : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
sealed abstract class FileMode extends System.Enum {
  def ==(that: System.IO.FileMode): Boolean = false
  def !=(that: System.IO.FileMode): Boolean = false
  def  <(that: System.IO.FileMode): Boolean = false
  def <=(that: System.IO.FileMode): Boolean = false
  def  >(that: System.IO.FileMode): Boolean = false
  def >=(that: System.IO.FileMode): Boolean = false
  def  |(that: System.IO.FileMode): Boolean = false
  def  &(that: System.IO.FileMode): Boolean = false
  def  ^(that: System.IO.FileMode): Boolean = false
}
object FileMode{
  val CreateNew	 = value(1)
  val Create	 = value(2)
  val Open	 = value(3)
  val OpenOrCreate	 = value(4)
  val Truncate	 = value(5)
  val Append	 = value(6)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.IO.FileMode = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class FileNotFoundException extends System.IO.IOException {
  def ToString: String
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  val Message : String = ""
   
  val FileName : String = ""
   
  val FusionLog : String = ""
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  def this(message : String, fileName : String) {}
   
  def this(message : String, fileName : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
sealed abstract class FileOptions extends System.Enum {
  def ==(that: System.IO.FileOptions): Boolean = false
  def !=(that: System.IO.FileOptions): Boolean = false
  def  <(that: System.IO.FileOptions): Boolean = false
  def <=(that: System.IO.FileOptions): Boolean = false
  def  >(that: System.IO.FileOptions): Boolean = false
  def >=(that: System.IO.FileOptions): Boolean = false
  def  |(that: System.IO.FileOptions): Boolean = false
  def  &(that: System.IO.FileOptions): Boolean = false
  def  ^(that: System.IO.FileOptions): Boolean = false
}
object FileOptions{
  val None	 = value(0)
  val WriteThrough	 = value(-2147483648)
  val Asynchronous	 = value(1073741824)
  val RandomAccess	 = value(268435456)
  val DeleteOnClose	 = value(67108864)
  val SequentialScan	 = value(134217728)
  val Encrypted	 = value(16384)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.IO.FileOptions = null
}
 
sealed abstract class FileShare extends System.Enum {
  def ==(that: System.IO.FileShare): Boolean = false
  def !=(that: System.IO.FileShare): Boolean = false
  def  <(that: System.IO.FileShare): Boolean = false
  def <=(that: System.IO.FileShare): Boolean = false
  def  >(that: System.IO.FileShare): Boolean = false
  def >=(that: System.IO.FileShare): Boolean = false
  def  |(that: System.IO.FileShare): Boolean = false
  def  &(that: System.IO.FileShare): Boolean = false
  def  ^(that: System.IO.FileShare): Boolean = false
}
object FileShare{
  val None	 = value(0)
  val Read	 = value(1)
  val Write	 = value(2)
  val ReadWrite	 = value(3)
  val Delete	 = value(4)
  val Inheritable	 = value(16)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.IO.FileShare = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class FileStream extends System.IO.Stream {
  def GetAccessControl: System.Security.AccessControl.FileSecurity
   
  def SetAccessControl(fileSecurity : System.Security.AccessControl.FileSecurity): Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  protected def Finalize: Unit
   
  def Flush: Unit
   
  def SetLength(value : Long): Unit
   
  def Read(array : Array[UByte], offset : Int, count : Int): Int
   
  def Seek(offset : Long, origin : System.IO.SeekOrigin): Long
   
  def Write(array : Array[UByte], offset : Int, count : Int): Unit
   
  def BeginRead(array : Array[UByte], offset : Int, numBytes : Int, 
                userCallback : System.AsyncCallback, stateObject : AnyRef): System.IAsyncResult
   
  def EndRead(asyncResult : System.IAsyncResult): Int
   
  def ReadByte: Int
   
  def BeginWrite(array : Array[UByte], offset : Int, numBytes : Int, 
                 userCallback : System.AsyncCallback, stateObject : AnyRef): System.IAsyncResult
   
  def EndWrite(asyncResult : System.IAsyncResult): Unit
   
  def WriteByte(value : UByte): Unit
   
  def Lock(position : Long, length : Long): Unit
   
  def Unlock(position : Long, length : Long): Unit
   
  val CanRead : Boolean = false
   
  val CanWrite : Boolean = false
   
  val CanSeek : Boolean = false
   
  val IsAsync : Boolean = false
   
  val Length : Long = 0
   
  val Name : String = ""
   
  var Position : Long = 0
   
  @System.ObsoleteAttribute("This property has been deprecated.  Please use FileStream\'s SafeFileHandle property instead.  http://go.microsoft.com/fwlink/?linkid=14202")
  val Handle : System.IntPtr = new System.IntPtr()
   
  val SafeFileHandle : Microsoft.Win32.SafeHandles.SafeFileHandle = null
   
  def this(path : String, mode : System.IO.FileMode) {}
   
  def this(path : String, mode : System.IO.FileMode, access : System.IO.FileAccess) {}
   
  def this(path : String, mode : System.IO.FileMode, access : System.IO.FileAccess, 
           share : System.IO.FileShare) {}
   
  def this(path : String, mode : System.IO.FileMode, access : System.IO.FileAccess, 
           share : System.IO.FileShare, bufferSize : Int) {}
   
  def this(path : String, mode : System.IO.FileMode, access : System.IO.FileAccess, 
           share : System.IO.FileShare, bufferSize : Int, options : System.IO.FileOptions) {}
   
  def this(path : String, mode : System.IO.FileMode, access : System.IO.FileAccess, 
           share : System.IO.FileShare, bufferSize : Int, useAsync : Boolean) {}
   
  def this(path : String, mode : System.IO.FileMode, 
           rights : System.Security.AccessControl.FileSystemRights, 
           share : System.IO.FileShare, bufferSize : Int, options : System.IO.FileOptions, 
           fileSecurity : System.Security.AccessControl.FileSecurity) {}
   
  def this(path : String, mode : System.IO.FileMode, 
           rights : System.Security.AccessControl.FileSystemRights, 
           share : System.IO.FileShare, bufferSize : Int, options : System.IO.FileOptions) {}
   
  @System.ObsoleteAttribute("This constructor has been deprecated.  Please use new FileStream(SafeFileHandle handle, FileAccess access) instead.  http://go.microsoft.com/fwlink/?linkid=14202")
  def this(handle : System.IntPtr, access : System.IO.FileAccess) {}
   
  @System.ObsoleteAttribute("This constructor has been deprecated.  Please use new FileStream(SafeFileHandle handle, FileAccess access) instead, and optionally make a new SafeFileHandle with ownsHandle=false if needed.  http://go.microsoft.com/fwlink/?linkid=14202")
  def this(handle : System.IntPtr, access : System.IO.FileAccess, ownsHandle : Boolean) {}
   
  @System.ObsoleteAttribute("This constructor has been deprecated.  Please use new FileStream(SafeFileHandle handle, FileAccess access, int bufferSize) instead, and optionally make a new SafeFileHandle with ownsHandle=false if needed.  http://go.microsoft.com/fwlink/?linkid=14202")
  def this(handle : System.IntPtr, access : System.IO.FileAccess, ownsHandle : Boolean, 
           bufferSize : Int) {}
   
  @System.ObsoleteAttribute("This constructor has been deprecated.  Please use new FileStream(SafeFileHandle handle, FileAccess access, int bufferSize, bool isAsync) instead, and optionally make a new SafeFileHandle with ownsHandle=false if needed.  http://go.microsoft.com/fwlink/?linkid=14202")
  def this(handle : System.IntPtr, access : System.IO.FileAccess, ownsHandle : Boolean, 
           bufferSize : Int, isAsync : Boolean) {}
   
  def this(handle : Microsoft.Win32.SafeHandles.SafeFileHandle, access : System.IO.FileAccess) {}
   
  def this(handle : Microsoft.Win32.SafeHandles.SafeFileHandle, access : System.IO.FileAccess, 
           bufferSize : Int) {}
   
  def this(handle : Microsoft.Win32.SafeHandles.SafeFileHandle, access : System.IO.FileAccess, 
           bufferSize : Int, isAsync : Boolean) {}
}
 
sealed abstract class FileAttributes extends System.Enum {
  def ==(that: System.IO.FileAttributes): Boolean = false
  def !=(that: System.IO.FileAttributes): Boolean = false
  def  <(that: System.IO.FileAttributes): Boolean = false
  def <=(that: System.IO.FileAttributes): Boolean = false
  def  >(that: System.IO.FileAttributes): Boolean = false
  def >=(that: System.IO.FileAttributes): Boolean = false
  def  |(that: System.IO.FileAttributes): Boolean = false
  def  &(that: System.IO.FileAttributes): Boolean = false
  def  ^(that: System.IO.FileAttributes): Boolean = false
}
object FileAttributes{
  val ReadOnly	 = value(1)
  val Hidden	 = value(2)
  val System	 = value(4)
  val Directory	 = value(16)
  val Archive	 = value(32)
  val Device	 = value(64)
  val Normal	 = value(128)
  val Temporary	 = value(256)
  val SparseFile	 = value(512)
  val ReparsePoint	 = value(1024)
  val Compressed	 = value(2048)
  val Offline	 = value(4096)
  val NotContentIndexed	 = value(8192)
  val Encrypted	 = value(16384)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.IO.FileAttributes = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class MemoryStream extends System.IO.Stream {
  protected def Dispose(disposing : Boolean): Unit
   
  def Flush: Unit
   
  def GetBuffer: Array[UByte]
   
  def Read(buffer : Array[UByte], offset : Int, count : Int): Int
   
  def ReadByte: Int
   
  def Seek(offset : Long, loc : System.IO.SeekOrigin): Long
   
  def SetLength(value : Long): Unit
   
  def ToArray: Array[UByte]
   
  def Write(buffer : Array[UByte], offset : Int, count : Int): Unit
   
  def WriteByte(value : UByte): Unit
   
  def WriteTo(stream : System.IO.Stream): Unit
   
  val CanRead : Boolean = false
   
  val CanSeek : Boolean = false
   
  val CanWrite : Boolean = false
   
  var Capacity : Int = 0
   
  val Length : Long = 0
   
  var Position : Long = 0
   
  def this() {}
   
  def this(capacity : Int) {}
   
  def this(buffer : Array[UByte]) {}
   
  def this(buffer : Array[UByte], writable : Boolean) {}
   
  def this(buffer : Array[UByte], index : Int, count : Int) {}
   
  def this(buffer : Array[UByte], index : Int, count : Int, writable : Boolean) {}
   
  def this(buffer : Array[UByte], index : Int, count : Int, writable : Boolean, 
           publiclyVisible : Boolean) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract sealed class Path extends AnyRef 
object Path {
  def ChangeExtension(path : String, extension : String): String  = ""
   
  def GetDirectoryName(path : String): String  = ""
   
  def GetInvalidPathChars: Array[Char]  = Array.empty[Char]
   
  def GetInvalidFileNameChars: Array[Char]  = Array.empty[Char]
   
  def GetExtension(path : String): String  = ""
   
  def GetFullPath(path : String): String  = ""
   
  def GetFileName(path : String): String  = ""
   
  def GetFileNameWithoutExtension(path : String): String  = ""
   
  def GetPathRoot(path : String): String  = ""
   
  def GetTempPath: String  = ""
   
  def GetRandomFileName: String  = ""
   
  def GetTempFileName: String  = ""
   
  def HasExtension(path : String): Boolean  = false
   
  def IsPathRooted(path : String): Boolean  = false
   
  def Combine(path1 : String, path2 : String): String  = ""
   
  val DirectorySeparatorChar : Char  = '0'
   
  val AltDirectorySeparatorChar : Char  = '0'
   
  val VolumeSeparatorChar : Char  = '0'
   
  @System.ObsoleteAttribute("Please use GetInvalidPathChars or GetInvalidFileNameChars instead.")
  val InvalidPathChars : Array[Char]  = Array.empty[Char]
   
  val PathSeparator : Char  = '0'
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class PathTooLongException extends System.IO.IOException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.CLSCompliantAttribute(false)
class UnmanagedMemoryStream extends System.IO.Stream {
  protected def Dispose(disposing : Boolean): Unit
   
  def Flush: Unit
   
  def Read(buffer : Array[UByte], offset : Int, count : Int): Int
   
  def ReadByte: Int
   
  def Seek(offset : Long, loc : System.IO.SeekOrigin): Long
   
  def SetLength(value : Long): Unit
   
  def Write(buffer : Array[UByte], offset : Int, count : Int): Unit
   
  def WriteByte(value : UByte): Unit
   
  val CanRead : Boolean = false
   
  val CanSeek : Boolean = false
   
  val CanWrite : Boolean = false
   
  val Length : Long = 0
   
  val Capacity : Long = 0
   
  var Position : Long = 0
   
  var PositionPointer : CLRPointer[UByte]
   
  protected def this() {}
   
  def this(pointer : CLRPointer[UByte], length : Long) {}
   
  def this(pointer : CLRPointer[UByte], length : Long, capacity : Long, 
           access : System.IO.FileAccess) {}
}
 
sealed abstract class SeekOrigin extends System.Enum {
  def ==(that: System.IO.SeekOrigin): Boolean = false
  def !=(that: System.IO.SeekOrigin): Boolean = false
  def  <(that: System.IO.SeekOrigin): Boolean = false
  def <=(that: System.IO.SeekOrigin): Boolean = false
  def  >(that: System.IO.SeekOrigin): Boolean = false
  def >=(that: System.IO.SeekOrigin): Boolean = false
  def  |(that: System.IO.SeekOrigin): Boolean = false
  def  &(that: System.IO.SeekOrigin): Boolean = false
  def  ^(that: System.IO.SeekOrigin): Boolean = false
}
object SeekOrigin{
  val Begin	 = value(0)
  val Current	 = value(1)
  val End	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.IO.SeekOrigin = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class TextReader extends System.MarshalByRefObject with System.IDisposable {
  def Close: Unit
   
  def Dispose: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  def Peek: Int
   
  def Read: Int
   
  def Read(buffer : Array[Char], index : Int, count : Int): Int
   
  def ReadToEnd: String
   
  def ReadBlock(buffer : Array[Char], index : Int, count : Int): Int
   
  def ReadLine: String
   
  protected def this() {}
}
object TextReader {
  def Synchronized(reader : System.IO.TextReader): System.IO.TextReader  = null
   
  val Null : System.IO.TextReader  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class StreamReader extends System.IO.TextReader {
  def Close: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  def DiscardBufferedData: Unit
   
  def Peek: Int
   
  def Read: Int
   
  def Read(buffer : Array[Char], index : Int, count : Int): Int
   
  def ReadToEnd: String
   
  def ReadLine: String
   
  val CurrentEncoding : System.Text.Encoding = null
   
  val BaseStream : System.IO.Stream = null
   
  val EndOfStream : Boolean = false
   
  def this(stream : System.IO.Stream) {}
   
  def this(stream : System.IO.Stream, detectEncodingFromByteOrderMarks : Boolean) {}
   
  def this(stream : System.IO.Stream, encoding : System.Text.Encoding) {}
   
  def this(stream : System.IO.Stream, encoding : System.Text.Encoding, 
           detectEncodingFromByteOrderMarks : Boolean) {}
   
  def this(stream : System.IO.Stream, encoding : System.Text.Encoding, 
           detectEncodingFromByteOrderMarks : Boolean, bufferSize : Int) {}
   
  def this(path : String) {}
   
  def this(path : String, detectEncodingFromByteOrderMarks : Boolean) {}
   
  def this(path : String, encoding : System.Text.Encoding) {}
   
  def this(path : String, encoding : System.Text.Encoding, 
           detectEncodingFromByteOrderMarks : Boolean) {}
   
  def this(path : String, encoding : System.Text.Encoding, 
           detectEncodingFromByteOrderMarks : Boolean, bufferSize : Int) {}
}
object StreamReader {
  val Null : System.IO.StreamReader  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class TextWriter extends System.MarshalByRefObject with System.IDisposable {
  def Close: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  def Dispose: Unit
   
  def Flush: Unit
   
  def Write(value : Char): Unit
   
  def Write(buffer : Array[Char]): Unit
   
  def Write(buffer : Array[Char], index : Int, count : Int): Unit
   
  def Write(value : Boolean): Unit
   
  def Write(value : Int): Unit
   
  @System.CLSCompliantAttribute(false)
  def Write(value : UInt): Unit
   
  def Write(value : Long): Unit
   
  @System.CLSCompliantAttribute(false)
  def Write(value : ULong): Unit
   
  def Write(value : Float): Unit
   
  def Write(value : Double): Unit
   
  def Write(value : System.Decimal): Unit
   
  def Write(value : String): Unit
   
  def Write(value : AnyRef): Unit
   
  def Write(format : String, arg0 : AnyRef): Unit
   
  def Write(format : String, arg0 : AnyRef, arg1 : AnyRef): Unit
   
  def Write(format : String, arg0 : AnyRef, arg1 : AnyRef, arg2 : AnyRef): Unit
   
  def Write(format : String, arg : Array[AnyRef]): Unit
   
  def WriteLine: Unit
   
  def WriteLine(value : Char): Unit
   
  def WriteLine(buffer : Array[Char]): Unit
   
  def WriteLine(buffer : Array[Char], index : Int, count : Int): Unit
   
  def WriteLine(value : Boolean): Unit
   
  def WriteLine(value : Int): Unit
   
  @System.CLSCompliantAttribute(false)
  def WriteLine(value : UInt): Unit
   
  def WriteLine(value : Long): Unit
   
  @System.CLSCompliantAttribute(false)
  def WriteLine(value : ULong): Unit
   
  def WriteLine(value : Float): Unit
   
  def WriteLine(value : Double): Unit
   
  def WriteLine(value : System.Decimal): Unit
   
  def WriteLine(value : String): Unit
   
  def WriteLine(value : AnyRef): Unit
   
  def WriteLine(format : String, arg0 : AnyRef): Unit
   
  def WriteLine(format : String, arg0 : AnyRef, arg1 : AnyRef): Unit
   
  def WriteLine(format : String, arg0 : AnyRef, arg1 : AnyRef, arg2 : AnyRef): Unit
   
  def WriteLine(format : String, arg : Array[AnyRef]): Unit
   
  protected var CoreNewLine : Array[Char]
   
  val FormatProvider : System.IFormatProvider = null
   
  val Encoding : System.Text.Encoding = null
   
  var NewLine : String = ""
   
  protected def this() {}
   
  protected def this(formatProvider : System.IFormatProvider) {}
}
object TextWriter {
  def Synchronized(writer : System.IO.TextWriter): System.IO.TextWriter  = null
   
  val Null : System.IO.TextWriter  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class StreamWriter extends System.IO.TextWriter {
  def Close: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  def Flush: Unit
   
  def Write(value : Char): Unit
   
  def Write(buffer : Array[Char]): Unit
   
  def Write(buffer : Array[Char], index : Int, count : Int): Unit
   
  def Write(value : String): Unit
   
  var AutoFlush : Boolean = false
   
  val BaseStream : System.IO.Stream = null
   
  val Encoding : System.Text.Encoding = null
   
  def this(stream : System.IO.Stream) {}
   
  def this(stream : System.IO.Stream, encoding : System.Text.Encoding) {}
   
  def this(stream : System.IO.Stream, encoding : System.Text.Encoding, bufferSize : Int) {}
   
  def this(path : String) {}
   
  def this(path : String, append : Boolean) {}
   
  def this(path : String, append : Boolean, encoding : System.Text.Encoding) {}
   
  def this(path : String, append : Boolean, encoding : System.Text.Encoding, bufferSize : Int) {}
}
object StreamWriter {
  val Null : System.IO.StreamWriter  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class StringReader extends System.IO.TextReader {
  def Close: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  def Peek: Int
   
  def Read: Int
   
  def Read(buffer : Array[Char], index : Int, count : Int): Int
   
  def ReadToEnd: String
   
  def ReadLine: String
   
  def this(s : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class StringWriter extends System.IO.TextWriter {
  def Close: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  def GetStringBuilder: System.Text.StringBuilder
   
  def Write(value : Char): Unit
   
  def Write(buffer : Array[Char], index : Int, count : Int): Unit
   
  def Write(value : String): Unit
   
  def ToString: String
   
  val Encoding : System.Text.Encoding = null
   
  def this() {}
   
  def this(formatProvider : System.IFormatProvider) {}
   
  def this(sb : System.Text.StringBuilder) {}
   
  def this(sb : System.Text.StringBuilder, formatProvider : System.IFormatProvider) {}
}
 
}