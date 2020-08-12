package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Simon
 * @date 2020/8/12 15:59
 */
@SpringBootApplication
@RestController
public class MyApplication {

    @Autowired
    private AccountRepository repository;

    public static void main(String[] args) {
        System.out.println("fvv");
        SpringApplication.run(MyApplication.class, args);
    }

    @RequestMapping("/")
    public String index(){
        repository.count();
        return "HelloWorld";
    }
}
