package com.pxp.studentservice.service;

import com.pxp.studentservice.model.StudentModel;
import com.pxp.studentservice.model.StudentModelList;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private List<StudentModel> studentModelList = Arrays.asList(
            new StudentModel("1","Swati","Mhasalkar"),
            new StudentModel("2","Nirav","Anand"),
            new StudentModel("3","Bishan","Jain"),
            new StudentModel("4","Nikita","Chaudhari"),
            new StudentModel("5","Grishma","Ahmad"),
            new StudentModel("6","Karthik","Gadhavi"),
            new StudentModel("7","Tanu","D'Cruze"),
            new StudentModel("8","Maya","Mahasalkar"),
            new StudentModel("9","Sujay","Misra"),
            new StudentModel("10","Jayadev","Mahasalkar")
    );

    public StudentModel getStudent(String rollNo){
        if (studentModelList.stream().filter(studentModel -> rollNo.equalsIgnoreCase(studentModel.getRollNo())).findFirst().isPresent())
            return studentModelList.stream().filter(studentModel -> rollNo.equalsIgnoreCase(studentModel.getRollNo())).findFirst().get();
        else
            return new StudentModel();
    }

    public StudentModelList getAllStudents(){
        StudentModelList studentModelList = new StudentModelList();
        studentModelList.setStudentModelList(this.studentModelList);
        return studentModelList;
    }
}
