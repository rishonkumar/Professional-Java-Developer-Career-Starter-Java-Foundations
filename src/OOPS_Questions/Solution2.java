package OOPS_Questions;
//https://tcsxplorejavacodingquestions.blogspot.com/2022/09/mock-pra-java-solution.html
import java.util.*;
public class Solution2 {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Vehicle[] vl = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();

            vl[i] = new Vehicle(number, name, price);
        }

        String name = sc.nextLine();


        Vehicle ans1 = findVehicleWithMinimumPrice(vl);

        if (ans1 == null) {
            System.out.println("No Vehicle found with mentioned attribute.");
        } else {
            System.out.println("number-" + ans1.getNumber());
            System.out.println("name-" + ans1.getName());
            System.out.println("price-" + ans1.getPrice());
        }

        Vehicle ans2 = searchVehicleByName(vl, name);
        if (ans2 == null) {
            System.out.println("No Vehicle found with mentioned attribute.");
        } else {
            System.out.println("number-" + ans2.getNumber());
            System.out.println("name-" + ans2.getName());
            System.out.println("price-" + ans2.getPrice());
        }


    }// main method ends here.


    public static Vehicle findVehicleWithMinimumPrice(Vehicle[] vl) {

        double max = Double.MAX_VALUE;

        for (int i = 0; i < vl.length; i++) {
            if (vl[i].getPrice() < max) {
                max = vl[i].getPrice();
            }
        }

        for (int i = 0; i < vl.length; i++) {
            if (max == vl[i].getPrice()) {
                return vl[i];
            }
        }
        return null;

    } //findVehicleWithMinimumPrice method ends here

    public static Vehicle searchVehicleByName(Vehicle[] vl, String name) {

        for (int i = 0; i < vl.length; i++) {
            if (vl[i].getName().equalsIgnoreCase(name)) {
                return vl[i];
            }
        }
        return null;

    }
}


class Vehicle {
    private int number;
    private String name;
    private double price;
    // Enter your code here

    Vehicle(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

