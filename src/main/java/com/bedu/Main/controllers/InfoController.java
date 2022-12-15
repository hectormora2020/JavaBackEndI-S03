package com.bedu.Main.controllers;

import com.bedu.Main.model.Info;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InfoController {

    @GetMapping("/info")
    public List<String> infoAll() {
        Info info = new Info();
        return info.getAll();
    }

    @GetMapping("/info/{id}")
    public String infoOne(@PathVariable int id) {
        Info info = new Info();
        return info.getOne(id);
    }

    @PostMapping("/info")
    public List<String> setOne(@RequestBody String info ) {

        Info  obj = new Info();
        return obj.set( info );
    }

    @DeleteMapping("/info/{id}")
    public List<String> borrar(@PathVariable int id) {
        Info info = new Info();

        return info.borra(id);
    }
}