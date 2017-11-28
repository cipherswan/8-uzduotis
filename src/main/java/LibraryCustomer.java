import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LibraryCustomer extends Library implements Book {

    @Override
    public void giveLibraryInfo() {
        try{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the library worker name :");
            String workerName = br.readLine();
            System.out.print("\n");

            System.out.print("Enter the library name :");
            String libraryName = br.readLine();

            System.out.print("Enter the name of the book :");
            String bookName = br.readLine();

            setLibraryWorker(workerName);
            setLibraryName(libraryName);
            setBookName(bookName);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getBook() {
        String bookName = getBookName();
        String libraryWorker = getLibraryWorker();
        String libraryName = getLibraryName();

        return ("The book name in "+ libraryName + " given by " + libraryWorker + " is " + bookName);
    }
}
