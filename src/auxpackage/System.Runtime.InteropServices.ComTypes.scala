 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.InteropServices.ComTypes {
 
sealed class BIND_OPTS extends System.ValueType {
  var cbStruct : Int
   
  var grfFlags : Int
   
  var grfMode : Int
   
  var dwTickCountDeadline : Int
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("0000000e-0000-0000-C000-000000000046")
trait IBindCtx {
  /* abstract */ def RegisterObjectBound(punk : AnyRef): Unit
   
  /* abstract */ def RevokeObjectBound(punk : AnyRef): Unit
   
  /* abstract */ def ReleaseBoundObjects: Unit
   
  /* abstract */ def SetBindOptions(pbindopts : CLRByRef[System.Runtime.InteropServices.ComTypes.BIND_OPTS]): Unit
   
  /* abstract */ def GetBindOptions(pbindopts : CLRByRef[System.Runtime.InteropServices.ComTypes.BIND_OPTS]): Unit
   
  /* abstract */ def RegisterObjectParam(pszKey : String, punk : AnyRef): Unit
   
  /* abstract */ def RevokeObjectParam(pszKey : String): Int
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("B196B284-BAB4-101A-B69C-00AA00341D07")
trait IConnectionPointContainer 
 
@System.Runtime.InteropServices.GuidAttribute("B196B286-BAB4-101A-B69C-00AA00341D07")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait IConnectionPoint {
  /* abstract */ def GetConnectionInterface(pIID : CLRByRef[System.Guid]): Unit
   
  /* abstract */ def Advise(pUnkSink : AnyRef, pdwCookie : CLRByRef[Int]): Unit
   
  /* abstract */ def Unadvise(dwCookie : Int): Unit
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("00000102-0000-0000-C000-000000000046")
trait IEnumMoniker {
  /* abstract */ def Next(celt : Int, rgelt : Array[System.Runtime.InteropServices.ComTypes.IMoniker], 
                          pceltFetched : System.IntPtr): Int
   
  /* abstract */ def Skip(celt : Int): Int
   
  /* abstract */ def Reset: Unit
}
 
sealed class CONNECTDATA extends System.ValueType {
  var pUnk : AnyRef
   
  var dwCookie : Int
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("B196B287-BAB4-101A-B69C-00AA00341D07")
trait IEnumConnections {
  /* abstract */ def Next(celt : Int, rgelt : Array[System.Runtime.InteropServices.ComTypes.CONNECTDATA], 
                          pceltFetched : System.IntPtr): Int
   
  /* abstract */ def Skip(celt : Int): Int
   
  /* abstract */ def Reset: Unit
}
 
@System.Runtime.InteropServices.GuidAttribute("B196B285-BAB4-101A-B69C-00AA00341D07")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait IEnumConnectionPoints {
  /* abstract */ def Next(celt : Int, 
                          rgelt : Array[System.Runtime.InteropServices.ComTypes.IConnectionPoint], 
                          pceltFetched : System.IntPtr): Int
   
  /* abstract */ def Skip(celt : Int): Int
   
  /* abstract */ def Reset: Unit
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("00000101-0000-0000-C000-000000000046")
trait IEnumString {
  /* abstract */ def Next(celt : Int, rgelt : Array[String], pceltFetched : System.IntPtr): Int
   
  /* abstract */ def Skip(celt : Int): Int
   
  /* abstract */ def Reset: Unit
}
 
@System.Runtime.InteropServices.GuidAttribute("00020404-0000-0000-C000-000000000046")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait IEnumVARIANT {
  /* abstract */ def Next(celt : Int, rgVar : Array[AnyRef], pceltFetched : System.IntPtr): Int
   
  /* abstract */ def Skip(celt : Int): Int
   
  /* abstract */ def Reset: Int
   
  /* abstract */ def Clone: System.Runtime.InteropServices.ComTypes.IEnumVARIANT
}
 
sealed class FILETIME extends System.ValueType {
  var dwLowDateTime : Int
   
  var dwHighDateTime : Int
}
 
@System.Runtime.InteropServices.GuidAttribute("0000000f-0000-0000-C000-000000000046")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait IMoniker {
  /* abstract */ def GetClassID(pClassID : CLRByRef[System.Guid]): Unit
   
  /* abstract */ def IsDirty: Int
   
  /* abstract */ def Load(pStm : System.Runtime.InteropServices.ComTypes.IStream): Unit
   
  /* abstract */ def Save(pStm : System.Runtime.InteropServices.ComTypes.IStream, fClearDirty : Boolean): Unit
   
  /* abstract */ def GetSizeMax(pcbSize : CLRByRef[Long]): Unit
   
  /* abstract */ def IsEqual(pmkOtherMoniker : System.Runtime.InteropServices.ComTypes.IMoniker): Int
   
  /* abstract */ def Hash(pdwHash : CLRByRef[Int]): Unit
   
  /* abstract */ def IsRunning(pbc : System.Runtime.InteropServices.ComTypes.IBindCtx, 
                               pmkToLeft : System.Runtime.InteropServices.ComTypes.IMoniker, 
                               pmkNewlyRunning : System.Runtime.InteropServices.ComTypes.IMoniker): Int
   
  /* abstract */ def GetTimeOfLastChange(pbc : System.Runtime.InteropServices.ComTypes.IBindCtx, 
                                         pmkToLeft : System.Runtime.InteropServices.ComTypes.IMoniker, 
                                         pFileTime : CLRByRef[System.Runtime.InteropServices.ComTypes.FILETIME]): Unit
   
  /* abstract */ def IsSystemMoniker(pdwMksys : CLRByRef[Int]): Int
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("0000010b-0000-0000-C000-000000000046")
trait IPersistFile {
  /* abstract */ def GetClassID(pClassID : CLRByRef[System.Guid]): Unit
   
  /* abstract */ def IsDirty: Int
   
  /* abstract */ def Load(pszFileName : String, dwMode : Int): Unit
   
  /* abstract */ def Save(pszFileName : String, fRemember : Boolean): Unit
   
  /* abstract */ def SaveCompleted(pszFileName : String): Unit
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("00000010-0000-0000-C000-000000000046")
trait IRunningObjectTable {
  /* abstract */ def Register(grfFlags : Int, punkObject : AnyRef, 
                              pmkObjectName : System.Runtime.InteropServices.ComTypes.IMoniker): Int
   
  /* abstract */ def Revoke(dwRegister : Int): Unit
   
  /* abstract */ def IsRunning(pmkObjectName : System.Runtime.InteropServices.ComTypes.IMoniker): Int
   
  /* abstract */ def NoteChangeTime(dwRegister : Int, 
                                    pfiletime : CLRByRef[System.Runtime.InteropServices.ComTypes.FILETIME]): Unit
   
  /* abstract */ def GetTimeOfLastChange(pmkObjectName : System.Runtime.InteropServices.ComTypes.IMoniker, 
                                         pfiletime : CLRByRef[System.Runtime.InteropServices.ComTypes.FILETIME]): Int
}
 
sealed class STATSTG extends System.ValueType {
  var pwcsName : String
   
  var `type` : Int
   
  var cbSize : Long
   
  var mtime : System.Runtime.InteropServices.ComTypes.FILETIME
   
  var ctime : System.Runtime.InteropServices.ComTypes.FILETIME
   
  var atime : System.Runtime.InteropServices.ComTypes.FILETIME
   
  var grfMode : Int
   
  var grfLocksSupported : Int
   
  var clsid : System.Guid
   
  var grfStateBits : Int
   
  var reserved : Int
}
 
@System.Runtime.InteropServices.GuidAttribute("0000000c-0000-0000-C000-000000000046")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait IStream {
  /* abstract */ def Read(pv : Array[UByte], cb : Int, pcbRead : System.IntPtr): Unit
   
  /* abstract */ def Write(pv : Array[UByte], cb : Int, pcbWritten : System.IntPtr): Unit
   
  /* abstract */ def Seek(dlibMove : Long, dwOrigin : Int, plibNewPosition : System.IntPtr): Unit
   
  /* abstract */ def SetSize(libNewSize : Long): Unit
   
  /* abstract */ def CopyTo(pstm : System.Runtime.InteropServices.ComTypes.IStream, cb : Long, 
                            pcbRead : System.IntPtr, pcbWritten : System.IntPtr): Unit
   
  /* abstract */ def Commit(grfCommitFlags : Int): Unit
   
  /* abstract */ def Revert: Unit
   
  /* abstract */ def LockRegion(libOffset : Long, cb : Long, dwLockType : Int): Unit
   
  /* abstract */ def UnlockRegion(libOffset : Long, cb : Long, dwLockType : Int): Unit
   
  /* abstract */ def Stat(pstatstg : CLRByRef[System.Runtime.InteropServices.ComTypes.STATSTG], 
                          grfStatFlag : Int): Unit
}
 
sealed abstract class DESCKIND extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ComTypes.DESCKIND): Boolean = false
  def !=(that: System.Runtime.InteropServices.ComTypes.DESCKIND): Boolean = false
  def  <(that: System.Runtime.InteropServices.ComTypes.DESCKIND): Boolean = false
  def <=(that: System.Runtime.InteropServices.ComTypes.DESCKIND): Boolean = false
  def  >(that: System.Runtime.InteropServices.ComTypes.DESCKIND): Boolean = false
  def >=(that: System.Runtime.InteropServices.ComTypes.DESCKIND): Boolean = false
  def  |(that: System.Runtime.InteropServices.ComTypes.DESCKIND): Boolean = false
  def  &(that: System.Runtime.InteropServices.ComTypes.DESCKIND): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ComTypes.DESCKIND): Boolean = false
}
object DESCKIND{
  val DESCKIND_NONE	 = value(0)
  val DESCKIND_FUNCDESC	 = value(1)
  val DESCKIND_VARDESC	 = value(2)
  val DESCKIND_TYPECOMP	 = value(3)
  val DESCKIND_IMPLICITAPPOBJ	 = value(4)
  val DESCKIND_MAX	 = value(5)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.ComTypes.DESCKIND = null
}
 
sealed class BINDPTR extends System.ValueType {
  var lpfuncdesc : System.IntPtr
   
  var lpvardesc : System.IntPtr
   
  var lptcomp : System.IntPtr
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("00020403-0000-0000-C000-000000000046")
trait ITypeComp 
 
sealed abstract class TYPEKIND extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ComTypes.TYPEKIND): Boolean = false
  def !=(that: System.Runtime.InteropServices.ComTypes.TYPEKIND): Boolean = false
  def  <(that: System.Runtime.InteropServices.ComTypes.TYPEKIND): Boolean = false
  def <=(that: System.Runtime.InteropServices.ComTypes.TYPEKIND): Boolean = false
  def  >(that: System.Runtime.InteropServices.ComTypes.TYPEKIND): Boolean = false
  def >=(that: System.Runtime.InteropServices.ComTypes.TYPEKIND): Boolean = false
  def  |(that: System.Runtime.InteropServices.ComTypes.TYPEKIND): Boolean = false
  def  &(that: System.Runtime.InteropServices.ComTypes.TYPEKIND): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ComTypes.TYPEKIND): Boolean = false
}
object TYPEKIND{
  val TKIND_ENUM	 = value(0)
  val TKIND_RECORD	 = value(1)
  val TKIND_MODULE	 = value(2)
  val TKIND_INTERFACE	 = value(3)
  val TKIND_DISPATCH	 = value(4)
  val TKIND_COCLASS	 = value(5)
  val TKIND_ALIAS	 = value(6)
  val TKIND_UNION	 = value(7)
  val TKIND_MAX	 = value(8)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.ComTypes.TYPEKIND = null
}
 
sealed abstract class TYPEFLAGS extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ComTypes.TYPEFLAGS): Boolean = false
  def !=(that: System.Runtime.InteropServices.ComTypes.TYPEFLAGS): Boolean = false
  def  <(that: System.Runtime.InteropServices.ComTypes.TYPEFLAGS): Boolean = false
  def <=(that: System.Runtime.InteropServices.ComTypes.TYPEFLAGS): Boolean = false
  def  >(that: System.Runtime.InteropServices.ComTypes.TYPEFLAGS): Boolean = false
  def >=(that: System.Runtime.InteropServices.ComTypes.TYPEFLAGS): Boolean = false
  def  |(that: System.Runtime.InteropServices.ComTypes.TYPEFLAGS): Boolean = false
  def  &(that: System.Runtime.InteropServices.ComTypes.TYPEFLAGS): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ComTypes.TYPEFLAGS): Boolean = false
}
object TYPEFLAGS{
  val TYPEFLAG_FAPPOBJECT	 = value(1)
  val TYPEFLAG_FCANCREATE	 = value(2)
  val TYPEFLAG_FLICENSED	 = value(4)
  val TYPEFLAG_FPREDECLID	 = value(8)
  val TYPEFLAG_FHIDDEN	 = value(16)
  val TYPEFLAG_FCONTROL	 = value(32)
  val TYPEFLAG_FDUAL	 = value(64)
  val TYPEFLAG_FNONEXTENSIBLE	 = value(128)
  val TYPEFLAG_FOLEAUTOMATION	 = value(256)
  val TYPEFLAG_FRESTRICTED	 = value(512)
  val TYPEFLAG_FAGGREGATABLE	 = value(1024)
  val TYPEFLAG_FREPLACEABLE	 = value(2048)
  val TYPEFLAG_FDISPATCHABLE	 = value(4096)
  val TYPEFLAG_FREVERSEBIND	 = value(8192)
  val TYPEFLAG_FPROXY	 = value(16384)
   
