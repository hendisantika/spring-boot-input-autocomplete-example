package com.hendisantika.springbootinputautocompleteexample;

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
public class Country {
    String value;
    String data;

    public Country(String name) {
        this.value = name;
        this.data = "";
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
