public class CarApplication {
    public static void main(String [] args) {
        Car one = new Car("Acura-MDX", 2015, 40000, 0.07);
        Car two = new Car("Tesla-Model X", 2023, 138990, 0.05);
        
        System.out.printf("The car model is %s and the year is %d. The cost of the car is %.2f with a discount of %.2f percent, which came out to the total cost of %.2f \n", one.getModel(), one.getYear(), one.getPrice(), one.getDiscount(), one.getPurchaseAmount());
        System.out.printf("The car model is %s and the year is %d. The cost of the car is %.2f with a discount of %.2f percent, which came out to the total cost of %.2f", two.getModel(), two.getYear(), two.getPrice(), two.getDiscount(), two.getPurchaseAmount());

    }
    
}
