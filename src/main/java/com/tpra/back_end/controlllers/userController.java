package com.tpra.back_end.controlllers;

import com.tpra.back_end.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class userController {

    @Autowired
    private userService userService;
        @RequestMapping("/user")
        public String get() {
            return "Hello World";
        }
        @RequestMapping("/user/{id}")
        public String get(@PathVariable long id) {
            return String.valueOf(userService.getUser(id));
        }


}
