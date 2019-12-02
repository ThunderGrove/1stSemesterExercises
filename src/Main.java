import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root,800,600));
        primaryStage.show();
    }

    //If JavaFX is installed with AUR on Arch Linux the below main can not be used to start the program.
    //To start the program the below main have to be called from a main in a different class.
    public static void main(String[] args){launch(args);}
}