  /* an artifact for CLR enums */ private def value(i: Short): System.Runtime.InteropServices.ComTypes.TYPEFLAGS = null
}
 
sealed abstract class IMPLTYPEFLAGS extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ComTypes.IMPLTYPEFLAGS): Boolean = false
  def !=(that: System.Runtime.InteropServices.ComTypes.IMPLTYPEFLAGS): Boolean = false
  def  <(that: System.Runtime.InteropServices.ComTypes.IMPLTYPEFLAGS): Boolean = false
  def <=(that: System.Runtime.InteropServices.ComTypes.IMPLTYPEFLAGS): Boolean = false
  def  >(that: System.Runtime.InteropServices.ComTypes.IMPLTYPEFLAGS): Boolean = false
  def >=(that: System.Runtime.InteropServices.ComTypes.IMPLTYPEFLAGS): Boolean = false
  def  |(that: System.Runtime.InteropServices.ComTypes.IMPLTYPEFLAGS): Boolean = false
  def  &(that: System.Runtime.InteropServices.ComTypes.IMPLTYPEFLAGS): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ComTypes.IMPLTYPEFLAGS): Boolean = false
}
object IMPLTYPEFLAGS{
  val IMPLTYPEFLAG_FDEFAULT	 = value(1)
  val IMPLTYPEFLAG_FSOURCE	 = value(2)
  val IMPLTYPEFLAG_FRESTRICTED	 = value(4)
  val IMPLTYPEFLAG_FDEFAULTVTABLE	 = value(8)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.ComTypes.IMPLTYPEFLAGS = null
}
 
