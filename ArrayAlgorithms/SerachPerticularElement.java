package ArrayAlgorithms;

public class SerachPerticularElement {
    public static void main(String[] args){
        String[] cars = {"Corolla", "Camry", "Prius", "RAV4", "Highlander"};
        String camry = "A Camry Is not available. ";

        for(String car : cars){
            if(car.equals("Camry")){
                camry = "A Camry Is available";
            }
        }
        System.out.println(camry);  //print whether Camry exists or not

    }
}
