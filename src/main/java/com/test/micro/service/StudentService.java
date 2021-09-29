package com.test.micro.service;

import com.test.micro.entity.Student;
import com.test.micro.mapper.StudentMapperStructImpl;
import com.test.micro.repositories.StudentRepository;
import com.test.micro.stubs.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {

@Autowired
private StudentMapperStructImpl studentVOtoStudent;

    @Autowired
    public StudentRepository studentRepository;

    public void saveStudent(StudentVO userRequest) {
       try{
           studentRepository.save(studentVOtoStudent.studentVOtoStudent(userRequest));}
        catch (Exception e){
            System.out.println("error -:"+e.getStackTrace());
        }

    }

    public List<Student> getStudents() {
        try{
            return studentRepository.findAll();
        }
        catch (Exception e){
            System.out.println("error -:"+e.getStackTrace());
        }
        return null;
    }


    public String deleteStudent(String id) {
        try{
            return studentRepository.deleteStudent(id);
        }
        catch (Exception e){
            System.out.println("error -:"+e.getStackTrace());
        }
        return null;
    }

    public Student getStudentById(String id) {
        try{
            return studentRepository.findById(id);
        }
        catch (Exception e){
            System.out.println("error -:"+e.getStackTrace());
        }
        return null;
    }
}
