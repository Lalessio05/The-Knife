package org.cupid404.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Restaurant {
    @JsonProperty("id")
    public int id;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Address")
    public String address;
    @JsonProperty("Cuisine")
    public String cuisine;
    @JsonProperty("Longitude")
    public double longitude;
    @JsonProperty("Latitude")
    public double latitude;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("City")
    public String city;
    @JsonProperty("State")
    public String state;
    @JsonProperty("OnlineBooking")
    public boolean onlineBooking;
    @JsonProperty("Delivery")
    public boolean delivery;
    @JsonProperty("AveragePrice")
    public double averagePrice;
    @JsonProperty("Reviews")
    public List<Integer> reviews;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCuisine() {
        return cuisine;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getDescription() {
        return description;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public boolean isOnlineBooking() {
        return onlineBooking;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public List<Integer> getReviews() {
        return reviews;
    }

}
