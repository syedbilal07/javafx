package creatingsvgpath;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.shape.SVGPath; 
import javafx.stage.Stage; 

public class CreatingSVGPath extends Application 
{
    @Override
    public void start(Stage stage) 
    {
        //Creating a SVGPath object 
      SVGPath svgPath = new SVGPath();       
       
      String path = "M 100 100 L 300 100 L 200 300 z";  
      
      //Setting the SVGPath in the form of string 
      svgPath.setContent(path);             
         
      //Creating a Group object  
      Group root = new Group(svgPath); 
               
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);
      
      //Setting title to the Stage
      stage.setTitle("Drawing a Sphere"); 
         
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
