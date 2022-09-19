@echo off

mkdir mymodapp\applib

"%JAVA_HOME%"\bin\jar --create --file=mymodapp\applib\appfuncs.jar -C mymodapp\appmodules\appfuncs .

"%JAVA_HOME%"\bin\jar --create --file=mymodapp\applib\appstart.jar --main-class=appstart.mymodappdemo.MyModAppDemo -C mymodapp\appmodules\appstart .

"%JAVA_HOME%"\bin\jlink --launcher MyModApp=appstart/appstart.mymodappdemo.MyModAppDemo --module-path "%JAVA_HOME%"\jmods;mymodapp\applib --add-modules appstart --output mylinkedmodapp

"%JAVA_HOME%"\bin\java -p mymodapp\applib -m appstart