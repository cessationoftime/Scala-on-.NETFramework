 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.Remoting.Channels {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class ChannelServices extends AnyRef 
object ChannelServices {
  def RegisterChannel(chnl : System.Runtime.Remoting.Channels.IChannel, ensureSecurity : Boolean): Unit  = {}
   
  @System.ObsoleteAttribute("Use System.Runtime.Remoting.ChannelServices.RegisterChannel(IChannel chnl, bool ensureSecurity) instead.", false)
  def RegisterChannel(chnl : System.Runtime.Remoting.Channels.IChannel): Unit  = {}
   
  def UnregisterChannel(chnl : System.Runtime.Remoting.Channels.IChannel): Unit  = {}
   
  def GetChannel(name : String): System.Runtime.Remoting.Channels.IChannel  = null
   
  def GetUrlsForObject(obj : System.MarshalByRefObject): Array[String]  = Array.empty[String]
   
  def GetChannelSinkProperties(obj : AnyRef): System.Collections.IDictionary  = null
   
  def SyncDispatchMessage(msg : System.Runtime.Remoting.Messaging.IMessage): System.Runtime.Remoting.Messaging.IMessage  = null
   
  def AsyncDispatchMessage(msg : System.Runtime.Remoting.Messaging.IMessage, 
                           replySink : System.Runtime.Remoting.Messaging.IMessageSink): System.Runtime.Remoting.Messaging.IMessageCtrl  = null
   
  def CreateServerChannelSinkChain(provider : System.Runtime.Remoting.Channels.IServerChannelSinkProvider, 
                                   channel : System.Runtime.Remoting.Channels.IChannelReceiver): System.Runtime.Remoting.Channels.IServerChannelSink  = null
   
  val RegisteredChannels : Array[System.Runtime.Remoting.Channels.IChannel] = Array.empty[System.Runtime.Remoting.Channels.IChannel]
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IClientResponseChannelSinkStack {
  /* abstract */ def AsyncProcessResponse(headers : System.Runtime.Remoting.Channels.ITransportHeaders, 
                                          stream : System.IO.Stream): Unit
   
  /* abstract */ def DispatchReplyMessage(msg : System.Runtime.Remoting.Messaging.IMessage): Unit
   
  /* abstract */ def DispatchException(e : System.Exception): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IClientChannelSinkStack extends System.Runtime.Remoting.Channels.IClientResponseChannelSinkStack {
  /* abstract */ def Push(sink : System.Runtime.Remoting.Channels.IClientChannelSink, state : AnyRef): Unit
   
  /* abstract */ def Pop(sink : System.Runtime.Remoting.Channels.IClientChannelSink): AnyRef
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ClientChannelSinkStack extends AnyRef with System.Runtime.Remoting.Channels.IClientChannelSinkStack with 
                                     System.Runtime.Remoting.Channels.IClientResponseChannelSinkStack {
  def Push(sink : System.Runtime.Remoting.Channels.IClientChannelSink, state : AnyRef): Unit
   
  def Pop(sink : System.Runtime.Remoting.Channels.IClientChannelSink): AnyRef
   
  def AsyncProcessResponse(headers : System.Runtime.Remoting.Channels.ITransportHeaders, 
                           stream : System.IO.Stream): Unit
   
  def DispatchReplyMessage(msg : System.Runtime.Remoting.Messaging.IMessage): Unit
   
  def DispatchException(e : System.Exception): Unit
   
  def this() {}
   
  def this(replySink : System.Runtime.Remoting.Messaging.IMessageSink) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IServerResponseChannelSinkStack {
  /* abstract */ def AsyncProcessResponse(msg : System.Runtime.Remoting.Messaging.IMessage, 
                                          headers : System.Runtime.Remoting.Channels.ITransportHeaders, 
                                          stream : System.IO.Stream): Unit
   
  /* abstract */ def GetResponseStream(msg : System.Runtime.Remoting.Messaging.IMessage, 
                                       headers : System.Runtime.Remoting.Channels.ITransportHeaders): System.IO.Stream
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IServerChannelSinkStack extends System.Runtime.Remoting.Channels.IServerResponseChannelSinkStack {
  /* abstract */ def Push(sink : System.Runtime.Remoting.Channels.IServerChannelSink, state : AnyRef): Unit
   
  /* abstract */ def Pop(sink : System.Runtime.Remoting.Channels.IServerChannelSink): AnyRef
   
  /* abstract */ def Store(sink : System.Runtime.Remoting.Channels.IServerChannelSink, state : AnyRef): Unit
   
  /* abstract */ def StoreAndDispatch(sink : System.Runtime.Remoting.Channels.IServerChannelSink, state : AnyRef): Unit
   
  /* abstract */ def ServerCallback(ar : System.IAsyncResult): Unit
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ServerChannelSinkStack extends AnyRef with System.Runtime.Remoting.Channels.IServerChannelSinkStack with 
                                     System.Runtime.Remoting.Channels.IServerResponseChannelSinkStack {
  def Push(sink : System.Runtime.Remoting.Channels.IServerChannelSink, state : AnyRef): Unit
   
  def Pop(sink : System.Runtime.Remoting.Channels.IServerChannelSink): AnyRef
   
  def Store(sink : System.Runtime.Remoting.Channels.IServerChannelSink, state : AnyRef): Unit
   
  def StoreAndDispatch(sink : System.Runtime.Remoting.Channels.IServerChannelSink, state : AnyRef): Unit
   
  def AsyncProcessResponse(msg : System.Runtime.Remoting.Messaging.IMessage, 
                           headers : System.Runtime.Remoting.Channels.ITransportHeaders, 
                           stream : System.IO.Stream): Unit
   
  def GetResponseStream(msg : System.Runtime.Remoting.Messaging.IMessage, 
                        headers : System.Runtime.Remoting.Channels.ITransportHeaders): System.IO.Stream
   
  def ServerCallback(ar : System.IAsyncResult): Unit
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IChannel {
  val ChannelPriority : Int = 0
   
  val ChannelName : String = ""
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IChannelSender extends System.Runtime.Remoting.Channels.IChannel 
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IChannelReceiver extends System.Runtime.Remoting.Channels.IChannel {
  /* abstract */ def GetUrlsForUri(objectURI : String): Array[String]
   
  /* abstract */ def StartListening(data : AnyRef): Unit
   
  /* abstract */ def StopListening(data : AnyRef): Unit
   
  val ChannelData : AnyRef = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IServerChannelSinkProvider {
  /* abstract */ def GetChannelData(channelData : System.Runtime.Remoting.Channels.IChannelDataStore): Unit
   
  /* abstract */ def CreateSink(channel : System.Runtime.Remoting.Channels.IChannelReceiver): System.Runtime.Remoting.Channels.IServerChannelSink
   
  var Next : System.Runtime.Remoting.Channels.IServerChannelSinkProvider = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IChannelSinkBase {
  val Properties : System.Collections.IDictionary = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IServerChannelSink extends System.Runtime.Remoting.Channels.IChannelSinkBase {
  /* abstract */ def AsyncProcessResponse(sinkStack : System.Runtime.Remoting.Channels.IServerResponseChannelSinkStack, 
                                          state : AnyRef, msg : System.Runtime.Remoting.Messaging.IMessage, 
                                          headers : System.Runtime.Remoting.Channels.ITransportHeaders, 
                                          stream : System.IO.Stream): Unit
   
  /* abstract */ def GetResponseStream(sinkStack : System.Runtime.Remoting.Channels.IServerResponseChannelSinkStack, 
                                       state : AnyRef, msg : System.Runtime.Remoting.Messaging.IMessage, 
                                       headers : System.Runtime.Remoting.Channels.ITransportHeaders): System.IO.Stream
   
  val NextChannelSink : System.Runtime.Remoting.Channels.IServerChannelSink = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IChannelReceiverHook {
  /* abstract */ def AddHookChannelUri(channelUri : String): Unit
   
  val ChannelScheme : String = ""
   
  val WantsToListen : Boolean = false
   
  val ChannelSinkChain : System.Runtime.Remoting.Channels.IServerChannelSink = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IClientChannelSinkProvider {
  /* abstract */ def CreateSink(channel : System.Runtime.Remoting.Channels.IChannelSender, url : String, 
                                remoteChannelData : AnyRef): System.Runtime.Remoting.Channels.IClientChannelSink
   
  var Next : System.Runtime.Remoting.Channels.IClientChannelSinkProvider = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IClientFormatterSinkProvider extends System.Runtime.Remoting.Channels.IClientChannelSinkProvider 
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IServerFormatterSinkProvider extends System.Runtime.Remoting.Channels.IServerChannelSinkProvider 
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IClientChannelSink extends System.Runtime.Remoting.Channels.IChannelSinkBase {
  /* abstract */ def AsyncProcessRequest(sinkStack : System.Runtime.Remoting.Channels.IClientChannelSinkStack, 
                                         msg : System.Runtime.Remoting.Messaging.IMessage, 
                                         headers : System.Runtime.Remoting.Channels.ITransportHeaders, 
                                         stream : System.IO.Stream): Unit
   
  /* abstract */ def AsyncProcessResponse(sinkStack : System.Runtime.Remoting.Channels.IClientResponseChannelSinkStack, 
                                          state : AnyRef, headers : System.Runtime.Remoting.Channels.ITransportHeaders, 
                                          stream : System.IO.Stream): Unit
   
  /* abstract */ def GetRequestStream(msg : System.Runtime.Remoting.Messaging.IMessage, 
                                      headers : System.Runtime.Remoting.Channels.ITransportHeaders): System.IO.Stream
   
  val NextChannelSink : System.Runtime.Remoting.Channels.IClientChannelSink = null
}
 
sealed abstract class ServerProcessing extends System.Enum {
  def ==(that: System.Runtime.Remoting.Channels.ServerProcessing): Boolean = false
  def !=(that: System.Runtime.Remoting.Channels.ServerProcessing): Boolean = false
  def  <(that: System.Runtime.Remoting.Channels.ServerProcessing): Boolean = false
  def <=(that: System.Runtime.Remoting.Channels.ServerProcessing): Boolean = false
  def  >(that: System.Runtime.Remoting.Channels.ServerProcessing): Boolean = false
  def >=(that: System.Runtime.Remoting.Channels.ServerProcessing): Boolean = false
  def  |(that: System.Runtime.Remoting.Channels.ServerProcessing): Boolean = false
  def  &(that: System.Runtime.Remoting.Channels.ServerProcessing): Boolean = false
  def  ^(that: System.Runtime.Remoting.Channels.ServerProcessing): Boolean = false
}
object ServerProcessing{
  val Complete	 = value(0)
  val OneWay	 = value(1)
  val Async	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Runtime.Remoting.Channels.ServerProcessing = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IClientFormatterSink extends System.Runtime.Remoting.Messaging.IMessageSink with 
                                   System.Runtime.Remoting.Channels.IClientChannelSink with 
                                   System.Runtime.Remoting.Channels.IChannelSinkBase 
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Reflection.DefaultMemberAttribute("Item")
trait IChannelDataStore {
  val ChannelUris : Array[String] = Array.empty[String]
   
  /* parameterful property Item */
  /* abstract */ def Item_=(key : AnyRef, value : AnyRef): Unit
  /* abstract */ def Item(key : AnyRef): AnyRef
}
 
@System.Reflection.DefaultMemberAttribute("Item")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ChannelDataStore extends AnyRef with System.Runtime.Remoting.Channels.IChannelDataStore {
  var ChannelUris : Array[String] = Array.empty[String]
   
  /* parameterful property Item */
  def Item_=(key : AnyRef, value : AnyRef): Unit
  def Item(key : AnyRef): AnyRef
   
  def this(channelURIs : Array[String]) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Reflection.DefaultMemberAttribute("Item")
trait ITransportHeaders {
  /* abstract */ def GetEnumerator: System.Collections.IEnumerator
   
  /* parameterful property Item */
  /* abstract */ def Item_=(key : AnyRef, value : AnyRef): Unit
  /* abstract */ def Item(key : AnyRef): AnyRef
}
 
@System.Reflection.DefaultMemberAttribute("Item")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class TransportHeaders extends AnyRef with System.Runtime.Remoting.Channels.ITransportHeaders {
  def GetEnumerator: System.Collections.IEnumerator
   
  /* parameterful property Item */
  def Item_=(key : AnyRef, value : AnyRef): Unit
  def Item(key : AnyRef): AnyRef
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SinkProviderData extends AnyRef {
  val Name : String = ""
   
  val Properties : System.Collections.IDictionary = null
   
  val Children : System.Collections.IList = null
   
  def this(name : String) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Reflection.DefaultMemberAttribute("Item")
abstract class BaseChannelObjectWithProperties extends AnyRef with System.Collections.IDictionary with System.Collections.ICollection with 
                                                       System.Collections.IEnumerable {
  def Contains(key : AnyRef): Boolean
   
  def Add(key : AnyRef, value : AnyRef): Unit
   
  def Clear: Unit
   
  def Remove(key : AnyRef): Unit
   
  def GetEnumerator: System.Collections.IDictionaryEnumerator
   
  def CopyTo(array : System.Array, index : Int): Unit
   
  val Properties : System.Collections.IDictionary = null
   
  /* parameterful property Item */
  def Item_=(key : AnyRef, value : AnyRef): Unit
  def Item(key : AnyRef): AnyRef
   
  val Keys : System.Collections.ICollection = null
   
  val Values : System.Collections.ICollection = null
   
  val IsReadOnly : Boolean = false
   
  val IsFixedSize : Boolean = false
   
  val Count : Int = 0
   
  val SyncRoot : AnyRef = null
   
  val IsSynchronized : Boolean = false
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class BaseChannelSinkWithProperties extends System.Runtime.Remoting.Channels.BaseChannelObjectWithProperties {
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class BaseChannelWithProperties extends System.Runtime.Remoting.Channels.BaseChannelObjectWithProperties {
  protected var SinksWithProperties : System.Runtime.Remoting.Channels.IChannelSinkBase
   
  val Properties : System.Collections.IDictionary = null
   
  protected def this() {}
}
 
trait ISecurableChannel {
  var IsSecured : Boolean = false
}
 
}