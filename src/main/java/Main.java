import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int choice;

    public static void main(String[] args) throws IOException {

        /*

        //Factory Method Pattern CREATIONAL
        new GetPersonShare();

        System.out.println("Type of person? [teacher, janitor, coach] ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String personType = br.readLine();

        System.out.print("Enter the sum of your salary: ");
        int salary = Integer.parseInt(br.readLine());

        Person person = GetPersonShare.getPerson(personType);

        System.out.println("Share of "+ personType);
        System.out.println("Salary: " + salary + " Eur");
        person.getRate();
        person.calculateShare(salary);


        //Abstract Factory Pattern CREATIONAL

        BufferedReader brSchool = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the type of school you want to rate: ");
        String schoolName = brSchool.readLine();

        System.out.print("\n");

        System.out.print("Enter the type of rating [Teaching, Cafeteria]: ");
        String ratingType = brSchool.readLine();

        AbstractFactory schoolFactory = FactoryCreator.getFactory("School");
        School school = schoolFactory.getSchool(schoolName);

        System.out.print("\n");
        System.out.print("Enter the rating for "+ school.getSchoolName() + ": ");

        double rating = Double.parseDouble(brSchool.readLine());


        //Prototype Design Pattern CREATIONAL

        BufferedReader brEmp =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee Id: ");
        int id=Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Enter Employee Name: ");
        String firstName=br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee email Address: ");
        String emailAddress=br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Salary: ");
        double eSalary = Double.parseDouble(br.readLine());
        System.out.print("\n");

        Employee employee = new Employee(id, firstName, eSalary, emailAddress);

        employee.getEmployeeInfo();
        System.out.println("\n");

        Employee employee2 = (Employee) employee.getClone();
        employee2.getEmployeeInfo();


        // Adapter Design Pattern STRUCTURAL

        Book targetInterface = new LibraryCustomer();
        targetInterface.giveLibraryInfo();
        System.out.print(targetInterface.getBook());


        // Decorator Design Pattern STRUCTURAL

        do{
            System.out.print("===================== \n");
            System.out.print("            1. First course.   \n");
            System.out.print("            2. Desserts.\n");
            System.out.print("            3. Soup.         \n");
            System.out.print("            4. Exit                        \n");
            System.out.print("Enter your choice: ");
            BufferedReader brFood = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(brFood.readLine());
            switch (choice) {
                case 1:{
                    FirstCourse vf=new FirstCourse();
                    System.out.println(vf.prepareFood());
                    System.out.println( vf.foodPrice());
                }
                break;

                case 2:{
                    CafeteriaFood f1 = new Dessert((CafeteriaFood) new FirstCourse());
                    System.out.println(f1.prepareFood());
                    System.out.println( f1.foodPrice());
                }
                break;
                case 3:{
                    CafeteriaFood f2=new Soup((CafeteriaFood) new FirstCourse());
                    System.out.println(f2.prepareFood());
                    System.out.println( f2.foodPrice());
                }
                break;

                default:{
                    System.out.println("wrong input");
                }
                return;
            }
        }while(choice!=4);



        // Chain of Responsibility Pattern BEHAVIORAL

        ChainOfResponsibilityClient client = new ChainOfResponsibilityClient();

        Logger chainLogger = client.doChaining();

        chainLogger.logMessage(Logger.OUTPUTINFO, "message 1");
        chainLogger.logMessage(Logger.ERRORINFO, "message 2");
        chainLogger.logMessage(Logger.DEBUGINFO, "message 3");

        */

        // Command Design Pattern BEHAVIORAL

        File file = new File();

        MenuOptions menu = new MenuOptions();
        ActionListenerCommand clickOpen = new ActionOpen(file);
        ActionListenerCommand clickSave = new ActionSave(file);

        menu.setCommand(clickOpen);
        menu.pressButton();

        menu.setCommand(clickSave);
        menu.pressButton();







    }

}
