
@echo ��װ��ǰĿ¼�µ�����apk
adb wait-for-device
 
:: ����ApkPathĿ¼�µ��ļ������а�װ
:: %cd% ��ʾ��ǰĿ¼������ű�������ǵ�ǰĿ¼�� APKs��Ŀ¼�µ��ļ�
:: ���Ը����Լ��������޸�
 
set ApkPath=.
cd %ApkPath%
 
for /R %%s in (*.apk) do (
	::Ҫʹ������������apk��·������Ȼadb install�﷨����
	adb install -r "%%s"
)
:: ִ���꣬cmd��������5s
timeout 5
