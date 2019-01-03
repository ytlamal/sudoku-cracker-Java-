package sudokucracker.ex1;
import java.lang.reflect.InvocationTargetException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UIApplication extends Application {
	private static final String UI_FILE = "/ui.fxml";
	@Override
	public void start(Stage stage){
    	
		try {FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource(UI_FILE));
   		VBox root = (VBox) loader.load();
   		Scene scene =  new Scene(root);
   		stage.setScene(scene);
   		stage.setTitle("cracker");
   		stage.show();
		}
//		catch (InvocationTargetException e) {
//
//		    // Answer:
//		    e.getCause().printStackTrace();
//		}
		catch (Exception e) {

		    // generic exception handling
		    e.printStackTrace();
		}
	}
	public static void main (String args[]) {
		Application.launch(args);

	}
//	public static void run(String arg[]) {
//		Application.launch(arg);
//	}
}
