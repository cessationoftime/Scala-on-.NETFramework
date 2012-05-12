 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Collections.Generic {
 
trait IComparer[T] {
  /* abstract */ def Compare(x : T, y : T): Int
}
 
trait IEnumerator[T] extends System.IDisposable with System.Collections.IEnumerator {
  val Current : T = null
}
 
@System.Runtime.CompilerServices.TypeDependencyAttribute("System.SZArrayHelper")
trait IEnumerable[T] extends System.Collections.IEnumerable {
  /* abstract */ def GetEnumerator: System.Collections.Generic.IEnumerator[T]
}
 
trait IEqualityComparer[T] {
  /* abstract */ def Equals(x : T, y : T): Boolean
   
  /* abstract */ def GetHashCode(obj : T): Int
}
 
@System.Runtime.CompilerServices.TypeDependencyAttribute("System.Collections.Generic.GenericComparer`1")
abstract class Comparer[T] extends AnyRef with System.Collections.IComparer with System.Collections.Generic.IComparer[T] {
  /* abstract */ def Compare(x : T, y : T): Int
   
  protected def this() {}
}
object Comparer[T] {
  val Default : System.Collections.Generic.Comparer[T] = null
}
 
@System.Runtime.CompilerServices.TypeDependencyAttribute("System.SZArrayHelper")
trait ICollection[T] extends System.Collections.Generic.IEnumerable[T] with System.Collections.IEnumerable {
  /* abstract */ def Add(item : T): Unit
   
  /* abstract */ def Clear: Unit
   
  /* abstract */ def Contains(item : T): Boolean
   
  /* abstract */ def CopyTo(array : Array[T], arrayIndex : Int): Unit
   
  /* abstract */ def Remove(item : T): Boolean
   
  val Count : Int = 0
   
  val IsReadOnly : Boolean = false
}
 
@System.Reflection.DefaultMemberAttribute("Item")
trait IDictionary[TKey, TValue] extends System.Collections.Generic.ICollection[System.Collections.Generic.KeyValuePair[TKey, TValue]] with 
                                        System.Collections.Generic.IEnumerable[System.Collections.Generic.KeyValuePair[TKey, TValue]] with 
                                        System.Collections.IEnumerable {
  /* abstract */ def ContainsKey(key : TKey): Boolean
   
  /* abstract */ def Add(key : TKey, value : TValue): Unit
   
  /* abstract */ def Remove(key : TKey): Boolean
   
  /* parameterful property Item */
  /* abstract */ def Item_=(key : TKey, value : TValue): Unit
  /* abstract */ def Item(key : TKey): TValue
   
  val Keys : System.Collections.Generic.ICollection[TKey] = null
   
  val Values : System.Collections.Generic.ICollection[TValue] = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(false)
@System.Diagnostics.DebuggerDisplayAttribute("Count = {Count}")
@System.Diagnostics.DebuggerTypeProxyAttribute(typeOf[System.Type])
@System.Reflection.DefaultMemberAttribute("Item")
class Dictionary[TKey, TValue] extends AnyRef with System.Collections.Generic.IDictionary[TKey, TValue] with 
                                       System.Collections.Generic.ICollection[System.Collections.Generic.KeyValuePair[TKey, TValue]] with 
                                       System.Collections.Generic.IEnumerable[System.Collections.Generic.KeyValuePair[TKey, TValue]] with 
                                       System.Collections.IDictionary with System.Collections.ICollection with 
                                       System.Collections.IEnumerable with System.Runtime.Serialization.ISerializable with 
                                       System.Runtime.Serialization.IDeserializationCallback {
  def Add(key : TKey, value : TValue): Unit
   
  def Clear: Unit
   
  def ContainsKey(key : TKey): Boolean
   
  def ContainsValue(value : TValue): Boolean
   
  def GetEnumerator: System.Collections.Generic.Dictionary.Enumerator[TKey, TValue]
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  def OnDeserialization(sender : AnyRef): Unit
   
  def Remove(key : TKey): Boolean
   
  val Comparer : System.Collections.Generic.IEqualityComparer[TKey] = null
   
  val Count : Int = 0
   
  val Keys : System.Collections.Generic.Dictionary.KeyCollection[TKey, TValue] = null
   
  val Values : System.Collections.Generic.Dictionary.ValueCollection[TKey, TValue] = null
   
  /* parameterful property Item */
  def Item_=(key : TKey, value : TValue): Unit
  def Item(key : TKey): TValue
   
  def this() {}
   
  def this(capacity : Int) {}
   
  def this(comparer : System.Collections.Generic.IEqualityComparer[TKey]) {}
   
  def this(capacity : Int, comparer : System.Collections.Generic.IEqualityComparer[TKey]) {}
   
  def this(dictionary : System.Collections.Generic.IDictionary[TKey, TValue]) {}
   
  def this(dictionary : System.Collections.Generic.IDictionary[TKey, TValue], 
           comparer : System.Collections.Generic.IEqualityComparer[TKey]) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
object Dictionary[TKey, TValue] {
  sealed class Enumerator[TKey, TValue] extends System.ValueType with 
                                                System.Collections.Generic.IEnumerator[System.Collections.Generic.KeyValuePair[TKey, TValue]] with 
                                                System.IDisposable with System.Collections.IDictionaryEnumerator with 
                                                System.Collections.IEnumerator {
    def MoveNext: Boolean
     
    def Dispose: Unit
     
    val Current : System.Collections.Generic.KeyValuePair[TKey, TValue] = null
  }
   
  @System.Diagnostics.DebuggerTypeProxyAttribute(typeOf[System.Type])
  @System.Diagnostics.DebuggerDisplayAttribute("Count = {Count}")
  sealed class KeyCollection[TKey, TValue] extends AnyRef with System.Collections.Generic.ICollection[TKey] with 
                                                   System.Collections.Generic.IEnumerable[TKey] with System.Collections.ICollection with 
                                                   System.Collections.IEnumerable {
    def GetEnumerator: System.Collections.Generic.Dictionary.KeyCollection.Enumerator[TKey, TValue]
     
    def CopyTo(array : Array[TKey], index : Int): Unit
     
    val Count : Int = 0
     
    def this(dictionary : System.Collections.Generic.Dictionary[TKey, TValue]) {}
  }
  object KeyCollection[TKey, TValue] {
    sealed class Enumerator[TKey, TValue] extends System.ValueType with System.Collections.Generic.IEnumerator[TKey] with System.IDisposable with 
                                                  System.Collections.IEnumerator {
      def Dispose: Unit
       
      def MoveNext: Boolean
       
      val Current : TKey = null
    }
  }
   
  @System.Diagnostics.DebuggerTypeProxyAttribute(typeOf[System.Type])
  @System.Diagnostics.DebuggerDisplayAttribute("Count = {Count}")
  sealed class ValueCollection[TKey, TValue] extends AnyRef with System.Collections.Generic.ICollection[TValue] with 
                                                     System.Collections.Generic.IEnumerable[TValue] with System.Collections.ICollection with 
                                                     System.Collections.IEnumerable {
    def GetEnumerator: System.Collections.Generic.Dictionary.ValueCollection.Enumerator[TKey, TValue]
     
    def CopyTo(array : Array[TValue], index : Int): Unit
     
    val Count : Int = 0
     
    def this(dictionary : System.Collections.Generic.Dictionary[TKey, TValue]) {}
  }
  object ValueCollection[TKey, TValue] {
    sealed class Enumerator[TKey, TValue] extends System.ValueType with System.Collections.Generic.IEnumerator[TValue] with System.IDisposable with 
                                                  System.Collections.IEnumerator {
      def Dispose: Unit
       
      def MoveNext: Boolean
       
      val Current : TValue = null
    }
  }
}
 
@System.Runtime.CompilerServices.TypeDependencyAttribute("System.Collections.Generic.GenericEqualityComparer`1")
abstract class EqualityComparer[T] extends AnyRef with System.Collections.IEqualityComparer with 
                                           System.Collections.Generic.IEqualityComparer[T] {
  /* abstract */ def Equals(x : T, y : T): Boolean
   
  /* abstract */ def GetHashCode(obj : T): Int
   
  protected def this() {}
}
object EqualityComparer[T] {
  val Default : System.Collections.Generic.EqualityComparer[T] = null
}
 
@System.Reflection.DefaultMemberAttribute("Item")
@System.Runtime.CompilerServices.TypeDependencyAttribute("System.SZArrayHelper")
trait IList[T] extends System.Collections.Generic.ICollection[T] with 
                       System.Collections.Generic.IEnumerable[T] with System.Collections.IEnumerable {
  /* abstract */ def IndexOf(item : T): Int
   
  /* abstract */ def Insert(index : Int, item : T): Unit
   
  /* abstract */ def RemoveAt(index : Int): Unit
   
  /* parameterful property Item */
  /* abstract */ def Item_=(index : Int, value : T): Unit
  /* abstract */ def Item(index : Int): T
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class KeyNotFoundException extends System.SystemException with System.Runtime.Serialization.ISerializable {
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
 
sealed class KeyValuePair[TKey, TValue] extends System.ValueType {
  def ToString: String
   
  val Key : TKey = null
   
  val Value : TValue = null
   
  def this(key : TKey, value : TValue) {}
}
 
@System.Diagnostics.DebuggerDisplayAttribute("Count = {Count}")
@System.Diagnostics.DebuggerTypeProxyAttribute(typeOf[System.Type])
@System.Reflection.DefaultMemberAttribute("Item")
class List[T] extends AnyRef with System.Collections.Generic.IList[T] with 
                      System.Collections.Generic.ICollection[T] with 
                      System.Collections.Generic.IEnumerable[T] with System.Collections.IList with 
                      System.Collections.ICollection with System.Collections.IEnumerable {
  def Add(item : T): Unit
   
  def AddRange(collection : System.Collections.Generic.IEnumerable[T]): Unit
   
  def AsReadOnly: System.Collections.ObjectModel.ReadOnlyCollection[T]
   
  def BinarySearch(index : Int, count : Int, item : T, comparer : System.Collections.Generic.IComparer[T]): Int
   
  def BinarySearch(item : T): Int
   
  def BinarySearch(item : T, comparer : System.Collections.Generic.IComparer[T]): Int
   
  def Clear: Unit
   
  def Contains(item : T): Boolean
   
  def ConvertAll[TOutput](converter : System.Converter[T, TOutput]): System.Collections.Generic.List[TOutput]
   
  def CopyTo(array : Array[T]): Unit
   
  def CopyTo(index : Int, array : Array[T], arrayIndex : Int, count : Int): Unit
   
  def CopyTo(array : Array[T], arrayIndex : Int): Unit
   
  def Exists(`match` : System.Predicate[T]): Boolean
   
  def Find(`match` : System.Predicate[T]): T
   
  def FindAll(`match` : System.Predicate[T]): System.Collections.Generic.List[T]
   
  def FindIndex(`match` : System.Predicate[T]): Int
   
  def FindIndex(startIndex : Int, `match` : System.Predicate[T]): Int
   
  def FindIndex(startIndex : Int, count : Int, `match` : System.Predicate[T]): Int
   
  def FindLast(`match` : System.Predicate[T]): T
   
  def FindLastIndex(`match` : System.Predicate[T]): Int
   
  def FindLastIndex(startIndex : Int, `match` : System.Predicate[T]): Int
   
  def FindLastIndex(startIndex : Int, count : Int, `match` : System.Predicate[T]): Int
   
  def ForEach(action : System.Action[T]): Unit
   
  def GetEnumerator: System.Collections.Generic.List.Enumerator[T]
   
  def GetRange(index : Int, count : Int): System.Collections.Generic.List[T]
   
  def IndexOf(item : T): Int
   
  def IndexOf(item : T, index : Int): Int
   
  def IndexOf(item : T, index : Int, count : Int): Int
   
  def Insert(index : Int, item : T): Unit
   
  def InsertRange(index : Int, collection : System.Collections.Generic.IEnumerable[T]): Unit
   
  def LastIndexOf(item : T): Int
   
  def LastIndexOf(item : T, index : Int): Int
   
  def LastIndexOf(item : T, index : Int, count : Int): Int
   
  def Remove(item : T): Boolean
   
  def RemoveAll(`match` : System.Predicate[T]): Int
   
  def RemoveAt(index : Int): Unit
   
  def RemoveRange(index : Int, count : Int): Unit
   
  def Reverse: Unit
   
  def Reverse(index : Int, count : Int): Unit
   
  def Sort: Unit
   
  def Sort(comparer : System.Collections.Generic.IComparer[T]): Unit
   
  def Sort(index : Int, count : Int, comparer : System.Collections.Generic.IComparer[T]): Unit
   
  def Sort(comparison : System.Comparison[T]): Unit
   
  def ToArray: Array[T]
   
  def TrimExcess: Unit
   
  def TrueForAll(`match` : System.Predicate[T]): Boolean
   
  var Capacity : Int = 0
   
  val Count : Int = 0
   
  /* parameterful property Item */
  def Item_=(index : Int, value : T): Unit
  def Item(index : Int): T
   
  def this() {}
   
  def this(capacity : Int) {}
   
  def this(collection : System.Collections.Generic.IEnumerable[T]) {}
}
object List[T] {
  sealed class Enumerator[T] extends System.ValueType with System.Collections.Generic.IEnumerator[T] with System.IDisposable with 
                                     System.Collections.IEnumerator {
    def Dispose: Unit
     
    def MoveNext: Boolean
     
    val Current : T = null
  }
}
 
}