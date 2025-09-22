// Anna Briggs Pirila 
// Test 2

/**
 * Garrett's popcorn vending machine

Garrett's popcorn is looking to launch a vending machine that sells their world renowned popcorn.  The vending machine will contain a total of 9 products. 
The products are listed below in the chart along with purchase price.  To select an item, the end-user will enter the product row along with the column letter.
The program should enforce that only product row numbers and column letters can be entered. The end-user will be able to continously select up to  as they would 
like until they enter a sentinel value.
   

At the conslusion of selecting all items, the program will display the total number of items purchased and the total cost.

**Hints**
- Make use of two dimensional arrays.
- Consider parallel arrays



Your program should operate similarly to the program shown in the .gif below
The .gif below show three iterations of running the program

![Alt text](https://instructorc.github.io/site/slides/java/images/ds/program_4_sample_output.gif "Program 4 Execution Example")



| Product Row | Column P               | Column N                       | Column R           |
|-------------|------------------------|-----------------------------------------------------|
| 0           | Garrett Mix ($14.99)   |  Pecan Carmel Crisp ($10.99)   | Plain ($6.99)      |
| 1           | Caramel Crisp ($16.99) |  Cashew Carmel Crisp ($9.99)   | Buttery ($8.99     |
| 2           | Cheese Corn ($12.99)   |  Almond Carmel Crisp ($11.99)  | Sweet Corn ($7.99)  


 */

import java.util.Scanner; //Import the Scanner Class
public class VendingMachine {
    public static void main(String[] args) throws Exception {
     
        // Declare Variables and CONSTANTS

        final int EXIT = -1;
        final int ROWS = 3;
        final int COLUMNS = 3;

        final String POPCORN_1 = "Garrett Mix";
        final String POPCORN_2 = "Caramel Crisp";
        final String POPCORN_3 = "Cheese Corn";
        final String POPCORN_4 = "Pecan Carmel Crisp";
        final String POPCORN_5 = "Cashew Carmel Crisp";
        final String POPCORN_6 = "Almond Carmel Crisp";
        final String POPCORN_7 = "Plain";
        final String POPCORN_8 = "Buttery";
        final String POPCORN_9 = "Sweet Corn";

        final double GARRETT_MIX = 14.99;
        final double CARAMEL_CRISP = 16.99;
        final double CHEESE_CORN = 12.99;
        final double PECAN_CRISP = 10.99;
        final double CASHEW_CRISP = 9.99;
        final double ALMOND_CRISP = 11.99;
        final double PLAIN_CORN = 6.99;
        final double BUTTER_CORN = 8.99;
        final double SWEET_CORN = 7.99;
        


    

    }//END OF MAIN

}
