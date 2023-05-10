public class Car {
    /*Instance Variables */
    private String model;
    private String year;
    private String gallon;
    /*Constructor */
    public Car(String model, String year, String gallon) {
        
        this.model = model;
        this.year = year;
        this.gallon = gallon;

        
    }
    //Get Method
    public String getModel() {
        return model;
    }
    public String getYear() {
        return year;
    }
    public String getGallon() {
        return gallon;
    }

    //Convert Method
    public double convertYear() {
        double f = Double.valueOf(year);
        return f;
    }
    public double convertGallon() {
        double f = Double.valueOf(gallon);
        return f;
    }

    public double carbonFootprint() {
        //business operations * operation specific emission factor
        //gallons of gasoline for car * (8.887 * 0.0001 metric tons)
        return 8.8887*0.001;
    }

    public double getCarbonFootprint() {
        return convertGallon() * carbonFootprint();
    }
}
