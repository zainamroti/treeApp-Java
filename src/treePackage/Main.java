package treePackage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("tree.fxml"));
        primaryStage.setTitle("Tree");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/treePackage/treeIcon/BT.png")));
        primaryStage.setScene(new Scene(root, 690, 490));
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
