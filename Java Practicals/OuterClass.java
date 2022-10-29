public class OuterClass {
    
    private String name;
    private int age;

    public OuterClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    class InnerClass{
        private String job;

        public InnerClass(String job) {
            this.job = job;
        }

        public void printInfo(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Job: " + job);
        }
    }

    
}
