package creatingaline;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class CreatingALine extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
        Line line = new Line();
        line.setStartX(100.0); 
        line.setStartY(150.0); 
        line.setEndX(500.0); 
        line.setEndY(150.0); 
        Group root = new Group(line);
        Scene scene = new Scene(root, 600, 300);
        primaryStage.setTitle("Line");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }
}
