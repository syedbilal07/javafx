package quadcurvetoelement;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.shape.MoveTo; 
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo; 

public class QuadCurveToElement extends Application 
{
    @Override
    public void start(Stage stage) 
    {
      //Creating an object of the class named Path 
      Path path = new Path();  
      
      //Moving to the starting point 
      MoveTo moveTo = new MoveTo(); 
      moveTo.setX(100.0); 
      moveTo.setY(150.0); 
         
      //Instantiating the class QuadCurve 
      QuadCurveTo quadCurveTo = new QuadCurveTo(); 
       
      //Setting properties of the class QuadCurve            
      quadCurveTo.setX(500.0f); 
      quadCurveTo.setY(220.0f); 
      quadCurveTo.setControlX(250.0f);  
      quadCurveTo.setControlY(0.0f);      
       
      //Adding the path elements to Observable list of the Path class 
      path.getElements().add(moveTo); 
      path.getElements().add(quadCurveTo);         
      
      //Creating a Group object  
      Group root = new Group(path); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Drawing a cubic through a specified path");
      
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
