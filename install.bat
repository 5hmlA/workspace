@echo off
set "fp=%~s1"
adb wait-for-device
@echo 正在安装APK: %fp%
adb install -r %fp%
timeout 5