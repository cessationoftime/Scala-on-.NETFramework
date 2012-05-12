 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.AutoDual)
class Object {
  def ToString: String
   
  def Equals(obj : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def GetType: System.Type
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  protected def Finalize: Unit
   
  protected def MemberwiseClone: AnyRef
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def this() {}
}
object Object {
  def Equals(objA : AnyRef, objB : AnyRef): Boolean  = false
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def ReferenceEquals(objA : AnyRef, objB : AnyRef): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ICloneable {
  /* abstract */ def Clone: AnyRef
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class Array extends AnyRef with System.ICloneable with System.Collections.IList with System.Collections.ICollection with 
                             System.Collections.IEnumerable {
  def GetValue(indices : Array[Int]): AnyRef
   
  def GetValue(index : Int): AnyRef
   
  def GetValue(index1 : Int, index2 : Int): AnyRef
   
  def GetValue(index1 : Int, index2 : Int, index3 : Int): AnyRef
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetValue(index : Long): AnyRef
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetValue(index1 : Long, index2 : Long): AnyRef
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetValue(index1 : Long, index2 : Long, index3 : Long): AnyRef
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetValue(indices : Array[Long]): AnyRef
   
  def SetValue(value : AnyRef, index : Int): Unit
   
  def SetValue(value : AnyRef, index1 : Int, index2 : Int): Unit
   
  def SetValue(value : AnyRef, index1 : Int, index2 : Int, index3 : Int): Unit
   
  def SetValue(value : AnyRef, indices : Array[Int]): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def SetValue(value : AnyRef, index : Long): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def SetValue(value : AnyRef, index1 : Long, index2 : Long): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def SetValue(value : AnyRef, index1 : Long, index2 : Long, index3 : Long): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def SetValue(value : AnyRef, indices : Array[Long]): Unit
   
  def GetLength(dimension : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetLongLength(dimension : Int): Long
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def GetUpperBound(dimension : Int): Int
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def GetLowerBound(dimension : Int): Int
   
  def Clone: AnyRef
   
  def CopyTo(array : System.Array, index : Int): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def CopyTo(array : System.Array, index : Long): Unit
   
  def GetEnumerator: System.Collections.IEnumerator
   
  def Initialize: Unit
   
  val Length : Int = 0
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val LongLength : Long = 0
   
  val Rank : Int = 0
   
  val SyncRoot : AnyRef = null
   
  val IsReadOnly : Boolean = false
   
  val IsFixedSize : Boolean = false
   
  val IsSynchronized : Boolean = false
}
object Array {
  def AsReadOnly[T](array : Array[T]): System.Collections.ObjectModel.ReadOnlyCollection[T]  = null
   
  def CreateInstance(elementType : System.Type, length : Int): System.Array  = null
   
  def CreateInstance(elementType : System.Type, length1 : Int, length2 : Int): System.Array  = null
   
  def CreateInstance(elementType : System.Type, length1 : Int, length2 : Int, length3 : Int): System.Array  = null
   
  def CreateInstance(elementType : System.Type, lengths : Array[Int]): System.Array  = null
   
  def CreateInstance(elementType : System.Type, lengths : Array[Long]): System.Array  = null
   
  def CreateInstance(elementType : System.Type, lengths : Array[Int], lowerBounds : Array[Int]): System.Array  = null
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Copy(sourceArray : System.Array, destinationArray : System.Array, length : Int): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Copy(sourceArray : System.Array, sourceIndex : Int, destinationArray : System.Array, 
           destinationIndex : Int, length : Int): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def ConstrainedCopy(sourceArray : System.Array, sourceIndex : Int, destinationArray : System.Array, 
                      destinationIndex : Int, length : Int): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Copy(sourceArray : System.Array, destinationArray : System.Array, length : Long): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Copy(sourceArray : System.Array, sourceIndex : Long, destinationArray : System.Array, 
           destinationIndex : Long, length : Long): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Clear(array : System.Array, index : Int, length : Int): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def BinarySearch(array : System.Array, value : AnyRef): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def BinarySearch(array : System.Array, index : Int, length : Int, value : AnyRef): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def BinarySearch(array : System.Array, value : AnyRef, comparer : System.Collections.IComparer): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def BinarySearch(array : System.Array, index : Int, length : Int, value : AnyRef, 
                   comparer : System.Collections.IComparer): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def BinarySearch[T](array : Array[T], value : T): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def BinarySearch[T](array : Array[T], value : T, comparer : System.Collections.Generic.IComparer[T]): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def BinarySearch[T](array : Array[T], index : Int, length : Int, value : T): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def BinarySearch[T](array : Array[T], index : Int, length : Int, value : T, 
                      comparer : System.Collections.Generic.IComparer[T]): Int  = 0
   
  def ConvertAll[TInput, TOutput](array : Array[TInput], converter : System.Converter[TInput, TOutput]): Array[TOutput]  = Array.empty[TOutput]
   
  def Exists[T](array : Array[T], `match` : System.Predicate[T]): Boolean  = false
   
  def Find[T](array : Array[T], `match` : System.Predicate[T]): T  = null
   
  def FindAll[T](array : Array[T], `match` : System.Predicate[T]): Array[T]  = Array.empty[T]
   
  def FindIndex[T](array : Array[T], `match` : System.Predicate[T]): Int  = 0
   
  def FindIndex[T](array : Array[T], startIndex : Int, `match` : System.Predicate[T]): Int  = 0
   
  def FindIndex[T](array : Array[T], startIndex : Int, count : Int, `match` : System.Predicate[T]): Int  = 0
   
  def FindLast[T](array : Array[T], `match` : System.Predicate[T]): T  = null
   
  def FindLastIndex[T](array : Array[T], `match` : System.Predicate[T]): Int  = 0
   
  def FindLastIndex[T](array : Array[T], startIndex : Int, `match` : System.Predicate[T]): Int  = 0
   
  def FindLastIndex[T](array : Array[T], startIndex : Int, count : Int, `match` : System.Predicate[T]): Int  = 0
   
  def ForEach[T](array : Array[T], action : System.Action[T]): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def IndexOf(array : System.Array, value : AnyRef): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def IndexOf(array : System.Array, value : AnyRef, startIndex : Int): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def IndexOf(array : System.Array, value : AnyRef, startIndex : Int, count : Int): Int  = 0
   
  def IndexOf[T](array : Array[T], value : T): Int  = 0
   
  def IndexOf[T](array : Array[T], value : T, startIndex : Int): Int  = 0
   
  def IndexOf[T](array : Array[T], value : T, startIndex : Int, count : Int): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def LastIndexOf(array : System.Array, value : AnyRef): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def LastIndexOf(array : System.Array, value : AnyRef, startIndex : Int): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def LastIndexOf(array : System.Array, value : AnyRef, startIndex : Int, count : Int): Int  = 0
   
  def LastIndexOf[T](array : Array[T], value : T): Int  = 0
   
  def LastIndexOf[T](array : Array[T], value : T, startIndex : Int): Int  = 0
   
  def LastIndexOf[T](array : Array[T], value : T, startIndex : Int, count : Int): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Reverse(array : System.Array): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Reverse(array : System.Array, index : Int, length : Int): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Sort(array : System.Array): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Sort(keys : System.Array, items : System.Array): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Sort(array : System.Array, index : Int, length : Int): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Sort(keys : System.Array, items : System.Array, index : Int, length : Int): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Sort(array : System.Array, comparer : System.Collections.IComparer): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Sort(keys : System.Array, items : System.Array, comparer : System.Collections.IComparer): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Sort(array : System.Array, index : Int, length : Int, 
           comparer : System.Collections.IComparer): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Sort(keys : System.Array, items : System.Array, index : Int, length : Int, 
           comparer : System.Collections.IComparer): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Sort[T](array : Array[T]): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Sort[TKey, TValue](keys : Array[TKey], items : Array[TValue]): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Sort[T](array : Array[T], index : Int, length : Int): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Sort[TKey, TValue](keys : Array[TKey], items : Array[TValue], index : Int, length : Int): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Sort[T](array : Array[T], comparer : System.Collections.Generic.IComparer[T]): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Sort[TKey, TValue](keys : Array[TKey], items : Array[TValue], 
                         comparer : System.Collections.Generic.IComparer[TKey]): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Sort[T](array : Array[T], index : Int, length : Int, 
              comparer : System.Collections.Generic.IComparer[T]): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Sort[TKey, TValue](keys : Array[TKey], items : Array[TValue], index : Int, length : Int, 
                         comparer : System.Collections.Generic.IComparer[TKey]): Unit  = {}
   
  def Sort[T](array : Array[T], comparison : System.Comparison[T]): Unit  = {}
   
  def TrueForAll[T](array : Array[T], `match` : System.Predicate[T]): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class ValueType extends AnyRef {
  def Equals(obj : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IDisposable {
  /* abstract */ def Dispose: Unit
}
 
sealed class ArraySegment[T] extends System.ValueType {
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : System.ArraySegment[T]): Boolean
   
  val Array : Array[T] = Array.empty[T]
   
  val Offset : Int = 0
   
  val Count : Int = 0
   
  def this(array : Array[T]) {}
   
  def this(array : Array[T], offset : Int, count : Int) {}
}
object ArraySegment[T] {
  def ==(a : System.ArraySegment[T], b : System.ArraySegment[T]): Boolean  = false
   
  def !=(a : System.ArraySegment[T], b : System.ArraySegment[T]): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IComparable {
  /* abstract */ def CompareTo(obj : AnyRef): Int
}
 
trait IComparable[T] {
  /* abstract */ def CompareTo(other : T): Int
}
 
trait IEquatable[T] {
  /* abstract */ def Equals(other : T): Boolean
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IFormattable {
  /* abstract */ def ToString(format : String, formatProvider : System.IFormatProvider): String
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.CLSCompliantAttribute(false)
trait IConvertible {
  /* abstract */ def GetTypeCode: System.TypeCode
   
  /* abstract */ def ToBoolean(provider : System.IFormatProvider): Boolean
   
  /* abstract */ def ToChar(provider : System.IFormatProvider): Char
   
  /* abstract */ def ToSByte(provider : System.IFormatProvider): Byte
   
  /* abstract */ def ToByte(provider : System.IFormatProvider): UByte
   
  /* abstract */ def ToInt16(provider : System.IFormatProvider): Short
   
  /* abstract */ def ToUInt16(provider : System.IFormatProvider): UShort
   
  /* abstract */ def ToInt32(provider : System.IFormatProvider): Int
   
  /* abstract */ def ToUInt32(provider : System.IFormatProvider): UInt
   
  /* abstract */ def ToInt64(provider : System.IFormatProvider): Long
   
  /* abstract */ def ToUInt64(provider : System.IFormatProvider): ULong
   
  /* abstract */ def ToSingle(provider : System.IFormatProvider): Float
   
  /* abstract */ def ToDouble(provider : System.IFormatProvider): Double
   
  /* abstract */ def ToDecimal(provider : System.IFormatProvider): System.Decimal
   
  /* abstract */ def ToDateTime(provider : System.IFormatProvider): System.DateTime
   
  /* abstract */ def ToString(provider : System.IFormatProvider): String
   
  /* abstract */ def ToType(conversionType : System.Type, provider : System.IFormatProvider): AnyRef
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class Enum extends System.ValueType with System.IComparable with System.IFormattable with System.IConvertible {
  def Equals(obj : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  @System.ObsoleteAttribute("The provider argument is not used. Please use ToString(String).")
  def ToString(format : String, provider : System.IFormatProvider): String
   
  def CompareTo(target : AnyRef): Int
   
  def ToString(format : String): String
   
  @System.ObsoleteAttribute("The provider argument is not used. Please use ToString().")
  def ToString(provider : System.IFormatProvider): String
   
  def GetTypeCode: System.TypeCode
   
  protected def this() {}
}
object Enum {
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def Parse(enumType : System.Type, value : String): AnyRef  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def Parse(enumType : System.Type, value : String, ignoreCase : Boolean): AnyRef  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetUnderlyingType(enumType : System.Type): System.Type  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetValues(enumType : System.Type): System.Array  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetName(enumType : System.Type, value : AnyRef): String  = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetNames(enumType : System.Type): Array[String]  = Array.empty[String]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def ToObject(enumType : System.Type, value : AnyRef): AnyRef  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def IsDefined(enumType : System.Type, value : AnyRef): Boolean  = false
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def Format(enumType : System.Type, value : AnyRef, format : String): String  = ""
   
  @System.CLSCompliantAttribute(false)
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def ToObject(enumType : System.Type, value : Byte): AnyRef  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def ToObject(enumType : System.Type, value : Short): AnyRef  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def ToObject(enumType : System.Type, value : Int): AnyRef  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def ToObject(enumType : System.Type, value : UByte): AnyRef  = null
   
  @System.CLSCompliantAttribute(false)
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def ToObject(enumType : System.Type, value : UShort): AnyRef  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  @System.CLSCompliantAttribute(false)
  def ToObject(enumType : System.Type, value : UInt): AnyRef  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def ToObject(enumType : System.Type, value : Long): AnyRef  = null
   
  @System.CLSCompliantAttribute(false)
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def ToObject(enumType : System.Type, value : ULong): AnyRef  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Reflection.DefaultMemberAttribute("Chars")
sealed class String extends AnyRef with System.IComparable with System.ICloneable with System.IConvertible with 
                            System.IComparable[String] with System.Collections.Generic.IEnumerable[Char] with 
                            System.Collections.IEnumerable with System.IEquatable[String] {
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Equals(obj : AnyRef): Boolean
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Equals(value : String): Boolean
   
  def Equals(value : String, comparisonType : System.StringComparison): Boolean
   
  def CopyTo(sourceIndex : Int, destination : Array[Char], destinationIndex : Int, count : Int): Unit
   
  def ToCharArray: Array[Char]
   
  def ToCharArray(startIndex : Int, length : Int): Array[Char]
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def GetHashCode: Int
   
  def Split(separator : Array[Char]): Array[String]
   
  def Split(separator : Array[Char], count : Int): Array[String]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Split(separator : Array[Char], options : System.StringSplitOptions): Array[String]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Split(separator : Array[Char], count : Int, options : System.StringSplitOptions): Array[String]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Split(separator : Array[String], options : System.StringSplitOptions): Array[String]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Split(separator : Array[String], count : Int, options : System.StringSplitOptions): Array[String]
   
  def Substring(startIndex : Int): String
   
  def Substring(startIndex : Int, length : Int): String
   
  def Trim(trimChars : Array[Char]): String
   
  def TrimStart(trimChars : Array[Char]): String
   
  def TrimEnd(trimChars : Array[Char]): String
   
  def IsNormalized: Boolean
   
  def IsNormalized(normalizationForm : System.Text.NormalizationForm): Boolean
   
  def Normalize: String
   
  def Normalize(normalizationForm : System.Text.NormalizationForm): String
   
  def CompareTo(value : AnyRef): Int
   
  def CompareTo(strB : String): Int
   
  def Contains(value : String): Boolean
   
  def EndsWith(value : String): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def EndsWith(value : String, comparisonType : System.StringComparison): Boolean
   
  def EndsWith(value : String, ignoreCase : Boolean, culture : System.Globalization.CultureInfo): Boolean
   
  def IndexOf(value : Char): Int
   
  def IndexOf(value : Char, startIndex : Int): Int
   
  def IndexOf(value : Char, startIndex : Int, count : Int): Int
   
  def IndexOfAny(anyOf : Array[Char]): Int
   
  def IndexOfAny(anyOf : Array[Char], startIndex : Int): Int
   
  def IndexOfAny(anyOf : Array[Char], startIndex : Int, count : Int): Int
   
  def IndexOf(value : String): Int
   
  def IndexOf(value : String, startIndex : Int): Int
   
  def IndexOf(value : String, startIndex : Int, count : Int): Int
   
  def IndexOf(value : String, comparisonType : System.StringComparison): Int
   
  def IndexOf(value : String, startIndex : Int, comparisonType : System.StringComparison): Int
   
  def IndexOf(value : String, startIndex : Int, count : Int, 
              comparisonType : System.StringComparison): Int
   
  def LastIndexOf(value : Char): Int
   
  def LastIndexOf(value : Char, startIndex : Int): Int
   
  def LastIndexOf(value : Char, startIndex : Int, count : Int): Int
   
  def LastIndexOfAny(anyOf : Array[Char]): Int
   
  def LastIndexOfAny(anyOf : Array[Char], startIndex : Int): Int
   
  def LastIndexOfAny(anyOf : Array[Char], startIndex : Int, count : Int): Int
   
  def LastIndexOf(value : String): Int
   
  def LastIndexOf(value : String, startIndex : Int): Int
   
  def LastIndexOf(value : String, startIndex : Int, count : Int): Int
   
  def LastIndexOf(value : String, comparisonType : System.StringComparison): Int
   
  def LastIndexOf(value : String, startIndex : Int, comparisonType : System.StringComparison): Int
   
  def LastIndexOf(value : String, startIndex : Int, count : Int, 
                  comparisonType : System.StringComparison): Int
   
  def PadLeft(totalWidth : Int): String
   
  def PadLeft(totalWidth : Int, paddingChar : Char): String
   
  def PadRight(totalWidth : Int): String
   
  def PadRight(totalWidth : Int, paddingChar : Char): String
   
  def StartsWith(value : String): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def StartsWith(value : String, comparisonType : System.StringComparison): Boolean
   
  def StartsWith(value : String, ignoreCase : Boolean, culture : System.Globalization.CultureInfo): Boolean
   
  def ToLower: String
   
  def ToLower(culture : System.Globalization.CultureInfo): String
   
  def ToLowerInvariant: String
   
  def ToUpper: String
   
  def ToUpper(culture : System.Globalization.CultureInfo): String
   
  def ToUpperInvariant: String
   
  def ToString: String
   
  def ToString(provider : System.IFormatProvider): String
   
  def Clone: AnyRef
   
  def Trim: String
   
  def Insert(startIndex : Int, value : String): String
   
  def Replace(oldChar : Char, newChar : Char): String
   
  def Replace(oldValue : String, newValue : String): String
   
  def Remove(startIndex : Int, count : Int): String
   
  def Remove(startIndex : Int): String
   
  def GetTypeCode: System.TypeCode
   
  def GetEnumerator: System.CharEnumerator
   
  /* parameterful property Chars */
  def Chars(index : Int): Char
   
  val Length : Int = 0
   
  @System.CLSCompliantAttribute(false)
  def this(value : CLRPointer[Char]) {}
   
  @System.CLSCompliantAttribute(false)
  def this(value : CLRPointer[Char], startIndex : Int, length : Int) {}
   
  @System.CLSCompliantAttribute(false)
  def this(value : CLRPointer[Byte]) {}
   
  @System.CLSCompliantAttribute(false)
  def this(value : CLRPointer[Byte], startIndex : Int, length : Int) {}
   
  @System.CLSCompliantAttribute(false)
  def this(value : CLRPointer[Byte], startIndex : Int, length : Int, enc : System.Text.Encoding) {}
   
  def this(value : Array[Char], startIndex : Int, length : Int) {}
   
  def this(value : Array[Char]) {}
   
  def this(c : Char, count : Int) {}
}
object String {
  def Join(separator : String, value : Array[String]): String  = ""
   
  def Join(separator : String, value : Array[String], startIndex : Int, count : Int): String  = ""
   
  def Equals(a : String, b : String): Boolean  = false
   
  def Equals(a : String, b : String, comparisonType : System.StringComparison): Boolean  = false
   
  def ==(a : String, b : String): Boolean  = false
   
  def !=(a : String, b : String): Boolean  = false
   
  def IsNullOrEmpty(value : String): Boolean  = false
   
  def Compare(strA : String, strB : String): Int  = 0
   
  def Compare(strA : String, strB : String, ignoreCase : Boolean): Int  = 0
   
  def Compare(strA : String, strB : String, culture : System.Globalization.CultureInfo, 
              options : System.Globalization.CompareOptions): Int  = 0
   
  def Compare(strA : String, indexA : Int, strB : String, indexB : Int, length : Int, 
              culture : System.Globalization.CultureInfo, 
              options : System.Globalization.CompareOptions): Int  = 0
   
  def Compare(strA : String, strB : String, comparisonType : System.StringComparison): Int  = 0
   
  def Compare(strA : String, strB : String, ignoreCase : Boolean, 
              culture : System.Globalization.CultureInfo): Int  = 0
   
  def Compare(strA : String, indexA : Int, strB : String, indexB : Int, length : Int): Int  = 0
   
  def Compare(strA : String, indexA : Int, strB : String, indexB : Int, length : Int, 
              ignoreCase : Boolean): Int  = 0
   
  def Compare(strA : String, indexA : Int, strB : String, indexB : Int, length : Int, 
              ignoreCase : Boolean, culture : System.Globalization.CultureInfo): Int  = 0
   
  def Compare(strA : String, indexA : Int, strB : String, indexB : Int, length : Int, 
              comparisonType : System.StringComparison): Int  = 0
   
  def CompareOrdinal(strA : String, strB : String): Int  = 0
   
  def CompareOrdinal(strA : String, indexA : Int, strB : String, indexB : Int, length : Int): Int  = 0
   
  def Format(format : String, arg0 : AnyRef): String  = ""
   
  def Format(format : String, arg0 : AnyRef, arg1 : AnyRef): String  = ""
   
  def Format(format : String, arg0 : AnyRef, arg1 : AnyRef, arg2 : AnyRef): String  = ""
   
  def Format(format : String, args : Array[AnyRef]): String  = ""
   
  def Format(provider : System.IFormatProvider, format : String, args : Array[AnyRef]): String  = ""
   
  def Copy(str : String): String  = ""
   
  def Concat(arg0 : AnyRef): String  = ""
   
  def Concat(arg0 : AnyRef, arg1 : AnyRef): String  = ""
   
  def Concat(arg0 : AnyRef, arg1 : AnyRef, arg2 : AnyRef): String  = ""
   
  @System.CLSCompliantAttribute(false)
  def Concat(arg0 : AnyRef, arg1 : AnyRef, arg2 : AnyRef, arg3 : AnyRef): String  = ""
   
  def Concat(args : Array[AnyRef]): String  = ""
   
  def Concat(str0 : String, str1 : String): String  = ""
   
  def Concat(str0 : String, str1 : String, str2 : String): String  = ""
   
  def Concat(str0 : String, str1 : String, str2 : String, str3 : String): String  = ""
   
  def Concat(values : Array[String]): String  = ""
   
  def Intern(str : String): String  = ""
   
  def IsInterned(str : String): String  = ""
   
  val Empty : String  = ""
}
 
sealed abstract class StringSplitOptions extends System.Enum {
  def ==(that: System.StringSplitOptions): Boolean = false
  def !=(that: System.StringSplitOptions): Boolean = false
  def  <(that: System.StringSplitOptions): Boolean = false
  def <=(that: System.StringSplitOptions): Boolean = false
  def  >(that: System.StringSplitOptions): Boolean = false
  def >=(that: System.StringSplitOptions): Boolean = false
  def  |(that: System.StringSplitOptions): Boolean = false
  def  &(that: System.StringSplitOptions): Boolean = false
  def  ^(that: System.StringSplitOptions): Boolean = false
}
object StringSplitOptions{
  val None	 = value(0)
  val RemoveEmptyEntries	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.StringSplitOptions = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class StringComparer extends AnyRef with System.Collections.IComparer with System.Collections.IEqualityComparer with 
                                      System.Collections.Generic.IComparer[String] with 
                                      System.Collections.Generic.IEqualityComparer[String] {
  def Compare(x : AnyRef, y : AnyRef): Int
   
  def Equals(x : AnyRef, y : AnyRef): Boolean
   
  def GetHashCode(obj : AnyRef): Int
   
  /* abstract */ def Compare(x : String, y : String): Int
   
  /* abstract */ def Equals(x : String, y : String): Boolean
   
  /* abstract */ def GetHashCode(obj : String): Int
   
  protected def this() {}
}
object StringComparer {
  def Create(culture : System.Globalization.CultureInfo, ignoreCase : Boolean): System.StringComparer  = null
   
  val InvariantCulture : System.StringComparer = null
   
  val InvariantCultureIgnoreCase : System.StringComparer = null
   
  val CurrentCulture : System.StringComparer = null
   
  val CurrentCultureIgnoreCase : System.StringComparer = null
   
  val Ordinal : System.StringComparer = null
   
  val OrdinalIgnoreCase : System.StringComparer = null
}
 
sealed abstract class StringComparison extends System.Enum {
  def ==(that: System.StringComparison): Boolean = false
  def !=(that: System.StringComparison): Boolean = false
  def  <(that: System.StringComparison): Boolean = false
  def <=(that: System.StringComparison): Boolean = false
  def  >(that: System.StringComparison): Boolean = false
  def >=(that: System.StringComparison): Boolean = false
  def  |(that: System.StringComparison): Boolean = false
  def  &(that: System.StringComparison): Boolean = false
  def  ^(that: System.StringComparison): Boolean = false
}
object StringComparison{
  val CurrentCulture	 = value(0)
  val CurrentCultureIgnoreCase	 = value(1)
  val InvariantCulture	 = value(2)
  val InvariantCultureIgnoreCase	 = value(3)
  val Ordinal	 = value(4)
  val OrdinalIgnoreCase	 = value(5)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.StringComparison = null
}
 
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class Exception extends AnyRef with System.Runtime.Serialization.ISerializable with 
                        System.Runtime.InteropServices._Exception {
  def GetBaseException: System.Exception
   
  def ToString: String
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  protected def get_HResult: Int
   
  protected def set_HResult(value : Int): Unit
   
  def GetType: System.Type
   
  val Message : String = ""
   
  val Data : System.Collections.IDictionary = null
   
  val InnerException : System.Exception = null
   
  val TargetSite : System.Reflection.MethodBase = null
   
  val StackTrace : String = ""
   
  var HelpLink : String = ""
   
  var Source : String = ""
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
sealed class DateTime extends System.ValueType with System.IComparable with System.IFormattable with System.IConvertible with 
                              System.Runtime.Serialization.ISerializable with System.IComparable[System.DateTime] with 
                              System.IEquatable[System.DateTime] {
  def Add(value : System.TimeSpan): System.DateTime
   
  def AddDays(value : Double): System.DateTime
   
  def AddHours(value : Double): System.DateTime
   
  def AddMilliseconds(value : Double): System.DateTime
   
  def AddMinutes(value : Double): System.DateTime
   
  def AddMonths(months : Int): System.DateTime
   
  def AddSeconds(value : Double): System.DateTime
   
  def AddTicks(value : Long): System.DateTime
   
  def AddYears(value : Int): System.DateTime
   
  def CompareTo(value : AnyRef): Int
   
  def CompareTo(value : System.DateTime): Int
   
  def Equals(value : AnyRef): Boolean
   
  def Equals(value : System.DateTime): Boolean
   
  def IsDaylightSavingTime: Boolean
   
  def ToBinary: Long
   
  def GetHashCode: Int
   
  def Subtract(value : System.DateTime): System.TimeSpan
   
  def Subtract(value : System.TimeSpan): System.DateTime
   
  def ToOADate: Double
   
  def ToFileTime: Long
   
  def ToFileTimeUtc: Long
   
  def ToLocalTime: System.DateTime
   
  def ToLongDateString: String
   
  def ToLongTimeString: String
   
  def ToShortDateString: String
   
  def ToShortTimeString: String
   
  def ToString: String
   
  def ToString(format : String): String
   
  def ToString(provider : System.IFormatProvider): String
   
  def ToString(format : String, provider : System.IFormatProvider): String
   
  def ToUniversalTime: System.DateTime
   
  def GetDateTimeFormats: Array[String]
   
  def GetDateTimeFormats(provider : System.IFormatProvider): Array[String]
   
  def GetDateTimeFormats(format : Char): Array[String]
   
  def GetDateTimeFormats(format : Char, provider : System.IFormatProvider): Array[String]
   
  def GetTypeCode: System.TypeCode
   
  val Date : System.DateTime = new System.DateTime()
   
  val Day : Int = 0
   
  val DayOfWeek : System.DayOfWeek = System.DayOfWeek.Sunday
   
  val DayOfYear : Int = 0
   
  val Hour : Int = 0
   
  val Kind : System.DateTimeKind = System.DateTimeKind.Unspecified
   
  val Millisecond : Int = 0
   
  val Minute : Int = 0
   
  val Month : Int = 0
   
  val Second : Int = 0
   
  val Ticks : Long = 0
   
  val TimeOfDay : System.TimeSpan = new System.TimeSpan()
   
  val Year : Int = 0
   
  def this(ticks : Long) {}
   
  def this(ticks : Long, kind : System.DateTimeKind) {}
   
  def this(year : Int, month : Int, day : Int) {}
   
  def this(year : Int, month : Int, day : Int, calendar : System.Globalization.Calendar) {}
   
  def this(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int) {}
   
  def this(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
           kind : System.DateTimeKind) {}
   
  def this(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
           calendar : System.Globalization.Calendar) {}
   
  def this(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
           millisecond : Int) {}
   
  def this(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
           millisecond : Int, kind : System.DateTimeKind) {}
   
  def this(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
           millisecond : Int, calendar : System.Globalization.Calendar) {}
   
  def this(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
           millisecond : Int, calendar : System.Globalization.Calendar, 
           kind : System.DateTimeKind) {}
}
object DateTime {
  def Compare(t1 : System.DateTime, t2 : System.DateTime): Int  = 0
   
  def DaysInMonth(year : Int, month : Int): Int  = 0
   
  def Equals(t1 : System.DateTime, t2 : System.DateTime): Boolean  = false
   
  def FromBinary(dateData : Long): System.DateTime  = new System.DateTime()
   
  def FromFileTime(fileTime : Long): System.DateTime  = new System.DateTime()
   
  def FromFileTimeUtc(fileTime : Long): System.DateTime  = new System.DateTime()
   
  def FromOADate(d : Double): System.DateTime  = new System.DateTime()
   
  def SpecifyKind(value : System.DateTime, kind : System.DateTimeKind): System.DateTime  = new System.DateTime()
   
  def IsLeapYear(year : Int): Boolean  = false
   
  def Parse(s : String): System.DateTime  = new System.DateTime()
   
  def Parse(s : String, provider : System.IFormatProvider): System.DateTime  = new System.DateTime()
   
  def Parse(s : String, provider : System.IFormatProvider, 
            styles : System.Globalization.DateTimeStyles): System.DateTime  = new System.DateTime()
   
  def ParseExact(s : String, format : String, provider : System.IFormatProvider): System.DateTime  = new System.DateTime()
   
  def ParseExact(s : String, format : String, provider : System.IFormatProvider, 
                 style : System.Globalization.DateTimeStyles): System.DateTime  = new System.DateTime()
   
  def ParseExact(s : String, formats : Array[String], provider : System.IFormatProvider, 
                 style : System.Globalization.DateTimeStyles): System.DateTime  = new System.DateTime()
   
  def TryParse(s : String, result : CLRByRef[System.DateTime]): Boolean  = false
   
  def TryParse(s : String, provider : System.IFormatProvider, 
               styles : System.Globalization.DateTimeStyles, result : CLRByRef[System.DateTime]): Boolean  = false
   
  def TryParseExact(s : String, format : String, provider : System.IFormatProvider, 
                    style : System.Globalization.DateTimeStyles, result : CLRByRef[System.DateTime]): Boolean  = false
   
  def TryParseExact(s : String, formats : Array[String], provider : System.IFormatProvider, 
                    style : System.Globalization.DateTimeStyles, result : CLRByRef[System.DateTime]): Boolean  = false
   
  def +(d : System.DateTime, t : System.TimeSpan): System.DateTime  = new System.DateTime()
   
  def -(d : System.DateTime, t : System.TimeSpan): System.DateTime  = new System.DateTime()
   
  def -(d1 : System.DateTime, d2 : System.DateTime): System.TimeSpan  = new System.TimeSpan()
   
  def ==(d1 : System.DateTime, d2 : System.DateTime): Boolean  = false
   
  def !=(d1 : System.DateTime, d2 : System.DateTime): Boolean  = false
   
  def <(t1 : System.DateTime, t2 : System.DateTime): Boolean  = false
   
  def <=(t1 : System.DateTime, t2 : System.DateTime): Boolean  = false
   
  def >(t1 : System.DateTime, t2 : System.DateTime): Boolean  = false
   
  def >=(t1 : System.DateTime, t2 : System.DateTime): Boolean  = false
   
  val MinValue : System.DateTime  = new System.DateTime()
   
  val MaxValue : System.DateTime  = new System.DateTime()
   
  val Now : System.DateTime = new System.DateTime()
   
  val UtcNow : System.DateTime = new System.DateTime()
   
  val Today : System.DateTime = new System.DateTime()
}
 
sealed abstract class DateTimeKind extends System.Enum {
  def ==(that: System.DateTimeKind): Boolean = false
  def !=(that: System.DateTimeKind): Boolean = false
  def  <(that: System.DateTimeKind): Boolean = false
  def <=(that: System.DateTimeKind): Boolean = false
  def  >(that: System.DateTimeKind): Boolean = false
  def >=(that: System.DateTimeKind): Boolean = false
  def  |(that: System.DateTimeKind): Boolean = false
  def  &(that: System.DateTimeKind): Boolean = false
  def  ^(that: System.DateTimeKind): Boolean = false
}
object DateTimeKind{
  val Unspecified	 = value(0)
  val Utc	 = value(1)
  val Local	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.DateTimeKind = null
}
 
sealed class DateTimeOffset extends System.ValueType with System.IComparable with System.IFormattable with 
                                    System.Runtime.Serialization.ISerializable with 
                                    System.Runtime.Serialization.IDeserializationCallback with 
                                    System.IComparable[System.DateTimeOffset] with 
                                    System.IEquatable[System.DateTimeOffset] {
  def ToOffset(offset : System.TimeSpan): System.DateTimeOffset
   
  def Add(timeSpan : System.TimeSpan): System.DateTimeOffset
   
  def AddDays(days : Double): System.DateTimeOffset
   
  def AddHours(hours : Double): System.DateTimeOffset
   
  def AddMilliseconds(milliseconds : Double): System.DateTimeOffset
   
  def AddMinutes(minutes : Double): System.DateTimeOffset
   
  def AddMonths(months : Int): System.DateTimeOffset
   
  def AddSeconds(seconds : Double): System.DateTimeOffset
   
  def AddTicks(ticks : Long): System.DateTimeOffset
   
  def AddYears(years : Int): System.DateTimeOffset
   
  def CompareTo(other : System.DateTimeOffset): Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(other : System.DateTimeOffset): Boolean
   
  def EqualsExact(other : System.DateTimeOffset): Boolean
   
  def GetHashCode: Int
   
  def Subtract(value : System.DateTimeOffset): System.TimeSpan
   
  def Subtract(value : System.TimeSpan): System.DateTimeOffset
   
  def ToFileTime: Long
   
  def ToLocalTime: System.DateTimeOffset
   
  def ToString: String
   
  def ToString(format : String): String
   
  def ToString(formatProvider : System.IFormatProvider): String
   
  def ToString(format : String, formatProvider : System.IFormatProvider): String
   
  def ToUniversalTime: System.DateTimeOffset
   
  val DateTime : System.DateTime = new System.DateTime()
   
  val UtcDateTime : System.DateTime = new System.DateTime()
   
  val LocalDateTime : System.DateTime = new System.DateTime()
   
  val Date : System.DateTime = new System.DateTime()
   
  val Day : Int = 0
   
  val DayOfWeek : System.DayOfWeek = System.DayOfWeek.Sunday
   
  val DayOfYear : Int = 0
   
  val Hour : Int = 0
   
  val Millisecond : Int = 0
   
  val Minute : Int = 0
   
  val Month : Int = 0
   
  val Offset : System.TimeSpan = new System.TimeSpan()
   
  val Second : Int = 0
   
  val Ticks : Long = 0
   
  val UtcTicks : Long = 0
   
  val TimeOfDay : System.TimeSpan = new System.TimeSpan()
   
  val Year : Int = 0
   
  def this(ticks : Long, offset : System.TimeSpan) {}
   
  def this(dateTime : System.DateTime) {}
   
  def this(dateTime : System.DateTime, offset : System.TimeSpan) {}
   
  def this(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
           offset : System.TimeSpan) {}
   
  def this(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
           millisecond : Int, offset : System.TimeSpan) {}
   
  def this(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
           millisecond : Int, calendar : System.Globalization.Calendar, 
           offset : System.TimeSpan) {}
}
object DateTimeOffset {
  def Compare(first : System.DateTimeOffset, second : System.DateTimeOffset): Int  = 0
   
  def Equals(first : System.DateTimeOffset, second : System.DateTimeOffset): Boolean  = false
   
  def FromFileTime(fileTime : Long): System.DateTimeOffset  = new System.DateTimeOffset()
   
  def Parse(input : String): System.DateTimeOffset  = new System.DateTimeOffset()
   
  def Parse(input : String, formatProvider : System.IFormatProvider): System.DateTimeOffset  = new System.DateTimeOffset()
   
  def Parse(input : String, formatProvider : System.IFormatProvider, 
            styles : System.Globalization.DateTimeStyles): System.DateTimeOffset  = new System.DateTimeOffset()
   
  def ParseExact(input : String, format : String, formatProvider : System.IFormatProvider): System.DateTimeOffset  = new System.DateTimeOffset()
   
  def ParseExact(input : String, format : String, formatProvider : System.IFormatProvider, 
                 styles : System.Globalization.DateTimeStyles): System.DateTimeOffset  = new System.DateTimeOffset()
   
  def ParseExact(input : String, formats : Array[String], formatProvider : System.IFormatProvider, 
                 styles : System.Globalization.DateTimeStyles): System.DateTimeOffset  = new System.DateTimeOffset()
   
  def TryParse(input : String, result : CLRByRef[System.DateTimeOffset]): Boolean  = false
   
  def TryParse(input : String, formatProvider : System.IFormatProvider, 
               styles : System.Globalization.DateTimeStyles, 
               result : CLRByRef[System.DateTimeOffset]): Boolean  = false
   
  def TryParseExact(input : String, format : String, formatProvider : System.IFormatProvider, 
                    styles : System.Globalization.DateTimeStyles, 
                    result : CLRByRef[System.DateTimeOffset]): Boolean  = false
   
  def TryParseExact(input : String, formats : Array[String], formatProvider : System.IFormatProvider, 
                    styles : System.Globalization.DateTimeStyles, 
                    result : CLRByRef[System.DateTimeOffset]): Boolean  = false
   
  def op_Implicit(dateTime : System.DateTime): System.DateTimeOffset  = new System.DateTimeOffset()
   
  def +(dateTimeTz : System.DateTimeOffset, timeSpan : System.TimeSpan): System.DateTimeOffset  = new System.DateTimeOffset()
   
  def -(dateTimeTz : System.DateTimeOffset, timeSpan : System.TimeSpan): System.DateTimeOffset  = new System.DateTimeOffset()
   
  def -(left : System.DateTimeOffset, right : System.DateTimeOffset): System.TimeSpan  = new System.TimeSpan()
   
  def ==(left : System.DateTimeOffset, right : System.DateTimeOffset): Boolean  = false
   
  def !=(left : System.DateTimeOffset, right : System.DateTimeOffset): Boolean  = false
   
  def <(left : System.DateTimeOffset, right : System.DateTimeOffset): Boolean  = false
   
  def <=(left : System.DateTimeOffset, right : System.DateTimeOffset): Boolean  = false
   
  def >(left : System.DateTimeOffset, right : System.DateTimeOffset): Boolean  = false
   
  def >=(left : System.DateTimeOffset, right : System.DateTimeOffset): Boolean  = false
   
  val MinValue : System.DateTimeOffset  = new System.DateTimeOffset()
   
  val MaxValue : System.DateTimeOffset  = new System.DateTimeOffset()
   
  val Now : System.DateTimeOffset = new System.DateTimeOffset()
   
  val UtcNow : System.DateTimeOffset = new System.DateTimeOffset()
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SystemException extends System.Exception {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class OutOfMemoryException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class StackOverflowException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class DataMisalignedException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ExecutionEngineException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
}
 
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.AutoDual)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class Delegate extends AnyRef with System.ICloneable with System.Runtime.Serialization.ISerializable {
  def DynamicInvoke(args : Array[AnyRef]): AnyRef
   
  protected def DynamicInvokeImpl(args : Array[AnyRef]): AnyRef
   
  def Equals(obj : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def GetInvocationList: Array[System.Delegate]
   
  protected def GetMethodImpl: System.Reflection.MethodInfo
   
  protected def CombineImpl(d : System.Delegate): System.Delegate
   
  protected def RemoveImpl(d : System.Delegate): System.Delegate
   
  def Clone: AnyRef
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  val Method : System.Reflection.MethodInfo = null
   
  val Target : AnyRef = null
   
  protected def this(target : AnyRef, method : String) {}
   
  protected def this(target : System.Type, method : String) {}
}
object Delegate {
  def Combine(a : System.Delegate, b : System.Delegate): System.Delegate  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def Combine(delegates : Array[System.Delegate]): System.Delegate  = null
   
  def Remove(source : System.Delegate, value : System.Delegate): System.Delegate  = null
   
  def RemoveAll(source : System.Delegate, value : System.Delegate): System.Delegate  = null
   
  def CreateDelegate(`type` : System.Type, target : AnyRef, method : String): System.Delegate  = null
   
  def CreateDelegate(`type` : System.Type, target : AnyRef, method : String, ignoreCase : Boolean): System.Delegate  = null
   
  def CreateDelegate(`type` : System.Type, target : AnyRef, method : String, ignoreCase : Boolean, 
                     throwOnBindFailure : Boolean): System.Delegate  = null
   
  def CreateDelegate(`type` : System.Type, target : System.Type, method : String): System.Delegate  = null
   
  def CreateDelegate(`type` : System.Type, target : System.Type, method : String, ignoreCase : Boolean): System.Delegate  = null
   
  def CreateDelegate(`type` : System.Type, target : System.Type, method : String, ignoreCase : Boolean, 
                     throwOnBindFailure : Boolean): System.Delegate  = null
   
  def CreateDelegate(`type` : System.Type, method : System.Reflection.MethodInfo): System.Delegate  = null
   
  def CreateDelegate(`type` : System.Type, method : System.Reflection.MethodInfo, 
                     throwOnBindFailure : Boolean): System.Delegate  = null
   
  def CreateDelegate(`type` : System.Type, firstArgument : AnyRef, method : System.Reflection.MethodInfo): System.Delegate  = null
   
  def CreateDelegate(`type` : System.Type, firstArgument : AnyRef, method : System.Reflection.MethodInfo, 
                     throwOnBindFailure : Boolean): System.Delegate  = null
   
  def ==(d1 : System.Delegate, d2 : System.Delegate): Boolean  = false
   
  def !=(d1 : System.Delegate, d2 : System.Delegate): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class MulticastDelegate extends System.Delegate {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  def Equals(obj : AnyRef): Boolean
   
  protected def CombineImpl(follow : System.Delegate): System.Delegate
   
  protected def RemoveImpl(value : System.Delegate): System.Delegate
   
  def GetInvocationList: Array[System.Delegate]
   
  def GetHashCode: Int
   
  protected def GetMethodImpl: System.Reflection.MethodInfo
   
  protected def this(target : AnyRef, method : String) {}
   
  protected def this(target : System.Type, method : String) {}
}
object MulticastDelegate {
  def ==(d1 : System.MulticastDelegate, d2 : System.MulticastDelegate): Boolean  = false
   
  def !=(d1 : System.MulticastDelegate, d2 : System.MulticastDelegate): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class MemberAccessException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
sealed class Activator extends AnyRef with System.Runtime.InteropServices._Activator 
object Activator {
  def CreateInstance(`type` : System.Type, bindingAttr : System.Reflection.BindingFlags, 
                     binder : System.Reflection.Binder, args : Array[AnyRef], 
                     culture : System.Globalization.CultureInfo): AnyRef  = null
   
  def CreateInstance(`type` : System.Type, bindingAttr : System.Reflection.BindingFlags, 
                     binder : System.Reflection.Binder, args : Array[AnyRef], 
                     culture : System.Globalization.CultureInfo, activationAttributes : Array[AnyRef]): AnyRef  = null
   
  def CreateInstance(`type` : System.Type, args : Array[AnyRef]): AnyRef  = null
   
  def CreateInstance(`type` : System.Type, args : Array[AnyRef], activationAttributes : Array[AnyRef]): AnyRef  = null
   
  def CreateInstance(`type` : System.Type): AnyRef  = null
   
  def CreateInstance(assemblyName : String, typeName : String): System.Runtime.Remoting.ObjectHandle  = null
   
  def CreateInstance(assemblyName : String, typeName : String, activationAttributes : Array[AnyRef]): System.Runtime.Remoting.ObjectHandle  = null
   
  def CreateInstance(`type` : System.Type, nonPublic : Boolean): AnyRef  = null
   
  def CreateInstance[T]: T  = null
   
  def CreateInstanceFrom(assemblyFile : String, typeName : String): System.Runtime.Remoting.ObjectHandle  = null
   
  def CreateInstanceFrom(assemblyFile : String, typeName : String, activationAttributes : Array[AnyRef]): System.Runtime.Remoting.ObjectHandle  = null
   
  def CreateInstance(assemblyName : String, typeName : String, ignoreCase : Boolean, 
                     bindingAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                     args : Array[AnyRef], culture : System.Globalization.CultureInfo, 
                     activationAttributes : Array[AnyRef], 
                     securityInfo : System.Security.Policy.Evidence): System.Runtime.Remoting.ObjectHandle  = null
   
  def CreateInstanceFrom(assemblyFile : String, typeName : String, ignoreCase : Boolean, 
                         bindingAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                         args : Array[AnyRef], culture : System.Globalization.CultureInfo, 
                         activationAttributes : Array[AnyRef], 
                         securityInfo : System.Security.Policy.Evidence): System.Runtime.Remoting.ObjectHandle  = null
   
  def CreateInstance(domain : System.AppDomain, assemblyName : String, typeName : String): System.Runtime.Remoting.ObjectHandle  = null
   
  def CreateInstance(domain : System.AppDomain, assemblyName : String, typeName : String, 
                     ignoreCase : Boolean, bindingAttr : System.Reflection.BindingFlags, 
                     binder : System.Reflection.Binder, args : Array[AnyRef], 
                     culture : System.Globalization.CultureInfo, activationAttributes : Array[AnyRef], 
                     securityAttributes : System.Security.Policy.Evidence): System.Runtime.Remoting.ObjectHandle  = null
   
  def CreateInstanceFrom(domain : System.AppDomain, assemblyFile : String, typeName : String): System.Runtime.Remoting.ObjectHandle  = null
   
  def CreateInstanceFrom(domain : System.AppDomain, assemblyFile : String, typeName : String, 
                         ignoreCase : Boolean, bindingAttr : System.Reflection.BindingFlags, 
                         binder : System.Reflection.Binder, args : Array[AnyRef], 
                         culture : System.Globalization.CultureInfo, activationAttributes : Array[AnyRef], 
                         securityAttributes : System.Security.Policy.Evidence): System.Runtime.Remoting.ObjectHandle  = null
   
  def CreateInstance(activationContext : System.ActivationContext): System.Runtime.Remoting.ObjectHandle  = null
   
  def CreateInstance(activationContext : System.ActivationContext, activationCustomData : Array[String]): System.Runtime.Remoting.ObjectHandle  = null
   
  def CreateComInstanceFrom(assemblyName : String, typeName : String): System.Runtime.Remoting.ObjectHandle  = null
   
  def CreateComInstanceFrom(assemblyName : String, typeName : String, hashValue : Array[UByte], 
                            hashAlgorithm : System.Configuration.Assemblies.AssemblyHashAlgorithm): System.Runtime.Remoting.ObjectHandle  = null
   
  def GetObject(`type` : System.Type, url : String): AnyRef  = null
   
  def GetObject(`type` : System.Type, url : String, state : AnyRef): AnyRef  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class AccessViolationException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ApplicationException extends System.Exception {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class EventArgs extends AnyRef {
  def this() {}
}
object EventArgs {
  val Empty : System.EventArgs  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ResolveEventArgs extends System.EventArgs {
  val Name : String = ""
   
  def this(name : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class AssemblyLoadEventArgs extends System.EventArgs {
  val LoadedAssembly : System.Reflection.Assembly = null
   
  def this(loadedAssembly : System.Reflection.Assembly) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ResolveEventHandler extends System.MulticastDelegate {
  def Invoke(sender : AnyRef, args : System.ResolveEventArgs): System.Reflection.Assembly
   
  def BeginInvoke(sender : AnyRef, args : System.ResolveEventArgs, callback : System.AsyncCallback, 
                  `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): System.Reflection.Assembly
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AssemblyLoadEventHandler extends System.MulticastDelegate {
  def Invoke(sender : AnyRef, args : System.AssemblyLoadEventArgs): Unit
   
  def BeginInvoke(sender : AnyRef, args : System.AssemblyLoadEventArgs, 
                  callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AppDomainInitializer extends System.MulticastDelegate {
  def Invoke(args : Array[String]): Unit
   
  def BeginInvoke(args : Array[String], callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class MarshalByRefObject extends AnyRef {
  protected def MemberwiseClone(cloneIdentity : Boolean): System.MarshalByRefObject
   
  def GetLifetimeService: AnyRef
   
  def InitializeLifetimeService: AnyRef
   
  def CreateObjRef(requestedType : System.Type): System.Runtime.Remoting.ObjRef
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.GuidAttribute("05F696DC-2B29-3663-AD8B-C4389CF2A713")
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait _AppDomain {
  /* abstract */ def GetTypeInfoCount(pcTInfo : CLRByRef[UInt]): Unit
   
  /* abstract */ def GetTypeInfo(iTInfo : UInt, lcid : UInt, ppTInfo : System.IntPtr): Unit
   
  /* abstract */ def GetIDsOfNames(riid : CLRByRef[System.Guid], rgszNames : System.IntPtr, cNames : UInt, lcid : UInt, 
                                   rgDispId : System.IntPtr): Unit
   
  /* abstract */ def Invoke(dispIdMember : UInt, riid : CLRByRef[System.Guid], lcid : UInt, wFlags : Short, 
                            pDispParams : System.IntPtr, pVarResult : System.IntPtr, pExcepInfo : System.IntPtr, 
                            puArgErr : System.IntPtr): Unit
   
  /* abstract */ def ToString: String
   
  /* abstract */ def Equals(other : AnyRef): Boolean
   
  /* abstract */ def GetHashCode: Int
   
  /* abstract */ def GetType: System.Type
   
  /* abstract */ def InitializeLifetimeService: AnyRef
   
  /* abstract */ def GetLifetimeService: AnyRef
   
  /* abstract */ def add_DomainUnload(value : System.EventHandler): Unit
   
  /* abstract */ def remove_DomainUnload(value : System.EventHandler): Unit
   
  /* abstract */ def add_AssemblyLoad(value : System.AssemblyLoadEventHandler): Unit
   
  /* abstract */ def remove_AssemblyLoad(value : System.AssemblyLoadEventHandler): Unit
   
  /* abstract */ def add_ProcessExit(value : System.EventHandler): Unit
   
  /* abstract */ def remove_ProcessExit(value : System.EventHandler): Unit
   
  /* abstract */ def add_TypeResolve(value : System.ResolveEventHandler): Unit
   
  /* abstract */ def remove_TypeResolve(value : System.ResolveEventHandler): Unit
   
  /* abstract */ def add_ResourceResolve(value : System.ResolveEventHandler): Unit
   
  /* abstract */ def remove_ResourceResolve(value : System.ResolveEventHandler): Unit
   
  /* abstract */ def add_AssemblyResolve(value : System.ResolveEventHandler): Unit
   
  /* abstract */ def remove_AssemblyResolve(value : System.ResolveEventHandler): Unit
   
  /* abstract */ def add_UnhandledException(value : System.UnhandledExceptionEventHandler): Unit
   
  /* abstract */ def remove_UnhandledException(value : System.UnhandledExceptionEventHandler): Unit
   
  /* abstract */ def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                                           access : System.Reflection.Emit.AssemblyBuilderAccess): System.Reflection.Emit.AssemblyBuilder
   
  /* abstract */ def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                                           access : System.Reflection.Emit.AssemblyBuilderAccess, dir : String): System.Reflection.Emit.AssemblyBuilder
   
  /* abstract */ def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                                           access : System.Reflection.Emit.AssemblyBuilderAccess, 
                                           evidence : System.Security.Policy.Evidence): System.Reflection.Emit.AssemblyBuilder
   
  /* abstract */ def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                                           access : System.Reflection.Emit.AssemblyBuilderAccess, 
                                           requiredPermissions : System.Security.PermissionSet, 
                                           optionalPermissions : System.Security.PermissionSet, 
                                           refusedPermissions : System.Security.PermissionSet): System.Reflection.Emit.AssemblyBuilder
   
  /* abstract */ def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                                           access : System.Reflection.Emit.AssemblyBuilderAccess, dir : String, 
                                           evidence : System.Security.Policy.Evidence): System.Reflection.Emit.AssemblyBuilder
   
  /* abstract */ def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                                           access : System.Reflection.Emit.AssemblyBuilderAccess, dir : String, 
                                           requiredPermissions : System.Security.PermissionSet, 
                                           optionalPermissions : System.Security.PermissionSet, 
                                           refusedPermissions : System.Security.PermissionSet): System.Reflection.Emit.AssemblyBuilder
   
  /* abstract */ def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                                           access : System.Reflection.Emit.AssemblyBuilderAccess, 
                                           evidence : System.Security.Policy.Evidence, 
                                           requiredPermissions : System.Security.PermissionSet, 
                                           optionalPermissions : System.Security.PermissionSet, 
                                           refusedPermissions : System.Security.PermissionSet): System.Reflection.Emit.AssemblyBuilder
   
  /* abstract */ def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                                           access : System.Reflection.Emit.AssemblyBuilderAccess, dir : String, 
                                           evidence : System.Security.Policy.Evidence, 
                                           requiredPermissions : System.Security.PermissionSet, 
                                           optionalPermissions : System.Security.PermissionSet, 
                                           refusedPermissions : System.Security.PermissionSet): System.Reflection.Emit.AssemblyBuilder
   
  /* abstract */ def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                                           access : System.Reflection.Emit.AssemblyBuilderAccess, dir : String, 
                                           evidence : System.Security.Policy.Evidence, 
                                           requiredPermissions : System.Security.PermissionSet, 
                                           optionalPermissions : System.Security.PermissionSet, 
                                           refusedPermissions : System.Security.PermissionSet, isSynchronized : Boolean): System.Reflection.Emit.AssemblyBuilder
   
  /* abstract */ def CreateInstance(assemblyName : String, typeName : String): System.Runtime.Remoting.ObjectHandle
   
  /* abstract */ def CreateInstanceFrom(assemblyFile : String, typeName : String): System.Runtime.Remoting.ObjectHandle
   
  /* abstract */ def CreateInstance(assemblyName : String, typeName : String, activationAttributes : Array[AnyRef]): System.Runtime.Remoting.ObjectHandle
   
  /* abstract */ def CreateInstanceFrom(assemblyFile : String, typeName : String, activationAttributes : Array[AnyRef]): System.Runtime.Remoting.ObjectHandle
   
  /* abstract */ def CreateInstance(assemblyName : String, typeName : String, ignoreCase : Boolean, 
                                    bindingAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                                    args : Array[AnyRef], culture : System.Globalization.CultureInfo, 
                                    activationAttributes : Array[AnyRef], 
                                    securityAttributes : System.Security.Policy.Evidence): System.Runtime.Remoting.ObjectHandle
   
  /* abstract */ def CreateInstanceFrom(assemblyFile : String, typeName : String, ignoreCase : Boolean, 
                                        bindingAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                                        args : Array[AnyRef], culture : System.Globalization.CultureInfo, 
                                        activationAttributes : Array[AnyRef], 
                                        securityAttributes : System.Security.Policy.Evidence): System.Runtime.Remoting.ObjectHandle
   
  /* abstract */ def Load(assemblyRef : System.Reflection.AssemblyName): System.Reflection.Assembly
   
  /* abstract */ def Load(assemblyString : String): System.Reflection.Assembly
   
  /* abstract */ def Load(rawAssembly : Array[UByte]): System.Reflection.Assembly
   
  /* abstract */ def Load(rawAssembly : Array[UByte], rawSymbolStore : Array[UByte]): System.Reflection.Assembly
   
  /* abstract */ def Load(rawAssembly : Array[UByte], rawSymbolStore : Array[UByte], 
                          securityEvidence : System.Security.Policy.Evidence): System.Reflection.Assembly
   
  /* abstract */ def Load(assemblyRef : System.Reflection.AssemblyName, 
                          assemblySecurity : System.Security.Policy.Evidence): System.Reflection.Assembly
   
  /* abstract */ def Load(assemblyString : String, assemblySecurity : System.Security.Policy.Evidence): System.Reflection.Assembly
   
  /* abstract */ def ExecuteAssembly(assemblyFile : String, assemblySecurity : System.Security.Policy.Evidence): Int
   
  /* abstract */ def ExecuteAssembly(assemblyFile : String): Int
   
  /* abstract */ def ExecuteAssembly(assemblyFile : String, assemblySecurity : System.Security.Policy.Evidence, 
                                     args : Array[String]): Int
   
  /* abstract */ def GetAssemblies: Array[System.Reflection.Assembly]
   
  /* abstract */ def AppendPrivatePath(path : String): Unit
   
  /* abstract */ def ClearPrivatePath: Unit
   
  /* abstract */ def SetShadowCopyPath(s : String): Unit
   
  /* abstract */ def ClearShadowCopyPath: Unit
   
  /* abstract */ def SetCachePath(s : String): Unit
   
  /* abstract */ def SetData(name : String, data : AnyRef): Unit
   
  /* abstract */ def GetData(name : String): AnyRef
   
  /* abstract */ def SetAppDomainPolicy(domainPolicy : System.Security.Policy.PolicyLevel): Unit
   
  /* abstract */ def SetThreadPrincipal(principal : System.Security.Principal.IPrincipal): Unit
   
  /* abstract */ def SetPrincipalPolicy(policy : System.Security.Principal.PrincipalPolicy): Unit
   
  /* abstract */ def DoCallBack(theDelegate : System.CrossAppDomainDelegate): Unit
   
  val Evidence : System.Security.Policy.Evidence = null
   
  val FriendlyName : String = ""
   
  val BaseDirectory : String = ""
   
  val RelativeSearchPath : String = ""
   
  val ShadowCopyFiles : Boolean = false
   
  val DynamicDirectory : String = ""
   
  /* event DomainUnload */
  /* abstract */ def add_DomainUnload(value : System.EventHandler): Unit
  /* abstract */ def remove_DomainUnload(value : System.EventHandler): Unit
   
  /* event AssemblyLoad */
  /* abstract */ def add_AssemblyLoad(value : System.AssemblyLoadEventHandler): Unit
  /* abstract */ def remove_AssemblyLoad(value : System.AssemblyLoadEventHandler): Unit
   
  /* event ProcessExit */
  /* abstract */ def add_ProcessExit(value : System.EventHandler): Unit
  /* abstract */ def remove_ProcessExit(value : System.EventHandler): Unit
   
  /* event TypeResolve */
  /* abstract */ def add_TypeResolve(value : System.ResolveEventHandler): Unit
  /* abstract */ def remove_TypeResolve(value : System.ResolveEventHandler): Unit
   
  /* event ResourceResolve */
  /* abstract */ def add_ResourceResolve(value : System.ResolveEventHandler): Unit
  /* abstract */ def remove_ResourceResolve(value : System.ResolveEventHandler): Unit
   
  /* event AssemblyResolve */
  /* abstract */ def add_AssemblyResolve(value : System.ResolveEventHandler): Unit
  /* abstract */ def remove_AssemblyResolve(value : System.ResolveEventHandler): Unit
   
  /* event UnhandledException */
  /* abstract */ def add_UnhandledException(value : System.UnhandledExceptionEventHandler): Unit
  /* abstract */ def remove_UnhandledException(value : System.UnhandledExceptionEventHandler): Unit
}
 
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
sealed class AppDomain extends System.MarshalByRefObject with System._AppDomain with System.Security.IEvidenceFactory {
  def add_AssemblyLoad(value : System.AssemblyLoadEventHandler): Unit
   
  def remove_AssemblyLoad(value : System.AssemblyLoadEventHandler): Unit
   
  def add_TypeResolve(value : System.ResolveEventHandler): Unit
   
  def remove_TypeResolve(value : System.ResolveEventHandler): Unit
   
  def add_ResourceResolve(value : System.ResolveEventHandler): Unit
   
  def remove_ResourceResolve(value : System.ResolveEventHandler): Unit
   
  def add_AssemblyResolve(value : System.ResolveEventHandler): Unit
   
  def remove_AssemblyResolve(value : System.ResolveEventHandler): Unit
   
  def add_ReflectionOnlyAssemblyResolve(value : System.ResolveEventHandler): Unit
   
  def remove_ReflectionOnlyAssemblyResolve(value : System.ResolveEventHandler): Unit
   
  def GetType: System.Type
   
  def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                            access : System.Reflection.Emit.AssemblyBuilderAccess): System.Reflection.Emit.AssemblyBuilder
   
  def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                            access : System.Reflection.Emit.AssemblyBuilderAccess, 
                            assemblyAttributes : System.Collections.Generic.IEnumerable[System.Reflection.Emit.CustomAttributeBuilder]): System.Reflection.Emit.AssemblyBuilder
   
  def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                            access : System.Reflection.Emit.AssemblyBuilderAccess, dir : String): System.Reflection.Emit.AssemblyBuilder
   
  def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                            access : System.Reflection.Emit.AssemblyBuilderAccess, 
                            evidence : System.Security.Policy.Evidence): System.Reflection.Emit.AssemblyBuilder
   
  def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                            access : System.Reflection.Emit.AssemblyBuilderAccess, 
                            requiredPermissions : System.Security.PermissionSet, 
                            optionalPermissions : System.Security.PermissionSet, 
                            refusedPermissions : System.Security.PermissionSet): System.Reflection.Emit.AssemblyBuilder
   
  def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                            access : System.Reflection.Emit.AssemblyBuilderAccess, dir : String, 
                            evidence : System.Security.Policy.Evidence): System.Reflection.Emit.AssemblyBuilder
   
  def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                            access : System.Reflection.Emit.AssemblyBuilderAccess, dir : String, 
                            requiredPermissions : System.Security.PermissionSet, 
                            optionalPermissions : System.Security.PermissionSet, 
                            refusedPermissions : System.Security.PermissionSet): System.Reflection.Emit.AssemblyBuilder
   
  def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                            access : System.Reflection.Emit.AssemblyBuilderAccess, 
                            evidence : System.Security.Policy.Evidence, 
                            requiredPermissions : System.Security.PermissionSet, 
                            optionalPermissions : System.Security.PermissionSet, 
                            refusedPermissions : System.Security.PermissionSet): System.Reflection.Emit.AssemblyBuilder
   
  def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                            access : System.Reflection.Emit.AssemblyBuilderAccess, dir : String, 
                            evidence : System.Security.Policy.Evidence, 
                            requiredPermissions : System.Security.PermissionSet, 
                            optionalPermissions : System.Security.PermissionSet, 
                            refusedPermissions : System.Security.PermissionSet): System.Reflection.Emit.AssemblyBuilder
   
  def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                            access : System.Reflection.Emit.AssemblyBuilderAccess, dir : String, 
                            evidence : System.Security.Policy.Evidence, 
                            requiredPermissions : System.Security.PermissionSet, 
                            optionalPermissions : System.Security.PermissionSet, 
                            refusedPermissions : System.Security.PermissionSet, isSynchronized : Boolean): System.Reflection.Emit.AssemblyBuilder
   
  def DefineDynamicAssembly(name : System.Reflection.AssemblyName, 
                            access : System.Reflection.Emit.AssemblyBuilderAccess, dir : String, 
                            evidence : System.Security.Policy.Evidence, 
                            requiredPermissions : System.Security.PermissionSet, 
                            optionalPermissions : System.Security.PermissionSet, 
                            refusedPermissions : System.Security.PermissionSet, isSynchronized : Boolean, 
                            assemblyAttributes : System.Collections.Generic.IEnumerable[System.Reflection.Emit.CustomAttributeBuilder]): System.Reflection.Emit.AssemblyBuilder
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def ApplyPolicy(assemblyName : String): String
   
  def CreateInstance(assemblyName : String, typeName : String): System.Runtime.Remoting.ObjectHandle
   
  def CreateInstanceFrom(assemblyFile : String, typeName : String): System.Runtime.Remoting.ObjectHandle
   
  def CreateComInstanceFrom(assemblyName : String, typeName : String): System.Runtime.Remoting.ObjectHandle
   
  def CreateComInstanceFrom(assemblyFile : String, typeName : String, hashValue : Array[UByte], 
                            hashAlgorithm : System.Configuration.Assemblies.AssemblyHashAlgorithm): System.Runtime.Remoting.ObjectHandle
   
  def CreateInstance(assemblyName : String, typeName : String, activationAttributes : Array[AnyRef]): System.Runtime.Remoting.ObjectHandle
   
  def CreateInstanceFrom(assemblyFile : String, typeName : String, activationAttributes : Array[AnyRef]): System.Runtime.Remoting.ObjectHandle
   
  def CreateInstance(assemblyName : String, typeName : String, ignoreCase : Boolean, 
                     bindingAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                     args : Array[AnyRef], culture : System.Globalization.CultureInfo, 
                     activationAttributes : Array[AnyRef], 
                     securityAttributes : System.Security.Policy.Evidence): System.Runtime.Remoting.ObjectHandle
   
  def CreateInstanceFrom(assemblyFile : String, typeName : String, ignoreCase : Boolean, 
                         bindingAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                         args : Array[AnyRef], culture : System.Globalization.CultureInfo, 
                         activationAttributes : Array[AnyRef], 
                         securityAttributes : System.Security.Policy.Evidence): System.Runtime.Remoting.ObjectHandle
   
  def Load(assemblyRef : System.Reflection.AssemblyName): System.Reflection.Assembly
   
  def Load(assemblyString : String): System.Reflection.Assembly
   
  def Load(rawAssembly : Array[UByte]): System.Reflection.Assembly
   
  def Load(rawAssembly : Array[UByte], rawSymbolStore : Array[UByte]): System.Reflection.Assembly
   
  def Load(rawAssembly : Array[UByte], rawSymbolStore : Array[UByte], 
           securityEvidence : System.Security.Policy.Evidence): System.Reflection.Assembly
   
  def Load(assemblyRef : System.Reflection.AssemblyName, 
           assemblySecurity : System.Security.Policy.Evidence): System.Reflection.Assembly
   
  def Load(assemblyString : String, assemblySecurity : System.Security.Policy.Evidence): System.Reflection.Assembly
   
  def ExecuteAssembly(assemblyFile : String): Int
   
  def ExecuteAssembly(assemblyFile : String, assemblySecurity : System.Security.Policy.Evidence): Int
   
  def ExecuteAssembly(assemblyFile : String, assemblySecurity : System.Security.Policy.Evidence, 
                      args : Array[String]): Int
   
  def ExecuteAssembly(assemblyFile : String, assemblySecurity : System.Security.Policy.Evidence, 
                      args : Array[String], hashValue : Array[UByte], 
                      hashAlgorithm : System.Configuration.Assemblies.AssemblyHashAlgorithm): Int
   
  def ExecuteAssemblyByName(assemblyName : String): Int
   
  def ExecuteAssemblyByName(assemblyName : String, assemblySecurity : System.Security.Policy.Evidence): Int
   
  def ExecuteAssemblyByName(assemblyName : String, assemblySecurity : System.Security.Policy.Evidence, 
                            args : Array[String]): Int
   
  def ExecuteAssemblyByName(assemblyName : System.Reflection.AssemblyName, 
                            assemblySecurity : System.Security.Policy.Evidence, args : Array[String]): Int
   
  def ToString: String
   
  def GetAssemblies: Array[System.Reflection.Assembly]
   
  def ReflectionOnlyGetAssemblies: Array[System.Reflection.Assembly]
   
  def IsFinalizingForUnload: Boolean
   
  @System.ObsoleteAttribute("AppDomain.AppendPrivatePath has been deprecated. Please investigate the use of AppDomainSetup.PrivateBinPath instead. http://go.microsoft.com/fwlink/?linkid=14202")
  def AppendPrivatePath(path : String): Unit
   
  @System.ObsoleteAttribute("AppDomain.ClearPrivatePath has been deprecated. Please investigate the use of AppDomainSetup.PrivateBinPath instead. http://go.microsoft.com/fwlink/?linkid=14202")
  def ClearPrivatePath: Unit
   
  @System.ObsoleteAttribute("AppDomain.ClearShadowCopyPath has been deprecated. Please investigate the use of AppDomainSetup.ShadowCopyDirectories instead. http://go.microsoft.com/fwlink/?linkid=14202")
  def ClearShadowCopyPath: Unit
   
  @System.ObsoleteAttribute("AppDomain.SetCachePath has been deprecated. Please investigate the use of AppDomainSetup.CachePath instead. http://go.microsoft.com/fwlink/?linkid=14202")
  def SetCachePath(path : String): Unit
   
  def SetData(name : String, data : AnyRef): Unit
   
  def SetData(name : String, data : AnyRef, permission : System.Security.IPermission): Unit
   
  def GetData(name : String): AnyRef
   
  def SetAppDomainPolicy(domainPolicy : System.Security.Policy.PolicyLevel): Unit
   
  def SetThreadPrincipal(principal : System.Security.Principal.IPrincipal): Unit
   
  def SetPrincipalPolicy(policy : System.Security.Principal.PrincipalPolicy): Unit
   
  def InitializeLifetimeService: AnyRef
   
  def DoCallBack(callBackDelegate : System.CrossAppDomainDelegate): Unit
   
  def add_ProcessExit(value : System.EventHandler): Unit
   
  def remove_ProcessExit(value : System.EventHandler): Unit
   
  def add_DomainUnload(value : System.EventHandler): Unit
   
  def remove_DomainUnload(value : System.EventHandler): Unit
   
  def add_UnhandledException(value : System.UnhandledExceptionEventHandler): Unit
   
  def remove_UnhandledException(value : System.UnhandledExceptionEventHandler): Unit
   
  @System.ObsoleteAttribute("AppDomain.SetShadowCopyPath has been deprecated. Please investigate the use of AppDomainSetup.ShadowCopyDirectories instead. http://go.microsoft.com/fwlink/?linkid=14202")
  def SetShadowCopyPath(path : String): Unit
   
  @System.ObsoleteAttribute("AppDomain.SetShadowCopyFiles has been deprecated. Please investigate the use of AppDomainSetup.ShadowCopyFiles instead. http://go.microsoft.com/fwlink/?linkid=14202")
  def SetShadowCopyFiles: Unit
   
  @System.ObsoleteAttribute("AppDomain.SetDynamicBase has been deprecated. Please investigate the use of AppDomainSetup.DynamicBase instead. http://go.microsoft.com/fwlink/?linkid=14202")
  def SetDynamicBase(path : String): Unit
   
  def CreateInstanceAndUnwrap(assemblyName : String, typeName : String): AnyRef
   
  def CreateInstanceAndUnwrap(assemblyName : String, typeName : String, activationAttributes : Array[AnyRef]): AnyRef
   
  def CreateInstanceAndUnwrap(assemblyName : String, typeName : String, ignoreCase : Boolean, 
                              bindingAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                              args : Array[AnyRef], culture : System.Globalization.CultureInfo, 
                              activationAttributes : Array[AnyRef], 
                              securityAttributes : System.Security.Policy.Evidence): AnyRef
   
  def CreateInstanceFromAndUnwrap(assemblyName : String, typeName : String): AnyRef
   
  def CreateInstanceFromAndUnwrap(assemblyName : String, typeName : String, activationAttributes : Array[AnyRef]): AnyRef
   
  def CreateInstanceFromAndUnwrap(assemblyName : String, typeName : String, ignoreCase : Boolean, 
                                  bindingAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                                  args : Array[AnyRef], culture : System.Globalization.CultureInfo, 
                                  activationAttributes : Array[AnyRef], 
                                  securityAttributes : System.Security.Policy.Evidence): AnyRef
   
  def IsDefaultAppDomain: Boolean
   
  val DomainManager : System.AppDomainManager = null
   
  val Evidence : System.Security.Policy.Evidence = null
   
  val FriendlyName : String = ""
   
  val BaseDirectory : String = ""
   
  val RelativeSearchPath : String = ""
   
  val ShadowCopyFiles : Boolean = false
   
  val ActivationContext : System.ActivationContext = null
   
  val ApplicationIdentity : System.ApplicationIdentity = null
   
  val ApplicationTrust : System.Security.Policy.ApplicationTrust = null
   
  val DynamicDirectory : String = ""
   
  val SetupInformation : System.AppDomainSetup = null
   
  val Id : Int = 0
   
  /* event AssemblyLoad */
  def add_AssemblyLoad(value : System.AssemblyLoadEventHandler): Unit
  def remove_AssemblyLoad(value : System.AssemblyLoadEventHandler): Unit
   
  /* event TypeResolve */
  def add_TypeResolve(value : System.ResolveEventHandler): Unit
  def remove_TypeResolve(value : System.ResolveEventHandler): Unit
   
  /* event ResourceResolve */
  def add_ResourceResolve(value : System.ResolveEventHandler): Unit
  def remove_ResourceResolve(value : System.ResolveEventHandler): Unit
   
  /* event AssemblyResolve */
  def add_AssemblyResolve(value : System.ResolveEventHandler): Unit
  def remove_AssemblyResolve(value : System.ResolveEventHandler): Unit
   
  /* event ReflectionOnlyAssemblyResolve */
  def add_ReflectionOnlyAssemblyResolve(value : System.ResolveEventHandler): Unit
  def remove_ReflectionOnlyAssemblyResolve(value : System.ResolveEventHandler): Unit
   
  /* event ProcessExit */
  def add_ProcessExit(value : System.EventHandler): Unit
  def remove_ProcessExit(value : System.EventHandler): Unit
   
  /* event DomainUnload */
  def add_DomainUnload(value : System.EventHandler): Unit
  def remove_DomainUnload(value : System.EventHandler): Unit
   
  /* event UnhandledException */
  def add_UnhandledException(value : System.UnhandledExceptionEventHandler): Unit
  def remove_UnhandledException(value : System.UnhandledExceptionEventHandler): Unit
}
object AppDomain {
  @System.ObsoleteAttribute("AppDomain.GetCurrentThreadId has been deprecated because it does not provide a stable Id when managed threads are running on fibers (aka lightweight threads). To get a stable identifier for a managed thread, use the ManagedThreadId property on Thread.  http://go.microsoft.com/fwlink/?linkid=14202", false)
  def GetCurrentThreadId: Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptAppDomain, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Unload(domain : System.AppDomain): Unit  = {}
   
  def CreateDomain(friendlyName : String, securityInfo : System.Security.Policy.Evidence): System.AppDomain  = null
   
  def CreateDomain(friendlyName : String, securityInfo : System.Security.Policy.Evidence, 
                   appBasePath : String, appRelativeSearchPath : String, shadowCopyFiles : Boolean): System.AppDomain  = null
   
  def CreateDomain(friendlyName : String): System.AppDomain  = null
   
  def CreateDomain(friendlyName : String, securityInfo : System.Security.Policy.Evidence, 
                   info : System.AppDomainSetup): System.AppDomain  = null
   
  def CreateDomain(friendlyName : String, securityInfo : System.Security.Policy.Evidence, 
                   info : System.AppDomainSetup, grantSet : System.Security.PermissionSet, 
                   fullTrustAssemblies : Array[System.Security.Policy.StrongName]): System.AppDomain  = null
   
  def CreateDomain(friendlyName : String, securityInfo : System.Security.Policy.Evidence, 
                   appBasePath : String, appRelativeSearchPath : String, shadowCopyFiles : Boolean, 
                   adInit : System.AppDomainInitializer, adInitArgs : Array[String]): System.AppDomain  = null
   
  val CurrentDomain : System.AppDomain = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class CrossAppDomainDelegate extends System.MulticastDelegate {
  def Invoke: Unit
   
  def BeginInvoke(callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed abstract class AppDomainManagerInitializationOptions extends System.Enum {
  def ==(that: System.AppDomainManagerInitializationOptions): Boolean = false
  def !=(that: System.AppDomainManagerInitializationOptions): Boolean = false
  def  <(that: System.AppDomainManagerInitializationOptions): Boolean = false
  def <=(that: System.AppDomainManagerInitializationOptions): Boolean = false
  def  >(that: System.AppDomainManagerInitializationOptions): Boolean = false
  def >=(that: System.AppDomainManagerInitializationOptions): Boolean = false
  def  |(that: System.AppDomainManagerInitializationOptions): Boolean = false
  def  &(that: System.AppDomainManagerInitializationOptions): Boolean = false
  def  ^(that: System.AppDomainManagerInitializationOptions): Boolean = false
}
object AppDomainManagerInitializationOptions{
  val None	 = value(0)
  val RegisterWithHost	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.AppDomainManagerInitializationOptions = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class AppDomainManager extends System.MarshalByRefObject {
  def CreateDomain(friendlyName : String, securityInfo : System.Security.Policy.Evidence, 
                   appDomainInfo : System.AppDomainSetup): System.AppDomain
   
  def InitializeNewDomain(appDomainInfo : System.AppDomainSetup): Unit
   
  def CheckSecuritySettings(state : System.Security.SecurityState): Boolean
   
  var InitializationFlags : System.AppDomainManagerInitializationOptions = System.AppDomainManagerInitializationOptions.None
   
  val ApplicationActivator : System.Runtime.Hosting.ApplicationActivator = null
   
  val HostSecurityManager : System.Security.HostSecurityManager = null
   
  val HostExecutionContextManager : System.Threading.HostExecutionContextManager = null
   
  val EntryAssembly : System.Reflection.Assembly = null
   
  def this() {}
}
object AppDomainManager {
  protected def CreateDomainHelper(friendlyName : String, securityInfo : System.Security.Policy.Evidence, 
                                   appDomainInfo : System.AppDomainSetup): System.AppDomain  = null
}
 
@System.Runtime.InteropServices.GuidAttribute("27FFF232-A7A8-40dd-8D4A-734AD59FCD41")
@System.Runtime.InteropServices.InterfaceTypeAttribute(System.Runtime.InteropServices.ComInterfaceType.InterfaceIsIUnknown)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IAppDomainSetup {
  var ApplicationBase : String = ""
   
  var ApplicationName : String = ""
   
  var CachePath : String = ""
   
  var ConfigurationFile : String = ""
   
  var DynamicBase : String = ""
   
  var LicenseFile : String = ""
   
  var PrivateBinPath : String = ""
   
  var PrivateBinPathProbe : String = ""
   
  var ShadowCopyDirectories : String = ""
   
  var ShadowCopyFiles : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
sealed class AppDomainSetup extends AnyRef with System.IAppDomainSetup {
  def GetConfigurationBytes: Array[UByte]
   
  def SetConfigurationBytes(value : Array[UByte]): Unit
   
  var ApplicationBase : String = ""
   
  var ConfigurationFile : String = ""
   
  var DynamicBase : String = ""
   
  var DisallowPublisherPolicy : Boolean = false
   
  var DisallowBindingRedirects : Boolean = false
   
  var DisallowCodeDownload : Boolean = false
   
  var DisallowApplicationBaseProbing : Boolean = false
   
  var ApplicationName : String = ""
   
  @System.XmlIgnoreMemberAttribute()
  var AppDomainInitializer : System.AppDomainInitializer = null
   
  var AppDomainInitializerArguments : Array[String] = Array.empty[String]
   
  @System.XmlIgnoreMemberAttribute()
  var ActivationArguments : System.Runtime.Hosting.ActivationArguments = null
   
  @System.XmlIgnoreMemberAttribute()
  var ApplicationTrust : System.Security.Policy.ApplicationTrust = null
   
  var PrivateBinPath : String = ""
   
  var PrivateBinPathProbe : String = ""
   
  var ShadowCopyDirectories : String = ""
   
  var ShadowCopyFiles : String = ""
   
  var CachePath : String = ""
   
  var LicenseFile : String = ""
   
  var LoaderOptimization : System.LoaderOptimization = System.LoaderOptimization.NotSpecified
   
  var SandboxInterop : Boolean = false
   
  def this() {}
   
  def this(activationContext : System.ActivationContext) {}
   
  def this(activationArguments : System.Runtime.Hosting.ActivationArguments) {}
}
 
sealed abstract class LoaderOptimization extends System.Enum {
  def ==(that: System.LoaderOptimization): Boolean = false
  def !=(that: System.LoaderOptimization): Boolean = false
  def  <(that: System.LoaderOptimization): Boolean = false
  def <=(that: System.LoaderOptimization): Boolean = false
  def  >(that: System.LoaderOptimization): Boolean = false
  def >=(that: System.LoaderOptimization): Boolean = false
  def  |(that: System.LoaderOptimization): Boolean = false
  def  &(that: System.LoaderOptimization): Boolean = false
  def  ^(that: System.LoaderOptimization): Boolean = false
}
object LoaderOptimization{
  val NotSpecified	 = value(0)
  val SingleDomain	 = value(1)
  val MultiDomain	 = value(2)
  val MultiDomainHost	 = value(3)
  val DomainMask	 = value(3)
  val DisallowBindings	 = value(4)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.LoaderOptimization = null
}
 
@System.AttributeUsageAttribute(32767 /* Inherited = true, AllowMultiple = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
abstract class Attribute extends AnyRef with System.Runtime.InteropServices._Attribute {
  def Equals(obj : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def Match(obj : AnyRef): Boolean
   
  def IsDefaultAttribute: Boolean
   
  val TypeId : AnyRef = null
   
  protected def this() {}
}
object Attribute {
  def GetCustomAttributes(element : System.Reflection.MemberInfo, `type` : System.Type): Array[System.Attribute]  = Array.empty[System.Attribute]
   
  def GetCustomAttributes(element : System.Reflection.MemberInfo, `type` : System.Type, inherit : Boolean): Array[System.Attribute]  = Array.empty[System.Attribute]
   
  def GetCustomAttributes(element : System.Reflection.MemberInfo): Array[System.Attribute]  = Array.empty[System.Attribute]
   
  def GetCustomAttributes(element : System.Reflection.MemberInfo, inherit : Boolean): Array[System.Attribute]  = Array.empty[System.Attribute]
   
  def IsDefined(element : System.Reflection.MemberInfo, attributeType : System.Type): Boolean  = false
   
  def IsDefined(element : System.Reflection.MemberInfo, attributeType : System.Type, 
                inherit : Boolean): Boolean  = false
   
  def GetCustomAttribute(element : System.Reflection.MemberInfo, attributeType : System.Type): System.Attribute  = null
   
  def GetCustomAttribute(element : System.Reflection.MemberInfo, attributeType : System.Type, 
                         inherit : Boolean): System.Attribute  = null
   
  def GetCustomAttributes(element : System.Reflection.ParameterInfo): Array[System.Attribute]  = Array.empty[System.Attribute]
   
  def GetCustomAttributes(element : System.Reflection.ParameterInfo, attributeType : System.Type): Array[System.Attribute]  = Array.empty[System.Attribute]
   
  def GetCustomAttributes(element : System.Reflection.ParameterInfo, attributeType : System.Type, 
                          inherit : Boolean): Array[System.Attribute]  = Array.empty[System.Attribute]
   
  def GetCustomAttributes(element : System.Reflection.ParameterInfo, inherit : Boolean): Array[System.Attribute]  = Array.empty[System.Attribute]
   
  def IsDefined(element : System.Reflection.ParameterInfo, attributeType : System.Type): Boolean  = false
   
  def IsDefined(element : System.Reflection.ParameterInfo, attributeType : System.Type, 
                inherit : Boolean): Boolean  = false
   
  def GetCustomAttribute(element : System.Reflection.ParameterInfo, attributeType : System.Type): System.Attribute  = null
   
  def GetCustomAttribute(element : System.Reflection.ParameterInfo, attributeType : System.Type, 
                         inherit : Boolean): System.Attribute  = null
   
  def GetCustomAttributes(element : System.Reflection.Module, attributeType : System.Type): Array[System.Attribute]  = Array.empty[System.Attribute]
   
  def GetCustomAttributes(element : System.Reflection.Module): Array[System.Attribute]  = Array.empty[System.Attribute]
   
  def GetCustomAttributes(element : System.Reflection.Module, inherit : Boolean): Array[System.Attribute]  = Array.empty[System.Attribute]
   
  def GetCustomAttributes(element : System.Reflection.Module, attributeType : System.Type, inherit : Boolean): Array[System.Attribute]  = Array.empty[System.Attribute]
   
  def IsDefined(element : System.Reflection.Module, attributeType : System.Type): Boolean  = false
   
  def IsDefined(element : System.Reflection.Module, attributeType : System.Type, inherit : Boolean): Boolean  = false
   
  def GetCustomAttribute(element : System.Reflection.Module, attributeType : System.Type): System.Attribute  = null
   
  def GetCustomAttribute(element : System.Reflection.Module, attributeType : System.Type, inherit : Boolean): System.Attribute  = null
   
  def GetCustomAttributes(element : System.Reflection.Assembly, attributeType : System.Type): Array[System.Attribute]  = Array.empty[System.Attribute]
   
  def GetCustomAttributes(element : System.Reflection.Assembly, attributeType : System.Type, inherit : Boolean): Array[System.Attribute]  = Array.empty[System.Attribute]
   
  def GetCustomAttributes(element : System.Reflection.Assembly): Array[System.Attribute]  = Array.empty[System.Attribute]
   
  def GetCustomAttributes(element : System.Reflection.Assembly, inherit : Boolean): Array[System.Attribute]  = Array.empty[System.Attribute]
   
  def IsDefined(element : System.Reflection.Assembly, attributeType : System.Type): Boolean  = false
   
  def IsDefined(element : System.Reflection.Assembly, attributeType : System.Type, inherit : Boolean): Boolean  = false
   
  def GetCustomAttribute(element : System.Reflection.Assembly, attributeType : System.Type): System.Attribute  = null
   
  def GetCustomAttribute(element : System.Reflection.Assembly, attributeType : System.Type, inherit : Boolean): System.Attribute  = null
}
 
@System.AttributeUsageAttribute(64)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class LoaderOptimizationAttribute extends System.Attribute {
  val Value : System.LoaderOptimization = System.LoaderOptimization.NotSpecified
   
  def this(value : UByte) {}
   
  def this(value : System.LoaderOptimization) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class AppDomainUnloadedException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(false)
sealed class ActivationContext extends AnyRef with System.IDisposable with System.Runtime.Serialization.ISerializable {
  protected def Finalize: Unit
   
  def Dispose: Unit
   
  val Identity : System.ApplicationIdentity = null
   
  val Form : System.ActivationContext.ContextForm = System.ActivationContext.ContextForm.Loose
   
  val ApplicationManifestBytes : Array[UByte] = Array.empty[UByte]
   
  val DeploymentManifestBytes : Array[UByte] = Array.empty[UByte]
}
object ActivationContext {
  def CreatePartialActivationContext(identity : System.ApplicationIdentity): System.ActivationContext  = null
   
  def CreatePartialActivationContext(identity : System.ApplicationIdentity, manifestPaths : Array[String]): System.ActivationContext  = null
   
  sealed abstract class ContextForm extends System.Enum {
    def ==(that: System.ActivationContext.ContextForm): Boolean = false
    def !=(that: System.ActivationContext.ContextForm): Boolean = false
    def  <(that: System.ActivationContext.ContextForm): Boolean = false
    def <=(that: System.ActivationContext.ContextForm): Boolean = false
    def  >(that: System.ActivationContext.ContextForm): Boolean = false
    def >=(that: System.ActivationContext.ContextForm): Boolean = false
    def  |(that: System.ActivationContext.ContextForm): Boolean = false
    def  &(that: System.ActivationContext.ContextForm): Boolean = false
    def  ^(that: System.ActivationContext.ContextForm): Boolean = false
  }
  object ContextForm{
    val Loose	 = value(0)
    val StoreBounded	 = value(1)
     
    /* an artifact for CLR enums */ private def value(i: Int): System.ActivationContext.ContextForm = null
  }
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(false)
sealed class ApplicationIdentity extends AnyRef with System.Runtime.Serialization.ISerializable {
  def ToString: String
   
  val FullName : String = ""
   
  val CodeBase : String = ""
   
  def this(applicationIdentityFullName : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ApplicationId extends AnyRef {
  def Copy: System.ApplicationId
   
  def ToString: String
   
  def Equals(o : AnyRef): Boolean
   
  def GetHashCode: Int
   
  val PublicKeyToken : Array[UByte] = Array.empty[UByte]
   
  val Name : String = ""
   
  val Version : System.Version = null
   
  val ProcessorArchitecture : String = ""
   
  val Culture : String = ""
   
  def this(publicKeyToken : Array[UByte], name : String, version : System.Version, 
           processorArchitecture : String, culture : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ArgumentException extends System.SystemException with System.Runtime.Serialization.ISerializable {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  val Message : String = ""
   
  val ParamName : String = ""
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  def this(message : String, paramName : String, innerException : System.Exception) {}
   
  def this(message : String, paramName : String) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ArgumentNullException extends System.ArgumentException {
  def this() {}
   
  def this(paramName : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  def this(paramName : String, message : String) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ArgumentOutOfRangeException extends System.ArgumentException with System.Runtime.Serialization.ISerializable {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  val Message : String = ""
   
  val ActualValue : AnyRef = null
   
  def this() {}
   
  def this(paramName : String) {}
   
  def this(paramName : String, message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  def this(paramName : String, actualValue : AnyRef, message : String) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
sealed class ArgIterator extends System.ValueType {
  @System.CLSCompliantAttribute(false)
  def GetNextArg: System.TypedReference
   
  @System.CLSCompliantAttribute(false)
  def GetNextArg(rth : System.TypedReference): System.TypedReference
   
  def End: Unit
   
  def GetRemainingCount: Int
   
  def GetNextArgType: System.RuntimeTypeHandle
   
  def GetHashCode: Int
   
  def Equals(o : AnyRef): Boolean
   
  def this(arglist : System.RuntimeArgumentHandle) {}
   
  @System.CLSCompliantAttribute(false)
  def this(arglist : System.RuntimeArgumentHandle, ptr : CLRPointer[Unit]) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ArithmeticException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ArrayTypeMismatchException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AsyncCallback extends System.MulticastDelegate {
  def Invoke(ar : System.IAsyncResult): Unit
   
  def BeginInvoke(ar : System.IAsyncResult, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed abstract class AttributeTargets extends System.Enum {
  def ==(that: System.AttributeTargets): Boolean = false
  def !=(that: System.AttributeTargets): Boolean = false
  def  <(that: System.AttributeTargets): Boolean = false
  def <=(that: System.AttributeTargets): Boolean = false
  def  >(that: System.AttributeTargets): Boolean = false
  def >=(that: System.AttributeTargets): Boolean = false
  def  |(that: System.AttributeTargets): Boolean = false
  def  &(that: System.AttributeTargets): Boolean = false
  def  ^(that: System.AttributeTargets): Boolean = false
}
object AttributeTargets{
  val Assembly	 = value(1)
  val Module	 = value(2)
  val Class	 = value(4)
  val Struct	 = value(8)
  val Enum	 = value(16)
  val Constructor	 = value(32)
  val Method	 = value(64)
  val Property	 = value(128)
  val Field	 = value(256)
  val Event	 = value(512)
  val Interface	 = value(1024)
  val Parameter	 = value(2048)
  val Delegate	 = value(4096)
  val ReturnValue	 = value(8192)
  val GenericParameter	 = value(16384)
  val All	 = value(32767)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.AttributeTargets = null
}
 
@System.AttributeUsageAttribute(4 /* Inherited = true */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class AttributeUsageAttribute extends System.Attribute {
  val ValidOn : System.AttributeTargets = System.AttributeTargets.Assembly
   
  var AllowMultiple : Boolean = false
   
  var Inherited : Boolean = false
   
  def this(validOn : System.AttributeTargets) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class BadImageFormatException extends System.SystemException {
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
 
abstract sealed class BitConverter extends AnyRef 
object BitConverter {
  def GetBytes(value : Boolean): Array[UByte]  = Array.empty[UByte]
   
  def GetBytes(value : Char): Array[UByte]  = Array.empty[UByte]
   
  def GetBytes(value : Short): Array[UByte]  = Array.empty[UByte]
   
  def GetBytes(value : Int): Array[UByte]  = Array.empty[UByte]
   
  def GetBytes(value : Long): Array[UByte]  = Array.empty[UByte]
   
  @System.CLSCompliantAttribute(false)
  def GetBytes(value : UShort): Array[UByte]  = Array.empty[UByte]
   
  @System.CLSCompliantAttribute(false)
  def GetBytes(value : UInt): Array[UByte]  = Array.empty[UByte]
   
  @System.CLSCompliantAttribute(false)
  def GetBytes(value : ULong): Array[UByte]  = Array.empty[UByte]
   
  def GetBytes(value : Float): Array[UByte]  = Array.empty[UByte]
   
  def GetBytes(value : Double): Array[UByte]  = Array.empty[UByte]
   
  def ToChar(value : Array[UByte], startIndex : Int): Char  = '0'
   
  def ToInt16(value : Array[UByte], startIndex : Int): Short  = 0
   
  def ToInt32(value : Array[UByte], startIndex : Int): Int  = 0
   
  def ToInt64(value : Array[UByte], startIndex : Int): Long  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : Array[UByte], startIndex : Int): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : Array[UByte], startIndex : Int): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : Array[UByte], startIndex : Int): ULong  = 0
   
  def ToSingle(value : Array[UByte], startIndex : Int): Float  = 0
   
  def ToDouble(value : Array[UByte], startIndex : Int): Double  = 0
   
  def ToString(value : Array[UByte], startIndex : Int, length : Int): String  = ""
   
  def ToString(value : Array[UByte]): String  = ""
   
  def ToString(value : Array[UByte], startIndex : Int): String  = ""
   
  def ToBoolean(value : Array[UByte], startIndex : Int): Boolean  = false
   
  def DoubleToInt64Bits(value : Double): Long  = 0
   
  def Int64BitsToDouble(value : Long): Double  = 0
   
  val IsLittleEndian : Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Boolean extends System.ValueType with System.IComparable with System.IConvertible with System.IComparable[Boolean] with 
                             System.IEquatable[Boolean] {
  def GetHashCode: Int
   
  def ToString: String
   
  def ToString(provider : System.IFormatProvider): String
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : Boolean): Boolean
   
  def CompareTo(obj : AnyRef): Int
   
  def CompareTo(value : Boolean): Int
   
  def GetTypeCode: System.TypeCode
}
object Boolean {
  def Parse(value : String): Boolean  = false
   
  def TryParse(value : String, result : CLRByRef[Boolean]): Boolean  = false
   
  val TrueString : String  = ""
   
  val FalseString : String  = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract sealed class Buffer extends AnyRef 
object Buffer {
  def BlockCopy(src : System.Array, srcOffset : Int, dst : System.Array, dstOffset : Int, count : Int): Unit  = {}
   
  def GetByte(array : System.Array, index : Int): UByte  = 0
   
  def SetByte(array : System.Array, index : Int, value : UByte): Unit  = {}
   
  def ByteLength(array : System.Array): Int  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Byte extends System.ValueType with System.IComparable with System.IFormattable with System.IConvertible with 
                          System.IComparable[UByte] with System.IEquatable[UByte] {
  def CompareTo(value : AnyRef): Int
   
  def CompareTo(value : UByte): Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : UByte): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def ToString(format : String): String
   
  def ToString(provider : System.IFormatProvider): String
   
  def ToString(format : String, provider : System.IFormatProvider): String
   
  def GetTypeCode: System.TypeCode
}
object Byte {
  def Parse(s : String): UByte  = 0
   
  def Parse(s : String, style : System.Globalization.NumberStyles): UByte  = 0
   
  def Parse(s : String, provider : System.IFormatProvider): UByte  = 0
   
  def Parse(s : String, style : System.Globalization.NumberStyles, 
            provider : System.IFormatProvider): UByte  = 0
   
  def TryParse(s : String, result : CLRByRef[UByte]): Boolean  = false
   
  def TryParse(s : String, style : System.Globalization.NumberStyles, 
               provider : System.IFormatProvider, result : CLRByRef[UByte]): Boolean  = false
   
  val MaxValue : UByte  = 0
   
  val MinValue : UByte  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class CannotUnloadAppDomainException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Char extends System.ValueType with System.IComparable with System.IConvertible with System.IComparable[Char] with 
                          System.IEquatable[Char] {
  def GetHashCode: Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : Char): Boolean
   
  def CompareTo(value : AnyRef): Int
   
  def CompareTo(value : Char): Int
   
  def ToString: String
   
  def ToString(provider : System.IFormatProvider): String
   
  def GetTypeCode: System.TypeCode
}
object Char {
  def ToString(c : Char): String  = ""
   
  def Parse(s : String): Char  = '0'
   
  def TryParse(s : String, result : CLRByRef[Char]): Boolean  = false
   
  def IsDigit(c : Char): Boolean  = false
   
  def IsLetter(c : Char): Boolean  = false
   
  def IsWhiteSpace(c : Char): Boolean  = false
   
  def IsUpper(c : Char): Boolean  = false
   
  def IsLower(c : Char): Boolean  = false
   
  def IsPunctuation(c : Char): Boolean  = false
   
  def IsLetterOrDigit(c : Char): Boolean  = false
   
  def ToUpper(c : Char, culture : System.Globalization.CultureInfo): Char  = '0'
   
  def ToUpper(c : Char): Char  = '0'
   
  def ToUpperInvariant(c : Char): Char  = '0'
   
  def ToLower(c : Char, culture : System.Globalization.CultureInfo): Char  = '0'
   
  def ToLower(c : Char): Char  = '0'
   
  def ToLowerInvariant(c : Char): Char  = '0'
   
  def IsControl(c : Char): Boolean  = false
   
  def IsControl(s : String, index : Int): Boolean  = false
   
  def IsDigit(s : String, index : Int): Boolean  = false
   
  def IsLetter(s : String, index : Int): Boolean  = false
   
  def IsLetterOrDigit(s : String, index : Int): Boolean  = false
   
  def IsLower(s : String, index : Int): Boolean  = false
   
  def IsNumber(c : Char): Boolean  = false
   
  def IsNumber(s : String, index : Int): Boolean  = false
   
  def IsPunctuation(s : String, index : Int): Boolean  = false
   
  def IsSeparator(c : Char): Boolean  = false
   
  def IsSeparator(s : String, index : Int): Boolean  = false
   
  def IsSurrogate(c : Char): Boolean  = false
   
  def IsSurrogate(s : String, index : Int): Boolean  = false
   
  def IsSymbol(c : Char): Boolean  = false
   
  def IsSymbol(s : String, index : Int): Boolean  = false
   
  def IsUpper(s : String, index : Int): Boolean  = false
   
  def IsWhiteSpace(s : String, index : Int): Boolean  = false
   
  def GetUnicodeCategory(c : Char): System.Globalization.UnicodeCategory  = System.Globalization.UnicodeCategory.UppercaseLetter
   
  def GetUnicodeCategory(s : String, index : Int): System.Globalization.UnicodeCategory  = System.Globalization.UnicodeCategory.UppercaseLetter
   
  def GetNumericValue(c : Char): Double  = 0
   
  def GetNumericValue(s : String, index : Int): Double  = 0
   
  def IsHighSurrogate(c : Char): Boolean  = false
   
  def IsHighSurrogate(s : String, index : Int): Boolean  = false
   
  def IsLowSurrogate(c : Char): Boolean  = false
   
  def IsLowSurrogate(s : String, index : Int): Boolean  = false
   
  def IsSurrogatePair(s : String, index : Int): Boolean  = false
   
  def IsSurrogatePair(highSurrogate : Char, lowSurrogate : Char): Boolean  = false
   
  def ConvertFromUtf32(utf32 : Int): String  = ""
   
  def ConvertToUtf32(highSurrogate : Char, lowSurrogate : Char): Int  = 0
   
  def ConvertToUtf32(s : String, index : Int): Int  = 0
   
  val MaxValue : Char  = '0'
   
  val MinValue : Char  = '0'
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class CharEnumerator extends AnyRef with System.ICloneable with System.Collections.Generic.IEnumerator[Char] with 
                                    System.IDisposable with System.Collections.IEnumerator {
  def Clone: AnyRef
   
  def MoveNext: Boolean
   
  def Reset: Unit
   
  val Current : Char = '0'
}
 
@System.AttributeUsageAttribute(32767 /* Inherited = true, AllowMultiple = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class CLSCompliantAttribute extends System.Attribute {
  val IsCompliant : Boolean = false
   
  def this(isCompliant : Boolean) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class TypeUnloadedException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
abstract sealed class Console extends AnyRef 
object Console {
  def Beep: Unit  = {}
   
  def Beep(frequency : Int, duration : Int): Unit  = {}
   
  def Clear: Unit  = {}
   
  def ResetColor: Unit  = {}
   
  def MoveBufferArea(sourceLeft : Int, sourceTop : Int, sourceWidth : Int, sourceHeight : Int, 
                     targetLeft : Int, targetTop : Int): Unit  = {}
   
  def MoveBufferArea(sourceLeft : Int, sourceTop : Int, sourceWidth : Int, sourceHeight : Int, 
                     targetLeft : Int, targetTop : Int, sourceChar : Char, 
                     sourceForeColor : System.ConsoleColor, sourceBackColor : System.ConsoleColor): Unit  = {}
   
  def SetBufferSize(width : Int, height : Int): Unit  = {}
   
  def SetWindowSize(width : Int, height : Int): Unit  = {}
   
  def SetWindowPosition(left : Int, top : Int): Unit  = {}
   
  def SetCursorPosition(left : Int, top : Int): Unit  = {}
   
  def ReadKey: System.ConsoleKeyInfo  = new System.ConsoleKeyInfo()
   
  def ReadKey(intercept : Boolean): System.ConsoleKeyInfo  = new System.ConsoleKeyInfo()
   
  def add_CancelKeyPress(value : System.ConsoleCancelEventHandler): Unit  = {}
   
  def remove_CancelKeyPress(value : System.ConsoleCancelEventHandler): Unit  = {}
   
  def OpenStandardError: System.IO.Stream  = null
   
  def OpenStandardError(bufferSize : Int): System.IO.Stream  = null
   
  def OpenStandardInput: System.IO.Stream  = null
   
  def OpenStandardInput(bufferSize : Int): System.IO.Stream  = null
   
  def OpenStandardOutput: System.IO.Stream  = null
   
  def OpenStandardOutput(bufferSize : Int): System.IO.Stream  = null
   
  def SetIn(newIn : System.IO.TextReader): Unit  = {}
   
  def SetOut(newOut : System.IO.TextWriter): Unit  = {}
   
  def SetError(newError : System.IO.TextWriter): Unit  = {}
   
  def Read: Int  = 0
   
  def ReadLine: String  = ""
   
  def WriteLine: Unit  = {}
   
  def WriteLine(value : Boolean): Unit  = {}
   
  def WriteLine(value : Char): Unit  = {}
   
  def WriteLine(buffer : Array[Char]): Unit  = {}
   
  def WriteLine(buffer : Array[Char], index : Int, count : Int): Unit  = {}
   
  def WriteLine(value : System.Decimal): Unit  = {}
   
  def WriteLine(value : Double): Unit  = {}
   
  def WriteLine(value : Float): Unit  = {}
   
  def WriteLine(value : Int): Unit  = {}
   
  @System.CLSCompliantAttribute(false)
  def WriteLine(value : UInt): Unit  = {}
   
  def WriteLine(value : Long): Unit  = {}
   
  @System.CLSCompliantAttribute(false)
  def WriteLine(value : ULong): Unit  = {}
   
  def WriteLine(value : AnyRef): Unit  = {}
   
  def WriteLine(value : String): Unit  = {}
   
  def WriteLine(format : String, arg0 : AnyRef): Unit  = {}
   
  def WriteLine(format : String, arg0 : AnyRef, arg1 : AnyRef): Unit  = {}
   
  def WriteLine(format : String, arg0 : AnyRef, arg1 : AnyRef, arg2 : AnyRef): Unit  = {}
   
  @System.CLSCompliantAttribute(false)
  def WriteLine(format : String, arg0 : AnyRef, arg1 : AnyRef, arg2 : AnyRef, arg3 : AnyRef): Unit  = {}
   
  def WriteLine(format : String, arg : Array[AnyRef]): Unit  = {}
   
  def Write(format : String, arg0 : AnyRef): Unit  = {}
   
  def Write(format : String, arg0 : AnyRef, arg1 : AnyRef): Unit  = {}
   
  def Write(format : String, arg0 : AnyRef, arg1 : AnyRef, arg2 : AnyRef): Unit  = {}
   
  @System.CLSCompliantAttribute(false)
  def Write(format : String, arg0 : AnyRef, arg1 : AnyRef, arg2 : AnyRef, arg3 : AnyRef): Unit  = {}
   
  def Write(format : String, arg : Array[AnyRef]): Unit  = {}
   
  def Write(value : Boolean): Unit  = {}
   
  def Write(value : Char): Unit  = {}
   
  def Write(buffer : Array[Char]): Unit  = {}
   
  def Write(buffer : Array[Char], index : Int, count : Int): Unit  = {}
   
  def Write(value : Double): Unit  = {}
   
  def Write(value : System.Decimal): Unit  = {}
   
  def Write(value : Float): Unit  = {}
   
  def Write(value : Int): Unit  = {}
   
  @System.CLSCompliantAttribute(false)
  def Write(value : UInt): Unit  = {}
   
  def Write(value : Long): Unit  = {}
   
  @System.CLSCompliantAttribute(false)
  def Write(value : ULong): Unit  = {}
   
  def Write(value : AnyRef): Unit  = {}
   
  def Write(value : String): Unit  = {}
   
  val Error : System.IO.TextWriter = null
   
  val In : System.IO.TextReader = null
   
  val Out : System.IO.TextWriter = null
   
  var InputEncoding : System.Text.Encoding = null
   
  var OutputEncoding : System.Text.Encoding = null
   
  var BackgroundColor : System.ConsoleColor = System.ConsoleColor.Black
   
  var ForegroundColor : System.ConsoleColor = System.ConsoleColor.Black
   
  var BufferHeight : Int = 0
   
  var BufferWidth : Int = 0
   
  var WindowHeight : Int = 0
   
  var WindowWidth : Int = 0
   
  val LargestWindowWidth : Int = 0
   
  val LargestWindowHeight : Int = 0
   
  var WindowLeft : Int = 0
   
  var WindowTop : Int = 0
   
  var CursorLeft : Int = 0
   
  var CursorTop : Int = 0
   
  var CursorSize : Int = 0
   
  var CursorVisible : Boolean = false
   
  var Title : String = ""
   
  val KeyAvailable : Boolean = false
   
  val NumberLock : Boolean = false
   
  val CapsLock : Boolean = false
   
  var TreatControlCAsInput : Boolean = false
   
  /* event CancelKeyPress */
  def add_CancelKeyPress(value : System.ConsoleCancelEventHandler): Unit
  def remove_CancelKeyPress(value : System.ConsoleCancelEventHandler): Unit
}
 
sealed class ConsoleCancelEventHandler extends System.MulticastDelegate {
  def Invoke(sender : AnyRef, e : System.ConsoleCancelEventArgs): Unit
   
  def BeginInvoke(sender : AnyRef, e : System.ConsoleCancelEventArgs, callback : System.AsyncCallback, 
                  `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed class ConsoleCancelEventArgs extends System.EventArgs {
  var Cancel : Boolean = false
   
  val SpecialKey : System.ConsoleSpecialKey = System.ConsoleSpecialKey.ControlC
}
 
sealed abstract class ConsoleColor extends System.Enum {
  def ==(that: System.ConsoleColor): Boolean = false
  def !=(that: System.ConsoleColor): Boolean = false
  def  <(that: System.ConsoleColor): Boolean = false
  def <=(that: System.ConsoleColor): Boolean = false
  def  >(that: System.ConsoleColor): Boolean = false
  def >=(that: System.ConsoleColor): Boolean = false
  def  |(that: System.ConsoleColor): Boolean = false
  def  &(that: System.ConsoleColor): Boolean = false
  def  ^(that: System.ConsoleColor): Boolean = false
}
object ConsoleColor{
  val Black	 = value(0)
  val DarkBlue	 = value(1)
  val DarkGreen	 = value(2)
  val DarkCyan	 = value(3)
  val DarkRed	 = value(4)
  val DarkMagenta	 = value(5)
  val DarkYellow	 = value(6)
  val Gray	 = value(7)
  val DarkGray	 = value(8)
  val Blue	 = value(9)
  val Green	 = value(10)
  val Cyan	 = value(11)
  val Red	 = value(12)
  val Magenta	 = value(13)
  val Yellow	 = value(14)
  val White	 = value(15)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.ConsoleColor = null
}
 
sealed abstract class ConsoleKey extends System.Enum {
  def ==(that: System.ConsoleKey): Boolean = false
  def !=(that: System.ConsoleKey): Boolean = false
  def  <(that: System.ConsoleKey): Boolean = false
  def <=(that: System.ConsoleKey): Boolean = false
  def  >(that: System.ConsoleKey): Boolean = false
  def >=(that: System.ConsoleKey): Boolean = false
  def  |(that: System.ConsoleKey): Boolean = false
  def  &(that: System.ConsoleKey): Boolean = false
  def  ^(that: System.ConsoleKey): Boolean = false
}
object ConsoleKey{
  val Backspace	 = value(8)
  val Tab	 = value(9)
  val Clear	 = value(12)
  val Enter	 = value(13)
  val Pause	 = value(19)
  val Escape	 = value(27)
  val Spacebar	 = value(32)
  val PageUp	 = value(33)
  val PageDown	 = value(34)
  val End	 = value(35)
  val Home	 = value(36)
  val LeftArrow	 = value(37)
  val UpArrow	 = value(38)
  val RightArrow	 = value(39)
  val DownArrow	 = value(40)
  val Select	 = value(41)
  val Print	 = value(42)
  val Execute	 = value(43)
  val PrintScreen	 = value(44)
  val Insert	 = value(45)
  val Delete	 = value(46)
  val Help	 = value(47)
  val D0	 = value(48)
  val D1	 = value(49)
  val D2	 = value(50)
  val D3	 = value(51)
  val D4	 = value(52)
  val D5	 = value(53)
  val D6	 = value(54)
  val D7	 = value(55)
  val D8	 = value(56)
  val D9	 = value(57)
  val A	 = value(65)
  val B	 = value(66)
  val C	 = value(67)
  val D	 = value(68)
  val E	 = value(69)
  val F	 = value(70)
  val G	 = value(71)
  val H	 = value(72)
  val I	 = value(73)
  val J	 = value(74)
  val K	 = value(75)
  val L	 = value(76)
  val M	 = value(77)
  val N	 = value(78)
  val O	 = value(79)
  val P	 = value(80)
  val Q	 = value(81)
  val R	 = value(82)
  val S	 = value(83)
  val T	 = value(84)
  val U	 = value(85)
  val V	 = value(86)
  val W	 = value(87)
  val X	 = value(88)
  val Y	 = value(89)
  val Z	 = value(90)
  val LeftWindows	 = value(91)
  val RightWindows	 = value(92)
  val Applications	 = value(93)
  val Sleep	 = value(95)
  val NumPad0	 = value(96)
  val NumPad1	 = value(97)
  val NumPad2	 = value(98)
  val NumPad3	 = value(99)
  val NumPad4	 = value(100)
  val NumPad5	 = value(101)
  val NumPad6	 = value(102)
  val NumPad7	 = value(103)
  val NumPad8	 = value(104)
  val NumPad9	 = value(105)
  val Multiply	 = value(106)
  val Add	 = value(107)
  val Separator	 = value(108)
  val Subtract	 = value(109)
  val Decimal	 = value(110)
  val Divide	 = value(111)
  val F1	 = value(112)
  val F2	 = value(113)
  val F3	 = value(114)
  val F4	 = value(115)
  val F5	 = value(116)
  val F6	 = value(117)
  val F7	 = value(118)
  val F8	 = value(119)
  val F9	 = value(120)
  val F10	 = value(121)
  val F11	 = value(122)
  val F12	 = value(123)
  val F13	 = value(124)
  val F14	 = value(125)
  val F15	 = value(126)
  val F16	 = value(127)
  val F17	 = value(128)
  val F18	 = value(129)
  val F19	 = value(130)
  val F20	 = value(131)
  val F21	 = value(132)
  val F22	 = value(133)
  val F23	 = value(134)
  val F24	 = value(135)
  val BrowserBack	 = value(166)
  val BrowserForward	 = value(167)
  val BrowserRefresh	 = value(168)
  val BrowserStop	 = value(169)
  val BrowserSearch	 = value(170)
  val BrowserFavorites	 = value(171)
  val BrowserHome	 = value(172)
  val VolumeMute	 = value(173)
  val VolumeDown	 = value(174)
  val VolumeUp	 = value(175)
  val MediaNext	 = value(176)
  val MediaPrevious	 = value(177)
  val MediaStop	 = value(178)
  val MediaPlay	 = value(179)
  val LaunchMail	 = value(180)
  val LaunchMediaSelect	 = value(181)
  val LaunchApp1	 = value(182)
  val LaunchApp2	 = value(183)
  val Oem1	 = value(186)
  val OemPlus	 = value(187)
  val OemComma	 = value(188)
  val OemMinus	 = value(189)
  val OemPeriod	 = value(190)
  val Oem2	 = value(191)
  val Oem3	 = value(192)
  val Oem4	 = value(219)
  val Oem5	 = value(220)
  val Oem6	 = value(221)
  val Oem7	 = value(222)
  val Oem8	 = value(223)
  val Oem102	 = value(226)
  val Process	 = value(229)
  val Packet	 = value(231)
  val Attention	 = value(246)
  val CrSel	 = value(247)
  val ExSel	 = value(248)
  val EraseEndOfFile	 = value(249)
  val Play	 = value(250)
  val Zoom	 = value(251)
  val NoName	 = value(252)
  val Pa1	 = value(253)
  val OemClear	 = value(254)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.ConsoleKey = null
}
 
sealed class ConsoleKeyInfo extends System.ValueType {
  def Equals(value : AnyRef): Boolean
   
  def Equals(obj : System.ConsoleKeyInfo): Boolean
   
  def GetHashCode: Int
   
  val KeyChar : Char = '0'
   
  val Key : System.ConsoleKey = System.ConsoleKey.Backspace
   
  val Modifiers : System.ConsoleModifiers = System.ConsoleModifiers.Alt
   
  def this(keyChar : Char, key : System.ConsoleKey, shift : Boolean, alt : Boolean, 
           control : Boolean) {}
}
object ConsoleKeyInfo {
  def ==(a : System.ConsoleKeyInfo, b : System.ConsoleKeyInfo): Boolean  = false
   
  def !=(a : System.ConsoleKeyInfo, b : System.ConsoleKeyInfo): Boolean  = false
}
 
sealed abstract class ConsoleModifiers extends System.Enum {
  def ==(that: System.ConsoleModifiers): Boolean = false
  def !=(that: System.ConsoleModifiers): Boolean = false
  def  <(that: System.ConsoleModifiers): Boolean = false
  def <=(that: System.ConsoleModifiers): Boolean = false
  def  >(that: System.ConsoleModifiers): Boolean = false
  def >=(that: System.ConsoleModifiers): Boolean = false
  def  |(that: System.ConsoleModifiers): Boolean = false
  def  &(that: System.ConsoleModifiers): Boolean = false
  def  ^(that: System.ConsoleModifiers): Boolean = false
}
object ConsoleModifiers{
  val Alt	 = value(1)
  val Shift	 = value(2)
  val Control	 = value(4)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.ConsoleModifiers = null
}
 
sealed abstract class ConsoleSpecialKey extends System.Enum {
  def ==(that: System.ConsoleSpecialKey): Boolean = false
  def !=(that: System.ConsoleSpecialKey): Boolean = false
  def  <(that: System.ConsoleSpecialKey): Boolean = false
  def <=(that: System.ConsoleSpecialKey): Boolean = false
  def  >(that: System.ConsoleSpecialKey): Boolean = false
  def >=(that: System.ConsoleSpecialKey): Boolean = false
  def  |(that: System.ConsoleSpecialKey): Boolean = false
  def  &(that: System.ConsoleSpecialKey): Boolean = false
  def  ^(that: System.ConsoleSpecialKey): Boolean = false
}
object ConsoleSpecialKey{
  val ControlC	 = value(0)
  val ControlBreak	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.ConsoleSpecialKey = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.ObsoleteAttribute("ContextMarshalException is obsolete.")
class ContextMarshalException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
abstract sealed class Convert extends AnyRef 
object Convert {
  def GetTypeCode(value : AnyRef): System.TypeCode  = System.TypeCode.Empty
   
  def IsDBNull(value : AnyRef): Boolean  = false
   
  def ChangeType(value : AnyRef, typeCode : System.TypeCode): AnyRef  = null
   
  def ChangeType(value : AnyRef, typeCode : System.TypeCode, provider : System.IFormatProvider): AnyRef  = null
   
  def ChangeType(value : AnyRef, conversionType : System.Type): AnyRef  = null
   
  def ChangeType(value : AnyRef, conversionType : System.Type, provider : System.IFormatProvider): AnyRef  = null
   
  def ToBoolean(value : AnyRef): Boolean  = false
   
  def ToBoolean(value : AnyRef, provider : System.IFormatProvider): Boolean  = false
   
  def ToBoolean(value : Boolean): Boolean  = false
   
  @System.CLSCompliantAttribute(false)
  def ToBoolean(value : Byte): Boolean  = false
   
  def ToBoolean(value : Char): Boolean  = false
   
  def ToBoolean(value : UByte): Boolean  = false
   
  def ToBoolean(value : Short): Boolean  = false
   
  @System.CLSCompliantAttribute(false)
  def ToBoolean(value : UShort): Boolean  = false
   
  def ToBoolean(value : Int): Boolean  = false
   
  @System.CLSCompliantAttribute(false)
  def ToBoolean(value : UInt): Boolean  = false
   
  def ToBoolean(value : Long): Boolean  = false
   
  @System.CLSCompliantAttribute(false)
  def ToBoolean(value : ULong): Boolean  = false
   
  def ToBoolean(value : String): Boolean  = false
   
  def ToBoolean(value : String, provider : System.IFormatProvider): Boolean  = false
   
  def ToBoolean(value : Float): Boolean  = false
   
  def ToBoolean(value : Double): Boolean  = false
   
  def ToBoolean(value : System.Decimal): Boolean  = false
   
  def ToBoolean(value : System.DateTime): Boolean  = false
   
  def ToChar(value : AnyRef): Char  = '0'
   
  def ToChar(value : AnyRef, provider : System.IFormatProvider): Char  = '0'
   
  def ToChar(value : Boolean): Char  = '0'
   
  def ToChar(value : Char): Char  = '0'
   
  @System.CLSCompliantAttribute(false)
  def ToChar(value : Byte): Char  = '0'
   
  def ToChar(value : UByte): Char  = '0'
   
  def ToChar(value : Short): Char  = '0'
   
  @System.CLSCompliantAttribute(false)
  def ToChar(value : UShort): Char  = '0'
   
  def ToChar(value : Int): Char  = '0'
   
  @System.CLSCompliantAttribute(false)
  def ToChar(value : UInt): Char  = '0'
   
  def ToChar(value : Long): Char  = '0'
   
  @System.CLSCompliantAttribute(false)
  def ToChar(value : ULong): Char  = '0'
   
  def ToChar(value : String): Char  = '0'
   
  def ToChar(value : String, provider : System.IFormatProvider): Char  = '0'
   
  def ToChar(value : Float): Char  = '0'
   
  def ToChar(value : Double): Char  = '0'
   
  def ToChar(value : System.Decimal): Char  = '0'
   
  def ToChar(value : System.DateTime): Char  = '0'
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : AnyRef): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : AnyRef, provider : System.IFormatProvider): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : Boolean): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : Byte): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : Char): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : UByte): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : Short): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : UShort): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : Int): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : UInt): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : Long): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : ULong): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : Float): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : Double): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : System.Decimal): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : String): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : String, provider : System.IFormatProvider): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : System.DateTime): Byte  = 0
   
  def ToByte(value : AnyRef): UByte  = 0
   
  def ToByte(value : AnyRef, provider : System.IFormatProvider): UByte  = 0
   
  def ToByte(value : Boolean): UByte  = 0
   
  def ToByte(value : UByte): UByte  = 0
   
  def ToByte(value : Char): UByte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToByte(value : Byte): UByte  = 0
   
  def ToByte(value : Short): UByte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToByte(value : UShort): UByte  = 0
   
  def ToByte(value : Int): UByte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToByte(value : UInt): UByte  = 0
   
  def ToByte(value : Long): UByte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToByte(value : ULong): UByte  = 0
   
  def ToByte(value : Float): UByte  = 0
   
  def ToByte(value : Double): UByte  = 0
   
  def ToByte(value : System.Decimal): UByte  = 0
   
  def ToByte(value : String): UByte  = 0
   
  def ToByte(value : String, provider : System.IFormatProvider): UByte  = 0
   
  def ToByte(value : System.DateTime): UByte  = 0
   
  def ToInt16(value : AnyRef): Short  = 0
   
  def ToInt16(value : AnyRef, provider : System.IFormatProvider): Short  = 0
   
  def ToInt16(value : Boolean): Short  = 0
   
  def ToInt16(value : Char): Short  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToInt16(value : Byte): Short  = 0
   
  def ToInt16(value : UByte): Short  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToInt16(value : UShort): Short  = 0
   
  def ToInt16(value : Int): Short  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToInt16(value : UInt): Short  = 0
   
  def ToInt16(value : Short): Short  = 0
   
  def ToInt16(value : Long): Short  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToInt16(value : ULong): Short  = 0
   
  def ToInt16(value : Float): Short  = 0
   
  def ToInt16(value : Double): Short  = 0
   
  def ToInt16(value : System.Decimal): Short  = 0
   
  def ToInt16(value : String): Short  = 0
   
  def ToInt16(value : String, provider : System.IFormatProvider): Short  = 0
   
  def ToInt16(value : System.DateTime): Short  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : AnyRef): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : AnyRef, provider : System.IFormatProvider): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : Boolean): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : Char): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : Byte): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : UByte): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : Short): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : Int): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : UShort): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : UInt): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : Long): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : ULong): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : Float): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : Double): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : System.Decimal): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : String): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : String, provider : System.IFormatProvider): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : System.DateTime): UShort  = 0
   
  def ToInt32(value : AnyRef): Int  = 0
   
  def ToInt32(value : AnyRef, provider : System.IFormatProvider): Int  = 0
   
  def ToInt32(value : Boolean): Int  = 0
   
  def ToInt32(value : Char): Int  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToInt32(value : Byte): Int  = 0
   
  def ToInt32(value : UByte): Int  = 0
   
  def ToInt32(value : Short): Int  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToInt32(value : UShort): Int  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToInt32(value : UInt): Int  = 0
   
  def ToInt32(value : Int): Int  = 0
   
  def ToInt32(value : Long): Int  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToInt32(value : ULong): Int  = 0
   
  def ToInt32(value : Float): Int  = 0
   
  def ToInt32(value : Double): Int  = 0
   
  def ToInt32(value : System.Decimal): Int  = 0
   
  def ToInt32(value : String): Int  = 0
   
  def ToInt32(value : String, provider : System.IFormatProvider): Int  = 0
   
  def ToInt32(value : System.DateTime): Int  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : AnyRef): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : AnyRef, provider : System.IFormatProvider): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : Boolean): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : Char): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : Byte): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : UByte): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : Short): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : UShort): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : Int): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : UInt): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : Long): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : ULong): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : Float): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : Double): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : System.Decimal): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : String): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : String, provider : System.IFormatProvider): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : System.DateTime): UInt  = 0
   
  def ToInt64(value : AnyRef): Long  = 0
   
  def ToInt64(value : AnyRef, provider : System.IFormatProvider): Long  = 0
   
  def ToInt64(value : Boolean): Long  = 0
   
  def ToInt64(value : Char): Long  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToInt64(value : Byte): Long  = 0
   
  def ToInt64(value : UByte): Long  = 0
   
  def ToInt64(value : Short): Long  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToInt64(value : UShort): Long  = 0
   
  def ToInt64(value : Int): Long  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToInt64(value : UInt): Long  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToInt64(value : ULong): Long  = 0
   
  def ToInt64(value : Long): Long  = 0
   
  def ToInt64(value : Float): Long  = 0
   
  def ToInt64(value : Double): Long  = 0
   
  def ToInt64(value : System.Decimal): Long  = 0
   
  def ToInt64(value : String): Long  = 0
   
  def ToInt64(value : String, provider : System.IFormatProvider): Long  = 0
   
  def ToInt64(value : System.DateTime): Long  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : AnyRef): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : AnyRef, provider : System.IFormatProvider): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : Boolean): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : Char): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : Byte): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : UByte): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : Short): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : UShort): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : Int): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : UInt): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : Long): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : ULong): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : Float): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : Double): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : System.Decimal): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : String): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : String, provider : System.IFormatProvider): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : System.DateTime): ULong  = 0
   
  def ToSingle(value : AnyRef): Float  = 0
   
  def ToSingle(value : AnyRef, provider : System.IFormatProvider): Float  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSingle(value : Byte): Float  = 0
   
  def ToSingle(value : UByte): Float  = 0
   
  def ToSingle(value : Char): Float  = 0
   
  def ToSingle(value : Short): Float  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSingle(value : UShort): Float  = 0
   
  def ToSingle(value : Int): Float  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSingle(value : UInt): Float  = 0
   
  def ToSingle(value : Long): Float  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSingle(value : ULong): Float  = 0
   
  def ToSingle(value : Float): Float  = 0
   
  def ToSingle(value : Double): Float  = 0
   
  def ToSingle(value : System.Decimal): Float  = 0
   
  def ToSingle(value : String): Float  = 0
   
  def ToSingle(value : String, provider : System.IFormatProvider): Float  = 0
   
  def ToSingle(value : Boolean): Float  = 0
   
  def ToSingle(value : System.DateTime): Float  = 0
   
  def ToDouble(value : AnyRef): Double  = 0
   
  def ToDouble(value : AnyRef, provider : System.IFormatProvider): Double  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToDouble(value : Byte): Double  = 0
   
  def ToDouble(value : UByte): Double  = 0
   
  def ToDouble(value : Short): Double  = 0
   
  def ToDouble(value : Char): Double  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToDouble(value : UShort): Double  = 0
   
  def ToDouble(value : Int): Double  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToDouble(value : UInt): Double  = 0
   
  def ToDouble(value : Long): Double  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToDouble(value : ULong): Double  = 0
   
  def ToDouble(value : Float): Double  = 0
   
  def ToDouble(value : Double): Double  = 0
   
  def ToDouble(value : System.Decimal): Double  = 0
   
  def ToDouble(value : String): Double  = 0
   
  def ToDouble(value : String, provider : System.IFormatProvider): Double  = 0
   
  def ToDouble(value : Boolean): Double  = 0
   
  def ToDouble(value : System.DateTime): Double  = 0
   
  def ToDecimal(value : AnyRef): System.Decimal  = new System.Decimal()
   
  def ToDecimal(value : AnyRef, provider : System.IFormatProvider): System.Decimal  = new System.Decimal()
   
  @System.CLSCompliantAttribute(false)
  def ToDecimal(value : Byte): System.Decimal  = new System.Decimal()
   
  def ToDecimal(value : UByte): System.Decimal  = new System.Decimal()
   
  def ToDecimal(value : Char): System.Decimal  = new System.Decimal()
   
  def ToDecimal(value : Short): System.Decimal  = new System.Decimal()
   
  @System.CLSCompliantAttribute(false)
  def ToDecimal(value : UShort): System.Decimal  = new System.Decimal()
   
  def ToDecimal(value : Int): System.Decimal  = new System.Decimal()
   
  @System.CLSCompliantAttribute(false)
  def ToDecimal(value : UInt): System.Decimal  = new System.Decimal()
   
  def ToDecimal(value : Long): System.Decimal  = new System.Decimal()
   
  @System.CLSCompliantAttribute(false)
  def ToDecimal(value : ULong): System.Decimal  = new System.Decimal()
   
  def ToDecimal(value : Float): System.Decimal  = new System.Decimal()
   
  def ToDecimal(value : Double): System.Decimal  = new System.Decimal()
   
  def ToDecimal(value : String): System.Decimal  = new System.Decimal()
   
  def ToDecimal(value : String, provider : System.IFormatProvider): System.Decimal  = new System.Decimal()
   
  def ToDecimal(value : System.Decimal): System.Decimal  = new System.Decimal()
   
  def ToDecimal(value : Boolean): System.Decimal  = new System.Decimal()
   
  def ToDecimal(value : System.DateTime): System.Decimal  = new System.Decimal()
   
  def ToDateTime(value : System.DateTime): System.DateTime  = new System.DateTime()
   
  def ToDateTime(value : AnyRef): System.DateTime  = new System.DateTime()
   
  def ToDateTime(value : AnyRef, provider : System.IFormatProvider): System.DateTime  = new System.DateTime()
   
  def ToDateTime(value : String): System.DateTime  = new System.DateTime()
   
  def ToDateTime(value : String, provider : System.IFormatProvider): System.DateTime  = new System.DateTime()
   
  @System.CLSCompliantAttribute(false)
  def ToDateTime(value : Byte): System.DateTime  = new System.DateTime()
   
  def ToDateTime(value : UByte): System.DateTime  = new System.DateTime()
   
  def ToDateTime(value : Short): System.DateTime  = new System.DateTime()
   
  @System.CLSCompliantAttribute(false)
  def ToDateTime(value : UShort): System.DateTime  = new System.DateTime()
   
  def ToDateTime(value : Int): System.DateTime  = new System.DateTime()
   
  @System.CLSCompliantAttribute(false)
  def ToDateTime(value : UInt): System.DateTime  = new System.DateTime()
   
  def ToDateTime(value : Long): System.DateTime  = new System.DateTime()
   
  @System.CLSCompliantAttribute(false)
  def ToDateTime(value : ULong): System.DateTime  = new System.DateTime()
   
  def ToDateTime(value : Boolean): System.DateTime  = new System.DateTime()
   
  def ToDateTime(value : Char): System.DateTime  = new System.DateTime()
   
  def ToDateTime(value : Float): System.DateTime  = new System.DateTime()
   
  def ToDateTime(value : Double): System.DateTime  = new System.DateTime()
   
  def ToDateTime(value : System.Decimal): System.DateTime  = new System.DateTime()
   
  def ToString(value : AnyRef): String  = ""
   
  def ToString(value : AnyRef, provider : System.IFormatProvider): String  = ""
   
  def ToString(value : Boolean): String  = ""
   
  def ToString(value : Boolean, provider : System.IFormatProvider): String  = ""
   
  def ToString(value : Char): String  = ""
   
  def ToString(value : Char, provider : System.IFormatProvider): String  = ""
   
  @System.CLSCompliantAttribute(false)
  def ToString(value : Byte): String  = ""
   
  @System.CLSCompliantAttribute(false)
  def ToString(value : Byte, provider : System.IFormatProvider): String  = ""
   
  def ToString(value : UByte): String  = ""
   
  def ToString(value : UByte, provider : System.IFormatProvider): String  = ""
   
  def ToString(value : Short): String  = ""
   
  def ToString(value : Short, provider : System.IFormatProvider): String  = ""
   
  @System.CLSCompliantAttribute(false)
  def ToString(value : UShort): String  = ""
   
  @System.CLSCompliantAttribute(false)
  def ToString(value : UShort, provider : System.IFormatProvider): String  = ""
   
  def ToString(value : Int): String  = ""
   
  def ToString(value : Int, provider : System.IFormatProvider): String  = ""
   
  @System.CLSCompliantAttribute(false)
  def ToString(value : UInt): String  = ""
   
  @System.CLSCompliantAttribute(false)
  def ToString(value : UInt, provider : System.IFormatProvider): String  = ""
   
  def ToString(value : Long): String  = ""
   
  def ToString(value : Long, provider : System.IFormatProvider): String  = ""
   
  @System.CLSCompliantAttribute(false)
  def ToString(value : ULong): String  = ""
   
  @System.CLSCompliantAttribute(false)
  def ToString(value : ULong, provider : System.IFormatProvider): String  = ""
   
  def ToString(value : Float): String  = ""
   
  def ToString(value : Float, provider : System.IFormatProvider): String  = ""
   
  def ToString(value : Double): String  = ""
   
  def ToString(value : Double, provider : System.IFormatProvider): String  = ""
   
  def ToString(value : System.Decimal): String  = ""
   
  def ToString(value : System.Decimal, provider : System.IFormatProvider): String  = ""
   
  def ToString(value : System.DateTime): String  = ""
   
  def ToString(value : System.DateTime, provider : System.IFormatProvider): String  = ""
   
  def ToString(value : String): String  = ""
   
  def ToString(value : String, provider : System.IFormatProvider): String  = ""
   
  def ToByte(value : String, fromBase : Int): UByte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : String, fromBase : Int): Byte  = 0
   
  def ToInt16(value : String, fromBase : Int): Short  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : String, fromBase : Int): UShort  = 0
   
  def ToInt32(value : String, fromBase : Int): Int  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(value : String, fromBase : Int): UInt  = 0
   
  def ToInt64(value : String, fromBase : Int): Long  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(value : String, fromBase : Int): ULong  = 0
   
  def ToString(value : UByte, toBase : Int): String  = ""
   
  def ToString(value : Short, toBase : Int): String  = ""
   
  def ToString(value : Int, toBase : Int): String  = ""
   
  def ToString(value : Long, toBase : Int): String  = ""
   
  def ToBase64String(inArray : Array[UByte]): String  = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def ToBase64String(inArray : Array[UByte], options : System.Base64FormattingOptions): String  = ""
   
  def ToBase64String(inArray : Array[UByte], offset : Int, length : Int): String  = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def ToBase64String(inArray : Array[UByte], offset : Int, length : Int, 
                     options : System.Base64FormattingOptions): String  = ""
   
  def ToBase64CharArray(inArray : Array[UByte], offsetIn : Int, length : Int, outArray : Array[Char], 
                        offsetOut : Int): Int  = 0
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def ToBase64CharArray(inArray : Array[UByte], offsetIn : Int, length : Int, outArray : Array[Char], 
                        offsetOut : Int, options : System.Base64FormattingOptions): Int  = 0
   
  def FromBase64String(s : String): Array[UByte]  = Array.empty[UByte]
   
  def FromBase64CharArray(inArray : Array[Char], offset : Int, length : Int): Array[UByte]  = Array.empty[UByte]
   
  val DBNull : AnyRef  = null
}
 
