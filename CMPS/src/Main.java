import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Main extends Application{

	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		Scene primaryScene = new Scene(root,300,200);
		primaryStage.setTitle("Loans");
		
		VBox main = new VBox();
		main.setSpacing(5);
		root.setPadding(new Insets(20));
		root.setCenter(main);
		
		HBox row1 = new HBox();
		row1.prefWidthProperty().bind(main.widthProperty());
		HBox row2 = new HBox();
		row2.prefWidthProperty().bind(main.widthProperty());
		HBox row3 = new HBox();
		row3.prefWidthProperty().bind(main.widthProperty());
		HBox row4 = new HBox();
		row4.prefWidthProperty().bind(main.widthProperty());
		HBox row5 = new HBox();
		row5.prefWidthProperty().bind(main.widthProperty());
		HBox row6 = new HBox();
		row6.prefWidthProperty().bind(main.widthProperty());
		
		main.getChildren().add(row1);
		main.getChildren().add(row2);
		main.getChildren().add(row3);
		main.getChildren().add(row4);
		main.getChildren().add(row5);
		main.getChildren().add(row6);
		
		Label label1 = new Label("Interest Rate:");
		label1.prefWidthProperty().bind(row1.widthProperty().divide(2));
		row1.getChildren().add(label1);
		Label label2 = new Label("Initial Loan:");
		label2.prefWidthProperty().bind(row2.widthProperty().divide(2));
		row2.getChildren().add(label2);
		Label label3 = new Label("Number of Years:");
		label3.prefWidthProperty().bind(row3.widthProperty().divide(2));
		row3.getChildren().add(label3);
		Label label4 = new Label("Monthly Total:");
		label4.prefWidthProperty().bind(row4.widthProperty().divide(2));
		row4.getChildren().add(label4);
		Label label5 = new Label("Total Amount:");
		label5.prefWidthProperty().bind(row5.widthProperty().divide(2));
		row5.getChildren().add(label5);
		Label label6 = new Label("");
		label6.prefWidthProperty().bind(row6.widthProperty().divide(2));
		row6.getChildren().add(label6);
		
		TextField text1 = new TextField();
		text1.setAlignment(Pos.BOTTOM_RIGHT);
		text1.prefWidthProperty().bind(row1.widthProperty().divide(2));
		row1.getChildren().add(text1);
		TextField text2 = new TextField();
		text2.setAlignment(Pos.BOTTOM_RIGHT);
		text2.prefWidthProperty().bind(row2.widthProperty().divide(2));
		row2.getChildren().add(text2);
		TextField text3 = new TextField();
		text3.setAlignment(Pos.BOTTOM_RIGHT);
		text3.prefWidthProperty().bind(row3.widthProperty().divide(2));
		row3.getChildren().add(text3);
		TextField text4 = new TextField();
		text4.setAlignment(Pos.BOTTOM_RIGHT);
		text4.prefWidthProperty().bind(row4.widthProperty().divide(2));
		row4.getChildren().add(text4);
		TextField text5 = new TextField();
		text5.setAlignment(Pos.BOTTOM_RIGHT);
		text5.prefWidthProperty().bind(row5.widthProperty().divide(2));
		row5.getChildren().add(text5);
		Button button1 = new Button("Calculate");
		button1.prefWidthProperty().bind(row6.widthProperty().divide(2));
		row6.getChildren().add(button1);
		
		
		primaryStage.setScene(primaryScene);
		primaryStage.show();
		primaryStage.setResizable(false);
		
		button1.setOnAction(e -> {
			double interest = Double.parseDouble(text1.getText())/1200;
			double amount = Double.parseDouble(text2.getText());
			double time = Integer.parseInt(text3.getText())*12;
			double totalAmount = 0;
			double monthlyAmount = amount * ((interest*Math.pow((1+interest),time))/(Math.pow((1+interest),time)-1));
			totalAmount = monthlyAmount * time;
			text4.setText(String.format("$%.2f", monthlyAmount));
			text5.setText(String.format("$%.2f", totalAmount));
		});
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
