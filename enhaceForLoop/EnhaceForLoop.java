package enhaceForLoop;
public class EnhaceForLoop{
    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int even[] = new int[5];
        int odd[] = new int[5];
        int i=0;
        int j=0;

        for(int number : numbers){
            if(number%2 ==0){
                even[i] = number;
                i++;
            }else{
                odd[j] = number;
                j++;
            }
        }

        for(int x:even){
            System.out.println("Even numbers: " + x);
        }

        for(int y:odd){
            System.out.println("Odd numbers: " + y);
        }
    }
}