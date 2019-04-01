package tilepanelayout;

import javafx.application.Application; 
import javafx.collections.ObservableList; 
import javafx.geometry.Orientation; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.TilePane; 
import javafx.stage.Stage;

public class TilePaneLayout extends Application 
{
    @Override
    public void start(Stage stage) 
    {
        //Creating an array of Buttons 
        Button[] button = new Button[]{
            new Button("Sunday"), 
            new Button("Monday"), 
            new Button("Tuesday"), 
            new Button("Wednesday"), 
            new Button("Thursday"), 
            new Button("Friday"), 
            new Button("Saturday")
        };
        //Creating a Tile Pane
        TilePane tilePane = new TilePane();   
        //Setting the orientation for the Tile Pane 
        tilePane.setOrientation(Orientation.HORIZONTAL);
        //Setting the alignment for the Tile Pane 
        tilePane.setAlignment(Pos.CENTER_LEFT);
        //Setting the preferred columns for the Tile Pane 
        tilePane.setPrefRows(4);
        //Retrieving the observable list of the Tile Pane 
        ObservableList list = tilePane.getChildren();
        //Adding the array of buttons to the pane 
        list.addAll(button);
        
        //Creating a scene object 
        Scene scene = new Scene(tilePane);  
      
        //Setting title to the Stage 
        stage.setTitle("Tile Pane Example"); 
         
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
