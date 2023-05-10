/*
 (Payroll System Modification) 
 Modify the payroll system from the code above to include an additional 
 Employee subclass PieceWorker that represents an employee whose pay is based 
 on the number of pieces of merchandise produced. Class PieceWorker should contain 
 private instance variables wage (to store the employee’s wage per piece) and pieces 
 (to store the number of pieces produced). Provide a concrete implementation of method 
 earnings in class PieceWorker that calculates the employee’s earnings by multiplying the 
 number of pieces produced by the wage per piece. Create an array of Employee variables 
 to store references to objects of each concrete class in the new Employee hierarchy. 
 For each Employee, display its String representation and earnings.
 */
public class PayrollSystemTest  {
    public static void main(String[] args)  {
       // create five-element Employee array
       Employee[] employees = new Employee[5]; 
 
       // initialize array with Employees
       employees[0] = new SalariedEmployee(
          "John", "Smith", "111-11-1111", 800.00);
       employees[1] = new HourlyEmployee(
          "Karen", "Price", "222-22-2222", 16.75, 40);
       employees[2] = new CommissionEmployee(
          "Sue", "Jones", "333-33-3333", 10000, .06); 
       employees[3] = new BasePlusCommissionEmployee(
          "Bob", "Lewis", "444-44-4444", 5000, .04, 300);
       //employees[4] = new PieceWorker("Rick", "Sanchez", "555-55-5555", 2.25, 400);
        
       
 
       System.out.println("Employees processed polymorphically:\n");
       
       // generically process each element in array employees
       for (int i = 0; i < 5 ; i++) {
          System.out.println(employees[i]); // invokes toString
          System.out.printf(
             "earned $%,.2f\n\n", employees[i].earnings());
       }
    }
 }