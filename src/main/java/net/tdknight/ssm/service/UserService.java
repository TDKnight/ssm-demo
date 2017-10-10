package net.tdknight.ssm.service;

import net.tdknight.ssm.dao.UserMapper;
import net.tdknight.ssm.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务层
 *
 * @Author TDKnight
 * @Date 2017/10/10
 */
@Service
public class UserService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    public User getById(String id){
        return userMapper.getById(id);
    }
}
