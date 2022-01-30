package com.example.demo.controller.login;

import com.example.demo.data.login.User;
import com.example.demo.dto.ResponseDto;
import com.example.demo.service.login.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {

    private final static Logger logger =  LoggerFactory.getLogger(LoginController.class);

    @Autowired
    UserService userService;

    /**
     * Description: 访问系统登录页
     *              http://localhost:8081/
     * date: 2021/12/21
     * @return String 登录页
     * @author cuifc
     * */
    @RequestMapping("/")
    public String login(){
        logger.debug("已访问login!!!");
        return "index";
    }

    /**
     * Description: 登录用户名密码校验
     *
     *              springBoot 获取参数的形式
     *              1.请求路径参数
     *               1.1.@PathVariable
     *                   获取路径参数，即url/{id}这种形式
     *               1.2.@RequestParam
     *                   获取查询参数，即url?name=这种形式
     *              2.Body参数
     *               2.1.@RequestBody
     *               2.2.无注解
     *                   借助实体类接受
     *              3.请求头参数以及Cookie
     *               3.1.@RequestHeader
     *               3.2.@CookieValue
     * date: 2021/12/21
     * @param username 登录用户名
     * @param userpwd 用户密码
     * @return ResponseDto
     * @author cuifc
     * */
    @RequestMapping("/login/check")
    @ResponseBody
    public ResponseDto loginCheck(@RequestParam(name = "username") String username,
                             @RequestParam(name = "userpwd") String userpwd){
        logger.debug("loginCheck-Param:{}、{}", username, userpwd);
        ResponseDto responseDto = new ResponseDto();

        User user = userService.findByNameAndPwd(username, userpwd);
        logger.debug("user:{}", user == null ? "空" : user.toString());

        if(user != null){
            responseDto.setSuccess(true);
            responseDto.setCode(1000);
            responseDto.setMessage("查询指定用户成功");
        }else{
            responseDto.setSuccess(false);
            responseDto.setCode(1001);
            responseDto.setMessage("未查询到指定的用户");
        }

        return responseDto;
    }

}
