package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label dateLabel = new Label("Selecciona una fecha:");
        DatePicker datePicker = new DatePicker();
        
        Label colorLabel = new Label("Selecciona un color:");
        ColorPicker colorPicker = new ColorPicker();
        
        Button confirmButton = new Button("Confirmar Selección");
       
        confirmButton.setOnAction(event -> {
            System.out.println("Fecha seleccionada: " + datePicker.getValue());
            System.out.println("Color seleccionado: " + colorPicker.getValue());
        });
        
        VBox vbox = new VBox(10, dateLabel, datePicker, colorLabel, colorPicker, confirmButton);
        
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("DatePicker y ColorPicker Demo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
