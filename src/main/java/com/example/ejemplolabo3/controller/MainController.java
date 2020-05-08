package com.example.ejemplolabo3.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.ejemplolabo3.domain.Student;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MainController {
    
    private List<Student> students = new ArrayList<Student>();


    @GetMapping(path = "/ejemplo1",produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String ejemplo1() {
        return "Bienvenidos\n a programacion n capas";
    }

    @GetMapping("/ejemplo2")
    @ResponseBody
    public List<Student> ejemplo2() {
        return Arrays.asList(
            (new Student("Nombre1", "Apellido1", "10/10/1992", "Info", true)),
            (new Student("Nombre2", "Apellido2", "11/11/1993", "Info", false))

        );
    }

    @GetMapping(value="/inicio")
    public String inicio(Student student) {
        return "index";
    }
    
    
    @PostMapping("/formData")
    public ModelAndView procesar(Student student) {
            students.add(student);
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("index");
            modelAndView.addObject("student", new Student());
            return modelAndView;
    }

    @GetMapping(value="/listado")
    public ModelAndView listado() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("listado");
        modelAndView.addObject("studentList", students);
        return modelAndView;
    }
    

}