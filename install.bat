@echo off
set "fp=%~s1"
adb wait-for-device
@echo ���ڰ�װAPK: %fp%
adb install -r %fp%
timeout 5