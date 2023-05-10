/*
 (Total Sales) 
Use a two-dimensional array to solve the following problem: 
A company has four salespeople (1 to 4) who sell five different products (1 to 5). 
Once a day, each salesperson passes in a slip for each type of product sold. 
Each slip contains the following:

The salesperson number
The product number
The total dollar value of that product sold that day

Thus, each salesperson passes in between 0 and 5 sales slips per day. 
Assume that the information from all the slips for last month is available. 
Write an application that will read all this information for last month’s 
sales and summarize the total sales by salesperson and by product. All totals 
should be stored in the two-dimensional array sales. After processing all the 
information for last month, display the results in tabular format, with each column 
representing a salesperson and each row representing a particular product. 
Cross-total each row to get the total sales of each product for last month. 
Cross-total each column to get the total sales by salesperson for last month. 
Your output should include these cross-totals to the right of the totaled rows 
and to the bottom of the totaled columns.*/

import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // Sales array to hold sales by sales person and products

        double [][] sales = new double [5][4];
        System.out.println("Enter salesperson number (-1 to end): ");
        int person = input.nextInt();

        while (person != -1) {
            System.out.print("Enter product number: ");
            int product = input.nextInt();
            System.out.println("Enter the sales amount: ");
            double amount = input.nextDouble();

            // error check the input

            if (person >= 1 && person < 5 && product >= 1 && product < 6 && amount >= 0) {
                sales[product-1][person-1] += amount;
            }
            else {
                System.out.println("Invalid Input");
            }
            System.out.println("Enter salesperson number (-1 to end): ");
            person = input.nextInt();
        }

        // total for each salesperson
        double[] salesPersonTotal = new double[4];

        // display table
        for (int column = 0; column < 4; column++) {
            salesPersonTotal[column] = 0;
        }
        System.out.printf("%8s%14s%14s%14s%14s\n", "Product", "Salesperson 1",  "Salesperson 2",  "Salesperson 3",  "Salesperson 4", "Total");

        // for each column of each row print the value for a person
        // sales of a product
        for (int row = 0; row < 5; row++) {
            double productTotal = 0.0;
            System.out.printf("%8d", (row+1));
            for (int column = 0; column < 4; column++) {
                System.out.printf("%14.2f", sales[row][column]);
                productTotal += sales[row][column];
                salesPersonTotal[column] += sales[row][column];
            }
            System.out.printf("%10.2f\n", productTotal);
        }
        System.out.printf("%8s", "Total");
        for (int column = 0; column < 4; column++) {
            System.out.printf("%14.2f", salesPersonTotal[column]);
        }

        System.out.println();
        
    }
}
