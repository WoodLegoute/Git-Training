package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class helloController {

    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    void btnclicked(ActionEvent event) {
    	
    	//when button is clicked, label will display hello world
    	label.setText("Hello World");

    }

    @FXML
    void ddd7d7(ActionEvent event) {

    }

}
