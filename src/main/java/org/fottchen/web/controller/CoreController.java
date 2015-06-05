package org.fottchen.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoreController {

    private static final Logger logger = Logger.getLogger(CoreController.class);

    @RequestMapping("/index.do")
    public String index() {
        logger.info("[opt:index]");
        return "index";
    }

}
