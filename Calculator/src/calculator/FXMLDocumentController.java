package calculator;

import com.sun.javafx.embed.AbstractEvents;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.WindowEvent;

public class FXMLDocumentController implements Initializable 
{
    @FXML
    private TextField txtDisplay;
    private int decimalClick = 0;
    private String generalOperationObject;
    private Double firstDouble;
//    Button equalButton = new Button("=");
    @FXML
    private void handlerGeneralAction(ActionEvent event)
    {
        generalOperationObject = ((Button)event.getSource()).getText();
        try
        {
            switch(generalOperationObject)
            {
                case "AC":
                    txtDisplay.setText("");
                    decimalClick = 0;
                    break;
                case "+/-":
                    double plusMinus = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                    plusMinus = plusMinus * (-1);
                    txtDisplay.setText(String.valueOf(plusMinus));
                    break;
                case "%":
                    double percentage = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                    percentage = (firstDouble * 100) / percentage;
                    txtDisplay.setText(String.valueOf(percentage));
                    break;
                case "√":
                    double firstNumber = Double.parseDouble(String.valueOf(txtDisplay.getText()));  
                    firstNumber = Math.sqrt(firstNumber);
                    txtDisplay.setText(String.valueOf(firstNumber));
                    break;
                case "+":
                case "-":
                case "x":
                case "÷":
                    String currentText = txtDisplay.getText();
                    firstDouble = Double.parseDouble(currentText);
                    txtDisplay.setText("");
                    decimalClick = 0;
                    break;
                default:
            }
        }
        catch(NumberFormatException e)
        {
            
        }
    }
    @FXML
    // needs correction for positioning
    private void handlerDigitAction(ActionEvent event)
    {
        String digitObject = ((Button)event.getSource()).getText();
        String oldText = txtDisplay.getText();
        String newText = oldText + digitObject;
        txtDisplay.setText(newText);
    }
    @FXML
    // needs correction for positioning
    private void handlerDecimalAction(ActionEvent event)
    {
        if(decimalClick == 0)
        {
            String DecimalObject = txtDisplay.getText() + ((Button)event.getSource()).getText();
            //String oldText = txtDisplay.getText();
            //String newText = oldText + DecimalObject;
            txtDisplay.setText(DecimalObject);
            decimalClick = 1;
        }
    }
    @FXML
    private void handlerEqualAction(ActionEvent event)
    {
        try
        {
            double secondDouble;
            double result = 0;
            String secondText = txtDisplay.getText();
            secondDouble = Double.parseDouble(secondText);
        
            switch(generalOperationObject){
                case "+":
                    result = firstDouble + secondDouble;
                    break;
                case "-":
                    result = firstDouble - secondDouble;
                    break; 
                case "x":
                    result = firstDouble * secondDouble;
                    break;
                case "÷":
                    result = firstDouble / secondDouble;
                    break; 
                default:
            }
//            equalButton.setOnAction(new EventHandler<ActionEvent>()
//            {
//                @Override
//                public void handle(ActionEvent arg0) {
//                    txtDisplay.setText("");
//                }
//
//            });
            String format = String.format("%.1f", result);
            txtDisplay.setText(format);
        }
        catch(NumberFormatException e)
        {
            
        }
    }
    @FXML
    private void exitButton(ActionEvent event)
    {
        System.exit(0);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
    }    
}