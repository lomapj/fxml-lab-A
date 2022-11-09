package pat.labA;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;

public class PrimaryController {
    @FXML
    private Text actiontarget;

    @FXML
    protected void signin(ActionEvent event) throws IOException{
        actiontarget.setText("Sign in button pressed");
    }
}
