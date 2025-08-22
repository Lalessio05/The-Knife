package org.cupid404.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.LinkedList;;

public class User {
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Surname")
    public String surname;
    @JsonProperty("Username")
    public String username;
    @JsonProperty("Birth")
    public LocalDate birth;
    @JsonProperty("RestaurantList")
    public LinkedList<Restaurant> restaurantList;
    @JsonProperty("RewiewList")
    public LinkedList<Review> reviewList;


    public String getUsername() {
        return username;
    }
}
