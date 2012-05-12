 /* assembly: System.Core, Version=2.0.5.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\System.Core.dll */ 
 
import auxPackage.auxiliary._
 
package System {
 
sealed class Action extends System.MulticastDelegate {
  def Invoke: Unit
   
  def BeginInvoke(callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed class Action[T1, T2] extends System.MulticastDelegate {
  def Invoke(arg1 : T1, arg2 : T2): Unit
   
  def BeginInvoke(arg1 : T1, arg2 : T2, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed class Action[T1, T2, T3] extends System.MulticastDelegate {
  def Invoke(arg1 : T1, arg2 : T2, arg3 : T3): Unit
   
  def BeginInvoke(arg1 : T1, arg2 : T2, arg3 : T3, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed class Action[T1, T2, T3, T4] extends System.MulticastDelegate {
  def Invoke(arg1 : T1, arg2 : T2, arg3 : T3, arg4 : T4): Unit
   
  def BeginInvoke(arg1 : T1, arg2 : T2, arg3 : T3, arg4 : T4, callback : System.AsyncCallback, 
                  `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): Unit
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed class Func[TResult] extends System.MulticastDelegate {
  def Invoke: TResult
   
  def BeginInvoke(callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): TResult
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed class Func[T, TResult] extends System.MulticastDelegate {
  def Invoke(arg : T): TResult
   
  def BeginInvoke(arg : T, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): TResult
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed class Func[T1, T2, TResult] extends System.MulticastDelegate {
  def Invoke(arg1 : T1, arg2 : T2): TResult
   
  def BeginInvoke(arg1 : T1, arg2 : T2, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): TResult
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed class Func[T1, T2, T3, TResult] extends System.MulticastDelegate {
  def Invoke(arg1 : T1, arg2 : T2, arg3 : T3): TResult
   
  def BeginInvoke(arg1 : T1, arg2 : T2, arg3 : T3, callback : System.AsyncCallback, `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): TResult
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
sealed class Func[T1, T2, T3, T4, TResult] extends System.MulticastDelegate {
  def Invoke(arg1 : T1, arg2 : T2, arg3 : T3, arg4 : T4): TResult
   
  def BeginInvoke(arg1 : T1, arg2 : T2, arg3 : T3, arg4 : T4, callback : System.AsyncCallback, 
                  `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): TResult
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
class Lazy[T] extends AnyRef {
  def ToString: String
   
  val IsValueCreated : Boolean = false
   
  val Value : T = null
   
  def this() {}
   
  def this(isThreadSafe : Boolean) {}
   
  def this(valueFactory : System.Func[T]) {}
   
  def this(valueFactory : System.Func[T], isThreadSafe : Boolean) {}
   
  def this(valueFactory : System.Func[T], mode : System.Threading.LazyThreadSafetyMode) {}
   
  def this(mode : System.Threading.LazyThreadSafetyMode) {}
}
 
}