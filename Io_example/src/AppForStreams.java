
import java.io.File;
import com.training.example.*;
import com.training.BookService;

public class AppForStreams {

	public static void main(String[] args) {
		//Book book =new Book(8847,"Oracle","Harish",560);
		BookService service=new BookService();
		File file =new File("book.ser");
		
		int ch = 0;
		if (ch ==1)
		{
			Book book =new Book(8847,"Oracle","Harish",560);
			
		
			boolean result = service.writeToStream(file, book);//.writeToStream(null, book);
		
		if(result)
		{
			System.out.println("one record Serialized");
		}else {
			
			Book fromFile = (Book) service.readFromStream(file);
			System.out.println(fromFile.getBookName());
		}
		}
	

	}}
