package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;


@NoArgsConstructor
@Setter
@Getter
public class Usser {

    private String password;
    private String login;
    public Map<Book, Integer> books;

    public Usser(String password, String login) {
        this.password = password;
        this.login = login;
        books = new HashMap<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usser usser = (Usser) o;
        return Objects.equals(login, usser.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }
}
