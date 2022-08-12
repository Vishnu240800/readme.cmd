import java.io.File;

import com.training.example.*;
import com.training.BookService;


public class Application {

	public static void main(String[] args) {
		Book java = new Book(101," JAVA head","Ani",19000);
		BookService service = new BookService();
		boolean result = service.writeToFile(new File("Books.txt"),java);
		
		if(result) {
			System.out.println("one record added to file");
		}
		
		service.readFromFile(new File("Books.txt")).forEach(System.out::println);

	}

}