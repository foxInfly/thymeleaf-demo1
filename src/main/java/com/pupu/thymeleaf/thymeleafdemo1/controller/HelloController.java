package com.pupu.thymeleaf.thymeleafdemo1.controller;

import com.pupu.thymeleaf.thymeleafdemo1.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("张三", 1));
        students.add(new Student("李四", 2));
        students.add(new Student("王五", 3));
        students.add(new Student("二麻子", 4));
        students.add(new Student("三棒子", 5));

        model.addAttribute("students", students);
        return "hello";
    }

    @RequestMapping("/aa")
    public String aa(Model model) {
        model.addAttribute("name", "thymeleaf-aa");
        return "/aa/aa";
    }
    @RequestMapping("/hello1")
    public String hello1(Model model) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("张三", 1));
        students.add(new Student("李四", 2));
        students.add(new Student("王五", 3));
        students.add(new Student("二麻子", 4));
        students.add(new Student("三棒子", 5));

        model.addAttribute("students", students);
        return "/test/hello1";
    }
}