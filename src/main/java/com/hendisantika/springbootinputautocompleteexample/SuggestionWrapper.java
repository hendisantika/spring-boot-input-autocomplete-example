package com.hendisantika.springbootinputautocompleteexample;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-input-autocomplete-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/08/18
 * Time: 06.33
 * To change this template use File | Settings | File Templates.
 */
public class SuggestionWrapper {
    List<Country> suggestions;

    public List<Country> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<Country> suggestions) {
        this.suggestions = suggestions;
    }
}
