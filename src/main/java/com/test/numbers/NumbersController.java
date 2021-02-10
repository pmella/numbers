package com.test.numbers;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumbersController {

    @GetMapping("/getPath")
    public Response getPath(@RequestParam(value = "number", defaultValue = "1") Integer number) {

        Long before = System.nanoTime();
        
       

        BinaryTree bt = new BinaryTree(number);

        Long duration = System.nanoTime() - before;

        String path = bt.printPath(bt.root, number);
        return new Response(path, duration);

    }



}