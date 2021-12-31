package dev.rontran.jokes.controllers;

import dev.rontran.jokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("")
    public String getJoke(Model model) {
        String joke = jokeService.getJokeQuotes();
        model.addAttribute("joke", joke);
        return "index";
    }
}
