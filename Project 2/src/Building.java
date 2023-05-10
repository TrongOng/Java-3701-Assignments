//https://calculator.carbonfootprint.com/calculator.aspx?tab=2
public class Building {
    /*Instance Variables */
    private String year;
    private String electricity;
    private String naturalGas;
    private String heatingOil;
    private String coal;
    private String LPG;
    private String propane;
    private String woodenPellets;
    /*Constructor */
    public Building(String year, String electricity, String naturalGas, String heatingOil, String coal, String LPG, String propane, String woodenPellets) {
        
        this.year = year;
        this.electricity = electricity;
        this.naturalGas = naturalGas;
        this.heatingOil = heatingOil;
        this.coal = coal;
        this.LPG = LPG;
        this.propane = propane;
        this.woodenPellets = woodenPellets;
        
    }
    //Get Method
    public String getYear() {
        return year;
    }
    public String getElectricity() {
        return electricity;
    }
    public String getNaturalGas() {
        return naturalGas;
    }
    public String getHeatingOil() {
        return heatingOil;
    }
    public String getCoal() {
        return coal;
    }
    public String getLPG() {
        return LPG;
    }
    public String getPropane() {
        return propane;
    }
    public String getWoodenPellets() {
        return woodenPellets;
    }

    //Convert Method
    public double convertYear() {
        double f = Double.valueOf(year);
        return f;
    }
    public double convertElectricity() {
        double f = Double.valueOf(electricity);
        return f;
    }
    public double convertNaturalGas() {
        double f = Double.valueOf(naturalGas);
        return f;
    }
    public double convertHeatingOil() {
        double f = Double.valueOf(heatingOil);
        return f;
    }
    public double convertCoal() {
        double f = Double.valueOf(coal);
        return f;
    }
    public double convertLPG() {
        double f = Double.valueOf(LPG);
        return f;
    }
    public double convertPropane() {
        double f = Double.valueOf(propane);
        return f;
    }
    public double convertWoodenPellets() {
        double f = Double.valueOf(woodenPellets);
        return f;
    }
    /*
    public double carbonFootprint() {

        return 33;
    }
    */
    public Double getCarbonFootprint() {
        //0.193 kg of CO2e per kWh of electricity
        //0.183 kg per kWh of gas.
        //24 pounds of Co2e per gallon of Heating Oil
        //2.07 pounds of C02 per pound coal
        //12.52 of Co2 per 1 gallon of LPG
        //12.61 pounds of Co2 per gallon of propane
        //1.5 tons of C02 per 1 ton of wooden pellets
        double totalCarbonFootPrint;
        totalCarbonFootPrint = (convertElectricity()*0.193) + (convertNaturalGas()*0.183) + (convertHeatingOil()*24) + (convertCoal()*2.07) + (convertLPG()*12.52) + (convertPropane()*12.61) + (convertWoodenPellets()*1.5);
        return totalCarbonFootPrint;
    }
    
}