sealed class TYPEATTR extends System.ValueType {
  var guid : System.Guid
   
  var lcid : Int
   
  var dwReserved : Int
   
  var memidConstructor : Int
   
  var memidDestructor : Int
   
  var lpstrSchema : System.IntPtr
   
  var cbSizeInstance : Int
   
  var typekind : System.Runtime.InteropServices.ComTypes.TYPEKIND
   
  var cFuncs : Short
   
  var cVars : Short
   
  var cImplTypes : Short
   
  var cbSizeVft : Short
   
  var cbAlignment : Short
   
  var wTypeFlags : System.Runtime.InteropServices.ComTypes.TYPEFLAGS
   
  var wMajorVerNum : Short
   
  var wMinorVerNum : Short
   
  var tdescAlias : System.Runtime.InteropServices.ComTypes.TYPEDESC
   
  var idldescType : System.Runtime.InteropServices.ComTypes.IDLDESC
}
object TYPEATTR {
  val MEMBER_ID_NIL : Int  = 0
}
 
sealed class FUNCDESC extends System.ValueType {
  var memid : Int
   
  var lprgscode : System.IntPtr
   
  var lprgelemdescParam : System.IntPtr
   
  var funckind : System.Runtime.InteropServices.ComTypes.FUNCKIND
   
