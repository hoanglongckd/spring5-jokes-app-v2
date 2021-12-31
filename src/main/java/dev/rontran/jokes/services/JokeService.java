package dev.rontran.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    public String getJokeQuotes() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
