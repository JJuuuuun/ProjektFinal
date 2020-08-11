package com.astro.nautica;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class HomeController {

    @RequestMapping("/mantoman")
    public Map<String, Object> man() {
        Map<String, Object> map = new HashMap<>();
        map.put("tag", "<h1>hellou man!</h1>");
        map.put("name", "man");
        map.put("array", new ArrayList<>(Arrays.asList("man", "man2", "man3")));
        return map;
    }

    @RequestMapping("/onlyArray")
    public List<String> onlyArray() {
        return new ArrayList<>(Arrays.asList("bean", "coffee", "brew"));
    }
}
