package util

import (
	"fmt"
)

func PrintLog() {
	fmt.Println("templetebuilder is a tool for build templete code.")
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
