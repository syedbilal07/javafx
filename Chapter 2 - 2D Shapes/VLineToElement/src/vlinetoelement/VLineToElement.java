package vlinetoelement;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage;
import javafx.scene.shape.VLineTo; 
import javafx.scene.shape.MoveTo; 
import javafx.scene.shape.Path;   

public class VLineToElement extends Application 
{
    @Override
    public void start(Stage stage) 
    {
        //Creating an object of the Path class 
      Path path = new Path(); 
       
      //Moving to the starting point 
      MoveTo moveTo = new MoveTo(); 
      moveTo.setX(100.0); 
      moveTo.setY(150.0); 
       
      //Instantiating the HLineTo class 
      VLineTo vLineTo = new VLineTo();       
         
      //Setting the properties of the path element horizontal line 
      vLineTo.setY(10.0);
       
      //Adding the path elements to Observable list of the Path class 
      path.getElements().add(moveTo); 
      path.getElements().add(vLineTo); 
         
      //Creating a Group object  
      Group root = new Group(path); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Drawing a horizontal line"); 
         
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
