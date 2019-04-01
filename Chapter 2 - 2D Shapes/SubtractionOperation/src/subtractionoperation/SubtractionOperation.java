package subtractionoperation;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.stage.Stage; 
import javafx.scene.shape.Circle; 
import javafx.scene.shape.Shape; 

public class SubtractionOperation extends Application 
{
    @Override
    public void start(Stage stage) 
    {
        //Drawing Circle1 
      Circle circle1 = new Circle();         
      
      //Setting the position of the circle 
      circle1.setCenterX(250.0f); 
      circle1.setCenterY(135.0f); 
      
      //Setting the radius of the circle 
      circle1.setRadius(100.0f); 
      
      //Setting the color of the circle 
      circle1.setFill(Color.DARKSLATEBLUE);     
       
      //Drawing Circle2 
      Circle circle2 = new Circle();         
      
      //Setting the position of the circle 
      circle2.setCenterX(350.0f);
      circle2.setCenterY(135.0f); 
      
      //Setting the radius of the circle 
      circle2.setRadius(100.0f); 
      
      //Setting the color of the circle  
      circle2.setFill(Color.BLUE);  
       
      //Performing union operation on the circle 
      Shape shape = Shape.subtract(circle1, circle2); 
      
      //Setting the fill color to the result 
      shape.setFill(Color.DARKSLATEBLUE); 
       
      //Creating a Group object  
      Group root = new Group(shape); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Union Example"); 
         
      //Adding scene to the stage  
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
    }
    public static void main(String[] args) 
    {
        launch(args);
    }
}
