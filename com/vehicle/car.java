package com.vehicle;

public class car extends vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    public car (String name, int wheels, int doors, int gears, boolean isManual, String type){
        super(name);
        this.wheels=wheels;
        this.doors=doors;
        this.gears=gears;
        this.type=type;
        this.isManual=isManual;
        currentGear=1;
    }
    public void changeGear(int newGear){
        this.currentGear=newGear;
        System.out.println("The gear has changed to "+this.currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed, newDirection);
        System.out.println("Speed and Direction have changed to "+newSpeed+" and"+ newDirection);
    }
}
