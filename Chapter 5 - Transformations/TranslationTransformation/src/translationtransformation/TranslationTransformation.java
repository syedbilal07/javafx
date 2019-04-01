package translationtransformation;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 
import javafx.scene.transform.Translate; 
import javafx.stage.Stage;

public class TranslationTransformation extends Application 
{
    @Override
    public void start(Stage stage) 
    {
      //Drawing Circle1 
      Circle circle = new Circle(); 
      
      //Setting the position of the circle 
      circle.setCenterX(150.0f); 
      circle.setCenterY(135.0f); 
      
      //Setting the radius of the circle 
      circle.setRadius(100.0f); 
      
      //Setting the color of the circle 
      circle.setFill(Color.BROWN); 
      
      //Setting the stroke width of the circle 
      circle.setStrokeWidth(20); 
       
      //Drawing Circle2 
      Circle circle2 = new Circle(); 
      
      //Setting the position of the circle 
      circle2.setCenterX(150.0f); 
      circle2.setCenterY(135.0f); 
      
      //Setting the radius of the circle 
      circle2.setRadius(100.0f); 
      
      //Setting the color of the circle 
      circle2.setFill(Color.CADETBLUE); 
      
      //Setting the stroke width of the circle 
      circle2.setStrokeWidth(20); 
       
      //Creating the translation transformation 
      Translate translate = new Translate();       
      
      //Setting the X,Y,Z coordinates to apply the translation 
      translate.setX(300); 
      translate.setY(50); 
      translate.setZ(100);  
      
      //Adding transformation to circle2 
      circle2.getTransforms().addAll(translate); 
       
      //Creating a Group object  
      Group root = new Group(circle,circle2); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Translation transformation example"); 
         
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
