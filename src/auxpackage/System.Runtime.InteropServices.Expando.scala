 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Runtime.InteropServices.Expando {
 
@System.Runtime.InteropServices.GuidAttribute("AFBF15E6-C37C-11d2-B88E-00A0C9B471B8")
@System.Runtime.InteropServices.ComVisibleAttribute(true)
trait IExpando extends System.Reflection.IReflect {
  /* abstract */ def AddField(name : String): System.Reflection.FieldInfo
   
  /* abstract */ def AddProperty(name : String): System.Reflection.PropertyInfo
   
  /* abstract */ def AddMethod(name : String, method : System.Delegate): System.Reflection.MethodInfo
   
  /* abstract */ def RemoveMember(m : System.Reflection.MemberInfo): Unit
}
 
}