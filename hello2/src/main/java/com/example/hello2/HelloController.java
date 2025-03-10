
package com.example.hello2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("hii")
    public String hii(){
        return "hey how are yous";
    }
    @GetMapping("hello")
    public String hello()
    {
        return "hello";
    }
    @GetMapping("how")
    public String how()
    {
        return "how";
    }
    @GetMapping("girls")
    public String girls()
    {
        return "girls";
    }
}
