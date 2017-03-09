@echo "start param config"

tpl.exe -l csharp -o output/csharp -i config -t templete/csharp.tpl
tpl.exe -l java -o output/java/com/config -i config -t templete/java.tpl
tpl.exe -l cpp -o output/cpp -i config -t templete/cpp.tpl
tpl.exe -l lua -o output/lua -i config -t templete/lua.tpl

@pause