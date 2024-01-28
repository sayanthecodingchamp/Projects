package com.springboot.suntelglobalinternships.Service;

import com.springboot.suntelglobalinternships.Model.Internship;

import java.util.List;

public interface InternshipService {
    public List<Internship> getAllInternships();
    public Internship getInternshipsById(String internshipId);
    public Internship addNewInternship(Internship internship);
    public Internship editInternship(Internship internship);
    public Internship deleteInternship(String internshipId);
}
