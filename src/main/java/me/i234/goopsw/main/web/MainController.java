package me.i234.goopsw.main.web;

import me.i234.goopsw.main.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.HashMap;

@Controller
@RequestMapping("/main")
public class MainController {

    @Resource(name = "mainService")
    MainService mainService;

    @RequestMapping("/main.do")
    public String main(ModelMap model) {
        return "main/main";
    }

    @RequestMapping("/mainTest.do")
    public String mainTest(ModelMap model) throws Exception {
        HashMap paramMap = new HashMap();
        int i = mainService.selectMainTestCnt(paramMap);
        return "jsonView";
    }
}
