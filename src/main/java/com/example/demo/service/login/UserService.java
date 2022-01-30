package com.example.demo.service.login;

import com.example.demo.data.login.User;

public interface UserService {

    /**
     * Description: 通过ID查询用户
     * date: 2021/12/21
     * @param id ID
     * @return User 用户对象
     * @author cuifc
     * */
    public User findById(Integer id);

    /**
     * Description: 通过name和pwd查询用户
     * date: 2021/12/21
     * @param name 用户名
     * @param pwd 用户密码
     * @return User 用户对象
     * @author cuifc
     * */
    public User findByNameAndPwd(String name, String pwd);

}
