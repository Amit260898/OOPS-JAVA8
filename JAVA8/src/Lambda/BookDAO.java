package Lambda;



import java.util.ArrayList;
import java.util.List;



public class BookDAO {

	public List<Book> getBooks(){
		
		List<Book> books=new ArrayList<>();
		books.add(new Book(101,"core java",400));
		books.add(new Book(102,"bibernate",500));
		books.add(new Book(103,"spring",600));
		books.add(new Book(104,"webservice",700));
		return books;
		
	}
}
