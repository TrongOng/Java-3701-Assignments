/******************************************************************************

(Car Class) Create a class called Car that includes three instance variables—a model 
(type String), a year (type String), and a price (double). Provide a constructor that 
initializes the three instance variables. Provide a set and a get method for each 
instance variable. If the price is not positive, do not set its value. Write a test 
application named CarApplication that demonstrates class Car’s capabilities. Create 
two Car objects and display each object’s price. Then apply a 5% discount on the price 
of the first car and a 7% discount on the price of the second. Display each Car’s price 
again.

*******************************************************************************/

public class Car {
    /*Instance Variables */
    private String model;
    private int year;
    private double price;
    private double discount;
    /*Constructor */
    public Car(String model, int year, double price, double discount) {
        
        this.model = model;
        this.year = year;
        this.price = price;
        this.discount = discount;

        
    }
    /*Set Method */
    public void setModel(String model) {
        
        this.model = model;
        
    }
    public void setYear(int year) {
        
        this.year = year;
    }
    public void setPrice(double price) {
        
        //if negative, do not set value
        if (price < 0) {
            this.price = 0;
        }
        else {
            this.price = price;
        }
    }
    public void setDiscount(double discount) {

        this.discount = discount;
    }
    /*Get Method */
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public double getDiscount() {
        return discount;
    }

    public Double getPurchaseAmount() {
        
        return (price)-(price*discount);
        
    }


}
