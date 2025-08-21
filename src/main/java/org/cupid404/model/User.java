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
    public LinkedList<Review> reviewList; //lista recensioni dell'utente
    @JsonProperty("UserID")
    public int userID; //identificativo utente univoco


    public String getName() {
        return name;
    }
    public String getSrname() {
        return surname;
    }
    public String getUsername() {
        return username;
    }
    public LocalDate getBirth() {
        return birth;
    }
    public LinkedList<Restaurant> getRestaurantList() {
        return restaurantList;
    }
    public LinkedList<Review> getReviewList() {
        return reviewList;
    }

}
