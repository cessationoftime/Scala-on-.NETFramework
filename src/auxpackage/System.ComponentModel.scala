 /* assembly: System, Version=2.0.5.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\System.dll */ 
 
import auxPackage.auxiliary._
 
package System.ComponentModel {
 
class AsyncCompletedEventArgs extends System.EventArgs {
  protected def RaiseExceptionIfNecessary: Unit
   
  val Cancelled : Boolean = false
   
  val Error : System.Exception = null
   
  val UserState : AnyRef = null
   
  def this(error : System.Exception, cancelled : Boolean, userState : AnyRef) {}
}
 
sealed class AsyncCompletedEventHandler extends System.MulticastDelegate {
  def Invoke(sender : AnyRef, e : System.ComponentModel.AsyncCompletedEventArgs): Unit
   
  def BeginInvoke(sender : AnyRef, e : System.ComponentModel.AsyncCompletedEventArgs, 
                  callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
class CancelEventArgs extends System.EventArgs {
  var Cancel : Boolean = false
   
  def this() {}
   
  def this(cancel : Boolean) {}
}
 
@System.AttributeUsageAttribute(32767)
sealed class DefaultValueAttribute extends System.Attribute {
  def Equals(obj : AnyRef): Boolean
   
  def GetHashCode: Int
   
  val Value : AnyRef = null
   
  def this(value : Boolean) {}
   
  def this(value : UByte) {}
   
  def this(value : Char) {}
   
  def this(value : Double) {}
   
  def this(value : Short) {}
   
  def this(value : Int) {}
   
  def this(value : Long) {}
   
  def this(value : AnyRef) {}
   
  def this(value : Float) {}
   
  def this(value : String) {}
}
 
@System.AttributeUsageAttribute(6140)
sealed class EditorBrowsableAttribute extends System.Attribute {
  def Equals(obj : AnyRef): Boolean
   
  def GetHashCode: Int
   
  val State : System.ComponentModel.EditorBrowsableState = System.ComponentModel.EditorBrowsableState.Advanced
   
  def this(state : System.ComponentModel.EditorBrowsableState) {}
}
 
sealed abstract class EditorBrowsableState extends System.Enum {
  def ==(that: System.ComponentModel.EditorBrowsableState): Boolean = false
  def !=(that: System.ComponentModel.EditorBrowsableState): Boolean = false
  def  <(that: System.ComponentModel.EditorBrowsableState): Boolean = false
  def <=(that: System.ComponentModel.EditorBrowsableState): Boolean = false
  def  >(that: System.ComponentModel.EditorBrowsableState): Boolean = false
  def >=(that: System.ComponentModel.EditorBrowsableState): Boolean = false
  def  |(that: System.ComponentModel.EditorBrowsableState): Boolean = false
  def  &(that: System.ComponentModel.EditorBrowsableState): Boolean = false
  def  ^(that: System.ComponentModel.EditorBrowsableState): Boolean = false
}
object EditorBrowsableState{
  val Advanced	 = value(2)
  val Always	 = value(0)
  val Never	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.ComponentModel.EditorBrowsableState = null
}
 
trait IChangeTracking {
  /* abstract */ def AcceptChanges: Unit
   
  val IsChanged : Boolean = false
}
 
trait IEditableObject {
  /* abstract */ def BeginEdit: Unit
   
  /* abstract */ def CancelEdit: Unit
   
  /* abstract */ def EndEdit: Unit
}
 
trait INotifyPropertyChanged {
  /* abstract */ def add_PropertyChanged(value : System.ComponentModel.PropertyChangedEventHandler): Unit
   
  /* abstract */ def remove_PropertyChanged(value : System.ComponentModel.PropertyChangedEventHandler): Unit
   
  /* event PropertyChanged */
  /* abstract */ def add_PropertyChanged(value : System.ComponentModel.PropertyChangedEventHandler): Unit
  /* abstract */ def remove_PropertyChanged(value : System.ComponentModel.PropertyChangedEventHandler): Unit
}
 
trait IRevertibleChangeTracking extends System.ComponentModel.IChangeTracking {
  /* abstract */ def RejectChanges: Unit
}
 
class ProgressChangedEventArgs extends System.EventArgs {
  val ProgressPercentage : Int = 0
   
  val UserState : AnyRef = null
   
  def this(progressPercentage : Int, userState : AnyRef) {}
}
 
sealed class ProgressChangedEventHandler extends System.MulticastDelegate {
  def Invoke(sender : AnyRef, e : System.ComponentModel.ProgressChangedEventArgs): Unit
   
  def BeginInvoke(sender : AnyRef, e : System.ComponentModel.ProgressChangedEventArgs, 
                  callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
class PropertyChangedEventArgs extends System.EventArgs {
  val PropertyName : String = ""
   
  def this(propertyName : String) {}
}
 
sealed class PropertyChangedEventHandler extends System.MulticastDelegate {
  def Invoke(sender : AnyRef, e : System.ComponentModel.PropertyChangedEventArgs): Unit
   
  def BeginInvoke(sender : AnyRef, e : System.ComponentModel.PropertyChangedEventArgs, 
                  callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
}