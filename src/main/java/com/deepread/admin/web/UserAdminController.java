package com.deepread.admin.web;

import com.deepread.forhead.dao.*;
import com.deepread.forhead.entity.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import javax.annotation.*;
import java.util.*;

@Controller
@EnableAutoConfiguration
@RequestMapping("/admin/")
public class UserAdminController {
    @Resource
    private UserRepository userRepository;
    @RequestMapping("user")
    public ModelAndView usershtml(ModelAndView mv) throws  Exception{

        mv.setViewName("admin/index");
        List<User> list = new ArrayList<User>();
        for(User user:userRepository.findAll()){
            list.add(user);
        }
        mv.addObject(("users"), list);
        return mv;
    }
}