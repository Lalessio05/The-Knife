package org.cupid404.ui.pageControllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cupid404.ui.componentControllers.RestaurantCardController;
import org.cupid404.model.Restaurant;
import org.cupid404.service.RestaurantService;

import java.util.List;

public class MainViewController {
    protected static final Logger logger = LogManager.getLogger();
    private final RestaurantService restaurantService = new RestaurantService();
    @FXML
    private FlowPane cardContainer;

    public void initialize() {
        List<Restaurant> restaurants = restaurantService.getRestaurants();
        try {
        for (Restaurant r : restaurants) {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("../components/RestaurantCard.fxml"));
                VBox card = loader.load();

                RestaurantCardController controller = loader.getController();
                controller.setRestaurantData(
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/Mark_Knopfler_NEC_2008_02_%28cropped%29.jpg/1024px-Mark_Knopfler_NEC_2008_02_%28cropped%29.jpg",
                        r.getName(),
                        r.getAddress(),
                        r.getAveragePrice() + " €",
                        5 + " ★"

                );

                cardContainer.getChildren().add(card);
        }
        } catch (Exception e) {
            logger.error("Errore nel setup della home \n{}", String.valueOf(e));
        }
    }
}
