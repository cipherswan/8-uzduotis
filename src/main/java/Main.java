import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
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
    }

}
