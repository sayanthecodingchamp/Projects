package com.universityerp.students;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
//Here Student is the class and Integer is the type of the primary key.
}
