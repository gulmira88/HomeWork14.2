public class Builder extends Person{
    public void working(){
        System.out.println("Builder is building home...");
    }
    public Builder(String name,int age){
        super(name,age);
    }

    @Override
    public String toString() {
        return "Builder{}";
    }
}
