
# Lokalise Android SDK v2 Demo

Over-the-air localization SDK for Android devices. No more unnecessary app updates.

### Dependency

Add Lokalise maven repository:

```groovy
allprojects {  
    repositories {  
        ... 
        maven {  
            url "https://maven.lokalise.com"  
        }  
    }  
}
```

Include dependencies:

```groovy
dependencies {
    implementation('com.lokalise.android:sdk:2.1.1') {  
        transitive = true  
    } 
}
```

Read **[documentation page](https://developers.lokalise.com/docs/android-sdk-v2)** for detailed integration guide.


