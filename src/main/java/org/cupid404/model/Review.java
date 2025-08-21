package org.cupid404.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Review {
    @JsonProperty("Title")
    public String title; //titolo della recensione
    @JsonProperty("Content")
    public String content; //contenuto della recensione
    @JsonProperty("Rating")
    public int rating; //valutazione in stelle (da 1 a 5)

    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public int getRating() {
        return rating;
    }



}
