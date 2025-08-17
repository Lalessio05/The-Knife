package org.cupid404;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cupid404.model.Restaurant;
import org.cupid404.service.RestaurantService;

import java.io.IOException;
import java.util.List;

public class MainViewController {
    protected static final Logger logger = LogManager.getLogger();
    private final RestaurantService restaurantService = new RestaurantService();
    @FXML
    private FlowPane cardContainer; // container in cui mettiamo le card

    public void initialize() {
        // Lista di ristoranti di esempio (qui in futuro potrai caricarla da CSV)
        List<Restaurant> restaurants = restaurantService.getRestaurants();
        // Popoliamo la UI
        try {
        for (Restaurant r : restaurants) {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("ui/components/RestaurantCard.fxml"));
                StackPane card = loader.load();

                RestaurantCardController controller = loader.getController();
                controller.setRestaurantData(r.getName(), "file:src/main/resources/org/cupid404/images/img.png" );

                cardContainer.getChildren().add(card);
        }
        } catch (Exception e) {
            logger.error("Errore nel setup della home \n{}", String.valueOf(e));
        }
    }
}
