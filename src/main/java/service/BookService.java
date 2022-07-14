package service;

import model.Book;
import model.Usser;

import java.util.HashMap;
import java.util.Map;


public class BookService implements iBookService{


    private final UsserService usserService;
    Map<Integer, Book> books = new HashMap<>();

    public BookService(UsserService usserService) {
        this.usserService = usserService;
    }

    public void AddBook(Book book)
    {
        books.put(book.getId(),book);
    }

    public void BorrowBook(Integer id, Usser usser, Book book) {

        usserService.usserSet.stream().filter(usser1 -> usser1.equals(usser)).findFirst().get().books.put(book,id);
        books.get(id).setEnable(false);
    }


    public void ReturnBook(Integer id, Usser usser)
    {
        usserService.usserSet.stream().filter(usser1 -> usser1.equals(usser)).findFirst().get().books.remove(id);
        books.get(id).setEnable(true);
    }




}
