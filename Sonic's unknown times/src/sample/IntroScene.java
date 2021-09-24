package sample;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

public class IntroScene implements Initializable {

    MediaPlayer mediaPlayer;
    public void music(){
        String s="C:\\Users\\User\\IdeaProjects\\Sonic's unknown times\\src\\assets\\music\\Intro_Music.mp3";
        Media media=new Media(Paths.get(s).toUri().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setVolume(0.5);
        mediaPlayer.play();
    }

    @FXML
    private ImageView OneIntroText, TwoIntroText;
    @FXML
    private AnchorPane AnchorPane;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       OneIntroText.setOpacity(0);
       TwoIntroText.setOpacity(0);
        FadeTransition ft = new FadeTransition(Duration.seconds(1), OneIntroText);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.setDelay(Duration.millis(500));
        ft.setOnFinished((ActionEvent e)->{
            music();
        });
        ft.play();
        FadeTransition ft1 = new FadeTransition(Duration.seconds(1), TwoIntroText);
        ft1.setFromValue(0);
        ft1.setToValue(1);
        ft1.setDelay(Duration.millis(1500));
        ft1.play();
        FadeTransition ft2 = new FadeTransition(Duration.seconds(1), OneIntroText);
        ft2.setFromValue(1);
        ft2.setToValue(0);
        ft2.setDelay(Duration.millis(5000));
        ft2.play();
        FadeTransition ft3 = new FadeTransition(Duration.seconds(1), TwoIntroText);
        ft3.setFromValue(1);
        ft3.setToValue(0);
        ft3.setDelay(Duration.millis(5000));
        ft3.setOnFinished((ActionEvent e) -> {
            try {
                loadNextScene();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        ft3.play();
    }


    private void loadNextScene() throws IOException {
            Parent SecondView;
            SecondView = (AnchorPane) FXMLLoader.load(getClass().getResource("Main_Menu_Scene.fxml"));

            Scene SecondScene = new Scene(SecondView);
            Stage curStage = (Stage) AnchorPane.getScene().getWindow();
            curStage.setScene(SecondScene);
    }
}
