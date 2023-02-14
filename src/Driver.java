public class Driver extends Person{


  public void working(){
      System.out.println("Driver taxi");
  }
  public Driver (String name,int age){
        super( name,age);
  }

    @Override
    public String toString() {
        return "Driver{}";
    }
}