  var invkind : System.Runtime.InteropServices.ComTypes.INVOKEKIND
   
  var callconv : System.Runtime.InteropServices.ComTypes.CALLCONV
   
  var cParams : Short
   
  var cParamsOpt : Short
   
  var oVft : Short
   
  var cScodes : Short
   
  var elemdescFunc : System.Runtime.InteropServices.ComTypes.ELEMDESC
   
  var wFuncFlags : Short
}
 
sealed abstract class IDLFLAG extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ComTypes.IDLFLAG): Boolean = false
  def !=(that: System.Runtime.InteropServices.ComTypes.IDLFLAG): Boolean = false
  def  <(that: System.Runtime.InteropServices.ComTypes.IDLFLAG): Boolean = false
  def <=(that: System.Runtime.InteropServices.ComTypes.IDLFLAG): Boolean = false
  def  >(that: System.Runtime.InteropServices.ComTypes.IDLFLAG): Boolean = false
  def >=(that: System.Runtime.InteropServices.ComTypes.IDLFLAG): Boolean = false
  def  |(that: System.Runtime.InteropServices.ComTypes.IDLFLAG): Boolean = false
  def  &(that: System.Runtime.InteropServices.ComTypes.IDLFLAG): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ComTypes.IDLFLAG): Boolean = false
}
object IDLFLAG{
  val IDLFLAG_NONE	 = value(0)
  val IDLFLAG_FIN	 = value(1)
  val IDLFLAG_FOUT	 = value(2)
  val IDLFLAG_FLCID	 = value(4)
  val IDLFLAG_FRETVAL	 = value(8)
   
  /* an artifact for CLR enums */ private def value(i: Short): System.Runtime.InteropServices.ComTypes.IDLFLAG = null
}
 
sealed class IDLDESC extends System.ValueType {
  var dwReserved : System.IntPtr
   
  var wIDLFlags : System.Runtime.InteropServices.ComTypes.IDLFLAG
}
 
sealed abstract class PARAMFLAG extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ComTypes.PARAMFLAG): Boolean = false
  def !=(that: System.Runtime.InteropServices.ComTypes.PARAMFLAG): Boolean = false
  def  <(that: System.Runtime.InteropServices.ComTypes.PARAMFLAG): Boolean = false
  def <=(that: System.Runtime.InteropServices.ComTypes.PARAMFLAG): Boolean = false
  def  >(that: System.Runtime.InteropServices.ComTypes.PARAMFLAG): Boolean = false
  def >=(that: System.Runtime.InteropServices.ComTypes.PARAMFLAG): Boolean = false
  def  |(that: System.Runtime.InteropServices.ComTypes.PARAMFLAG): Boolean = false
  def  &(that: System.Runtime.InteropServices.ComTypes.PARAMFLAG): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ComTypes.PARAMFLAG): Boolean = false
}
object PARAMFLAG{
  val PARAMFLAG_NONE	 = value(0)
  val PARAMFLAG_FIN	 = value(1)
  val PARAMFLAG_FOUT	 = value(2)
  val PARAMFLAG_FLCID	 = value(4)
  val PARAMFLAG_FRETVAL	 = value(8)
  val PARAMFLAG_FOPT	 = value(16)
  val PARAMFLAG_FHASDEFAULT	 = value(32)
  val PARAMFLAG_FHASCUSTDATA	 = value(64)
   
  /* an artifact for CLR enums */ private def value(i: Short): System.Runtime.InteropServices.ComTypes.PARAMFLAG = null
}
 
sealed class PARAMDESC extends System.ValueType {
  var lpVarValue : System.IntPtr
   
  var wParamFlags : System.Runtime.InteropServices.ComTypes.PARAMFLAG
}
 
sealed class TYPEDESC extends System.ValueType {
  var lpValue : System.IntPtr
   
  var vt : Short
}
 
sealed class ELEMDESC extends System.ValueType {
  var tdesc : System.Runtime.InteropServices.ComTypes.TYPEDESC
   
  var desc : System.Runtime.InteropServices.ComTypes.ELEMDESC.DESCUNION
}
object ELEMDESC {
  sealed class DESCUNION extends System.ValueType {
    var idldesc : System.Runtime.InteropServices.ComTypes.IDLDESC
     
