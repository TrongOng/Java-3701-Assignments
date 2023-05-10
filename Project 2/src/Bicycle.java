public class Bicycle {
    /*Instance Variables */
    private String model;
    private String year;
    private String milesTravel;
    /*Constructor */
    public Bicycle(String model, String year, String milesTravel) {
        
        this.model = model;
        this.year = year;
        this.milesTravel = milesTravel;

        
    }
    //Get Method
    public String getModel() {
        return model;
    }
    public String getYear() {
        return year;
    }
    public String getMilesTravel() {
        return milesTravel;
    }

    //Convert Method
    public double convertYear() {
        double f = Double.valueOf(year);
        return f;
    }
    public double convertMilesTravel() {
        double f = Double.valueOf(milesTravel);
        return f;
    }

    public double carbonFootprint() {
        //33 grams of CO2 per mile traveled
        return 33;
    }

    public double getCarbonFootprint() {
        return convertMilesTravel() * carbonFootprint();
    }
    
}
