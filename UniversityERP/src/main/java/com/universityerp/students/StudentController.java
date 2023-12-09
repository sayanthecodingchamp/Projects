package com.universityerp.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class StudentController {
    @Autowired private StudentService service;

    @GetMapping("/students")
    public String showStudentList(Model model){
        System.out.println("it's the StudentController");
        List<Student> listStudents = service.listAll();
        model.addAttribute("listStudents",listStudents);
        return "students";
    }

    @GetMapping("/students/new")
    public String showNewForm(Model model){
        model.addAttribute("student",new Student());
        model.addAttribute("pageTitle","Add new Student");
        return "student_form";
    }

    @PostMapping("/students/save")
    public String saveStudent(Student stu, RedirectAttributes ra){
        service.save(stu);
        ra.addFlashAttribute("message","The Student Info has been saved successfully!");
        return "redirect:/students";
    }
    @GetMapping("/students/edit/{sId}")
    public String showEditForm(@PathVariable("sId") Integer sId,Model model,RedirectAttributes ra){
        try {
            Student student = service.get(sId);
            model.addAttribute("student",student);
            model.addAttribute("pageTitle","Edit Student (SID:" +sId+")");
            return "student_form";
        } catch (StudentNotFoundException e) {
            ra.addFlashAttribute("message",e.getMessage());
            return "redirect:/students";
        }
    }

    @GetMapping("/students/delete/{sId}")
    public String deleteStudent(@PathVariable("sId") Integer sId,RedirectAttributes ra){
        try {
            service.delete(sId);
            ra.addFlashAttribute("message","The Student Id :"+sId+" has been deleted.");
        } catch (StudentNotFoundException e) {
            ra.addFlashAttribute("message",e.getMessage());
        }
        return "redirect:/students";
    }
}
