package hboxlayout;

import javafx.application.Application; 
import javafx.collections.ObservableList; 
import javafx.geometry.Insets; 
import javafx.scene.Scene;
import javafx.scene.control.Button; 
import javafx.scene.control.TextField; 
import javafx.stage.Stage; 
import javafx.scene.layout.HBox;

public class HBoxLayout extends Application
{
    @Override
    public void start(Stage stage) 
    {
        //creating a text field
        TextField textField = new TextField();
        //Creating the play button 
        Button playButton = new Button("Play");
        //Creating the stop button 
        Button stopButton = new Button("Stop");
        //Instantiating the HBox class  
        HBox hbox = new HBox();
        //Setting the space between the nodes of a HBox pane 
        hbox.setSpacing(10);
        //Setting the margin to the nodes 
        hbox.setMargin(textField, new Insets(20, 20, 20, 20)); 
        hbox.setMargin(playButton, new Insets(20, 20, 20, 20)); 
        hbox.setMargin(stopButton, new Insets(20, 20, 20, 20));  
        //retrieving the observable list of the HBox 
        ObservableList list = hbox.getChildren();
        //Adding all the nodes to the observable list (HBox) 
        list.addAll(textField, playButton, stopButton);
        
        //Creating a scene object
        Scene scene = new Scene(hbox);  
      
        //Setting title to the Stage 
        stage.setTitle("Hbox Example"); 
         
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
