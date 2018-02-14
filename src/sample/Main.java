
package sample;

        import javafx.application.Application;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;

        import javafx.scene.layout.StackPane;
        import javafx.stage.Stage;
        import javafx.scene.control.Button;

public class Main extends Application  {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
       // button = new Button("Click me");
         button = new Button();
         button.setText("Click me");
         button.setOnAction(e -> System.out.println("Hey now brown cow"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        primaryStage.setScene(new Scene(layout, 300, 300));
        primaryStage.show();
    }

    /*@Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button) {
            System.out.println("Ooooooo i Love it when u touch me there....");

        }

    }  */
}

