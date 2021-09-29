package com.test.micro.controller;


import com.test.micro.entity.Student;
import com.test.micro.service.StudentService;
import com.test.micro.stubs.StudentVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;
import java.util.List;

@Api(tags = "Microservices", description = "Micro1 User Details")
@RestController
@RequestMapping("/v1")
public class RedisController {

    @Autowired
    public StudentService studentService;


    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Normal response returns array of User Details. Empty array will be returned in case nothing was found.")
    })
    @ApiOperation(value = "The operation returns User Details")
    @RequestMapping(value= "/user",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN)
    public String getHello()
    {
        return "Hello SpringBoot";
    }


    @PostMapping(value = "student", consumes = MediaType.APPLICATION_JSON)
    public void saveStudent(@RequestBody StudentVO userRequest){
        studentService.saveStudent(userRequest);
    }


    @PostMapping(value = "students", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    public List<Student> getAllStudents(){
        return studentService.getStudents();
    }

    @PostMapping(value = "delete")
    public String deleteStudent(@RequestParam(required = true) String id){
        return studentService.deleteStudent(id);
    }

    @GetMapping(value ="student/{id}")
    public Student getStudent(@PathVariable("id") String id){
        return studentService.getStudentById(id);
    }


}
