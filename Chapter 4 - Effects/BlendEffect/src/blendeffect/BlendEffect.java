package blendeffect;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage;
import javafx.scene.shape.Circle; 
import javafx.scene.effect.Blend; 
import javafx.scene.effect.BlendMode; 
import javafx.scene.effect.ColorInput; 
import javafx.scene.paint.Color; 

public class BlendEffect extends Application 
{
    @Override
    public void start(Stage stage) 
    {
        //Drawing a Circle 
        Circle circle = new Circle();
        
        //Setting the center of the Circle
        circle.setCenterX(75.0f);
        circle.setCenterY(75.0f);
        
        //Setting radius of the circle 
        circle.setRadius(30.0f);
        
        //Setting the fill color of the circle 
        circle.setFill(Color.BROWN);
        
        //Instantiating the blend class 
        Blend blend = new Blend();
        
        //Preparing the top input object 
        ColorInput topInput = new ColorInput(35, 30, 75, 40, Color.BLUEVIOLET); 
        
        //setting the top input to the blend object 
        blend.setTopInput(topInput);
        
        //setting the blend mode 
        blend.setMode(BlendMode.SRC_OVER);
        
        //Applying the blend effect to circle  
        circle.setEffect(blend);
        
        //Creating a Group object  
        Group root = new Group(circle); 
         
        //Creating a scene object 
        Scene scene = new Scene(root, 150, 150);  
      
        //Setting title to the Stage 
        stage.setTitle("Blend Example"); 
         
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
