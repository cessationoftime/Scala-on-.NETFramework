 /* assembly: System.Core, Version=2.0.5.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\System.Core.dll */ 
 
import auxPackage.auxiliary._
 
package System.Linq {
 
@System.Runtime.CompilerServices.ExtensionAttribute()
abstract sealed class Enumerable extends AnyRef 
object Enumerable {
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Aggregate[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                         func : System.Func[TSource, TSource, TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Aggregate[TSource, TAccumulate](source : System.Collections.Generic.IEnumerable[TSource], seed : TAccumulate, 
                                      func : System.Func[TAccumulate, TSource, TAccumulate]): TAccumulate  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Aggregate[TSource, TAccumulate, TResult](source : System.Collections.Generic.IEnumerable[TSource], seed : TAccumulate, 
                                               func : System.Func[TAccumulate, TSource, TAccumulate], 
                                               resultSelector : System.Func[TAccumulate, TResult]): TResult  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def All[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   predicate : System.Func[TSource, Boolean]): Boolean  = false
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Any[TSource](source : System.Collections.Generic.IEnumerable[TSource]): Boolean  = false
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Any[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   predicate : System.Func[TSource, Boolean]): Boolean  = false
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def AsEnumerable[TSource](source : System.Collections.Generic.IEnumerable[TSource]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Collections.Generic.IEnumerable[System.Decimal]): System.Decimal  = new System.Decimal()
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Collections.Generic.IEnumerable[Double]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Collections.Generic.IEnumerable[Int]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Collections.Generic.IEnumerable[Long]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Collections.Generic.IEnumerable[System.Nullable[System.Decimal]]): System.Nullable[System.Decimal]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Collections.Generic.IEnumerable[System.Nullable[Double]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Collections.Generic.IEnumerable[System.Nullable[Int]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Collections.Generic.IEnumerable[System.Nullable[Long]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Collections.Generic.IEnumerable[System.Nullable[Float]]): System.Nullable[Float]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Collections.Generic.IEnumerable[Float]): Float  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                       selector : System.Func[TSource, System.Decimal]): System.Decimal  = new System.Decimal()
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                       selector : System.Func[TSource, Double]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                       selector : System.Func[TSource, Int]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                       selector : System.Func[TSource, Long]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                       selector : System.Func[TSource, System.Nullable[System.Decimal]]): System.Nullable[System.Decimal]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                       selector : System.Func[TSource, System.Nullable[Double]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                       selector : System.Func[TSource, System.Nullable[Int]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                       selector : System.Func[TSource, System.Nullable[Long]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                       selector : System.Func[TSource, System.Nullable[Float]]): System.Nullable[Float]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                       selector : System.Func[TSource, Float]): Float  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Cast[TResult](source : System.Collections.IEnumerable): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Concat[TSource](first : System.Collections.Generic.IEnumerable[TSource], 
                      second : System.Collections.Generic.IEnumerable[TSource]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Contains[TSource](source : System.Collections.Generic.IEnumerable[TSource], value : TSource): Boolean  = false
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Contains[TSource](source : System.Collections.Generic.IEnumerable[TSource], value : TSource, 
                        comparer : System.Collections.Generic.IEqualityComparer[TSource]): Boolean  = false
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Count[TSource](source : System.Collections.Generic.IEnumerable[TSource]): Int  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Count[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                     predicate : System.Func[TSource, Boolean]): Int  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def DefaultIfEmpty[TSource](source : System.Collections.Generic.IEnumerable[TSource]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def DefaultIfEmpty[TSource](source : System.Collections.Generic.IEnumerable[TSource], defaultValue : TSource): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Distinct[TSource](source : System.Collections.Generic.IEnumerable[TSource]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Distinct[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                        comparer : System.Collections.Generic.IEqualityComparer[TSource]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ElementAt[TSource](source : System.Collections.Generic.IEnumerable[TSource], index : Int): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ElementAtOrDefault[TSource](source : System.Collections.Generic.IEnumerable[TSource], index : Int): TSource  = null
   
  def Empty[TResult]: System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Except[TSource](first : System.Collections.Generic.IEnumerable[TSource], 
                      second : System.Collections.Generic.IEnumerable[TSource]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Except[TSource](first : System.Collections.Generic.IEnumerable[TSource], 
                      second : System.Collections.Generic.IEnumerable[TSource], 
                      comparer : System.Collections.Generic.IEqualityComparer[TSource]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def First[TSource](source : System.Collections.Generic.IEnumerable[TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def First[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                     predicate : System.Func[TSource, Boolean]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def FirstOrDefault[TSource](source : System.Collections.Generic.IEnumerable[TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def FirstOrDefault[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                              predicate : System.Func[TSource, Boolean]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupBy[TSource, TKey](source : System.Collections.Generic.IEnumerable[TSource], 
                             keySelector : System.Func[TSource, TKey]): System.Collections.Generic.IEnumerable[System.Linq.IGrouping[TKey, TSource]]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupBy[TSource, TKey](source : System.Collections.Generic.IEnumerable[TSource], 
                             keySelector : System.Func[TSource, TKey], 
                             comparer : System.Collections.Generic.IEqualityComparer[TKey]): System.Collections.Generic.IEnumerable[System.Linq.IGrouping[TKey, TSource]]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupBy[TSource, TKey, TElement](source : System.Collections.Generic.IEnumerable[TSource], 
                                       keySelector : System.Func[TSource, TKey], 
                                       elementSelector : System.Func[TSource, TElement]): System.Collections.Generic.IEnumerable[System.Linq.IGrouping[TKey, TElement]]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupBy[TSource, TKey, TElement](source : System.Collections.Generic.IEnumerable[TSource], 
                                       keySelector : System.Func[TSource, TKey], 
                                       elementSelector : System.Func[TSource, TElement], 
                                       comparer : System.Collections.Generic.IEqualityComparer[TKey]): System.Collections.Generic.IEnumerable[System.Linq.IGrouping[TKey, TElement]]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupBy[TSource, TKey, TResult](source : System.Collections.Generic.IEnumerable[TSource], 
                                      keySelector : System.Func[TSource, TKey], 
                                      resultSelector : System.Func[TKey, System.Collections.Generic.IEnumerable[TSource], TResult]): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupBy[TSource, TKey, TResult](source : System.Collections.Generic.IEnumerable[TSource], 
                                      keySelector : System.Func[TSource, TKey], 
                                      resultSelector : System.Func[TKey, System.Collections.Generic.IEnumerable[TSource], TResult], 
                                      comparer : System.Collections.Generic.IEqualityComparer[TKey]): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupBy[TSource, TKey, TElement, TResult](source : System.Collections.Generic.IEnumerable[TSource], 
                                                keySelector : System.Func[TSource, TKey], 
                                                elementSelector : System.Func[TSource, TElement], 
                                                resultSelector : System.Func[TKey, System.Collections.Generic.IEnumerable[TElement], TResult]): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupBy[TSource, TKey, TElement, TResult](source : System.Collections.Generic.IEnumerable[TSource], 
                                                keySelector : System.Func[TSource, TKey], 
                                                elementSelector : System.Func[TSource, TElement], 
                                                resultSelector : System.Func[TKey, System.Collections.Generic.IEnumerable[TElement], TResult], 
                                                comparer : System.Collections.Generic.IEqualityComparer[TKey]): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupJoin[TOuter, TInner, TKey, TResult](outer : System.Collections.Generic.IEnumerable[TOuter], 
                                               inner : System.Collections.Generic.IEnumerable[TInner], 
                                               outerKeySelector : System.Func[TOuter, TKey], 
                                               innerKeySelector : System.Func[TInner, TKey], 
                                               resultSelector : System.Func[TOuter, System.Collections.Generic.IEnumerable[TInner], TResult]): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupJoin[TOuter, TInner, TKey, TResult](outer : System.Collections.Generic.IEnumerable[TOuter], 
                                               inner : System.Collections.Generic.IEnumerable[TInner], 
                                               outerKeySelector : System.Func[TOuter, TKey], 
                                               innerKeySelector : System.Func[TInner, TKey], 
                                               resultSelector : System.Func[TOuter, System.Collections.Generic.IEnumerable[TInner], TResult], 
                                               comparer : System.Collections.Generic.IEqualityComparer[TKey]): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Intersect[TSource](first : System.Collections.Generic.IEnumerable[TSource], 
                         second : System.Collections.Generic.IEnumerable[TSource]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Intersect[TSource](first : System.Collections.Generic.IEnumerable[TSource], 
                         second : System.Collections.Generic.IEnumerable[TSource], 
                         comparer : System.Collections.Generic.IEqualityComparer[TSource]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Join[TOuter, TInner, TKey, TResult](outer : System.Collections.Generic.IEnumerable[TOuter], 
                                          inner : System.Collections.Generic.IEnumerable[TInner], 
                                          outerKeySelector : System.Func[TOuter, TKey], 
                                          innerKeySelector : System.Func[TInner, TKey], 
                                          resultSelector : System.Func[TOuter, TInner, TResult]): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Join[TOuter, TInner, TKey, TResult](outer : System.Collections.Generic.IEnumerable[TOuter], 
                                          inner : System.Collections.Generic.IEnumerable[TInner], 
                                          outerKeySelector : System.Func[TOuter, TKey], 
                                          innerKeySelector : System.Func[TInner, TKey], 
                                          resultSelector : System.Func[TOuter, TInner, TResult], 
                                          comparer : System.Collections.Generic.IEqualityComparer[TKey]): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Last[TSource](source : System.Collections.Generic.IEnumerable[TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Last[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                    predicate : System.Func[TSource, Boolean]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def LastOrDefault[TSource](source : System.Collections.Generic.IEnumerable[TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def LastOrDefault[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                             predicate : System.Func[TSource, Boolean]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def LongCount[TSource](source : System.Collections.Generic.IEnumerable[TSource]): Long  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def LongCount[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                         predicate : System.Func[TSource, Boolean]): Long  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max(source : System.Collections.Generic.IEnumerable[System.Decimal]): System.Decimal  = new System.Decimal()
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max(source : System.Collections.Generic.IEnumerable[Double]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max(source : System.Collections.Generic.IEnumerable[Int]): Int  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max(source : System.Collections.Generic.IEnumerable[Long]): Long  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max(source : System.Collections.Generic.IEnumerable[System.Nullable[System.Decimal]]): System.Nullable[System.Decimal]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max(source : System.Collections.Generic.IEnumerable[System.Nullable[Double]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max(source : System.Collections.Generic.IEnumerable[System.Nullable[Int]]): System.Nullable[Int]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max(source : System.Collections.Generic.IEnumerable[System.Nullable[Long]]): System.Nullable[Long]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max(source : System.Collections.Generic.IEnumerable[System.Nullable[Float]]): System.Nullable[Float]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max(source : System.Collections.Generic.IEnumerable[Float]): Float  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max[TSource](source : System.Collections.Generic.IEnumerable[TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Decimal]): System.Decimal  = new System.Decimal()
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, Double]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, Int]): Int  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, Long]): Long  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Nullable[System.Decimal]]): System.Nullable[System.Decimal]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Nullable[Double]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Nullable[Int]]): System.Nullable[Int]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Nullable[Long]]): System.Nullable[Long]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Nullable[Float]]): System.Nullable[Float]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, Float]): Float  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max[TSource, TResult](source : System.Collections.Generic.IEnumerable[TSource], 
                            selector : System.Func[TSource, TResult]): TResult  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min(source : System.Collections.Generic.IEnumerable[System.Decimal]): System.Decimal  = new System.Decimal()
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min(source : System.Collections.Generic.IEnumerable[Double]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min(source : System.Collections.Generic.IEnumerable[Int]): Int  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min(source : System.Collections.Generic.IEnumerable[Long]): Long  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min(source : System.Collections.Generic.IEnumerable[System.Nullable[System.Decimal]]): System.Nullable[System.Decimal]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min(source : System.Collections.Generic.IEnumerable[System.Nullable[Double]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min(source : System.Collections.Generic.IEnumerable[System.Nullable[Int]]): System.Nullable[Int]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min(source : System.Collections.Generic.IEnumerable[System.Nullable[Long]]): System.Nullable[Long]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min(source : System.Collections.Generic.IEnumerable[System.Nullable[Float]]): System.Nullable[Float]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min(source : System.Collections.Generic.IEnumerable[Float]): Float  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min[TSource](source : System.Collections.Generic.IEnumerable[TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Decimal]): System.Decimal  = new System.Decimal()
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, Double]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, Int]): Int  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, Long]): Long  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Nullable[System.Decimal]]): System.Nullable[System.Decimal]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Nullable[Double]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Nullable[Int]]): System.Nullable[Int]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Nullable[Long]]): System.Nullable[Long]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Nullable[Float]]): System.Nullable[Float]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, Float]): Float  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min[TSource, TResult](source : System.Collections.Generic.IEnumerable[TSource], 
                            selector : System.Func[TSource, TResult]): TResult  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def OfType[TResult](source : System.Collections.IEnumerable): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def OrderBy[TSource, TKey](source : System.Collections.Generic.IEnumerable[TSource], 
                             keySelector : System.Func[TSource, TKey]): System.Linq.IOrderedEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def OrderBy[TSource, TKey](source : System.Collections.Generic.IEnumerable[TSource], 
                             keySelector : System.Func[TSource, TKey], 
                             comparer : System.Collections.Generic.IComparer[TKey]): System.Linq.IOrderedEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def OrderByDescending[TSource, TKey](source : System.Collections.Generic.IEnumerable[TSource], 
                                       keySelector : System.Func[TSource, TKey]): System.Linq.IOrderedEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def OrderByDescending[TSource, TKey](source : System.Collections.Generic.IEnumerable[TSource], 
                                       keySelector : System.Func[TSource, TKey], 
                                       comparer : System.Collections.Generic.IComparer[TKey]): System.Linq.IOrderedEnumerable[TSource]  = null
   
  def Range(start : Int, count : Int): System.Collections.Generic.IEnumerable[Int]  = null
   
  def Repeat[TResult](element : TResult, count : Int): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Reverse[TSource](source : System.Collections.Generic.IEnumerable[TSource]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Select[TSource, TResult](source : System.Collections.Generic.IEnumerable[TSource], 
                               selector : System.Func[TSource, TResult]): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Select[TSource, TResult](source : System.Collections.Generic.IEnumerable[TSource], 
                               selector : System.Func[TSource, Int, TResult]): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SelectMany[TSource, TResult](source : System.Collections.Generic.IEnumerable[TSource], 
                                   selector : System.Func[TSource, System.Collections.Generic.IEnumerable[TResult]]): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SelectMany[TSource, TResult](source : System.Collections.Generic.IEnumerable[TSource], 
                                   selector : System.Func[TSource, Int, System.Collections.Generic.IEnumerable[TResult]]): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SelectMany[TSource, TCollection, TResult](source : System.Collections.Generic.IEnumerable[TSource], 
                                                collectionSelector : System.Func[TSource, System.Collections.Generic.IEnumerable[TCollection]], 
                                                resultSelector : System.Func[TSource, TCollection, TResult]): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SelectMany[TSource, TCollection, TResult](source : System.Collections.Generic.IEnumerable[TSource], 
                                                collectionSelector : System.Func[TSource, Int, System.Collections.Generic.IEnumerable[TCollection]], 
                                                resultSelector : System.Func[TSource, TCollection, TResult]): System.Collections.Generic.IEnumerable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SequenceEqual[TSource](first : System.Collections.Generic.IEnumerable[TSource], 
                             second : System.Collections.Generic.IEnumerable[TSource]): Boolean  = false
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SequenceEqual[TSource](first : System.Collections.Generic.IEnumerable[TSource], 
                             second : System.Collections.Generic.IEnumerable[TSource], 
                             comparer : System.Collections.Generic.IEqualityComparer[TSource]): Boolean  = false
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Single[TSource](source : System.Collections.Generic.IEnumerable[TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Single[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                      predicate : System.Func[TSource, Boolean]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SingleOrDefault[TSource](source : System.Collections.Generic.IEnumerable[TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SingleOrDefault[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                               predicate : System.Func[TSource, Boolean]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Skip[TSource](source : System.Collections.Generic.IEnumerable[TSource], count : Int): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SkipWhile[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                         predicate : System.Func[TSource, Boolean]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SkipWhile[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                         predicate : System.Func[TSource, Int, Boolean]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Collections.Generic.IEnumerable[System.Decimal]): System.Decimal  = new System.Decimal()
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Collections.Generic.IEnumerable[Double]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Collections.Generic.IEnumerable[Int]): Int  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Collections.Generic.IEnumerable[Long]): Long  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Collections.Generic.IEnumerable[System.Nullable[System.Decimal]]): System.Nullable[System.Decimal]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Collections.Generic.IEnumerable[System.Nullable[Double]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Collections.Generic.IEnumerable[System.Nullable[Int]]): System.Nullable[Int]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Collections.Generic.IEnumerable[System.Nullable[Long]]): System.Nullable[Long]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Collections.Generic.IEnumerable[System.Nullable[Float]]): System.Nullable[Float]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Collections.Generic.IEnumerable[Float]): Float  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Decimal]): System.Decimal  = new System.Decimal()
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, Double]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, Int]): Int  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, Long]): Long  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Nullable[System.Decimal]]): System.Nullable[System.Decimal]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Nullable[Double]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Nullable[Int]]): System.Nullable[Int]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Nullable[Long]]): System.Nullable[Long]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, System.Nullable[Float]]): System.Nullable[Float]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                   selector : System.Func[TSource, Float]): Float  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Take[TSource](source : System.Collections.Generic.IEnumerable[TSource], count : Int): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def TakeWhile[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                         predicate : System.Func[TSource, Boolean]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def TakeWhile[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                         predicate : System.Func[TSource, Int, Boolean]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ThenBy[TSource, TKey](source : System.Linq.IOrderedEnumerable[TSource], 
                            keySelector : System.Func[TSource, TKey]): System.Linq.IOrderedEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ThenBy[TSource, TKey](source : System.Linq.IOrderedEnumerable[TSource], 
                            keySelector : System.Func[TSource, TKey], 
                            comparer : System.Collections.Generic.IComparer[TKey]): System.Linq.IOrderedEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ThenByDescending[TSource, TKey](source : System.Linq.IOrderedEnumerable[TSource], 
                                      keySelector : System.Func[TSource, TKey]): System.Linq.IOrderedEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ThenByDescending[TSource, TKey](source : System.Linq.IOrderedEnumerable[TSource], 
                                      keySelector : System.Func[TSource, TKey], 
                                      comparer : System.Collections.Generic.IComparer[TKey]): System.Linq.IOrderedEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ToArray[TSource](source : System.Collections.Generic.IEnumerable[TSource]): Array[TSource]  = Array.empty[TSource]
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ToDictionary[TSource, TKey](source : System.Collections.Generic.IEnumerable[TSource], 
                                  keySelector : System.Func[TSource, TKey]): System.Collections.Generic.Dictionary[TKey, TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ToDictionary[TSource, TKey](source : System.Collections.Generic.IEnumerable[TSource], 
                                  keySelector : System.Func[TSource, TKey], 
                                  comparer : System.Collections.Generic.IEqualityComparer[TKey]): System.Collections.Generic.Dictionary[TKey, TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ToDictionary[TSource, TKey, TElement](source : System.Collections.Generic.IEnumerable[TSource], 
                                            keySelector : System.Func[TSource, TKey], 
                                            elementSelector : System.Func[TSource, TElement]): System.Collections.Generic.Dictionary[TKey, TElement]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ToDictionary[TSource, TKey, TElement](source : System.Collections.Generic.IEnumerable[TSource], 
                                            keySelector : System.Func[TSource, TKey], 
                                            elementSelector : System.Func[TSource, TElement], 
                                            comparer : System.Collections.Generic.IEqualityComparer[TKey]): System.Collections.Generic.Dictionary[TKey, TElement]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ToList[TSource](source : System.Collections.Generic.IEnumerable[TSource]): System.Collections.Generic.List[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ToLookup[TSource, TKey](source : System.Collections.Generic.IEnumerable[TSource], 
                              keySelector : System.Func[TSource, TKey]): System.Linq.ILookup[TKey, TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ToLookup[TSource, TKey](source : System.Collections.Generic.IEnumerable[TSource], 
                              keySelector : System.Func[TSource, TKey], 
                              comparer : System.Collections.Generic.IEqualityComparer[TKey]): System.Linq.ILookup[TKey, TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ToLookup[TSource, TKey, TElement](source : System.Collections.Generic.IEnumerable[TSource], 
                                        keySelector : System.Func[TSource, TKey], 
                                        elementSelector : System.Func[TSource, TElement]): System.Linq.ILookup[TKey, TElement]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ToLookup[TSource, TKey, TElement](source : System.Collections.Generic.IEnumerable[TSource], 
                                        keySelector : System.Func[TSource, TKey], 
                                        elementSelector : System.Func[TSource, TElement], 
                                        comparer : System.Collections.Generic.IEqualityComparer[TKey]): System.Linq.ILookup[TKey, TElement]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Union[TSource](first : System.Collections.Generic.IEnumerable[TSource], 
                     second : System.Collections.Generic.IEnumerable[TSource]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Union[TSource](first : System.Collections.Generic.IEnumerable[TSource], 
                     second : System.Collections.Generic.IEnumerable[TSource], 
                     comparer : System.Collections.Generic.IEqualityComparer[TSource]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Where[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                     predicate : System.Func[TSource, Boolean]): System.Collections.Generic.IEnumerable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Where[TSource](source : System.Collections.Generic.IEnumerable[TSource], 
                     predicate : System.Func[TSource, Int, Boolean]): System.Collections.Generic.IEnumerable[TSource]  = null
}
 
trait IGrouping[TKey, TElement] extends System.Collections.Generic.IEnumerable[TElement] with System.Collections.IEnumerable {
  val Key : TKey = null
}
 
@System.Reflection.DefaultMemberAttribute("Item")
trait ILookup[TKey, TElement] extends System.Collections.Generic.IEnumerable[System.Linq.IGrouping[TKey, TElement]] with 
                                      System.Collections.IEnumerable {
  /* abstract */ def Contains(key : TKey): Boolean
   
  val Count : Int = 0
   
  /* parameterful property Item */
  /* abstract */ def Item(key : TKey): System.Collections.Generic.IEnumerable[TElement]
}
 
trait IOrderedEnumerable[TElement] extends System.Collections.Generic.IEnumerable[TElement] with System.Collections.IEnumerable {
  /* abstract */ def CreateOrderedEnumerable[TKey](keySelector : System.Func[TElement, TKey], 
                                                   comparer : System.Collections.Generic.IComparer[TKey], descending : Boolean): System.Linq.IOrderedEnumerable[TElement]
}
 
trait IQueryable extends System.Collections.IEnumerable {
  val ElementType : System.Type = null
   
  val Expression : System.Linq.Expressions.Expression = null
   
  val Provider : System.Linq.IQueryProvider = null
}
 
trait IOrderedQueryable extends System.Linq.IQueryable with System.Collections.IEnumerable 
 
trait IQueryable[T] extends System.Collections.Generic.IEnumerable[T] with System.Linq.IQueryable with 
                            System.Collections.IEnumerable 
 
trait IOrderedQueryable[T] extends System.Linq.IOrderedQueryable with System.Linq.IQueryable[T] with 
                                   System.Collections.Generic.IEnumerable[T] with System.Linq.IQueryable with 
                                   System.Collections.IEnumerable 
 
trait IQueryProvider {
  /* abstract */ def CreateQuery(expression : System.Linq.Expressions.Expression): System.Linq.IQueryable
   
  /* abstract */ def CreateQuery[TElement](expression : System.Linq.Expressions.Expression): System.Linq.IQueryable[TElement]
   
  /* abstract */ def Execute(expression : System.Linq.Expressions.Expression): AnyRef
   
  /* abstract */ def Execute[TResult](expression : System.Linq.Expressions.Expression): TResult
}
 
@System.Reflection.DefaultMemberAttribute("Item")
class Lookup[TKey, TElement] extends AnyRef with System.Linq.ILookup[TKey, TElement] with 
                                     System.Collections.Generic.IEnumerable[System.Linq.IGrouping[TKey, TElement]] with 
                                     System.Collections.IEnumerable {
  def ApplyResultSelector[TResult](resultSelector : System.Func[TKey, System.Collections.Generic.IEnumerable[TElement], TResult]): System.Collections.Generic.IEnumerable[TResult]
   
  def Contains(key : TKey): Boolean
   
  def GetEnumerator: System.Collections.Generic.IEnumerator[System.Linq.IGrouping[TKey, TElement]]
   
  val Count : Int = 0
   
  /* parameterful property Item */
  def Item(key : TKey): System.Collections.Generic.IEnumerable[TElement]
}
 
@System.Runtime.CompilerServices.ExtensionAttribute()
abstract sealed class Queryable extends AnyRef 
object Queryable {
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Aggregate[TSource](source : System.Linq.IQueryable[TSource], 
                         func : System.Linq.Expressions.Expression[System.Func[TSource, TSource, TSource]]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Aggregate[TSource, TAccumulate](source : System.Linq.IQueryable[TSource], seed : TAccumulate, 
                                      func : System.Linq.Expressions.Expression[System.Func[TAccumulate, TSource, TAccumulate]]): TAccumulate  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Aggregate[TSource, TAccumulate, TResult](source : System.Linq.IQueryable[TSource], seed : TAccumulate, 
                                               func : System.Linq.Expressions.Expression[System.Func[TAccumulate, TSource, TAccumulate]], 
                                               selector : System.Linq.Expressions.Expression[System.Func[TAccumulate, TResult]]): TResult  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def All[TSource](source : System.Linq.IQueryable[TSource], 
                   predicate : System.Linq.Expressions.Expression[System.Func[TSource, Boolean]]): Boolean  = false
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Any[TSource](source : System.Linq.IQueryable[TSource]): Boolean  = false
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Any[TSource](source : System.Linq.IQueryable[TSource], 
                   predicate : System.Linq.Expressions.Expression[System.Func[TSource, Boolean]]): Boolean  = false
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def AsQueryable(source : System.Collections.IEnumerable): System.Linq.IQueryable  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def AsQueryable[TElement](source : System.Collections.Generic.IEnumerable[TElement]): System.Linq.IQueryable[TElement]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Linq.IQueryable[System.Decimal]): System.Decimal  = new System.Decimal()
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Linq.IQueryable[Double]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Linq.IQueryable[Int]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Linq.IQueryable[Long]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Linq.IQueryable[System.Nullable[System.Decimal]]): System.Nullable[System.Decimal]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Linq.IQueryable[System.Nullable[Double]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Linq.IQueryable[System.Nullable[Int]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Linq.IQueryable[System.Nullable[Long]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Linq.IQueryable[System.Nullable[Float]]): System.Nullable[Float]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average(source : System.Linq.IQueryable[Float]): Float  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Linq.IQueryable[TSource], 
                       selector : System.Linq.Expressions.Expression[System.Func[TSource, System.Decimal]]): System.Decimal  = new System.Decimal()
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Linq.IQueryable[TSource], 
                       selector : System.Linq.Expressions.Expression[System.Func[TSource, Double]]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Linq.IQueryable[TSource], 
                       selector : System.Linq.Expressions.Expression[System.Func[TSource, Int]]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Linq.IQueryable[TSource], 
                       selector : System.Linq.Expressions.Expression[System.Func[TSource, Long]]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Linq.IQueryable[TSource], 
                       selector : System.Linq.Expressions.Expression[System.Func[TSource, System.Nullable[System.Decimal]]]): System.Nullable[System.Decimal]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Linq.IQueryable[TSource], 
                       selector : System.Linq.Expressions.Expression[System.Func[TSource, System.Nullable[Double]]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Linq.IQueryable[TSource], 
                       selector : System.Linq.Expressions.Expression[System.Func[TSource, System.Nullable[Int]]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Linq.IQueryable[TSource], 
                       selector : System.Linq.Expressions.Expression[System.Func[TSource, System.Nullable[Long]]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Linq.IQueryable[TSource], 
                       selector : System.Linq.Expressions.Expression[System.Func[TSource, System.Nullable[Float]]]): System.Nullable[Float]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Average[TSource](source : System.Linq.IQueryable[TSource], 
                       selector : System.Linq.Expressions.Expression[System.Func[TSource, Float]]): Float  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Cast[TResult](source : System.Linq.IQueryable): System.Linq.IQueryable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Concat[TSource](source1 : System.Linq.IQueryable[TSource], 
                      source2 : System.Collections.Generic.IEnumerable[TSource]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Contains[TSource](source : System.Linq.IQueryable[TSource], item : TSource): Boolean  = false
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Contains[TSource](source : System.Linq.IQueryable[TSource], item : TSource, 
                        comparer : System.Collections.Generic.IEqualityComparer[TSource]): Boolean  = false
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Count[TSource](source : System.Linq.IQueryable[TSource]): Int  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Count[TSource](source : System.Linq.IQueryable[TSource], 
                     predicate : System.Linq.Expressions.Expression[System.Func[TSource, Boolean]]): Int  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def DefaultIfEmpty[TSource](source : System.Linq.IQueryable[TSource]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def DefaultIfEmpty[TSource](source : System.Linq.IQueryable[TSource], defaultValue : TSource): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Distinct[TSource](source : System.Linq.IQueryable[TSource]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Distinct[TSource](source : System.Linq.IQueryable[TSource], 
                        comparer : System.Collections.Generic.IEqualityComparer[TSource]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ElementAt[TSource](source : System.Linq.IQueryable[TSource], index : Int): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ElementAtOrDefault[TSource](source : System.Linq.IQueryable[TSource], index : Int): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Except[TSource](source1 : System.Linq.IQueryable[TSource], 
                      source2 : System.Collections.Generic.IEnumerable[TSource]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Except[TSource](source1 : System.Linq.IQueryable[TSource], 
                      source2 : System.Collections.Generic.IEnumerable[TSource], 
                      comparer : System.Collections.Generic.IEqualityComparer[TSource]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def First[TSource](source : System.Linq.IQueryable[TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def First[TSource](source : System.Linq.IQueryable[TSource], 
                     predicate : System.Linq.Expressions.Expression[System.Func[TSource, Boolean]]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def FirstOrDefault[TSource](source : System.Linq.IQueryable[TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def FirstOrDefault[TSource](source : System.Linq.IQueryable[TSource], 
                              predicate : System.Linq.Expressions.Expression[System.Func[TSource, Boolean]]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupBy[TSource, TKey](source : System.Linq.IQueryable[TSource], 
                             keySelector : System.Linq.Expressions.Expression[System.Func[TSource, TKey]]): System.Linq.IQueryable[System.Linq.IGrouping[TKey, TSource]]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupBy[TSource, TKey](source : System.Linq.IQueryable[TSource], 
                             keySelector : System.Linq.Expressions.Expression[System.Func[TSource, TKey]], 
                             comparer : System.Collections.Generic.IEqualityComparer[TKey]): System.Linq.IQueryable[System.Linq.IGrouping[TKey, TSource]]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupBy[TSource, TKey, TElement](source : System.Linq.IQueryable[TSource], 
                                       keySelector : System.Linq.Expressions.Expression[System.Func[TSource, TKey]], 
                                       elementSelector : System.Linq.Expressions.Expression[System.Func[TSource, TElement]]): System.Linq.IQueryable[System.Linq.IGrouping[TKey, TElement]]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupBy[TSource, TKey, TElement](source : System.Linq.IQueryable[TSource], 
                                       keySelector : System.Linq.Expressions.Expression[System.Func[TSource, TKey]], 
                                       elementSelector : System.Linq.Expressions.Expression[System.Func[TSource, TElement]], 
                                       comparer : System.Collections.Generic.IEqualityComparer[TKey]): System.Linq.IQueryable[System.Linq.IGrouping[TKey, TElement]]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupBy[TSource, TKey, TResult](source : System.Linq.IQueryable[TSource], 
                                      keySelector : System.Linq.Expressions.Expression[System.Func[TSource, TKey]], 
                                      resultSelector : System.Linq.Expressions.Expression[System.Func[TKey, System.Collections.Generic.IEnumerable[TSource], TResult]]): System.Linq.IQueryable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupBy[TSource, TKey, TResult](source : System.Linq.IQueryable[TSource], 
                                      keySelector : System.Linq.Expressions.Expression[System.Func[TSource, TKey]], 
                                      resultSelector : System.Linq.Expressions.Expression[System.Func[TKey, System.Collections.Generic.IEnumerable[TSource], TResult]], 
                                      comparer : System.Collections.Generic.IEqualityComparer[TKey]): System.Linq.IQueryable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupBy[TSource, TKey, TElement, TResult](source : System.Linq.IQueryable[TSource], 
                                                keySelector : System.Linq.Expressions.Expression[System.Func[TSource, TKey]], 
                                                elementSelector : System.Linq.Expressions.Expression[System.Func[TSource, TElement]], 
                                                resultSelector : System.Linq.Expressions.Expression[System.Func[TKey, System.Collections.Generic.IEnumerable[TElement], TResult]]): System.Linq.IQueryable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupBy[TSource, TKey, TElement, TResult](source : System.Linq.IQueryable[TSource], 
                                                keySelector : System.Linq.Expressions.Expression[System.Func[TSource, TKey]], 
                                                elementSelector : System.Linq.Expressions.Expression[System.Func[TSource, TElement]], 
                                                resultSelector : System.Linq.Expressions.Expression[System.Func[TKey, System.Collections.Generic.IEnumerable[TElement], TResult]], 
                                                comparer : System.Collections.Generic.IEqualityComparer[TKey]): System.Linq.IQueryable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupJoin[TOuter, TInner, TKey, TResult](outer : System.Linq.IQueryable[TOuter], 
                                               inner : System.Collections.Generic.IEnumerable[TInner], 
                                               outerKeySelector : System.Linq.Expressions.Expression[System.Func[TOuter, TKey]], 
                                               innerKeySelector : System.Linq.Expressions.Expression[System.Func[TInner, TKey]], 
                                               resultSelector : System.Linq.Expressions.Expression[System.Func[TOuter, System.Collections.Generic.IEnumerable[TInner], TResult]]): System.Linq.IQueryable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def GroupJoin[TOuter, TInner, TKey, TResult](outer : System.Linq.IQueryable[TOuter], 
                                               inner : System.Collections.Generic.IEnumerable[TInner], 
                                               outerKeySelector : System.Linq.Expressions.Expression[System.Func[TOuter, TKey]], 
                                               innerKeySelector : System.Linq.Expressions.Expression[System.Func[TInner, TKey]], 
                                               resultSelector : System.Linq.Expressions.Expression[System.Func[TOuter, System.Collections.Generic.IEnumerable[TInner], TResult]], 
                                               comparer : System.Collections.Generic.IEqualityComparer[TKey]): System.Linq.IQueryable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Intersect[TSource](source1 : System.Linq.IQueryable[TSource], 
                         source2 : System.Collections.Generic.IEnumerable[TSource]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Intersect[TSource](source1 : System.Linq.IQueryable[TSource], 
                         source2 : System.Collections.Generic.IEnumerable[TSource], 
                         comparer : System.Collections.Generic.IEqualityComparer[TSource]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Join[TOuter, TInner, TKey, TResult](outer : System.Linq.IQueryable[TOuter], 
                                          inner : System.Collections.Generic.IEnumerable[TInner], 
                                          outerKeySelector : System.Linq.Expressions.Expression[System.Func[TOuter, TKey]], 
                                          innerKeySelector : System.Linq.Expressions.Expression[System.Func[TInner, TKey]], 
                                          resultSelector : System.Linq.Expressions.Expression[System.Func[TOuter, TInner, TResult]]): System.Linq.IQueryable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Join[TOuter, TInner, TKey, TResult](outer : System.Linq.IQueryable[TOuter], 
                                          inner : System.Collections.Generic.IEnumerable[TInner], 
                                          outerKeySelector : System.Linq.Expressions.Expression[System.Func[TOuter, TKey]], 
                                          innerKeySelector : System.Linq.Expressions.Expression[System.Func[TInner, TKey]], 
                                          resultSelector : System.Linq.Expressions.Expression[System.Func[TOuter, TInner, TResult]], 
                                          comparer : System.Collections.Generic.IEqualityComparer[TKey]): System.Linq.IQueryable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Last[TSource](source : System.Linq.IQueryable[TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Last[TSource](source : System.Linq.IQueryable[TSource], 
                    predicate : System.Linq.Expressions.Expression[System.Func[TSource, Boolean]]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def LastOrDefault[TSource](source : System.Linq.IQueryable[TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def LastOrDefault[TSource](source : System.Linq.IQueryable[TSource], 
                             predicate : System.Linq.Expressions.Expression[System.Func[TSource, Boolean]]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def LongCount[TSource](source : System.Linq.IQueryable[TSource]): Long  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def LongCount[TSource](source : System.Linq.IQueryable[TSource], 
                         predicate : System.Linq.Expressions.Expression[System.Func[TSource, Boolean]]): Long  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max[TSource](source : System.Linq.IQueryable[TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Max[TSource, TResult](source : System.Linq.IQueryable[TSource], 
                            selector : System.Linq.Expressions.Expression[System.Func[TSource, TResult]]): TResult  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min[TSource](source : System.Linq.IQueryable[TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Min[TSource, TResult](source : System.Linq.IQueryable[TSource], 
                            selector : System.Linq.Expressions.Expression[System.Func[TSource, TResult]]): TResult  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def OfType[TResult](source : System.Linq.IQueryable): System.Linq.IQueryable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def OrderBy[TSource, TKey](source : System.Linq.IQueryable[TSource], 
                             keySelector : System.Linq.Expressions.Expression[System.Func[TSource, TKey]]): System.Linq.IOrderedQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def OrderBy[TSource, TKey](source : System.Linq.IQueryable[TSource], 
                             keySelector : System.Linq.Expressions.Expression[System.Func[TSource, TKey]], 
                             comparer : System.Collections.Generic.IComparer[TKey]): System.Linq.IOrderedQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def OrderByDescending[TSource, TKey](source : System.Linq.IQueryable[TSource], 
                                       keySelector : System.Linq.Expressions.Expression[System.Func[TSource, TKey]]): System.Linq.IOrderedQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def OrderByDescending[TSource, TKey](source : System.Linq.IQueryable[TSource], 
                                       keySelector : System.Linq.Expressions.Expression[System.Func[TSource, TKey]], 
                                       comparer : System.Collections.Generic.IComparer[TKey]): System.Linq.IOrderedQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Reverse[TSource](source : System.Linq.IQueryable[TSource]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Select[TSource, TResult](source : System.Linq.IQueryable[TSource], 
                               selector : System.Linq.Expressions.Expression[System.Func[TSource, TResult]]): System.Linq.IQueryable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Select[TSource, TResult](source : System.Linq.IQueryable[TSource], 
                               selector : System.Linq.Expressions.Expression[System.Func[TSource, Int, TResult]]): System.Linq.IQueryable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SelectMany[TSource, TResult](source : System.Linq.IQueryable[TSource], 
                                   selector : System.Linq.Expressions.Expression[System.Func[TSource, System.Collections.Generic.IEnumerable[TResult]]]): System.Linq.IQueryable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SelectMany[TSource, TResult](source : System.Linq.IQueryable[TSource], 
                                   selector : System.Linq.Expressions.Expression[System.Func[TSource, Int, System.Collections.Generic.IEnumerable[TResult]]]): System.Linq.IQueryable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SelectMany[TSource, TCollection, TResult](source : System.Linq.IQueryable[TSource], 
                                                collectionSelector : System.Linq.Expressions.Expression[System.Func[TSource, System.Collections.Generic.IEnumerable[TCollection]]], 
                                                resultSelector : System.Linq.Expressions.Expression[System.Func[TSource, TCollection, TResult]]): System.Linq.IQueryable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SelectMany[TSource, TCollection, TResult](source : System.Linq.IQueryable[TSource], 
                                                collectionSelector : System.Linq.Expressions.Expression[System.Func[TSource, Int, System.Collections.Generic.IEnumerable[TCollection]]], 
                                                resultSelector : System.Linq.Expressions.Expression[System.Func[TSource, TCollection, TResult]]): System.Linq.IQueryable[TResult]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SequenceEqual[TSource](source1 : System.Linq.IQueryable[TSource], 
                             source2 : System.Collections.Generic.IEnumerable[TSource]): Boolean  = false
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SequenceEqual[TSource](source1 : System.Linq.IQueryable[TSource], 
                             source2 : System.Collections.Generic.IEnumerable[TSource], 
                             comparer : System.Collections.Generic.IEqualityComparer[TSource]): Boolean  = false
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Single[TSource](source : System.Linq.IQueryable[TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Single[TSource](source : System.Linq.IQueryable[TSource], 
                      predicate : System.Linq.Expressions.Expression[System.Func[TSource, Boolean]]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SingleOrDefault[TSource](source : System.Linq.IQueryable[TSource]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SingleOrDefault[TSource](source : System.Linq.IQueryable[TSource], 
                               predicate : System.Linq.Expressions.Expression[System.Func[TSource, Boolean]]): TSource  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Skip[TSource](source : System.Linq.IQueryable[TSource], count : Int): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SkipWhile[TSource](source : System.Linq.IQueryable[TSource], 
                         predicate : System.Linq.Expressions.Expression[System.Func[TSource, Boolean]]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def SkipWhile[TSource](source : System.Linq.IQueryable[TSource], 
                         predicate : System.Linq.Expressions.Expression[System.Func[TSource, Int, Boolean]]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Linq.IQueryable[System.Decimal]): System.Decimal  = new System.Decimal()
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Linq.IQueryable[Double]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Linq.IQueryable[Int]): Int  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Linq.IQueryable[Long]): Long  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Linq.IQueryable[System.Nullable[System.Decimal]]): System.Nullable[System.Decimal]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Linq.IQueryable[System.Nullable[Double]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Linq.IQueryable[System.Nullable[Int]]): System.Nullable[Int]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Linq.IQueryable[System.Nullable[Long]]): System.Nullable[Long]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Linq.IQueryable[System.Nullable[Float]]): System.Nullable[Float]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum(source : System.Linq.IQueryable[Float]): Float  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Linq.IQueryable[TSource], 
                   selector : System.Linq.Expressions.Expression[System.Func[TSource, System.Decimal]]): System.Decimal  = new System.Decimal()
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Linq.IQueryable[TSource], 
                   selector : System.Linq.Expressions.Expression[System.Func[TSource, Double]]): Double  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Linq.IQueryable[TSource], 
                   selector : System.Linq.Expressions.Expression[System.Func[TSource, Int]]): Int  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Linq.IQueryable[TSource], 
                   selector : System.Linq.Expressions.Expression[System.Func[TSource, Long]]): Long  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Linq.IQueryable[TSource], 
                   selector : System.Linq.Expressions.Expression[System.Func[TSource, System.Nullable[System.Decimal]]]): System.Nullable[System.Decimal]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Linq.IQueryable[TSource], 
                   selector : System.Linq.Expressions.Expression[System.Func[TSource, System.Nullable[Double]]]): System.Nullable[Double]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Linq.IQueryable[TSource], 
                   selector : System.Linq.Expressions.Expression[System.Func[TSource, System.Nullable[Int]]]): System.Nullable[Int]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Linq.IQueryable[TSource], 
                   selector : System.Linq.Expressions.Expression[System.Func[TSource, System.Nullable[Long]]]): System.Nullable[Long]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Linq.IQueryable[TSource], 
                   selector : System.Linq.Expressions.Expression[System.Func[TSource, System.Nullable[Float]]]): System.Nullable[Float]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Sum[TSource](source : System.Linq.IQueryable[TSource], 
                   selector : System.Linq.Expressions.Expression[System.Func[TSource, Float]]): Float  = 0
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Take[TSource](source : System.Linq.IQueryable[TSource], count : Int): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def TakeWhile[TSource](source : System.Linq.IQueryable[TSource], 
                         predicate : System.Linq.Expressions.Expression[System.Func[TSource, Boolean]]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def TakeWhile[TSource](source : System.Linq.IQueryable[TSource], 
                         predicate : System.Linq.Expressions.Expression[System.Func[TSource, Int, Boolean]]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ThenBy[TSource, TKey](source : System.Linq.IOrderedQueryable[TSource], 
                            keySelector : System.Linq.Expressions.Expression[System.Func[TSource, TKey]]): System.Linq.IOrderedQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ThenBy[TSource, TKey](source : System.Linq.IOrderedQueryable[TSource], 
                            keySelector : System.Linq.Expressions.Expression[System.Func[TSource, TKey]], 
                            comparer : System.Collections.Generic.IComparer[TKey]): System.Linq.IOrderedQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ThenByDescending[TSource, TKey](source : System.Linq.IOrderedQueryable[TSource], 
                                      keySelector : System.Linq.Expressions.Expression[System.Func[TSource, TKey]]): System.Linq.IOrderedQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def ThenByDescending[TSource, TKey](source : System.Linq.IOrderedQueryable[TSource], 
                                      keySelector : System.Linq.Expressions.Expression[System.Func[TSource, TKey]], 
                                      comparer : System.Collections.Generic.IComparer[TKey]): System.Linq.IOrderedQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Union[TSource](source1 : System.Linq.IQueryable[TSource], 
                     source2 : System.Collections.Generic.IEnumerable[TSource]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Union[TSource](source1 : System.Linq.IQueryable[TSource], 
                     source2 : System.Collections.Generic.IEnumerable[TSource], 
                     comparer : System.Collections.Generic.IEqualityComparer[TSource]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Where[TSource](source : System.Linq.IQueryable[TSource], 
                     predicate : System.Linq.Expressions.Expression[System.Func[TSource, Boolean]]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Where[TSource](source : System.Linq.IQueryable[TSource], 
                     predicate : System.Linq.Expressions.Expression[System.Func[TSource, Int, Boolean]]): System.Linq.IQueryable[TSource]  = null
   
  @System.Runtime.CompilerServices.ExtensionAttribute()
  def Zip[TFirst, TSecond, TResult](source1 : System.Linq.IQueryable[TFirst], 
                                    source2 : System.Collections.Generic.IEnumerable[TSecond], 
                                    resultSelector : System.Linq.Expressions.Expression[System.Func[TFirst, TSecond, TResult]]): System.Linq.IQueryable[TResult]  = null
}
 
}