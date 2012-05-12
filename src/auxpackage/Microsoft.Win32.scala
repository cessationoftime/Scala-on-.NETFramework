/* assembly: mscorlib, Version=2.0.0.0 */

/* location: C:\Users\cvanvranken\gits\UnityScriptingScala\netlibs\mscorlib.dll */

import auxPackage.auxiliary._

package Microsoft.Win32 {

  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  abstract sealed class Registry extends AnyRef
  object Registry {
    def GetValue(keyName: String, valueName: String, defaultValue: AnyRef): AnyRef = null

    def SetValue(keyName: String, valueName: String, value: AnyRef): Unit = {}

    def SetValue(keyName: String, valueName: String, value: AnyRef,
      valueKind: Microsoft.Win32.RegistryValueKind): Unit = {}

    val CurrentUser: Microsoft.Win32.RegistryKey = null

    val LocalMachine: Microsoft.Win32.RegistryKey = null

    val ClassesRoot: Microsoft.Win32.RegistryKey = null

    val Users: Microsoft.Win32.RegistryKey = null

    val PerformanceData: Microsoft.Win32.RegistryKey = null

    val CurrentConfig: Microsoft.Win32.RegistryKey = null

    val DynData: Microsoft.Win32.RegistryKey = null
  }

  sealed abstract class RegistryHive extends System.Enum {
    def ==(that: Microsoft.Win32.RegistryHive): Boolean = false
    def !=(that: Microsoft.Win32.RegistryHive): Boolean = false
    def <(that: Microsoft.Win32.RegistryHive): Boolean = false
    def <=(that: Microsoft.Win32.RegistryHive): Boolean = false
    def >(that: Microsoft.Win32.RegistryHive): Boolean = false
    def >=(that: Microsoft.Win32.RegistryHive): Boolean = false
    def |(that: Microsoft.Win32.RegistryHive): Boolean = false
    def &(that: Microsoft.Win32.RegistryHive): Boolean = false
    def ^(that: Microsoft.Win32.RegistryHive): Boolean = false
  }
  object RegistryHive {
    val ClassesRoot = value(-2147483648)
    val CurrentUser = value(-2147483647)
    val LocalMachine = value(-2147483646)
    val Users = value(-2147483645)
    val PerformanceData = value(-2147483644)
    val CurrentConfig = value(-2147483643)
    val DynData = value(-2147483642)

    /* an artifact for CLR enums */ private def value(i: Int): Microsoft.Win32.RegistryHive = null
  }

  @System.Runtime.InteropServices.ComVisibleAttribute(true)
  sealed class RegistryKey extends System.MarshalByRefObject with System.IDisposable {
    def Close: Unit

    def Flush: Unit

    def CreateSubKey(subkey: String): Microsoft.Win32.RegistryKey

    @System.Runtime.InteropServices.ComVisibleAttribute(false)
    def CreateSubKey(subkey: String, permissionCheck: Microsoft.Win32.RegistryKeyPermissionCheck): Microsoft.Win32.RegistryKey

    @System.Runtime.InteropServices.ComVisibleAttribute(false)
    def CreateSubKey(subkey: String, permissionCheck: Microsoft.Win32.RegistryKeyPermissionCheck,
      registrySecurity: System.Security.AccessControl.RegistrySecurity): Microsoft.Win32.RegistryKey

    def DeleteSubKey(subkey: String): Unit

    def DeleteSubKey(subkey: String, throwOnMissingSubKey: Boolean): Unit

    def DeleteSubKeyTree(subkey: String): Unit

    def DeleteValue(name: String): Unit

    def DeleteValue(name: String, throwOnMissingValue: Boolean): Unit

    def OpenSubKey(name: String, writable: Boolean): Microsoft.Win32.RegistryKey

    @System.Runtime.InteropServices.ComVisibleAttribute(false)
    def OpenSubKey(name: String, permissionCheck: Microsoft.Win32.RegistryKeyPermissionCheck): Microsoft.Win32.RegistryKey

    @System.Runtime.InteropServices.ComVisibleAttribute(false)
    def OpenSubKey(name: String, permissionCheck: Microsoft.Win32.RegistryKeyPermissionCheck,
      rights: System.Security.AccessControl.RegistryRights): Microsoft.Win32.RegistryKey

    def OpenSubKey(name: String): Microsoft.Win32.RegistryKey

    def GetSubKeyNames: Array[String]

    def GetValueNames: Array[String]

    def GetValue(name: String): AnyRef

    def GetValue(name: String, defaultValue: AnyRef): AnyRef

    @System.Runtime.InteropServices.ComVisibleAttribute(false)
    def GetValue(name: String, defaultValue: AnyRef, options: Microsoft.Win32.RegistryValueOptions): AnyRef

    @System.Runtime.InteropServices.ComVisibleAttribute(false)
    def GetValueKind(name: String): Microsoft.Win32.RegistryValueKind

    def SetValue(name: String, value: AnyRef): Unit

    @System.Runtime.InteropServices.ComVisibleAttribute(false)
    def SetValue(name: String, value: AnyRef, valueKind: Microsoft.Win32.RegistryValueKind): Unit

    def ToString: String

    def GetAccessControl: System.Security.AccessControl.RegistrySecurity

    def GetAccessControl(includeSections: System.Security.AccessControl.AccessControlSections): System.Security.AccessControl.RegistrySecurity

    def SetAccessControl(registrySecurity: System.Security.AccessControl.RegistrySecurity): Unit

    val SubKeyCount: Int = 0

    val ValueCount: Int = 0

    val Name: String = ""
  }
  object RegistryKey {
    def OpenRemoteBaseKey(hKey: Microsoft.Win32.RegistryHive, machineName: String): Microsoft.Win32.RegistryKey = null
  }

  sealed abstract class RegistryValueOptions extends System.Enum {
    def ==(that: Microsoft.Win32.RegistryValueOptions): Boolean = false
    def !=(that: Microsoft.Win32.RegistryValueOptions): Boolean = false
    def <(that: Microsoft.Win32.RegistryValueOptions): Boolean = false
    def <=(that: Microsoft.Win32.RegistryValueOptions): Boolean = false
    def >(that: Microsoft.Win32.RegistryValueOptions): Boolean = false
    def >=(that: Microsoft.Win32.RegistryValueOptions): Boolean = false
    def |(that: Microsoft.Win32.RegistryValueOptions): Boolean = false
    def &(that: Microsoft.Win32.RegistryValueOptions): Boolean = false
    def ^(that: Microsoft.Win32.RegistryValueOptions): Boolean = false
  }
  object RegistryValueOptions {
    val None = value(0)
    val DoNotExpandEnvironmentNames = value(1)

    /* an artifact for CLR enums */ private def value(i: Int): Microsoft.Win32.RegistryValueOptions = null
  }

  sealed abstract class RegistryKeyPermissionCheck extends System.Enum {
    def ==(that: Microsoft.Win32.RegistryKeyPermissionCheck): Boolean = false
    def !=(that: Microsoft.Win32.RegistryKeyPermissionCheck): Boolean = false
    def <(that: Microsoft.Win32.RegistryKeyPermissionCheck): Boolean = false
    def <=(that: Microsoft.Win32.RegistryKeyPermissionCheck): Boolean = false
    def >(that: Microsoft.Win32.RegistryKeyPermissionCheck): Boolean = false
    def >=(that: Microsoft.Win32.RegistryKeyPermissionCheck): Boolean = false
    def |(that: Microsoft.Win32.RegistryKeyPermissionCheck): Boolean = false
    def &(that: Microsoft.Win32.RegistryKeyPermissionCheck): Boolean = false
    def ^(that: Microsoft.Win32.RegistryKeyPermissionCheck): Boolean = false
  }
  object RegistryKeyPermissionCheck {
    val Default = value(0)
    val ReadSubTree = value(1)
    val ReadWriteSubTree = value(2)

    /* an artifact for CLR enums */ private def value(i: Int): Microsoft.Win32.RegistryKeyPermissionCheck = null
  }

  sealed abstract class RegistryValueKind extends System.Enum {
    def ==(that: Microsoft.Win32.RegistryValueKind): Boolean = false
    def !=(that: Microsoft.Win32.RegistryValueKind): Boolean = false
    def <(that: Microsoft.Win32.RegistryValueKind): Boolean = false
    def <=(that: Microsoft.Win32.RegistryValueKind): Boolean = false
    def >(that: Microsoft.Win32.RegistryValueKind): Boolean = false
    def >=(that: Microsoft.Win32.RegistryValueKind): Boolean = false
    def |(that: Microsoft.Win32.RegistryValueKind): Boolean = false
    def &(that: Microsoft.Win32.RegistryValueKind): Boolean = false
    def ^(that: Microsoft.Win32.RegistryValueKind): Boolean = false
  }
  object RegistryValueKind {
    val String = value(1)
    val ExpandString = value(2)
    val Binary = value(3)
    val DWord = value(4)
    val MultiString = value(7)
    val QWord = value(11)
    val Unknown = value(0)

    /* an artifact for CLR enums */ private def value(i: Int): Microsoft.Win32.RegistryValueKind = null
  }

}