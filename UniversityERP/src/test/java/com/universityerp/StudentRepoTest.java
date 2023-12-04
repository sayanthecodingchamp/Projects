package com.universityerp;

import com.universityerp.students.Student;
import com.universityerp.students.StudentRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class StudentRepoTest {
    @Autowired private StudentRepository repo;

    @Test
    public void testAddNew(){
        Student stu=new Student("MS","Dhoni","MK Dhoni","DK Devi",1983,"dhoni@gmail.com","7890765437","BBA","UG-NITMAS-BBA20","Ranchi","Vill:Kanyakumari,P.O-KumarSangha,Dist:Jharkhand");
        Student savedStu = repo.save(stu);
        Assertions.assertThat(savedStu).isNotNull();
        Assertions.assertThat(savedStu.getsId()).isGreaterThan(0);
    }
    @Test
    public void testListAll(){
        Iterable<Student> students = repo.findAll();
        Assertions.assertThat(students).hasSizeGreaterThan(0);
        for (Student stu: students
             ) {
            System.out.println(stu);
        }
    }

    @Test
    public void testUpdate(){
        int sid=1;
        Optional<Student> optionalStudent = repo.findById(sid);
        Student stu=optionalStudent.get();
        stu.setCity("Bihar");
        repo.save(stu);
        Student updatedStu=repo.findById(sid).get();
        Assertions.assertThat(updatedStu.getCity().equals("Bihar"));

    }

    @Test
    public void testGet(){
        int sid=1;
        Optional<Student> optionalStudent = repo.findById(sid);
        Assertions.assertThat(optionalStudent.isPresent());
        System.out.println(optionalStudent.get());

    }

    @Test
    public void testDelete(){
        int sid=1;
        repo.deleteById(sid);
        Optional<Student> optionalStudent = repo.findById(sid);
        Assertions.assertThat(optionalStudent).isNotPresent();
    }
}
