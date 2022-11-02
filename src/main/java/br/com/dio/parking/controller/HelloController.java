package br.com.dio.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;


  //teste para ver resposta de Spring durante o inicio do projeto
@RestController
@RequestMapping("/")
@ApiIgnore
public class HelloController {

    @GetMapping
    private String hello(){
        return "Hello!!!";
    }
}

