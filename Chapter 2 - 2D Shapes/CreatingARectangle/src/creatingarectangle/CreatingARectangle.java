package creatingarectangle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CreatingARectangle extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
      //Drawing a Rectangle 
      Rectangle rectangle = new Rectangle();  
      
      //Setting the properties of the rectangle 
      rectangle.setX(150.0f);
      rectangle.setY(75.0f); 
      rectangle.setWidth(300.0f); 
      rectangle.setHeight(150.0f);      
         
      //Creating a Group object  
      Group root = new Group(rectangle); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      primaryStage.setTitle("Drawing A Rectangle"); 
         
      //Adding scene to the stage 
      primaryStage.setScene(scene); 
         
      //Displaying the contents of the stage 
      primaryStage.show(); 
    }
    public static void main(String[] args) 
    {
        launch(args);
    }
}
