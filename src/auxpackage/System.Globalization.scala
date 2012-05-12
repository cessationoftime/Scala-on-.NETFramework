 /* assembly: mscorlib, Version=2.0.0.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */ 
 
import auxPackage.auxiliary._
 
package System.Globalization {
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class Calendar extends AnyRef with System.ICloneable {
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Clone: AnyRef
   
  def AddMilliseconds(time : System.DateTime, milliseconds : Double): System.DateTime
   
  def AddDays(time : System.DateTime, days : Int): System.DateTime
   
  def AddHours(time : System.DateTime, hours : Int): System.DateTime
   
  def AddMinutes(time : System.DateTime, minutes : Int): System.DateTime
   
  /* abstract */ def AddMonths(time : System.DateTime, months : Int): System.DateTime
   
  def AddSeconds(time : System.DateTime, seconds : Int): System.DateTime
   
  def AddWeeks(time : System.DateTime, weeks : Int): System.DateTime
   
  /* abstract */ def AddYears(time : System.DateTime, years : Int): System.DateTime
   
  /* abstract */ def GetDayOfMonth(time : System.DateTime): Int
   
  /* abstract */ def GetDayOfWeek(time : System.DateTime): System.DayOfWeek
   
  /* abstract */ def GetDayOfYear(time : System.DateTime): Int
   
  def GetDaysInMonth(year : Int, month : Int): Int
   
  /* abstract */ def GetDaysInMonth(year : Int, month : Int, era : Int): Int
   
  def GetDaysInYear(year : Int): Int
   
  /* abstract */ def GetDaysInYear(year : Int, era : Int): Int
   
  /* abstract */ def GetEra(time : System.DateTime): Int
   
  def GetHour(time : System.DateTime): Int
   
  def GetMilliseconds(time : System.DateTime): Double
   
  def GetMinute(time : System.DateTime): Int
   
  /* abstract */ def GetMonth(time : System.DateTime): Int
   
  def GetMonthsInYear(year : Int): Int
   
  /* abstract */ def GetMonthsInYear(year : Int, era : Int): Int
   
  def GetSecond(time : System.DateTime): Int
   
  def GetWeekOfYear(time : System.DateTime, rule : System.Globalization.CalendarWeekRule, 
                    firstDayOfWeek : System.DayOfWeek): Int
   
  /* abstract */ def GetYear(time : System.DateTime): Int
   
  def IsLeapDay(year : Int, month : Int, day : Int): Boolean
   
  /* abstract */ def IsLeapDay(year : Int, month : Int, day : Int, era : Int): Boolean
   
  def IsLeapMonth(year : Int, month : Int): Boolean
   
  /* abstract */ def IsLeapMonth(year : Int, month : Int, era : Int): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetLeapMonth(year : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetLeapMonth(year : Int, era : Int): Int
   
  def IsLeapYear(year : Int): Boolean
   
  /* abstract */ def IsLeapYear(year : Int, era : Int): Boolean
   
  def ToDateTime(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
                 millisecond : Int): System.DateTime
   
  /* abstract */ def ToDateTime(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
                                millisecond : Int, era : Int): System.DateTime
   
  def ToFourDigitYear(year : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MinSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MaxSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val AlgorithmType : System.Globalization.CalendarAlgorithmType = System.Globalization.CalendarAlgorithmType.Unknown
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val IsReadOnly : Boolean = false
   
  val Eras : Array[Int] = Array.empty[Int]
   
  var TwoDigitYearMax : Int = 0
   
  protected def this() {}
}
object Calendar {
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def ReadOnly(calendar : System.Globalization.Calendar): System.Globalization.Calendar  = null
   
  val CurrentEra : Int  = 0
}
 
sealed abstract class CalendarAlgorithmType extends System.Enum {
  def ==(that: System.Globalization.CalendarAlgorithmType): Boolean = false
  def !=(that: System.Globalization.CalendarAlgorithmType): Boolean = false
  def  <(that: System.Globalization.CalendarAlgorithmType): Boolean = false
  def <=(that: System.Globalization.CalendarAlgorithmType): Boolean = false
  def  >(that: System.Globalization.CalendarAlgorithmType): Boolean = false
  def >=(that: System.Globalization.CalendarAlgorithmType): Boolean = false
  def  |(that: System.Globalization.CalendarAlgorithmType): Boolean = false
  def  &(that: System.Globalization.CalendarAlgorithmType): Boolean = false
  def  ^(that: System.Globalization.CalendarAlgorithmType): Boolean = false
}
object CalendarAlgorithmType{
  val Unknown	 = value(0)
  val SolarCalendar	 = value(1)
  val LunarCalendar	 = value(2)
  val LunisolarCalendar	 = value(3)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Globalization.CalendarAlgorithmType = null
}
 
sealed abstract class CalendarWeekRule extends System.Enum {
  def ==(that: System.Globalization.CalendarWeekRule): Boolean = false
  def !=(that: System.Globalization.CalendarWeekRule): Boolean = false
  def  <(that: System.Globalization.CalendarWeekRule): Boolean = false
  def <=(that: System.Globalization.CalendarWeekRule): Boolean = false
  def  >(that: System.Globalization.CalendarWeekRule): Boolean = false
  def >=(that: System.Globalization.CalendarWeekRule): Boolean = false
  def  |(that: System.Globalization.CalendarWeekRule): Boolean = false
  def  &(that: System.Globalization.CalendarWeekRule): Boolean = false
  def  ^(that: System.Globalization.CalendarWeekRule): Boolean = false
}
object CalendarWeekRule{
  val FirstDay	 = value(0)
  val FirstFullWeek	 = value(1)
  val FirstFourDayWeek	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Globalization.CalendarWeekRule = null
}
 
sealed class CharUnicodeInfo extends AnyRef 
object CharUnicodeInfo {
  def GetNumericValue(ch : Char): Double  = 0
   
  def GetNumericValue(s : String, index : Int): Double  = 0
   
  def GetDecimalDigitValue(ch : Char): Int  = 0
   
  def GetDecimalDigitValue(s : String, index : Int): Int  = 0
   
  def GetDigitValue(ch : Char): Int  = 0
   
  def GetDigitValue(s : String, index : Int): Int  = 0
   
  def GetUnicodeCategory(ch : Char): System.Globalization.UnicodeCategory  = System.Globalization.UnicodeCategory.UppercaseLetter
   
  def GetUnicodeCategory(s : String, index : Int): System.Globalization.UnicodeCategory  = System.Globalization.UnicodeCategory.UppercaseLetter
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
abstract class EastAsianLunisolarCalendar extends System.Globalization.Calendar {
  def GetSexagenaryYear(time : System.DateTime): Int
   
  def GetCelestialStem(sexagenaryYear : Int): Int
   
  def GetTerrestrialBranch(sexagenaryYear : Int): Int
   
  def GetDaysInMonth(year : Int, month : Int, era : Int): Int
   
  def ToDateTime(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
                 millisecond : Int, era : Int): System.DateTime
   
  def AddMonths(time : System.DateTime, months : Int): System.DateTime
   
  def AddYears(time : System.DateTime, years : Int): System.DateTime
   
  def GetDayOfYear(time : System.DateTime): Int
   
  def GetDayOfMonth(time : System.DateTime): Int
   
  def GetDaysInYear(year : Int, era : Int): Int
   
  def GetMonth(time : System.DateTime): Int
   
  def GetYear(time : System.DateTime): Int
   
  def GetDayOfWeek(time : System.DateTime): System.DayOfWeek
   
  def GetMonthsInYear(year : Int, era : Int): Int
   
  def IsLeapDay(year : Int, month : Int, day : Int, era : Int): Boolean
   
  def IsLeapMonth(year : Int, month : Int, era : Int): Boolean
   
  def GetLeapMonth(year : Int, era : Int): Int
   
  def IsLeapYear(year : Int, era : Int): Boolean
   
  def ToFourDigitYear(year : Int): Int
   
  val AlgorithmType : System.Globalization.CalendarAlgorithmType = System.Globalization.CalendarAlgorithmType.Unknown
   
  var TwoDigitYearMax : Int = 0
}
 
class ChineseLunisolarCalendar extends System.Globalization.EastAsianLunisolarCalendar {
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetEra(time : System.DateTime): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MinSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MaxSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val Eras : Array[Int] = Array.empty[Int]
   
  def this() {}
}
object ChineseLunisolarCalendar {
  val ChineseEra : Int  = 0
}
 
sealed abstract class CompareOptions extends System.Enum {
  def ==(that: System.Globalization.CompareOptions): Boolean = false
  def !=(that: System.Globalization.CompareOptions): Boolean = false
  def  <(that: System.Globalization.CompareOptions): Boolean = false
  def <=(that: System.Globalization.CompareOptions): Boolean = false
  def  >(that: System.Globalization.CompareOptions): Boolean = false
  def >=(that: System.Globalization.CompareOptions): Boolean = false
  def  |(that: System.Globalization.CompareOptions): Boolean = false
  def  &(that: System.Globalization.CompareOptions): Boolean = false
  def  ^(that: System.Globalization.CompareOptions): Boolean = false
}
object CompareOptions{
  val None	 = value(0)
  val IgnoreCase	 = value(1)
  val IgnoreNonSpace	 = value(2)
  val IgnoreSymbols	 = value(4)
  val IgnoreKanaType	 = value(8)
  val IgnoreWidth	 = value(16)
  val OrdinalIgnoreCase	 = value(268435456)
  val StringSort	 = value(536870912)
  val Ordinal	 = value(1073741824)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Globalization.CompareOptions = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class CompareInfo extends AnyRef with System.Runtime.Serialization.IDeserializationCallback {
  def Compare(string1 : String, string2 : String): Int
   
  def Compare(string1 : String, string2 : String, options : System.Globalization.CompareOptions): Int
   
  def Compare(string1 : String, offset1 : Int, length1 : Int, string2 : String, offset2 : Int, 
              length2 : Int): Int
   
  def Compare(string1 : String, offset1 : Int, string2 : String, offset2 : Int, 
              options : System.Globalization.CompareOptions): Int
   
  def Compare(string1 : String, offset1 : Int, string2 : String, offset2 : Int): Int
   
  def Compare(string1 : String, offset1 : Int, length1 : Int, string2 : String, offset2 : Int, 
              length2 : Int, options : System.Globalization.CompareOptions): Int
   
  def IsPrefix(source : String, prefix : String, options : System.Globalization.CompareOptions): Boolean
   
  def IsPrefix(source : String, prefix : String): Boolean
   
  def IsSuffix(source : String, suffix : String, options : System.Globalization.CompareOptions): Boolean
   
  def IsSuffix(source : String, suffix : String): Boolean
   
  def IndexOf(source : String, value : Char): Int
   
  def IndexOf(source : String, value : String): Int
   
  def IndexOf(source : String, value : Char, options : System.Globalization.CompareOptions): Int
   
  def IndexOf(source : String, value : String, options : System.Globalization.CompareOptions): Int
   
  def IndexOf(source : String, value : Char, startIndex : Int): Int
   
  def IndexOf(source : String, value : String, startIndex : Int): Int
   
  def IndexOf(source : String, value : Char, startIndex : Int, 
              options : System.Globalization.CompareOptions): Int
   
  def IndexOf(source : String, value : String, startIndex : Int, 
              options : System.Globalization.CompareOptions): Int
   
  def IndexOf(source : String, value : Char, startIndex : Int, count : Int): Int
   
  def IndexOf(source : String, value : String, startIndex : Int, count : Int): Int
   
  def IndexOf(source : String, value : Char, startIndex : Int, count : Int, 
              options : System.Globalization.CompareOptions): Int
   
  def IndexOf(source : String, value : String, startIndex : Int, count : Int, 
              options : System.Globalization.CompareOptions): Int
   
  def LastIndexOf(source : String, value : Char): Int
   
  def LastIndexOf(source : String, value : String): Int
   
  def LastIndexOf(source : String, value : Char, options : System.Globalization.CompareOptions): Int
   
  def LastIndexOf(source : String, value : String, options : System.Globalization.CompareOptions): Int
   
  def LastIndexOf(source : String, value : Char, startIndex : Int): Int
   
  def LastIndexOf(source : String, value : String, startIndex : Int): Int
   
  def LastIndexOf(source : String, value : Char, startIndex : Int, 
                  options : System.Globalization.CompareOptions): Int
   
  def LastIndexOf(source : String, value : String, startIndex : Int, 
                  options : System.Globalization.CompareOptions): Int
   
  def LastIndexOf(source : String, value : Char, startIndex : Int, count : Int): Int
   
  def LastIndexOf(source : String, value : String, startIndex : Int, count : Int): Int
   
  def LastIndexOf(source : String, value : Char, startIndex : Int, count : Int, 
                  options : System.Globalization.CompareOptions): Int
   
  def LastIndexOf(source : String, value : String, startIndex : Int, count : Int, 
                  options : System.Globalization.CompareOptions): Int
   
  def GetSortKey(source : String, options : System.Globalization.CompareOptions): System.Globalization.SortKey
   
  def GetSortKey(source : String): System.Globalization.SortKey
   
  def Equals(value : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val Name : String = ""
   
  val LCID : Int = 0
}
object CompareInfo {
  def GetCompareInfo(culture : Int, assembly : System.Reflection.Assembly): System.Globalization.CompareInfo  = null
   
  def GetCompareInfo(name : String, assembly : System.Reflection.Assembly): System.Globalization.CompareInfo  = null
   
  def GetCompareInfo(culture : Int): System.Globalization.CompareInfo  = null
   
  def GetCompareInfo(name : String): System.Globalization.CompareInfo  = null
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def IsSortable(ch : Char): Boolean  = false
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def IsSortable(text : String): Boolean  = false
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class CultureInfo extends AnyRef with System.ICloneable with System.IFormatProvider {
  def Equals(value : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def GetFormat(formatType : System.Type): AnyRef
   
  def ClearCachedData: Unit
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetConsoleFallbackUICulture: System.Globalization.CultureInfo
   
  def Clone: AnyRef
   
  val Parent : System.Globalization.CultureInfo = null
   
  val LCID : Int = 0
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val KeyboardLayoutId : Int = 0
   
  val Name : String = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val IetfLanguageTag : String = ""
   
  val DisplayName : String = ""
   
  val NativeName : String = ""
   
  val EnglishName : String = ""
   
  val TwoLetterISOLanguageName : String = ""
   
  val ThreeLetterISOLanguageName : String = ""
   
  val ThreeLetterWindowsLanguageName : String = ""
   
  val CompareInfo : System.Globalization.CompareInfo = null
   
  val TextInfo : System.Globalization.TextInfo = null
   
  val IsNeutralCulture : Boolean = false
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val CultureTypes : System.Globalization.CultureTypes = System.Globalization.CultureTypes.NeutralCultures
   
  var NumberFormat : System.Globalization.NumberFormatInfo = null
   
  var DateTimeFormat : System.Globalization.DateTimeFormatInfo = null
   
  val Calendar : System.Globalization.Calendar = null
   
  val OptionalCalendars : Array[System.Globalization.Calendar] = Array.empty[System.Globalization.Calendar]
   
  val UseUserOverride : Boolean = false
   
  val IsReadOnly : Boolean = false
   
  def this(name : String) {}
   
  def this(name : String, useUserOverride : Boolean) {}
   
  def this(culture : Int) {}
   
  def this(culture : Int, useUserOverride : Boolean) {}
}
object CultureInfo {
  def CreateSpecificCulture(name : String): System.Globalization.CultureInfo  = null
   
  def GetCultures(types : System.Globalization.CultureTypes): Array[System.Globalization.CultureInfo]  = Array.empty[System.Globalization.CultureInfo]
   
  def ReadOnly(ci : System.Globalization.CultureInfo): System.Globalization.CultureInfo  = null
   
  def GetCultureInfo(culture : Int): System.Globalization.CultureInfo  = null
   
  def GetCultureInfo(name : String): System.Globalization.CultureInfo  = null
   
  def GetCultureInfo(name : String, altName : String): System.Globalization.CultureInfo  = null
   
  def GetCultureInfoByIetfLanguageTag(name : String): System.Globalization.CultureInfo  = null
   
  val CurrentCulture : System.Globalization.CultureInfo = null
   
  val CurrentUICulture : System.Globalization.CultureInfo = null
   
  val InstalledUICulture : System.Globalization.CultureInfo = null
   
  val InvariantCulture : System.Globalization.CultureInfo = null
}
 
sealed abstract class CultureTypes extends System.Enum {
  def ==(that: System.Globalization.CultureTypes): Boolean = false
  def !=(that: System.Globalization.CultureTypes): Boolean = false
  def  <(that: System.Globalization.CultureTypes): Boolean = false
  def <=(that: System.Globalization.CultureTypes): Boolean = false
  def  >(that: System.Globalization.CultureTypes): Boolean = false
  def >=(that: System.Globalization.CultureTypes): Boolean = false
  def  |(that: System.Globalization.CultureTypes): Boolean = false
  def  &(that: System.Globalization.CultureTypes): Boolean = false
  def  ^(that: System.Globalization.CultureTypes): Boolean = false
}
object CultureTypes{
  val NeutralCultures	 = value(1)
  val SpecificCultures	 = value(2)
  val InstalledWin32Cultures	 = value(4)
  val AllCultures	 = value(7)
  val UserCustomCulture	 = value(8)
  val ReplacementCultures	 = value(16)
  val WindowsOnlyCultures	 = value(32)
  val FrameworkCultures	 = value(64)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Globalization.CultureTypes = null
}
 
sealed abstract class DateTimeStyles extends System.Enum {
  def ==(that: System.Globalization.DateTimeStyles): Boolean = false
  def !=(that: System.Globalization.DateTimeStyles): Boolean = false
  def  <(that: System.Globalization.DateTimeStyles): Boolean = false
  def <=(that: System.Globalization.DateTimeStyles): Boolean = false
  def  >(that: System.Globalization.DateTimeStyles): Boolean = false
  def >=(that: System.Globalization.DateTimeStyles): Boolean = false
  def  |(that: System.Globalization.DateTimeStyles): Boolean = false
  def  &(that: System.Globalization.DateTimeStyles): Boolean = false
  def  ^(that: System.Globalization.DateTimeStyles): Boolean = false
}
object DateTimeStyles{
  val None	 = value(0)
  val AllowLeadingWhite	 = value(1)
  val AllowTrailingWhite	 = value(2)
  val AllowInnerWhite	 = value(4)
  val AllowWhiteSpaces	 = value(7)
  val NoCurrentDateDefault	 = value(8)
  val AdjustToUniversal	 = value(16)
  val AssumeLocal	 = value(32)
  val AssumeUniversal	 = value(64)
  val RoundtripKind	 = value(128)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Globalization.DateTimeStyles = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class DateTimeFormatInfo extends AnyRef with System.ICloneable with System.IFormatProvider {
  def GetFormat(formatType : System.Type): AnyRef
   
  def Clone: AnyRef
   
  def GetEra(eraName : String): Int
   
  def GetEraName(era : Int): String
   
  def GetAbbreviatedEraName(era : Int): String
   
  def GetAbbreviatedDayName(dayofweek : System.DayOfWeek): String
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetShortestDayName(dayOfWeek : System.DayOfWeek): String
   
  def GetAllDateTimePatterns: Array[String]
   
  def GetAllDateTimePatterns(format : Char): Array[String]
   
  def GetDayName(dayofweek : System.DayOfWeek): String
   
  def GetAbbreviatedMonthName(month : Int): String
   
  def GetMonthName(month : Int): String
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def SetAllDateTimePatterns(patterns : Array[String], format : Char): Unit
   
  var AMDesignator : String = ""
   
  var Calendar : System.Globalization.Calendar = null
   
  var DateSeparator : String = ""
   
  var FirstDayOfWeek : System.DayOfWeek = System.DayOfWeek.Sunday
   
  var CalendarWeekRule : System.Globalization.CalendarWeekRule = System.Globalization.CalendarWeekRule.FirstDay
   
  var FullDateTimePattern : String = ""
   
  var LongDatePattern : String = ""
   
  var LongTimePattern : String = ""
   
  var MonthDayPattern : String = ""
   
  var PMDesignator : String = ""
   
  val RFC1123Pattern : String = ""
   
  var ShortDatePattern : String = ""
   
  var ShortTimePattern : String = ""
   
  val SortableDateTimePattern : String = ""
   
  var TimeSeparator : String = ""
   
  val UniversalSortableDateTimePattern : String = ""
   
  var YearMonthPattern : String = ""
   
  var AbbreviatedDayNames : Array[String] = Array.empty[String]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var ShortestDayNames : Array[String] = Array.empty[String]
   
  var DayNames : Array[String] = Array.empty[String]
   
  var AbbreviatedMonthNames : Array[String] = Array.empty[String]
   
  var MonthNames : Array[String] = Array.empty[String]
   
  val IsReadOnly : Boolean = false
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val NativeCalendarName : String = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var AbbreviatedMonthGenitiveNames : Array[String] = Array.empty[String]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var MonthGenitiveNames : Array[String] = Array.empty[String]
   
  def this() {}
}
object DateTimeFormatInfo {
  def GetInstance(provider : System.IFormatProvider): System.Globalization.DateTimeFormatInfo  = null
   
  def ReadOnly(dtfi : System.Globalization.DateTimeFormatInfo): System.Globalization.DateTimeFormatInfo  = null
   
  val InvariantInfo : System.Globalization.DateTimeFormatInfo = null
   
  val CurrentInfo : System.Globalization.DateTimeFormatInfo = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class DaylightTime extends AnyRef {
  val Start : System.DateTime = new System.DateTime()
   
  val End : System.DateTime = new System.DateTime()
   
  val Delta : System.TimeSpan = new System.TimeSpan()
   
  def this(start : System.DateTime, end : System.DateTime, delta : System.TimeSpan) {}
}
 
sealed abstract class DigitShapes extends System.Enum {
  def ==(that: System.Globalization.DigitShapes): Boolean = false
  def !=(that: System.Globalization.DigitShapes): Boolean = false
  def  <(that: System.Globalization.DigitShapes): Boolean = false
  def <=(that: System.Globalization.DigitShapes): Boolean = false
  def  >(that: System.Globalization.DigitShapes): Boolean = false
  def >=(that: System.Globalization.DigitShapes): Boolean = false
  def  |(that: System.Globalization.DigitShapes): Boolean = false
  def  &(that: System.Globalization.DigitShapes): Boolean = false
  def  ^(that: System.Globalization.DigitShapes): Boolean = false
}
object DigitShapes{
  val Context	 = value(0)
  val None	 = value(1)
  val NativeNational	 = value(2)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Globalization.DigitShapes = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class GregorianCalendar extends System.Globalization.Calendar {
  def AddMonths(time : System.DateTime, months : Int): System.DateTime
   
  def AddYears(time : System.DateTime, years : Int): System.DateTime
   
  def GetDayOfMonth(time : System.DateTime): Int
   
  def GetDayOfWeek(time : System.DateTime): System.DayOfWeek
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetWeekOfYear(time : System.DateTime, rule : System.Globalization.CalendarWeekRule, 
                    firstDayOfWeek : System.DayOfWeek): Int
   
  def GetDayOfYear(time : System.DateTime): Int
   
  def GetDaysInMonth(year : Int, month : Int, era : Int): Int
   
  def GetDaysInYear(year : Int, era : Int): Int
   
  def GetEra(time : System.DateTime): Int
   
  def GetMonth(time : System.DateTime): Int
   
  def GetMonthsInYear(year : Int, era : Int): Int
   
  def GetYear(time : System.DateTime): Int
   
  def IsLeapDay(year : Int, month : Int, day : Int, era : Int): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetLeapMonth(year : Int, era : Int): Int
   
  def IsLeapMonth(year : Int, month : Int, era : Int): Boolean
   
  def IsLeapYear(year : Int, era : Int): Boolean
   
  def ToDateTime(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
                 millisecond : Int, era : Int): System.DateTime
   
  def ToFourDigitYear(year : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MinSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MaxSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val AlgorithmType : System.Globalization.CalendarAlgorithmType = System.Globalization.CalendarAlgorithmType.Unknown
   
  var CalendarType : System.Globalization.GregorianCalendarTypes = System.Globalization.GregorianCalendarTypes.Localized
   
  val Eras : Array[Int] = Array.empty[Int]
   
  var TwoDigitYearMax : Int = 0
   
  def this() {}
   
  def this(`type` : System.Globalization.GregorianCalendarTypes) {}
}
object GregorianCalendar {
  val ADEra : Int  = 0
}
 
sealed abstract class GregorianCalendarTypes extends System.Enum {
  def ==(that: System.Globalization.GregorianCalendarTypes): Boolean = false
  def !=(that: System.Globalization.GregorianCalendarTypes): Boolean = false
  def  <(that: System.Globalization.GregorianCalendarTypes): Boolean = false
  def <=(that: System.Globalization.GregorianCalendarTypes): Boolean = false
  def  >(that: System.Globalization.GregorianCalendarTypes): Boolean = false
  def >=(that: System.Globalization.GregorianCalendarTypes): Boolean = false
  def  |(that: System.Globalization.GregorianCalendarTypes): Boolean = false
  def  &(that: System.Globalization.GregorianCalendarTypes): Boolean = false
  def  ^(that: System.Globalization.GregorianCalendarTypes): Boolean = false
}
object GregorianCalendarTypes{
  val Localized	 = value(1)
  val USEnglish	 = value(2)
  val MiddleEastFrench	 = value(9)
  val Arabic	 = value(10)
  val TransliteratedEnglish	 = value(11)
  val TransliteratedFrench	 = value(12)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Globalization.GregorianCalendarTypes = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class HebrewCalendar extends System.Globalization.Calendar {
  def AddMonths(time : System.DateTime, months : Int): System.DateTime
   
  def AddYears(time : System.DateTime, years : Int): System.DateTime
   
  def GetDayOfMonth(time : System.DateTime): Int
   
  def GetDayOfWeek(time : System.DateTime): System.DayOfWeek
   
  def GetDayOfYear(time : System.DateTime): Int
   
  def GetDaysInMonth(year : Int, month : Int, era : Int): Int
   
  def GetDaysInYear(year : Int, era : Int): Int
   
  def GetEra(time : System.DateTime): Int
   
  def GetMonth(time : System.DateTime): Int
   
  def GetMonthsInYear(year : Int, era : Int): Int
   
  def GetYear(time : System.DateTime): Int
   
  def IsLeapDay(year : Int, month : Int, day : Int, era : Int): Boolean
   
  def GetLeapMonth(year : Int, era : Int): Int
   
  def IsLeapMonth(year : Int, month : Int, era : Int): Boolean
   
  def IsLeapYear(year : Int, era : Int): Boolean
   
  def ToDateTime(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
                 millisecond : Int, era : Int): System.DateTime
   
  def ToFourDigitYear(year : Int): Int
   
  val MinSupportedDateTime : System.DateTime = new System.DateTime()
   
  val MaxSupportedDateTime : System.DateTime = new System.DateTime()
   
  val AlgorithmType : System.Globalization.CalendarAlgorithmType = System.Globalization.CalendarAlgorithmType.Unknown
   
  val Eras : Array[Int] = Array.empty[Int]
   
  var TwoDigitYearMax : Int = 0
   
  def this() {}
}
object HebrewCalendar {
  val HebrewEra : Int  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class HijriCalendar extends System.Globalization.Calendar {
  def AddMonths(time : System.DateTime, months : Int): System.DateTime
   
  def AddYears(time : System.DateTime, years : Int): System.DateTime
   
  def GetDayOfMonth(time : System.DateTime): Int
   
  def GetDayOfWeek(time : System.DateTime): System.DayOfWeek
   
  def GetDayOfYear(time : System.DateTime): Int
   
  def GetDaysInMonth(year : Int, month : Int, era : Int): Int
   
  def GetDaysInYear(year : Int, era : Int): Int
   
  def GetEra(time : System.DateTime): Int
   
  def GetMonth(time : System.DateTime): Int
   
  def GetMonthsInYear(year : Int, era : Int): Int
   
  def GetYear(time : System.DateTime): Int
   
  def IsLeapDay(year : Int, month : Int, day : Int, era : Int): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetLeapMonth(year : Int, era : Int): Int
   
  def IsLeapMonth(year : Int, month : Int, era : Int): Boolean
   
  def IsLeapYear(year : Int, era : Int): Boolean
   
  def ToDateTime(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
                 millisecond : Int, era : Int): System.DateTime
   
  def ToFourDigitYear(year : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MinSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MaxSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val AlgorithmType : System.Globalization.CalendarAlgorithmType = System.Globalization.CalendarAlgorithmType.Unknown
   
  var HijriAdjustment : Int = 0
   
  val Eras : Array[Int] = Array.empty[Int]
   
  var TwoDigitYearMax : Int = 0
   
  def this() {}
}
object HijriCalendar {
  val HijriEra : Int  = 0
}
 
sealed class IdnMapping extends AnyRef {
  def GetAscii(unicode : String): String
   
  def GetAscii(unicode : String, index : Int): String
   
  def GetAscii(unicode : String, index : Int, count : Int): String
   
  def GetUnicode(ascii : String): String
   
  def GetUnicode(ascii : String, index : Int): String
   
  def GetUnicode(ascii : String, index : Int, count : Int): String
   
  def Equals(obj : AnyRef): Boolean
   
  def GetHashCode: Int
   
  var AllowUnassigned : Boolean = false
   
  var UseStd3AsciiRules : Boolean = false
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class JapaneseCalendar extends System.Globalization.Calendar {
  def AddMonths(time : System.DateTime, months : Int): System.DateTime
   
  def AddYears(time : System.DateTime, years : Int): System.DateTime
   
  def GetDaysInMonth(year : Int, month : Int, era : Int): Int
   
  def GetDaysInYear(year : Int, era : Int): Int
   
  def GetDayOfMonth(time : System.DateTime): Int
   
  def GetDayOfWeek(time : System.DateTime): System.DayOfWeek
   
  def GetDayOfYear(time : System.DateTime): Int
   
  def GetMonthsInYear(year : Int, era : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetWeekOfYear(time : System.DateTime, rule : System.Globalization.CalendarWeekRule, 
                    firstDayOfWeek : System.DayOfWeek): Int
   
  def GetEra(time : System.DateTime): Int
   
  def GetMonth(time : System.DateTime): Int
   
  def GetYear(time : System.DateTime): Int
   
  def IsLeapDay(year : Int, month : Int, day : Int, era : Int): Boolean
   
  def IsLeapYear(year : Int, era : Int): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetLeapMonth(year : Int, era : Int): Int
   
  def IsLeapMonth(year : Int, month : Int, era : Int): Boolean
   
  def ToDateTime(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
                 millisecond : Int, era : Int): System.DateTime
   
  def ToFourDigitYear(year : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MinSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MaxSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val AlgorithmType : System.Globalization.CalendarAlgorithmType = System.Globalization.CalendarAlgorithmType.Unknown
   
  val Eras : Array[Int] = Array.empty[Int]
   
  var TwoDigitYearMax : Int = 0
   
  def this() {}
}
 
class JapaneseLunisolarCalendar extends System.Globalization.EastAsianLunisolarCalendar {
  def GetEra(time : System.DateTime): Int
   
  val MinSupportedDateTime : System.DateTime = new System.DateTime()
   
  val MaxSupportedDateTime : System.DateTime = new System.DateTime()
   
  val Eras : Array[Int] = Array.empty[Int]
   
  def this() {}
}
object JapaneseLunisolarCalendar {
  val JapaneseEra : Int  = 0
}
 
class PersianCalendar extends System.Globalization.Calendar {
  def AddMonths(time : System.DateTime, months : Int): System.DateTime
   
  def AddYears(time : System.DateTime, years : Int): System.DateTime
   
  def GetDayOfMonth(time : System.DateTime): Int
   
  def GetDayOfWeek(time : System.DateTime): System.DayOfWeek
   
  def GetDayOfYear(time : System.DateTime): Int
   
  def GetDaysInMonth(year : Int, month : Int, era : Int): Int
   
  def GetDaysInYear(year : Int, era : Int): Int
   
  def GetEra(time : System.DateTime): Int
   
  def GetMonth(time : System.DateTime): Int
   
  def GetMonthsInYear(year : Int, era : Int): Int
   
  def GetYear(time : System.DateTime): Int
   
  def IsLeapDay(year : Int, month : Int, day : Int, era : Int): Boolean
   
  def GetLeapMonth(year : Int, era : Int): Int
   
  def IsLeapMonth(year : Int, month : Int, era : Int): Boolean
   
  def IsLeapYear(year : Int, era : Int): Boolean
   
  def ToDateTime(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
                 millisecond : Int, era : Int): System.DateTime
   
  def ToFourDigitYear(year : Int): Int
   
  val MinSupportedDateTime : System.DateTime = new System.DateTime()
   
  val MaxSupportedDateTime : System.DateTime = new System.DateTime()
   
  val AlgorithmType : System.Globalization.CalendarAlgorithmType = System.Globalization.CalendarAlgorithmType.Unknown
   
  val Eras : Array[Int] = Array.empty[Int]
   
  var TwoDigitYearMax : Int = 0
   
  def this() {}
}
object PersianCalendar {
  val PersianEra : Int  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class JulianCalendar extends System.Globalization.Calendar {
  def AddMonths(time : System.DateTime, months : Int): System.DateTime
   
  def AddYears(time : System.DateTime, years : Int): System.DateTime
   
  def GetDayOfMonth(time : System.DateTime): Int
   
  def GetDayOfWeek(time : System.DateTime): System.DayOfWeek
   
  def GetDayOfYear(time : System.DateTime): Int
   
  def GetDaysInMonth(year : Int, month : Int, era : Int): Int
   
  def GetDaysInYear(year : Int, era : Int): Int
   
  def GetEra(time : System.DateTime): Int
   
  def GetMonth(time : System.DateTime): Int
   
  def GetMonthsInYear(year : Int, era : Int): Int
   
  def GetYear(time : System.DateTime): Int
   
  def IsLeapDay(year : Int, month : Int, day : Int, era : Int): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetLeapMonth(year : Int, era : Int): Int
   
  def IsLeapMonth(year : Int, month : Int, era : Int): Boolean
   
  def IsLeapYear(year : Int, era : Int): Boolean
   
  def ToDateTime(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
                 millisecond : Int, era : Int): System.DateTime
   
  def ToFourDigitYear(year : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MinSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MaxSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val AlgorithmType : System.Globalization.CalendarAlgorithmType = System.Globalization.CalendarAlgorithmType.Unknown
   
  val Eras : Array[Int] = Array.empty[Int]
   
  var TwoDigitYearMax : Int = 0
   
  def this() {}
}
object JulianCalendar {
  val JulianEra : Int  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class KoreanCalendar extends System.Globalization.Calendar {
  def AddMonths(time : System.DateTime, months : Int): System.DateTime
   
  def AddYears(time : System.DateTime, years : Int): System.DateTime
   
  def GetDaysInMonth(year : Int, month : Int, era : Int): Int
   
  def GetDaysInYear(year : Int, era : Int): Int
   
  def GetDayOfMonth(time : System.DateTime): Int
   
  def GetDayOfWeek(time : System.DateTime): System.DayOfWeek
   
  def GetDayOfYear(time : System.DateTime): Int
   
  def GetMonthsInYear(year : Int, era : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetWeekOfYear(time : System.DateTime, rule : System.Globalization.CalendarWeekRule, 
                    firstDayOfWeek : System.DayOfWeek): Int
   
  def GetEra(time : System.DateTime): Int
   
  def GetMonth(time : System.DateTime): Int
   
  def GetYear(time : System.DateTime): Int
   
  def IsLeapDay(year : Int, month : Int, day : Int, era : Int): Boolean
   
  def IsLeapYear(year : Int, era : Int): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetLeapMonth(year : Int, era : Int): Int
   
  def IsLeapMonth(year : Int, month : Int, era : Int): Boolean
   
  def ToDateTime(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
                 millisecond : Int, era : Int): System.DateTime
   
  def ToFourDigitYear(year : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MinSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MaxSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val AlgorithmType : System.Globalization.CalendarAlgorithmType = System.Globalization.CalendarAlgorithmType.Unknown
   
  val Eras : Array[Int] = Array.empty[Int]
   
  var TwoDigitYearMax : Int = 0
   
  def this() {}
}
object KoreanCalendar {
  val KoreanEra : Int  = 0
}
 
class KoreanLunisolarCalendar extends System.Globalization.EastAsianLunisolarCalendar {
  def GetEra(time : System.DateTime): Int
   
  val MinSupportedDateTime : System.DateTime = new System.DateTime()
   
  val MaxSupportedDateTime : System.DateTime = new System.DateTime()
   
  val Eras : Array[Int] = Array.empty[Int]
   
  def this() {}
}
object KoreanLunisolarCalendar {
  val GregorianEra : Int  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class RegionInfo extends AnyRef {
  def Equals(value : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  val Name : String = ""
   
  val EnglishName : String = ""
   
  val DisplayName : String = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val NativeName : String = ""
   
  val TwoLetterISORegionName : String = ""
   
  val ThreeLetterISORegionName : String = ""
   
  val IsMetric : Boolean = false
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val GeoId : Int = 0
   
  val ThreeLetterWindowsRegionName : String = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val CurrencyEnglishName : String = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val CurrencyNativeName : String = ""
   
  val CurrencySymbol : String = ""
   
  val ISOCurrencySymbol : String = ""
   
  def this(name : String) {}
   
  def this(culture : Int) {}
}
object RegionInfo {
  val CurrentRegion : System.Globalization.RegionInfo = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class SortKey extends AnyRef {
  def Equals(value : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  val OriginalString : String = ""
   
  val KeyData : Array[UByte] = Array.empty[UByte]
}
object SortKey {
  def Compare(sortkey1 : System.Globalization.SortKey, sortkey2 : System.Globalization.SortKey): Int  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class StringInfo extends AnyRef {
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Equals(value : AnyRef): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetHashCode: Int
   
  def SubstringByTextElements(startingTextElement : Int): String
   
  def SubstringByTextElements(startingTextElement : Int, lengthInTextElements : Int): String
   
  var String : String = ""
   
  val LengthInTextElements : Int = 0
   
  def this() {}
   
  def this(value : String) {}
}
object StringInfo {
  def GetNextTextElement(str : String): String  = ""
   
  def GetNextTextElement(str : String, index : Int): String  = ""
   
  def GetTextElementEnumerator(str : String): System.Globalization.TextElementEnumerator  = null
   
  def GetTextElementEnumerator(str : String, index : Int): System.Globalization.TextElementEnumerator  = null
   
  def ParseCombiningCharacters(str : String): Array[Int]  = Array.empty[Int]
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class TaiwanCalendar extends System.Globalization.Calendar {
  def AddMonths(time : System.DateTime, months : Int): System.DateTime
   
  def AddYears(time : System.DateTime, years : Int): System.DateTime
   
  def GetDaysInMonth(year : Int, month : Int, era : Int): Int
   
  def GetDaysInYear(year : Int, era : Int): Int
   
  def GetDayOfMonth(time : System.DateTime): Int
   
  def GetDayOfWeek(time : System.DateTime): System.DayOfWeek
   
  def GetDayOfYear(time : System.DateTime): Int
   
  def GetMonthsInYear(year : Int, era : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetWeekOfYear(time : System.DateTime, rule : System.Globalization.CalendarWeekRule, 
                    firstDayOfWeek : System.DayOfWeek): Int
   
  def GetEra(time : System.DateTime): Int
   
  def GetMonth(time : System.DateTime): Int
   
  def GetYear(time : System.DateTime): Int
   
  def IsLeapDay(year : Int, month : Int, day : Int, era : Int): Boolean
   
  def IsLeapYear(year : Int, era : Int): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetLeapMonth(year : Int, era : Int): Int
   
  def IsLeapMonth(year : Int, month : Int, era : Int): Boolean
   
  def ToDateTime(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
                 millisecond : Int, era : Int): System.DateTime
   
  def ToFourDigitYear(year : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MinSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MaxSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val AlgorithmType : System.Globalization.CalendarAlgorithmType = System.Globalization.CalendarAlgorithmType.Unknown
   
  val Eras : Array[Int] = Array.empty[Int]
   
  var TwoDigitYearMax : Int = 0
   
  def this() {}
}
 
class TaiwanLunisolarCalendar extends System.Globalization.EastAsianLunisolarCalendar {
  def GetEra(time : System.DateTime): Int
   
  val MinSupportedDateTime : System.DateTime = new System.DateTime()
   
  val MaxSupportedDateTime : System.DateTime = new System.DateTime()
   
  val Eras : Array[Int] = Array.empty[Int]
   
  def this() {}
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class TextElementEnumerator extends AnyRef with System.Collections.IEnumerator {
  def MoveNext: Boolean
   
  def GetTextElement: String
   
  def Reset: Unit
   
  val Current : AnyRef = null
   
  val ElementIndex : Int = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class TextInfo extends AnyRef with System.ICloneable with System.Runtime.Serialization.IDeserializationCallback {
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def Clone: AnyRef
   
  def ToLower(c : Char): Char
   
  def ToLower(str : String): String
   
  def ToUpper(c : Char): Char
   
  def ToUpper(str : String): String
   
  def Equals(obj : AnyRef): Boolean
   
  def GetHashCode: Int
   
  def ToString: String
   
  def ToTitleCase(str : String): String
   
  val ANSICodePage : Int = 0
   
  val OEMCodePage : Int = 0
   
  val MacCodePage : Int = 0
   
  val EBCDICCodePage : Int = 0
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val LCID : Int = 0
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val CultureName : String = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val IsReadOnly : Boolean = false
   
  var ListSeparator : String = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val IsRightToLeft : Boolean = false
}
object TextInfo {
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def ReadOnly(textInfo : System.Globalization.TextInfo): System.Globalization.TextInfo  = null
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
class ThaiBuddhistCalendar extends System.Globalization.Calendar {
  def AddMonths(time : System.DateTime, months : Int): System.DateTime
   
  def AddYears(time : System.DateTime, years : Int): System.DateTime
   
  def GetDaysInMonth(year : Int, month : Int, era : Int): Int
   
  def GetDaysInYear(year : Int, era : Int): Int
   
  def GetDayOfMonth(time : System.DateTime): Int
   
  def GetDayOfWeek(time : System.DateTime): System.DayOfWeek
   
  def GetDayOfYear(time : System.DateTime): Int
   
  def GetMonthsInYear(year : Int, era : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetWeekOfYear(time : System.DateTime, rule : System.Globalization.CalendarWeekRule, 
                    firstDayOfWeek : System.DayOfWeek): Int
   
  def GetEra(time : System.DateTime): Int
   
  def GetMonth(time : System.DateTime): Int
   
  def GetYear(time : System.DateTime): Int
   
  def IsLeapDay(year : Int, month : Int, day : Int, era : Int): Boolean
   
  def IsLeapYear(year : Int, era : Int): Boolean
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  def GetLeapMonth(year : Int, era : Int): Int
   
  def IsLeapMonth(year : Int, month : Int, era : Int): Boolean
   
  def ToDateTime(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
                 millisecond : Int, era : Int): System.DateTime
   
  def ToFourDigitYear(year : Int): Int
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MinSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val MaxSupportedDateTime : System.DateTime = new System.DateTime()
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  val AlgorithmType : System.Globalization.CalendarAlgorithmType = System.Globalization.CalendarAlgorithmType.Unknown
   
  val Eras : Array[Int] = Array.empty[Int]
   
  var TwoDigitYearMax : Int = 0
   
  def this() {}
}
object ThaiBuddhistCalendar {
  val ThaiBuddhistEra : Int  = 0
}
 
@System.Runtime.InteropServices.ComVisibleAttribute(true)
sealed class NumberFormatInfo extends AnyRef with System.ICloneable with System.IFormatProvider {
  def Clone: AnyRef
   
  def GetFormat(formatType : System.Type): AnyRef
   
  var CurrencyDecimalDigits : Int = 0
   
  var CurrencyDecimalSeparator : String = ""
   
  val IsReadOnly : Boolean = false
   
  var CurrencyGroupSizes : Array[Int] = Array.empty[Int]
   
  var NumberGroupSizes : Array[Int] = Array.empty[Int]
   
  var PercentGroupSizes : Array[Int] = Array.empty[Int]
   
  var CurrencyGroupSeparator : String = ""
   
  var CurrencySymbol : String = ""
   
  var NaNSymbol : String = ""
   
  var CurrencyNegativePattern : Int = 0
   
  var NumberNegativePattern : Int = 0
   
  var PercentPositivePattern : Int = 0
   
  var PercentNegativePattern : Int = 0
   
  var NegativeInfinitySymbol : String = ""
   
  var NegativeSign : String = ""
   
  var NumberDecimalDigits : Int = 0
   
  var NumberDecimalSeparator : String = ""
   
  var NumberGroupSeparator : String = ""
   
  var CurrencyPositivePattern : Int = 0
   
  var PositiveInfinitySymbol : String = ""
   
  var PositiveSign : String = ""
   
  var PercentDecimalDigits : Int = 0
   
  var PercentDecimalSeparator : String = ""
   
  var PercentGroupSeparator : String = ""
   
  var PercentSymbol : String = ""
   
  var PerMilleSymbol : String = ""
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var NativeDigits : Array[String] = Array.empty[String]
   
  @System.Runtime.InteropServices.ComVisibleAttribute(false)
  var DigitSubstitution : System.Globalization.DigitShapes = System.Globalization.DigitShapes.Context
   
  def this() {}
}
object NumberFormatInfo {
  def GetInstance(formatProvider : System.IFormatProvider): System.Globalization.NumberFormatInfo  = null
   
  def ReadOnly(nfi : System.Globalization.NumberFormatInfo): System.Globalization.NumberFormatInfo  = null
   
  val InvariantInfo : System.Globalization.NumberFormatInfo = null
   
  val CurrentInfo : System.Globalization.NumberFormatInfo = null
}
 
sealed abstract class NumberStyles extends System.Enum {
  def ==(that: System.Globalization.NumberStyles): Boolean = false
  def !=(that: System.Globalization.NumberStyles): Boolean = false
  def  <(that: System.Globalization.NumberStyles): Boolean = false
  def <=(that: System.Globalization.NumberStyles): Boolean = false
  def  >(that: System.Globalization.NumberStyles): Boolean = false
  def >=(that: System.Globalization.NumberStyles): Boolean = false
  def  |(that: System.Globalization.NumberStyles): Boolean = false
  def  &(that: System.Globalization.NumberStyles): Boolean = false
  def  ^(that: System.Globalization.NumberStyles): Boolean = false
}
object NumberStyles{
  val None	 = value(0)
  val AllowLeadingWhite	 = value(1)
  val AllowTrailingWhite	 = value(2)
  val AllowLeadingSign	 = value(4)
  val AllowTrailingSign	 = value(8)
  val AllowParentheses	 = value(16)
  val AllowDecimalPoint	 = value(32)
  val AllowThousands	 = value(64)
  val AllowExponent	 = value(128)
  val AllowCurrencySymbol	 = value(256)
  val AllowHexSpecifier	 = value(512)
  val Integer	 = value(7)
  val HexNumber	 = value(515)
  val Number	 = value(111)
  val Float	 = value(167)
  val Currency	 = value(383)
  val Any	 = value(511)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Globalization.NumberStyles = null
}
 
class UmAlQuraCalendar extends System.Globalization.Calendar {
  def AddMonths(time : System.DateTime, months : Int): System.DateTime
   
  def AddYears(time : System.DateTime, years : Int): System.DateTime
   
  def GetDayOfMonth(time : System.DateTime): Int
   
  def GetDayOfWeek(time : System.DateTime): System.DayOfWeek
   
  def GetDayOfYear(time : System.DateTime): Int
   
  def GetDaysInMonth(year : Int, month : Int, era : Int): Int
   
  def GetDaysInYear(year : Int, era : Int): Int
   
  def GetEra(time : System.DateTime): Int
   
  def GetMonth(time : System.DateTime): Int
   
  def GetMonthsInYear(year : Int, era : Int): Int
   
  def GetYear(time : System.DateTime): Int
   
  def IsLeapDay(year : Int, month : Int, day : Int, era : Int): Boolean
   
  def GetLeapMonth(year : Int, era : Int): Int
   
  def IsLeapMonth(year : Int, month : Int, era : Int): Boolean
   
  def IsLeapYear(year : Int, era : Int): Boolean
   
  def ToDateTime(year : Int, month : Int, day : Int, hour : Int, minute : Int, second : Int, 
                 millisecond : Int, era : Int): System.DateTime
   
  def ToFourDigitYear(year : Int): Int
   
  val MinSupportedDateTime : System.DateTime = new System.DateTime()
   
  val MaxSupportedDateTime : System.DateTime = new System.DateTime()
   
  val AlgorithmType : System.Globalization.CalendarAlgorithmType = System.Globalization.CalendarAlgorithmType.Unknown
   
  val Eras : Array[Int] = Array.empty[Int]
   
  var TwoDigitYearMax : Int = 0
   
  def this() {}
}
object UmAlQuraCalendar {
  val UmAlQuraEra : Int  = 0
}
 
sealed abstract class UnicodeCategory extends System.Enum {
  def ==(that: System.Globalization.UnicodeCategory): Boolean = false
  def !=(that: System.Globalization.UnicodeCategory): Boolean = false
  def  <(that: System.Globalization.UnicodeCategory): Boolean = false
  def <=(that: System.Globalization.UnicodeCategory): Boolean = false
  def  >(that: System.Globalization.UnicodeCategory): Boolean = false
  def >=(that: System.Globalization.UnicodeCategory): Boolean = false
  def  |(that: System.Globalization.UnicodeCategory): Boolean = false
  def  &(that: System.Globalization.UnicodeCategory): Boolean = false
  def  ^(that: System.Globalization.UnicodeCategory): Boolean = false
}
object UnicodeCategory{
  val UppercaseLetter	 = value(0)
  val LowercaseLetter	 = value(1)
  val TitlecaseLetter	 = value(2)
  val ModifierLetter	 = value(3)
  val OtherLetter	 = value(4)
  val NonSpacingMark	 = value(5)
  val SpacingCombiningMark	 = value(6)
  val EnclosingMark	 = value(7)
  val DecimalDigitNumber	 = value(8)
  val LetterNumber	 = value(9)
  val OtherNumber	 = value(10)
  val SpaceSeparator	 = value(11)
  val LineSeparator	 = value(12)
  val ParagraphSeparator	 = value(13)
  val Control	 = value(14)
  val Format	 = value(15)
  val Surrogate	 = value(16)
  val PrivateUse	 = value(17)
  val ConnectorPunctuation	 = value(18)
  val DashPunctuation	 = value(19)
  val OpenPunctuation	 = value(20)
  val ClosePunctuation	 = value(21)
  val InitialQuotePunctuation	 = value(22)
  val FinalQuotePunctuation	 = value(23)
  val OtherPunctuation	 = value(24)
  val MathSymbol	 = value(25)
  val CurrencySymbol	 = value(26)
  val ModifierSymbol	 = value(27)
  val OtherSymbol	 = value(28)
  val OtherNotAssigned	 = value(29)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Globalization.UnicodeCategory = null
}
 
}