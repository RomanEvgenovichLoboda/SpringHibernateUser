package Controllers;
import Controllers.UserController;
import Models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
@SpringBootApplication
@RestController
public class MyController {
    public static UserController userController=new UserController();
    @GetMapping("/getAll")
    public ArrayList<User>getAll(){
        return userController.getList();
    }
    @PostMapping("/add")
    public void add(User user){
        userController.addUser(user);
    }
    @DeleteMapping("/dellete")
    public void dellete(String log){
        userController.remuveUser(log);
    }
}
