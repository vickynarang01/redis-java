package com.test.micro.mapper;


import com.test.micro.entity.Student;
import com.test.micro.stubs.StudentVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    Student studentVOtoStudent(StudentVO studentVO);
}
