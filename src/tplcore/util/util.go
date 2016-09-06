package util

import (
	"fmt"
)

func LogHelp() {
	fmt.Println("模板文件生成工具,是根据版本结构生成模板代码的工具，目前支持生成" +
		"任何语言的代码，只需要编写对应语言的模板文件即可，模板文件的书写方式可以查看" +
		"golang官方介绍!")
	fmt.Println("")

	fmt.Println("使用方式:")
	fmt.Println("	tpl 参数列表")
	fmt.Println("")

	fmt.Println("使用案例:")
	fmt.Println("	tpl.exe -l csharp -o output/csharp -i config -t templete/csharp.tpl")
	fmt.Println("")

	fmt.Println("命令介绍:")
	fmt.Println("  -l    需要生成语言!")
	fmt.Println("  -o    生成输出文件的目录!")
	fmt.Println("  -i    输入文件的目录,这里指的是配表文件!")
	fmt.Println("  -t    模板文件路径!")
	fmt.Println("  -help 帮助命令")

}

func LogDefaultArgs() {
	fmt.Println("")

	fmt.Println("配置文件输入路径: config")
	fmt.Println("生成模板代码输出路径: output")
	fmt.Println("默认的模板文件 : templete/csharp.tpl")

	fmt.Println("====================================")
}
