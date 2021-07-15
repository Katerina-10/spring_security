package com.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String getInfoAllEmps()
    {
        return "view_allEmp";
    }

    @GetMapping("/hr_info")
    public String getOnlyHR()
    {
        return "view_forHR";
    }

    @GetMapping("/manager_info")
    public String getOnlyManagers()
    {
        return "view_forManagers";
    }
}
