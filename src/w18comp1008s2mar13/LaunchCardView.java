package w18comp1008s2mar13;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author JWright
 */
public class LaunchCardView extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent parent = FXMLLoader.load(getClass().getResource("CardView.fxml"));
        Scene scene = new Scene(parent);
        
        primaryStage.setTitle("Card View Tool");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