sealed abstract class Base64FormattingOptions extends System.Enum {
  def ==(that: System.Base64FormattingOptions): Boolean = false
  def !=(that: System.Base64FormattingOptions): Boolean = false
  def  <(that: System.Base64FormattingOptions): Boolean = false
  def <=(that: System.Base64FormattingOptions): Boolean = false
  def  >(that: System.Base64FormattingOptions): Boolean = false
  def >=(that: System.Base64FormattingOptions): Boolean = false
  def  |(that: System.Base64FormattingOptions): Boolean = false
  def  &(that: System.Base64FormattingOptions): Boolean = false
  def  ^(that: System.Base64FormattingOptions): Boolean = false
}
object Base64FormattingOptions{
  val None	 = value(0)
  val InsertLineBreaks	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Base64FormattingOptions = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class ContextBoundObject extends System.MarshalByRefObject {
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(256 /* Inherited = false */ )
class ContextStaticAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class TimeZone extends AnyRef {
  /* abstract */ def GetUtcOffset(time : System.DateTime): System.TimeSpan
   
  def ToUniversalTime(time : System.DateTime): System.DateTime
   
  def ToLocalTime(time : System.DateTime): System.DateTime
   
  /* abstract */ def GetDaylightChanges(year : Int): System.Globalization.DaylightTime
   
  def IsDaylightSavingTime(time : System.DateTime): Boolean
   
  val StandardName : String = ""
   
  val DaylightName : String = ""
   
  protected def this() {}
}
object TimeZone {
  def IsDaylightSavingTime(time : System.DateTime, daylightTimes : System.Globalization.DaylightTime): Boolean  = false
   
  val CurrentTimeZone : System.TimeZone = null
}
 
sealed abstract class DayOfWeek extends System.Enum {
  def ==(that: System.DayOfWeek): Boolean = false
  def !=(that: System.DayOfWeek): Boolean = false
  def  <(that: System.DayOfWeek): Boolean = false
  def <=(that: System.DayOfWeek): Boolean = false
  def  >(that: System.DayOfWeek): Boolean = false
  def >=(that: System.DayOfWeek): Boolean = false
  def  |(that: System.DayOfWeek): Boolean = false
  def  &(that: System.DayOfWeek): Boolean = false
  def  ^(that: System.DayOfWeek): Boolean = false
}
object DayOfWeek{
  val Sunday	 = value(0)
  val Monday	 = value(1)
  val Tuesday	 = value(2)
  val Wednesday	 = value(3)
  val Thursday	 = value(4)
  val Friday	 = value(5)
  val Saturday	 = value(6)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.DayOfWeek = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class DBNull extends AnyRef with System.Runtime.Serialization.ISerializable with System.IConvertible {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  def ToString: String
   
  def ToString(provider : System.IFormatProvider): String
   
  def GetTypeCode: System.TypeCode
}
object DBNull {
  val Value : System.DBNull  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Decimal extends System.ValueType with System.IFormattable with System.IComparable with System.IConvertible with 
                             System.IComparable[System.Decimal] with System.IEquatable[System.Decimal] {
  def CompareTo(value : AnyRef): Int
   
  def CompareTo(value : System.Decimal): Int
   
  def Equals(value : AnyRef): Boolean
   
  def Equals(value : System.Decimal): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def ToString(format : String): String
   
  def ToString(provider : System.IFormatProvider): String
   
  def ToString(format : String, provider : System.IFormatProvider): String
   
  def GetTypeCode: System.TypeCode
   
  def this(value : Int) {}
   
  @System.CLSCompliantAttribute(false)
  def this(value : UInt) {}
   
  def this(value : Long) {}
   
  @System.CLSCompliantAttribute(false)
  def this(value : ULong) {}
   
  def this(value : Float) {}
   
  def this(value : Double) {}
   
  def this(bits : Array[Int]) {}
   
  def this(lo : Int, mid : Int, hi : Int, isNegative : Boolean, scale : UByte) {}
}
object Decimal {
  def ToOACurrency(value : System.Decimal): Long  = 0
   
  def FromOACurrency(cy : Long): System.Decimal  = new System.Decimal()
   
  def Add(d1 : System.Decimal, d2 : System.Decimal): System.Decimal  = new System.Decimal()
   
  def Ceiling(d : System.Decimal): System.Decimal  = new System.Decimal()
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Compare(d1 : System.Decimal, d2 : System.Decimal): Int  = 0
   
  def Divide(d1 : System.Decimal, d2 : System.Decimal): System.Decimal  = new System.Decimal()
   
  def Equals(d1 : System.Decimal, d2 : System.Decimal): Boolean  = false
   
  def Floor(d : System.Decimal): System.Decimal  = new System.Decimal()
   
  def Parse(s : String): System.Decimal  = new System.Decimal()
   
  def Parse(s : String, style : System.Globalization.NumberStyles): System.Decimal  = new System.Decimal()
   
  def Parse(s : String, provider : System.IFormatProvider): System.Decimal  = new System.Decimal()
   
  def Parse(s : String, style : System.Globalization.NumberStyles, 
            provider : System.IFormatProvider): System.Decimal  = new System.Decimal()
   
  def TryParse(s : String, result : CLRByRef[System.Decimal]): Boolean  = false
   
  def TryParse(s : String, style : System.Globalization.NumberStyles, 
               provider : System.IFormatProvider, result : CLRByRef[System.Decimal]): Boolean  = false
   
  def GetBits(d : System.Decimal): Array[Int]  = Array.empty[Int]
   
  def Remainder(d1 : System.Decimal, d2 : System.Decimal): System.Decimal  = new System.Decimal()
   
  def Multiply(d1 : System.Decimal, d2 : System.Decimal): System.Decimal  = new System.Decimal()
   
  def Negate(d : System.Decimal): System.Decimal  = new System.Decimal()
   
  def Round(d : System.Decimal): System.Decimal  = new System.Decimal()
   
  def Round(d : System.Decimal, decimals : Int): System.Decimal  = new System.Decimal()
   
  def Round(d : System.Decimal, mode : System.MidpointRounding): System.Decimal  = new System.Decimal()
   
  def Round(d : System.Decimal, decimals : Int, mode : System.MidpointRounding): System.Decimal  = new System.Decimal()
   
  def Subtract(d1 : System.Decimal, d2 : System.Decimal): System.Decimal  = new System.Decimal()
   
  def ToByte(value : System.Decimal): UByte  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToSByte(value : System.Decimal): Byte  = 0
   
  def ToInt16(value : System.Decimal): Short  = 0
   
  def ToDouble(d : System.Decimal): Double  = 0
   
  def ToInt32(d : System.Decimal): Int  = 0
   
  def ToInt64(d : System.Decimal): Long  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt16(value : System.Decimal): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt32(d : System.Decimal): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def ToUInt64(d : System.Decimal): ULong  = 0
   
  def ToSingle(d : System.Decimal): Float  = 0
   
  def Truncate(d : System.Decimal): System.Decimal  = new System.Decimal()
   
  def op_Implicit(value : UByte): System.Decimal  = new System.Decimal()
   
  @System.CLSCompliantAttribute(false)
  def op_Implicit(value : Byte): System.Decimal  = new System.Decimal()
   
  def op_Implicit(value : Short): System.Decimal  = new System.Decimal()
   
  @System.CLSCompliantAttribute(false)
  def op_Implicit(value : UShort): System.Decimal  = new System.Decimal()
   
  def op_Implicit(value : Char): System.Decimal  = new System.Decimal()
   
  def op_Implicit(value : Int): System.Decimal  = new System.Decimal()
   
  @System.CLSCompliantAttribute(false)
  def op_Implicit(value : UInt): System.Decimal  = new System.Decimal()
   
  def op_Implicit(value : Long): System.Decimal  = new System.Decimal()
   
  @System.CLSCompliantAttribute(false)
  def op_Implicit(value : ULong): System.Decimal  = new System.Decimal()
   
  def op_Explicit(value : Float): System.Decimal  = new System.Decimal()
   
  def op_Explicit(value : Double): System.Decimal  = new System.Decimal()
   
  def op_Explicit(value : System.Decimal): UByte  = 0
   
  @System.CLSCompliantAttribute(false)
  def op_Explicit(value : System.Decimal): Byte  = 0
   
  def op_Explicit(value : System.Decimal): Char  = '0'
   
  def op_Explicit(value : System.Decimal): Short  = 0
   
  @System.CLSCompliantAttribute(false)
  def op_Explicit(value : System.Decimal): UShort  = 0
   
  def op_Explicit(value : System.Decimal): Int  = 0
   
  @System.CLSCompliantAttribute(false)
  def op_Explicit(value : System.Decimal): UInt  = 0
   
  def op_Explicit(value : System.Decimal): Long  = 0
   
  @System.CLSCompliantAttribute(false)
  def op_Explicit(value : System.Decimal): ULong  = 0
   
  def op_Explicit(value : System.Decimal): Float  = 0
   
  def op_Explicit(value : System.Decimal): Double  = 0
   
  def unary_+(d : System.Decimal): System.Decimal  = new System.Decimal()
   
  def unary_-(d : System.Decimal): System.Decimal  = new System.Decimal()
   
  def ++(d : System.Decimal): System.Decimal  = new System.Decimal()
   
  def --(d : System.Decimal): System.Decimal  = new System.Decimal()
   
  def +(d1 : System.Decimal, d2 : System.Decimal): System.Decimal  = new System.Decimal()
   
  def -(d1 : System.Decimal, d2 : System.Decimal): System.Decimal  = new System.Decimal()
   
  def *(d1 : System.Decimal, d2 : System.Decimal): System.Decimal  = new System.Decimal()
   
  def /(d1 : System.Decimal, d2 : System.Decimal): System.Decimal  = new System.Decimal()
   
  def %(d1 : System.Decimal, d2 : System.Decimal): System.Decimal  = new System.Decimal()
   
  def ==(d1 : System.Decimal, d2 : System.Decimal): Boolean  = false
   
  def !=(d1 : System.Decimal, d2 : System.Decimal): Boolean  = false
   
  def <(d1 : System.Decimal, d2 : System.Decimal): Boolean  = false
   
  def <=(d1 : System.Decimal, d2 : System.Decimal): Boolean  = false
   
  def >(d1 : System.Decimal, d2 : System.Decimal): Boolean  = false
   
  def >=(d1 : System.Decimal, d2 : System.Decimal): Boolean  = false
   
  @System.Runtime.CompilerServices.DecimalConstantAttribute(0, 0, 0x0, 0x0, 0x0)
  val Zero : System.Decimal  = new System.Decimal()
   
  @System.Runtime.CompilerServices.DecimalConstantAttribute(0, 0, 0x0, 0x0, 0x1)
  val One : System.Decimal  = new System.Decimal()
   
  @System.Runtime.CompilerServices.DecimalConstantAttribute(0, 128, 0x0, 0x0, 0x1)
  val MinusOne : System.Decimal  = new System.Decimal()
   
  @System.Runtime.CompilerServices.DecimalConstantAttribute(0, 0, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF)
  val MaxValue : System.Decimal  = new System.Decimal()
   
  @System.Runtime.CompilerServices.DecimalConstantAttribute(0, 128, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF)
  val MinValue : System.Decimal  = new System.Decimal()
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class DivideByZeroException extends System.ArithmeticException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Double extends System.ValueType with System.IComparable with System.IFormattable with System.IConvertible with 
                            System.IComparable[Double] with System.IEquatable[Double] {
  def CompareTo(value : AnyRef): Int
   
  def CompareTo(value : Double): Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : Double): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def ToString(format : String): String
   
  def ToString(provider : System.IFormatProvider): String
   
  def ToString(format : String, provider : System.IFormatProvider): String
   
  def GetTypeCode: System.TypeCode
}
object Double {
  def IsInfinity(d : Double): Boolean  = false
   
  def IsPositiveInfinity(d : Double): Boolean  = false
   
  def IsNegativeInfinity(d : Double): Boolean  = false
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def IsNaN(d : Double): Boolean  = false
   
  def Parse(s : String): Double  = 0
   
  def Parse(s : String, style : System.Globalization.NumberStyles): Double  = 0
   
  def Parse(s : String, provider : System.IFormatProvider): Double  = 0
   
  def Parse(s : String, style : System.Globalization.NumberStyles, 
            provider : System.IFormatProvider): Double  = 0
   
  def TryParse(s : String, result : CLRByRef[Double]): Boolean  = false
   
  def TryParse(s : String, style : System.Globalization.NumberStyles, 
               provider : System.IFormatProvider, result : CLRByRef[Double]): Boolean  = false
   
  val MinValue : Double  = 0
   
  val MaxValue : Double  = 0
   
  val Epsilon : Double  = 0
   
  val NegativeInfinity : Double  = 0
   
  val PositiveInfinity : Double  = 0
   
  val NaN : Double  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class DuplicateWaitObjectException extends System.ArgumentException {
  def this() {}
   
  def this(parameterName : String) {}
   
  def this(parameterName : String, message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class TypeLoadException extends System.SystemException with System.Runtime.Serialization.ISerializable {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  val Message : String = ""
   
  val TypeName : String = ""
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class EntryPointNotFoundException extends System.TypeLoadException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class DllNotFoundException extends System.TypeLoadException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
sealed abstract class EnvironmentVariableTarget extends System.Enum {
  def ==(that: System.EnvironmentVariableTarget): Boolean = false
  def !=(that: System.EnvironmentVariableTarget): Boolean = false
  def  <(that: System.EnvironmentVariableTarget): Boolean = false
  def <=(that: System.EnvironmentVariableTarget): Boolean = false
  def  >(that: System.EnvironmentVariableTarget): Boolean = false
  def >=(that: System.EnvironmentVariableTarget): Boolean = false
  def  |(that: System.EnvironmentVariableTarget): Boolean = false
  def  &(that: System.EnvironmentVariableTarget): Boolean = false
  def  ^(that: System.EnvironmentVariableTarget): Boolean = false
}
object EnvironmentVariableTarget{
  val Process	 = value(0)
  val User	 = value(1)
  val Machine	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.EnvironmentVariableTarget = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract sealed class Environment extends AnyRef 
object Environment {
  def Exit(exitCode : Int): Unit  = {}
   
  def FailFast(message : String): Unit  = {}
   
  def ExpandEnvironmentVariables(name : String): String  = ""
   
  def GetCommandLineArgs: Array[String]  = Array.empty[String]
   
  def GetEnvironmentVariable(variable : String): String  = ""
   
  def GetEnvironmentVariable(variable : String, target : System.EnvironmentVariableTarget): String  = ""
   
  def GetEnvironmentVariables: System.Collections.IDictionary  = null
   
  def GetEnvironmentVariables(target : System.EnvironmentVariableTarget): System.Collections.IDictionary  = null
   
  def SetEnvironmentVariable(variable : String, value : String): Unit  = {}
   
  def SetEnvironmentVariable(variable : String, value : String, target : System.EnvironmentVariableTarget): Unit  = {}
   
  def GetLogicalDrives: Array[String]  = Array.empty[String]
   
  def GetFolderPath(folder : System.Environment.SpecialFolder): String  = ""
   
  val TickCount : Int = 0
   
  var ExitCode : Int = 0
   
  val CommandLine : String = ""
   
  var CurrentDirectory : String = ""
   
  val SystemDirectory : String = ""
   
  val MachineName : String = ""
   
  val ProcessorCount : Int = 0
   
  val NewLine : String = ""
   
  val Version : System.Version = null
   
  val WorkingSet : Long = 0
   
  val OSVersion : System.OperatingSystem = null
   
  val StackTrace : String = ""
   
  val HasShutdownStarted : Boolean = false
   
  val UserName : String = ""
   
  val UserInteractive : Boolean = false
   
  val UserDomainName : String = ""
   
  sealed abstract class SpecialFolder extends System.Enum {
    def ==(that: System.Environment.SpecialFolder): Boolean = false
    def !=(that: System.Environment.SpecialFolder): Boolean = false
    def  <(that: System.Environment.SpecialFolder): Boolean = false
    def <=(that: System.Environment.SpecialFolder): Boolean = false
    def  >(that: System.Environment.SpecialFolder): Boolean = false
    def >=(that: System.Environment.SpecialFolder): Boolean = false
    def  |(that: System.Environment.SpecialFolder): Boolean = false
    def  &(that: System.Environment.SpecialFolder): Boolean = false
    def  ^(that: System.Environment.SpecialFolder): Boolean = false
  }
  object SpecialFolder{
    val ApplicationData	 = value(26)
    val CommonApplicationData	 = value(35)
    val LocalApplicationData	 = value(28)
    val Cookies	 = value(33)
    val Desktop	 = value(0)
    val Favorites	 = value(6)
    val History	 = value(34)
    val InternetCache	 = value(32)
    val Programs	 = value(2)
    val MyComputer	 = value(17)
    val MyMusic	 = value(13)
    val MyPictures	 = value(39)
    val Recent	 = value(8)
    val SendTo	 = value(9)
    val StartMenu	 = value(11)
    val Startup	 = value(7)
    val System	 = value(37)
    val Templates	 = value(21)
    val DesktopDirectory	 = value(16)
    val Personal	 = value(5)
    val MyDocuments	 = value(5)
    val ProgramFiles	 = value(38)
    val CommonProgramFiles	 = value(43)
     
    /* an artifact for CLR enums */ private def value(i: Int): System.Environment.SpecialFolder = null
  }
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class EventHandler extends System.MulticastDelegate {
  def Invoke(sender : AnyRef, e : System.EventArgs): Unit
   
  def BeginInvoke(sender : AnyRef, e : System.EventArgs, callback : System.AsyncCallback, 
                  `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed class EventHandler[TEventArgs <: System.EventArgs] extends System.MulticastDelegate {
  def Invoke(sender : AnyRef, e : TEventArgs): Unit
   
  def BeginInvoke(sender : AnyRef, e : TEventArgs, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class FieldAccessException extends System.MemberAccessException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.AttributeUsageAttribute(16 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class FlagsAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class FormatException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
sealed abstract class GCCollectionMode extends System.Enum {
  def ==(that: System.GCCollectionMode): Boolean = false
  def !=(that: System.GCCollectionMode): Boolean = false
  def  <(that: System.GCCollectionMode): Boolean = false
  def <=(that: System.GCCollectionMode): Boolean = false
  def  >(that: System.GCCollectionMode): Boolean = false
  def >=(that: System.GCCollectionMode): Boolean = false
  def  |(that: System.GCCollectionMode): Boolean = false
  def  &(that: System.GCCollectionMode): Boolean = false
  def  ^(that: System.GCCollectionMode): Boolean = false
}
object GCCollectionMode{
  val Default	 = value(0)
  val Forced	 = value(1)
  val Optimized	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.GCCollectionMode = null
}
 
sealed abstract class GCNotificationStatus extends System.Enum {
  def ==(that: System.GCNotificationStatus): Boolean = false
  def !=(that: System.GCNotificationStatus): Boolean = false
  def  <(that: System.GCNotificationStatus): Boolean = false
  def <=(that: System.GCNotificationStatus): Boolean = false
  def  >(that: System.GCNotificationStatus): Boolean = false
  def >=(that: System.GCNotificationStatus): Boolean = false
  def  |(that: System.GCNotificationStatus): Boolean = false
  def  &(that: System.GCNotificationStatus): Boolean = false
  def  ^(that: System.GCNotificationStatus): Boolean = false
}
object GCNotificationStatus{
  val Succeeded	 = value(0)
  val Failed	 = value(1)
  val Canceled	 = value(2)
  val Timeout	 = value(3)
  val NotApplicable	 = value(4)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.GCNotificationStatus = null
}
 
abstract sealed class GC extends AnyRef 
object GC {
  def AddMemoryPressure(bytesAllocated : Long): Unit  = {}
   
  def RemoveMemoryPressure(bytesAllocated : Long): Unit  = {}
   
  def GetGeneration(obj : AnyRef): Int  = 0
   
  def Collect(generation : Int): Unit  = {}
   
  def Collect: Unit  = {}
   
  def Collect(generation : Int, mode : System.GCCollectionMode): Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def CollectionCount(generation : Int): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def KeepAlive(obj : AnyRef): Unit  = {}
   
  def GetGeneration(wo : System.WeakReference): Int  = 0
   
  def WaitForPendingFinalizers: Unit  = {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def SuppressFinalize(obj : AnyRef): Unit  = {}
   
  def ReRegisterForFinalize(obj : AnyRef): Unit  = {}
   
  def GetTotalMemory(forceFullCollection : Boolean): Long  = 0
   
  def RegisterForFullGCNotification(maxGenerationThreshold : Int, largeObjectHeapThreshold : Int): Unit  = {}
   
  def CancelFullGCNotification: Unit  = {}
   
  def WaitForFullGCApproach: System.GCNotificationStatus  = System.GCNotificationStatus.Succeeded
   
  def WaitForFullGCApproach(millisecondsTimeout : Int): System.GCNotificationStatus  = System.GCNotificationStatus.Succeeded
   
  def WaitForFullGCComplete: System.GCNotificationStatus  = System.GCNotificationStatus.Succeeded
   
  def WaitForFullGCComplete(millisecondsTimeout : Int): System.GCNotificationStatus  = System.GCNotificationStatus.Succeeded
   
  val MaxGeneration : Int = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Guid extends System.ValueType with System.IFormattable with System.IComparable with 
                          System.IComparable[System.Guid] with System.IEquatable[System.Guid] {
  def ToByteArray: Array[UByte]
   
  def ToString: String
   
  def GetHashCode: Int
   
  def Equals(o : AnyRef): Boolean
   
  def Equals(g : System.Guid): Boolean
   
  def CompareTo(value : AnyRef): Int
   
  def CompareTo(value : System.Guid): Int
   
  def ToString(format : String): String
   
  def ToString(format : String, provider : System.IFormatProvider): String
   
  def this(b : Array[UByte]) {}
   
  @System.CLSCompliantAttribute(false)
  def this(a : UInt, b : UShort, c : UShort, d : UByte, e : UByte, f : UByte, g : UByte, h : UByte, 
           i : UByte, j : UByte, k : UByte) {}
   
  def this(g : String) {}
   
  def this(a : Int, b : Short, c : Short, d : Array[UByte]) {}
   
  def this(a : Int, b : Short, c : Short, d : UByte, e : UByte, f : UByte, g : UByte, h : UByte, i : UByte, 
           j : UByte, k : UByte) {}
}
object Guid {
  def ==(a : System.Guid, b : System.Guid): Boolean  = false
   
  def !=(a : System.Guid, b : System.Guid): Boolean  = false
   
  def NewGuid: System.Guid  = new System.Guid()
   
  val Empty : System.Guid  = new System.Guid()
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IAsyncResult {
  val IsCompleted : Boolean = false
   
  val AsyncWaitHandle : System.Threading.WaitHandle = null
   
  val AsyncState : AnyRef = null
   
  val CompletedSynchronously : Boolean = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ICustomFormatter {
  /* abstract */ def Format(format : String, arg : AnyRef, formatProvider : System.IFormatProvider): String
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IFormatProvider {
  /* abstract */ def GetFormat(formatType : System.Type): AnyRef
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class IndexOutOfRangeException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
}
 
sealed class InsufficientMemoryException extends System.OutOfMemoryException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Int16 extends System.ValueType with System.IComparable with System.IFormattable with System.IConvertible with 
                           System.IComparable[Short] with System.IEquatable[Short] {
  def CompareTo(value : AnyRef): Int
   
  def CompareTo(value : Short): Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : Short): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def ToString(provider : System.IFormatProvider): String
   
  def ToString(format : String): String
   
  def ToString(format : String, provider : System.IFormatProvider): String
   
  def GetTypeCode: System.TypeCode
}
object Int16 {
  def Parse(s : String): Short  = 0
   
  def Parse(s : String, style : System.Globalization.NumberStyles): Short  = 0
   
  def Parse(s : String, provider : System.IFormatProvider): Short  = 0
   
  def Parse(s : String, style : System.Globalization.NumberStyles, 
            provider : System.IFormatProvider): Short  = 0
   
  def TryParse(s : String, result : CLRByRef[Short]): Boolean  = false
   
  def TryParse(s : String, style : System.Globalization.NumberStyles, 
               provider : System.IFormatProvider, result : CLRByRef[Short]): Boolean  = false
   
  val MaxValue : Short  = 0
   
  val MinValue : Short  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Int32 extends System.ValueType with System.IComparable with System.IFormattable with System.IConvertible with 
                           System.IComparable[Int] with System.IEquatable[Int] {
  def CompareTo(value : AnyRef): Int
   
  def CompareTo(value : Int): Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : Int): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def ToString(format : String): String
   
  def ToString(provider : System.IFormatProvider): String
   
  def ToString(format : String, provider : System.IFormatProvider): String
   
  def GetTypeCode: System.TypeCode
}
object Int32 {
  def Parse(s : String): Int  = 0
   
  def Parse(s : String, style : System.Globalization.NumberStyles): Int  = 0
   
  def Parse(s : String, provider : System.IFormatProvider): Int  = 0
   
  def Parse(s : String, style : System.Globalization.NumberStyles, 
            provider : System.IFormatProvider): Int  = 0
   
  def TryParse(s : String, result : CLRByRef[Int]): Boolean  = false
   
  def TryParse(s : String, style : System.Globalization.NumberStyles, 
               provider : System.IFormatProvider, result : CLRByRef[Int]): Boolean  = false
   
  val MaxValue : Int  = 0
   
  val MinValue : Int  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Int64 extends System.ValueType with System.IComparable with System.IFormattable with System.IConvertible with 
                           System.IComparable[Long] with System.IEquatable[Long] {
  def CompareTo(value : AnyRef): Int
   
  def CompareTo(value : Long): Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : Long): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def ToString(provider : System.IFormatProvider): String
   
  def ToString(format : String): String
   
  def ToString(format : String, provider : System.IFormatProvider): String
   
  def GetTypeCode: System.TypeCode
}
object Int64 {
  def Parse(s : String): Long  = 0
   
  def Parse(s : String, style : System.Globalization.NumberStyles): Long  = 0
   
  def Parse(s : String, provider : System.IFormatProvider): Long  = 0
   
  def Parse(s : String, style : System.Globalization.NumberStyles, 
            provider : System.IFormatProvider): Long  = 0
   
  def TryParse(s : String, result : CLRByRef[Long]): Boolean  = false
   
  def TryParse(s : String, style : System.Globalization.NumberStyles, 
               provider : System.IFormatProvider, result : CLRByRef[Long]): Boolean  = false
   
  val MaxValue : Long  = 0
   
  val MinValue : Long  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class IntPtr extends System.ValueType with System.Runtime.Serialization.ISerializable {
  def Equals(obj : AnyRef): Boolean
   
  def GetHashCode: Int
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def ToInt32: Int
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def ToInt64: Long
   
  def ToString: String
   
  def ToString(format : String): String
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def this(value : Int) {}
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def this(value : Long) {}
   
  @System.CLSCompliantAttribute(false)
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def this(value : CLRPointer[Unit]) {}
}
object IntPtr {
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def op_Explicit(value : Int): System.IntPtr  = new System.IntPtr()
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.MayCorruptInstance, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def op_Explicit(value : Long): System.IntPtr  = new System.IntPtr()
   
  def op_Explicit(value : System.IntPtr): Int  = 0
   
  def op_Explicit(value : System.IntPtr): Long  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def ==(value1 : System.IntPtr, value2 : System.IntPtr): Boolean  = false
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def !=(value1 : System.IntPtr, value2 : System.IntPtr): Boolean  = false
   
  val Zero : System.IntPtr  = new System.IntPtr()
   
  val Size : Int = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class InvalidCastException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
   
  def this(message : String, errorCode : Int) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class InvalidOperationException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class InvalidProgramException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
}
 
trait IServiceProvider {
  /* abstract */ def GetService(serviceType : System.Type): AnyRef
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class LocalDataStoreSlot extends AnyRef {
  protected def Finalize: Unit
}
 
abstract sealed class Math extends AnyRef 
object Math {
  def Acos(d : Double): Double  = 0
   
  def Asin(d : Double): Double  = 0
   
  def Atan(d : Double): Double  = 0
   
  def Atan2(y : Double, x : Double): Double  = 0
   
  def Ceiling(d : System.Decimal): System.Decimal  = new System.Decimal()
   
  def Ceiling(a : Double): Double  = 0
   
  def Cos(d : Double): Double  = 0
   
  def Cosh(value : Double): Double  = 0
   
  def Floor(d : System.Decimal): System.Decimal  = new System.Decimal()
   
  def Floor(d : Double): Double  = 0
   
  def Sin(a : Double): Double  = 0
   
  def Tan(a : Double): Double  = 0
   
  def Sinh(value : Double): Double  = 0
   
  def Tanh(value : Double): Double  = 0
   
  def Round(a : Double): Double  = 0
   
  def Round(value : Double, digits : Int): Double  = 0
   
  def Round(value : Double, mode : System.MidpointRounding): Double  = 0
   
  def Round(value : Double, digits : Int, mode : System.MidpointRounding): Double  = 0
   
  def Round(d : System.Decimal): System.Decimal  = new System.Decimal()
   
  def Round(d : System.Decimal, decimals : Int): System.Decimal  = new System.Decimal()
   
  def Round(d : System.Decimal, mode : System.MidpointRounding): System.Decimal  = new System.Decimal()
   
  def Round(d : System.Decimal, decimals : Int, mode : System.MidpointRounding): System.Decimal  = new System.Decimal()
   
  def Truncate(d : System.Decimal): System.Decimal  = new System.Decimal()
   
  def Truncate(d : Double): Double  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Sqrt(d : Double): Double  = 0
   
  def Log(d : Double): Double  = 0
   
  def Log10(d : Double): Double  = 0
   
  def Exp(d : Double): Double  = 0
   
  def Pow(x : Double, y : Double): Double  = 0
   
  def IEEERemainder(x : Double, y : Double): Double  = 0
   
  @System.CLSCompliantAttribute(false)
  def Abs(value : Byte): Byte  = 0
   
  def Abs(value : Short): Short  = 0
   
  def Abs(value : Int): Int  = 0
   
  def Abs(value : Long): Long  = 0
   
  def Abs(value : Float): Float  = 0
   
  def Abs(value : Double): Double  = 0
   
  def Abs(value : System.Decimal): System.Decimal  = new System.Decimal()
   
  @System.CLSCompliantAttribute(false)
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Max(val1 : Byte, val2 : Byte): Byte  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Max(val1 : UByte, val2 : UByte): UByte  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Max(val1 : Short, val2 : Short): Short  = 0
   
  @System.CLSCompliantAttribute(false)
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Max(val1 : UShort, val2 : UShort): UShort  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Max(val1 : Int, val2 : Int): Int  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  @System.CLSCompliantAttribute(false)
  def Max(val1 : UInt, val2 : UInt): UInt  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Max(val1 : Long, val2 : Long): Long  = 0
   
  @System.CLSCompliantAttribute(false)
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Max(val1 : ULong, val2 : ULong): ULong  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Max(val1 : Float, val2 : Float): Float  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Max(val1 : Double, val2 : Double): Double  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Max(val1 : System.Decimal, val2 : System.Decimal): System.Decimal  = new System.Decimal()
   
  @System.CLSCompliantAttribute(false)
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Min(val1 : Byte, val2 : Byte): Byte  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Min(val1 : UByte, val2 : UByte): UByte  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Min(val1 : Short, val2 : Short): Short  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  @System.CLSCompliantAttribute(false)
  def Min(val1 : UShort, val2 : UShort): UShort  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Min(val1 : Int, val2 : Int): Int  = 0
   
  @System.CLSCompliantAttribute(false)
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Min(val1 : UInt, val2 : UInt): UInt  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Min(val1 : Long, val2 : Long): Long  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  @System.CLSCompliantAttribute(false)
  def Min(val1 : ULong, val2 : ULong): ULong  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Min(val1 : Float, val2 : Float): Float  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Min(val1 : Double, val2 : Double): Double  = 0
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Min(val1 : System.Decimal, val2 : System.Decimal): System.Decimal  = new System.Decimal()
   
  def Log(a : Double, newBase : Double): Double  = 0
   
  @System.CLSCompliantAttribute(false)
  def Sign(value : Byte): Int  = 0
   
  def Sign(value : Short): Int  = 0
   
  def Sign(value : Int): Int  = 0
   
  def Sign(value : Long): Int  = 0
   
  def Sign(value : Float): Int  = 0
   
  def Sign(value : Double): Int  = 0
   
  def Sign(value : System.Decimal): Int  = 0
   
  def BigMul(a : Int, b : Int): Long  = 0
   
  def DivRem(a : Int, b : Int, result : CLRByRef[Int]): Int  = 0
   
  def DivRem(a : Long, b : Long, result : CLRByRef[Long]): Long  = 0
   
  val PI : Double  = 0
   
  val E : Double  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class MethodAccessException extends System.MemberAccessException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
sealed abstract class MidpointRounding extends System.Enum {
  def ==(that: System.MidpointRounding): Boolean = false
  def !=(that: System.MidpointRounding): Boolean = false
  def  <(that: System.MidpointRounding): Boolean = false
  def <=(that: System.MidpointRounding): Boolean = false
  def  >(that: System.MidpointRounding): Boolean = false
  def >=(that: System.MidpointRounding): Boolean = false
  def  |(that: System.MidpointRounding): Boolean = false
  def  &(that: System.MidpointRounding): Boolean = false
  def  ^(that: System.MidpointRounding): Boolean = false
}
object MidpointRounding{
  val ToEven	 = value(0)
  val AwayFromZero	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.MidpointRounding = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class MissingMemberException extends System.MemberAccessException with System.Runtime.Serialization.ISerializable {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  protected var ClassName : String
   
  protected var MemberName : String
   
  protected var Signature : Array[UByte]
   
  val Message : String = ""
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
   
  def this(className : String, memberName : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class MissingFieldException extends System.MissingMemberException with System.Runtime.Serialization.ISerializable {
  val Message : String = ""
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
   
  def this(className : String, fieldName : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class MissingMethodException extends System.MissingMemberException with System.Runtime.Serialization.ISerializable {
  val Message : String = ""
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
   
  def this(className : String, methodName : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class MulticastNotSupportedException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
}
 
@System.AttributeUsageAttribute(256 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class NonSerializedAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class NotFiniteNumberException extends System.ArithmeticException {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  val OffendingNumber : Double = 0
   
  def this() {}
   
  def this(offendingNumber : Double) {}
   
  def this(message : String) {}
   
  def this(message : String, offendingNumber : Double) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  def this(message : String, offendingNumber : Double, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class NotImplementedException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class NotSupportedException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class NullReferenceException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ObjectDisposedException extends System.InvalidOperationException {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  val Message : String = ""
   
  val ObjectName : String = ""
   
  def this(objectName : String) {}
   
  def this(objectName : String, message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.AttributeUsageAttribute(6140 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ObsoleteAttribute extends System.Attribute {
  val Message : String = ""
   
  val IsError : Boolean = false
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, error : Boolean) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class OperatingSystem extends AnyRef with System.ICloneable with System.Runtime.Serialization.ISerializable {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  def Clone: AnyRef
   
  def ToString: String
   
  val Platform : System.PlatformID = System.PlatformID.Win32S
   
  val ServicePack : String = ""
   
  val Version : System.Version = null
   
  val VersionString : String = ""
   
  def this(platform : System.PlatformID, version : System.Version) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class OperationCanceledException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class OverflowException extends System.ArithmeticException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(2048 /* Inherited = true, AllowMultiple = false */ )
sealed class ParamArrayAttribute extends System.Attribute {
  def this() {}
}
 
sealed abstract class PlatformID extends System.Enum {
  def ==(that: System.PlatformID): Boolean = false
  def !=(that: System.PlatformID): Boolean = false
  def  <(that: System.PlatformID): Boolean = false
  def <=(that: System.PlatformID): Boolean = false
  def  >(that: System.PlatformID): Boolean = false
  def >=(that: System.PlatformID): Boolean = false
  def  |(that: System.PlatformID): Boolean = false
  def  &(that: System.PlatformID): Boolean = false
  def  ^(that: System.PlatformID): Boolean = false
}
object PlatformID{
  val Win32S	 = value(0)
  val Win32Windows	 = value(1)
  val Win32NT	 = value(2)
  val WinCE	 = value(3)
  val Unix	 = value(4)
  val Xbox	 = value(5)
  val MacOSX	 = value(6)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.PlatformID = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class PlatformNotSupportedException extends System.NotSupportedException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class Random extends AnyRef {
  protected def Sample: Double
   
  def Next: Int
   
  def Next(minValue : Int, maxValue : Int): Int
   
  def Next(maxValue : Int): Int
   
  def NextDouble: Double
   
  def NextBytes(buffer : Array[UByte]): Unit
   
  def this() {}
   
  def this(Seed : Int) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class RankException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ClassInterfaceAttribute(System.Runtime.InteropServices.ClassInterfaceType.None)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.ComDefaultInterfaceAttribute(typeOf[System.Type])
abstract class Type extends System.Reflection.MemberInfo with System.Runtime.InteropServices._Type with 
                            System.Reflection.IReflect {
  def GetType: System.Type
   
  def MakePointerType: System.Type
   
  def MakeByRefType: System.Type
   
  def MakeArrayType: System.Type
   
  def MakeArrayType(rank : Int): System.Type
   
  /* abstract */ def InvokeMember(name : String, invokeAttr : System.Reflection.BindingFlags, 
                                  binder : System.Reflection.Binder, target : AnyRef, args : Array[AnyRef], 
                                  modifiers : Array[System.Reflection.ParameterModifier], 
                                  culture : System.Globalization.CultureInfo, namedParameters : Array[String]): AnyRef
   
  @System.Diagnostics.DebuggerStepThroughAttribute()
  @System.Diagnostics.DebuggerHiddenAttribute()
  def InvokeMember(name : String, invokeAttr : System.Reflection.BindingFlags, 
                   binder : System.Reflection.Binder, target : AnyRef, args : Array[AnyRef], 
                   culture : System.Globalization.CultureInfo): AnyRef
   
  @System.Diagnostics.DebuggerStepThroughAttribute()
  @System.Diagnostics.DebuggerHiddenAttribute()
  def InvokeMember(name : String, invokeAttr : System.Reflection.BindingFlags, 
                   binder : System.Reflection.Binder, target : AnyRef, args : Array[AnyRef]): AnyRef
   
  def GetArrayRank: Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetConstructor(bindingAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                     callConvention : System.Reflection.CallingConventions, types : Array[System.Type], 
                     modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.ConstructorInfo
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetConstructor(bindingAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                     types : Array[System.Type], modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.ConstructorInfo
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetConstructor(types : Array[System.Type]): System.Reflection.ConstructorInfo
   
  protected /* abstract */ def GetConstructorImpl(bindingAttr : System.Reflection.BindingFlags, binder : System.Reflection.Binder, 
                                                  callConvention : System.Reflection.CallingConventions, types : Array[System.Type], 
                                                  modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.ConstructorInfo
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetConstructors: Array[System.Reflection.ConstructorInfo]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  /* abstract */ def GetConstructors(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.ConstructorInfo]
   
  def GetMethod(name : String, bindingAttr : System.Reflection.BindingFlags, 
                binder : System.Reflection.Binder, 
                callConvention : System.Reflection.CallingConventions, types : Array[System.Type], 
                modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.MethodInfo
   
  def GetMethod(name : String, bindingAttr : System.Reflection.BindingFlags, 
                binder : System.Reflection.Binder, types : Array[System.Type], 
                modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.MethodInfo
   
  def GetMethod(name : String, types : Array[System.Type], 
                modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.MethodInfo
   
  def GetMethod(name : String, types : Array[System.Type]): System.Reflection.MethodInfo
   
  def GetMethod(name : String, bindingAttr : System.Reflection.BindingFlags): System.Reflection.MethodInfo
   
  def GetMethod(name : String): System.Reflection.MethodInfo
   
  protected /* abstract */ def GetMethodImpl(name : String, bindingAttr : System.Reflection.BindingFlags, 
                                             binder : System.Reflection.Binder, 
                                             callConvention : System.Reflection.CallingConventions, types : Array[System.Type], 
                                             modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.MethodInfo
   
  def GetMethods: Array[System.Reflection.MethodInfo]
   
  /* abstract */ def GetMethods(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MethodInfo]
   
  /* abstract */ def GetField(name : String, bindingAttr : System.Reflection.BindingFlags): System.Reflection.FieldInfo
   
  def GetField(name : String): System.Reflection.FieldInfo
   
  def GetFields: Array[System.Reflection.FieldInfo]
   
  /* abstract */ def GetFields(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.FieldInfo]
   
  def GetInterface(name : String): System.Type
   
  /* abstract */ def GetInterface(name : String, ignoreCase : Boolean): System.Type
   
  /* abstract */ def GetInterfaces: Array[System.Type]
   
  def FindInterfaces(filter : System.Reflection.TypeFilter, filterCriteria : AnyRef): Array[System.Type]
   
  def GetEvent(name : String): System.Reflection.EventInfo
   
  /* abstract */ def GetEvent(name : String, bindingAttr : System.Reflection.BindingFlags): System.Reflection.EventInfo
   
  def GetEvents: Array[System.Reflection.EventInfo]
   
  /* abstract */ def GetEvents(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.EventInfo]
   
  def GetProperty(name : String, bindingAttr : System.Reflection.BindingFlags, 
                  binder : System.Reflection.Binder, returnType : System.Type, 
                  types : Array[System.Type], modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.PropertyInfo
   
  def GetProperty(name : String, returnType : System.Type, types : Array[System.Type], 
                  modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.PropertyInfo
   
  def GetProperty(name : String, bindingAttr : System.Reflection.BindingFlags): System.Reflection.PropertyInfo
   
  def GetProperty(name : String, returnType : System.Type, types : Array[System.Type]): System.Reflection.PropertyInfo
   
  def GetProperty(name : String, types : Array[System.Type]): System.Reflection.PropertyInfo
   
  def GetProperty(name : String, returnType : System.Type): System.Reflection.PropertyInfo
   
  def GetProperty(name : String): System.Reflection.PropertyInfo
   
  protected /* abstract */ def GetPropertyImpl(name : String, bindingAttr : System.Reflection.BindingFlags, 
                                               binder : System.Reflection.Binder, returnType : System.Type, 
                                               types : Array[System.Type], modifiers : Array[System.Reflection.ParameterModifier]): System.Reflection.PropertyInfo
   
  /* abstract */ def GetProperties(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.PropertyInfo]
   
  def GetProperties: Array[System.Reflection.PropertyInfo]
   
  def GetNestedTypes: Array[System.Type]
   
  /* abstract */ def GetNestedTypes(bindingAttr : System.Reflection.BindingFlags): Array[System.Type]
   
  def GetNestedType(name : String): System.Type
   
  /* abstract */ def GetNestedType(name : String, bindingAttr : System.Reflection.BindingFlags): System.Type
   
  def GetMember(name : String): Array[System.Reflection.MemberInfo]
   
  def GetMember(name : String, bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MemberInfo]
   
  def GetMember(name : String, `type` : System.Reflection.MemberTypes, 
                bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MemberInfo]
   
  def GetMembers: Array[System.Reflection.MemberInfo]
   
  /* abstract */ def GetMembers(bindingAttr : System.Reflection.BindingFlags): Array[System.Reflection.MemberInfo]
   
  def GetDefaultMembers: Array[System.Reflection.MemberInfo]
   
  def FindMembers(memberType : System.Reflection.MemberTypes, 
                  bindingAttr : System.Reflection.BindingFlags, 
                  filter : System.Reflection.MemberFilter, filterCriteria : AnyRef): Array[System.Reflection.MemberInfo]
   
  def GetGenericParameterConstraints: Array[System.Type]
   
  protected def IsValueTypeImpl: Boolean
   
  protected /* abstract */ def GetAttributeFlagsImpl: System.Reflection.TypeAttributes
   
  protected /* abstract */ def IsArrayImpl: Boolean
   
  protected /* abstract */ def IsByRefImpl: Boolean
   
  protected /* abstract */ def IsPointerImpl: Boolean
   
  protected /* abstract */ def IsPrimitiveImpl: Boolean
   
  protected /* abstract */ def IsCOMObjectImpl: Boolean
   
  def MakeGenericType(typeArguments : Array[System.Type]): System.Type
   
  protected def IsContextfulImpl: Boolean
   
  protected def IsMarshalByRefImpl: Boolean
   
  /* abstract */ def GetElementType: System.Type
   
  def GetGenericArguments: Array[System.Type]
   
  def GetGenericTypeDefinition: System.Type
   
  protected /* abstract */ def HasElementTypeImpl: Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def IsSubclassOf(c : System.Type): Boolean
   
  def IsInstanceOfType(o : AnyRef): Boolean
   
  def IsAssignableFrom(c : System.Type): Boolean
   
  def ToString: String
   
  def Equals(o : AnyRef): Boolean
   
  def Equals(o : System.Type): Boolean
   
  def GetHashCode: Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def GetInterfaceMap(interfaceType : System.Type): System.Reflection.InterfaceMapping
   
  val MemberType : System.Reflection.MemberTypes = System.Reflection.MemberTypes.Constructor
   
  val DeclaringType : System.Type = null
   
  val DeclaringMethod : System.Reflection.MethodBase = null
   
  val ReflectedType : System.Type = null
   
  val StructLayoutAttribute : System.Runtime.InteropServices.StructLayoutAttribute = null
   
  val GUID : System.Guid = new System.Guid()
   
  val Module : System.Reflection.Module = null
   
  val Assembly : System.Reflection.Assembly = null
   
  val TypeHandle : System.RuntimeTypeHandle = new System.RuntimeTypeHandle()
   
  val FullName : String = ""
   
  val Namespace : String = ""
   
  val AssemblyQualifiedName : String = ""
   
  val BaseType : System.Type = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  val TypeInitializer : System.Reflection.ConstructorInfo = null
   
  val IsNested : Boolean = false
   
  val Attributes : System.Reflection.TypeAttributes = System.Reflection.TypeAttributes.VisibilityMask
   
  val GenericParameterAttributes : System.Reflection.GenericParameterAttributes = System.Reflection.GenericParameterAttributes.None
   
  val IsVisible : Boolean = false
   
  val IsNotPublic : Boolean = false
   
  val IsPublic : Boolean = false
   
  val IsNestedPublic : Boolean = false
   
  val IsNestedPrivate : Boolean = false
   
  val IsNestedFamily : Boolean = false
   
  val IsNestedAssembly : Boolean = false
   
  val IsNestedFamANDAssem : Boolean = false
   
  val IsNestedFamORAssem : Boolean = false
   
  val IsAutoLayout : Boolean = false
   
  val IsLayoutSequential : Boolean = false
   
  val IsExplicitLayout : Boolean = false
   
  val IsClass : Boolean = false
   
  val IsInterface : Boolean = false
   
  val IsValueType : Boolean = false
   
  val IsAbstract : Boolean = false
   
  val IsSealed : Boolean = false
   
  val IsEnum : Boolean = false
   
  val IsSpecialName : Boolean = false
   
  val IsImport : Boolean = false
   
  val IsSerializable : Boolean = false
   
  val IsAnsiClass : Boolean = false
   
  val IsUnicodeClass : Boolean = false
   
  val IsAutoClass : Boolean = false
   
  val IsArray : Boolean = false
   
  val IsGenericType : Boolean = false
   
  val IsGenericTypeDefinition : Boolean = false
   
  val IsGenericParameter : Boolean = false
   
  val GenericParameterPosition : Int = 0
   
  val ContainsGenericParameters : Boolean = false
   
  val IsByRef : Boolean = false
   
  val IsPointer : Boolean = false
   
  val IsPrimitive : Boolean = false
   
  val IsCOMObject : Boolean = false
   
  val HasElementType : Boolean = false
   
  val IsContextful : Boolean = false
   
  val IsMarshalByRef : Boolean = false
   
  val UnderlyingSystemType : System.Type = null
   
  protected def this() {}
}
object Type {
  def GetType(typeName : String, throwOnError : Boolean, ignoreCase : Boolean): System.Type  = null
   
  def GetType(typeName : String, throwOnError : Boolean): System.Type  = null
   
  def GetType(typeName : String): System.Type  = null
   
  def ReflectionOnlyGetType(typeName : String, throwIfNotFound : Boolean, ignoreCase : Boolean): System.Type  = null
   
  def GetTypeFromProgID(progID : String): System.Type  = null
   
  def GetTypeFromProgID(progID : String, throwOnError : Boolean): System.Type  = null
   
  def GetTypeFromProgID(progID : String, server : String): System.Type  = null
   
  def GetTypeFromProgID(progID : String, server : String, throwOnError : Boolean): System.Type  = null
   
  def GetTypeFromCLSID(clsid : System.Guid): System.Type  = null
   
  def GetTypeFromCLSID(clsid : System.Guid, throwOnError : Boolean): System.Type  = null
   
  def GetTypeFromCLSID(clsid : System.Guid, server : String): System.Type  = null
   
  def GetTypeFromCLSID(clsid : System.Guid, server : String, throwOnError : Boolean): System.Type  = null
   
  def GetTypeCode(`type` : System.Type): System.TypeCode  = System.TypeCode.Empty
   
  def GetTypeHandle(o : AnyRef): System.RuntimeTypeHandle  = new System.RuntimeTypeHandle()
   
  def GetTypeFromHandle(handle : System.RuntimeTypeHandle): System.Type  = null
   
  def GetTypeArray(args : Array[AnyRef]): Array[System.Type]  = Array.empty[System.Type]
   
  val FilterAttribute : System.Reflection.MemberFilter  = null
   
  val FilterName : System.Reflection.MemberFilter  = null
   
  val FilterNameIgnoreCase : System.Reflection.MemberFilter  = null
   
  val Missing : AnyRef  = null
   
  val Delimiter : Char  = '0'
   
  val EmptyTypes : Array[System.Type]  = Array.empty[System.Type]
   
  val DefaultBinder : System.Reflection.Binder = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class RuntimeArgumentHandle extends System.ValueType 
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class RuntimeTypeHandle extends System.ValueType with System.Runtime.Serialization.ISerializable {
  def GetHashCode: Int
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Equals(obj : AnyRef): Boolean
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Equals(handle : System.RuntimeTypeHandle): Boolean
   
  @System.CLSCompliantAttribute(false)
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def GetModuleHandle: System.ModuleHandle
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  val Value : System.IntPtr = new System.IntPtr()
}
object RuntimeTypeHandle {
  def ==(left : System.RuntimeTypeHandle, right : AnyRef): Boolean  = false
   
  def ==(left : AnyRef, right : System.RuntimeTypeHandle): Boolean  = false
   
  def !=(left : System.RuntimeTypeHandle, right : AnyRef): Boolean  = false
   
  def !=(left : AnyRef, right : System.RuntimeTypeHandle): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class RuntimeMethodHandle extends System.ValueType with System.Runtime.Serialization.ISerializable {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  def GetHashCode: Int
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Equals(obj : AnyRef): Boolean
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Equals(handle : System.RuntimeMethodHandle): Boolean
   
  def GetFunctionPointer: System.IntPtr
   
  val Value : System.IntPtr = new System.IntPtr()
}
object RuntimeMethodHandle {
  def ==(left : System.RuntimeMethodHandle, right : System.RuntimeMethodHandle): Boolean  = false
   
  def !=(left : System.RuntimeMethodHandle, right : System.RuntimeMethodHandle): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class RuntimeFieldHandle extends System.ValueType with System.Runtime.Serialization.ISerializable {
  def GetHashCode: Int
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Equals(obj : AnyRef): Boolean
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Equals(handle : System.RuntimeFieldHandle): Boolean
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  val Value : System.IntPtr = new System.IntPtr()
}
object RuntimeFieldHandle {
  def ==(left : System.RuntimeFieldHandle, right : System.RuntimeFieldHandle): Boolean  = false
   
  def !=(left : System.RuntimeFieldHandle, right : System.RuntimeFieldHandle): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ModuleHandle extends System.ValueType {
  def GetHashCode: Int
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Equals(obj : AnyRef): Boolean
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Equals(handle : System.ModuleHandle): Boolean
   
  def GetRuntimeTypeHandleFromMetadataToken(typeToken : Int): System.RuntimeTypeHandle
   
  def ResolveTypeHandle(typeToken : Int): System.RuntimeTypeHandle
   
  def ResolveTypeHandle(typeToken : Int, typeInstantiationContext : Array[System.RuntimeTypeHandle], 
                        methodInstantiationContext : Array[System.RuntimeTypeHandle]): System.RuntimeTypeHandle
   
  def GetRuntimeMethodHandleFromMetadataToken(methodToken : Int): System.RuntimeMethodHandle
   
  def ResolveMethodHandle(methodToken : Int): System.RuntimeMethodHandle
   
  def ResolveMethodHandle(methodToken : Int, typeInstantiationContext : Array[System.RuntimeTypeHandle], 
                          methodInstantiationContext : Array[System.RuntimeTypeHandle]): System.RuntimeMethodHandle
   
  def GetRuntimeFieldHandleFromMetadataToken(fieldToken : Int): System.RuntimeFieldHandle
   
  def ResolveFieldHandle(fieldToken : Int): System.RuntimeFieldHandle
   
  def ResolveFieldHandle(fieldToken : Int, typeInstantiationContext : Array[System.RuntimeTypeHandle], 
                         methodInstantiationContext : Array[System.RuntimeTypeHandle]): System.RuntimeFieldHandle
   
  val MDStreamVersion : Int = 0
}
object ModuleHandle {
  def ==(left : System.ModuleHandle, right : System.ModuleHandle): Boolean  = false
   
  def !=(left : System.ModuleHandle, right : System.ModuleHandle): Boolean  = false
   
  val EmptyHandle : System.ModuleHandle  = new System.ModuleHandle()
}
 
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class SByte extends System.ValueType with System.IComparable with System.IFormattable with System.IConvertible with 
                           System.IComparable[Byte] with System.IEquatable[Byte] {
  def CompareTo(obj : AnyRef): Int
   
  def CompareTo(value : Byte): Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : Byte): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def ToString(provider : System.IFormatProvider): String
   
  def ToString(format : String): String
   
  def ToString(format : String, provider : System.IFormatProvider): String
   
  def GetTypeCode: System.TypeCode
}
object SByte {
  @System.CLSCompliantAttribute(false)
  def Parse(s : String): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def Parse(s : String, style : System.Globalization.NumberStyles): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def Parse(s : String, provider : System.IFormatProvider): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def Parse(s : String, style : System.Globalization.NumberStyles, 
            provider : System.IFormatProvider): Byte  = 0
   
  @System.CLSCompliantAttribute(false)
  def TryParse(s : String, result : CLRByRef[Byte]): Boolean  = false
   
  @System.CLSCompliantAttribute(false)
  def TryParse(s : String, style : System.Globalization.NumberStyles, 
               provider : System.IFormatProvider, result : CLRByRef[Byte]): Boolean  = false
   
  val MaxValue : Byte  = 0
   
  val MinValue : Byte  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.AttributeUsageAttribute(4124 /* Inherited = false */ )
sealed class SerializableAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Single extends System.ValueType with System.IComparable with System.IFormattable with System.IConvertible with 
                            System.IComparable[Float] with System.IEquatable[Float] {
  def CompareTo(value : AnyRef): Int
   
  def CompareTo(value : Float): Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : Float): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def ToString(provider : System.IFormatProvider): String
   
  def ToString(format : String): String
   
  def ToString(format : String, provider : System.IFormatProvider): String
   
  def GetTypeCode: System.TypeCode
}
object Single {
  def IsInfinity(f : Float): Boolean  = false
   
  def IsPositiveInfinity(f : Float): Boolean  = false
   
  def IsNegativeInfinity(f : Float): Boolean  = false
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def IsNaN(f : Float): Boolean  = false
   
  def Parse(s : String): Float  = 0
   
  def Parse(s : String, style : System.Globalization.NumberStyles): Float  = 0
   
  def Parse(s : String, provider : System.IFormatProvider): Float  = 0
   
  def Parse(s : String, style : System.Globalization.NumberStyles, 
            provider : System.IFormatProvider): Float  = 0
   
  def TryParse(s : String, result : CLRByRef[Float]): Boolean  = false
   
  def TryParse(s : String, style : System.Globalization.NumberStyles, 
               provider : System.IFormatProvider, result : CLRByRef[Float]): Boolean  = false
   
  val MinValue : Float  = 0
   
  val Epsilon : Float  = 0
   
  val MaxValue : Float  = 0
   
  val PositiveInfinity : Float  = 0
   
  val NegativeInfinity : Float  = 0
   
  val NaN : Float  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class TimeoutException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class TimeSpan extends System.ValueType with System.IComparable with System.IComparable[System.TimeSpan] with 
                              System.IEquatable[System.TimeSpan] {
  def Add(ts : System.TimeSpan): System.TimeSpan
   
  def CompareTo(value : AnyRef): Int
   
  def CompareTo(value : System.TimeSpan): Int
   
  def Duration: System.TimeSpan
   
  def Equals(value : AnyRef): Boolean
   
  def Equals(obj : System.TimeSpan): Boolean
   
  def GetHashCode: Int
   
  def Negate: System.TimeSpan
   
  def Subtract(ts : System.TimeSpan): System.TimeSpan
   
  def ToString: String
   
  val Ticks : Long = 0
   
  val Days : Int = 0
   
  val Hours : Int = 0
   
  val Milliseconds : Int = 0
   
  val Minutes : Int = 0
   
  val Seconds : Int = 0
   
  val TotalDays : Double = 0
   
  val TotalHours : Double = 0
   
  val TotalMilliseconds : Double = 0
   
  val TotalMinutes : Double = 0
   
  val TotalSeconds : Double = 0
   
  def this(ticks : Long) {}
   
  def this(hours : Int, minutes : Int, seconds : Int) {}
   
  def this(days : Int, hours : Int, minutes : Int, seconds : Int) {}
   
  def this(days : Int, hours : Int, minutes : Int, seconds : Int, milliseconds : Int) {}
}
object TimeSpan {
  def Compare(t1 : System.TimeSpan, t2 : System.TimeSpan): Int  = 0
   
  def FromDays(value : Double): System.TimeSpan  = new System.TimeSpan()
   
  def Equals(t1 : System.TimeSpan, t2 : System.TimeSpan): Boolean  = false
   
  def FromHours(value : Double): System.TimeSpan  = new System.TimeSpan()
   
  def FromMilliseconds(value : Double): System.TimeSpan  = new System.TimeSpan()
   
  def FromMinutes(value : Double): System.TimeSpan  = new System.TimeSpan()
   
  def Parse(s : String): System.TimeSpan  = new System.TimeSpan()
   
  def TryParse(s : String, result : CLRByRef[System.TimeSpan]): Boolean  = false
   
  def FromSeconds(value : Double): System.TimeSpan  = new System.TimeSpan()
   
  def FromTicks(value : Long): System.TimeSpan  = new System.TimeSpan()
   
  def unary_-(t : System.TimeSpan): System.TimeSpan  = new System.TimeSpan()
   
  def -(t1 : System.TimeSpan, t2 : System.TimeSpan): System.TimeSpan  = new System.TimeSpan()
   
  def unary_+(t : System.TimeSpan): System.TimeSpan  = new System.TimeSpan()
   
  def +(t1 : System.TimeSpan, t2 : System.TimeSpan): System.TimeSpan  = new System.TimeSpan()
   
  def ==(t1 : System.TimeSpan, t2 : System.TimeSpan): Boolean  = false
   
  def !=(t1 : System.TimeSpan, t2 : System.TimeSpan): Boolean  = false
   
  def <(t1 : System.TimeSpan, t2 : System.TimeSpan): Boolean  = false
   
  def <=(t1 : System.TimeSpan, t2 : System.TimeSpan): Boolean  = false
   
  def >(t1 : System.TimeSpan, t2 : System.TimeSpan): Boolean  = false
   
  def >=(t1 : System.TimeSpan, t2 : System.TimeSpan): Boolean  = false
   
  val TicksPerMillisecond : Long  = 0
   
  val TicksPerSecond : Long  = 0
   
  val TicksPerMinute : Long  = 0
   
  val TicksPerHour : Long  = 0
   
  val TicksPerDay : Long  = 0
   
  val Zero : System.TimeSpan  = new System.TimeSpan()
   
  val MaxValue : System.TimeSpan  = new System.TimeSpan()
   
  val MinValue : System.TimeSpan  = new System.TimeSpan()
}
 
sealed abstract class TypeCode extends System.Enum {
  def ==(that: System.TypeCode): Boolean = false
  def !=(that: System.TypeCode): Boolean = false
  def  <(that: System.TypeCode): Boolean = false
  def <=(that: System.TypeCode): Boolean = false
  def  >(that: System.TypeCode): Boolean = false
  def >=(that: System.TypeCode): Boolean = false
  def  |(that: System.TypeCode): Boolean = false
  def  &(that: System.TypeCode): Boolean = false
  def  ^(that: System.TypeCode): Boolean = false
}
object TypeCode{
  val Empty	 = value(0)
  val Object	 = value(1)
  val DBNull	 = value(2)
  val Boolean	 = value(3)
  val Char	 = value(4)
  val SByte	 = value(5)
  val Byte	 = value(6)
  val Int16	 = value(7)
  val UInt16	 = value(8)
  val Int32	 = value(9)
  val UInt32	 = value(10)
  val Int64	 = value(11)
  val UInt64	 = value(12)
  val Single	 = value(13)
  val Double	 = value(14)
  val Decimal	 = value(15)
  val DateTime	 = value(16)
  val String	 = value(18)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.TypeCode = null
}
 
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class TypedReference extends System.ValueType {
  def GetHashCode: Int
   
  def Equals(o : AnyRef): Boolean
}
object TypedReference {
  @System.CLSCompliantAttribute(false)
  def MakeTypedReference(target : System.TypedReference, flds : System.TypedReference): System.TypedReference  = new System.TypedReference()
   
  def ToObject(value : System.TypedReference): AnyRef  = null
   
  def GetTargetType(value : System.TypedReference): System.Type  = null
   
  def TargetTypeToken(value : System.TypedReference): System.RuntimeTypeHandle  = new System.RuntimeTypeHandle()
   
  @System.CLSCompliantAttribute(false)
  def SetTypedReference(target : System.TypedReference, value : System.TypedReference): Unit  = {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class TypeInitializationException extends System.SystemException {
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  val TypeName : String = ""
   
  def this(fullTypeName : String, innerException : System.Exception) {}
}
 
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class UInt16 extends System.ValueType with System.IComparable with System.IFormattable with System.IConvertible with 
                            System.IComparable[UShort] with System.IEquatable[UShort] {
  def CompareTo(value : AnyRef): Int
   
  def CompareTo(value : UShort): Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : UShort): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def ToString(provider : System.IFormatProvider): String
   
  def ToString(format : String): String
   
  def ToString(format : String, provider : System.IFormatProvider): String
   
  def GetTypeCode: System.TypeCode
}
object UInt16 {
  @System.CLSCompliantAttribute(false)
  def Parse(s : String): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def Parse(s : String, style : System.Globalization.NumberStyles): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def Parse(s : String, provider : System.IFormatProvider): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def Parse(s : String, style : System.Globalization.NumberStyles, 
            provider : System.IFormatProvider): UShort  = 0
   
  @System.CLSCompliantAttribute(false)
  def TryParse(s : String, result : CLRByRef[UShort]): Boolean  = false
   
  @System.CLSCompliantAttribute(false)
  def TryParse(s : String, style : System.Globalization.NumberStyles, 
               provider : System.IFormatProvider, result : CLRByRef[UShort]): Boolean  = false
   
  val MaxValue : UShort  = 0
   
  val MinValue : UShort  = 0
}
 
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class UInt32 extends System.ValueType with System.IComparable with System.IFormattable with System.IConvertible with 
                            System.IComparable[UInt] with System.IEquatable[UInt] {
  def CompareTo(value : AnyRef): Int
   
  def CompareTo(value : UInt): Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : UInt): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def ToString(provider : System.IFormatProvider): String
   
  def ToString(format : String): String
   
  def ToString(format : String, provider : System.IFormatProvider): String
   
  def GetTypeCode: System.TypeCode
}
object UInt32 {
  @System.CLSCompliantAttribute(false)
  def Parse(s : String): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def Parse(s : String, style : System.Globalization.NumberStyles): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def Parse(s : String, provider : System.IFormatProvider): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def Parse(s : String, style : System.Globalization.NumberStyles, 
            provider : System.IFormatProvider): UInt  = 0
   
  @System.CLSCompliantAttribute(false)
  def TryParse(s : String, result : CLRByRef[UInt]): Boolean  = false
   
  @System.CLSCompliantAttribute(false)
  def TryParse(s : String, style : System.Globalization.NumberStyles, 
               provider : System.IFormatProvider, result : CLRByRef[UInt]): Boolean  = false
   
  val MaxValue : UInt  = 0
   
  val MinValue : UInt  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.CLSCompliantAttribute(false)
sealed class UInt64 extends System.ValueType with System.IComparable with System.IFormattable with System.IConvertible with 
                            System.IComparable[ULong] with System.IEquatable[ULong] {
  def CompareTo(value : AnyRef): Int
   
  def CompareTo(value : ULong): Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : ULong): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def ToString(provider : System.IFormatProvider): String
   
  def ToString(format : String): String
   
  def ToString(format : String, provider : System.IFormatProvider): String
   
  def GetTypeCode: System.TypeCode
}
object UInt64 {
  @System.CLSCompliantAttribute(false)
  def Parse(s : String): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def Parse(s : String, style : System.Globalization.NumberStyles): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def Parse(s : String, provider : System.IFormatProvider): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def Parse(s : String, style : System.Globalization.NumberStyles, 
            provider : System.IFormatProvider): ULong  = 0
   
  @System.CLSCompliantAttribute(false)
  def TryParse(s : String, result : CLRByRef[ULong]): Boolean  = false
   
  @System.CLSCompliantAttribute(false)
  def TryParse(s : String, style : System.Globalization.NumberStyles, 
               provider : System.IFormatProvider, result : CLRByRef[ULong]): Boolean  = false
   
  val MaxValue : ULong  = 0
   
  val MinValue : ULong  = 0
}
 
@System.CLSCompliantAttribute(false)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class UIntPtr extends System.ValueType with System.Runtime.Serialization.ISerializable {
  def Equals(obj : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToUInt32: UInt
   
  def ToUInt64: ULong
   
  def ToString: String
   
  def this(value : UInt) {}
   
  def this(value : ULong) {}
   
  @System.CLSCompliantAttribute(false)
  def this(value : CLRPointer[Unit]) {}
}
object UIntPtr {
  def op_Explicit(value : UInt): System.UIntPtr  = new System.UIntPtr()
   
  def op_Explicit(value : ULong): System.UIntPtr  = new System.UIntPtr()
   
  def op_Explicit(value : System.UIntPtr): UInt  = 0
   
  def op_Explicit(value : System.UIntPtr): ULong  = 0
   
  def ==(value1 : System.UIntPtr, value2 : System.UIntPtr): Boolean  = false
   
  def !=(value1 : System.UIntPtr, value2 : System.UIntPtr): Boolean  = false
   
  val Zero : System.UIntPtr  = new System.UIntPtr()
   
  val Size : Int = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class UnauthorizedAccessException extends System.SystemException {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, inner : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class UnhandledExceptionEventArgs extends System.EventArgs {
  val ExceptionObject : AnyRef = null
   
  val IsTerminating : Boolean = false
   
  def this(exception : AnyRef, isTerminating : Boolean) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class UnhandledExceptionEventHandler extends System.MulticastDelegate {
  def Invoke(sender : AnyRef, e : System.UnhandledExceptionEventArgs): Unit
   
  def BeginInvoke(sender : AnyRef, e : System.UnhandledExceptionEventArgs, 
                  callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Version extends AnyRef with System.ICloneable with System.IComparable with System.IComparable[System.Version] with 
                             System.IEquatable[System.Version] {
  def Clone: AnyRef
   
  def CompareTo(version : AnyRef): Int
   
  def CompareTo(value : System.Version): Int
   
  def Equals(obj : AnyRef): Boolean
   
  def Equals(obj : System.Version): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def ToString(fieldCount : Int): String
   
  val Major : Int = 0
   
  val Minor : Int = 0
   
  val Build : Int = 0
   
  val Revision : Int = 0
   
  val MajorRevision : Short = 0
   
  val MinorRevision : Short = 0
   
  def this(major : Int, minor : Int, build : Int, revision : Int) {}
   
  def this(major : Int, minor : Int, build : Int) {}
   
  def this(major : Int, minor : Int) {}
   
  def this(version : String) {}
   
  def this() {}
}
object Version {
  def ==(v1 : System.Version, v2 : System.Version): Boolean  = false
   
  def !=(v1 : System.Version, v2 : System.Version): Boolean  = false
   
  def <(v1 : System.Version, v2 : System.Version): Boolean  = false
   
  def <=(v1 : System.Version, v2 : System.Version): Boolean  = false
   
  def >(v1 : System.Version, v2 : System.Version): Boolean  = false
   
  def >=(v1 : System.Version, v2 : System.Version): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Void extends System.ValueType 
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class WeakReference extends AnyRef with System.Runtime.Serialization.ISerializable {
  protected def Finalize: Unit
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  val IsAlive : Boolean = false
   
  val TrackResurrection : Boolean = false
   
  var Target : AnyRef = null
   
  def this(target : AnyRef) {}
   
  def this(target : AnyRef, trackResurrection : Boolean) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
@System.AttributeUsageAttribute(256 /* Inherited = false */ )
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ThreadStaticAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(64)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class STAThreadAttribute extends System.Attribute {
  def this() {}
}
 
@System.AttributeUsageAttribute(64)
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class MTAThreadAttribute extends System.Attribute {
  def this() {}
}
 
@System.Runtime.CompilerServices.TypeDependencyAttribute("System.Collections.Generic.NullableComparer`1")
@System.Runtime.CompilerServices.TypeDependencyAttribute("System.Collections.Generic.NullableEqualityComparer`1")
sealed class Nullable[T <: System.ValueType] extends System.ValueType {
  def GetValueOrDefault: T
   
  def GetValueOrDefault(defaultValue : T): T
   
  def Equals(other : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  val HasValue : Boolean = false
   
  val Value : T = null
   
  def this(value : T) {}
}
object Nullable[T <: System.ValueType] {
  def op_Implicit(value : T): System.Nullable[T]  = null
   
  def op_Explicit(value : System.Nullable[T]): T  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract sealed class Nullable extends AnyRef 
object Nullable {
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def Compare[T <: System.ValueType](n1 : System.Nullable[T], n2 : System.Nullable[T]): Int  = 0
   
  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  def Equals[T <: System.ValueType](n1 : System.Nullable[T], n2 : System.Nullable[T]): Boolean  = false
   
  def GetUnderlyingType(nullableType : System.Type): System.Type  = null
}
 
sealed class Action[T] extends System.MulticastDelegate {
  def Invoke(obj : T): Unit
   
  def BeginInvoke(obj : T, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed class Comparison[T] extends System.MulticastDelegate {
  def Invoke(x : T, y : T): Int
   
  def BeginInvoke(x : T, y : T, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Int
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed class Converter[TInput, TOutput] extends System.MulticastDelegate {
  def Invoke(input : TInput): TOutput
   
  def BeginInvoke(input : TInput, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): TOutput
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed class Predicate[T] extends System.MulticastDelegate {
  def Invoke(obj : T): Boolean
   
  def BeginInvoke(obj : T, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Boolean
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
}