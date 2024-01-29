//package com.springboot.suntelglobalinternships.Controller;
//
//import com.springboot.suntelglobalinternships.Model.Internship;
//import com.springboot.suntelglobalinternships.Service.InternshipService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/SuntelGlobal")
//public class InternshipController {
//
//    @Autowired
//    InternshipService internshipService;
//
//    @GetMapping("/internships")
//    public List<Internship> getAllInternships(){
//        return  this.internshipService.getAllInternships();
//    }
//
//    @GetMapping("/internships/{internshipId}")
//    public Internship getInternshipsById(@PathVariable String internshipId){
//        return this.internshipService.getInternshipsById(internshipId);
//    }
//    @PostMapping("/internships")
//    public Internship addNewInternship(@RequestBody Internship internship){
//        return this.internshipService.addNewInternship(internship);
//    }
//    @PutMapping("/internships")
//    public Internship editInternship(@RequestBody Internship internship){
//        return this.internshipService.editInternship(internship);
//    }
//    @DeleteMapping("/internships/{internshipId}")
//    public Internship deleteInternship(@PathVariable String internshipId){
//        return this.internshipService.deleteInternship(internshipId);
//    }
//}
