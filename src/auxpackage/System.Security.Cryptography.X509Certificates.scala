 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Security.Cryptography.X509Certificates {
 
sealed abstract class X509ContentType extends System.Enum {
  def ==(that: System.Security.Cryptography.X509Certificates.X509ContentType): Boolean = false
  def !=(that: System.Security.Cryptography.X509Certificates.X509ContentType): Boolean = false
  def  <(that: System.Security.Cryptography.X509Certificates.X509ContentType): Boolean = false
  def <=(that: System.Security.Cryptography.X509Certificates.X509ContentType): Boolean = false
  def  >(that: System.Security.Cryptography.X509Certificates.X509ContentType): Boolean = false
  def >=(that: System.Security.Cryptography.X509Certificates.X509ContentType): Boolean = false
  def  |(that: System.Security.Cryptography.X509Certificates.X509ContentType): Boolean = false
  def  &(that: System.Security.Cryptography.X509Certificates.X509ContentType): Boolean = false
  def  ^(that: System.Security.Cryptography.X509Certificates.X509ContentType): Boolean = false
}
object X509ContentType{
  val Unknown	 = value(0)
  val Cert	 = value(1)
  val SerializedCert	 = value(2)
  val Pfx	 = value(3)
  val Pkcs12	 = value(3)
  val SerializedStore	 = value(4)
  val Pkcs7	 = value(5)
  val Authenticode	 = value(6)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Cryptography.X509Certificates.X509ContentType = null
}
 
sealed abstract class X509KeyStorageFlags extends System.Enum {
  def ==(that: System.Security.Cryptography.X509Certificates.X509KeyStorageFlags): Boolean = false
  def !=(that: System.Security.Cryptography.X509Certificates.X509KeyStorageFlags): Boolean = false
  def  <(that: System.Security.Cryptography.X509Certificates.X509KeyStorageFlags): Boolean = false
  def <=(that: System.Security.Cryptography.X509Certificates.X509KeyStorageFlags): Boolean = false
  def  >(that: System.Security.Cryptography.X509Certificates.X509KeyStorageFlags): Boolean = false
  def >=(that: System.Security.Cryptography.X509Certificates.X509KeyStorageFlags): Boolean = false
  def  |(that: System.Security.Cryptography.X509Certificates.X509KeyStorageFlags): Boolean = false
  def  &(that: System.Security.Cryptography.X509Certificates.X509KeyStorageFlags): Boolean = false
  def  ^(that: System.Security.Cryptography.X509Certificates.X509KeyStorageFlags): Boolean = false
}
object X509KeyStorageFlags{
  val DefaultKeySet	 = value(0)
  val UserKeySet	 = value(1)
  val MachineKeySet	 = value(2)
  val Exportable	 = value(4)
  val UserProtected	 = value(8)
  val PersistKeySet	 = value(16)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Security.Cryptography.X509Certificates.X509KeyStorageFlags = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class X509Certificate extends AnyRef with System.Runtime.Serialization.IDeserializationCallback with 
                              System.Runtime.Serialization.ISerializable {
  @System.ObsoleteAttribute("This method has been deprecated.  Please use the Subject property instead.  http://go.microsoft.com/fwlink/?linkid=14202")
  def GetName: String
   
  @System.ObsoleteAttribute("This method has been deprecated.  Please use the Issuer property instead.  http://go.microsoft.com/fwlink/?linkid=14202")
  def GetIssuerName: String
   
  def GetSerialNumber: Array[UByte]
   
  def GetSerialNumberString: String
   
  def GetKeyAlgorithmParameters: Array[UByte]
   
  def GetKeyAlgorithmParametersString: String
   
  def GetKeyAlgorithm: String
   
  def GetPublicKey: Array[UByte]
   
  def GetPublicKeyString: String
   
  def GetRawCertData: Array[UByte]
   
  def GetRawCertDataString: String
   
  def GetCertHash: Array[UByte]
   
  def GetCertHashString: String
   
  def GetEffectiveDateString: String
   
  def GetExpirationDateString: String
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Equals(obj : AnyRef): Boolean
   
  def Equals(other : System.Security.Cryptography.X509Certificates.X509Certificate): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def ToString(fVerbose : Boolean): String
   
  def GetFormat: String
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Import(rawData : Array[UByte]): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Import(rawData : Array[UByte], password : String, 
             keyStorageFlags : System.Security.Cryptography.X509Certificates.X509KeyStorageFlags): Unit
   
  def Import(rawData : Array[UByte], password : System.Security.SecureString, 
             keyStorageFlags : System.Security.Cryptography.X509Certificates.X509KeyStorageFlags): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Import(fileName : String): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Import(fileName : String, password : String, 
             keyStorageFlags : System.Security.Cryptography.X509Certificates.X509KeyStorageFlags): Unit
   
  def Import(fileName : String, password : System.Security.SecureString, 
             keyStorageFlags : System.Security.Cryptography.X509Certificates.X509KeyStorageFlags): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Export(contentType : System.Security.Cryptography.X509Certificates.X509ContentType): Array[UByte]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Export(contentType : System.Security.Cryptography.X509Certificates.X509ContentType, 
             password : String): Array[UByte]
   
  def Export(contentType : System.Security.Cryptography.X509Certificates.X509ContentType, 
             password : System.Security.SecureString): Array[UByte]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Reset: Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val Handle : System.IntPtr = new System.IntPtr()
   
  val Issuer : String = ""
   
  val Subject : String = ""
   
  def this() {}
   
  def this(data : Array[UByte]) {}
   
  def this(rawData : Array[UByte], password : String) {}
   
  def this(rawData : Array[UByte], password : System.Security.SecureString) {}
   
  def this(rawData : Array[UByte], password : String, 
           keyStorageFlags : System.Security.Cryptography.X509Certificates.X509KeyStorageFlags) {}
   
  def this(rawData : Array[UByte], password : System.Security.SecureString, 
           keyStorageFlags : System.Security.Cryptography.X509Certificates.X509KeyStorageFlags) {}
   
  def this(fileName : String) {}
   
  def this(fileName : String, password : String) {}
   
  def this(fileName : String, password : System.Security.SecureString) {}
   
  def this(fileName : String, password : String, 
           keyStorageFlags : System.Security.Cryptography.X509Certificates.X509KeyStorageFlags) {}
   
  def this(fileName : String, password : System.Security.SecureString, 
           keyStorageFlags : System.Security.Cryptography.X509Certificates.X509KeyStorageFlags) {}
   
  def this(handle : System.IntPtr) {}
   
  def this(cert : System.Security.Cryptography.X509Certificates.X509Certificate) {}
   
  def this(info : System.Runtime.Serialization.SerializationInfo, 
           context : System.Runtime.Serialization.StreamingContext) {}
}
object X509Certificate {
  def CreateFromCertFile(filename : String): System.Security.Cryptography.X509Certificates.X509Certificate  = null
   
  def CreateFromSignedFile(filename : String): System.Security.Cryptography.X509Certificates.X509Certificate  = null
}
 
}