    var paramdesc : System.Runtime.InteropServices.ComTypes.PARAMDESC
  }
}
 
sealed abstract class VARKIND extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ComTypes.VARKIND): Boolean = false
  def !=(that: System.Runtime.InteropServices.ComTypes.VARKIND): Boolean = false
  def  <(that: System.Runtime.InteropServices.ComTypes.VARKIND): Boolean = false
  def <=(that: System.Runtime.InteropServices.ComTypes.VARKIND): Boolean = false
  def  >(that: System.Runtime.InteropServices.ComTypes.VARKIND): Boolean = false
  def >=(that: System.Runtime.InteropServices.ComTypes.VARKIND): Boolean = false
  def  |(that: System.Runtime.InteropServices.ComTypes.VARKIND): Boolean = false
  def  &(that: System.Runtime.InteropServices.ComTypes.VARKIND): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ComTypes.VARKIND): Boolean = false
}
object VARKIND{
  val VAR_PERINSTANCE	 = value(0)
  val VAR_STATIC	 = value(1)
  val VAR_CONST	 = value(2)
  val VAR_DISPATCH	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.ComTypes.VARKIND = null
}
 
sealed class VARDESC extends System.ValueType {
  var memid : Int
   
  var lpstrSchema : String
   
  var desc : System.Runtime.InteropServices.ComTypes.VARDESC.DESCUNION
   
  var elemdescVar : System.Runtime.InteropServices.ComTypes.ELEMDESC
   
  var wVarFlags : Short
   
  var varkind : System.Runtime.InteropServices.ComTypes.VARKIND
}
object VARDESC {
  sealed class DESCUNION extends System.ValueType {
    var oInst : Int
     
    var lpvarValue : System.IntPtr
  }
}
 
sealed class DISPPARAMS extends System.ValueType {
  var rgvarg : System.IntPtr
   
  var rgdispidNamedArgs : System.IntPtr
   
  var cArgs : Int
   
  var cNamedArgs : Int
}
 
sealed class EXCEPINFO extends System.ValueType {
  var wCode : Short
   
  var wReserved : Short
   
  var bstrSource : String
   
  var bstrDescription : String
   
  var bstrHelpFile : String
   
  var dwHelpContext : Int
   
  var pvReserved : System.IntPtr
   
  var pfnDeferredFillIn : System.IntPtr
   
  var scode : Int
}
 
sealed abstract class FUNCKIND extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ComTypes.FUNCKIND): Boolean = false
  def !=(that: System.Runtime.InteropServices.ComTypes.FUNCKIND): Boolean = false
  def  <(that: System.Runtime.InteropServices.ComTypes.FUNCKIND): Boolean = false
  def <=(that: System.Runtime.InteropServices.ComTypes.FUNCKIND): Boolean = false
  def  >(that: System.Runtime.InteropServices.ComTypes.FUNCKIND): Boolean = false
  def >=(that: System.Runtime.InteropServices.ComTypes.FUNCKIND): Boolean = false
  def  |(that: System.Runtime.InteropServices.ComTypes.FUNCKIND): Boolean = false
  def  &(that: System.Runtime.InteropServices.ComTypes.FUNCKIND): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ComTypes.FUNCKIND): Boolean = false
}
object FUNCKIND{
  val FUNC_VIRTUAL	 = value(0)
  val FUNC_PUREVIRTUAL	 = value(1)
  val FUNC_NONVIRTUAL	 = value(2)
  val FUNC_STATIC	 = value(3)
  val FUNC_DISPATCH	 = value(4)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.ComTypes.FUNCKIND = null
}
 
sealed abstract class INVOKEKIND extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ComTypes.INVOKEKIND): Boolean = false
  def !=(that: System.Runtime.InteropServices.ComTypes.INVOKEKIND): Boolean = false
  def  <(that: System.Runtime.InteropServices.ComTypes.INVOKEKIND): Boolean = false
  def <=(that: System.Runtime.InteropServices.ComTypes.INVOKEKIND): Boolean = false
  def  >(that: System.Runtime.InteropServices.ComTypes.INVOKEKIND): Boolean = false
  def >=(that: System.Runtime.InteropServices.ComTypes.INVOKEKIND): Boolean = false
  def  |(that: System.Runtime.InteropServices.ComTypes.INVOKEKIND): Boolean = false
  def  &(that: System.Runtime.InteropServices.ComTypes.INVOKEKIND): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ComTypes.INVOKEKIND): Boolean = false
}
object INVOKEKIND{
  val INVOKE_FUNC	 = value(1)
  val INVOKE_PROPERTYGET	 = value(2)
  val INVOKE_PROPERTYPUT	 = value(4)
  val INVOKE_PROPERTYPUTREF	 = value(8)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.ComTypes.INVOKEKIND = null
}
 
