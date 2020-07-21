package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {

	//acessa um stage do botao que eu aperta
	public static Stage currentStage(ActionEvent event) {
		return(Stage) ((Node) event.getSource()).getScene().getWindow();
	}
	
	
	
}
