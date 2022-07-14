package service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import model.Usser;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

@AllArgsConstructor

public class UsserService implements iUsserService {

    Set<Usser> usserSet = new HashSet<>();

    public void addUsser(String login, String password)
    {
        usserSet.add(new Usser(password, login));
    };

    public void deleteUsser(Usser usser)
    {
        Predicate<Usser> HaveBooks = usser1 -> usser1.getBooks() == null;

        if (!HaveBooks.test(usser))
            throw new RuntimeException("Masz cos na sumieniu");

        else
            usserSet.remove(usser);
    }

}
