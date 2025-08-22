package org.cupid404.ui.componentControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class RestaurantCardController {

    @FXML private VBox root;
    @FXML private ImageView cardImage;
    @FXML private Label titleLabel;
    @FXML private Label addressLabel;
    @FXML private Label priceLabel;
    @FXML private Label ratingLabel;

    // "Costruttore" custom (in realtà metodo init) per valorizzare la card
    public void setRestaurantData(String imageUrl,
                         String title,
                         String address,
                         String price,
                         String rating) {
        if (imageUrl != null && !imageUrl.isEmpty()) {
            cardImage.setImage(new Image(imageUrl));
        }
        titleLabel.setText(title);
        addressLabel.setText(address);
        priceLabel.setText(price);
        ratingLabel.setText(rating);

    }


}
