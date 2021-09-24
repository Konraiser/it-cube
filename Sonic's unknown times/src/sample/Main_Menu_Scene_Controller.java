package sample;

import com.jfoenix.controls.JFXButton;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

public class Main_Menu_Scene_Controller implements Initializable {

    MediaPlayer mediaPlayer;
    MediaPlayer SFXPlayer;
    MediaPlayer SFXPlayer2;
    MediaPlayer SFXPlayer3;
    public void music() {
        String s ="C:\\Users\\User\\IdeaProjects\\Sonic's unknown times\\src\\assets\\music\\12 - Ending Theme.wav";
        Media media = new Media(Paths.get(s).toUri().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setOnEndOfMedia(() ->{
            music();
        });
        mediaPlayer.play();
    }

    public void SFX() {
        String s = "C:\\Users\\User\\IdeaProjects\\Sonic's unknown times\\src\\assets\\music\\bumper.mp3";
        Media media = new Media(Paths.get(s).toUri().toString());
        SFXPlayer = new MediaPlayer(media);
        SFXPlayer.setVolume(0.5);
        SFXPlayer.play();
    }

    public void SFX2() {
        String s = "C:\\Users\\User\\IdeaProjects\\Sonic's unknown times\\src\\assets\\music\\warp-2.mp3";
        Media media = new Media(Paths.get(s).toUri().toString());
        SFXPlayer2 = new MediaPlayer(media);
        SFXPlayer2.setVolume(0.5);
        SFXPlayer2.play();
    }

    public void SFX3() {
        String s = "C:\\Users\\User\\IdeaProjects\\Sonic's unknown times\\src\\assets\\music\\Error.mp3";
        Media media = new Media(Paths.get(s).toUri().toString());
        SFXPlayer3 = new MediaPlayer(media);
        SFXPlayer3.setVolume(0.5);
        SFXPlayer3.play();
    }

    @FXML
    private JFXButton New_Game_B, Continue_B, Tutorial_B, Settings_B, Quit_B, Main_Menu_B, Set_Theme_B, Volume_B, Exit_B;
    @FXML
    private Rectangle BetweenScenes, OneRect, TwoRect, ThreeRect, FourRect, FiveRect;
    @FXML
    private ImageView GHImage_M_M,M_M_Logo;
    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private Slider MusicSlider;
    @FXML
    private Label  MusicLabel;

    public void New_Game_B_Act(ActionEvent event) {
        SFX3();
    }

    public void Continue_B_Act(ActionEvent event) {
        SFX3();
    }

    public void Tutorial_B_Act(ActionEvent event) {
        SFX3();
    }

    public void Settings_B_Act(ActionEvent event) {
        New_Game_B.setDisable(true);
        Continue_B.setDisable(true);
        Tutorial_B.setDisable(true);
        Settings_B.setDisable(true);
        Quit_B.setDisable(true);
        TranslateTransition tt = new TranslateTransition(Duration.seconds(1), New_Game_B);
        tt.setCycleCount(0);
        tt.setAutoReverse(false);
        tt.setToX(-200);
        tt.setDelay(Duration.millis(50));
        tt.play();
        TranslateTransition tt1 = new TranslateTransition(Duration.seconds(1), Continue_B);
        tt1.setCycleCount(0);
        tt1.setAutoReverse(false);
        tt1.setToX(-200);
        tt1.setDelay(Duration.millis(200));
        tt1.play();
        TranslateTransition tt2 = new TranslateTransition(Duration.seconds(1), Tutorial_B);
        tt2.setCycleCount(0);
        tt2.setAutoReverse(false);
        tt2.setToX(-200);
        tt2.setDelay(Duration.millis(400));
        tt2.play();
        TranslateTransition tt3 = new TranslateTransition(Duration.seconds(1), Settings_B);
        tt3.setCycleCount(0);
        tt3.setAutoReverse(false);
        tt3.setToX(-200);
        tt3.setDelay(Duration.millis(600));
        tt3.play();
        TranslateTransition tt4 = new TranslateTransition(Duration.seconds(1), Quit_B);
        tt4.setCycleCount(0);
        tt4.setAutoReverse(false);
        tt4.setToX(-200);
        tt4.setDelay(Duration.millis(800));
        tt4.play();
        TranslateTransition tt5 = new TranslateTransition(Duration.seconds(1), Main_Menu_B);
        tt5.setCycleCount(0);
        tt5.setAutoReverse(false);
        tt5.setToX(200);
        tt5.setDelay(Duration.seconds(1));
        tt5.setOnFinished((ActionEvent e) -> {
            Main_Menu_B.setDisable(false);
        });
        tt5.play();
        TranslateTransition tt6 = new TranslateTransition(Duration.seconds(1), Set_Theme_B);
        tt6.setCycleCount(0);
        tt6.setAutoReverse(false);
        tt6.setToX(200);
        tt6.setDelay(Duration.seconds(1));
        tt6.setOnFinished((ActionEvent e) -> {
           Set_Theme_B.setDisable(false);
        });
        tt6.play();
        TranslateTransition tt7 = new TranslateTransition(Duration.seconds(1), Volume_B);
        tt7.setCycleCount(0);
        tt7.setAutoReverse(false);
        tt7.setToX(200);
        tt7.setDelay(Duration.seconds(1));
        tt7.setOnFinished((ActionEvent e) -> {
            Volume_B.setDisable(false);
        });
        tt7.play();
        SFX2();
    }

    public void Quit_B_Act(ActionEvent event) {
        System.exit(0);
    }

    public void New_Game_B_M(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), New_Game_B);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(10);
        tt.play();
        SFX();
    }

    public void New_Game_B_MF(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), New_Game_B);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(0);
        tt.play();

    }

    public void Continue_B_M(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), Continue_B);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(10);
        tt.play();
        SFX();
    }

    public void Continue_B_MF(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), Continue_B);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(0);
        tt.play();

    }

    public void Tutorial_B_M(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), Tutorial_B);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(10);
        tt.play();
        SFX();
    }

    public void Tutorial_B_MF(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), Tutorial_B);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(0);
        tt.play();

    }

    public void Settings_B_M(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), Settings_B);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(10);
        tt.play();
        SFX();
    }

    public void Settings_B_MF(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), Settings_B);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(0);
        tt.play();

    }

    public void Quit_B_M(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), Quit_B);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(10);
        tt.play();
        SFX();
    }

    public void Quit_B_MF(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), Quit_B);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(0);
        tt.play();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        OpenScene();
        Main_Menu_B.setDisable(true);
        Set_Theme_B.setDisable(true);
        Volume_B.setDisable(true);
        Exit_B.setDisable(true);
        MusicSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                mediaPlayer.setVolume(MusicSlider.getValue() * 0.01);
            }
        });
       }

    private void OpenScene() {
        FadeTransition ft = new FadeTransition(Duration.millis(800), BetweenScenes);
        ft.setToValue(0);
        ft.setOnFinished((ActionEvent e)->{
            music();
        });
        ft.play();
        TranslateTransition tt = new TranslateTransition(Duration.millis(200), OneRect);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(0);
        tt.setInterpolator(Interpolator.EASE_OUT);
        tt.setDelay(Duration.millis(800));
        tt.play();
        TranslateTransition tt1 = new TranslateTransition(Duration.millis(200), TwoRect);
        tt1.setAutoReverse(false);
        tt1.setCycleCount(0);
        tt1.setToY(0);
        tt1.setInterpolator(Interpolator.EASE_OUT);
        tt1.setDelay(Duration.millis(2300));
        tt1.play();
        TranslateTransition tt2 = new TranslateTransition(Duration.millis(200), ThreeRect);
        tt2.setAutoReverse(false);
        tt2.setCycleCount(0);
        tt2.setToX(0);
        tt2.setInterpolator(Interpolator.EASE_OUT);
        tt2.setDelay(Duration.millis(1800));
        tt2.play();
        TranslateTransition tt3 = new TranslateTransition(Duration.millis(200), FourRect);
        tt3.setAutoReverse(false);
        tt3.setCycleCount(0);
        tt3.setToY(0);
        tt3.setInterpolator(Interpolator.EASE_OUT);
        tt3.setDelay(Duration.millis(1300));
        tt3.play();
        FadeTransition ft1 = new FadeTransition(Duration.millis(1), FiveRect);
        ft1.setFromValue(0);
        ft1.setToValue(1);
        ft1.setAutoReverse(false);
        ft1.setCycleCount(0);
        ft1.setDelay(Duration.millis(2900));
        ft1.setOnFinished((ActionEvent e)->{
            TranslateTransition tt4 = new TranslateTransition(Duration.millis(1), New_Game_B);
            tt4.setCycleCount(0);
            tt4.setAutoReverse(false);
            tt4.setToX(0);
            tt4.play();
            TranslateTransition tt5 = new TranslateTransition(Duration.millis(1), Continue_B);
            tt5.setCycleCount(0);
            tt5.setAutoReverse(false);
            tt5.setToX(0);
            tt5.play();
            TranslateTransition tt6 = new TranslateTransition(Duration.millis(1), Tutorial_B);
            tt6.setCycleCount(0);
            tt6.setAutoReverse(false);
            tt6.setToX(0);
            tt6.play();
            TranslateTransition tt7 = new TranslateTransition(Duration.millis(1), Settings_B);
            tt7.setCycleCount(0);
            tt7.setAutoReverse(false);
            tt7.setToX(0);
            tt7.play();
            TranslateTransition tt8 = new TranslateTransition(Duration.millis(1), Quit_B);
            tt8.setCycleCount(0);
            tt8.setAutoReverse(false);
            tt8.setToX(0);
            tt8.play();
            FadeTransition ft2 = new FadeTransition(Duration.millis(1), GHImage_M_M);
            ft2.setToValue(1);
            ft2.play();
            FadeTransition ft3 = new FadeTransition(Duration.millis(1), M_M_Logo);
            ft3.setToValue(1);
            ft3.play();
            TranslateTransition tt9 = new TranslateTransition(Duration.seconds(5), GHImage_M_M);
            tt9.setByX(100);
            tt9.setCycleCount(Animation.INDEFINITE);
            tt9.setAutoReverse(true);
            tt9.play();
        });
        ft1.play();
        FadeTransition ft2 = new FadeTransition(Duration.millis(1000), FiveRect);
        ft2.setFromValue(1);
        ft2.setToValue(0);
        ft2.setAutoReverse(false);
        ft2.setCycleCount(0);
        ft2.setDelay(Duration.millis(2905));
        ft2.play();

    }

    public void Main_Menu_B_Act(ActionEvent event) {
        TranslateTransition tt = new TranslateTransition(Duration.seconds(1), New_Game_B);
        tt.setCycleCount(0);
        tt.setAutoReverse(false);
        tt.setToX(0);
        tt.setDelay(Duration.millis(50));
        tt.setOnFinished((ActionEvent e) -> {
            New_Game_B.setDisable(false);
        });
        tt.play();
        TranslateTransition tt1 = new TranslateTransition(Duration.seconds(1), Continue_B);
        tt1.setCycleCount(0);
        tt1.setAutoReverse(false);
        tt1.setToX(0);
        tt1.setDelay(Duration.millis(200));
        tt1.setOnFinished((ActionEvent e) -> {
            Continue_B.setDisable(false);
        });
        tt1.play();
        TranslateTransition tt2 = new TranslateTransition(Duration.seconds(1), Tutorial_B);
        tt2.setCycleCount(0);
        tt2.setAutoReverse(false);
        tt2.setToX(0);
        tt2.setDelay(Duration.millis(400));
        tt2.setOnFinished((ActionEvent e) -> {
            Tutorial_B.setDisable(false);
        });
        tt2.play();
        TranslateTransition tt3 = new TranslateTransition(Duration.seconds(1), Settings_B);
        tt3.setCycleCount(0);
        tt3.setAutoReverse(false);
        tt3.setToX(0);
        tt3.setDelay(Duration.millis(600));
        tt3.setOnFinished((ActionEvent e) -> {
            Settings_B.setDisable(false);
        });
        tt3.play();
        TranslateTransition tt4 = new TranslateTransition(Duration.seconds(1), Quit_B);
        tt4.setCycleCount(0);
        tt4.setAutoReverse(false);
        tt4.setToX(0);
        tt4.setDelay(Duration.millis(800));
        tt4.setOnFinished((ActionEvent e) -> {
            Quit_B.setDisable(false);
        });
        tt4.play();
        TranslateTransition tt5 = new TranslateTransition(Duration.seconds(1), Main_Menu_B);
        tt5.setCycleCount(0);
        tt5.setAutoReverse(false);
        tt5.setToX(0);
        tt5.setDelay(Duration.millis(250));
        tt5.play();
        Main_Menu_B.setDisable(true);
        TranslateTransition tt6 = new TranslateTransition(Duration.seconds(1), Set_Theme_B);
        tt6.setCycleCount(0);
        tt6.setAutoReverse(false);
        tt6.setToX(0);
        tt6.setDelay(Duration.millis(50));
        tt6.play();
        Set_Theme_B.setDisable(true);
        TranslateTransition tt7 = new TranslateTransition(Duration.seconds(1), Volume_B);
        tt7.setCycleCount(0);
        tt7.setAutoReverse(false);
        tt7.setToX(0);
        tt7.setDelay(Duration.millis(50));
        tt7.play();
        Volume_B.setDisable(true);
        SFX2();
    }

    public void Main_Menu_B_M(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), Main_Menu_B);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(210);
        tt.play();
        SFX();
    }

    public void Main_Menu_B_MF(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), Main_Menu_B);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(200);
        tt.play();
    }

    public void New_Game_B_MPr(MouseEvent mouseEvent) {
        New_Game_B.setTextFill(Color.YELLOW);
    }

    public void New_Game_B_MRe(MouseEvent mouseEvent) {
        New_Game_B.setTextFill(Color.WHITE);
    }

    public void Continue_B_MPr(MouseEvent mouseEvent) {
        Continue_B.setTextFill(Color.YELLOW);
    }

    public void Continue_B_MRe(MouseEvent mouseEvent) {
        Continue_B.setTextFill(Color.WHITE);
    }

    public void Tutorial_B_MPr(MouseEvent mouseEvent) {
        Tutorial_B.setTextFill(Color.YELLOW);
    }

    public void Tutorial_B_MRe(MouseEvent mouseEvent) {
       Tutorial_B.setTextFill(Color.WHITE);
    }

    public void Settings_B_MPr(MouseEvent mouseEvent) {
        Settings_B.setTextFill(Color.YELLOW);
    }

    public void Settings_B_MRe(MouseEvent mouseEvent) {
        Settings_B.setTextFill(Color.WHITE);
    }

    public void Quit_B_MPr(MouseEvent mouseEvent) {
        Quit_B.setTextFill(Color.YELLOW);
    }

    public void Quit_B_MRe(MouseEvent mouseEvent) {
        Quit_B.setTextFill(Color.WHITE);
    }

    public void Main_Menu_B_MPr(MouseEvent mouseEvent) {
        Main_Menu_B.setTextFill(Color.YELLOW);
    }

    public void Main_Menu_B_MRe(MouseEvent mouseEvent) {
        Main_Menu_B.setTextFill(Color.WHITE);
    }

    public void Set_Theme_B_Act(ActionEvent event) {
//        Set_Theme_B.setDisable(true);
//        Main_Menu_B.setDisable(true);
        SFX3();
//        mediaPlayer.pause();
//        TranslateTransition tt = new TranslateTransition(Duration.seconds(1), Set_Theme_B);
//        tt.setAutoReverse(false);
//        tt.setCycleCount(0);
//        tt.setToX(0);
//        tt.play();
//        TranslateTransition tt1 = new TranslateTransition(Duration.seconds(1), Main_Menu_B);
//        tt1.setAutoReverse(false);
//        tt1.setCycleCount(0);
//        tt1.setToX(0);
//        tt1.setOnFinished((ActionEvent e)->{
//            FadeTransition ft = new FadeTransition(Duration.millis(800), BetweenScenes);
//            ft.setToValue(1);
////            ft.setOnFinished((ActionEvent Ae)->{
////                try {
////                    loadNextScene();
////                } catch (IOException ioException) {
////                    ioException.printStackTrace();
////                }
////            });
//            ft.setCycleCount(0);
//            ft.setAutoReverse(false);
//            ft.play();
//        });
//        tt1.play();
    }

