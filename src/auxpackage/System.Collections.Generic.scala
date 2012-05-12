 /* assembly: System, Version=2.0.5.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\System.dll */ 
 
import auxPackage.auxiliary._
 
package System.Collections.Generic {
 
class LinkedList[T] extends AnyRef with System.Collections.Generic.ICollection[T] with 
                            System.Collections.Generic.IEnumerable[T] with System.Collections.ICollection with 
                            System.Collections.IEnumerable {
  def AddAfter(node : System.Collections.Generic.LinkedListNode[T], value : T): System.Collections.Generic.LinkedListNode[T]
   
  def AddAfter(node : System.Collections.Generic.LinkedListNode[T], 
               newNode : System.Collections.Generic.LinkedListNode[T]): Unit
   
  def AddBefore(node : System.Collections.Generic.LinkedListNode[T], value : T): System.Collections.Generic.LinkedListNode[T]
   
  def AddBefore(node : System.Collections.Generic.LinkedListNode[T], 
                newNode : System.Collections.Generic.LinkedListNode[T]): Unit
   
  def AddFirst(value : T): System.Collections.Generic.LinkedListNode[T]
   
  def AddFirst(node : System.Collections.Generic.LinkedListNode[T]): Unit
   
  def AddLast(value : T): System.Collections.Generic.LinkedListNode[T]
   
  def AddLast(node : System.Collections.Generic.LinkedListNode[T]): Unit
   
  def Clear: Unit
   
  def Contains(value : T): Boolean
   
  def CopyTo(array : Array[T], index : Int): Unit
   
  def Find(value : T): System.Collections.Generic.LinkedListNode[T]
   
  def FindLast(value : T): System.Collections.Generic.LinkedListNode[T]
   
  def GetEnumerator: System.Collections.Generic.LinkedList.Enumerator[T]
   
  def Remove(value : T): Boolean
   
  def Remove(node : System.Collections.Generic.LinkedListNode[T]): Unit
   
  def RemoveFirst: Unit
   
  def RemoveLast: Unit
   
  val Count : Int = 0
   
  val First : System.Collections.Generic.LinkedListNode[T] = null
   
  val Last : System.Collections.Generic.LinkedListNode[T] = null
   
  def this() {}
   
  def this(collection : System.Collections.Generic.IEnumerable[T]) {}
}
object LinkedList[T] {
  sealed class Enumerator[T] extends System.ValueType with System.Collections.Generic.IEnumerator[T] with 
                                     System.Collections.IEnumerator with System.IDisposable {
    def Dispose: Unit
     
    def MoveNext: Boolean
     
    val Current : T = null
  }
}
 
sealed class LinkedListNode[T] extends AnyRef {
  val List : System.Collections.Generic.LinkedList[T] = null
   
  val Next : System.Collections.Generic.LinkedListNode[T] = null
   
  val Previous : System.Collections.Generic.LinkedListNode[T] = null
   
  var Value : T = null
   
  def this(value : T) {}
}
 
class Queue[T] extends AnyRef with System.Collections.Generic.IEnumerable[T] with System.Collections.ICollection with 
                       System.Collections.IEnumerable {
  def Clear: Unit
   
  def Contains(item : T): Boolean
   
  def CopyTo(array : Array[T], arrayIndex : Int): Unit
   
  def Dequeue: T
   
  def Enqueue(item : T): Unit
   
  def GetEnumerator: System.Collections.Generic.Queue.Enumerator[T]
   
  def Peek: T
   
  def ToArray: Array[T]
   
  def TrimExcess: Unit
   
  val Count : Int = 0
   
  def this() {}
   
  def this(collection : System.Collections.Generic.IEnumerable[T]) {}
   
  def this(capacity : Int) {}
}
object Queue[T] {
  sealed class Enumerator[T] extends System.ValueType with System.Collections.Generic.IEnumerator[T] with 
                                     System.Collections.IEnumerator with System.IDisposable {
    def Dispose: Unit
     
    def MoveNext: Boolean
     
    val Current : T = null
  }
}
 
class Stack[T] extends AnyRef with System.Collections.Generic.IEnumerable[T] with System.Collections.ICollection with 
                       System.Collections.IEnumerable {
  def Clear: Unit
   
  def Contains(item : T): Boolean
   
  def CopyTo(array : Array[T], arrayIndex : Int): Unit
   
  def GetEnumerator: System.Collections.Generic.Stack.Enumerator[T]
   
  def Peek: T
   
  def Pop: T
   
  def Push(item : T): Unit
   
  def ToArray: Array[T]
   
  def TrimExcess: Unit
   
  val Count : Int = 0
   
  def this() {}
   
  def this(collection : System.Collections.Generic.IEnumerable[T]) {}
   
  def this(capacity : Int) {}
}
object Stack[T] {
  sealed class Enumerator[T] extends System.ValueType with System.Collections.Generic.IEnumerator[T] with 
                                     System.Collections.IEnumerator with System.IDisposable {
    def Dispose: Unit
     
    def MoveNext: Boolean
     
    val Current : T = null
  }
}
 
}