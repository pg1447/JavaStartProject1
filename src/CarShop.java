public class CarShop {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = car1;
        car1.brand = "Audi";
        car2.model = "A4";
        car1.color = "Czarny";
        car2.wheelsColor = "Srebrny";
        car1.tiresColor = "Czarny";
        car2.doors = 5;
        String carInfo = car1.brand + ", " + car1.model + ", " + car1.color + ", " + car1.wheelsColor + ", "
                + car1.tiresColor + ", " + car1.doors;
        System.out.println(carInfo);

//        Car car2 = new Car();
//        car2.brand = "VW";
//        car2.model = "A4";
//        car2.color = "Czarny";
//        car2.wheelsColor = "Srebrny";
//        car2.tiresColor = "Czarny";
//        car2.doors = 5;
//
//        System.out.println(car2.brand);
//        System.out.println(car2.model);
//        System.out.println(car2.doors);
//
//        car2.brand = "Ferrari";
//        car2.model = "Enzo";
//        System.out.println(car2.brand);
//        System.out.println(car2.model);
//        System.out.println(car2.doors);
    }
}
