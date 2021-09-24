package sample;

import com.jfoenix.controls.JFXButton;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

public class Set_Theme_Scene_Controller implements Initializable {

    MediaPlayer mediaPlayer;
    MediaPlayer SFXPlayer;
    MediaPlayer SFXPlayer2;
    MediaPlayer SFXPlayer3;

    public void music() {
        String s = "C:\\Users\\User\\Sonic's unknown times\\src\\assets\\music\\Data_Or_Theme_Select_Music.mp3";
        Media media = new Media(Paths.get(s).toUri().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void SFX() {
        String s = "C:\\Users\\User\\Sonic's unknown times\\src\\assets\\music\\bumper.mp3";
        Media media = new Media(Paths.get(s).toUri().toString());
        SFXPlayer = new MediaPlayer(media);
        SFXPlayer.setVolume(0.5);
        SFXPlayer.play();
    }
    public void SFX2() {
        String s = "C:\\Users\\User\\Sonic's unknown times\\src\\assets\\music\\warp-2.mp3";
        Media media = new Media(Paths.get(s).toUri().toString());
        SFXPlayer2 = new MediaPlayer(media);
        SFXPlayer2.setVolume(0.5);
        SFXPlayer2.play();
    }
    public void SFX3() {
        String s = "C:\\Users\\User\\Sonic's unknown times\\src\\assets\\music\\Error.mp3";
        Media media = new Media(Paths.get(s).toUri().toString());
        SFXPlayer3 = new MediaPlayer(media);
        SFXPlayer3.setVolume(0.2);
        SFXPlayer3.play();
    }


    @FXML
    private Rectangle BetweenScenes;
    @FXML
    private JFXButton Main_Menu_B, GH_B, EH_B, MG_B;
    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private ImageView Background_Image, G_C_Em_1, G_C_Em_2, G_C_Em_3, G_C_Em_4, G_C_Em_5, G_C_Em_6;
    @FXML
    private ImageView B_C_Em_1, B_C_Em_2, B_C_Em_3, B_C_Em_4, B_C_Em_5, B_C_Em_6;
    @FXML
    private ImageView R_C_Em_1, R_C_Em_2, R_C_Em_3, R_C_Em_4, R_C_Em_5, R_C_Em_6;
    @FXML
    private ImageView  W_C_Em_1, W_C_Em_2, W_C_Em_3, W_C_Em_4, W_C_Em_5, W_C_Em_6;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        OpeningScene();
        Main_Menu_B.setTextFill(Color.BLACK);
        GH_B.setTextFill(Color.BLACK);
        EH_B.setTextFill(Color.BLACK);
        MG_B.setTextFill(Color.BLACK);
        TranslateTransition tt = new TranslateTransition(Duration.seconds(1), G_C_Em_1);
        tt.setCycleCount(Animation.INDEFINITE);
        tt.setAutoReverse(true);
        tt.setToY(-10);
        tt.play();
        TranslateTransition tt1 = new TranslateTransition(Duration.seconds(1), G_C_Em_2);
        tt1.setCycleCount(Animation.INDEFINITE);
        tt1.setAutoReverse(true);
        tt1.setToY(-10);
        tt1.play();
        TranslateTransition tt2 = new TranslateTransition(Duration.seconds(1), R_C_Em_1);
        tt2.setCycleCount(Animation.INDEFINITE);
        tt2.setAutoReverse(true);
        tt2.setToY(-10);
        tt2.play();
        TranslateTransition tt3 = new TranslateTransition(Duration.seconds(1), R_C_Em_2);
        tt3.setCycleCount(Animation.INDEFINITE);
        tt3.setAutoReverse(true);
        tt3.setToY(-10);
        tt3.play();
        TranslateTransition tt4 = new TranslateTransition(Duration.seconds(1), W_C_Em_1);
        tt4.setCycleCount(Animation.INDEFINITE);
        tt4.setAutoReverse(true);
        tt4.setToY(-10);
        tt4.play();
        TranslateTransition tt5 = new TranslateTransition(Duration.seconds(1), W_C_Em_2);
        tt5.setCycleCount(Animation.INDEFINITE);
        tt5.setAutoReverse(true);
        tt5.setToY(-10);
        tt5.play();
        TranslateTransition tt6 = new TranslateTransition(Duration.seconds(1), G_C_Em_3);
        tt6.setCycleCount(Animation.INDEFINITE);
        tt6.setAutoReverse(true);
        tt6.setToY(-10);
        tt6.play();
        TranslateTransition tt7 = new TranslateTransition(Duration.seconds(1), G_C_Em_4);
        tt7.setCycleCount(Animation.INDEFINITE);
        tt7.setAutoReverse(true);
        tt7.setToY(-10);
        tt7.play();
        TranslateTransition tt8 = new TranslateTransition(Duration.seconds(1), R_C_Em_3);
        tt8.setCycleCount(Animation.INDEFINITE);
        tt8.setAutoReverse(true);
        tt8.setToY(-10);
        tt8.play();
        TranslateTransition tt9 = new TranslateTransition(Duration.seconds(1), R_C_Em_4);
        tt9.setCycleCount(Animation.INDEFINITE);
        tt9.setAutoReverse(true);
        tt9.setToY(-10);
        tt9.play();
        TranslateTransition tt10 = new TranslateTransition(Duration.seconds(1), W_C_Em_3);
        tt10.setCycleCount(Animation.INDEFINITE);
        tt10.setAutoReverse(true);
        tt10.setToY(-10);
        tt10.play();
        TranslateTransition tt11 = new TranslateTransition(Duration.seconds(1), W_C_Em_4);
        tt11.setCycleCount(Animation.INDEFINITE);
        tt11.setAutoReverse(true);
        tt11.setToY(-10);
        tt11.play();
        TranslateTransition tt12 = new TranslateTransition(Duration.seconds(1), G_C_Em_5);
        tt12.setCycleCount(Animation.INDEFINITE);
        tt12.setAutoReverse(true);
        tt12.setToY(-10);
        tt12.play();
        TranslateTransition tt13 = new TranslateTransition(Duration.seconds(1), G_C_Em_6);
        tt13.setCycleCount(Animation.INDEFINITE);
        tt13.setAutoReverse(true);
        tt13.setToY(-10);
        tt13.play();
        TranslateTransition tt14 = new TranslateTransition(Duration.seconds(1), R_C_Em_5);
        tt14.setCycleCount(Animation.INDEFINITE);
        tt14.setAutoReverse(true);
        tt14.setToY(-10);
        tt14.play();
        TranslateTransition tt15 = new TranslateTransition(Duration.seconds(1), R_C_Em_6);
        tt15.setCycleCount(Animation.INDEFINITE);
        tt15.setAutoReverse(true);
        tt15.setToY(-10);
        tt15.play();
        TranslateTransition tt16 = new TranslateTransition(Duration.seconds(1), W_C_Em_5);
        tt16.setCycleCount(Animation.INDEFINITE);
        tt16.setAutoReverse(true);
        tt16.setToY(-10);
        tt16.play();
        TranslateTransition tt17 = new TranslateTransition(Duration.seconds(1), W_C_Em_6);
        tt17.setCycleCount(Animation.INDEFINITE);
        tt17.setAutoReverse(true);
        tt17.setToY(-10);
        tt17.play();
    }

    private void OpeningScene() {
        FadeTransition ft = new FadeTransition(Duration.millis(800), BetweenScenes);
        ft.setCycleCount(0);
        ft.setAutoReverse(false);
        ft.setToValue(0);
        ft.setOnFinished((ActionEvent e)->{
            music();
        });
        ft.play();
        TranslateTransition tt = new TranslateTransition(Duration.seconds(7), Background_Image);
        tt.setToX(200);
        tt.setAutoReverse(true);
        tt.setCycleCount(Animation.INDEFINITE);
        tt.play();
    }

    public void Main_Menu_B_Act(ActionEvent event) {
        SFX2();
        FadeTransition ft = new FadeTransition(Duration.millis(800), BetweenScenes);
        ft.setToValue(1);
        ft.setOnFinished((ActionEvent e)->{
            try {
                loadNextScene();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            mediaPlayer.pause();
        });
        ft.setCycleCount(0);
        ft.setAutoReverse(false);
        ft.play();
    }

    private void loadNextScene() throws IOException {
        Parent SecondView;
        SecondView = (AnchorPane) FXMLLoader.load(getClass().getResource("Main_Menu_Scene.fxml"));

        Scene SecondScene = new Scene(SecondView);
        Stage curStage = (Stage) AnchorPane.getScene().getWindow();
        curStage.setScene(SecondScene);
    }

    public void Main_Menu_B_M(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(200), Main_Menu_B);
        tt.setToY(-20);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.play();
        SFX();
    }

    public void Main_Menu_B_MF(MouseEvent mouseEvent) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(200), Main_Menu_B);
        tt.setToY(0);
        tt.setAutoReverse(false);
        tt.setCycleCount(0);
        tt.play();
    }

    public void Main_Menu_B_MPr(MouseEvent mouseEvent) {
        Main_Menu_B.setTextFill(Color.YELLOW);
    }

    public void Main_Menu_B_MRe(MouseEvent mouseEvent) {
        Main_Menu_B.setTextFill(Color.BLACK);
    }

    public void GH_B_Act(ActionEvent event) {
        SFX3();
    }

    public void GH_B_M(MouseEvent mouseEvent) {
        FadeTransition ft = new FadeTransition(Duration.millis(100), W_C_Em_1);
        ft.setToValue(1);
        ft.play();
        FadeTransition ft1 = new FadeTransition(Duration.millis(100), W_C_Em_2);
        ft1.setToValue(1);
        ft1.play();
        SFX();
    }

    public void GH_B_MF(MouseEvent mouseEvent) {
        FadeTransition ft = new FadeTransition(Duration.millis(100), W_C_Em_1);
        ft.setToValue(0);
        ft.play();
        FadeTransition ft1 = new FadeTransition(Duration.millis(100), W_C_Em_2);
        ft1.setToValue(0);
        ft1.play();
    }

    public void GH_B_M_Pr(MouseEvent mouseEvent) {
    }

    public void GH_B_M_Re(MouseEvent mouseEvent) {
    }

    public void EH_B_Act(ActionEvent event) {
        SFX3();
    }

    public void EH_B_M(MouseEvent mouseEvent) {
            FadeTransition ft = new FadeTransition(Duration.millis(100), R_C_Em_3);
            ft.setToValue(1);
            ft.play();
            FadeTransition ft1 = new FadeTransition(Duration.millis(100), R_C_Em_4);
            ft1.setToValue(1);
            ft1.play();
            SFX();
    }

    public void EH_B_MF(MouseEvent mouseEvent) {
        FadeTransition ft = new FadeTransition(Duration.millis(100), R_C_Em_3);
        ft.setToValue(0);
        ft.play();
        FadeTransition ft1 = new FadeTransition(Duration.millis(100), R_C_Em_4);
        ft1.setToValue(0);
        ft1.play();
    }

    public void EH_B_M_Pr(MouseEvent mouseEvent) {
    }

    public void EH_B_M_Re(MouseEvent mouseEvent) {
    }

    public void MG_B_Act(ActionEvent event) {
        SFX3();
    }

    public void MG_B_M(MouseEvent mouseEvent) {
            FadeTransition ft = new FadeTransition(Duration.millis(100), R_C_Em_5);
            ft.setToValue(1);
            ft.play();
            FadeTransition ft1 = new FadeTransition(Duration.millis(100), R_C_Em_6);
            ft1.setToValue(1);
            ft1.play();
            SFX();
    }

    public void MG_B_MF(MouseEvent mouseEvent) {
        FadeTransition ft = new FadeTransition(Duration.millis(100), R_C_Em_5);
        ft.setToValue(0);
        ft.play();
        FadeTransition ft1 = new FadeTransition(Duration.millis(100), R_C_Em_6);
        ft1.setToValue(0);
        ft1.play();
    }

    public void MG_B_M_Pr(MouseEvent mouseEvent) {
    }

    public void MG_B_M_Re(MouseEvent mouseEvent) {
    }
}
