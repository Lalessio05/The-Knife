package org.cupid404.storage;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.cupid404.model.Restaurant;

import java.io.File;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class RestaurantDAO {
    protected static final Logger logger = LogManager.getLogger();
    private static final String FILE_PATH = "data/restaurants.json";
    private final ObjectMapper mapper = new ObjectMapper();

    public List<Restaurant> getRestaurants() {
        try{
            File file = new File(FILE_PATH);
            return mapper.readValue(file, mapper.getTypeFactory().constructCollectionType(List.class, Restaurant.class));
        }
        catch (Exception e) {
            logger.error("Errore nel caricamento del file dei ristoranti \n{}", String.valueOf(e));
            return List.of(); // Return an empty list in case of any error
        }
    }
}
