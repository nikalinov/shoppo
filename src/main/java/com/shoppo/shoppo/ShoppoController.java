package com.shoppo.shoppo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppoController {
    @RequestMapping
    public String indexPage() {
        return "Index page";
    }

    @RequestMapping("/ggg")
    public String gggPage() {
        return "ggg";
    }
}
