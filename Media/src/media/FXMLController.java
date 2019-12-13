
package media;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author MSI 7RD
 */
public class FXMLController implements Initializable 
{
    @FXML
    private Label label;
    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        System.out.println("You click me!");
        label.setText("Hello");
        
    }
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    
    
}
