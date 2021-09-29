
package com.test.micro.repositories;

import com.test.micro.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/*public interface StudentRepository extends CrudRepository<Student, String> {}*/
@Repository
public class StudentRepository{

    public static final String HASH_KEY = "Student";
    @Autowired
    private RedisTemplate redisTemplate;

    public Student save(Student student){
        redisTemplate.opsForHash().put(HASH_KEY,student.getId(),student);
        return student;
    }

    public List<Student> findAll(){
        return redisTemplate.opsForHash().values(HASH_KEY);
    }

    public Student findById(String id){
        return (Student) redisTemplate.opsForHash().get(HASH_KEY,id);
    }

    public String deleteStudent(String id){
        redisTemplate.opsForHash().delete(HASH_KEY,id);
        return "deleted user";
    }
}
