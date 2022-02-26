import java.util.Scanner;

class Car {
    public float speed;
    public int regularPrice;
    public String color;

    public int getRegularPrice() {
        return regularPrice;
    }
}

class Truck extends Car {
    public float weight;
    public float salePrice;

    public float getSalePrice() {
        if(weight > 2300) salePrice = regularPrice - (regularPrice / 10);
        else salePrice = regularPrice - (regularPrice / 5);
        return salePrice;
    }
}

public class Question_02 {
    public static void main(String[] args) {
        System.out.print("Enter the Regular Price of Truck(in Rupees): ");
        Truck Truck1 = new Truck();
        Scanner sc = new Scanner(System.in);
        Truck1.regularPrice = sc.nextInt();
        System.out.print("Enter the Weight of Truck(in Kgs): ");
        Truck1.weight = sc.nextFloat();
        System.out.println("Sale Price of Truck is " + Truck1.getSalePrice());
    }
}
