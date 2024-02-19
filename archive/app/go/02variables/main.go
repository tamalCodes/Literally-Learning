package main

import "fmt"

//* Constants
// Remember that this cannot be changed later on
// If the first letter of the constant is uppercase, it can be exported to other packages too

const LoginToken = "HelloThisIsTamalDas"

func main() {
	var username string = "admin"

	fmt.Println(username)
	fmt.Println("The variable is of tyoe: ", fmt.Sprintf("%T", username))

	var isVerified bool = true
	fmt.Println(isVerified)
	fmt.Println("The variable is of type: ", fmt.Sprintf("%T", isVerified))

	//* different integers types

	var smallInt uint8 = 255 
	fmt.Println("We can just have upto 255 in uint8, anything bigger will give an error: ", smallInt)



	var smallFloat float32 = 200000.5294729347298472984792475
	fmt.Println("This float32 will just be rounded off to: ", smallFloat)



	var bigFLoat float64 = 200000.5294729347298472984792475
	fmt.Println("This float64 will just be rounded off to: ", bigFLoat)


	//*default values
	// if you don't assign a value to a variable, it will be assigned a default value
	// for strings, it will be an empty string
	// for integers, it will be 0
	// for booleans, it will be false


	var a int
	fmt.Println(a)
	fmt.Println("The variable is of type: ", fmt.Sprintf("%T", a))


	//* Implicit type declaration
	// you can also declare a variable without specifying the type, the lexer will automatically assign the type based on the value you assign to it
	// but remember, you can't change the type of the variable later on

	var website= "tamalcodes.com"
	fmt.Println(website)
	fmt.Println("The variable is of type: ", fmt.Sprintf("%T", website))

	//* no var style
	// you can also declare a variable without using the var keyword, but you have to assign a value to it
	// this is only possible inside a function

	age := 20
	fmt.Println(age)
	fmt.Println("The variable is of type: ", fmt.Sprintf("%T", age))

	//* printing the constant
	fmt.Println(LoginToken)
	fmt.Println("The variable is of type: ", fmt.Sprintf("%T", LoginToken))
}
