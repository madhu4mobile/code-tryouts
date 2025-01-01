package Udemy.CodingExcercises.section7;

public class CarGetterNSetters {

    public static void main(String[] args){

        ClassIntroGetterSetterForCar car = new ClassIntroGetterSetterForCar();

        car.setMake("Hyundai");
        car.setModel("Model S");
        car.setColor("Blue");
        car.setDoors(4);
        car.setConvertible(false);

        System.out.println(" Car of make : "+ car.getMake());
        System.out.println(" Car of model : "+ car.getModel());
        System.out.println(" Car has doors : "+car.getDoors());
        System.out.println(" Car Color is : "+car.getColor());
        System.out.println(" Is car convertible "+ ( car.isConvertible() ?  "Car is convertible.":" Car is not convertible."));
        car.describeCar();

    }

}
