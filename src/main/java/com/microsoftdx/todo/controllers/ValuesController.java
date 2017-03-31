package com.microsoftdx.todo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by radu on 3/31/17.
 */
@RestController
public class ValuesController {
    @RequestMapping("/values")
    public String[] getValues(){
        return new String[]{"value1", "value2"};
    }
}
