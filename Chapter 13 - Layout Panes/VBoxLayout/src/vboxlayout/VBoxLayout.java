package vboxlayout;

import javafx.application.Application; 
import javafx.collections.ObservableList; 
import javafx.geometry.Insets; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.TextField; 
import javafx.stage.Stage; 
import javafx.scene.layout.VBox; 

public class VBoxLayout extends Application {
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
        VBox vbox = new VBox();
        //Setting the space between the nodes of a HBox pane 
        vbox.setSpacing(10);
        //Setting the margin to the nodes 
        vbox.setMargin(textField, new Insets(20, 20, 20, 20)); 
        vbox.setMargin(playButton, new Insets(20, 20, 20, 20)); 
        vbox.setMargin(stopButton, new Insets(20, 20, 20, 20));  
        //retrieving the observable list of the HBox 
        ObservableList list = vbox.getChildren();
        //Adding all the nodes to the observable list (HBox) 
        list.addAll(textField, playButton, stopButton);
        
        //Creating a scene object
        Scene scene = new Scene(vbox);  
      
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
