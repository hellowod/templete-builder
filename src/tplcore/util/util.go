package util

import (
	"fmt"
)

func PrintLog() {
	fmt.Println("templete is a tool for build templete code.")
	fmt.Println("")

	fmt.Println("Usage:")
	fmt.Println("  tpl [arguments]")
	fmt.Println("")

	fmt.Println("The command are:")
	fmt.Println("  -o    output file folder")
	fmt.Println("  -i    input config file folder")
	fmt.Println("  -t    templete file folder, if it is null, it is current folder templete")
	fmt.Println("  -help if you don't how to do, use -help")
}
