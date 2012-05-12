 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.Serialization.Formatters.Binary {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class BinaryFormatter extends AnyRef with System.Runtime.Remoting.Messaging.IRemotingFormatter with 
                                     System.Runtime.Serialization.IFormatter {
  def Deserialize(serializationStream : System.IO.Stream): AnyRef
   
  def Deserialize(serializationStream : System.IO.Stream, 
                  handler : System.Runtime.Remoting.Messaging.HeaderHandler): AnyRef
   
  def DeserializeMethodResponse(serializationStream : System.IO.Stream, 
                                handler : System.Runtime.Remoting.Messaging.HeaderHandler, 
                                methodCallMessage : System.Runtime.Remoting.Messaging.IMethodCallMessage): AnyRef
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def UnsafeDeserialize(serializationStream : System.IO.Stream, 
                        handler : System.Runtime.Remoting.Messaging.HeaderHandler): AnyRef
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def UnsafeDeserializeMethodResponse(serializationStream : System.IO.Stream, 
                                      handler : System.Runtime.Remoting.Messaging.HeaderHandler, 
                                      methodCallMessage : System.Runtime.Remoting.Messaging.IMethodCallMessage): AnyRef
   
  def Serialize(serializationStream : System.IO.Stream, graph : AnyRef): Unit
   
  def Serialize(serializationStream : System.IO.Stream, graph : AnyRef, 
                headers : Array[System.Runtime.Remoting.Messaging.Header]): Unit
   
  var TypeFormat : System.Runtime.Serialization.Formatters.FormatterTypeStyle = System.Runtime.Serialization.Formatters.FormatterTypeStyle.TypesWhenNeeded
   
  var AssemblyFormat : System.Runtime.Serialization.Formatters.FormatterAssemblyStyle = System.Runtime.Serialization.Formatters.FormatterAssemblyStyle.Simple
   
  var FilterLevel : System.Runtime.Serialization.Formatters.TypeFilterLevel = System.Runtime.Serialization.Formatters.TypeFilterLevel.Low
   
  var SurrogateSelector : System.Runtime.Serialization.ISurrogateSelector = null
   
  var Binder : System.Runtime.Serialization.SerializationBinder = null
   
  var Context : System.Runtime.Serialization.StreamingContext = new System.Runtime.Serialization.StreamingContext()
   
  def this() {}
   
  def this(selector : System.Runtime.Serialization.ISurrogateSelector, 
           context : System.Runtime.Serialization.StreamingContext) {}
}
 
}