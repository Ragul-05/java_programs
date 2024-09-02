import java.util.*;

public class cars { 

    public static void benz(int speed, int mileage, String CarModel) {
        System.out.println("Car Model: " + CarModel);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Mileage: " + mileage + " km/l");
    }

    public static void bmw(int speed, int mileage, String CarModel) {
        System.out.println("Car Model: " + CarModel);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Mileage: " + mileage + " km/l");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car number to select (1 for Benz, 2 for BMW): ");
        int n = sc.nextInt();
        int speed = 100;
        int mileage = 80;
        String CarModel;

        switch (n) {
            case 1:
                CarModel = "Benz 100";
                benz(speed, mileage, CarModel);
                break;
            case 2:
                CarModel = "BMW X5";
                bmw(speed, mileage, CarModel);
                break;
            default:
                System.out.println("Invalid car number!");
                break;
        }
        
        sc.close();
    }
}
