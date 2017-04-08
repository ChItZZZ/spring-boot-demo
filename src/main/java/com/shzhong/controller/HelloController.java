package com.shzhong.controller;

import com.shzhong.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by my on 17/4/8.
 */

//@Controller
//@ResponseBody
@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;
//    @Value("${cupSize}")
//    private String cupSize;
    @RequestMapping(value = {"/", "hi"}, method = RequestMethod.GET)
//    @GetMapping
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0")Integer myId) {
        return girlProperties.getCupSize()+myId;
//        return "index";
    }

}
