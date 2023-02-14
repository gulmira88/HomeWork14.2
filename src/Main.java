public class Main {
    public static void main(String[] args) {

        Programmer java = new Programmer("Davran",17);
        System.out.println(java);
        java.working();
        Driver taxi = new Driver("Asan",35);
        System.out.println(taxi);
        taxi.working();
        Builder home = new Builder("Uson",25);
        System.out.println(home);
        home.working();
    }
}