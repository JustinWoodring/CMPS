import javafx.application.*;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.*;
import javafx.scene.image.ImageView;
import javafx.animation.*;

public class BouncyBall extends Application {

	public void start(Stage primaryStage) {
		BallPane root = new BallPane();
		Scene primaryScene = new Scene(root,250,150);
		
		
		primaryStage.setTitle("BouncyBall");
		primaryStage.setScene(primaryScene);
		primaryStage.show();
		primaryStage.setFullScreen(true);
		root.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
		root.requestFocus();
		primaryScene.setCursor(Cursor.NONE);
	}
	
	public static void main(String[] args) {
		launch();
	}

}

class BallPane extends Pane{
	private double radius = 25;
	private double x = radius;
	private double y = radius;
	private double dx = 1;
	private double dy = 1;
	
	private Circle circle = new Circle(x,y, radius);
	private Timeline animation;
	
	public BallPane() {
		//circle.setFill(Color.ORANGE);
		getChildren().add(circle);
		animation = new Timeline(new KeyFrame(Duration.millis(5),e-> moveBall())); 
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
	}

	protected void moveBall() {
		if (x < radius || x > getWidth()-radius) {
			dx *= -1;
		}
		if (y < radius || y > getHeight()-radius) {
			dy *= -1;
		}
		
		x += dx;
		y += dy;
		circle.setCenterX(x);
		circle.setCenterY(y);
	}
	
	
}
