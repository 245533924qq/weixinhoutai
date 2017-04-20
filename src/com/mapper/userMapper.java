package com.mapper;

import com.entity.user;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by V on 2017/4/20.
 */
@Repository
public interface userMapper {
    void save(user user);


}
