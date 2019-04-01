package scaletransformation;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 
import javafx.scene.transform.Scale; 
import javafx.stage.Stage;

public class ScaleTransformation extends Application 
{
    @Override
    public void start(Stage stage) 
    {
        //Drawing Circle1 
        Circle circle1 = new Circle(300, 135, 50);
        //Setting the color of the circle 
        circle1.setFill(Color.BLUE);
        //Setting the stroke width of the circle 
        circle1.setStrokeWidth(20);
        
        //Drawing Circle2 
        Circle circle2 = new Circle(300, 135, 50); 
        //Setting the color of the circle 
        circle2.setFill(Color.BURLYWOOD); 
        //Setting the stroke width of the circle 
        circle2.setStrokeWidth(20);
        
        //Creating the scale transformation 
        Scale scale = new Scale();
        //Setting the dimensions for the transformation 
        scale.setX(1.5);
        scale.setY(1.5);
        //Setting the pivot point for the transformation 
        scale.setPivotX(300);
        scale.setPivotY(135);
        
        //Adding the scale transformation to circle1 
        circle1.getTransforms().addAll(scale);
        //Creating a Group object  
        Group root = new Group(circle1, circle2);
        //Creating a scene object 
        Scene scene = new Scene(root);
        //Setting title to the Stage 
        stage.setTitle("Scaling transformation example"); 
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
