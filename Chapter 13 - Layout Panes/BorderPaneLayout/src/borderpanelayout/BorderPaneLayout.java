package borderpanelayout;

import javafx.application.Application; 
import javafx.collections.ObservableList; 
import javafx.scene.Scene; 
import javafx.scene.control.TextField; 
import javafx.scene.layout.BorderPane; 
import javafx.stage.Stage;

public class BorderPaneLayout extends Application 
{
    @Override
    public void start(Stage stage) 
    {
        //Instantiating the BorderPane class  
        BorderPane borderPane = new BorderPane();
        //Setting the top, bottom, center, right and left nodes to the pane 
        borderPane.setTop(new TextField("Top"));
        borderPane.setBottom(new TextField("Bottom")); 
        borderPane.setLeft(new TextField("Left")); 
        borderPane.setRight(new TextField("Right")); 
        borderPane.setCenter(new TextField("Center")); 
        
        //Creating a scene object 
        Scene scene = new Scene(borderPane);  
      
        //Setting title to the Stage
        stage.setTitle("BorderPane Example"); 
         
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
