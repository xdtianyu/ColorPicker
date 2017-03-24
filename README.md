# ColorPicker
An easy to use android color picker library. Based on [android-colorpicker](https://github.com/woalk/android-colorpicker).

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ColorPicker-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/3324)
[![Build Status](https://travis-ci.org/xdtianyu/ColorPicker.svg?branch=master)](https://travis-ci.org/xdtianyu/ColorPicker)
[![JAR](https://img.shields.io/maven-central/v/org.xdty.preference/color-picker.svg)](http://central.maven.org/maven2/org/xdty/preference/color-picker/)
[ ![Download](https://api.bintray.com/packages/xdtianyu/maven/color-picker/images/download.svg) ](https://bintray.com/xdtianyu/maven/color-picker/_latestVersion)

## Download

Grab via gradle

```
dependencies {
    compile 'org.xdty.preference:color-picker:0.0.5'
}
```

or maven

```
<dependency>
  <groupId>org.xdty.preference</groupId>
  <artifactId>color-picker</artifactId>
  <version>0.0.5</version>
  <type>aar</type>
</dependency>
```

or JAR from [maven central](http://central.maven.org/maven2/org/xdty/preference/color-picker/)

## Usage

For more details, see [example](https://github.com/xdtianyu/ColorPicker/tree/master/example)

```
    <org.xdty.preference.ColorPreference
        android:key="example_color"
        android:title="Color"
        android:summary="This is a color preference"
        tools:dialogTitle="@string/default_color"
        tools:colors="@array/default_rainbow"
        tools:columns="5"
        tools:material="true"
        tools:backwardsOrder="true"
        tools:strokeWidth="0"
        tools:strokeColor="@android:color/black"
        android:defaultValue="@color/flamingo"/>
```

## ScreenShot

<img src="https://raw.githubusercontent.com/xdtianyu/CallerInfo/master/screenshots/6.png" alt="screenshot" width="300">
