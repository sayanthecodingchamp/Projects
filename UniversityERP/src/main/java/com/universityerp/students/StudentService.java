package com.universityerp.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired private StudentRepository repo;

    public List<Student> listAll(){
        return (List<Student>) repo.findAll();
    }

    public void save(Student stu) {
        repo.save(stu);
    }
    public Student get(Integer sId) throws StudentNotFoundException {
        Optional<Student> result = repo.findById(sId);
        if(result.isPresent()){
            return result.get();
        }
        throw new StudentNotFoundException("Could not find any Student with the SID");
    }

    public void delete(Integer sId) throws StudentNotFoundException {
        Long count=repo.countBysId(sId);
        if(count==null || count==0){
            throw new StudentNotFoundException("Could not find any Student with the SID");
        }
        repo.deleteById(sId);
    }

}
