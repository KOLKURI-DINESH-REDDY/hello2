
package com.example.hello2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    
    @GetMapping("hello")
    public String hello()
    {
        return "hello";
    }
    @GetMapping("boys")
    public String boys()
    {
        return "boys";
    }
}
