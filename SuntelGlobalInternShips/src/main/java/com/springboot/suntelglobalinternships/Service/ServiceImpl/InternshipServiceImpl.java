package com.springboot.suntelglobalinternships.Service.ServiceImpl;

import com.springboot.suntelglobalinternships.Model.Internship;
import com.springboot.suntelglobalinternships.Service.InternshipService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InternshipServiceImpl implements InternshipService {
    List<Internship> internshipList;
    Internship demoInternship=new Internship("101SDE","Java Developer","1. Developing REST APIs for CRUD operations using Java Spring Boot, Spring Data, and MongoDB\n" +
            "2. Designing and developing high-volume & low-latency applications for mission-critical systems\n" +
            "3. Writing well designed, testable, and efficient code\n" +
            "4. Taking part in software and architectural development activities","29th Jan,2024","Java , SpringBoot , Spring MVC , MySQL , JPA , AWS , Docker","21st Feb,2024","6 months","15k/month","Pune","Remote","2","108","15th Feb,2024","Internship with Job Offer","suntelglobal.net");

    public InternshipServiceImpl() {
        this.internshipList = new ArrayList<>();
        internshipList.add(demoInternship);
    }

    @Override
    public List<Internship> getAllInternships() {
        return internshipList;
    }

    @Override
    public Internship getInternshipsById(String internshipId) {
        if (internshipId != null) {
            for(Internship internship:internshipList){
                if (internship.getInternshipId().equals(internshipId)){
                    return internship;
                }
            }
        }
        return null;
    }

    @Override
    public Internship addNewInternship(Internship internship) {
        internshipList.add(internship);
        return internship;
    }

    @Override
    public Internship editInternship(Internship internship) {
        if (internship != null) {
            for(Internship findInternship:internshipList){
                if(findInternship.getInternshipId().equals(internship.getInternshipId())){
//                    System.out.println(findInternship.getInternshipId());
//                    System.out.println(internship.getInternshipId());

                    int index=internshipList.indexOf(findInternship);
                    System.out.println(index);
                    internshipList.set(index,internship);
                    System.out.println(findInternship);
                    System.out.println("-----------------------------------------After Updating-----------------------------------------");
                    System.out.println(internship);
                    return internship;
                }
            }
        }
        return null;
    }

    @Override
    public Internship deleteInternship(String internshipId) {
        if (internshipId != null) {
            for(Internship internship:internshipList){
                if (internship.getInternshipId().equals(internshipId)){
                    internshipList.remove(internship);
                    return internship;
                }
            }
        }
        return null;
    }
}
