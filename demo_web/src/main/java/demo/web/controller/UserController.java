package demo.web.controller;

import demo.domain.User;
import demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getOne")
    public ResponseEntity<User> getOne(){
        User user = userService.findById("383ed542-e279-4b11-99c7-3f529976bc68");
        return ResponseEntity.ok(user);
    }

}
