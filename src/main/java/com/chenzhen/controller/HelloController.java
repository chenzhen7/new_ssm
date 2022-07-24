package com.chenzhen.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    public static void main(String[] args) {//hot-fix
        System.out.println("master commit");
        System.out.println("hot-fix");
        System.out.println("push");
        System.out.println("pull");
    }

}
