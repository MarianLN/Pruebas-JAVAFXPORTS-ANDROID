package hidralab.hidrasmartcm_app_2;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafxports.android.FXActivity;

/**
 * Created by johan on 12/3/14.
 */
public class MyFxApp extends Application {

    @Override
    public void start (Stage stage) throws Exception {
        final Button b = new Button("Click JavaFX");
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                b.setText("Clicked");
                FXActivity fxActivityInstance = FXActivity.getInstance();
                if(fxActivityInstance!= null) {
                    try {
                        Intent smsIntent = new Intent(FXActivity.getInstance(), MapaGoogleActivity.class);
                        FXActivity.getInstance().startActivity(smsIntent);

                    }catch(Exception e){
                        System.out.println("ERRORRRRRR: " + e.toString());
                    }
                }
            }
        });
        Screen primaryScreen = Screen.getPrimary();
        Rectangle2D visualBounds = primaryScreen.getVisualBounds();
        double width = visualBounds.getWidth();
        double height = visualBounds.getHeight();
        VBox box = new VBox(10, b, new TextField());
        box.setAlignment(Pos.CENTER);
        Scene s = new Scene(box, width, height);
        stage.setScene(s);
        stage.show();
    }
}