//    private void loadNextScene() throws IOException {
//        Parent SecondView;
//        SecondView = (AnchorPane) FXMLLoader.load(getClass().getResource("Set_Theme_Scene.fxml"));
//
//        Scene SecondScene = new Scene(SecondView);
//        Stage curStage = (Stage) AnchorPane.getScene().getWindow();
//        curStage.setScene(SecondScene);
//    }

    public void Set_Theme_B_M(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), Set_Theme_B);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(210);
        tt.play();
        SFX();
    }

    public void Set_Theme_B_MF(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), Set_Theme_B);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(200);
        tt.play();
    }

    public void Set_Theme_B_MPr(MouseEvent mouseEvent) {
        Set_Theme_B.setTextFill(Color.YELLOW);
    }

    public void Set_Theme_B_MRe(MouseEvent mouseEvent) {
        Set_Theme_B.setTextFill(Color.WHITE);
    }

    public void Volume_B_Act(ActionEvent event) {
      FadeTransition ft = new FadeTransition(Duration.millis(200), MusicLabel);
      ft.setToValue(1);
      ft.play();
      FadeTransition ft1 = new FadeTransition(Duration.millis(200), MusicSlider);
      ft1.setToValue(1);
      ft1.play();
      FadeTransition ft2 = new FadeTransition(Duration.millis(200), Exit_B);
      ft2.setToValue(1);
      ft2.play();
      Volume_B.setDisable(true);
      Set_Theme_B.setDisable(true);
      Main_Menu_B.setDisable(true);
      Exit_B.setDisable(false);
        SFX2();
    }

    public void Volume_B_M(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), Volume_B);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(210);
        tt.play();
        SFX();
    }

    public void Volume_B_MF(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(100), Volume_B);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.setToX(200);
        tt.play();
    }

    public void Volume_B_MPr(MouseEvent mouseEvent) {
        Volume_B.setTextFill(Color.YELLOW);
    }

    public void Volume_B_MRe(MouseEvent mouseEvent) {
        Volume_B.setTextFill(Color.WHITE);
    }

    public void Exit_B_Act(ActionEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(200), MusicLabel);
        ft.setToValue(0);
        ft.play();
        FadeTransition ft1 = new FadeTransition(Duration.millis(200), MusicSlider);
        ft1.setToValue(0);
        ft1.play();
        FadeTransition ft2 = new FadeTransition(Duration.millis(200), Exit_B);
        ft2.setToValue(0);
        ft2.play();
        Volume_B.setDisable(false);
        Set_Theme_B.setDisable(false);
        Main_Menu_B.setDisable(false);
        Exit_B.setDisable(true);
        SFX2();
    }

    public void Exit_B_M(MouseEvent mouseEvent) {
    }

    public void Exit_B_MF(MouseEvent mouseEvent) {
    }

    public void Exit_B_MPr(MouseEvent mouseEvent) {
    }

    public void Exit_B_MRe(MouseEvent mouseEvent) {
    }
}

