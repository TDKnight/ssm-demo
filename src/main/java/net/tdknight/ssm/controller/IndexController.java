package net.tdknight.ssm.controller;

import net.tdknight.ssm.entity.User;
import net.tdknight.ssm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制层
 *
 * @Author TDKnight
 * @Date 2017/10/10
 */
@Controller
public class IndexController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        logger.info("test");
        String id = "1";
        User user = userService.getById(id);
        return "123";
    }
}
