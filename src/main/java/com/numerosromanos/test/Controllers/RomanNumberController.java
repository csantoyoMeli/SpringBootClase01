package com.numerosromanos.test.Controllers;

import com.numerosromanos.test.Entities.RomanNumber;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("roman")

public class RomanNumberController {

    @GetMapping("/number/{num}")
    public Object getNum(@PathVariable("num") int num) {
        return (num < 1 | num > 3999) ? "Number out of range" : new RomanNumber(num);
    }

    @ExceptionHandler({NumberFormatException.class})
    public String handleError(){
        return "Uncorrectly formatted number!";
    }
}
