package com.example.demo.repository.login;

import com.example.demo.data.login.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description: 什么是jpa?
 *                spring data是spring提供操作数据的框架，spring data jpa是spring data的一个模块，通过spring data基于jpa标准操作数据模块。
 *                spring data的核心能力，就是基于jpa操作数据，并且可以简化操作持久层得框架。
 *              JpaRepository
 *                1.该类封装一些使用好的增删改查方法
 *                2.提供了方法名成查询方式:
 *              方法的名称要遵循 findBy + 属性名（首字母大写） + 查询条件(首字母大写 Is Equals)
 *              findByNameLike(String name)
 *              findByName(String name)
 *              findByNameAndAge(String name, Integer age)
 *              findByNameOrAddress(String name)等...
 * */
public interface UserRepository extends JpaRepository<User, Integer> {

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
