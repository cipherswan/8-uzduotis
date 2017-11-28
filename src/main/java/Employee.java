class Employee implements Prototype {

    private int id;
    private String firstName;
    private double salary;
    private String emailAddress;

    public Employee() {
        System.out.println("employee constructor");
    }

    public Employee(int id, String firstName, double salary, String emailAddress) {
        this.id = id;
        this.firstName = firstName;
        this.salary = salary;
        this.emailAddress = emailAddress;
    }

    public void getEmployeeInfo(){
        System.out.println(id+"\t"+firstName+"\t"+salary+"\t"+emailAddress);
    }

    @Override
    public Prototype getClone() {
        return new Employee(id, firstName, salary, emailAddress);
    }
}
