@echo "start param config"

tpl.exe -l csharp -o output/csharp -i config -t templete/csharp.tpl
tpl.exe -l java -o output/java -i config -t templete/java.tpl
tpl.exe -l cpp -o output/cpp -i config -t templete/cpp.tpl

@pause