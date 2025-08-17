package org.cupid404.ui.componentControllers;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class RestaurantCardController {

    @FXML
    private ImageView imageView;

    @FXML
    private Text restaurantName;

    public void setRestaurantData(String name, String imageUrl) {
        restaurantName.setText(name);
        imageView.setImage(new Image(imageUrl));
    }
}
