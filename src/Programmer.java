public class Programmer extends Person{


    public void working(){
        System.out.println("Programmer java");
    }

    public Programmer(String name ,int age) {
        super(name,age);
    }

    @Override
    public String toString() {
        return "Programmer{}";
    }
}
