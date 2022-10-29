public class OuterMain {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass("Bilal", 30);
        OuterClass.InnerClass inner = outer.new InnerClass("Developer");

        inner.printInfo();
    }
}
