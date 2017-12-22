/**
 * Created by Arnas on 2017.04.07.
 */
public class Main {

    public static void main(String[] args){
        double result;
        result = calcFeetAndInchesToCentimeter(5);
        System.out.println("Result: " + result + " cm");
    }

    public static double calcFeetAndInchesToCentimeter(double feet, double inches){
        if(feet < 0 || inches < 0 || inches >= 12){
            return -1;
        }
        return inchesToCm(feet * 12 + inches);
    }

    public static double calcFeetAndInchesToCentimeter(double inches){
        if(inches < 0){
            return -1;
        }
        return inchesToCm(inches);
    }

    private static double inchesToCm(double inches){
        return inches * 2.54;
    }
}
