 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Collections {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("496B0ABE-CDEE-11d3-88E8-00902754C43A")
trait IEnumerable {
  @System.Runtime.InteropServices.DispIdAttribute(-4)
  /* abstract */ def GetEnumerator: System.Collections.IEnumerator
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ICollection extends System.Collections.IEnumerable {
  /* abstract */ def CopyTo(array : System.Array, index : Int): Unit
   
  val Count : Int = 0
   
  val SyncRoot : AnyRef = null
   
  val IsSynchronized : Boolean = false
}
 
@System.Reflection.DefaultMemberAttribute("Item")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IList extends System.Collections.ICollection with System.Collections.IEnumerable {
  /* abstract */ def Add(value : AnyRef): Int
   
  /* abstract */ def Contains(value : AnyRef): Boolean
   
  /* abstract */ def Clear: Unit
   
  /* abstract */ def IndexOf(value : AnyRef): Int
   
  /* abstract */ def Insert(index : Int, value : AnyRef): Unit
   
  /* abstract */ def Remove(value : AnyRef): Unit
   
  /* abstract */ def RemoveAt(index : Int): Unit
   
  /* parameterful property Item */
  /* abstract */ def Item_=(index : Int, value : AnyRef): Unit
  /* abstract */ def Item(index : Int): AnyRef
   
  val IsReadOnly : Boolean = false
   
  val IsFixedSize : Boolean = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Runtime.InteropServices.GuidAttribute("496B0ABF-CDEE-11d3-88E8-00902754C43A")
trait IEnumerator {
  /* abstract */ def MoveNext: Boolean
   
  /* abstract */ def Reset: Unit
   
  val Current : AnyRef = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IComparer {
  /* abstract */ def Compare(x : AnyRef, y : AnyRef): Int
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IEqualityComparer {
  /* abstract */ def Equals(x : AnyRef, y : AnyRef): Boolean
   
  /* abstract */ def GetHashCode(obj : AnyRef): Int
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Diagnostics.DebuggerDisplayAttribute("Count = {Count}")
@System.Diagnostics.DebuggerTypeProxyAttribute(typeOf[System.Type])
@System.Reflection.DefaultMemberAttribute("Item")
class ArrayList extends AnyRef with System.Collections.IList with System.Collections.ICollection with 
                        System.Collections.IEnumerable with System.ICloneable {
  def Add(value : AnyRef): Int
   
  def AddRange(c : System.Collections.ICollection): Unit
   
  def BinarySearch(index : Int, count : Int, value : AnyRef, comparer : System.Collections.IComparer): Int
   
  def BinarySearch(value : AnyRef): Int
   
  def BinarySearch(value : AnyRef, comparer : System.Collections.IComparer): Int
   
  def Clear: Unit
   
  def Clone: AnyRef
   
  def Contains(item : AnyRef): Boolean
   
  def CopyTo(array : System.Array): Unit
   
  def CopyTo(array : System.Array, arrayIndex : Int): Unit
   
  def CopyTo(index : Int, array : System.Array, arrayIndex : Int, count : Int): Unit
   
  def GetEnumerator: System.Collections.IEnumerator
   
  def GetEnumerator(index : Int, count : Int): System.Collections.IEnumerator
   
  def IndexOf(value : AnyRef): Int
   
  def IndexOf(value : AnyRef, startIndex : Int): Int
   
  def IndexOf(value : AnyRef, startIndex : Int, count : Int): Int
   
  def Insert(index : Int, value : AnyRef): Unit
   
  def InsertRange(index : Int, c : System.Collections.ICollection): Unit
   
  def LastIndexOf(value : AnyRef): Int
   
  def LastIndexOf(value : AnyRef, startIndex : Int): Int
   
  def LastIndexOf(value : AnyRef, startIndex : Int, count : Int): Int
   
  def Remove(obj : AnyRef): Unit
   
  def RemoveAt(index : Int): Unit
   
  def RemoveRange(index : Int, count : Int): Unit
   
  def Reverse: Unit
   
  def Reverse(index : Int, count : Int): Unit
   
  def SetRange(index : Int, c : System.Collections.ICollection): Unit
   
  def GetRange(index : Int, count : Int): System.Collections.ArrayList
   
  def Sort: Unit
   
  def Sort(comparer : System.Collections.IComparer): Unit
   
  def Sort(index : Int, count : Int, comparer : System.Collections.IComparer): Unit
   
  def ToArray: Array[AnyRef]
   
  def ToArray(`type` : System.Type): System.Array
   
  def TrimToSize: Unit
   
  var Capacity : Int = 0
   
  val Count : Int = 0
   
  val IsFixedSize : Boolean = false
   
  val IsReadOnly : Boolean = false
   
  val IsSynchronized : Boolean = false
   
  val SyncRoot : AnyRef = null
   
  /* parameterful property Item */
  def Item_=(index : Int, value : AnyRef): Unit
  def Item(index : Int): AnyRef
   
  def this() {}
   
  def this(capacity : Int) {}
   
  def this(c : System.Collections.ICollection) {}
}
object ArrayList {
  def Adapter(list : System.Collections.IList): System.Collections.ArrayList  = null
   
  def FixedSize(list : System.Collections.IList): System.Collections.IList  = null
   
  def FixedSize(list : System.Collections.ArrayList): System.Collections.ArrayList  = null
   
  def ReadOnly(list : System.Collections.IList): System.Collections.IList  = null
   
  def ReadOnly(list : System.Collections.ArrayList): System.Collections.ArrayList  = null
   
  def Repeat(value : AnyRef, count : Int): System.Collections.ArrayList  = null
   
  def Synchronized(list : System.Collections.IList): System.Collections.IList  = null
   
  def Synchronized(list : System.Collections.ArrayList): System.Collections.ArrayList  = null
}
 
@System.Reflection.DefaultMemberAttribute("Item")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class BitArray extends AnyRef with System.Collections.ICollection with System.Collections.IEnumerable with 
                              System.ICloneable {
  def Get(index : Int): Boolean
   
  def Set(index : Int, value : Boolean): Unit
   
  def SetAll(value : Boolean): Unit
   
  def And(value : System.Collections.BitArray): System.Collections.BitArray
   
  def Or(value : System.Collections.BitArray): System.Collections.BitArray
   
  def Xor(value : System.Collections.BitArray): System.Collections.BitArray
   
  def Not: System.Collections.BitArray
   
  def CopyTo(array : System.Array, index : Int): Unit
   
  def Clone: AnyRef
   
  def GetEnumerator: System.Collections.IEnumerator
   
  /* parameterful property Item */
  def Item_=(index : Int, value : Boolean): Unit
  def Item(index : Int): Boolean
   
  var Length : Int = 0
   
  val Count : Int = 0
   
  val SyncRoot : AnyRef = null
   
  val IsReadOnly : Boolean = false
   
  val IsSynchronized : Boolean = false
   
  def this(length : Int) {}
   
  def this(length : Int, defaultValue : Boolean) {}
   
  def this(bytes : Array[UByte]) {}
   
  def this(values : Array[Boolean]) {}
   
  def this(values : Array[Int]) {}
   
  def this(bits : System.Collections.BitArray) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class CaseInsensitiveComparer extends AnyRef with System.Collections.IComparer {
  def Compare(a : AnyRef, b : AnyRef): Int
   
  def this() {}
   
  def this(culture : System.Globalization.CultureInfo) {}
}
object CaseInsensitiveComparer {
  val Default : System.Collections.CaseInsensitiveComparer = null
   
  val DefaultInvariant : System.Collections.CaseInsensitiveComparer = null
}
 
@System.ObsoleteAttribute("Please use IEqualityComparer instead.")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IHashCodeProvider {
  /* abstract */ def GetHashCode(obj : AnyRef): Int
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.ObsoleteAttribute("Please use StringComparer instead.")
class CaseInsensitiveHashCodeProvider extends AnyRef with System.Collections.IHashCodeProvider {
  def GetHashCode(obj : AnyRef): Int
   
  def this() {}
   
  def this(culture : System.Globalization.CultureInfo) {}
}
object CaseInsensitiveHashCodeProvider {
  val Default : System.Collections.CaseInsensitiveHashCodeProvider = null
   
  val DefaultInvariant : System.Collections.CaseInsensitiveHashCodeProvider = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class CollectionBase extends AnyRef with System.Collections.IList with System.Collections.ICollection with 
                                      System.Collections.IEnumerable {
  protected def get_InnerList: System.Collections.ArrayList
   
  protected def get_List: System.Collections.IList
   
  def Clear: Unit
   
  def RemoveAt(index : Int): Unit
   
  def GetEnumerator: System.Collections.IEnumerator
   
  protected def OnSet(index : Int, oldValue : AnyRef, newValue : AnyRef): Unit
   
  protected def OnInsert(index : Int, value : AnyRef): Unit
   
  protected def OnClear: Unit
   
  protected def OnRemove(index : Int, value : AnyRef): Unit
   
  protected def OnValidate(value : AnyRef): Unit
   
  protected def OnSetComplete(index : Int, oldValue : AnyRef, newValue : AnyRef): Unit
   
  protected def OnInsertComplete(index : Int, value : AnyRef): Unit
   
  protected def OnClearComplete: Unit
   
  protected def OnRemoveComplete(index : Int, value : AnyRef): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var Capacity : Int = 0
   
  val Count : Int = 0
   
  protected def this() {}
   
  protected def this(capacity : Int) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class Comparer extends AnyRef with System.Collections.IComparer with System.Runtime.Serialization.ISerializable {
  def Compare(a : AnyRef, b : AnyRef): Int
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  def this(culture : System.Globalization.CultureInfo) {}
}
object Comparer {
  val Default : System.Collections.Comparer  = null
   
  val DefaultInvariant : System.Collections.Comparer  = null
}
 
@System.Reflection.DefaultMemberAttribute("Item")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IDictionary extends System.Collections.ICollection with System.Collections.IEnumerable {
  /* abstract */ def Contains(key : AnyRef): Boolean
   
  /* abstract */ def Add(key : AnyRef, value : AnyRef): Unit
   
  /* abstract */ def Clear: Unit
   
  /* abstract */ def GetEnumerator: System.Collections.IDictionaryEnumerator
   
  /* abstract */ def Remove(key : AnyRef): Unit
   
  /* parameterful property Item */
  /* abstract */ def Item_=(key : AnyRef, value : AnyRef): Unit
  /* abstract */ def Item(key : AnyRef): AnyRef
   
  val Keys : System.Collections.ICollection = null
   
  val Values : System.Collections.ICollection = null
   
  val IsReadOnly : Boolean = false
   
  val IsFixedSize : Boolean = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class DictionaryBase extends AnyRef with System.Collections.IDictionary with System.Collections.ICollection with 
                                      System.Collections.IEnumerable {
  protected def get_InnerHashtable: System.Collections.Hashtable
   
  protected def get_Dictionary: System.Collections.IDictionary
   
  def CopyTo(array : System.Array, index : Int): Unit
   
  def Clear: Unit
   
  def GetEnumerator: System.Collections.IDictionaryEnumerator
   
  protected def OnGet(key : AnyRef, currentValue : AnyRef): AnyRef
   
  protected def OnSet(key : AnyRef, oldValue : AnyRef, newValue : AnyRef): Unit
   
  protected def OnInsert(key : AnyRef, value : AnyRef): Unit
   
  protected def OnClear: Unit
   
  protected def OnRemove(key : AnyRef, value : AnyRef): Unit
   
  protected def OnValidate(key : AnyRef, value : AnyRef): Unit
   
  protected def OnSetComplete(key : AnyRef, oldValue : AnyRef, newValue : AnyRef): Unit
   
  protected def OnInsertComplete(key : AnyRef, value : AnyRef): Unit
   
  protected def OnClearComplete: Unit
   
  protected def OnRemoveComplete(key : AnyRef, value : AnyRef): Unit
   
  val Count : Int = 0
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class DictionaryEntry extends System.ValueType {
  var Key : AnyRef = null
   
  var Value : AnyRef = null
   
  def this(key : AnyRef, value : AnyRef) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IDictionaryEnumerator extends System.Collections.IEnumerator {
  val Key : AnyRef = null
   
  val Value : AnyRef = null
   
  val Entry : System.Collections.DictionaryEntry = new System.Collections.DictionaryEntry()
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Diagnostics.DebuggerDisplayAttribute("Count = {Count}")
@System.Diagnostics.DebuggerTypeProxyAttribute(typeOf[System.Type])
@System.Reflection.DefaultMemberAttribute("Item")
class Hashtable extends AnyRef with System.Collections.IDictionary with System.Collections.ICollection with 
                        System.Collections.IEnumerable with System.Runtime.Serialization.ISerializable with 
                        System.Runtime.Serialization.IDeserializationCallback with System.ICloneable {
  protected def get_hcp: System.Collections.IHashCodeProvider
   
  protected def set_hcp(value : System.Collections.IHashCodeProvider): Unit
   
  protected def get_comparer: System.Collections.IComparer
   
  protected def set_comparer(value : System.Collections.IComparer): Unit
   
  protected def get_EqualityComparer: System.Collections.IEqualityComparer
   
  def Add(key : AnyRef, value : AnyRef): Unit
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.Success)
  def Clear: Unit
   
  def Clone: AnyRef
   
  def Contains(key : AnyRef): Boolean
   
  def ContainsKey(key : AnyRef): Boolean
   
  def ContainsValue(value : AnyRef): Boolean
   
  def CopyTo(array : System.Array, arrayIndex : Int): Unit
   
  def GetEnumerator: System.Collections.IDictionaryEnumerator
   
  protected def GetHash(key : AnyRef): Int
   
  protected def KeyEquals(item : AnyRef, key : AnyRef): Boolean
   
  @System.Runtime.ConstrainedExecution.ReliabilityContractAttribute(System.Runtime.ConstrainedExecution.Consistency.WillNotCorruptState, System.Runtime.ConstrainedExecution.Cer.MayFail)
  def Remove(key : AnyRef): Unit
   
  def GetObjectData(info : System.Runtime.Serialization.SerializationInfo, 
                    context : System.Runtime.Serialization.StreamingContext): Unit
   
  def OnDeserialization(sender : AnyRef): Unit
   
  /* parameterful property Item */
  def Item_=(key : AnyRef, value : AnyRef): Unit
  def Item(key : AnyRef): AnyRef
   
  val IsReadOnly : Boolean = false
   
  val IsFixedSize : Boolean = false
   
  val IsSynchronized : Boolean = false
   
  val Keys : System.Collections.ICollection = null
   
  val Values : System.Collections.ICollection = null
   
  val SyncRoot : AnyRef = null
   
  val Count : Int = 0
   
  def this() {}
   
  def this(capacity : Int) {}
   
  def this(capacity : Int, loadFactor : Float) {}
   
  @System.ObsoleteAttribute("Please use Hashtable(int, float, IEqualityComparer) instead.")
  def this(capacity : Int, loadFactor : Float, hcp : System.Collections.IHashCodeProvider, 
           comparer : System.Collections.IComparer) {}
   
  def this(capacity : Int, loadFactor : Float, 
           equalityComparer : System.Collections.IEqualityComparer) {}
   
  @System.ObsoleteAttribute("Please use Hashtable(IEqualityComparer) instead.")
  def this(hcp : System.Collections.IHashCodeProvider, 
           comparer : System.Collections.IComparer) {}
   
  def this(equalityComparer : System.Collections.IEqualityComparer) {}
   
  @System.ObsoleteAttribute("Please use Hashtable(int, IEqualityComparer) instead.")
  def this(capacity : Int, hcp : System.Collections.IHashCodeProvider, 
           comparer : System.Collections.IComparer) {}
   
  def this(capacity : Int, equalityComparer : System.Collections.IEqualityComparer) {}
   
  def this(d : System.Collections.IDictionary) {}
   
  def this(d : System.Collections.IDictionary, loadFactor : Float) {}
   
  @System.ObsoleteAttribute("Please use Hashtable(IDictionary, IEqualityComparer) instead.")
  def this(d : System.Collections.IDictionary, hcp : System.Collections.IHashCodeProvider, 
           comparer : System.Collections.IComparer) {}
   
  def this(d : System.Collections.IDictionary, 
           equalityComparer : System.Collections.IEqualityComparer) {}
   
  @System.ObsoleteAttribute("Please use Hashtable(IDictionary, float, IEqualityComparer) instead.")
  def this(d : System.Collections.IDictionary, loadFactor : Float, 
           hcp : System.Collections.IHashCodeProvider, 
           comparer : System.Collections.IComparer) {}
   
  def this(d : System.Collections.IDictionary, loadFactor : Float, 
           equalityComparer : System.Collections.IEqualityComparer) {}
   
  protected def this(info : System.Runtime.Serialization.SerializationInfo, 
                     context : System.Runtime.Serialization.StreamingContext) {}
}
object Hashtable {
  def Synchronized(table : System.Collections.Hashtable): System.Collections.Hashtable  = null
}
 
@System.Diagnostics.DebuggerDisplayAttribute("Count = {Count}")
@System.Diagnostics.DebuggerTypeProxyAttribute(typeOf[System.Type])
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class Queue extends AnyRef with System.Collections.ICollection with System.Collections.IEnumerable with 
                    System.ICloneable {
  def Clone: AnyRef
   
  def Clear: Unit
   
  def CopyTo(array : System.Array, index : Int): Unit
   
  def Enqueue(obj : AnyRef): Unit
   
  def GetEnumerator: System.Collections.IEnumerator
   
  def Dequeue: AnyRef
   
  def Peek: AnyRef
   
  def Contains(obj : AnyRef): Boolean
   
  def ToArray: Array[AnyRef]
   
  def TrimToSize: Unit
   
  val Count : Int = 0
   
  val IsSynchronized : Boolean = false
   
  val SyncRoot : AnyRef = null
   
  def this() {}
   
  def this(capacity : Int) {}
   
  def this(capacity : Int, growFactor : Float) {}
   
  def this(col : System.Collections.ICollection) {}
}
object Queue {
  def Synchronized(queue : System.Collections.Queue): System.Collections.Queue  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class ReadOnlyCollectionBase extends AnyRef with System.Collections.ICollection with System.Collections.IEnumerable {
  protected def get_InnerList: System.Collections.ArrayList
   
  def GetEnumerator: System.Collections.IEnumerator
   
  val Count : Int = 0
   
  protected def this() {}
}
 
@System.Reflection.DefaultMemberAttribute("Item")
@System.Diagnostics.DebuggerTypeProxyAttribute(typeOf[System.Type])
@System.Diagnostics.DebuggerDisplayAttribute("Count = {Count}")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SortedList extends AnyRef with System.Collections.IDictionary with System.Collections.ICollection with 
                         System.Collections.IEnumerable with System.ICloneable {
  def Add(key : AnyRef, value : AnyRef): Unit
   
  def Clear: Unit
   
  def Clone: AnyRef
   
  def Contains(key : AnyRef): Boolean
   
  def ContainsKey(key : AnyRef): Boolean
   
  def ContainsValue(value : AnyRef): Boolean
   
  def CopyTo(array : System.Array, arrayIndex : Int): Unit
   
  def GetByIndex(index : Int): AnyRef
   
  def GetEnumerator: System.Collections.IDictionaryEnumerator
   
  def GetKey(index : Int): AnyRef
   
  def GetKeyList: System.Collections.IList
   
  def GetValueList: System.Collections.IList
   
  def IndexOfKey(key : AnyRef): Int
   
  def IndexOfValue(value : AnyRef): Int
   
  def RemoveAt(index : Int): Unit
   
  def Remove(key : AnyRef): Unit
   
  def SetByIndex(index : Int, value : AnyRef): Unit
   
  def TrimToSize: Unit
   
  var Capacity : Int = 0
   
  val Count : Int = 0
   
  val Keys : System.Collections.ICollection = null
   
  val Values : System.Collections.ICollection = null
   
  val IsReadOnly : Boolean = false
   
  val IsFixedSize : Boolean = false
   
  val IsSynchronized : Boolean = false
   
  val SyncRoot : AnyRef = null
   
  /* parameterful property Item */
  def Item_=(key : AnyRef, value : AnyRef): Unit
  def Item(key : AnyRef): AnyRef
   
  def this() {}
   
  def this(initialCapacity : Int) {}
   
  def this(comparer : System.Collections.IComparer) {}
   
  def this(comparer : System.Collections.IComparer, capacity : Int) {}
   
  def this(d : System.Collections.IDictionary) {}
   
  def this(d : System.Collections.IDictionary, comparer : System.Collections.IComparer) {}
}
object SortedList {
  def Synchronized(list : System.Collections.SortedList): System.Collections.SortedList  = null
}
 
@System.Diagnostics.DebuggerTypeProxyAttribute(typeOf[System.Type])
@System.Diagnostics.DebuggerDisplayAttribute("Count = {Count}")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class Stack extends AnyRef with System.Collections.ICollection with System.Collections.IEnumerable with 
                    System.ICloneable {
  def Clear: Unit
   
  def Clone: AnyRef
   
  def Contains(obj : AnyRef): Boolean
   
  def CopyTo(array : System.Array, index : Int): Unit
   
  def GetEnumerator: System.Collections.IEnumerator
   
  def Peek: AnyRef
   
  def Pop: AnyRef
   
  def Push(obj : AnyRef): Unit
   
  def ToArray: Array[AnyRef]
   
  val Count : Int = 0
   
  val IsSynchronized : Boolean = false
   
  val SyncRoot : AnyRef = null
   
  def this() {}
   
  def this(initialCapacity : Int) {}
   
  def this(col : System.Collections.ICollection) {}
}
object Stack {
  def Synchronized(stack : System.Collections.Stack): System.Collections.Stack  = null
}
 
}