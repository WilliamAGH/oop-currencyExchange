public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}

    // partner 1 (william): method for 'main' menu method
        // call 'menu' in this
        // ask user to enter the value (same or different method?)
        // read value
        // call appropriate method to the menu to do the conversion
        // switch statement
        // print value

    // both/each:
    // currencies have defined constant for conversion ratio
        // class for MMK to USD
        // class for USD to MMK
        // class for EUR to USD
        // class for USD to EUR
    // partner 1: main method will also print the value
        // it will print the value returned and format its output
        // use two decimal places to format the result
    // partner 2: create 'menu' method


// create method to read value, call the appropriate method for currency conversion
// partner 2: define a constant inside the class for the conversion ratio

// output
// question: do we do that down here or up above in the menu or currency input method?
// answer: do we do that down here or up above in the menu or currency input method?}


/*
TODO:
Assignment:

Each partner should choose one currency to convert to dollar and research what the current exchange rate is. For example, if I were given this task, I might choose Brazilian Real and look for the current exchange rate.
Create a new program called Conversion.java.
Write a method that receives a parameter of type double holding the amount in the chosen currency and returns the value in dollar. In my example, my method would be called Real2Dollar.
Write a method that receives a parameter of type double holding the amount in dollars and returns the amount in the target currency. In my example, my method would be called Dollar2Real.
Your partner should have a different currency and follow the same steps 1-4 above.
Meet with your partner to write the main method and a menu method, and put the four conversion methods together in one program.
Example of a menu of options presented by the menu method for a program that converts between Real to Dollar and Yen to Dollar:
1. BRZ Real -> US Dollar
2. US Dollar -> BRZ Real
3. Yen -> Dollar
4. Dollar -> Yen
Write the main method to:
call the menu method that returns the user's choice
ask the user to enter the value to be converted
read the value
call the appropriate method to do the conversion, depending on the user's choice, to convert the value
I suggest you use a switch statement here
print the value returned on the screen.
Use two decimal places to format the result
Define a constant inside the class for the conversion ratio. Example:

static final double DOLLAR_REAL_RATIO = 5.67;

Compile and test your code to make sure its correct. Use multiple values to test each one of the options.

Suggested breakdown of the work load:

Partner 1: Implements one currency (both ways) and the main method
Partner 2: Implements another currency (both ways) and the menu method
Each partner should document the part that they implemented
Both partners will work on putting the two parts together

Style and Documentation:

Follow naming convention for variables and methods, and recommended indentation.

Methods should be indented 4 spaces from class declaration
Statements inside methods should be indented 4 spaces from method header
Document your program following Javadoc format
Create a header comment between the import lines and the class definition

/**
* Lab 1: write a brief description here
* @author write partner 1 name here
* @author write partner 2 name here
  */

/*
Create a similar comment for each method, including the main method. Example:

/**
* This method receives an amount in dollar and returns the corresponding amount in ...
* @param amount in dollar
* @return amount in ...
  */

/*
What to submit:

The file Conversion.java that you created after you put all conversions together.
A  screenshot  of  the  window showing your tests on IntelliJ output window
I'm expecting to see you testing the conversion of both currencies both ways
A screenshot of the documentation page (in a web browser) that you generated using javadoc. The following video explains how to use javadoc:
*/