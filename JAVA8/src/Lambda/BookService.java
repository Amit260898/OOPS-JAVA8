package Lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	
	public List<Book> getBooksInSort(){
		List<Book> books=new BookDAO().getBooks();
		
		Collections.sort(books,new Comparator<Book>() {

			

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			} 
			
		});
		Collections.sort(books,(o1,o2)->o1.getPages()-o2.getPages());
		Collections.sort(books, (o1,o2)-> o1.getName().compareTo(o2.getName()));
		Collections.sort(books,(o1,o2)->o1.getId()-o2.getId());
		System.out.println(books);
		Collections.sort(books,new Comparator<Book>() {
			
			@Override
			public int compare(Book o1,Book o2) {
				if(o1.getId()==o2.getId()) {
					return 0;
				}else if (o1.getId()>o2.getId()) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		System.out.println(books);
		
		return books;
		
		
	}
	
	public static void main(String[] args) {
		
		BookService bk=new BookService();
		System.out.println(new BookService().getBooksInSort());
	}

}
