package util

import (
	"fmt"
)

func LogHelp() {
	fmt.Println("templetebuilder is a tool for build templete code," +
		"According to the template to generate Java code, Csharp code," +
		"C++ code, etc.")
	fmt.Println("")

	fmt.Println("Usage:")
	fmt.Println("  tpl [arguments]")
	fmt.Println("")

	fmt.Println("The command are:")
	fmt.Println("  -o    output file folder, default current output folder")
	fmt.Println("  -i    input config file folder, default current config folder")
	fmt.Println("  -t    templete file folder, default current templete folder")
	fmt.Println("  -help if you don't how to do, use -help")
}

func LogDefaultArgs() {
	fmt.Println("")

	fmt.Println("config input path: config")
	fmt.Println("config output path: output")
	fmt.Println("config default templete file : templete/csharp.tpl")

	fmt.Println("====================================")
}
