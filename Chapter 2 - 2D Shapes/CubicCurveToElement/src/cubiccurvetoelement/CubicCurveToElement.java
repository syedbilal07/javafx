package cubiccurvetoelement;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.shape.CubicCurveTo; 
import javafx.scene.shape.MoveTo; 
import javafx.scene.shape.Path; 
public class CubicCurveToElement extends Application 
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
      
      //Instantiating the class CubicCurve 
      CubicCurveTo cubicCurveTo = new CubicCurveTo(); 
       
      //Setting properties of the class CubicCurve            
      cubicCurveTo.setControlX1(400.0f); 
      cubicCurveTo.setControlY1(40.0f); 
      cubicCurveTo.setControlX2(175.0f); 
      cubicCurveTo.setControlY2(250.0f); 
      cubicCurveTo.setX(500.0f); 
      cubicCurveTo.setY(150.0f);       
       
      //Adding the path elements to Observable list of the Path class 
      path.getElements().add(moveTo);       
      path.getElements().add(cubicCurveTo);         
      
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
