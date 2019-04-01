package creatinganellipse;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.shape.Ellipse; 

public class CreatingAnEllipse extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
      //Drawing an ellipse 
      Ellipse ellipse = new Ellipse(); 
         
      //Setting the properties of the ellipse 
      ellipse.setCenterX(300.0f); 
      ellipse.setCenterY(150.0f); 
      ellipse.setRadiusX(150.0f); 
      ellipse.setRadiusY(75.0f); 
         
      //Creating a Group object  
      Group root = new Group(ellipse); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300); 
      
      //Setting title to the Stage 
      primaryStage.setTitle("Drawing an Ellipse"); 
         
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
