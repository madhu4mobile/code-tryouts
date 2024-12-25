package Udemy.CodingExcercises.section5;

public class Ex2SpeedConverter {
    // write code here
    public static long toMilesPerHour(double kilometersPerHour) {
        double result = 0;
        if (kilometersPerHour < 0) {
            return -1;
        }
        return (long) (kilometersPerHour / 1.609);
    }

    public static void printConversion(double kmph) {

        if (kmph < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kmph + " km/h = " + toMilesPerHour(kmph) + " mi/h");
        }

        return;
    }

/*    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your value of kmph to convert into mph : ");
        long kmph = reader.nextLong();
        long mph = Ex2SpeedConverter.toMilesPerHour(kmph);
        assertEquals(0,mph);

    }*/


}