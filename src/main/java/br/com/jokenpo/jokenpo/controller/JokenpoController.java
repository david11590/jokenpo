package br.com.jokenpo.jokenpo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/jokenpo")
public class JokenpoController
{
    @PostMapping("/addplayer")
    ResponseEntity addplayerJokenpo()
    {
        return null;
    }

    @PostMapping("/play")
    ResponseEntity playJokenpo()
    {
        return null;
    }

    @GetMapping("players")
    ResponseEntity playersJokenpo()
    {
        return null;
    }

    @GetMapping("/result")
    ResponseEntity resultJokenpo()
    {
        return null;
    }

    @DeleteMapping("/removie")
    ResponseEntity removieJokenpo()
    {
        return null;
    }
}
