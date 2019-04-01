package arctoelement;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.MoveTo; 
import javafx.scene.shape.Path; 

public class ArcToElement extends Application 
{
    @Override
    public void start(Stage stage) 
    {
      //Creating an object of the class Path  
      Path path = new Path();  
      
      //Moving to the starting point 
      MoveTo moveTo = new MoveTo(); 
      moveTo.setX(250.0); 
      moveTo.setY(250.0); 
      
      //Instantiating the arcTo class 
      ArcTo arcTo = new ArcTo(); 
         
      //setting properties of the path element arc  
      arcTo.setX(300.0); 
      arcTo.setY(50.0); 
       
      arcTo.setRadiusX(50.0); 
      arcTo.setRadiusY(50.0); 
         
      //Adding the path elements to Observable list of the Path class 
      path.getElements().add(moveTo); 
      path.getElements().add(arcTo);        
         
      //Creating a Group object  
      Group root = new Group(path); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage
      stage.setTitle("Drawing an arc through a path"); 
         
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
