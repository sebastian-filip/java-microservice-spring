package com.javamicroservicespring.restfulwebservices.user;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    private LocalDate birthDate;

}
