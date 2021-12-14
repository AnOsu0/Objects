import java.util.Locale;

public class objects {
    public static void main(String[] args) {


        Car car1 = new Car();
        car1.brand = "Audi";
        car1.model = "a6";
        car1.color = "Czarny";
        car1.doors = 5;
        car1.tireColor = "czarny";
        car1.wheelColor = "srebrny";
        String car1Info = car1.brand + ", model: " + car1.model + ", kolor: " + car1.color
                + ", ilość drzwi: " + car1.doors + ", kolor opon: " + car1.tireColor +
                ", kolro felg: " + car1.wheelColor;

        System.out.println(car1Info);

//        Car car2 = new Car();
//        car2.brand = "Wolksvagen";
//        car2.model = "passat";
//        car2.color = "żółty";
//        car2.doors = 3;
//        car2.tireColor = "zielony";
//        car2.wheelColor = "czerwony";
//
//
//
//        System.out.println(car2.brand);
//        System.out.println(car2.model);
//        System.out.println(car2.doors);
//
//        car2.brand = "Ferrari";
//
//        System.out.println(car2.brand);
//        System.out.println(car2.model);
//        System.out.println(car2.doors);
    }
}
