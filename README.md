Retrofit Test 
--------------------

[![Crates.io](https://img.shields.io/crates/l/rustc-serialize.svg?maxAge=2592000)]()

This is a project demonstrates how to write unit test for your endpoint. For this demo, we will use 
[TMDB API](https://www.themoviedb.org/account/signup)  to fetch data.

## Description


This project uses the Gradle build system and the Android gradle plugin support for unit testing.
You can either benefit from IDEs integration such as Android studio or run the tests on the command
line.
Unit tests run on a local JVM on your development machine. The Android Gradle plugin will compile your app's source code and execute it using gradle test task. 

For more information see [Android's Documentation](http://tools.android.com/tech-docs/unit-testing-support)

## Setup the project in Android studio and run tests.

1. Download the project code, preferably using `git clone`.
2. In Android Studio, select *File* | *Open...* and point to the `./build.gradle` file.
3. Make sure you select "Unit Tests" as the test artifact in the "Build Variants" panel in Android Studio. 
4. Check out the relevant code:
    * Unit Tests are in `src/test/java`
5. Create a test configuration with the JUnit4 runner: `org.junit.runners.JUnit4`
    * Open *Run* menu | *Edit Configurations*
    * Add a new *JUnit* configuration
    * Choose module *app*
    * Select the class to run by using the *...* button
6. Run the newly created configuration

The unit test will be ran automatically.

## Use Gradle on the command line.

After downloading the projects code using `git clone` you'll be able to run the
unit tests using the command line:

    ./gradlew test

If all the unit tests have been successful you will get a `BUILD SUCCESSFUL`
message.

## See the report.

A report in HTML format is generated in `app/build/reports/tests`

###TMDB API Key Setup
For the app to make requests, you require a TMDB API key. 

If you don’t already have an account, you will need to [create one](https://www.themoviedb.org/account/signup) 
in order to request an API Key.

Once you have it, open `gradle.properties` file and paste your API key in `TMDB_API_KEY` variable.

## Project Structure
    retrofittests
    ├─ app
    │  ├─ libs
    │  ├─ src
    │  │  ├─ androidTest
    │  │  └─ main
    │  │  │  ├─ java
    │  │  │  │  └─ com/thomaskioko/retrofittests
    │  │  │  │  └─ com/thomaskioko/retrofittests/api
    │  │  │  │  └─ com/thomaskioko/retrofittests/api/interfaces
    │  │  │  │  └─ com/thomaskioko/retrofittests/api/model
    │  │  │  │  └─ com/thomaskioko/retrofittests/util
    │  │  │  ├─ res
    │  │  │  └─ AndroidManifest.xml
    │  │  └─test
    │  ├─ build.gradle
    │  └─ proguard-rules.pro
    ├─ build.gradle
    └─ settings.gradle

## Libraries Used
 1. [Retrofit](http://square.github.io/retrofit/)
 2. [OkHTTP](http://square.github.io/okhttp/)
 

```

Copyright 2016 Thomas Kioko (code_wizard)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.