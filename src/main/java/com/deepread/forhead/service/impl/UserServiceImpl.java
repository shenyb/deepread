package com.deepread.forhead.service.impl;

import com.deepread.forhead.entity.User;
import com.deepread.forhead.mapper.UserMapper;
import com.deepread.forhead.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Shenyanbin
 * @since 2017-06-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
}
