package com.eprodhighschool.eprodhighschool.Controller;

import com.eprodhighschool.eprodhighschool.Model.Student;
import com.eprodhighschool.eprodhighschool.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {



        @Autowired
        private StudentService studentService;

        @PostMapping("/create")
        public ResponseEntity createStudent(@RequestBody Student student) {
            ResponseEntity createResponse = studentService.addStudentToClass(student);
            return createResponse;
        }

        @PutMapping("/update")
        public Student updateStudent(@RequestBody Student student) {
            Student updateResponse = studentService.editStudent(student);
            return updateResponse;
        }

        @GetMapping("/{name}")
        public ResponseEntity getStudent(@PathVariable String name) {
            ResponseEntity  getReponse= studentService.findstudentbyname(name);
            return getReponse;
        }

        @DeleteMapping("/delete")
        public String deleteStudent(@RequestBody Student student) {
            studentService.delete(student);
            return "Student data deleted succesfully";
        }
    }