sealed abstract class CALLCONV extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ComTypes.CALLCONV): Boolean = false
  def !=(that: System.Runtime.InteropServices.ComTypes.CALLCONV): Boolean = false
  def  <(that: System.Runtime.InteropServices.ComTypes.CALLCONV): Boolean = false
  def <=(that: System.Runtime.InteropServices.ComTypes.CALLCONV): Boolean = false
  def  >(that: System.Runtime.InteropServices.ComTypes.CALLCONV): Boolean = false
  def >=(that: System.Runtime.InteropServices.ComTypes.CALLCONV): Boolean = false
  def  |(that: System.Runtime.InteropServices.ComTypes.CALLCONV): Boolean = false
  def  &(that: System.Runtime.InteropServices.ComTypes.CALLCONV): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ComTypes.CALLCONV): Boolean = false
}
object CALLCONV{
  val CC_CDECL	 = value(1)
  val CC_MSCPASCAL	 = value(2)
  val CC_PASCAL	 = value(2)
  val CC_MACPASCAL	 = value(3)
  val CC_STDCALL	 = value(4)
  val CC_RESERVED	 = value(5)
  val CC_SYSCALL	 = value(6)
  val CC_MPWCDECL	 = value(7)
  val CC_MPWPASCAL	 = value(8)
  val CC_MAX	 = value(9)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.ComTypes.CALLCONV = null
}
 
sealed abstract class FUNCFLAGS extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ComTypes.FUNCFLAGS): Boolean = false
  def !=(that: System.Runtime.InteropServices.ComTypes.FUNCFLAGS): Boolean = false
  def  <(that: System.Runtime.InteropServices.ComTypes.FUNCFLAGS): Boolean = false
  def <=(that: System.Runtime.InteropServices.ComTypes.FUNCFLAGS): Boolean = false
  def  >(that: System.Runtime.InteropServices.ComTypes.FUNCFLAGS): Boolean = false
  def >=(that: System.Runtime.InteropServices.ComTypes.FUNCFLAGS): Boolean = false
  def  |(that: System.Runtime.InteropServices.ComTypes.FUNCFLAGS): Boolean = false
  def  &(that: System.Runtime.InteropServices.ComTypes.FUNCFLAGS): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ComTypes.FUNCFLAGS): Boolean = false
}
object FUNCFLAGS{
  val FUNCFLAG_FRESTRICTED	 = value(1)
  val FUNCFLAG_FSOURCE	 = value(2)
  val FUNCFLAG_FBINDABLE	 = value(4)
  val FUNCFLAG_FREQUESTEDIT	 = value(8)
  val FUNCFLAG_FDISPLAYBIND	 = value(16)
  val FUNCFLAG_FDEFAULTBIND	 = value(32)
  val FUNCFLAG_FHIDDEN	 = value(64)
  val FUNCFLAG_FUSESGETLASTERROR	 = value(128)
  val FUNCFLAG_FDEFAULTCOLLELEM	 = value(256)
  val FUNCFLAG_FUIDEFAULT	 = value(512)
  val FUNCFLAG_FNONBROWSABLE	 = value(1024)
  val FUNCFLAG_FREPLACEABLE	 = value(2048)
  val FUNCFLAG_FIMMEDIATEBIND	 = value(4096)
   
  /* an artifact for CLR enums */ private def value(i: Short): System.Runtime.InteropServices.ComTypes.FUNCFLAGS = null
}
 
sealed abstract class VARFLAGS extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ComTypes.VARFLAGS): Boolean = false
  def !=(that: System.Runtime.InteropServices.ComTypes.VARFLAGS): Boolean = false
  def  <(that: System.Runtime.InteropServices.ComTypes.VARFLAGS): Boolean = false
  def <=(that: System.Runtime.InteropServices.ComTypes.VARFLAGS): Boolean = false
  def  >(that: System.Runtime.InteropServices.ComTypes.VARFLAGS): Boolean = false
  def >=(that: System.Runtime.InteropServices.ComTypes.VARFLAGS): Boolean = false
  def  |(that: System.Runtime.InteropServices.ComTypes.VARFLAGS): Boolean = false
  def  &(that: System.Runtime.InteropServices.ComTypes.VARFLAGS): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ComTypes.VARFLAGS): Boolean = false
}
object VARFLAGS{
  val VARFLAG_FREADONLY	 = value(1)
  val VARFLAG_FSOURCE	 = value(2)
  val VARFLAG_FBINDABLE	 = value(4)
  val VARFLAG_FREQUESTEDIT	 = value(8)
  val VARFLAG_FDISPLAYBIND	 = value(16)
  val VARFLAG_FDEFAULTBIND	 = value(32)
  val VARFLAG_FHIDDEN	 = value(64)
  val VARFLAG_FRESTRICTED	 = value(128)
  val VARFLAG_FDEFAULTCOLLELEM	 = value(256)
  val VARFLAG_FUIDEFAULT	 = value(512)
  val VARFLAG_FNONBROWSABLE	 = value(1024)
  val VARFLAG_FREPLACEABLE	 = value(2048)
  val VARFLAG_FIMMEDIATEBIND	 = value(4096)
   
  /* an artifact for CLR enums */ private def value(i: Short): System.Runtime.InteropServices.ComTypes.VARFLAGS = null
}
 
