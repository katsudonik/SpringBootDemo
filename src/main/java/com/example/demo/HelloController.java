package com.example.demo;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method=RequestMethod.POST)
    public Hoge hello(@RequestBody Hoge param) {
        System.out.println(param);

        Hoge hoge = new Hoge();
        hoge.id = 20;
        hoge.value = "Response";

        return hoge;
    }

    @RequestMapping(value="/hey", method=RequestMethod.POST)
    public String postMethod2() {
        return "hey post";
    }

    @RequestMapping(value="/{id}/{name}", method=RequestMethod.GET)
    public void getMethod(@PathVariable int id, @PathVariable String name) {
        System.out.println("id=" + id + ", name=" + name);
    }

    @RequestMapping(method=RequestMethod.GET)
    public void getMethod(
            @RequestParam String id,
            @RequestParam Map<String, String> queryParameters,
            @RequestParam MultiValueMap<String, String> multiMap) {

        System.out.println("id=" + id);
        System.out.println(queryParameters);
        System.out.println(multiMap);
    }

    @RequestMapping(value="/post", method=RequestMethod.POST)
    public void getMethod2(@RequestBody String body) {
        System.out.println("body=" + body);
    }

    @RequestMapping(value="/bad_request", method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void getMethod() {
    }
}