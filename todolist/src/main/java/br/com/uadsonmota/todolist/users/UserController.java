package br.com.uadsonmota.todolist.users;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Post
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    }
}
