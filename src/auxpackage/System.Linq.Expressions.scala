 /* assembly: System.Core, Version=2.0.5.0 */ 
 
 /* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\System.Core.dll */ 
 
import auxPackage.auxiliary._
 
package System.Linq.Expressions {
 
abstract class Expression extends AnyRef {
  def ToString: String
   
  val NodeType : System.Linq.Expressions.ExpressionType = System.Linq.Expressions.ExpressionType.Add
   
  val Type : System.Type = null
}
object Expression {
  def Add(left : System.Linq.Expressions.Expression, 
          right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def Add(left : System.Linq.Expressions.Expression, 
          right : System.Linq.Expressions.Expression, method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def AddChecked(left : System.Linq.Expressions.Expression, 
                 right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def AddChecked(left : System.Linq.Expressions.Expression, 
                 right : System.Linq.Expressions.Expression, method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def And(left : System.Linq.Expressions.Expression, 
          right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def And(left : System.Linq.Expressions.Expression, 
          right : System.Linq.Expressions.Expression, method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def AndAlso(left : System.Linq.Expressions.Expression, 
              right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def AndAlso(left : System.Linq.Expressions.Expression, 
              right : System.Linq.Expressions.Expression, method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def ArrayIndex(array : System.Linq.Expressions.Expression, 
                 indexes : System.Collections.Generic.IEnumerable[System.Linq.Expressions.Expression]): System.Linq.Expressions.MethodCallExpression  = null
   
  def ArrayIndex(array : System.Linq.Expressions.Expression, 
                 index : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def ArrayIndex(array : System.Linq.Expressions.Expression, 
                 indexes : Array[System.Linq.Expressions.Expression]): System.Linq.Expressions.MethodCallExpression  = null
   
  def ArrayLength(array : System.Linq.Expressions.Expression): System.Linq.Expressions.UnaryExpression  = null
   
  def Bind(member : System.Reflection.MemberInfo, 
           expression : System.Linq.Expressions.Expression): System.Linq.Expressions.MemberAssignment  = null
   
  def Bind(propertyAccessor : System.Reflection.MethodInfo, 
           expression : System.Linq.Expressions.Expression): System.Linq.Expressions.MemberAssignment  = null
   
  def Call(instance : System.Linq.Expressions.Expression, 
           method : System.Reflection.MethodInfo): System.Linq.Expressions.MethodCallExpression  = null
   
  def Call(instance : System.Linq.Expressions.Expression, 
           method : System.Reflection.MethodInfo, 
           arguments : System.Collections.Generic.IEnumerable[System.Linq.Expressions.Expression]): System.Linq.Expressions.MethodCallExpression  = null
   
  def Call(instance : System.Linq.Expressions.Expression, 
           method : System.Reflection.MethodInfo, 
           arguments : Array[System.Linq.Expressions.Expression]): System.Linq.Expressions.MethodCallExpression  = null
   
  def Call(instance : System.Linq.Expressions.Expression, methodName : String, 
           typeArguments : Array[System.Type], 
           arguments : Array[System.Linq.Expressions.Expression]): System.Linq.Expressions.MethodCallExpression  = null
   
  def Call(method : System.Reflection.MethodInfo, 
           arguments : Array[System.Linq.Expressions.Expression]): System.Linq.Expressions.MethodCallExpression  = null
   
  def Call(`type` : System.Type, methodName : String, typeArguments : Array[System.Type], 
           arguments : Array[System.Linq.Expressions.Expression]): System.Linq.Expressions.MethodCallExpression  = null
   
  def Coalesce(left : System.Linq.Expressions.Expression, 
               right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def Coalesce(left : System.Linq.Expressions.Expression, 
               right : System.Linq.Expressions.Expression, 
               conversion : System.Linq.Expressions.LambdaExpression): System.Linq.Expressions.BinaryExpression  = null
   
  def Condition(test : System.Linq.Expressions.Expression, 
                ifTrue : System.Linq.Expressions.Expression, 
                ifFalse : System.Linq.Expressions.Expression): System.Linq.Expressions.ConditionalExpression  = null
   
  def Constant(value : AnyRef): System.Linq.Expressions.ConstantExpression  = null
   
  def Constant(value : AnyRef, `type` : System.Type): System.Linq.Expressions.ConstantExpression  = null
   
  def Convert(expression : System.Linq.Expressions.Expression, `type` : System.Type): System.Linq.Expressions.UnaryExpression  = null
   
  def Convert(expression : System.Linq.Expressions.Expression, `type` : System.Type, 
              method : System.Reflection.MethodInfo): System.Linq.Expressions.UnaryExpression  = null
   
  def ConvertChecked(expression : System.Linq.Expressions.Expression, `type` : System.Type): System.Linq.Expressions.UnaryExpression  = null
   
  def ConvertChecked(expression : System.Linq.Expressions.Expression, `type` : System.Type, 
                     method : System.Reflection.MethodInfo): System.Linq.Expressions.UnaryExpression  = null
   
  def Divide(left : System.Linq.Expressions.Expression, 
             right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def Divide(left : System.Linq.Expressions.Expression, 
             right : System.Linq.Expressions.Expression, method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def ElementInit(addMethod : System.Reflection.MethodInfo, 
                  arguments : System.Collections.Generic.IEnumerable[System.Linq.Expressions.Expression]): System.Linq.Expressions.ElementInit  = null
   
  def ElementInit(addMethod : System.Reflection.MethodInfo, 
                  arguments : Array[System.Linq.Expressions.Expression]): System.Linq.Expressions.ElementInit  = null
   
  def Equal(left : System.Linq.Expressions.Expression, 
            right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def Equal(left : System.Linq.Expressions.Expression, 
            right : System.Linq.Expressions.Expression, liftToNull : Boolean, 
            method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def ExclusiveOr(left : System.Linq.Expressions.Expression, 
                  right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def ExclusiveOr(left : System.Linq.Expressions.Expression, 
                  right : System.Linq.Expressions.Expression, method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def Field(expression : System.Linq.Expressions.Expression, 
            field : System.Reflection.FieldInfo): System.Linq.Expressions.MemberExpression  = null
   
  def Field(expression : System.Linq.Expressions.Expression, fieldName : String): System.Linq.Expressions.MemberExpression  = null
   
  def GetActionType(typeArgs : Array[System.Type]): System.Type  = null
   
  def GetFuncType(typeArgs : Array[System.Type]): System.Type  = null
   
  def GreaterThan(left : System.Linq.Expressions.Expression, 
                  right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def GreaterThan(left : System.Linq.Expressions.Expression, 
                  right : System.Linq.Expressions.Expression, liftToNull : Boolean, 
                  method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def GreaterThanOrEqual(left : System.Linq.Expressions.Expression, 
                         right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def GreaterThanOrEqual(left : System.Linq.Expressions.Expression, 
                         right : System.Linq.Expressions.Expression, liftToNull : Boolean, 
                         method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def Invoke(expression : System.Linq.Expressions.Expression, 
             arguments : System.Collections.Generic.IEnumerable[System.Linq.Expressions.Expression]): System.Linq.Expressions.InvocationExpression  = null
   
  def Invoke(expression : System.Linq.Expressions.Expression, 
             arguments : Array[System.Linq.Expressions.Expression]): System.Linq.Expressions.InvocationExpression  = null
   
  def Lambda(body : System.Linq.Expressions.Expression, 
             parameters : Array[System.Linq.Expressions.ParameterExpression]): System.Linq.Expressions.LambdaExpression  = null
   
  def Lambda(delegateType : System.Type, body : System.Linq.Expressions.Expression, 
             parameters : System.Collections.Generic.IEnumerable[System.Linq.Expressions.ParameterExpression]): System.Linq.Expressions.LambdaExpression  = null
   
  def Lambda(delegateType : System.Type, body : System.Linq.Expressions.Expression, 
             parameters : Array[System.Linq.Expressions.ParameterExpression]): System.Linq.Expressions.LambdaExpression  = null
   
  def Lambda[TDelegate](body : System.Linq.Expressions.Expression, 
                        parameters : System.Collections.Generic.IEnumerable[System.Linq.Expressions.ParameterExpression]): System.Linq.Expressions.Expression[TDelegate]  = null
   
  def Lambda[TDelegate](body : System.Linq.Expressions.Expression, 
                        parameters : Array[System.Linq.Expressions.ParameterExpression]): System.Linq.Expressions.Expression[TDelegate]  = null
   
  def LeftShift(left : System.Linq.Expressions.Expression, 
                right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def LeftShift(left : System.Linq.Expressions.Expression, 
                right : System.Linq.Expressions.Expression, method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def LessThan(left : System.Linq.Expressions.Expression, 
               right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def LessThan(left : System.Linq.Expressions.Expression, 
               right : System.Linq.Expressions.Expression, liftToNull : Boolean, 
               method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def LessThanOrEqual(left : System.Linq.Expressions.Expression, 
                      right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def LessThanOrEqual(left : System.Linq.Expressions.Expression, 
                      right : System.Linq.Expressions.Expression, liftToNull : Boolean, 
                      method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def ListBind(member : System.Reflection.MemberInfo, 
               initializers : System.Collections.Generic.IEnumerable[System.Linq.Expressions.ElementInit]): System.Linq.Expressions.MemberListBinding  = null
   
  def ListBind(member : System.Reflection.MemberInfo, 
               initializers : Array[System.Linq.Expressions.ElementInit]): System.Linq.Expressions.MemberListBinding  = null
   
  def ListBind(propertyAccessor : System.Reflection.MethodInfo, 
               initializers : System.Collections.Generic.IEnumerable[System.Linq.Expressions.ElementInit]): System.Linq.Expressions.MemberListBinding  = null
   
  def ListBind(propertyAccessor : System.Reflection.MethodInfo, 
               initializers : Array[System.Linq.Expressions.ElementInit]): System.Linq.Expressions.MemberListBinding  = null
   
  def ListInit(newExpression : System.Linq.Expressions.NewExpression, 
               initializers : System.Collections.Generic.IEnumerable[System.Linq.Expressions.ElementInit]): System.Linq.Expressions.ListInitExpression  = null
   
  def ListInit(newExpression : System.Linq.Expressions.NewExpression, 
               initializers : System.Collections.Generic.IEnumerable[System.Linq.Expressions.Expression]): System.Linq.Expressions.ListInitExpression  = null
   
  def ListInit(newExpression : System.Linq.Expressions.NewExpression, 
               initializers : Array[System.Linq.Expressions.ElementInit]): System.Linq.Expressions.ListInitExpression  = null
   
  def ListInit(newExpression : System.Linq.Expressions.NewExpression, 
               initializers : Array[System.Linq.Expressions.Expression]): System.Linq.Expressions.ListInitExpression  = null
   
  def ListInit(newExpression : System.Linq.Expressions.NewExpression, 
               addMethod : System.Reflection.MethodInfo, 
               initializers : System.Collections.Generic.IEnumerable[System.Linq.Expressions.Expression]): System.Linq.Expressions.ListInitExpression  = null
   
  def ListInit(newExpression : System.Linq.Expressions.NewExpression, 
               addMethod : System.Reflection.MethodInfo, 
               initializers : Array[System.Linq.Expressions.Expression]): System.Linq.Expressions.ListInitExpression  = null
   
  def MakeBinary(binaryType : System.Linq.Expressions.ExpressionType, 
                 left : System.Linq.Expressions.Expression, 
                 right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def MakeBinary(binaryType : System.Linq.Expressions.ExpressionType, 
                 left : System.Linq.Expressions.Expression, 
                 right : System.Linq.Expressions.Expression, liftToNull : Boolean, 
                 method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def MakeBinary(binaryType : System.Linq.Expressions.ExpressionType, 
                 left : System.Linq.Expressions.Expression, 
                 right : System.Linq.Expressions.Expression, liftToNull : Boolean, 
                 method : System.Reflection.MethodInfo, 
                 conversion : System.Linq.Expressions.LambdaExpression): System.Linq.Expressions.BinaryExpression  = null
   
  def MakeMemberAccess(expression : System.Linq.Expressions.Expression, 
                       member : System.Reflection.MemberInfo): System.Linq.Expressions.MemberExpression  = null
   
  def MakeUnary(unaryType : System.Linq.Expressions.ExpressionType, 
                operand : System.Linq.Expressions.Expression, `type` : System.Type): System.Linq.Expressions.UnaryExpression  = null
   
  def MakeUnary(unaryType : System.Linq.Expressions.ExpressionType, 
                operand : System.Linq.Expressions.Expression, `type` : System.Type, 
                method : System.Reflection.MethodInfo): System.Linq.Expressions.UnaryExpression  = null
   
  def MemberBind(member : System.Reflection.MemberInfo, 
                 bindings : System.Collections.Generic.IEnumerable[System.Linq.Expressions.MemberBinding]): System.Linq.Expressions.MemberMemberBinding  = null
   
  def MemberBind(member : System.Reflection.MemberInfo, 
                 bindings : Array[System.Linq.Expressions.MemberBinding]): System.Linq.Expressions.MemberMemberBinding  = null
   
  def MemberBind(propertyAccessor : System.Reflection.MethodInfo, 
                 bindings : System.Collections.Generic.IEnumerable[System.Linq.Expressions.MemberBinding]): System.Linq.Expressions.MemberMemberBinding  = null
   
  def MemberBind(propertyAccessor : System.Reflection.MethodInfo, 
                 bindings : Array[System.Linq.Expressions.MemberBinding]): System.Linq.Expressions.MemberMemberBinding  = null
   
  def MemberInit(newExpression : System.Linq.Expressions.NewExpression, 
                 bindings : System.Collections.Generic.IEnumerable[System.Linq.Expressions.MemberBinding]): System.Linq.Expressions.MemberInitExpression  = null
   
  def MemberInit(newExpression : System.Linq.Expressions.NewExpression, 
                 bindings : Array[System.Linq.Expressions.MemberBinding]): System.Linq.Expressions.MemberInitExpression  = null
   
  def Modulo(left : System.Linq.Expressions.Expression, 
             right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def Modulo(left : System.Linq.Expressions.Expression, 
             right : System.Linq.Expressions.Expression, method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def Multiply(left : System.Linq.Expressions.Expression, 
               right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def Multiply(left : System.Linq.Expressions.Expression, 
               right : System.Linq.Expressions.Expression, method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def MultiplyChecked(left : System.Linq.Expressions.Expression, 
                      right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def MultiplyChecked(left : System.Linq.Expressions.Expression, 
                      right : System.Linq.Expressions.Expression, method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def Negate(expression : System.Linq.Expressions.Expression): System.Linq.Expressions.UnaryExpression  = null
   
  def Negate(expression : System.Linq.Expressions.Expression, 
             method : System.Reflection.MethodInfo): System.Linq.Expressions.UnaryExpression  = null
   
  def NegateChecked(expression : System.Linq.Expressions.Expression): System.Linq.Expressions.UnaryExpression  = null
   
  def NegateChecked(expression : System.Linq.Expressions.Expression, 
                    method : System.Reflection.MethodInfo): System.Linq.Expressions.UnaryExpression  = null
   
  def New(constructor : System.Reflection.ConstructorInfo): System.Linq.Expressions.NewExpression  = null
   
  def New(constructor : System.Reflection.ConstructorInfo, 
          arguments : System.Collections.Generic.IEnumerable[System.Linq.Expressions.Expression]): System.Linq.Expressions.NewExpression  = null
   
  def New(constructor : System.Reflection.ConstructorInfo, 
          arguments : System.Collections.Generic.IEnumerable[System.Linq.Expressions.Expression], 
          members : System.Collections.Generic.IEnumerable[System.Reflection.MemberInfo]): System.Linq.Expressions.NewExpression  = null
   
  def New(constructor : System.Reflection.ConstructorInfo, 
          arguments : System.Collections.Generic.IEnumerable[System.Linq.Expressions.Expression], 
          members : Array[System.Reflection.MemberInfo]): System.Linq.Expressions.NewExpression  = null
   
  def New(constructor : System.Reflection.ConstructorInfo, 
          arguments : Array[System.Linq.Expressions.Expression]): System.Linq.Expressions.NewExpression  = null
   
  def New(`type` : System.Type): System.Linq.Expressions.NewExpression  = null
   
  def NewArrayBounds(`type` : System.Type, 
                     bounds : System.Collections.Generic.IEnumerable[System.Linq.Expressions.Expression]): System.Linq.Expressions.NewArrayExpression  = null
   
  def NewArrayBounds(`type` : System.Type, bounds : Array[System.Linq.Expressions.Expression]): System.Linq.Expressions.NewArrayExpression  = null
   
  def NewArrayInit(`type` : System.Type, 
                   initializers : System.Collections.Generic.IEnumerable[System.Linq.Expressions.Expression]): System.Linq.Expressions.NewArrayExpression  = null
   
  def NewArrayInit(`type` : System.Type, initializers : Array[System.Linq.Expressions.Expression]): System.Linq.Expressions.NewArrayExpression  = null
   
  def Not(expression : System.Linq.Expressions.Expression): System.Linq.Expressions.UnaryExpression  = null
   
  def Not(expression : System.Linq.Expressions.Expression, 
          method : System.Reflection.MethodInfo): System.Linq.Expressions.UnaryExpression  = null
   
  def NotEqual(left : System.Linq.Expressions.Expression, 
               right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def NotEqual(left : System.Linq.Expressions.Expression, 
               right : System.Linq.Expressions.Expression, liftToNull : Boolean, 
               method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def Or(left : System.Linq.Expressions.Expression, 
         right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def Or(left : System.Linq.Expressions.Expression, 
         right : System.Linq.Expressions.Expression, method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def OrElse(left : System.Linq.Expressions.Expression, 
             right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def OrElse(left : System.Linq.Expressions.Expression, 
             right : System.Linq.Expressions.Expression, method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def Parameter(`type` : System.Type, name : String): System.Linq.Expressions.ParameterExpression  = null
   
  def Power(left : System.Linq.Expressions.Expression, 
            right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def Power(left : System.Linq.Expressions.Expression, 
            right : System.Linq.Expressions.Expression, method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def Property(expression : System.Linq.Expressions.Expression, 
               propertyAccessor : System.Reflection.MethodInfo): System.Linq.Expressions.MemberExpression  = null
   
  def Property(expression : System.Linq.Expressions.Expression, 
               property : System.Reflection.PropertyInfo): System.Linq.Expressions.MemberExpression  = null
   
  def Property(expression : System.Linq.Expressions.Expression, propertyName : String): System.Linq.Expressions.MemberExpression  = null
   
  def PropertyOrField(expression : System.Linq.Expressions.Expression, propertyOrFieldName : String): System.Linq.Expressions.MemberExpression  = null
   
  def Quote(expression : System.Linq.Expressions.Expression): System.Linq.Expressions.UnaryExpression  = null
   
  def RightShift(left : System.Linq.Expressions.Expression, 
                 right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def RightShift(left : System.Linq.Expressions.Expression, 
                 right : System.Linq.Expressions.Expression, method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def Subtract(left : System.Linq.Expressions.Expression, 
               right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def Subtract(left : System.Linq.Expressions.Expression, 
               right : System.Linq.Expressions.Expression, method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def SubtractChecked(left : System.Linq.Expressions.Expression, 
                      right : System.Linq.Expressions.Expression): System.Linq.Expressions.BinaryExpression  = null
   
  def SubtractChecked(left : System.Linq.Expressions.Expression, 
                      right : System.Linq.Expressions.Expression, method : System.Reflection.MethodInfo): System.Linq.Expressions.BinaryExpression  = null
   
  def TypeAs(expression : System.Linq.Expressions.Expression, `type` : System.Type): System.Linq.Expressions.UnaryExpression  = null
   
  def TypeIs(expression : System.Linq.Expressions.Expression, `type` : System.Type): System.Linq.Expressions.TypeBinaryExpression  = null
   
  def UnaryPlus(expression : System.Linq.Expressions.Expression): System.Linq.Expressions.UnaryExpression  = null
   
  def UnaryPlus(expression : System.Linq.Expressions.Expression, 
                method : System.Reflection.MethodInfo): System.Linq.Expressions.UnaryExpression  = null
}
 
sealed class BinaryExpression extends System.Linq.Expressions.Expression {
  val Conversion : System.Linq.Expressions.LambdaExpression = null
   
  val IsLifted : Boolean = false
   
  val IsLiftedToNull : Boolean = false
   
  val Left : System.Linq.Expressions.Expression = null
   
  val Method : System.Reflection.MethodInfo = null
   
  val Right : System.Linq.Expressions.Expression = null
}
 
sealed class ConditionalExpression extends System.Linq.Expressions.Expression {
  val IfFalse : System.Linq.Expressions.Expression = null
   
  val IfTrue : System.Linq.Expressions.Expression = null
   
  val Test : System.Linq.Expressions.Expression = null
}
 
sealed class ConstantExpression extends System.Linq.Expressions.Expression {
  val Value : AnyRef = null
}
 
sealed class ElementInit extends AnyRef {
  def ToString: String
   
  val AddMethod : System.Reflection.MethodInfo = null
   
  val Arguments : System.Collections.ObjectModel.ReadOnlyCollection[System.Linq.Expressions.Expression] = null
}
 
abstract class LambdaExpression extends System.Linq.Expressions.Expression {
  def Compile: System.Delegate
   
  val Body : System.Linq.Expressions.Expression = null
   
  val Parameters : System.Collections.ObjectModel.ReadOnlyCollection[System.Linq.Expressions.ParameterExpression] = null
}
 
sealed class Expression[TDelegate] extends System.Linq.Expressions.LambdaExpression {
  def Compile: TDelegate
}
 
sealed abstract class ExpressionType extends System.Enum {
  def ==(that: System.Linq.Expressions.ExpressionType): Boolean = false
  def !=(that: System.Linq.Expressions.ExpressionType): Boolean = false
  def  <(that: System.Linq.Expressions.ExpressionType): Boolean = false
  def <=(that: System.Linq.Expressions.ExpressionType): Boolean = false
  def  >(that: System.Linq.Expressions.ExpressionType): Boolean = false
  def >=(that: System.Linq.Expressions.ExpressionType): Boolean = false
  def  |(that: System.Linq.Expressions.ExpressionType): Boolean = false
  def  &(that: System.Linq.Expressions.ExpressionType): Boolean = false
  def  ^(that: System.Linq.Expressions.ExpressionType): Boolean = false
}
object ExpressionType{
  val Add	 = value(0)
  val AddChecked	 = value(1)
  val And	 = value(2)
  val AndAlso	 = value(3)
  val ArrayIndex	 = value(5)
  val ArrayLength	 = value(4)
  val Call	 = value(6)
  val Coalesce	 = value(7)
  val Conditional	 = value(8)
  val Constant	 = value(9)
  val Convert	 = value(10)
  val ConvertChecked	 = value(11)
  val Divide	 = value(12)
  val Equal	 = value(13)
  val ExclusiveOr	 = value(14)
  val GreaterThan	 = value(15)
  val GreaterThanOrEqual	 = value(16)
  val Invoke	 = value(17)
  val Lambda	 = value(18)
  val LeftShift	 = value(19)
  val LessThan	 = value(20)
  val LessThanOrEqual	 = value(21)
  val ListInit	 = value(22)
  val MemberAccess	 = value(23)
  val MemberInit	 = value(24)
  val Modulo	 = value(25)
  val Multiply	 = value(26)
  val MultiplyChecked	 = value(27)
  val Negate	 = value(28)
  val NegateChecked	 = value(30)
  val New	 = value(31)
  val NewArrayBounds	 = value(33)
  val NewArrayInit	 = value(32)
  val Not	 = value(34)
  val NotEqual	 = value(35)
  val Or	 = value(36)
  val OrElse	 = value(37)
  val Parameter	 = value(38)
  val Power	 = value(39)
  val Quote	 = value(40)
  val RightShift	 = value(41)
  val Subtract	 = value(42)
  val SubtractChecked	 = value(43)
  val TypeAs	 = value(44)
  val TypeIs	 = value(45)
  val UnaryPlus	 = value(29)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Linq.Expressions.ExpressionType = null
}
 
sealed class InvocationExpression extends System.Linq.Expressions.Expression {
  val Arguments : System.Collections.ObjectModel.ReadOnlyCollection[System.Linq.Expressions.Expression] = null
   
  val Expression : System.Linq.Expressions.Expression = null
}
 
sealed class ListInitExpression extends System.Linq.Expressions.Expression {
  val Initializers : System.Collections.ObjectModel.ReadOnlyCollection[System.Linq.Expressions.ElementInit] = null
   
  val NewExpression : System.Linq.Expressions.NewExpression = null
}
 
abstract class MemberBinding extends AnyRef {
  def ToString: String
   
  val BindingType : System.Linq.Expressions.MemberBindingType = System.Linq.Expressions.MemberBindingType.Assignment
   
  val Member : System.Reflection.MemberInfo = null
}
 
sealed class MemberAssignment extends System.Linq.Expressions.MemberBinding {
  val Expression : System.Linq.Expressions.Expression = null
}
 
sealed abstract class MemberBindingType extends System.Enum {
  def ==(that: System.Linq.Expressions.MemberBindingType): Boolean = false
  def !=(that: System.Linq.Expressions.MemberBindingType): Boolean = false
  def  <(that: System.Linq.Expressions.MemberBindingType): Boolean = false
  def <=(that: System.Linq.Expressions.MemberBindingType): Boolean = false
  def  >(that: System.Linq.Expressions.MemberBindingType): Boolean = false
  def >=(that: System.Linq.Expressions.MemberBindingType): Boolean = false
  def  |(that: System.Linq.Expressions.MemberBindingType): Boolean = false
  def  &(that: System.Linq.Expressions.MemberBindingType): Boolean = false
  def  ^(that: System.Linq.Expressions.MemberBindingType): Boolean = false
}
object MemberBindingType{
  val Assignment	 = value(0)
  val ListBinding	 = value(2)
  val MemberBinding	 = value(1)
   
  /* an artifact for CLR enums */ private def value(i: Int): System.Linq.Expressions.MemberBindingType = null
}
 
sealed class MemberExpression extends System.Linq.Expressions.Expression {
  val Expression : System.Linq.Expressions.Expression = null
   
  val Member : System.Reflection.MemberInfo = null
}
 
sealed class MemberInitExpression extends System.Linq.Expressions.Expression {
  val Bindings : System.Collections.ObjectModel.ReadOnlyCollection[System.Linq.Expressions.MemberBinding] = null
   
  val NewExpression : System.Linq.Expressions.NewExpression = null
}
 
sealed class MemberListBinding extends System.Linq.Expressions.MemberBinding {
  val Initializers : System.Collections.ObjectModel.ReadOnlyCollection[System.Linq.Expressions.ElementInit] = null
}
 
sealed class MemberMemberBinding extends System.Linq.Expressions.MemberBinding {
  val Bindings : System.Collections.ObjectModel.ReadOnlyCollection[System.Linq.Expressions.MemberBinding] = null
}
 
sealed class MethodCallExpression extends System.Linq.Expressions.Expression {
  val Arguments : System.Collections.ObjectModel.ReadOnlyCollection[System.Linq.Expressions.Expression] = null
   
  val Method : System.Reflection.MethodInfo = null
   
  val Object : System.Linq.Expressions.Expression = null
}
 
sealed class NewArrayExpression extends System.Linq.Expressions.Expression {
  val Expressions : System.Collections.ObjectModel.ReadOnlyCollection[System.Linq.Expressions.Expression] = null
}
 
sealed class NewExpression extends System.Linq.Expressions.Expression {
  val Arguments : System.Collections.ObjectModel.ReadOnlyCollection[System.Linq.Expressions.Expression] = null
   
  val Constructor : System.Reflection.ConstructorInfo = null
   
  val Members : System.Collections.ObjectModel.ReadOnlyCollection[System.Reflection.MemberInfo] = null
}
 
sealed class ParameterExpression extends System.Linq.Expressions.Expression {
  val Name : String = ""
}
 
sealed class TypeBinaryExpression extends System.Linq.Expressions.Expression {
  val Expression : System.Linq.Expressions.Expression = null
   
  val TypeOperand : System.Type = null
}
 
sealed class UnaryExpression extends System.Linq.Expressions.Expression {
  val IsLifted : Boolean = false
   
  val IsLiftedToNull : Boolean = false
   
  val Method : System.Reflection.MethodInfo = null
   
  val Operand : System.Linq.Expressions.Expression = null
}
 
}