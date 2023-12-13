package day8;

public class VehicleWithUsage {
	// Parent class
	    // Attribute
	    private String brand;

	    // Constructor
	    public VehicleWithUsage(String brand) {
	        this.brand = brand;
	    }

	    // Getter method for brand
	    public String getBrand() {
	        return brand;
	    }

	    // Method to describe the vehicle
	    public void describe() {
	        System.out.println("This is a generic vehicle.");
	    }
	}

	// Child class inheriting from Vehicle
	class Car extends VehicleWithUsage {
	    // Additional attribute specific to Car
	    private int year;

	    // Constructor for Car
	    public Car(String brand, int year) {
	        // Call the constructor of the parent class (Vehicle) using super
	        super(brand);
	        this.year = year;
	    }

	    // Getter method for year
	    public int getYear() {
	        return year;
	    }

	    // Method to describe the car (overrides the describe method in the parent class)
	    @Override
	    public void describe() {
	        // Call the describe method of the parent class using super
	        super.describe();
	        System.out.println("This is a car from the year " + year + ".");
	    }
	}

  