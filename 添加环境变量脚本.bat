@echo off
set regpath=HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\Session Manager\Environment
set javahome=D:\0_0DevTools\Java\jdk
rem LPY
echo.
echo ************************************************************
echo *                                                          *
echo *                   JDK ϵͳ������������                   *
echo *                                                          *
echo ************************************************************
echo.
echo === ׼�����û�������: JAVA_HOME=%javahome%
echo === ע��: ���JAVA_HOME����,�ᱻ����,�˲����������,����ϸ���ȷ��!! ===
echo.
echo === ׼�����û�������(�����и�.): classPath=%%JAVA_HOME%%\lib\tools.jar;%%JAVA_HOME%%\lib\dt.jar;.
echo === ע��: ���classPath����,�ᱻ����,�˲����������,����ϸ���ȷ��!! ===
echo.
echo === ׼�����û�������: PATH=%%JAVA_HOME%%\bin
echo === ע��: PATH��׷������ǰ��,
echo.
set /P EN=��ȷ�Ϻ� �س��� ��ʼ����!
echo.
echo.
echo.
echo.
echo === �´����������� JAVA_HOME=%javahome%
setx "JAVA_HOME" "%javahome%" -M
setx "ANDROID_ADB_SERVER_PORT" "12306" -M
setx "ANDROID_HOME" "D:\0_0DevTools\Android\SDK" -M
setx "GRADLE_HOME" "D:\0_0DevTools\Android\ASConfig\gradle" -M
setx "FLUTTER_SDK" "D:\0_0DevTools\flutter\bin" -M
setx "GRADLE_USER_HOME" "H:\0_0DevWorks\.gradle" -M
setx "ANDROID_SDK_HOME" "H:\0_0Develop\Android\AVD" -M
echo.
echo.
echo === �´����������� classPath=%%JAVA_HOME%%\lib\tools.jar;%%JAVA_HOME%%%\lib\dt.jar;.
setx "DEV_PATH" %%JAVA_HOME%%\bin;%%JAVA_HOME%%\jre\bin;%%ANDROID_HOME%%\tools;%%ANDROID_HOME%%\platform-tools;%%GRADLE_HOME%%\bin;%%ANDROID_SDK_HOME%%;%%FLUTTER_SDK%% -m
echo.
echo.
echo === �ֶ��� %%DEV_PATH%% ��ӵ� PATH ���밴������˳�! 
echo === �ֶ��� %%DEV_PATH%% ��ӵ� PATH ���밴������˳�! 
echo === �ֶ��� %%DEV_PATH%% ��ӵ� PATH ���밴������˳�! 
pause>nul