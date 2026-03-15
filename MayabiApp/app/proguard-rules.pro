# Mayabi ProGuard Rules
-keepattributes JavascriptInterface
-keepclassmembers class com.mayabi.app.MainActivity$MayabiInterface {
    public *;
}
-keep class com.mayabi.app.** { *; }
-keep class androidx.webkit.** { *; }
-dontwarn androidx.webkit.**
