package com.wangling.virus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * controller
 *
 * @author J.Tang
 * @version 1.0
 * @date 2021/7/30
 **/
@Controller
public class VirusController {

    @GetMapping("index.html")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @GetMapping("search.html")
    public ModelAndView search() {
        return new ModelAndView("search");
    }

    @GetMapping("download.html")
    public ModelAndView download() {
        return new ModelAndView("download");
    }

    @GetMapping("contact.html")
    public ModelAndView contact() {
        return new ModelAndView("contact");
    }

    @GetMapping("faq.html")
    public ModelAndView faq() {
        return new ModelAndView("faq");
    }

    @GetMapping("searchTargets.html")
    public ModelAndView searchTargets() {
        return new ModelAndView("searchTargets");
    }
}
