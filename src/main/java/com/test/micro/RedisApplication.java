package com.test.micro;

//import com.test.micro.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
        import springfox.documentation.service.ApiInfo;
        import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
@ComponentScan({"com.test"})
@EnableRedisRepositories
public class RedisApplication {


    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Micro1 API",
                "Micro1 Page for user",
                "v1",
                "Terms of service",
                "MicroTest",
                "ValidApi", "http://localhost");
    }
    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);

    }
}


