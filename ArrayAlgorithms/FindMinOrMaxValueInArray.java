package ArrayAlgorithms;

public class FindMinOrMaxValueInArray {
    public static void main(String[] args){
        int[] grades = {72, 84, 63, 55, 98};
        int min = grades[0];
        for(int i: grades){
           
            if(i<min){
                min = i;
            }
        }
        System.out.println("The lowest value in array is " + min);
    }
}
