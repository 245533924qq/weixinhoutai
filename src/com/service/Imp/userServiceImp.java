package com.service.Imp;

import com.entity.user;
import com.mapper.userMapper;
import com.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by V on 2017/4/20.
 */
@Service
public class userServiceImp implements userService {
    @Resource
    private userMapper maipper;

    public void save(user User) {

    maipper.save(User);
    }
}
