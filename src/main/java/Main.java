import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
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
    }

}
