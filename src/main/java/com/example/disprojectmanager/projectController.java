package com.example.disprojectmanager;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/project")
public class projectController{

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getAllProjects()
    {
        return "All Projects";
    }

}

