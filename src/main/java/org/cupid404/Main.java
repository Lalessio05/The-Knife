package org.cupid404;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ui/views/MainView.fxml"));
        Scene scene = new Scene(loader.load(), 800, 600);

        stage.setTitle("TheKnife - Lista Ristoranti");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


//public class  Main {
//
//    public static void main(String[] args) {
//        RestaurantService restaurantService = new RestaurantService();
//        for (Restaurant restaurant : restaurantService.getRestaurants()) {
//            System.out.println("Nome: " +restaurant.name);
//            System.out.println("Indirizzo: " + restaurant.address);
//            System.out.println("Posizione: " + restaurant.location);
//            System.out.println("Prezzo: " + restaurant.price);
//            System.out.println("Cucina: " + restaurant.cuisine);
//            System.out.println("Telefono: " + restaurant.phoneNumber);
//            System.out.println("Sito Web: " + restaurant.websiteUrl);
//            System.out.println("Premio: " + restaurant.award);
//            System.out.println("Stella Verde: " + restaurant.greenStar);
//            System.out.println("Servizi: " + restaurant.facilitiesAndServices);
//            System.out.println("Descrizione: " + restaurant.description);
//            System.out.println("-----------------------------");
//        }
//
//    }
//    }
