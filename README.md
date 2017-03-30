# sa-sdk-android-plugin

The official Android SDK Plugin for Sensors Analytics

## 快速集成

1、在 project 级别的 build.gradle 文件中添加 android-gradle-plugin 依赖：

```android
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:2.2.3'
        //添加 android-gradle-plugin 依赖
        classpath 'com.sensorsdata.analytics.android:android-gradle-plugin:1.0.1'
    }
}

allprojects {
    repositories {
        jcenter()
    }
}
```

2、在 module 级别的 build.gradle 文件中添加com.sensorsdata.analytics.android 插件、Sensors Analytics SDK 依赖：

```android
apply plugin: 'com.android.application'
//添加 com.sensorsdata.analytics.android 插件
apply plugin: 'com.sensorsdata.analytics.android'

repositories {
    flatDir {
        dirs 'libs'
    }
}

dependencies {
	//添加 Sensors Analytics SDK 依赖
   //compile 'com.sensorsdata.analytics.android:SensorsAnalyticsSDK:1.7.0'
   compile(name:'SensorsAnalyticsSDK-1.7.0-release', ext:'aar')
}
```

## License


Copyright 2016 firefly1126, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.gradle_plugin_android_aspectjx
