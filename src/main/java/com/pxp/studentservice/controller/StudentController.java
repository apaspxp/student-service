package com.pxp.studentservice.controller;

import com.pxp.studentservice.model.StudentModel;
import com.pxp.studentservice.model.StudentModelList;
import com.pxp.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "get-a-student/{rollNo}", method = RequestMethod.GET)
    public StudentModel getStudent(@PathVariable String rollNo){
        return studentService.getStudent(rollNo);
    }

    @RequestMapping(value = "get-all-students", method = RequestMethod.GET)
    public StudentModelList getAllStudents(){
        return studentService.getAllStudents();
    }
}
