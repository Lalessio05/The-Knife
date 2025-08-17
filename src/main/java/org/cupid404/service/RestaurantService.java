package org.cupid404.service;
import org.cupid404.model.Restaurant;
import org.cupid404.storage.RestaurantDAO;

import java.util.List;

public class RestaurantService {

    private final RestaurantDAO restaurantDAO = new RestaurantDAO();

    /**
     * Retrieves the list of restaurants.
     *
     * @return List of Restaurant objects
     */
    public List<Restaurant> getRestaurants() {
        return restaurantDAO.getRestaurants();
    }
}
