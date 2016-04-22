package clicker228;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
	@FXML Label lbl;
	int i;
	
	public void enter(ActionEvent evt){
	   i++;
	
	lbl.setText(""+i); 
	}
	public void enter2(ActionEvent evt){
		   i++;
		System.out.println(i); 
		
	}

}
