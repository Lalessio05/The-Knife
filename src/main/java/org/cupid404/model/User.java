package org.cupid404.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;;

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
    public List<Restaurant> restaurantList;
    @JsonProperty("RewiewList")
    public List<Review> reviewList; //lista recensioni dell'utente
    @JsonProperty("UserID")
    public int userID; //identificativo utente univoco


    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getUsername() {
        return username;
    }
    public LocalDate getBirth() {
        return birth;
    }
    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }
    public List<Review> getReviewList() {
        return reviewList;
    }

}
