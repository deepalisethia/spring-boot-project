package com.deepali.springboot.controller;

import com.deepali.springboot.model.DataReceived;
import com.deepali.springboot.model.DataToBeReturned;
import org.springframework.web.bind.annotation.*;


// This class will hold the controllers for our server app


@RestController // Tells the server this class contains controllers for RESTful HTTP requests
public class myController {
    // Data may be included with an http request that is sent to the server

    // GET or DELETE - the data is in a query parameter: /URL?parameter=value

    // POST or PUT - the data is in the request body

    // @GetMapping - identifies a method to handle HTTP GET requests for a particular path
    @GetMapping (value = "/")   // The method that follows will handle GET requests for the root path
    public String anyNameYouWant() {
        System.out.println("Method to handle GET for the URL '/' was invoked");
        return "YO";
    }
    // Handle the /data?deepali=value

    // To get the data out of the query parameter, use @RequestParam annotation

    // @RequestParam data type you want and the parameter name in the method parameters
    // The parameter name must match the query parameter name

    // For this to work - the GET path needs to be changed to:
    // http://localhost:8080/data?words=BOOM&deepali=42
    @GetMapping (value = "/data")
    public DataToBeReturned someBoringMethodName(@RequestParam String words, @RequestParam int deepali) {
        System.out.println("Method to handle GET for URL: '/data' was invoked");
        return new DataToBeReturned(words, deepali);
    }

    @PostMapping (value = "/rec")
    public String anyNameYouLike (@RequestBody DataReceived whatWeGot) {
        System.out.println("Method for POST with '/rec' called");
        return whatWeGot.getDataSent();
    }
}
