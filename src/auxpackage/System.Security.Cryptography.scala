 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Security.Cryptography {
 
sealed abstract class CipherMode extends System.Enum {
  def ==(that: System.Security.Cryptography.CipherMode): Boolean = false
  def !=(that: System.Security.Cryptography.CipherMode): Boolean = false
  def  <(that: System.Security.Cryptography.CipherMode): Boolean = false
  def <=(that: System.Security.Cryptography.CipherMode): Boolean = false
  def  >(that: System.Security.Cryptography.CipherMode): Boolean = false
  def >=(that: System.Security.Cryptography.CipherMode): Boolean = false
  def  |(that: System.Security.Cryptography.CipherMode): Boolean = false
  def  &(that: System.Security.Cryptography.CipherMode): Boolean = false
  def  ^(that: System.Security.Cryptography.CipherMode): Boolean = false
}
object CipherMode{
  val CBC	 = value(1)
  val ECB	 = value(2)
  val OFB	 = value(3)
  val CFB	 = value(4)
  val CTS	 = value(5)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Cryptography.CipherMode = null
}
 
sealed abstract class PaddingMode extends System.Enum {
  def ==(that: System.Security.Cryptography.PaddingMode): Boolean = false
  def !=(that: System.Security.Cryptography.PaddingMode): Boolean = false
  def  <(that: System.Security.Cryptography.PaddingMode): Boolean = false
  def <=(that: System.Security.Cryptography.PaddingMode): Boolean = false
  def  >(that: System.Security.Cryptography.PaddingMode): Boolean = false
  def >=(that: System.Security.Cryptography.PaddingMode): Boolean = false
  def  |(that: System.Security.Cryptography.PaddingMode): Boolean = false
  def  &(that: System.Security.Cryptography.PaddingMode): Boolean = false
  def  ^(that: System.Security.Cryptography.PaddingMode): Boolean = false
}
object PaddingMode{
  val None	 = value(1)
  val PKCS7	 = value(2)
  val Zeros	 = value(3)
  val ANSIX923	 = value(4)
  val ISO10126	 = value(5)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Cryptography.PaddingMode = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class KeySizes extends AnyRef {
  val MinSize : Int = 0
   
  val MaxSize : Int = 0
   
  val SkipSize : Int = 0
   
  def this(minSize : Int, maxSize : Int, skipSize : Int) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class CryptographicException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(format : String, insert : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  def this(hr : Int) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class CryptographicUnexpectedOperationException extends System.Security.Cryptography.CryptographicException {
  def this() {}
   
  def this(message : String) {}
   
  def this(format : String, insert : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ICryptoTransform extends System.IDisposable {
  /* abstract */ def TransformBlock(inputBuffer : Array[UByte], inputOffset : Int, inputCount : Int, 
                                    outputBuffer : Array[UByte], outputOffset : Int): Int
   
  /* abstract */ def TransformFinalBlock(inputBuffer : Array[UByte], inputOffset : Int, inputCount : Int): Array[UByte]
   
  val InputBlockSize : Int = 0
   
  val OutputBlockSize : Int = 0
   
  val CanTransformMultipleBlocks : Boolean = false
   
  val CanReuseTransform : Boolean = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class RandomNumberGenerator extends AnyRef {
  /* abstract */ def GetBytes(data : Array[UByte]): Unit
   
  /* abstract */ def GetNonZeroBytes(data : Array[UByte]): Unit
   
  protected def this() {}
}
object RandomNumberGenerator {
  def Create: System.Security.Cryptography.RandomNumberGenerator  = null
   
  def Create(rngName : String): System.Security.Cryptography.RandomNumberGenerator  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class RNGCryptoServiceProvider extends System.Security.Cryptography.RandomNumberGenerator {
  def GetBytes(data : Array[UByte]): Unit
   
  def GetNonZeroBytes(data : Array[UByte]): Unit
   
  def this() {}
   
  def this(str : String) {}
   
  def this(rgb : Array[UByte]) {}
   
  def this(cspParams : System.Security.Cryptography.CspParameters) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class AsymmetricAlgorithm extends AnyRef with System.IDisposable {
  def Clear: Unit
   
  protected /* abstract */ def Dispose(disposing : Boolean): Unit
   
  /* abstract */ def FromXmlString(xmlString : String): Unit
   
  /* abstract */ def ToXmlString(includePrivateParameters : Boolean): String
   
  protected var KeySizeValue : Int
   
  protected var LegalKeySizesValue : Array[System.Security.Cryptography.KeySizes]
   
  var KeySize : Int = 0
   
  val LegalKeySizes : Array[System.Security.Cryptography.KeySizes] = Array.empty[System.Security.Cryptography.KeySizes]
   
  val SignatureAlgorithm : String = ""
   
  val KeyExchangeAlgorithm : String = ""
   
  protected def this() {}
}
object AsymmetricAlgorithm {
  def Create: System.Security.Cryptography.AsymmetricAlgorithm  = null
   
  def Create(algName : String): System.Security.Cryptography.AsymmetricAlgorithm  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class AsymmetricKeyExchangeDeformatter extends AnyRef {
  /* abstract */ def SetKey(key : System.Security.Cryptography.AsymmetricAlgorithm): Unit
   
  /* abstract */ def DecryptKeyExchange(rgb : Array[UByte]): Array[UByte]
   
  var Parameters : String = ""
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class AsymmetricKeyExchangeFormatter extends AnyRef {
  /* abstract */ def SetKey(key : System.Security.Cryptography.AsymmetricAlgorithm): Unit
   
  /* abstract */ def CreateKeyExchange(data : Array[UByte]): Array[UByte]
   
  /* abstract */ def CreateKeyExchange(data : Array[UByte], symAlgType : System.Type): Array[UByte]
   
  val Parameters : String = ""
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class AsymmetricSignatureDeformatter extends AnyRef {
  /* abstract */ def SetKey(key : System.Security.Cryptography.AsymmetricAlgorithm): Unit
   
  /* abstract */ def SetHashAlgorithm(strName : String): Unit
   
  def VerifySignature(hash : System.Security.Cryptography.HashAlgorithm, rgbSignature : Array[UByte]): Boolean
   
  /* abstract */ def VerifySignature(rgbHash : Array[UByte], rgbSignature : Array[UByte]): Boolean
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class AsymmetricSignatureFormatter extends AnyRef {
  /* abstract */ def SetKey(key : System.Security.Cryptography.AsymmetricAlgorithm): Unit
   
  /* abstract */ def SetHashAlgorithm(strName : String): Unit
   
  def CreateSignature(hash : System.Security.Cryptography.HashAlgorithm): Array[UByte]
   
  /* abstract */ def CreateSignature(rgbHash : Array[UByte]): Array[UByte]
   
  protected def this() {}
}
 
sealed abstract class FromBase64TransformMode extends System.Enum {
  def ==(that: System.Security.Cryptography.FromBase64TransformMode): Boolean = false
  def !=(that: System.Security.Cryptography.FromBase64TransformMode): Boolean = false
  def  <(that: System.Security.Cryptography.FromBase64TransformMode): Boolean = false
  def <=(that: System.Security.Cryptography.FromBase64TransformMode): Boolean = false
  def  >(that: System.Security.Cryptography.FromBase64TransformMode): Boolean = false
  def >=(that: System.Security.Cryptography.FromBase64TransformMode): Boolean = false
  def  |(that: System.Security.Cryptography.FromBase64TransformMode): Boolean = false
  def  &(that: System.Security.Cryptography.FromBase64TransformMode): Boolean = false
  def  ^(that: System.Security.Cryptography.FromBase64TransformMode): Boolean = false
}
object FromBase64TransformMode{
  val IgnoreWhiteSpaces	 = value(0)
  val DoNotIgnoreWhiteSpaces	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Cryptography.FromBase64TransformMode = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ToBase64Transform extends AnyRef with System.Security.Cryptography.ICryptoTransform with System.IDisposable {
  def TransformBlock(inputBuffer : Array[UByte], inputOffset : Int, inputCount : Int, 
                     outputBuffer : Array[UByte], outputOffset : Int): Int
   
  def TransformFinalBlock(inputBuffer : Array[UByte], inputOffset : Int, inputCount : Int): Array[UByte]
   
  def Clear: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  protected def Finalize: Unit
   
  val InputBlockSize : Int = 0
   
  val OutputBlockSize : Int = 0
   
  val CanTransformMultipleBlocks : Boolean = false
   
  val CanReuseTransform : Boolean = false
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class FromBase64Transform extends AnyRef with System.Security.Cryptography.ICryptoTransform with System.IDisposable {
  def TransformBlock(inputBuffer : Array[UByte], inputOffset : Int, inputCount : Int, 
                     outputBuffer : Array[UByte], outputOffset : Int): Int
   
  def TransformFinalBlock(inputBuffer : Array[UByte], inputOffset : Int, inputCount : Int): Array[UByte]
   
  def Clear: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  protected def Finalize: Unit
   
  val InputBlockSize : Int = 0
   
  val OutputBlockSize : Int = 0
   
  val CanTransformMultipleBlocks : Boolean = false
   
  val CanReuseTransform : Boolean = false
   
  def this() {}
   
  def this(whitespaces : System.Security.Cryptography.FromBase64TransformMode) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class CryptoAPITransform extends AnyRef with System.Security.Cryptography.ICryptoTransform with System.IDisposable {
  def Clear: Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Reset: Unit
   
  def TransformBlock(inputBuffer : Array[UByte], inputOffset : Int, inputCount : Int, 
                     outputBuffer : Array[UByte], outputOffset : Int): Int
   
  def TransformFinalBlock(inputBuffer : Array[UByte], inputOffset : Int, inputCount : Int): Array[UByte]
   
  val KeyHandle : System.IntPtr = new System.IntPtr()
   
  val InputBlockSize : Int = 0
   
  val OutputBlockSize : Int = 0
   
  val CanTransformMultipleBlocks : Boolean = false
   
  val CanReuseTransform : Boolean = false
}
 
sealed abstract class CspProviderFlags extends System.Enum {
  def ==(that: System.Security.Cryptography.CspProviderFlags): Boolean = false
  def !=(that: System.Security.Cryptography.CspProviderFlags): Boolean = false
  def  <(that: System.Security.Cryptography.CspProviderFlags): Boolean = false
  def <=(that: System.Security.Cryptography.CspProviderFlags): Boolean = false
  def  >(that: System.Security.Cryptography.CspProviderFlags): Boolean = false
  def >=(that: System.Security.Cryptography.CspProviderFlags): Boolean = false
  def  |(that: System.Security.Cryptography.CspProviderFlags): Boolean = false
  def  &(that: System.Security.Cryptography.CspProviderFlags): Boolean = false
  def  ^(that: System.Security.Cryptography.CspProviderFlags): Boolean = false
}
object CspProviderFlags{
  val NoFlags	 = value(0)
  val UseMachineKeyStore	 = value(1)
  val UseDefaultKeyContainer	 = value(2)
  val UseNonExportableKey	 = value(4)
  val UseExistingKey	 = value(8)
  val UseArchivableKey	 = value(16)
  val UseUserProtectedKey	 = value(32)
  val NoPrompt	 = value(64)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Cryptography.CspProviderFlags = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class CspParameters extends AnyRef {
  var ProviderType : Int
   
  var ProviderName : String
   
  var KeyContainerName : String
   
  var KeyNumber : Int
   
  var Flags : System.Security.Cryptography.CspProviderFlags = System.Security.Cryptography.CspProviderFlags.NoFlags
   
  var CryptoKeySecurity : System.Security.AccessControl.CryptoKeySecurity = null
   
  var KeyPassword : System.Security.SecureString = null
   
  var ParentWindowHandle : System.IntPtr = new System.IntPtr()
   
  def this() {}
   
  def this(dwTypeIn : Int) {}
   
  def this(dwTypeIn : Int, strProviderNameIn : String) {}
   
  def this(dwTypeIn : Int, strProviderNameIn : String, strContainerNameIn : String) {}
   
  def this(providerType : Int, providerName : String, keyContainerName : String, 
           cryptoKeySecurity : System.Security.AccessControl.CryptoKeySecurity, 
           keyPassword : System.Security.SecureString) {}
   
  def this(providerType : Int, providerName : String, keyContainerName : String, 
           cryptoKeySecurity : System.Security.AccessControl.CryptoKeySecurity, 
           parentWindowHandle : System.IntPtr) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class CryptoConfig extends AnyRef {
  def this() {}
}
object CryptoConfig {
  def CreateFromName(name : String, args : Array[AnyRef]): AnyRef  = null
   
  def CreateFromName(name : String): AnyRef  = null
   
  def MapNameToOID(name : String): String  = ""
   
  def EncodeOID(str : String): Array[UByte]  = Array.empty[UByte]
}
 
sealed abstract class CryptoStreamMode extends System.Enum {
  def ==(that: System.Security.Cryptography.CryptoStreamMode): Boolean = false
  def !=(that: System.Security.Cryptography.CryptoStreamMode): Boolean = false
  def  <(that: System.Security.Cryptography.CryptoStreamMode): Boolean = false
  def <=(that: System.Security.Cryptography.CryptoStreamMode): Boolean = false
  def  >(that: System.Security.Cryptography.CryptoStreamMode): Boolean = false
  def >=(that: System.Security.Cryptography.CryptoStreamMode): Boolean = false
  def  |(that: System.Security.Cryptography.CryptoStreamMode): Boolean = false
  def  &(that: System.Security.Cryptography.CryptoStreamMode): Boolean = false
  def  ^(that: System.Security.Cryptography.CryptoStreamMode): Boolean = false
}
object CryptoStreamMode{
  val Read	 = value(0)
  val Write	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Cryptography.CryptoStreamMode = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class CryptoStream extends System.IO.Stream with System.IDisposable {
  def FlushFinalBlock: Unit
   
  def Flush: Unit
   
  def Seek(offset : Long, origin : System.IO.SeekOrigin): Long
   
  def SetLength(value : Long): Unit
   
  def Read(buffer : Array[UByte], offset : Int, count : Int): Int
   
  def Write(buffer : Array[UByte], offset : Int, count : Int): Unit
   
  def Clear: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  val CanRead : Boolean = false
   
  val CanSeek : Boolean = false
   
  val CanWrite : Boolean = false
   
  val Length : Long = 0
   
  var Position : Long = 0
   
  def this(stream : System.IO.Stream, 
           transform : System.Security.Cryptography.ICryptoTransform, 
           mode : System.Security.Cryptography.CryptoStreamMode) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class SymmetricAlgorithm extends AnyRef with System.IDisposable {
  def Clear: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  def ValidKeySize(bitLength : Int): Boolean
   
  def CreateEncryptor: System.Security.Cryptography.ICryptoTransform
   
  /* abstract */ def CreateEncryptor(rgbKey : Array[UByte], rgbIV : Array[UByte]): System.Security.Cryptography.ICryptoTransform
   
  def CreateDecryptor: System.Security.Cryptography.ICryptoTransform
   
  /* abstract */ def CreateDecryptor(rgbKey : Array[UByte], rgbIV : Array[UByte]): System.Security.Cryptography.ICryptoTransform
   
  /* abstract */ def GenerateKey: Unit
   
  /* abstract */ def GenerateIV: Unit
   
  protected var BlockSizeValue : Int
   
  protected var FeedbackSizeValue : Int
   
  protected var IVValue : Array[UByte]
   
  protected var KeyValue : Array[UByte]
   
  protected var LegalBlockSizesValue : Array[System.Security.Cryptography.KeySizes]
   
  protected var LegalKeySizesValue : Array[System.Security.Cryptography.KeySizes]
   
  protected var KeySizeValue : Int
   
  protected var ModeValue : System.Security.Cryptography.CipherMode
   
  protected var PaddingValue : System.Security.Cryptography.PaddingMode
   
  var BlockSize : Int = 0
   
  var FeedbackSize : Int = 0
   
  var IV : Array[UByte] = Array.empty[UByte]
   
  var Key : Array[UByte] = Array.empty[UByte]
   
  val LegalBlockSizes : Array[System.Security.Cryptography.KeySizes] = Array.empty[System.Security.Cryptography.KeySizes]
   
  val LegalKeySizes : Array[System.Security.Cryptography.KeySizes] = Array.empty[System.Security.Cryptography.KeySizes]
   
  var KeySize : Int = 0
   
  var Mode : System.Security.Cryptography.CipherMode = System.Security.Cryptography.CipherMode.CBC
   
  var Padding : System.Security.Cryptography.PaddingMode = System.Security.Cryptography.PaddingMode.None
   
  protected def this() {}
}
object SymmetricAlgorithm {
  def Create: System.Security.Cryptography.SymmetricAlgorithm  = null
   
  def Create(algName : String): System.Security.Cryptography.SymmetricAlgorithm  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class DES extends System.Security.Cryptography.SymmetricAlgorithm {
  var Key : Array[UByte] = Array.empty[UByte]
   
  protected def this() {}
}
object DES {
  def Create: System.Security.Cryptography.DES  = null
   
  def Create(algName : String): System.Security.Cryptography.DES  = null
   
  def IsWeakKey(rgbKey : Array[UByte]): Boolean  = false
   
  def IsSemiWeakKey(rgbKey : Array[UByte]): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class DESCryptoServiceProvider extends System.Security.Cryptography.DES {
  def CreateEncryptor(rgbKey : Array[UByte], rgbIV : Array[UByte]): System.Security.Cryptography.ICryptoTransform
   
  def CreateDecryptor(rgbKey : Array[UByte], rgbIV : Array[UByte]): System.Security.Cryptography.ICryptoTransform
   
  def GenerateKey: Unit
   
  def GenerateIV: Unit
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class DeriveBytes extends AnyRef {
  /* abstract */ def GetBytes(cb : Int): Array[UByte]
   
  /* abstract */ def Reset: Unit
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class DSAParameters extends System.ValueType {
  var P : Array[UByte]
   
  var Q : Array[UByte]
   
  var G : Array[UByte]
   
  var Y : Array[UByte]
   
  var J : Array[UByte]
   
  var X : Array[UByte]
   
  var Seed : Array[UByte]
   
  var Counter : Int
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class DSA extends System.Security.Cryptography.AsymmetricAlgorithm {
  /* abstract */ def CreateSignature(rgbHash : Array[UByte]): Array[UByte]
   
  /* abstract */ def VerifySignature(rgbHash : Array[UByte], rgbSignature : Array[UByte]): Boolean
   
  def FromXmlString(xmlString : String): Unit
   
  def ToXmlString(includePrivateParameters : Boolean): String
   
  /* abstract */ def ExportParameters(includePrivateParameters : Boolean): System.Security.Cryptography.DSAParameters
   
  /* abstract */ def ImportParameters(parameters : System.Security.Cryptography.DSAParameters): Unit
   
  protected def this() {}
}
object DSA {
  def Create: System.Security.Cryptography.DSA  = null
   
  def Create(algName : String): System.Security.Cryptography.DSA  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ICspAsymmetricAlgorithm {
  /* abstract */ def ExportCspBlob(includePrivateParameters : Boolean): Array[UByte]
   
  /* abstract */ def ImportCspBlob(rawData : Array[UByte]): Unit
   
  val CspKeyContainerInfo : System.Security.Cryptography.CspKeyContainerInfo = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class DSACryptoServiceProvider extends System.Security.Cryptography.DSA with 
                                              System.Security.Cryptography.ICspAsymmetricAlgorithm {
  protected def Dispose(disposing : Boolean): Unit
   
  def ExportParameters(includePrivateParameters : Boolean): System.Security.Cryptography.DSAParameters
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def ExportCspBlob(includePrivateParameters : Boolean): Array[UByte]
   
  def ImportParameters(parameters : System.Security.Cryptography.DSAParameters): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def ImportCspBlob(keyBlob : Array[UByte]): Unit
   
  def SignData(inputStream : System.IO.Stream): Array[UByte]
   
  def SignData(buffer : Array[UByte]): Array[UByte]
   
  def SignData(buffer : Array[UByte], offset : Int, count : Int): Array[UByte]
   
  def VerifyData(rgbData : Array[UByte], rgbSignature : Array[UByte]): Boolean
   
  def CreateSignature(rgbHash : Array[UByte]): Array[UByte]
   
  def VerifySignature(rgbHash : Array[UByte], rgbSignature : Array[UByte]): Boolean
   
  def SignHash(rgbHash : Array[UByte], str : String): Array[UByte]
   
  def VerifyHash(rgbHash : Array[UByte], str : String, rgbSignature : Array[UByte]): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val PublicOnly : Boolean = false
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val CspKeyContainerInfo : System.Security.Cryptography.CspKeyContainerInfo = null
   
  val KeySize : Int = 0
   
  val KeyExchangeAlgorithm : String = ""
   
  val SignatureAlgorithm : String = ""
   
  var PersistKeyInCsp : Boolean = false
   
  def this() {}
   
  def this(dwKeySize : Int) {}
   
  def this(parameters : System.Security.Cryptography.CspParameters) {}
   
  def this(dwKeySize : Int, parameters : System.Security.Cryptography.CspParameters) {}
}
object DSACryptoServiceProvider {
  var UseMachineKeyStore : Boolean = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class DSASignatureDeformatter extends System.Security.Cryptography.AsymmetricSignatureDeformatter {
  def SetKey(key : System.Security.Cryptography.AsymmetricAlgorithm): Unit
   
  def SetHashAlgorithm(strName : String): Unit
   
  def VerifySignature(rgbHash : Array[UByte], rgbSignature : Array[UByte]): Boolean
   
  def this() {}
   
  def this(key : System.Security.Cryptography.AsymmetricAlgorithm) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class DSASignatureFormatter extends System.Security.Cryptography.AsymmetricSignatureFormatter {
  def SetKey(key : System.Security.Cryptography.AsymmetricAlgorithm): Unit
   
  def SetHashAlgorithm(strName : String): Unit
   
  def CreateSignature(rgbHash : Array[UByte]): Array[UByte]
   
  def this() {}
   
  def this(key : System.Security.Cryptography.AsymmetricAlgorithm) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class HashAlgorithm extends AnyRef with System.Security.Cryptography.ICryptoTransform with System.IDisposable {
  def ComputeHash(inputStream : System.IO.Stream): Array[UByte]
   
  def ComputeHash(buffer : Array[UByte]): Array[UByte]
   
  def ComputeHash(buffer : Array[UByte], offset : Int, count : Int): Array[UByte]
   
  def TransformBlock(inputBuffer : Array[UByte], inputOffset : Int, inputCount : Int, 
                     outputBuffer : Array[UByte], outputOffset : Int): Int
   
  def TransformFinalBlock(inputBuffer : Array[UByte], inputOffset : Int, inputCount : Int): Array[UByte]
   
  def Clear: Unit
   
  protected def Dispose(disposing : Boolean): Unit
   
  /* abstract */ def Initialize: Unit
   
  protected /* abstract */ def HashCore(array : Array[UByte], ibStart : Int, cbSize : Int): Unit
   
  protected /* abstract */ def HashFinal: Array[UByte]
   
  protected var HashSizeValue : Int
   
  protected var HashValue : Array[UByte]
   
  protected var State : Int
   
  val HashSize : Int = 0
   
  val Hash : Array[UByte] = Array.empty[UByte]
   
  val InputBlockSize : Int = 0
   
  val OutputBlockSize : Int = 0
   
  val CanTransformMultipleBlocks : Boolean = false
   
  val CanReuseTransform : Boolean = false
   
  protected def this() {}
}
object HashAlgorithm {
  def Create: System.Security.Cryptography.HashAlgorithm  = null
   
  def Create(hashName : String): System.Security.Cryptography.HashAlgorithm  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class KeyedHashAlgorithm extends System.Security.Cryptography.HashAlgorithm {
  protected def Dispose(disposing : Boolean): Unit
   
  protected var KeyValue : Array[UByte]
   
  var Key : Array[UByte] = Array.empty[UByte]
   
  protected def this() {}
}
object KeyedHashAlgorithm {
  def Create: System.Security.Cryptography.KeyedHashAlgorithm  = null
   
  def Create(algName : String): System.Security.Cryptography.KeyedHashAlgorithm  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class HMAC extends System.Security.Cryptography.KeyedHashAlgorithm {
  protected def get_BlockSizeValue: Int
   
  protected def set_BlockSizeValue(value : Int): Unit
   
  def Initialize: Unit
   
  protected def HashCore(rgb : Array[UByte], ib : Int, cb : Int): Unit
   
  protected def HashFinal: Array[UByte]
   
  protected def Dispose(disposing : Boolean): Unit
   
  var Key : Array[UByte] = Array.empty[UByte]
   
  var HashName : String = ""
   
  protected def this() {}
}
object HMAC {
  def Create: System.Security.Cryptography.HMAC  = null
   
  def Create(algorithmName : String): System.Security.Cryptography.HMAC  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class HMACMD5 extends System.Security.Cryptography.HMAC {
  def this() {}
   
  def this(key : Array[UByte]) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class HMACRIPEMD160 extends System.Security.Cryptography.HMAC {
  def this() {}
   
  def this(key : Array[UByte]) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class HMACSHA1 extends System.Security.Cryptography.HMAC {
  def this() {}
   
  def this(key : Array[UByte]) {}
   
  def this(key : Array[UByte], useManagedSha1 : Boolean) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class HMACSHA256 extends System.Security.Cryptography.HMAC {
  def this() {}
   
  def this(key : Array[UByte]) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class HMACSHA384 extends System.Security.Cryptography.HMAC {
  var ProduceLegacyHmacValues : Boolean = false
   
  def this() {}
   
  def this(key : Array[UByte]) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class HMACSHA512 extends System.Security.Cryptography.HMAC {
  var ProduceLegacyHmacValues : Boolean = false
   
  def this() {}
   
  def this(key : Array[UByte]) {}
}
 
sealed abstract class KeyNumber extends System.Enum {
  def ==(that: System.Security.Cryptography.KeyNumber): Boolean = false
  def !=(that: System.Security.Cryptography.KeyNumber): Boolean = false
  def  <(that: System.Security.Cryptography.KeyNumber): Boolean = false
  def <=(that: System.Security.Cryptography.KeyNumber): Boolean = false
  def  >(that: System.Security.Cryptography.KeyNumber): Boolean = false
  def >=(that: System.Security.Cryptography.KeyNumber): Boolean = false
  def  |(that: System.Security.Cryptography.KeyNumber): Boolean = false
  def  &(that: System.Security.Cryptography.KeyNumber): Boolean = false
  def  ^(that: System.Security.Cryptography.KeyNumber): Boolean = false
}
object KeyNumber{
  val Exchange	 = value(1)
  val Signature	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Cryptography.KeyNumber = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class CspKeyContainerInfo extends AnyRef {
  val MachineKeyStore : Boolean = false
   
  val ProviderName : String = ""
   
  val ProviderType : Int = 0
   
  val KeyContainerName : String = ""
   
  val UniqueKeyContainerName : String = ""
   
  val KeyNumber : System.Security.Cryptography.KeyNumber = System.Security.Cryptography.KeyNumber.Exchange
   
  val Exportable : Boolean = false
   
  val HardwareDevice : Boolean = false
   
  val Removable : Boolean = false
   
  val Accessible : Boolean = false
   
  val Protected : Boolean = false
   
  val CryptoKeySecurity : System.Security.AccessControl.CryptoKeySecurity = null
   
  val RandomlyGenerated : Boolean = false
   
  def this(parameters : System.Security.Cryptography.CspParameters) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class MACTripleDES extends System.Security.Cryptography.KeyedHashAlgorithm {
  def Initialize: Unit
   
  protected def HashCore(rgbData : Array[UByte], ibStart : Int, cbSize : Int): Unit
   
  protected def HashFinal: Array[UByte]
   
  protected def Dispose(disposing : Boolean): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var Padding : System.Security.Cryptography.PaddingMode = System.Security.Cryptography.PaddingMode.None
   
  def this() {}
   
  def this(rgbKey : Array[UByte]) {}
   
  def this(strTripleDES : String, rgbKey : Array[UByte]) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class MD5 extends System.Security.Cryptography.HashAlgorithm {
  protected def this() {}
}
object MD5 {
  def Create: System.Security.Cryptography.MD5  = null
   
  def Create(algName : String): System.Security.Cryptography.MD5  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class MD5CryptoServiceProvider extends System.Security.Cryptography.MD5 {
  protected def Dispose(disposing : Boolean): Unit
   
  def Initialize: Unit
   
  protected def HashCore(rgb : Array[UByte], ibStart : Int, cbSize : Int): Unit
   
  protected def HashFinal: Array[UByte]
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class MaskGenerationMethod extends AnyRef {
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  /* abstract */ def GenerateMask(rgbSeed : Array[UByte], cbReturn : Int): Array[UByte]
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class PasswordDeriveBytes extends System.Security.Cryptography.DeriveBytes {
  @System.ObsoleteAttribute("Rfc2898DeriveBytes replaces PasswordDeriveBytes for deriving key material from a password and is preferred in new applications.")
  def GetBytes(cb : Int): Array[UByte]
   
  def Reset: Unit
   
  def CryptDeriveKey(algname : String, alghashname : String, keySize : Int, rgbIV : Array[UByte]): Array[UByte]
   
  var HashName : String = ""
   
  var IterationCount : Int = 0
   
  var Salt : Array[UByte] = Array.empty[UByte]
   
  def this(strPassword : String, rgbSalt : Array[UByte]) {}
   
  def this(password : Array[UByte], salt : Array[UByte]) {}
   
  def this(strPassword : String, rgbSalt : Array[UByte], strHashName : String, iterations : Int) {}
   
  def this(password : Array[UByte], salt : Array[UByte], hashName : String, iterations : Int) {}
   
  def this(strPassword : String, rgbSalt : Array[UByte], 
           cspParams : System.Security.Cryptography.CspParameters) {}
   
  def this(password : Array[UByte], salt : Array[UByte], 
           cspParams : System.Security.Cryptography.CspParameters) {}
   
  def this(strPassword : String, rgbSalt : Array[UByte], strHashName : String, iterations : Int, 
           cspParams : System.Security.Cryptography.CspParameters) {}
   
  def this(password : Array[UByte], salt : Array[UByte], hashName : String, iterations : Int, 
           cspParams : System.Security.Cryptography.CspParameters) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class PKCS1MaskGenerationMethod extends System.Security.Cryptography.MaskGenerationMethod {
  def GenerateMask(rgbSeed : Array[UByte], cbReturn : Int): Array[UByte]
   
  var HashName : String = ""
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class RC2 extends System.Security.Cryptography.SymmetricAlgorithm {
  protected var EffectiveKeySizeValue : Int
   
  var EffectiveKeySize : Int = 0
   
  var KeySize : Int = 0
   
  protected def this() {}
}
object RC2 {
  def Create: System.Security.Cryptography.RC2  = null
   
  def Create(AlgName : String): System.Security.Cryptography.RC2  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class RC2CryptoServiceProvider extends System.Security.Cryptography.RC2 {
  def CreateEncryptor(rgbKey : Array[UByte], rgbIV : Array[UByte]): System.Security.Cryptography.ICryptoTransform
   
  def CreateDecryptor(rgbKey : Array[UByte], rgbIV : Array[UByte]): System.Security.Cryptography.ICryptoTransform
   
  def GenerateKey: Unit
   
  def GenerateIV: Unit
   
  var EffectiveKeySize : Int = 0
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var UseSalt : Boolean = false
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class Rfc2898DeriveBytes extends System.Security.Cryptography.DeriveBytes {
  def GetBytes(cb : Int): Array[UByte]
   
  def Reset: Unit
   
  var IterationCount : Int = 0
   
  var Salt : Array[UByte] = Array.empty[UByte]
   
  def this(password : String, saltSize : Int) {}
   
  def this(password : String, saltSize : Int, iterations : Int) {}
   
  def this(password : String, salt : Array[UByte]) {}
   
  def this(password : String, salt : Array[UByte], iterations : Int) {}
   
  def this(password : Array[UByte], salt : Array[UByte], iterations : Int) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class RIPEMD160 extends System.Security.Cryptography.HashAlgorithm {
  protected def this() {}
}
object RIPEMD160 {
  def Create: System.Security.Cryptography.RIPEMD160  = null
   
  def Create(hashName : String): System.Security.Cryptography.RIPEMD160  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class RIPEMD160Managed extends System.Security.Cryptography.RIPEMD160 {
  def Initialize: Unit
   
  protected def HashCore(rgb : Array[UByte], ibStart : Int, cbSize : Int): Unit
   
  protected def HashFinal: Array[UByte]
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class RSAParameters extends System.ValueType {
  var Exponent : Array[UByte]
   
  var Modulus : Array[UByte]
   
  var P : Array[UByte]
   
  var Q : Array[UByte]
   
  var DP : Array[UByte]
   
  var DQ : Array[UByte]
   
  var InverseQ : Array[UByte]
   
  var D : Array[UByte]
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class RSA extends System.Security.Cryptography.AsymmetricAlgorithm {
  /* abstract */ def DecryptValue(rgb : Array[UByte]): Array[UByte]
   
  /* abstract */ def EncryptValue(rgb : Array[UByte]): Array[UByte]
   
  def FromXmlString(xmlString : String): Unit
   
  def ToXmlString(includePrivateParameters : Boolean): String
   
  /* abstract */ def ExportParameters(includePrivateParameters : Boolean): System.Security.Cryptography.RSAParameters
   
  /* abstract */ def ImportParameters(parameters : System.Security.Cryptography.RSAParameters): Unit
   
  protected def this() {}
}
object RSA {
  def Create: System.Security.Cryptography.RSA  = null
   
  def Create(algName : String): System.Security.Cryptography.RSA  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class RSACryptoServiceProvider extends System.Security.Cryptography.RSA with 
                                              System.Security.Cryptography.ICspAsymmetricAlgorithm {
  protected def Dispose(disposing : Boolean): Unit
   
  def ExportParameters(includePrivateParameters : Boolean): System.Security.Cryptography.RSAParameters
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def ExportCspBlob(includePrivateParameters : Boolean): Array[UByte]
   
  def ImportParameters(parameters : System.Security.Cryptography.RSAParameters): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def ImportCspBlob(keyBlob : Array[UByte]): Unit
   
  def SignData(inputStream : System.IO.Stream, halg : AnyRef): Array[UByte]
   
  def SignData(buffer : Array[UByte], halg : AnyRef): Array[UByte]
   
  def SignData(buffer : Array[UByte], offset : Int, count : Int, halg : AnyRef): Array[UByte]
   
  def VerifyData(buffer : Array[UByte], halg : AnyRef, signature : Array[UByte]): Boolean
   
  def SignHash(rgbHash : Array[UByte], str : String): Array[UByte]
   
  def VerifyHash(rgbHash : Array[UByte], str : String, rgbSignature : Array[UByte]): Boolean
   
  def Encrypt(rgb : Array[UByte], fOAEP : Boolean): Array[UByte]
   
  def Decrypt(rgb : Array[UByte], fOAEP : Boolean): Array[UByte]
   
  def DecryptValue(rgb : Array[UByte]): Array[UByte]
   
  def EncryptValue(rgb : Array[UByte]): Array[UByte]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val PublicOnly : Boolean = false
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val CspKeyContainerInfo : System.Security.Cryptography.CspKeyContainerInfo = null
   
  val KeySize : Int = 0
   
  val KeyExchangeAlgorithm : String = ""
   
  val SignatureAlgorithm : String = ""
   
  var PersistKeyInCsp : Boolean = false
   
  def this() {}
   
  def this(dwKeySize : Int) {}
   
  def this(parameters : System.Security.Cryptography.CspParameters) {}
   
  def this(dwKeySize : Int, parameters : System.Security.Cryptography.CspParameters) {}
}
object RSACryptoServiceProvider {
  var UseMachineKeyStore : Boolean = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class RSAOAEPKeyExchangeDeformatter extends System.Security.Cryptography.AsymmetricKeyExchangeDeformatter {
  def DecryptKeyExchange(rgbData : Array[UByte]): Array[UByte]
   
  def SetKey(key : System.Security.Cryptography.AsymmetricAlgorithm): Unit
   
  var Parameters : String = ""
   
  def this() {}
   
  def this(key : System.Security.Cryptography.AsymmetricAlgorithm) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class RSAOAEPKeyExchangeFormatter extends System.Security.Cryptography.AsymmetricKeyExchangeFormatter {
  def SetKey(key : System.Security.Cryptography.AsymmetricAlgorithm): Unit
   
  def CreateKeyExchange(rgbData : Array[UByte]): Array[UByte]
   
  def CreateKeyExchange(rgbData : Array[UByte], symAlgType : System.Type): Array[UByte]
   
  var Parameter : Array[UByte] = Array.empty[UByte]
   
  val Parameters : String = ""
   
  var Rng : System.Security.Cryptography.RandomNumberGenerator = null
   
  def this() {}
   
  def this(key : System.Security.Cryptography.AsymmetricAlgorithm) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class RSAPKCS1KeyExchangeDeformatter extends System.Security.Cryptography.AsymmetricKeyExchangeDeformatter {
  def DecryptKeyExchange(rgbIn : Array[UByte]): Array[UByte]
   
  def SetKey(key : System.Security.Cryptography.AsymmetricAlgorithm): Unit
   
  var RNG : System.Security.Cryptography.RandomNumberGenerator = null
   
  var Parameters : String = ""
   
  def this() {}
   
  def this(key : System.Security.Cryptography.AsymmetricAlgorithm) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class RSAPKCS1KeyExchangeFormatter extends System.Security.Cryptography.AsymmetricKeyExchangeFormatter {
  def SetKey(key : System.Security.Cryptography.AsymmetricAlgorithm): Unit
   
  def CreateKeyExchange(rgbData : Array[UByte]): Array[UByte]
   
  def CreateKeyExchange(rgbData : Array[UByte], symAlgType : System.Type): Array[UByte]
   
  val Parameters : String = ""
   
  var Rng : System.Security.Cryptography.RandomNumberGenerator = null
   
  def this() {}
   
  def this(key : System.Security.Cryptography.AsymmetricAlgorithm) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class RSAPKCS1SignatureDeformatter extends System.Security.Cryptography.AsymmetricSignatureDeformatter {
  def SetKey(key : System.Security.Cryptography.AsymmetricAlgorithm): Unit
   
  def SetHashAlgorithm(strName : String): Unit
   
  def VerifySignature(rgbHash : Array[UByte], rgbSignature : Array[UByte]): Boolean
   
  def this() {}
   
  def this(key : System.Security.Cryptography.AsymmetricAlgorithm) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class RSAPKCS1SignatureFormatter extends System.Security.Cryptography.AsymmetricSignatureFormatter {
  def SetKey(key : System.Security.Cryptography.AsymmetricAlgorithm): Unit
   
  def SetHashAlgorithm(strName : String): Unit
   
  def CreateSignature(rgbHash : Array[UByte]): Array[UByte]
   
  def this() {}
   
  def this(key : System.Security.Cryptography.AsymmetricAlgorithm) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class Rijndael extends System.Security.Cryptography.SymmetricAlgorithm {
  protected def this() {}
}
object Rijndael {
  def Create: System.Security.Cryptography.Rijndael  = null
   
  def Create(algName : String): System.Security.Cryptography.Rijndael  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class RijndaelManaged extends System.Security.Cryptography.Rijndael {
  def CreateEncryptor(rgbKey : Array[UByte], rgbIV : Array[UByte]): System.Security.Cryptography.ICryptoTransform
   
  def CreateDecryptor(rgbKey : Array[UByte], rgbIV : Array[UByte]): System.Security.Cryptography.ICryptoTransform
   
  def GenerateKey: Unit
   
  def GenerateIV: Unit
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class RijndaelManagedTransform extends AnyRef with System.Security.Cryptography.ICryptoTransform with System.IDisposable {
  def Clear: Unit
   
  def TransformBlock(inputBuffer : Array[UByte], inputOffset : Int, inputCount : Int, 
                     outputBuffer : Array[UByte], outputOffset : Int): Int
   
  def TransformFinalBlock(inputBuffer : Array[UByte], inputOffset : Int, inputCount : Int): Array[UByte]
   
  def Reset: Unit
   
  val BlockSizeValue : Int = 0
   
  val InputBlockSize : Int = 0
   
  val OutputBlockSize : Int = 0
   
  val CanTransformMultipleBlocks : Boolean = false
   
  val CanReuseTransform : Boolean = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class SHA1 extends System.Security.Cryptography.HashAlgorithm {
  protected def this() {}
}
object SHA1 {
  def Create: System.Security.Cryptography.SHA1  = null
   
  def Create(hashName : String): System.Security.Cryptography.SHA1  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SHA1CryptoServiceProvider extends System.Security.Cryptography.SHA1 {
  protected def Dispose(disposing : Boolean): Unit
   
  def Initialize: Unit
   
  protected def HashCore(rgb : Array[UByte], ibStart : Int, cbSize : Int): Unit
   
  protected def HashFinal: Array[UByte]
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SHA1Managed extends System.Security.Cryptography.SHA1 {
  def Initialize: Unit
   
  protected def HashCore(rgb : Array[UByte], ibStart : Int, cbSize : Int): Unit
   
  protected def HashFinal: Array[UByte]
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class SHA256 extends System.Security.Cryptography.HashAlgorithm {
  protected def this() {}
}
object SHA256 {
  def Create: System.Security.Cryptography.SHA256  = null
   
  def Create(hashName : String): System.Security.Cryptography.SHA256  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SHA256Managed extends System.Security.Cryptography.SHA256 {
  def Initialize: Unit
   
  protected def HashCore(rgb : Array[UByte], ibStart : Int, cbSize : Int): Unit
   
  protected def HashFinal: Array[UByte]
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class SHA384 extends System.Security.Cryptography.HashAlgorithm {
  protected def this() {}
}
object SHA384 {
  def Create: System.Security.Cryptography.SHA384  = null
   
  def Create(hashName : String): System.Security.Cryptography.SHA384  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SHA384Managed extends System.Security.Cryptography.SHA384 {
  def Initialize: Unit
   
  protected def HashCore(rgb : Array[UByte], ibStart : Int, cbSize : Int): Unit
   
  protected def HashFinal: Array[UByte]
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class SHA512 extends System.Security.Cryptography.HashAlgorithm {
  protected def this() {}
}
object SHA512 {
  def Create: System.Security.Cryptography.SHA512  = null
   
  def Create(hashName : String): System.Security.Cryptography.SHA512  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SHA512Managed extends System.Security.Cryptography.SHA512 {
  def Initialize: Unit
   
  protected def HashCore(rgb : Array[UByte], ibStart : Int, cbSize : Int): Unit
   
  protected def HashFinal: Array[UByte]
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SignatureDescription extends AnyRef {
  def CreateDeformatter(key : System.Security.Cryptography.AsymmetricAlgorithm): System.Security.Cryptography.AsymmetricSignatureDeformatter
   
  def CreateFormatter(key : System.Security.Cryptography.AsymmetricAlgorithm): System.Security.Cryptography.AsymmetricSignatureFormatter
   
  def CreateDigest: System.Security.Cryptography.HashAlgorithm
   
  var KeyAlgorithm : String = ""
   
  var DigestAlgorithm : String = ""
   
  var FormatterAlgorithm : String = ""
   
  var DeformatterAlgorithm : String = ""
   
  def this() {}
   
  def this(el : System.Security.SecurityElement) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class TripleDES extends System.Security.Cryptography.SymmetricAlgorithm {
  var Key : Array[UByte] = Array.empty[UByte]
   
  protected def this() {}
}
object TripleDES {
  def Create: System.Security.Cryptography.TripleDES  = null
   
  def Create(str : String): System.Security.Cryptography.TripleDES  = null
   
  def IsWeakKey(rgbKey : Array[UByte]): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class TripleDESCryptoServiceProvider extends System.Security.Cryptography.TripleDES {
  def CreateEncryptor(rgbKey : Array[UByte], rgbIV : Array[UByte]): System.Security.Cryptography.ICryptoTransform
   
  def CreateDecryptor(rgbKey : Array[UByte], rgbIV : Array[UByte]): System.Security.Cryptography.ICryptoTransform
   
  def GenerateKey: Unit
   
  def GenerateIV: Unit
   
  def this() {}
}
 
}