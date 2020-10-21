package training.zerotohero.gitflowdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("health-check")
public class HelloWorld {
    @GetMapping()
    public String helloWorld(){
        return "MS is up and running!";
    }
}
