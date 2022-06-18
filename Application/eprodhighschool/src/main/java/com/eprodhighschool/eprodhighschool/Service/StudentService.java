package com.eprodhighschool.eprodhighschool.Service;


import com.eprodhighschool.eprodhighschool.Model.Student;
import com.eprodhighschool.eprodhighschool.Repository.ClassRepository;
import com.eprodhighschool.eprodhighschool.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ClassRepository classRepository;


    public ResponseEntity addStudentToClass(Student student){

        if(classRepository.findById(Long.valueOf(student.classId)).isPresent()){
            studentRepository.save(student);

            return ResponseEntity.ok("Student added successfully");

        }
       return ResponseEntity.status(400).body("Class stream doesnt exist");


    }

    public Student editStudent(Student student){
        Student student1 = studentRepository.findById(student.getId()).get();
        student1 = student;
        studentRepository.save(student1);


        return student1;

    }

    public List<Student>viewAllStudent(){

      return  studentRepository.findAll();
    }

    public ResponseEntity findstudentbyname(String name){
        if(studentRepository.findByName(name).isPresent()){

            return ResponseEntity.ok(studentRepository.findByName(name).get());
        }
        return ResponseEntity.status(404).body("There is no student with the name "+name);
    }

    public Student findSingleStudent(int id){

        return studentRepository.findById(Long.valueOf(id)).get();

    }


    public void delete(Student student) {

    }
}
