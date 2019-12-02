import javafx.fxml.FXML;

import javafx.scene.control.Label;

public class Controller{
    private int a32BitInt = 2147483647;

    @FXML
    private Label thisIsA32BitInt;

    @FXML
    private void initialize(){
        thisIsA32BitInt.setText("The max positive number in a 32-bit integer is: " + a32BitInt);
    }
}