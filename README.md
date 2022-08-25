# Toast-library-android

### Gradle
**Step 1** Add the JitPack repository to your build file. Add it in your build.gradle at the end of repositories.

```java
  repositories {
    maven { url "https://jitpack.io" }
  }
```

**Step-2** Add the dependency in the form

```java
dependencies {
    compile 'com.github.npanigrahy:Custom-Calendar-View:v1.0'
}
```
### Maven
```xml
<repository>
     <id>jitpack.io</id>
     <url>https://jitpack.io</url>
</repository>
```
**Step 2** Add the dependency in the form
```xml
<dependency>
     <groupId>com.github.npanigrahy</groupId>
     <artifactId>Custom-Calendar-View</artifactId>
     <version>v1.0</version>
</dependency>
```