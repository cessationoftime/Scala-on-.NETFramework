 /* assembly: System, Version=2.0.5.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\System.dll */ 
 
import auxPackage.auxiliary._
 
package System.Text.RegularExpressions {
 
class Capture extends AnyRef {
  def ToString: String
   
  val Index : Int = 0
   
  val Length : Int = 0
   
  val Value : String = ""
}
 
@System.Reflection.DefaultMemberAttribute("Item")
class CaptureCollection extends AnyRef with System.Collections.ICollection with System.Collections.IEnumerable {
  def GetEnumerator: System.Collections.IEnumerator
   
  val Count : Int = 0
   
  /* parameterful property Item */
  def Item(i : Int): System.Text.RegularExpressions.Capture
}
 
class Group extends System.Text.RegularExpressions.Capture {
  val Captures : System.Text.RegularExpressions.CaptureCollection = null
   
  val Success : Boolean = false
}
 
@System.Reflection.DefaultMemberAttribute("Item")
class GroupCollection extends AnyRef with System.Collections.ICollection with System.Collections.IEnumerable {
  def GetEnumerator: System.Collections.IEnumerator
   
  val Count : Int = 0
   
  /* parameterful property Item */
  def Item(groupnum : Int): System.Text.RegularExpressions.Group
   
  /* parameterful property Item */
  def Item(groupname : String): System.Text.RegularExpressions.Group
}
 
class Match extends System.Text.RegularExpressions.Group {
  def NextMatch: System.Text.RegularExpressions.Match
   
  def Result(replacement : String): String
   
  val Groups : System.Text.RegularExpressions.GroupCollection = null
}
object Match {
  val Empty : System.Text.RegularExpressions.Match = null
}
 
@System.Reflection.DefaultMemberAttribute("Item")
class MatchCollection extends AnyRef with System.Collections.ICollection with System.Collections.IEnumerable {
  def GetEnumerator: System.Collections.IEnumerator
   
  val Count : Int = 0
   
  /* parameterful property Item */
  def Item(i : Int): System.Text.RegularExpressions.Match
}
 
sealed class MatchEvaluator extends System.MulticastDelegate {
  def Invoke(`match` : System.Text.RegularExpressions.Match): String
   
  def BeginInvoke(`match` : System.Text.RegularExpressions.Match, callback : System.AsyncCallback, 
                  `object` : AnyRef): System.IAsyncResult
   
  def EndInvoke(result : System.IAsyncResult): String
   
  def this(`object` : AnyRef, method : System.IntPtr) {}
}
 
class Regex extends AnyRef {
  def GetGroupNames: Array[String]
   
  def GetGroupNumbers: Array[Int]
   
  def GroupNameFromNumber(i : Int): String
   
  def GroupNumberFromName(name : String): Int
   
  def IsMatch(input : String): Boolean
   
  def IsMatch(input : String, startat : Int): Boolean
   
  def Match(input : String): System.Text.RegularExpressions.Match
   
  def Match(input : String, startat : Int): System.Text.RegularExpressions.Match
   
  def Match(input : String, beginning : Int, length : Int): System.Text.RegularExpressions.Match
   
  def Matches(input : String): System.Text.RegularExpressions.MatchCollection
   
  def Matches(input : String, startat : Int): System.Text.RegularExpressions.MatchCollection
   
  def Replace(input : String, replacement : String): String
   
  def Replace(input : String, replacement : String, count : Int): String
   
  def Replace(input : String, replacement : String, count : Int, startat : Int): String
   
  def Replace(input : String, evaluator : System.Text.RegularExpressions.MatchEvaluator): String
   
  def Replace(input : String, evaluator : System.Text.RegularExpressions.MatchEvaluator, 
              count : Int): String
   
  def Replace(input : String, evaluator : System.Text.RegularExpressions.MatchEvaluator, 
              count : Int, startat : Int): String
   
  def Split(input : String): Array[String]
   
  def Split(input : String, count : Int): Array[String]
   
  def Split(input : String, count : Int, startat : Int): Array[String]
   
  def ToString: String
   
  val Options : System.Text.RegularExpressions.RegexOptions = System.Text.RegularExpressions.RegexOptions.CultureInvariant
   
  val RightToLeft : Boolean = false
   
  protected def this() {}
   
  def this(pattern : String) {}
   
  def this(pattern : String, options : System.Text.RegularExpressions.RegexOptions) {}
}
object Regex {
  def Escape(str : String): String  = ""
   
  def IsMatch(input : String, pattern : String): Boolean  = false
   
  def IsMatch(input : String, pattern : String, 
              options : System.Text.RegularExpressions.RegexOptions): Boolean  = false
   
  def Match(input : String, pattern : String): System.Text.RegularExpressions.Match  = null
   
  def Match(input : String, pattern : String, 
            options : System.Text.RegularExpressions.RegexOptions): System.Text.RegularExpressions.Match  = null
   
  def Matches(input : String, pattern : String): System.Text.RegularExpressions.MatchCollection  = null
   
  def Matches(input : String, pattern : String, 
              options : System.Text.RegularExpressions.RegexOptions): System.Text.RegularExpressions.MatchCollection  = null
   
  def Replace(input : String, pattern : String, replacement : String): String  = ""
   
  def Replace(input : String, pattern : String, replacement : String, 
              options : System.Text.RegularExpressions.RegexOptions): String  = ""
   
  def Replace(input : String, pattern : String, 
              evaluator : System.Text.RegularExpressions.MatchEvaluator): String  = ""
   
  def Replace(input : String, pattern : String, 
              evaluator : System.Text.RegularExpressions.MatchEvaluator, 
              options : System.Text.RegularExpressions.RegexOptions): String  = ""
   
  def Split(input : String, pattern : String): Array[String]  = Array.empty[String]
   
  def Split(input : String, pattern : String, 
            options : System.Text.RegularExpressions.RegexOptions): Array[String]  = Array.empty[String]
   
  def Unescape(str : String): String  = ""
}
 
sealed abstract class RegexOptions extends System.Enum {
  def ==(that: System.Text.RegularExpressions.RegexOptions): Boolean = false
  def !=(that: System.Text.RegularExpressions.RegexOptions): Boolean = false
  def  <(that: System.Text.RegularExpressions.RegexOptions): Boolean = false
  def <=(that: System.Text.RegularExpressions.RegexOptions): Boolean = false
  def  >(that: System.Text.RegularExpressions.RegexOptions): Boolean = false
  def >=(that: System.Text.RegularExpressions.RegexOptions): Boolean = false
  def  |(that: System.Text.RegularExpressions.RegexOptions): Boolean = false
  def  &(that: System.Text.RegularExpressions.RegexOptions): Boolean = false
  def  ^(that: System.Text.RegularExpressions.RegexOptions): Boolean = false
}
object RegexOptions{
  val CultureInvariant	 = value(512)
  val ECMAScript	 = value(256)
  val ExplicitCapture	 = value(4)
  val IgnoreCase	 = value(1)
  val IgnorePatternWhitespace	 = value(32)
  val Multiline	 = value(2)
  val None	 = value(0)
  val RightToLeft	 = value(64)
  val Singleline	 = value(16)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Text.RegularExpressions.RegexOptions = null
}
 
}