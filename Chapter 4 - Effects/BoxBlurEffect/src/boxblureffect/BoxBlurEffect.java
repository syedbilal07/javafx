package boxblureffect;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.effect.BoxBlur; 
import javafx.scene.paint.Color; 
import javafx.stage.Stage; 
import javafx.scene.text.Font; 
import javafx.scene.text.FontWeight; 
import javafx.scene.text.Text;

public class BoxBlurEffect extends Application 
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
      text.setY(150);         
      
      //Setting the text to be added. 
      text.setText("Welcome to Tutorialspoint");       
      
      //Setting the color of the text 
      text.setFill(Color.DARKSEAGREEN);
      
      //Instantiating the BoxBlur class 
      BoxBlur boxblur = new BoxBlur();      
      
      //Setting the width of the box filter 
      boxblur.setWidth(8.0f);  
      
      //Setting the height of the box filter 
      boxblur.setHeight(3.0f); 
      
      //Setting the no of iterations  
      boxblur.setIterations(3);       
               
      //Applying BoxBlur effect to the text 
      text.setEffect(boxblur);          
         
      //Creating a Group object  
      Group root = new Group(text);   
               
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Sample Application"); 
         
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
