package com.deepread.forhead.web;

import com.alibaba.druid.support.json.*;
import com.deepread.forhead.entity.*;
import com.deepread.forhead.enums.*;
import com.deepread.forhead.service.impl.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import javax.sql.*;
import java.util.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Shenyanbin
 * @since 2017-06-03
 */
@Controller
@RequestMapping("/forhead/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
   @Autowired
    DataSource dataSource;
    @RequestMapping("/findAll")
    @ResponseBody
    String home() throws  Exception{
        return JSONUtils.toJSONString(dataSource.getConnection().prepareStatement("select * from user").executeQuery());
//        EntityWrapper<User> ew = new EntityWrapper<User>();
//
//        return JSONUtils.toJSONString(userService.selectList(ew));
    }
    @RequestMapping("/insert")
    @ResponseBody
    String insert() {
        List<User> users = new ArrayList<User>();
        for(int i=0;i<1000;i++){
            User user = new User();
            user.setEmail("shenyanbin@12234.com"+i);
            user.setMobile("13034354545");
            user.setNickName("nickname" + i);
            user.setStatus(UserStatusEnum.NORMAL.getType());
            users.add(user);
        }
        userService.insertBatch(users);
        return "success";
    }
	
}
