package innershadoweffect;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.effect.InnerShadow; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 
import javafx.stage.Stage; 
import javafx.scene.text.Font; 
import javafx.scene.text.FontWeight; 
import javafx.scene.text.Text; 

public class InnerShadowEffect extends Application 
{
    @Override
    public void start(Stage stage) 
    {
        //Creating a Text object 
      Text text = new Text();       
      
      //Setting font to the text 
      text.setFont(Font.font(null, FontWeight.BOLD, 40));       
      
      //setting the position of the text 
      text.setX(60);
      text.setY(50); 
      
      //Setting the text to be embedded. 
      text.setText("Welcome to Tutorialspoint");        
      
      //Setting the color of the text 
      text.setFill(Color.RED);   
       
      //Drawing a Circle 
      Circle circle = new Circle();         
      
      //Setting the center of the circle 
      circle.setCenterX(300.0f); 
      circle.setCenterY(160.0f); 
      
      //Setting the radius of the circle 
      circle.setRadius(100.0f); 
      
      //setting the fill color of the circle 
      circle.setFill(Color.CORNFLOWERBLUE);   
       
      //Instantiating the InnerShadow class  
      InnerShadow innerShadow = new InnerShadow(); 
      
      //Setting the offset values of the inner shadow 
      innerShadow.setOffsetX(4); 
      innerShadow.setOffsetY(4); 
      
      //Setting the color of the inner shadow 
      innerShadow.setColor(Color.GRAY);        
      
      //Applying inner shadow effect to the text 
      text.setEffect(innerShadow);      
      
      //Applying inner shadow effect to the circle 
      circle.setEffect(innerShadow); 
         
      //Creating a Group object  
      Group root = new Group(text,circle);   
               
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);
      
      //Setting title to the Stage 
      stage.setTitle("Inner shadow effect example"); 
          
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
