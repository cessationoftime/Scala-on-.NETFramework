 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Text {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
@System.Reflection.DefaultMemberAttribute("Chars")
sealed class StringBuilder extends AnyRef with System.Runtime.Serialization.ISerializable {
  def EnsureCapacity(capacity : Int): Int
   
  def ToString: String
   
  def ToString(startIndex : Int, length : Int): String
   
  def Append(value : Char, repeatCount : Int): System.Text.StringBuilder
   
  def Append(value : Array[Char], startIndex : Int, charCount : Int): System.Text.StringBuilder
   
  def Append(value : String): System.Text.StringBuilder
   
  def Append(value : String, startIndex : Int, count : Int): System.Text.StringBuilder
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def AppendLine: System.Text.StringBuilder
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def AppendLine(value : String): System.Text.StringBuilder
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def CopyTo(sourceIndex : Int, destination : Array[Char], destinationIndex : Int, count : Int): Unit
   
  def Insert(index : Int, value : String, count : Int): System.Text.StringBuilder
   
  def Remove(startIndex : Int, length : Int): System.Text.StringBuilder
   
  def Append(value : Boolean): System.Text.StringBuilder
   
  @System.CLSCompliantAttribute(false)
  def Append(value : Byte): System.Text.StringBuilder
   
  def Append(value : UByte): System.Text.StringBuilder
   
  def Append(value : Char): System.Text.StringBuilder
   
  def Append(value : Short): System.Text.StringBuilder
   
  def Append(value : Int): System.Text.StringBuilder
   
  def Append(value : Long): System.Text.StringBuilder
   
  def Append(value : Float): System.Text.StringBuilder
   
  def Append(value : Double): System.Text.StringBuilder
   
  def Append(value : System.Decimal): System.Text.StringBuilder
   
  @System.CLSCompliantAttribute(false)
  def Append(value : UShort): System.Text.StringBuilder
   
  @System.CLSCompliantAttribute(false)
  def Append(value : UInt): System.Text.StringBuilder
   
  @System.CLSCompliantAttribute(false)
  def Append(value : ULong): System.Text.StringBuilder
   
  def Append(value : AnyRef): System.Text.StringBuilder
   
  def Append(value : Array[Char]): System.Text.StringBuilder
   
  def Insert(index : Int, value : String): System.Text.StringBuilder
   
  def Insert(index : Int, value : Boolean): System.Text.StringBuilder
   
  @System.CLSCompliantAttribute(false)
  def Insert(index : Int, value : Byte): System.Text.StringBuilder
   
  def Insert(index : Int, value : UByte): System.Text.StringBuilder
   
  def Insert(index : Int, value : Short): System.Text.StringBuilder
   
  def Insert(index : Int, value : Char): System.Text.StringBuilder
   
  def Insert(index : Int, value : Array[Char]): System.Text.StringBuilder
   
  def Insert(index : Int, value : Array[Char], startIndex : Int, charCount : Int): System.Text.StringBuilder
   
  def Insert(index : Int, value : Int): System.Text.StringBuilder
   
  def Insert(index : Int, value : Long): System.Text.StringBuilder
   
  def Insert(index : Int, value : Float): System.Text.StringBuilder
   
  def Insert(index : Int, value : Double): System.Text.StringBuilder
   
  def Insert(index : Int, value : System.Decimal): System.Text.StringBuilder
   
  @System.CLSCompliantAttribute(false)
  def Insert(index : Int, value : UShort): System.Text.StringBuilder
   
  @System.CLSCompliantAttribute(false)
  def Insert(index : Int, value : UInt): System.Text.StringBuilder
   
  @System.CLSCompliantAttribute(false)
  def Insert(index : Int, value : ULong): System.Text.StringBuilder
   
  def Insert(index : Int, value : AnyRef): System.Text.StringBuilder
   
  def AppendFormat(format : String, arg0 : AnyRef): System.Text.StringBuilder
   
  def AppendFormat(format : String, arg0 : AnyRef, arg1 : AnyRef): System.Text.StringBuilder
   
  def AppendFormat(format : String, arg0 : AnyRef, arg1 : AnyRef, arg2 : AnyRef): System.Text.StringBuilder
   
  def AppendFormat(format : String, args : Array[AnyRef]): System.Text.StringBuilder
   
  def AppendFormat(provider : System.IFormatProvider, format : String, args : Array[AnyRef]): System.Text.StringBuilder
   
  def Replace(oldValue : String, newValue : String): System.Text.StringBuilder
   
  def Replace(oldValue : String, newValue : String, startIndex : Int, count : Int): System.Text.StringBuilder
   
  def Equals(sb : System.Text.StringBuilder): Boolean
   
  def Replace(oldChar : Char, newChar : Char): System.Text.StringBuilder
   
  def Replace(oldChar : Char, newChar : Char, startIndex : Int, count : Int): System.Text.StringBuilder
   
  var Capacity : Int = 0
   
  val MaxCapacity : Int = 0
   
  var Length : Int = 0
   
  /* parameterful property Chars */
  def Chars_=(index : Int, value : Char): Unit
  def Chars(index : Int): Char
   
  def this() {}
   
  def this(capacity : Int) {}
   
  def this(value : String) {}
   
  def this(value : String, capacity : Int) {}
   
  def this(value : String, startIndex : Int, length : Int, capacity : Int) {}
   
  def this(capacity : Int, maxCapacity : Int) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class Encoding extends AnyRef with System.ICloneable {
  def GetPreamble: Array[UByte]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Clone: AnyRef
   
  def GetByteCount(chars : Array[Char]): Int
   
  def GetByteCount(s : String): Int
   
  /* abstract */ def GetByteCount(chars : Array[Char], index : Int, count : Int): Int
   
  def GetBytes(chars : Array[Char]): Array[UByte]
   
  def GetBytes(chars : Array[Char], index : Int, count : Int): Array[UByte]
   
  /* abstract */ def GetBytes(chars : Array[Char], charIndex : Int, charCount : Int, bytes : Array[UByte], 
                              byteIndex : Int): Int
   
  def GetBytes(s : String): Array[UByte]
   
  def GetBytes(s : String, charIndex : Int, charCount : Int, bytes : Array[UByte], byteIndex : Int): Int
   
  def GetCharCount(bytes : Array[UByte]): Int
   
  /* abstract */ def GetCharCount(bytes : Array[UByte], index : Int, count : Int): Int
   
  def GetChars(bytes : Array[UByte]): Array[Char]
   
  def GetChars(bytes : Array[UByte], index : Int, count : Int): Array[Char]
   
  /* abstract */ def GetChars(bytes : Array[UByte], byteIndex : Int, byteCount : Int, chars : Array[Char], 
                              charIndex : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def IsAlwaysNormalized: Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def IsAlwaysNormalized(form : System.Text.NormalizationForm): Boolean
   
  def GetDecoder: System.Text.Decoder
   
  def GetEncoder: System.Text.Encoder
   
  /* abstract */ def GetMaxByteCount(charCount : Int): Int
   
  /* abstract */ def GetMaxCharCount(byteCount : Int): Int
   
  def GetString(bytes : Array[UByte]): String
   
  def GetString(bytes : Array[UByte], index : Int, count : Int): String
   
  def Equals(value : AnyRef): Boolean
   
  def GetHashCode: Int
   
  val BodyName : String = ""
   
  val EncodingName : String = ""
   
  val HeaderName : String = ""
   
  val WebName : String = ""
   
  val WindowsCodePage : Int = 0
   
  val IsBrowserDisplay : Boolean = false
   
  val IsBrowserSave : Boolean = false
   
  val IsMailNewsDisplay : Boolean = false
   
  val IsMailNewsSave : Boolean = false
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val IsSingleByte : Boolean = false
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var EncoderFallback : System.Text.EncoderFallback = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var DecoderFallback : System.Text.DecoderFallback = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val IsReadOnly : Boolean = false
   
  val CodePage : Int = 0
   
  protected def this() {}
   
  protected def this(codePage : Int) {}
}
object Encoding {
  def Convert(srcEncoding : System.Text.Encoding, dstEncoding : System.Text.Encoding, 
              bytes : Array[UByte]): Array[UByte]  = Array.empty[UByte]
   
  def Convert(srcEncoding : System.Text.Encoding, dstEncoding : System.Text.Encoding, 
              bytes : Array[UByte], index : Int, count : Int): Array[UByte]  = Array.empty[UByte]
   
  def GetEncoding(codepage : Int): System.Text.Encoding  = null
   
  def GetEncoding(codepage : Int, encoderFallback : System.Text.EncoderFallback, 
                  decoderFallback : System.Text.DecoderFallback): System.Text.Encoding  = null
   
  def GetEncoding(name : String): System.Text.Encoding  = null
   
  def GetEncoding(name : String, encoderFallback : System.Text.EncoderFallback, 
                  decoderFallback : System.Text.DecoderFallback): System.Text.Encoding  = null
   
  def GetEncodings: Array[System.Text.EncodingInfo]  = Array.empty[System.Text.EncodingInfo]
   
  val ASCII : System.Text.Encoding = null
   
  val Default : System.Text.Encoding = null
   
  val Unicode : System.Text.Encoding = null
   
  val BigEndianUnicode : System.Text.Encoding = null
   
  val UTF7 : System.Text.Encoding = null
   
  val UTF8 : System.Text.Encoding = null
   
  val UTF32 : System.Text.Encoding = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class Encoder extends AnyRef {
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Reset: Unit
   
  /* abstract */ def GetByteCount(chars : Array[Char], index : Int, count : Int, flush : Boolean): Int
   
  /* abstract */ def GetBytes(chars : Array[Char], charIndex : Int, charCount : Int, bytes : Array[UByte], 
                              byteIndex : Int, flush : Boolean): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Convert(chars : Array[Char], charIndex : Int, charCount : Int, bytes : Array[UByte], 
              byteIndex : Int, byteCount : Int, flush : Boolean, charsUsed : CLRByRef[Int], 
              bytesUsed : CLRByRef[Int], completed : CLRByRef[Boolean]): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var Fallback : System.Text.EncoderFallback = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val FallbackBuffer : System.Text.EncoderFallbackBuffer = null
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class Decoder extends AnyRef {
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Reset: Unit
   
  /* abstract */ def GetCharCount(bytes : Array[UByte], index : Int, count : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetCharCount(bytes : Array[UByte], index : Int, count : Int, flush : Boolean): Int
   
  /* abstract */ def GetChars(bytes : Array[UByte], byteIndex : Int, byteCount : Int, chars : Array[Char], 
                              charIndex : Int): Int
   
  def GetChars(bytes : Array[UByte], byteIndex : Int, byteCount : Int, chars : Array[Char], 
               charIndex : Int, flush : Boolean): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Convert(bytes : Array[UByte], byteIndex : Int, byteCount : Int, chars : Array[Char], 
              charIndex : Int, charCount : Int, flush : Boolean, bytesUsed : CLRByRef[Int], 
              charsUsed : CLRByRef[Int], completed : CLRByRef[Boolean]): Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var Fallback : System.Text.DecoderFallback = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val FallbackBuffer : System.Text.DecoderFallbackBuffer = null
   
  protected def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ASCIIEncoding extends System.Text.Encoding {
  def GetByteCount(chars : Array[Char], index : Int, count : Int): Int
   
  def GetByteCount(chars : String): Int
   
  def GetBytes(chars : String, charIndex : Int, charCount : Int, bytes : Array[UByte], byteIndex : Int): Int
   
  def GetBytes(chars : Array[Char], charIndex : Int, charCount : Int, bytes : Array[UByte], 
               byteIndex : Int): Int
   
  def GetCharCount(bytes : Array[UByte], index : Int, count : Int): Int
   
  def GetChars(bytes : Array[UByte], byteIndex : Int, byteCount : Int, chars : Array[Char], 
               charIndex : Int): Int
   
  def GetString(bytes : Array[UByte], byteIndex : Int, byteCount : Int): String
   
  def GetMaxByteCount(charCount : Int): Int
   
  def GetMaxCharCount(byteCount : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetDecoder: System.Text.Decoder
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetEncoder: System.Text.Encoder
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val IsSingleByte : Boolean = false
   
  def this() {}
}
 
abstract class DecoderFallback extends AnyRef {
  /* abstract */ def CreateFallbackBuffer: System.Text.DecoderFallbackBuffer
   
  val MaxCharCount : Int = 0
   
  protected def this() {}
}
object DecoderFallback {
  val ReplacementFallback : System.Text.DecoderFallback = null
   
  val ExceptionFallback : System.Text.DecoderFallback = null
}
 
abstract class DecoderFallbackBuffer extends AnyRef {
  /* abstract */ def Fallback(bytesUnknown : Array[UByte], index : Int): Boolean
   
  /* abstract */ def GetNextChar: Char
   
  /* abstract */ def MovePrevious: Boolean
   
  def Reset: Unit
   
  val Remaining : Int = 0
   
  protected def this() {}
}
 
sealed class DecoderExceptionFallback extends System.Text.DecoderFallback {
  def CreateFallbackBuffer: System.Text.DecoderFallbackBuffer
   
  def Equals(value : AnyRef): Boolean
   
  def GetHashCode: Int
   
  val MaxCharCount : Int = 0
   
  def this() {}
}
 
sealed class DecoderExceptionFallbackBuffer extends System.Text.DecoderFallbackBuffer {
  def Fallback(bytesUnknown : Array[UByte], index : Int): Boolean
   
  def GetNextChar: Char
   
  def MovePrevious: Boolean
   
  val Remaining : Int = 0
   
  def this() {}
}
 
sealed class DecoderFallbackException extends System.ArgumentException {
  val BytesUnknown : Array[UByte] = Array.empty[UByte]
   
  val Index : Int = 0
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
   
  def this(message : String, bytesUnknown : Array[UByte], index : Int) {}
}
 
sealed class DecoderReplacementFallback extends System.Text.DecoderFallback {
  def CreateFallbackBuffer: System.Text.DecoderFallbackBuffer
   
  def Equals(value : AnyRef): Boolean
   
  def GetHashCode: Int
   
  val DefaultString : String = ""
   
  val MaxCharCount : Int = 0
   
  def this() {}
   
  def this(replacement : String) {}
}
 
sealed class DecoderReplacementFallbackBuffer extends System.Text.DecoderFallbackBuffer {
  def Fallback(bytesUnknown : Array[UByte], index : Int): Boolean
   
  def GetNextChar: Char
   
  def MovePrevious: Boolean
   
  def Reset: Unit
   
  val Remaining : Int = 0
   
  def this(fallback : System.Text.DecoderReplacementFallback) {}
}
 
abstract class EncoderFallback extends AnyRef {
  /* abstract */ def CreateFallbackBuffer: System.Text.EncoderFallbackBuffer
   
  val MaxCharCount : Int = 0
   
  protected def this() {}
}
object EncoderFallback {
  val ReplacementFallback : System.Text.EncoderFallback = null
   
  val ExceptionFallback : System.Text.EncoderFallback = null
}
 
abstract class EncoderFallbackBuffer extends AnyRef {
  /* abstract */ def Fallback(charUnknown : Char, index : Int): Boolean
   
  /* abstract */ def Fallback(charUnknownHigh : Char, charUnknownLow : Char, index : Int): Boolean
   
  /* abstract */ def GetNextChar: Char
   
  /* abstract */ def MovePrevious: Boolean
   
  def Reset: Unit
   
  val Remaining : Int = 0
   
  protected def this() {}
}
 
sealed class EncoderExceptionFallback extends System.Text.EncoderFallback {
  def CreateFallbackBuffer: System.Text.EncoderFallbackBuffer
   
  def Equals(value : AnyRef): Boolean
   
  def GetHashCode: Int
   
  val MaxCharCount : Int = 0
   
  def this() {}
}
 
sealed class EncoderExceptionFallbackBuffer extends System.Text.EncoderFallbackBuffer {
  def Fallback(charUnknown : Char, index : Int): Boolean
   
  def Fallback(charUnknownHigh : Char, charUnknownLow : Char, index : Int): Boolean
   
  def GetNextChar: Char
   
  def MovePrevious: Boolean
   
  val Remaining : Int = 0
   
  def this() {}
}
 
sealed class EncoderFallbackException extends System.ArgumentException {
  def IsUnknownSurrogate: Boolean
   
  val CharUnknown : Char = '0'
   
  val CharUnknownHigh : Char = '0'
   
  val CharUnknownLow : Char = '0'
   
  val Index : Int = 0
   
  def this() {}
   
  def this(message : String) {}
   
  def this(message : String, innerException : System.Exception) {}
}
 
sealed class EncoderReplacementFallback extends System.Text.EncoderFallback {
  def CreateFallbackBuffer: System.Text.EncoderFallbackBuffer
   
  def Equals(value : AnyRef): Boolean
   
  def GetHashCode: Int
   
  val DefaultString : String = ""
   
  val MaxCharCount : Int = 0
   
  def this() {}
   
  def this(replacement : String) {}
}
 
sealed class EncoderReplacementFallbackBuffer extends System.Text.EncoderFallbackBuffer {
  def Fallback(charUnknown : Char, index : Int): Boolean
   
  def Fallback(charUnknownHigh : Char, charUnknownLow : Char, index : Int): Boolean
   
  def GetNextChar: Char
   
  def MovePrevious: Boolean
   
  def Reset: Unit
   
  val Remaining : Int = 0
   
  def this(fallback : System.Text.EncoderReplacementFallback) {}
}
 
sealed class EncodingInfo extends AnyRef {
  def GetEncoding: System.Text.Encoding
   
  def Equals(value : AnyRef): Boolean
   
  def GetHashCode: Int
   
  val CodePage : Int = 0
   
  val Name : String = ""
   
  val DisplayName : String = ""
}
 
sealed abstract class NormalizationForm extends System.Enum {
  def ==(that: System.Text.NormalizationForm): Boolean = false
  def !=(that: System.Text.NormalizationForm): Boolean = false
  def  <(that: System.Text.NormalizationForm): Boolean = false
  def <=(that: System.Text.NormalizationForm): Boolean = false
  def  >(that: System.Text.NormalizationForm): Boolean = false
  def >=(that: System.Text.NormalizationForm): Boolean = false
  def  |(that: System.Text.NormalizationForm): Boolean = false
  def  &(that: System.Text.NormalizationForm): Boolean = false
  def  ^(that: System.Text.NormalizationForm): Boolean = false
}
object NormalizationForm{
  val FormC	 = value(1)
  val FormD	 = value(2)
  val FormKC	 = value(5)
  val FormKD	 = value(6)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Text.NormalizationForm = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class UnicodeEncoding extends System.Text.Encoding {
  def GetByteCount(chars : Array[Char], index : Int, count : Int): Int
   
  def GetByteCount(s : String): Int
   
  def GetBytes(s : String, charIndex : Int, charCount : Int, bytes : Array[UByte], byteIndex : Int): Int
   
  def GetBytes(chars : Array[Char], charIndex : Int, charCount : Int, bytes : Array[UByte], 
               byteIndex : Int): Int
   
  def GetCharCount(bytes : Array[UByte], index : Int, count : Int): Int
   
  def GetChars(bytes : Array[UByte], byteIndex : Int, byteCount : Int, chars : Array[Char], 
               charIndex : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetString(bytes : Array[UByte], index : Int, count : Int): String
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetEncoder: System.Text.Encoder
   
  def GetDecoder: System.Text.Decoder
   
  def GetPreamble: Array[UByte]
   
  def GetMaxByteCount(charCount : Int): Int
   
  def GetMaxCharCount(byteCount : Int): Int
   
  def Equals(value : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def this() {}
   
  def this(bigEndian : Boolean, byteOrderMark : Boolean) {}
   
  def this(bigEndian : Boolean, byteOrderMark : Boolean, throwOnInvalidBytes : Boolean) {}
}
object UnicodeEncoding {
  val CharSize : Int  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class UTF7Encoding extends System.Text.Encoding {
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Equals(value : AnyRef): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetHashCode: Int
   
  def GetByteCount(chars : Array[Char], index : Int, count : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetByteCount(s : String): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetBytes(s : String, charIndex : Int, charCount : Int, bytes : Array[UByte], byteIndex : Int): Int
   
  def GetBytes(chars : Array[Char], charIndex : Int, charCount : Int, bytes : Array[UByte], 
               byteIndex : Int): Int
   
  def GetCharCount(bytes : Array[UByte], index : Int, count : Int): Int
   
  def GetChars(bytes : Array[UByte], byteIndex : Int, byteCount : Int, chars : Array[Char], 
               charIndex : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetString(bytes : Array[UByte], index : Int, count : Int): String
   
  def GetDecoder: System.Text.Decoder
   
  def GetEncoder: System.Text.Encoder
   
  def GetMaxByteCount(charCount : Int): Int
   
  def GetMaxCharCount(byteCount : Int): Int
   
  def this() {}
   
  def this(allowOptionals : Boolean) {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class UTF8Encoding extends System.Text.Encoding {
  def GetByteCount(chars : Array[Char], index : Int, count : Int): Int
   
  def GetByteCount(chars : String): Int
   
  def GetBytes(s : String, charIndex : Int, charCount : Int, bytes : Array[UByte], byteIndex : Int): Int
   
  def GetBytes(chars : Array[Char], charIndex : Int, charCount : Int, bytes : Array[UByte], 
               byteIndex : Int): Int
   
  def GetCharCount(bytes : Array[UByte], index : Int, count : Int): Int
   
  def GetChars(bytes : Array[UByte], byteIndex : Int, byteCount : Int, chars : Array[Char], 
               charIndex : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetString(bytes : Array[UByte], index : Int, count : Int): String
   
  def GetDecoder: System.Text.Decoder
   
  def GetEncoder: System.Text.Encoder
   
  def GetMaxByteCount(charCount : Int): Int
   
  def GetMaxCharCount(byteCount : Int): Int
   
  def GetPreamble: Array[UByte]
   
  def Equals(value : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def this() {}
   
  def this(encoderShouldEmitUTF8Identifier : Boolean) {}
   
  def this(encoderShouldEmitUTF8Identifier : Boolean, throwOnInvalidBytes : Boolean) {}
}
 
sealed class UTF32Encoding extends System.Text.Encoding {
  def GetByteCount(chars : Array[Char], index : Int, count : Int): Int
   
  def GetByteCount(s : String): Int
   
  def GetBytes(s : String, charIndex : Int, charCount : Int, bytes : Array[UByte], byteIndex : Int): Int
   
  def GetBytes(chars : Array[Char], charIndex : Int, charCount : Int, bytes : Array[UByte], 
               byteIndex : Int): Int
   
  def GetCharCount(bytes : Array[UByte], index : Int, count : Int): Int
   
  def GetChars(bytes : Array[UByte], byteIndex : Int, byteCount : Int, chars : Array[Char], 
               charIndex : Int): Int
   
  def GetString(bytes : Array[UByte], index : Int, count : Int): String
   
  def GetDecoder: System.Text.Decoder
   
  def GetEncoder: System.Text.Encoder
   
  def GetMaxByteCount(charCount : Int): Int
   
  def GetMaxCharCount(byteCount : Int): Int
   
  def GetPreamble: Array[UByte]
   
  def Equals(value : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def this() {}
   
  def this(bigEndian : Boolean, byteOrderMark : Boolean) {}
   
  def this(bigEndian : Boolean, byteOrderMark : Boolean, throwOnInvalidCharacters : Boolean) {}
}
 
}