@System.Runtime.InteropServices.GuidAttribute("00020401-0000-0000-C000-000000000046")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait ITypeInfo {
  /* abstract */ def GetTypeAttr(ppTypeAttr : CLRByRef[System.IntPtr]): Unit
   
  /* abstract */ def GetFuncDesc(index : Int, ppFuncDesc : CLRByRef[System.IntPtr]): Unit
   
  /* abstract */ def GetVarDesc(index : Int, ppVarDesc : CLRByRef[System.IntPtr]): Unit
   
  /* abstract */ def GetNames(memid : Int, rgBstrNames : Array[String], cMaxNames : Int, pcNames : CLRByRef[Int]): Unit
   
  /* abstract */ def GetRefTypeOfImplType(index : Int, href : CLRByRef[Int]): Unit
   
  /* abstract */ def GetImplTypeFlags(index : Int, 
                                      pImplTypeFlags : CLRByRef[System.Runtime.InteropServices.ComTypes.IMPLTYPEFLAGS]): Unit
   
  /* abstract */ def GetIDsOfNames(rgszNames : Array[String], cNames : Int, pMemId : Array[Int]): Unit
   
  /* abstract */ def Invoke(pvInstance : AnyRef, memid : Int, wFlags : Short, 
                            pDispParams : CLRByRef[System.Runtime.InteropServices.ComTypes.DISPPARAMS], 
                            pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, puArgErr : CLRByRef[Int]): Unit
   
  /* abstract */ def GetDllEntry(memid : Int, invKind : System.Runtime.InteropServices.ComTypes.INVOKEKIND, 
                                 pBstrDllName : System.IntPtr, pBstrName : System.IntPtr, pwOrdinal : System.IntPtr): Unit
   
  /* abstract */ def AddressOfMember(memid : Int, invKind : System.Runtime.InteropServices.ComTypes.INVOKEKIND, 
                                     ppv : CLRByRef[System.IntPtr]): Unit
   
  /* abstract */ def ReleaseTypeAttr(pTypeAttr : System.IntPtr): Unit
   
  /* abstract */ def ReleaseFuncDesc(pFuncDesc : System.IntPtr): Unit
   
  /* abstract */ def ReleaseVarDesc(pVarDesc : System.IntPtr): Unit
}
 
sealed abstract class SYSKIND extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ComTypes.SYSKIND): Boolean = false
  def !=(that: System.Runtime.InteropServices.ComTypes.SYSKIND): Boolean = false
  def  <(that: System.Runtime.InteropServices.ComTypes.SYSKIND): Boolean = false
  def <=(that: System.Runtime.InteropServices.ComTypes.SYSKIND): Boolean = false
  def  >(that: System.Runtime.InteropServices.ComTypes.SYSKIND): Boolean = false
  def >=(that: System.Runtime.InteropServices.ComTypes.SYSKIND): Boolean = false
  def  |(that: System.Runtime.InteropServices.ComTypes.SYSKIND): Boolean = false
  def  &(that: System.Runtime.InteropServices.ComTypes.SYSKIND): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ComTypes.SYSKIND): Boolean = false
}
object SYSKIND{
  val SYS_WIN16	 = value(0)
  val SYS_WIN32	 = value(1)
  val SYS_MAC	 = value(2)
  val SYS_WIN64	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.InteropServices.ComTypes.SYSKIND = null
}
 
sealed abstract class LIBFLAGS extends System.Enum {
  def ==(that: System.Runtime.InteropServices.ComTypes.LIBFLAGS): Boolean = false
  def !=(that: System.Runtime.InteropServices.ComTypes.LIBFLAGS): Boolean = false
  def  <(that: System.Runtime.InteropServices.ComTypes.LIBFLAGS): Boolean = false
  def <=(that: System.Runtime.InteropServices.ComTypes.LIBFLAGS): Boolean = false
  def  >(that: System.Runtime.InteropServices.ComTypes.LIBFLAGS): Boolean = false
  def >=(that: System.Runtime.InteropServices.ComTypes.LIBFLAGS): Boolean = false
  def  |(that: System.Runtime.InteropServices.ComTypes.LIBFLAGS): Boolean = false
  def  &(that: System.Runtime.InteropServices.ComTypes.LIBFLAGS): Boolean = false
  def  ^(that: System.Runtime.InteropServices.ComTypes.LIBFLAGS): Boolean = false
}
object LIBFLAGS{
  val LIBFLAG_FRESTRICTED	 = value(1)
  val LIBFLAG_FCONTROL	 = value(2)
  val LIBFLAG_FHIDDEN	 = value(4)
  val LIBFLAG_FHASDISKIMAGE	 = value(8)
   
  /* an artifact for CLR enums */ private def value(i: Short): System.Runtime.InteropServices.ComTypes.LIBFLAGS = null
}
 
sealed class TYPELIBATTR extends System.ValueType {
  var guid : System.Guid
   
  var lcid : Int
   
  var syskind : System.Runtime.InteropServices.ComTypes.SYSKIND
   
  var wMajorVerNum : Short
   
  var wMinorVerNum : Short
   
  var wLibFlags : System.Runtime.InteropServices.ComTypes.LIBFLAGS
}
 
@System.Runtime.InteropServices.GuidAttribute("00020402-0000-0000-C000-000000000046")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
trait ITypeLib {
  /* abstract */ def GetTypeInfoCount: Int
   
  /* abstract */ def GetTypeInfoType(index : Int, pTKind : CLRByRef[System.Runtime.InteropServices.ComTypes.TYPEKIND]): Unit
   
