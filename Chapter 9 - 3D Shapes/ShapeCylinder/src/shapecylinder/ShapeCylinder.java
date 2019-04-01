package shapecylinder;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.shape.CullFace; 
import javafx.scene.shape.Cylinder; 
import javafx.stage.Stage;

public class ShapeCylinder extends Application 
{
    @Override
    public void start(Stage stage) 
    {
      //Drawing a Cylinder 
      Cylinder cylinder = new Cylinder(); 
         
      //Setting the properties of the Cylinder 
      cylinder.setHeight(300.0f); 
      cylinder.setRadius(100.0f); 
               
      //Creating a Group object  
      Group root = new Group(cylinder); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Drawing a cylinder"); 
         
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
