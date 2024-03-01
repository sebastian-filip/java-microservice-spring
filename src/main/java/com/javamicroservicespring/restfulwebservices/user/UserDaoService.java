package com.javamicroservicespring.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User(1, "Adam1", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Adam2", LocalDate.now().minusYears(22)));
        users.add(new User(3, "Adam3", LocalDate.now().minusYears(89)));
        users.add(new User(4, "Adam4", LocalDate.now().minusYears(12)));
    }

    public List<User> findAllUsers(){
        return users;
    }
}
