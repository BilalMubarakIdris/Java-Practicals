import java.util.ArrayList;

public class ArrayList1{
    public static void main(String[] args) {
        // ArrayList<String> array = new ArrayList<String>();
        // array.add("Bilal");
        // array.add("Muhammad");
        // array.add("Ahmad");

        // // System.out.println(array.get(0));

        // for (String name : array) {
        //     System.out.println(name);
        // }

        Car car1 = new Car(2000, "3Series", "BMW");
        Car car2 = new Car(3000, "4Series", "HONDA");
        Car car3 = new Car(4000, "5Series", "TOYOTA");
        Car car4 = new Car(5000, "6Series", "ACORD");
        
        ArrayList<Car> array = new ArrayList<Car>();
        array.add(car1);
        array.add(car2);
        array.add(car3);
        array.add(car4);
        
        array.remove(car1);

        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i).brand + " " + array.get(i).name +" "+ array.get(i).price);
        }

        for (Car car : array) {
            System.out.println(car.brand + car.name + car.price);
        }
    }

    
}
// adding Object in ArrayList
class Car{
    int price;
    String name;
    String brand;
    
    public Car(int price, String name, String brand){
        this.price = price;
        this.name = name;
        this.brand = brand; 
    }
}