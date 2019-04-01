package filltransitioneffect;

import javafx.animation.FillTransition; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 
import javafx.stage.Stage; 
import javafx.util.Duration; 

public class FillTransitionEffect extends Application 
{
    @Override
    public void start(Stage stage) 
    {
      //Drawing a Circle 
      Circle circle = new Circle(); 
      
      //Setting the position of the circle 
      circle.setCenterX(300.0f); 
      circle.setCenterY(135.0f); 
      
      //Setting the radius of the circle 
      circle.setRadius(100.0f); 
      
      //Setting the color of the circle 
      circle.setFill(Color.BROWN); 
      
      //Setting the stroke width of the circle 
      circle.setStrokeWidth(20); 
       
      //Creating the fill Transition 
      FillTransition fillTransition = new FillTransition(Duration.millis(1000)); 
      
      //Setting the shape for Transition 
      fillTransition.setShape(circle); 
      
      //Setting the from value of the transition (color) 
      fillTransition.setFromValue(Color.BLUEVIOLET);  
      
      //Setting the toValue of the transition (color) 
      fillTransition.setToValue(Color.CORAL); 
      
      //Setting the cycle count for the transition 
      fillTransition.setCycleCount(50); 
      
      //Setting auto reverse value to false 
      fillTransition.setAutoReverse(false);  
      
      //Playing the animation 
      fillTransition.play(); 
         
      //Creating a Group object  
      Group root = new Group(circle); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);   
      
      //Setting title to the Stage
      stage.setTitle("Fill transition example"); 
         
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
