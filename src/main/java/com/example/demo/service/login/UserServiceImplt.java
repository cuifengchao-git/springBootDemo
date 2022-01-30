package com.example.demo.service.login;

import com.example.demo.data.login.User;
import com.example.demo.repository.login.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplt implements UserService{

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImplt.class);

    @Autowired
    private UserRepository userRepository;

    /**
     * Description: 通过ID查询用户
     * date: 2021/12/21
     * @param id ID
     * @return User 用户对象
     * @author cuifc
     * */
    public User findById(Integer id){
        User users = userRepository.getById(id);
        return users;
    }

    /**
     * Description: 通过name和pwd查询用户
     * date: 2021/12/21
     * @param name 用户名
     * @param pwd 用户密码
     * @return User 用户对象
     * @author cuifc
     * */
    @Override
    public User findByNameAndPwd(String name, String pwd) {
        User users = userRepository.findByNameAndPwd(name, pwd);
        return users;
    }

}
