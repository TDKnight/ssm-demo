package net.tdknight.ssm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    @RequestMapping("/index")
    public String index(){
        logger.info("test");
        return "123";
    }
}