  /* abstract */ def GetLibAttr(ppTLibAttr : CLRByRef[System.IntPtr]): Unit
   
  /* abstract */ def IsName(szNameBuf : String, param0 : Int): Boolean
   
  /* abstract */ def FindName(szNameBuf : String, lHashVal : Int, 
                              ppTInfo : Array[System.Runtime.InteropServices.ComTypes.ITypeInfo], 
                              rgMemId : Array[Int], pcFound : CLRByRef[Short]): Unit
   
  /* abstract */ def ReleaseTLibAttr(pTLibAttr : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("00020411-0000-0000-C000-000000000046")
trait ITypeLib2 extends System.Runtime.InteropServices.ComTypes.ITypeLib {
  /* abstract */ def GetTypeInfoCount: Int
   
  /* abstract */ def GetTypeInfoType(index : Int, pTKind : CLRByRef[System.Runtime.InteropServices.ComTypes.TYPEKIND]): Unit
   
  /* abstract */ def GetLibAttr(ppTLibAttr : CLRByRef[System.IntPtr]): Unit
   
  /* abstract */ def IsName(szNameBuf : String, param0 : Int): Boolean
   
  /* abstract */ def FindName(szNameBuf : String, lHashVal : Int, 
                              ppTInfo : Array[System.Runtime.InteropServices.ComTypes.ITypeInfo], 
                              rgMemId : Array[Int], pcFound : CLRByRef[Short]): Unit
   
  /* abstract */ def ReleaseTLibAttr(pTLibAttr : System.IntPtr): Unit
   
  /* abstract */ def GetLibStatistics(pcUniqueNames : System.IntPtr, pcchUniqueNames : CLRByRef[Int]): Unit
   
  /* abstract */ def GetAllCustData(pCustData : System.IntPtr): Unit
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("00020412-0000-0000-C000-000000000046")
trait ITypeInfo2 extends System.Runtime.InteropServices.ComTypes.ITypeInfo {
  /* abstract */ def GetTypeAttr(ppTypeAttr : CLRByRef[System.IntPtr]): Unit
   
  /* abstract */ def GetFuncDesc(index : Int, ppFuncDesc : CLRByRef[System.IntPtr]): Unit
   
  /* abstract */ def GetVarDesc(index : Int, ppVarDesc : CLRByRef[System.IntPtr]): Unit
   
  /* abstract */ def GetNames(memid : Int, rgBstrNames : Array[String], cMaxNames : Int, pcNames : CLRByRef[Int]): Unit
   
  /* abstract */ def GetRefTypeOfImplType(index : Int, href : CLRByRef[Int]): Unit
   
  /* abstract */ def GetImplTypeFlags(index : Int, 
                                      pImplTypeFlags : CLRByRef[System.Runtime.InteropServices.ComTypes.IMPLTYPEFLAGS]): Unit
   
  /* abstract */ def GetIDsOfNames(rgszNames : Array[String], cNames : Int, pMemId : Array[Int]): Unit
   
  /* abstract */ def Invoke(pvInstance : AnyRef, memid : Int, wFlags : Short, 
                            pDispParams : CLRByRef[System.Runtime.InteropServices.ComTypes.DISPPARAMS], 
                            pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, puArgErr : CLRByRef[Int]): Unit
   
  /* abstract */ def GetDllEntry(memid : Int, invKind : System.Runtime.InteropServices.ComTypes.INVOKEKIND, 
                                 pBstrDllName : System.IntPtr, pBstrName : System.IntPtr, pwOrdinal : System.IntPtr): Unit
   
  /* abstract */ def AddressOfMember(memid : Int, invKind : System.Runtime.InteropServices.ComTypes.INVOKEKIND, 
                                     ppv : CLRByRef[System.IntPtr]): Unit
   
  /* abstract */ def ReleaseTypeAttr(pTypeAttr : System.IntPtr): Unit
   
  /* abstract */ def ReleaseFuncDesc(pFuncDesc : System.IntPtr): Unit
   
  /* abstract */ def ReleaseVarDesc(pVarDesc : System.IntPtr): Unit
   
  /* abstract */ def GetTypeKind(pTypeKind : CLRByRef[System.Runtime.InteropServices.ComTypes.TYPEKIND]): Unit
   
  /* abstract */ def GetTypeFlags(pTypeFlags : CLRByRef[Int]): Unit
   
  /* abstract */ def GetFuncIndexOfMemId(memid : Int, invKind : System.Runtime.InteropServices.ComTypes.INVOKEKIND, 
                                         pFuncIndex : CLRByRef[Int]): Unit
   
  /* abstract */ def GetVarIndexOfMemId(memid : Int, pVarIndex : CLRByRef[Int]): Unit
   
  /* abstract */ def GetAllCustData(pCustData : System.IntPtr): Unit
   
  /* abstract */ def GetAllFuncCustData(index : Int, pCustData : System.IntPtr): Unit
   
  /* abstract */ def GetAllParamCustData(indexFunc : Int, indexParam : Int, pCustData : System.IntPtr): Unit
   
  /* abstract */ def GetAllVarCustData(index : Int, pCustData : System.IntPtr): Unit
   
  /* abstract */ def GetAllImplTypeCustData(index : Int, pCustData : System.IntPtr): Unit
}
 
}