// Here we are trying to understand how user based input is  gonna take place i here
// we are gonna be using https://pkg.go.dev/bufio which basically implements a buffered I/O

package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	welcome := "Welcome to Golang 🐹"
	fmt.Println(welcome)

	reader := bufio.NewReader(os.Stdin)
	fmt.Print("Enter your name: ")

	// comma ok syantax || error okay syntax
	// we dont't have a try catch error in here because the Go expects us to treat the errors as we are treating some values
	// like maybe false and stuffs like that

	// so we can do input, err such that the err is the error that we are getting from the ReadString method
	// but if we dont care about the error we canjust put an undescore so that we can just ignore the error

	input, _ := reader.ReadString('\n')
	fmt.Println("Your name is", input)
}