//Factory Method Pattern CREATIONAL
abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String email;
    double rate;

    abstract void getRate();

    void calculateShare(int share){
        System.out.println("Share: " + share*rate + " Eur");
    }
}
