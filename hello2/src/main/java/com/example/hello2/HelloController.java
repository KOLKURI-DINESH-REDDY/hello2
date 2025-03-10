
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
<<<<<<< HEAD
    @GetMapping("men")
    public String men()
    {
        return "men";
=======
    @GetMapping("who")
    public String who()
    {
        return "who";
>>>>>>> c264a1f6718f0c1ac67f33300edb16dd89a4f9c8
    }
}
