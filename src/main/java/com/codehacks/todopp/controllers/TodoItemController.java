package com.codehacks.todopp.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodoItemController {
    private final Logger logger = LoggerFactory.getLogger("TODOItem controller");

    @GetMapping("/")
    public ModelAndView index() {
        logger.debug("Request to GET index");
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
