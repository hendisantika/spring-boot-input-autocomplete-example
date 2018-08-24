package com.hendisantika.springbootinputautocompleteexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-input-autocomplete-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/08/18
 * Time: 06.34
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AutocompleteController {


    // http://localhost:8080
    // basic site
    @GetMapping("/")
    public String autocomplete(Model model) {
        model.addAttribute("title", "autocomplete countries example");

        return "autocomplete";
    }


// http://localhost:8080/suggestion?searchstr=car

    /**
     * the rest controller which is requested by the autocomplete input field
     * instead of the countries here could also be made a DB request
     */
    @RequestMapping(value = "/suggestion", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public SuggestionWrapper autocompleteSuggestions(@RequestParam("searchstr") String searchstr) {
        System.out.println("searchstr: " + searchstr);


        ArrayList<Country> suggestions = new ArrayList<>();

        String[] locales = Locale.getISOCountries();

        for (String countryCode : locales) {

            Locale obj = new Locale("", countryCode);
            // add all countries to the arraylist
            // if on the query string
            if (obj.getDisplayCountry().toLowerCase().contains(searchstr.toLowerCase())) {
                suggestions.add(new Country(obj.getDisplayCountry()));
            }
        }


        // truncate the list to the first n, max 20 elements
        int n = suggestions.size() > 20 ? 20 : suggestions.size();
        List<Country> sulb = new ArrayList<>(suggestions.subList(0, n));

        SuggestionWrapper sw = new SuggestionWrapper();
        sw.setSuggestions(sulb);
        return sw;
    }


}

