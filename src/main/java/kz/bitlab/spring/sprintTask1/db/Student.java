package kz.bitlab.spring.sprintTask1.db;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;
    private String name;
    private String surname;
    private int exam;
    private String mark;
}
