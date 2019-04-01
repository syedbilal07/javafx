package paralleltransitioneffect;

import javafx.animation.ParallelTransition; 
import javafx.animation.PathTransition; 
import javafx.animation.ScaleTransition; 
import javafx.animation.TranslateTransition; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color;  
import javafx.scene.shape.CubicCurveTo; 
import javafx.scene.shape.MoveTo; 
import javafx.scene.shape.Path; 
import javafx.scene.shape.Rectangle; 
import javafx.stage.Stage; 
import javafx.util.Duration;

public class ParallelTransitionEffect extends Application 
{
    @Override
    public void start(Stage stage) 
    {
      //Drawing a Rectangle 
      Rectangle rectangle = new Rectangle(); 
      
      //Setting the position of the rectangle 
      rectangle.setX(75.0f); 
      rectangle.setY(75.0f); 
      
      //Setting the width of the rectangle 
      rectangle.setWidth(100.0f); 
      
      //Setting the height of the rectangle 
      rectangle.setHeight(100.0f);      
      
      //setting the color of the rectangle 
      rectangle.setFill(Color.BLUEVIOLET); 
      
      //Instantiating the path class 
      Path path = new Path(); 
      
      //Creating the MoveTo path element 
      MoveTo moveTo = new MoveTo(100, 150); 
      
      //Creating the Cubic curve path element 
      CubicCurveTo cubicCurveTo = new CubicCurveTo(400, 40, 175, 250, 500, 150); 
      
      //Adding the path elements to Observable list of the Path class 
      path.getElements().add(moveTo); 
      path.getElements().add(cubicCurveTo);     
       
      //Creating Path Transition  
      PathTransition pathTransition = new PathTransition(); 
      
      //Setting the duration of the transition 
      pathTransition.setDuration(Duration.millis(1000)); 
      
      //Setting the node for the transition 
      pathTransition.setNode(rectangle); 
      
      //Setting the path for the transition  
      pathTransition.setPath(path); 
      
      //Setting the orientation of the path 
      pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT); 
      
      //Setting the cycle count for the transition 
      pathTransition.setCycleCount(5); 
      
      //Setting auto reverse value to false 
      pathTransition.setAutoReverse(false); 
      
      //Playing the animation 
      pathTransition.play();         
       
      //Creating Translate Transition 
      TranslateTransition translateTransition = new TranslateTransition(); 
      
      //Setting the duration for the transition 
      translateTransition.setDuration(Duration.millis(1000)); 
      
      //Setting the node for the transition 
      translateTransition.setNode(rectangle); 
      
      //Setting the axis and length of the transition 
      translateTransition.setByX(300); 
      
      //Setting the cycle count of the transition 
      translateTransition.setCycleCount(5); 
      
      //Setting auto reverse value to false 
      translateTransition.setAutoReverse(false);  
       
      //Creating scale Transition 
      ScaleTransition scaleTransition = new ScaleTransition(); 
      
      //Setting the duration for the transition  
      translateTransition.setDuration(Duration.millis(1000)); 
      
      //Setting the node for the transition 
      translateTransition.setNode(rectangle); 
      
      //Setting the dimensions for scaling 
      scaleTransition.setByY(1.5); 
      scaleTransition.setByX(1.5); 
      
      //Setting the cycle count for the translation  
      scaleTransition.setCycleCount(5); 
      
      //Setting auto reverse value to true 
      scaleTransition.setAutoReverse(false);       
       
      //Applying parallel Translation to the circle 
      ParallelTransition parallelTransition = new ParallelTransition(
         rectangle, pathTransition, translateTransition, scaleTransition ); 
      
      //Playing the animation 
      parallelTransition.play(); 
         
      //Creating a Group object  
      Group root = new Group(rectangle); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300); 
      
      //Setting title to the Stage 
      stage.setTitle("Parallel Transition example"); 
         
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
