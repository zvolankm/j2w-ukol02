package cz.czechitas.java2webapps.ukol2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class ZobrazCitatController {
    private final Random random = new Random();

    @GetMapping("/")
    public ModelAndView nahodnyObrazek() {
        int nahodnyObrazek = random.nextInt (4) + 1;
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("obrazek", "nahodnyObrazek");
        return modelAndView;
    }

    public int indexCitatu;
    String nahodnyCitat = Citaty.citaty.get(indexCitatu);

}
