package com.vehicle;

public class custom extends car {
    public custom(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, "customize");
    }

    public void acceleration(int rate){
        int newSpeed=getCurrentSpeed()+rate;
        if(newSpeed==0){
            stop();
            changeGear(1);
        }
        else if(newSpeed>0 && newSpeed<=10){
            changeGear(2);
        }
        else if(newSpeed>10 && newSpeed<=30){
            changeGear(3);
        }
        else if(newSpeed>30 && newSpeed<=60){
            changeGear(4);
        }
        else if(newSpeed>60 && newSpeed<=120){
            changeGear(5);
        }
        else{
            changeGear(6);
        }
         
    }

}
