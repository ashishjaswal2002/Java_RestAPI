package com.learning.demo.Controller;

import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;


@RestController
@RequestMapping(value="/api")
public class SampleController
{



    @GetMapping(path = "/fetchUser")
    public String getUserDetails(@RequestParam(name="firstName") String firstName,
                                 @RequestParam(name="lastName",required = false)String lastName,
                                 @RequestParam(name="age") int age ){

        return "fetching userDetails"+ firstName.toLowerCase() +lastName +age;

    }

    @GetMapping(path="/fetchUserDetailsById/{id}")
    public String getUserDetailsById(@PathVariable(value = "id") int id){

        return "User id Details"+id;

    }






}
