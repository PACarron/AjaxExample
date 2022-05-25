package com.example.ajax_java_list.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/testcontroller")
public class TestController {

    @RequestMapping(value = "/toto", method = RequestMethod.POST)
    public @ResponseBody String toto (@RequestBody List<Integer> data){
        return "Status: "+HttpStatus.OK;
    }
}
