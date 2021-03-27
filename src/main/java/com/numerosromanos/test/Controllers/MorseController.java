package com.numerosromanos.test.Controllers;

import com.numerosromanos.test.Entities.TransFromMorse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("morse")
public class MorseController {
    @GetMapping("/{morseMessage}")
    public TransFromMorse getMessage(@PathVariable(value = "morseMessage") String morseMessage){
        return new TransFromMorse(morseMessage);
    }
}
