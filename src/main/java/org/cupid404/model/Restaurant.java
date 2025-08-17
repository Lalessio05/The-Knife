package org.cupid404.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Restaurant {
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Address")
    public String address;
    @JsonProperty("Location")
    public String location;
    @JsonProperty("Price")
    public String price;
    @JsonProperty("Cuisine")
    public String cuisine;
    @JsonProperty("Longitude")
    public double longitude;
    @JsonProperty("Latitude")
    public double latitude;
    @JsonProperty("PhoneNumber")
    public String phoneNumber;
    @JsonProperty("Url")
    public String url;
    @JsonProperty("WebsiteUrl")
    public String websiteUrl;
    @JsonProperty("Award")
    public String award;
    @JsonProperty("GreenStar")
    public int greenStar;
    @JsonProperty("FacilitiesAndServices")
    public String facilitiesAndServices;
    @JsonProperty("Description")
    public String description;

    public String getName() {
        return name;
    }
}
