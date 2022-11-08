package cz.czechitas.java2webapps.ukol2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Random;

@Controller
public class ZobrazCitatController {
    private static final List<String> citaty = List.of(
            "Debugging /de·bugh·ing/ (verb): The Classic Mystery Game where you are the detective, the victim, and the murderer.",
            "I have a joke on programming but it only works on my computer.",
            "When I wrote this code, only God & I understood what it did. Now… Only God knows.",
            "Real programmers count from 0.");
    private final int indexCitatu = citaty.size();
    private final Random random = new Random();

    @GetMapping("/")
    public ModelAndView zobrazCitatObrazek() {

        String nahodnyCitat = citaty.get(random.nextInt(indexCitatu));
        int nahodnyObrazek = random.nextInt (3) + 1;

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("citat","nahodnyCitat");
        modelAndView.addObject("obrazek", "nahodnyObrazek");
        return modelAndView;
    }


}
;