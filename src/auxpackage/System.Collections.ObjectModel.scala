 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Collections.ObjectModel {
 
@System.Diagnostics.DebuggerDisplayAttribute("Count = {Count}")
@System.Runtime.InteropServices.ComVisibleAttribute(false)
@System.Reflection.DefaultMemberAttribute("Item")
@System.Diagnostics.DebuggerTypeProxyAttribute(typeOf[System.Type])
class Collection[T] extends AnyRef with System.Collections.Generic.IList[T] with 
                            System.Collections.Generic.ICollection[T] with 
                            System.Collections.Generic.IEnumerable[T] with System.Collections.IList with 
                            System.Collections.ICollection with System.Collections.IEnumerable {
  protected def get_Items: System.Collections.Generic.IList[T]
   
  def Add(item : T): Unit
   
  def Clear: Unit
   
  def CopyTo(array : Array[T], index : Int): Unit
   
  def Contains(item : T): Boolean
   
  def GetEnumerator: System.Collections.Generic.IEnumerator[T]
   
  def IndexOf(item : T): Int
   
  def Insert(index : Int, item : T): Unit
   
  def Remove(item : T): Boolean
   
  def RemoveAt(index : Int): Unit
   
  protected def ClearItems: Unit
   
  protected def InsertItem(index : Int, item : T): Unit
   
  protected def RemoveItem(index : Int): Unit
   
  protected def SetItem(index : Int, item : T): Unit
   
  val Count : Int = 0
   
  /* parameterful property Item */
  def Item_=(index : Int, value : T): Unit
  def Item(index : Int): T
   
  def this() {}
   
  def this(list : System.Collections.Generic.IList[T]) {}
}
 
@System.Diagnostics.DebuggerTypeProxyAttribute(typeOf[System.Type])
@System.Reflection.DefaultMemberAttribute("Item")
@System.Runtime.InteropServices.ComVisibleAttribute(false)
@System.Diagnostics.DebuggerDisplayAttribute("Count = {Count}")
class ReadOnlyCollection[T] extends AnyRef with System.Collections.Generic.IList[T] with 
                                    System.Collections.Generic.ICollection[T] with 
                                    System.Collections.Generic.IEnumerable[T] with System.Collections.IList with 
                                    System.Collections.ICollection with System.Collections.IEnumerable {
  def Contains(value : T): Boolean
   
  def CopyTo(array : Array[T], index : Int): Unit
   
  def GetEnumerator: System.Collections.Generic.IEnumerator[T]
   
  def IndexOf(value : T): Int
   
  protected def get_Items: System.Collections.Generic.IList[T]
   
  val Count : Int = 0
   
  /* parameterful property Item */
  def Item(index : Int): T
   
  def this(list : System.Collections.Generic.IList[T]) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(false)
@System.Diagnostics.DebuggerDisplayAttribute("Count = {Count}")
@System.Reflection.DefaultMemberAttribute("Item")
@System.Diagnostics.DebuggerTypeProxyAttribute(typeOf[System.Type])
abstract class KeyedCollection[TKey, TItem] extends System.Collections.ObjectModel.Collection[TItem] {
  def Contains(key : TKey): Boolean
   
  def Remove(key : TKey): Boolean
   
  protected def get_Dictionary: System.Collections.Generic.IDictionary[TKey, TItem]
   
  protected def ChangeItemKey(item : TItem, newKey : TKey): Unit
   
  protected def ClearItems: Unit
   
  protected /* abstract */ def GetKeyForItem(item : TItem): TKey
   
  protected def InsertItem(index : Int, item : TItem): Unit
   
  protected def RemoveItem(index : Int): Unit
   
  protected def SetItem(index : Int, item : TItem): Unit
   
  val Comparer : System.Collections.Generic.IEqualityComparer[TKey] = null
   
  /* parameterful property Item */
  def Item(key : TKey): TItem
   
  protected def this() {}
   
  protected def this(comparer : System.Collections.Generic.IEqualityComparer[TKey]) {}
   
  protected def this(comparer : System.Collections.Generic.IEqualityComparer[TKey], 
                     dictionaryCreationThreshold : Int) {}
}
 
}