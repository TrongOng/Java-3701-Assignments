/*
(Interface: Polymorphism) 
Using interfaces, as you learned in this chapter, you can specify similar behaviors for possibly disparate classes. 
Governments and companies worldwide are becoming increasingly concerned with carbon footprints 
(annual releases of carbon dioxide into the atmosphere) from buildings burning various types of fuels for heat, 
vehicles burning fuels for power, and the like. Many scientists blame these greenhouse gases for the phenomenon 
called global warming. 
1. Create three small classes unrelated by inheritance—classes Building, Car and Bicycle. 
2. Give each class some unique appropriate attributes and behaviors that it does not have in common with other classes. 
3. Write an interface CarbonFootprint with a getCarbonFootprint method. Have each of your classes implement that interface, 
so that its getCarbonFootprint method calculates an appropriate carbon footprint for that class 
(check out a few websites that explain how to calculate carbon footprints). 
4. Write an application that creates objects of each of the three classes, places references to those objects in ArrayList<CarbonFootprint>, 
then iterates through the Array-List, polymorphically invoking each object’s getCarbonFootprint method.
5. For each object, print some identifying information and the object’s carbon footprint.

 */
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Car car = new Car("MDX-Acura", "2016", "16");
        Bicycle bicycle = new Bicycle("BMX", "2023", "15");
        Building building = new Building("2005", "10", "10", "10", "10", "10", "10", "10");

        ArrayList<String> cars = new ArrayList<String>();
        cars.add(car.getModel());
        cars.add(car.getYear());
        cars.add(car.getGallon());

        ArrayList<String> bicycles = new ArrayList<String>();
        bicycles.add(bicycle.getModel());
        bicycles.add(bicycle.getYear());
        bicycles.add(bicycle.getMilesTravel());

        ArrayList<String> buildings = new ArrayList<String>();
        buildings.add(building.getYear());
        buildings.add(building.getElectricity());
        buildings.add(building.getNaturalGas());
        buildings.add(building.getHeatingOil());
        buildings.add(building.getCoal());
        buildings.add(building.getLPG());
        buildings.add(building.getPropane());
        buildings.add(building.getWoodenPellets());

        ArrayList<Double> carbonFootPrint = new ArrayList<Double>();
        carbonFootPrint.add(car.getCarbonFootprint());
        carbonFootPrint.add(bicycle.getCarbonFootprint());
        carbonFootPrint.add(building.getCarbonFootprint());

        System.out.print("Car's Model, Year, and Tank Gallon: " + cars.get(0) + ", " + cars.get(1) + " and " + cars.get(2) + "\n");
        System.out.print("Bicycle's Model, Year, and Miles Travel: " + bicycles.get(0) + ", " + bicycles.get(1) + " and " + bicycles.get(2) + "\n");
        System.out.print("Building's Year, Electricity, Natural Gas, Heating Oil, Coal, LPG, Propane, and Wooden Pellets: " + buildings.get(0) + ", " + buildings.get(1) + ", " + buildings.get(2) + ", " + buildings.get(3) + ", " + buildings.get(4) + ", " + buildings.get(5) + ", " + buildings.get(6) + " and " + buildings.get(7) + "\n");




        System.out.print("The Car's Carbon Foot Print: " + carbonFootPrint.get(0) + "\n" + "The Bicycle's Carbon Foot Print: " + carbonFootPrint.get(1) + "\n" + "The Building's Carbon Foot Print: " + carbonFootPrint.get(2) + "\n");


    }
}
