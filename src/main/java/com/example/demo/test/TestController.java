package com.example.demo.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        String str = "首次输出!!";
        logger.debug("TestController:test-首次输出!!");
        logger.debug("TestController:test-" + str);
        logger.debug("TestController:test-{}", str);
        return "this test";
    }

}
