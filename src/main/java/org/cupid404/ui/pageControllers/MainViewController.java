package org.cupid404.ui.pageControllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cupid404.ui.componentControllers.RestaurantCardController;
import org.cupid404.model.Restaurant;
import org.cupid404.service.RestaurantService;

import java.util.List;

public class MainViewController {
    protected static final Logger logger = LogManager.getLogger();
    private final RestaurantService restaurantService = new RestaurantService();
//    private final ReviewService reviewService = new ReviewService();
    @FXML
    private FlowPane cardContainer; // container in cui mettiamo le card

    public void initialize() {
        // Lista di ristoranti di esempio (qui in futuro potrai caricarla da CSV)
        List<Restaurant> restaurants = restaurantService.getRestaurants();
        // Popoliamo la UI
        try {
        for (Restaurant r : restaurants) {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../ui/components/RestaurantCard.fxml"));
            VBox card = loader.load();

                RestaurantCardController controller = loader.getController();
            controller.setRestaurantData(
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/Mark_Knopfler_NEC_2008_02_%28cropped%29.jpg/1024px-Mark_Knopfler_NEC_2008_02_%28cropped%29.jpg",// immagine
                    r.getName(),       // titolo
                    r.getCity(),       // indirizzo
                    "Prezzo medio "+ r.getAveragePrice() + " €",   // prezzo
//                  reviewService.getAverageRating(r.getID()),                  // rating
                    "4.2"                  // rating
            );


                cardContainer.getChildren().add(card);
        }
        } catch (Exception e) {
            logger.error("Errore nel setup della home \n{}", String.valueOf(e));
        }
    }
}
