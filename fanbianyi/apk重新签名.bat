::生成签名文件 重新打包用的
keytool -genkey -alias decompile.keystore -keyalg RSA -validity 40000 -keystore decompile.keystore
::各个参数解释如下：
::-genkey 产生证书文件 
::-alias 产生别名 
::-keystore 指定密钥库的.keystore文件中 
::-keyalg 指定密钥的算法,这里指定为RSA(非对称密钥算法) 
::-validity 为证书有效天数，这里我们写的是40000天

:: 拖入需要签名的apk
@echo 拖入需要签名的apk: %1
jarsigner -verbose -keystore decompile.keystore -signedjar sign_newapk.apk %1 decompile.keystore
pause