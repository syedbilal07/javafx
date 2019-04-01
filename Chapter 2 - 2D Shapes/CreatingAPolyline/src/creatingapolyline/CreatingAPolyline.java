package creatingapolyline;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.shape.Polyline;

public class CreatingAPolyline extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
      //Creating a polyline 
      Polyline polyline = new Polyline();  
       
      //Adding coordinates to the polygon 
      polyline.getPoints().addAll(new Double[]{        
         200.0, 50.0, 
         400.0, 50.0, 
         450.0, 150.0,          
         400.0, 250.0, 
         200.0, 250.0,                   
         150.0, 150.0, 
      }); 
          
      //Creating a Group object  
      Group root = new Group(polyline); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      primaryStage.setTitle("Drawing a Polyline"); 
         
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
