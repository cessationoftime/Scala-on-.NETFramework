 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Diagnostics.SymbolStore {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISymbolBinder {
  @System.ObsoleteAttribute("The recommended alternative is ISymbolBinder1.GetReader. ISymbolBinder1.GetReader takes the importer interface pointer as an IntPtr instead of an Int32, and thus works on both 32-bit and 64-bit architectures. http://go.microsoft.com/fwlink/?linkid=14202=14202")
  /* abstract */ def GetReader(importer : Int, filename : String, searchPath : String): System.Diagnostics.SymbolStore.ISymbolReader
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISymbolBinder1 {
  /* abstract */ def GetReader(importer : System.IntPtr, filename : String, searchPath : String): System.Diagnostics.SymbolStore.ISymbolReader
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISymbolDocument {
  /* abstract */ def GetCheckSum: Array[UByte]
   
  /* abstract */ def FindClosestLine(line : Int): Int
   
  /* abstract */ def GetSourceRange(startLine : Int, startColumn : Int, endLine : Int, endColumn : Int): Array[UByte]
   
  val URL : String = ""
   
  val DocumentType : System.Guid = new System.Guid()
   
  val Language : System.Guid = new System.Guid()
   
  val LanguageVendor : System.Guid = new System.Guid()
   
  val CheckSumAlgorithmId : System.Guid = new System.Guid()
   
  val HasEmbeddedSource : Boolean = false
   
  val SourceLength : Int = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISymbolDocumentWriter {
  /* abstract */ def SetSource(source : Array[UByte]): Unit
   
  /* abstract */ def SetCheckSum(algorithmId : System.Guid, checkSum : Array[UByte]): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISymbolMethod {
  /* abstract */ def GetSequencePoints(offsets : Array[Int], 
                                       documents : Array[System.Diagnostics.SymbolStore.ISymbolDocument], 
                                       lines : Array[Int], columns : Array[Int], endLines : Array[Int], 
                                       endColumns : Array[Int]): Unit
   
  /* abstract */ def GetScope(offset : Int): System.Diagnostics.SymbolStore.ISymbolScope
   
  /* abstract */ def GetOffset(document : System.Diagnostics.SymbolStore.ISymbolDocument, line : Int, column : Int): Int
   
  /* abstract */ def GetRanges(document : System.Diagnostics.SymbolStore.ISymbolDocument, line : Int, column : Int): Array[Int]
   
  /* abstract */ def GetParameters: Array[System.Diagnostics.SymbolStore.ISymbolVariable]
   
  /* abstract */ def GetNamespace: System.Diagnostics.SymbolStore.ISymbolNamespace
   
  /* abstract */ def GetSourceStartEnd(docs : Array[System.Diagnostics.SymbolStore.ISymbolDocument], lines : Array[Int], 
                                       columns : Array[Int]): Boolean
   
  val Token : System.Diagnostics.SymbolStore.SymbolToken = new System.Diagnostics.SymbolStore.SymbolToken()
   
  val SequencePointCount : Int = 0
   
  val RootScope : System.Diagnostics.SymbolStore.ISymbolScope = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISymbolNamespace {
  /* abstract */ def GetNamespaces: Array[System.Diagnostics.SymbolStore.ISymbolNamespace]
   
  /* abstract */ def GetVariables: Array[System.Diagnostics.SymbolStore.ISymbolVariable]
   
  val Name : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISymbolReader {
  /* abstract */ def GetDocument(url : String, language : System.Guid, languageVendor : System.Guid, 
                                 documentType : System.Guid): System.Diagnostics.SymbolStore.ISymbolDocument
   
  /* abstract */ def GetDocuments: Array[System.Diagnostics.SymbolStore.ISymbolDocument]
   
  /* abstract */ def GetMethod(method : System.Diagnostics.SymbolStore.SymbolToken): System.Diagnostics.SymbolStore.ISymbolMethod
   
  /* abstract */ def GetMethod(method : System.Diagnostics.SymbolStore.SymbolToken, version : Int): System.Diagnostics.SymbolStore.ISymbolMethod
   
  /* abstract */ def GetVariables(parent : System.Diagnostics.SymbolStore.SymbolToken): Array[System.Diagnostics.SymbolStore.ISymbolVariable]
   
  /* abstract */ def GetGlobalVariables: Array[System.Diagnostics.SymbolStore.ISymbolVariable]
   
  /* abstract */ def GetMethodFromDocumentPosition(document : System.Diagnostics.SymbolStore.ISymbolDocument, line : Int, column : Int): System.Diagnostics.SymbolStore.ISymbolMethod
   
  /* abstract */ def GetSymAttribute(parent : System.Diagnostics.SymbolStore.SymbolToken, name : String): Array[UByte]
   
  /* abstract */ def GetNamespaces: Array[System.Diagnostics.SymbolStore.ISymbolNamespace]
   
  val UserEntryPoint : System.Diagnostics.SymbolStore.SymbolToken = new System.Diagnostics.SymbolStore.SymbolToken()
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISymbolScope {
  /* abstract */ def GetChildren: Array[System.Diagnostics.SymbolStore.ISymbolScope]
   
  /* abstract */ def GetLocals: Array[System.Diagnostics.SymbolStore.ISymbolVariable]
   
  /* abstract */ def GetNamespaces: Array[System.Diagnostics.SymbolStore.ISymbolNamespace]
   
  val Method : System.Diagnostics.SymbolStore.ISymbolMethod = null
   
  val Parent : System.Diagnostics.SymbolStore.ISymbolScope = null
   
  val StartOffset : Int = 0
   
  val EndOffset : Int = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISymbolVariable {
  /* abstract */ def GetSignature: Array[UByte]
   
  val Name : String = ""
   
  val Attributes : AnyRef = null
   
  val AddressKind : System.Diagnostics.SymbolStore.SymAddressKind = System.Diagnostics.SymbolStore.SymAddressKind.ILOffset
   
  val AddressField1 : Int = 0
   
  val AddressField2 : Int = 0
   
  val AddressField3 : Int = 0
   
  val StartOffset : Int = 0
   
  val EndOffset : Int = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISymbolWriter {
  /* abstract */ def Initialize(emitter : System.IntPtr, filename : String, fFullBuild : Boolean): Unit
   
  /* abstract */ def DefineDocument(url : String, language : System.Guid, languageVendor : System.Guid, 
                                    documentType : System.Guid): System.Diagnostics.SymbolStore.ISymbolDocumentWriter
   
  /* abstract */ def SetUserEntryPoint(entryMethod : System.Diagnostics.SymbolStore.SymbolToken): Unit
   
  /* abstract */ def OpenMethod(method : System.Diagnostics.SymbolStore.SymbolToken): Unit
   
  /* abstract */ def CloseMethod: Unit
   
  /* abstract */ def DefineSequencePoints(document : System.Diagnostics.SymbolStore.ISymbolDocumentWriter, 
                                          offsets : Array[Int], lines : Array[Int], columns : Array[Int], endLines : Array[Int], 
                                          endColumns : Array[Int]): Unit
   
  /* abstract */ def OpenScope(startOffset : Int): Int
   
  /* abstract */ def CloseScope(endOffset : Int): Unit
   
  /* abstract */ def SetScopeRange(scopeID : Int, startOffset : Int, endOffset : Int): Unit
   
  /* abstract */ def DefineLocalVariable(name : String, attributes : System.Reflection.FieldAttributes, 
                                         signature : Array[UByte], addrKind : System.Diagnostics.SymbolStore.SymAddressKind, 
                                         addr1 : Int, addr2 : Int, addr3 : Int, startOffset : Int, endOffset : Int): Unit
   
  /* abstract */ def DefineParameter(name : String, attributes : System.Reflection.ParameterAttributes, sequence : Int, 
                                     addrKind : System.Diagnostics.SymbolStore.SymAddressKind, addr1 : Int, addr2 : Int, 
                                     addr3 : Int): Unit
   
  /* abstract */ def DefineField(parent : System.Diagnostics.SymbolStore.SymbolToken, name : String, 
                                 attributes : System.Reflection.FieldAttributes, signature : Array[UByte], 
                                 addrKind : System.Diagnostics.SymbolStore.SymAddressKind, addr1 : Int, addr2 : Int, 
                                 addr3 : Int): Unit
   
  /* abstract */ def DefineGlobalVariable(name : String, attributes : System.Reflection.FieldAttributes, 
                                          signature : Array[UByte], addrKind : System.Diagnostics.SymbolStore.SymAddressKind, 
                                          addr1 : Int, addr2 : Int, addr3 : Int): Unit
   
  /* abstract */ def Close: Unit
   
  /* abstract */ def SetSymAttribute(parent : System.Diagnostics.SymbolStore.SymbolToken, name : String, 
                                     data : Array[UByte]): Unit
   
  /* abstract */ def OpenNamespace(name : String): Unit
   
  /* abstract */ def CloseNamespace: Unit
   
  /* abstract */ def UsingNamespace(fullName : String): Unit
   
  /* abstract */ def SetMethodSourceRange(startDoc : System.Diagnostics.SymbolStore.ISymbolDocumentWriter, startLine : Int, 
                                          startColumn : Int, endDoc : System.Diagnostics.SymbolStore.ISymbolDocumentWriter, 
                                          endLine : Int, endColumn : Int): Unit
   
  /* abstract */ def SetUnderlyingWriter(underlyingWriter : System.IntPtr): Unit
}
 
sealed abstract class SymAddressKind extends System.Enum {
  def ==(that: System.Diagnostics.SymbolStore.SymAddressKind): Boolean = false
  def !=(that: System.Diagnostics.SymbolStore.SymAddressKind): Boolean = false
  def  <(that: System.Diagnostics.SymbolStore.SymAddressKind): Boolean = false
  def <=(that: System.Diagnostics.SymbolStore.SymAddressKind): Boolean = false
  def  >(that: System.Diagnostics.SymbolStore.SymAddressKind): Boolean = false
  def >=(that: System.Diagnostics.SymbolStore.SymAddressKind): Boolean = false
  def  |(that: System.Diagnostics.SymbolStore.SymAddressKind): Boolean = false
  def  &(that: System.Diagnostics.SymbolStore.SymAddressKind): Boolean = false
  def  ^(that: System.Diagnostics.SymbolStore.SymAddressKind): Boolean = false
}
object SymAddressKind{
  val ILOffset	 = value(1)
  val NativeRVA	 = value(2)
  val NativeRegister	 = value(3)
  val NativeRegisterRelative	 = value(4)
  val NativeOffset	 = value(5)
  val NativeRegisterRegister	 = value(6)
  val NativeRegisterStack	 = value(7)
  val NativeStackRegister	 = value(8)
  val BitField	 = value(9)
  val NativeSectionOffset	 = value(10)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Diagnostics.SymbolStore.SymAddressKind = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SymDocumentType extends AnyRef {
  def this() {}
}
object SymDocumentType {
  val Text : System.Guid  = new System.Guid()
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SymLanguageType extends AnyRef {
  def this() {}
}
object SymLanguageType {
  val C : System.Guid  = new System.Guid()
   
  val CPlusPlus : System.Guid  = new System.Guid()
   
  val CSharp : System.Guid  = new System.Guid()
   
  val Basic : System.Guid  = new System.Guid()
   
  val Java : System.Guid  = new System.Guid()
   
  val Cobol : System.Guid  = new System.Guid()
   
  val Pascal : System.Guid  = new System.Guid()
   
  val ILAssembly : System.Guid  = new System.Guid()
   
  val JScript : System.Guid  = new System.Guid()
   
  val SMC : System.Guid  = new System.Guid()
   
  val MCPlusPlus : System.Guid  = new System.Guid()
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SymLanguageVendor extends AnyRef {
  def this() {}
}
object SymLanguageVendor {
  val Microsoft : System.Guid  = new System.Guid()
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SymbolToken extends System.ValueType {
  def GetToken: Int
   
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : System.Diagnostics.SymbolStore.SymbolToken): Boolean
   
  def this(`val` : Int) {}
}
object SymbolToken {
  def ==(a : System.Diagnostics.SymbolStore.SymbolToken, 
         b : System.Diagnostics.SymbolStore.SymbolToken): Boolean  = false
   
  def !=(a : System.Diagnostics.SymbolStore.SymbolToken, 
         b : System.Diagnostics.SymbolStore.SymbolToken): Boolean  = false
}
 
}