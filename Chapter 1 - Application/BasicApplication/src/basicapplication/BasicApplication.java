package basicapplication;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BasicApplication extends Application 
{
    @Override
    public void start(Stage primaryStage) 
    {
       //Creating a Text object 
        Text text = new Text();
        //Setting font to the text 
        text.setFont(new Font(45));
        //setting the position of the text 
        text.setX(165);
        text.setY(150);
        //Setting the text to be added. 
        text.setText("Hello JavaFX !");
         
        //Creating a line object 
        Line line = new Line();
        //Setting the properties to a line 
        line.setStartX(100.0); 
        line.setStartY(150.0); 
        line.setEndX(500.0); 
        line.setEndY(150.0);
        //Creating a Group 
        Group root = new Group(line);
        //Retrieving the observable list object (for text)
        ObservableList list = root.getChildren();
         //Setting the text object as a node to the group object 
         list.add(text);
        //Creating a Scene 
        Scene scene = new Scene(root, 600, 300);
        //Setting title to the scene 
        primaryStage.setTitle("Sample Application");
        //Adding the scene to the stage 
        primaryStage.setScene(scene);
         //Displaying the contents of a scene 
        primaryStage.show();
    }
    public static void main(String[] args) 
    {
        launch(args);
    }
}
