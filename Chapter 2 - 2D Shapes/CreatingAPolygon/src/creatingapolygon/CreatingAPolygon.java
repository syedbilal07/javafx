package creatingapolygon;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.shape.Polygon; 
import javafx.stage.Stage;

public class CreatingAPolygon extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
      //Creating a Polygon 
      Polygon polygon = new Polygon();  
       
      //Adding coordinates to the polygon 
      polygon.getPoints().addAll(new Double[]{ 
         300.0, 50.0, 
         450.0, 150.0, 
         300.0, 250.0, 
         150.0, 150.0, 
      }); 
          
      //Creating a Group object  
      Group root = new Group(polygon); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      primaryStage.setTitle("Drawing a Polygon"); 
         
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
