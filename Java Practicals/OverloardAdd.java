

class AddOverload{
    void add(int a){
       System.out.println("The add function without return is " + (a+a)); 
    }

    int add(int a, int b){
        int x = a+b;
        return x;
    }

    void add(double a, double b){
        System.out.println("The add function without return is " + (a+b));
    }
}

public class OverloardAdd{
    public static void main(String args[]){
        int result;
        AddOverload ao  = new AddOverload();
        ao.add(10);
        result = ao.add(10, 20);
        System.out.println("The add function with return value " + (result));
        ao.add(10.5, 20.5);

    }
}
