package com.test.micro.mapper;

import com.test.micro.entity.Student;
import com.test.micro.stubs.StudentVO;
import org.springframework.stereotype.Component;

@Component
public class StudentMapperStructImpl implements StudentMapper{
    @Override
    public Student studentVOtoStudent(StudentVO studentVO) {
        if (studentVO==null)return null;
        Student student = new Student();
        student.setName(studentVO.getName());
        student.setGender(studentVO.getGender());
        student.setId(studentVO.getId());
        student.setGrade(studentVO.getGrade());
        return student;
    }
}
