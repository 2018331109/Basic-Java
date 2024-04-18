package com.vehicle;

public class vehicle {
    private String name;
    private int currentSpeed;
    private int currentDirection;

    public vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Steeer method is called: Steering at " + currentDirection + " degrees.");

    }

    public void move(int speed, int direction) {
        currentDirection = direction;
        currentSpeed = speed;
        System.out.println("Move method is called: Moving speed at: " + currentSpeed + " Moving direction at: "
                + currentDirection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int direction) {
        this.currentDirection = direction;
    }

    public void stop() {
        this.currentSpeed = 0;
    }

}

