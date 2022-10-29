package CountObject;

public class CountObject {
    public static void main(String[] args) {
        Count obj = new Count();
        Count obj1 = new Count();
        Count obj2 = new Count();
        Count obj3 = new Count();
        obj.count();
        obj1.count();
        obj2.count();
        obj3.count();
    }
}

class Count {
    static int i;

    public Count() {
        i++;
    }

    public void count() {
        System.out.println(i);
    }
}