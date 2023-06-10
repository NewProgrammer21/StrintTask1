package kz.bitlab.spring.sprintTask1.controller;

import kz.bitlab.spring.sprintTask1.db.DBManager;
import kz.bitlab.spring.sprintTask1.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String getStudents(Model model){
        ArrayList<Student> students= DBManager.getStudents();
        model.addAttribute("students", students);
        return "index";
    }

    @PostMapping(value="/add-student")
    public String addMusic(Student student){
        DBManager.addStudent(student);
        return "redirect:/";
    }

    @GetMapping(value = "/add-student")
    public String addMusicPage(Model model){
        return "addstudent";
    }
}
