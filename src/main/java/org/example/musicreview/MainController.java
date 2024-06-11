package org.example.musicreview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/search-results")
    public String searchResults() {
        return "search-results";
    }

    @GetMapping("/about-us")
    public String aboutUs() {
        return "about-us";
    }

    @GetMapping("/future-updates")
    public String futureUpdates() {
        return "future-updates";
    }

    @GetMapping("/error")
    public String error() { return "error"; }
}
