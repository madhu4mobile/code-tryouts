package Udemy.CodingExcercises.section7;

import java.security.PrivateKey;

public class ClassIntroGetterSetterForCar {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible ;

    public void describeCar(){
        System.out.println("Car of Make -"+make
                        + " and model : " + model
                        + " -Doors "+ doors
                        + " of color : "+color
                        + (convertible ? " is convertible." : ".")
                );

    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getDoors(){
        return doors;
    }
    public boolean isConvertible(){
        return convertible;
    }

    public void setMake(String make) {
        if(make == null){ make = "Unknown";}
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake){
            case "subaru", "hyundai", "tesla" -> this.make = make;
            default -> { this.make = "Unsupported ";  }
        }
    }

    public void setModel(String model) {
        if(make == null){model = "Unknown model";}
        assert make != null;
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake){
            case "subaru":
                this.model = "Cross Treck";
                break;
            case "hyundai":
                this.model = "Elantra";
                break;
            case "tesla":
                this.model = "Model X";
                break;
            default:
                this.model = "Unsupported Model";
        }
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
