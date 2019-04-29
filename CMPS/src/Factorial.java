import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Factorial extends Application{
	public static void main(String[] args) {
		launch();
	}
	
	public void start(Stage primaryStage) {
		GridPane root = new GridPane();
		root.setHgap(10); //horizontal gap in pixels => that's what you are asking for
		root.setVgap(10); //vertical gap in pixels
		root.setPadding(new Insets(10, 10, 10, 10));
		Scene primaryScene = new Scene(root,300,75);
		TextField input = new TextField();
		input.prefWidthProperty().bind((root.widthProperty().subtract(20)).divide(3));
		Button button = new Button("Factorialize:");
		button.prefWidthProperty().bind((root.widthProperty().subtract(20)).divide(3));
		Label label = new Label("");
		label.prefWidthProperty().bind((root.widthProperty().subtract(20)).divide(3));
		root.add(input, 1, 1);
		root.add(button, 2, 1);
		root.add(label, 3, 1);
		
		button.setOnAction(e ->{
			label.setText(getLargest(input.getText().split(" "),0));
		});
		
		primaryStage.setScene(primaryScene);
		primaryStage.show();
	}
		
	public static String getLargest(String[] array, int point) {
			//Integer.parseInt(array[point]) > Integer.parseInt(getLargest(array, point+1))){
				return array[point];
	}
}
