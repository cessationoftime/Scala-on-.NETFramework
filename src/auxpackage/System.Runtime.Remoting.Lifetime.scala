 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.Remoting.Lifetime {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ISponsor {
  /* abstract */ def Renewal(lease : System.Runtime.Remoting.Lifetime.ILease): System.TimeSpan
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ClientSponsor extends System.MarshalByRefObject with System.Runtime.Remoting.Lifetime.ISponsor {
  def Register(obj : System.MarshalByRefObject): Boolean
   
  def Unregister(obj : System.MarshalByRefObject): Unit
   
  def Renewal(lease : System.Runtime.Remoting.Lifetime.ILease): System.TimeSpan
   
  def Close: Unit
   
  def InitializeLifetimeService: AnyRef
   
  protected def Finalize: Unit
   
  var RenewalTime : System.TimeSpan = new System.TimeSpan()
   
  def this() {}
   
  def this(renewalTime : System.TimeSpan) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait ILease {
  /* abstract */ def Register(obj : System.Runtime.Remoting.Lifetime.ISponsor, renewalTime : System.TimeSpan): Unit
   
  /* abstract */ def Register(obj : System.Runtime.Remoting.Lifetime.ISponsor): Unit
   
  /* abstract */ def Unregister(obj : System.Runtime.Remoting.Lifetime.ISponsor): Unit
   
  /* abstract */ def Renew(renewalTime : System.TimeSpan): System.TimeSpan
   
  var RenewOnCallTime : System.TimeSpan = new System.TimeSpan()
   
  var SponsorshipTimeout : System.TimeSpan = new System.TimeSpan()
   
  var InitialLeaseTime : System.TimeSpan = new System.TimeSpan()
   
  val CurrentLeaseTime : System.TimeSpan = new System.TimeSpan()
   
  val CurrentState : System.Runtime.Remoting.Lifetime.LeaseState = System.Runtime.Remoting.Lifetime.LeaseState.Null
}
 
sealed abstract class LeaseState extends System.Enum {
  def ==(that: System.Runtime.Remoting.Lifetime.LeaseState): Boolean = false
  def !=(that: System.Runtime.Remoting.Lifetime.LeaseState): Boolean = false
  def  <(that: System.Runtime.Remoting.Lifetime.LeaseState): Boolean = false
  def <=(that: System.Runtime.Remoting.Lifetime.LeaseState): Boolean = false
  def  >(that: System.Runtime.Remoting.Lifetime.LeaseState): Boolean = false
  def >=(that: System.Runtime.Remoting.Lifetime.LeaseState): Boolean = false
  def  |(that: System.Runtime.Remoting.Lifetime.LeaseState): Boolean = false
  def  &(that: System.Runtime.Remoting.Lifetime.LeaseState): Boolean = false
  def  ^(that: System.Runtime.Remoting.Lifetime.LeaseState): Boolean = false
}
object LeaseState{
  val Null	 = value(0)
  val Initial	 = value(1)
  val Active	 = value(2)
  val Renewing	 = value(3)
  val Expired	 = value(4)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.Remoting.Lifetime.LeaseState = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class LifetimeServices extends AnyRef {
  def this() {}
}
object LifetimeServices {
  var LeaseTime : System.TimeSpan = new System.TimeSpan()
   
  var RenewOnCallTime : System.TimeSpan = new System.TimeSpan()
   
  var SponsorshipTimeout : System.TimeSpan = new System.TimeSpan()
   
  var LeaseManagerPollTime : System.TimeSpan = new System.TimeSpan()
}
 
}