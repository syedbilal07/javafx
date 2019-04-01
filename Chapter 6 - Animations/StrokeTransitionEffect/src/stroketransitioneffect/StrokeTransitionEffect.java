package stroketransitioneffect;

import javafx.animation.StrokeTransition; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 
import javafx.stage.Stage; 
import javafx.util.Duration; 

public class StrokeTransitionEffect extends Application 
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
       
      //creating stroke transition  
      StrokeTransition strokeTransition = new StrokeTransition(); 
      
      //Setting the duration of the transition 
      strokeTransition.setDuration(Duration.millis(1000)); 
      
      //Setting the shape for the transition 
      strokeTransition.setShape(circle); 
      
      //Setting the fromValue property of the transition (color) 
      strokeTransition.setFromValue(Color.BLACK); 
      
      //Setting the toValue property of the transition (color) 
      strokeTransition.setToValue(Color.BROWN); 
       
      //Setting the cycle count for the transition 
      strokeTransition.setCycleCount(50); 
      
      //Setting auto reverse value to false 
      strokeTransition.setAutoReverse(true); 
      
      //Playing the animation 
      strokeTransition.play(); 
         
      //Creating a Group object  
      Group root = new Group(circle); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Stroke transition example"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
