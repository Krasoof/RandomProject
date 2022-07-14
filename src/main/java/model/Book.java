package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
import java.util.function.Predicate;


@Getter
@Setter
public class Book {


    public Book(String title, String author, Integer id, Type type) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.type = type;
        this.isEnable = true;

    }

    private String title;
    private String author;
    private Integer id;
    private Type type;
    private boolean isEnable;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public boolean isEnable(Usser usser)
    {
        Predicate<Usser> predicate = usser1 -> usser1.getLogin() != null;
        return predicate.test(usser);
    }
}
