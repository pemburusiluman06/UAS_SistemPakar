package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class SistemPakarController implements Initializable {
    
    @FXML
    private Button btn_kembali;
    @FXML
    private Button btn_inferensi;
    @FXML
    private MenuButton menu_musim;
    @FXML
    private MenuItem musim_hujan;
    @FXML
    private MenuItem musim_kemarau;
    @FXML
    private MenuButton menu_ketinggian;
    @FXML
    private MenuItem tinggi_rendah;
    @FXML
    private MenuItem tinggi_sedang;
    @FXML
    private MenuItem tinggi_tinggi;
    @FXML
    private MenuButton menu_ph;
    @FXML
    private MenuItem ph_asam;
    @FXML
    private MenuItem ph_netral;
    @FXML
    private MenuItem ph_basa;
    @FXML
    private MenuButton menu_tanah;
    @FXML
    private MenuItem tanah_lempung;
    @FXML
    private MenuItem tanah_gambut;
    @FXML
    private MenuItem tanah_liat;
    @FXML
    private MenuItem tanah_gembur;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        btn_kembali.setOnAction((ActionEvent event) -> {
            Fungsi.ChangeScene(event, "/UI/Home.fxml", "Home");
        });
        
        for (MenuItem item : menu_tanah.getItems()) {
            item.setOnAction(event -> menu_tanah.setText(item.getText()));
        }
        for (MenuItem item : menu_ph.getItems()) {
            item.setOnAction(event -> menu_ph.setText(item.getText()));
        }
        for (MenuItem item : menu_ketinggian.getItems()) {
            item.setOnAction(event -> menu_ketinggian.setText(item.getText()));
        }
        for (MenuItem item : menu_musim.getItems()) {
            item.setOnAction(event -> menu_musim.setText(item.getText()));
        }
    }        
}
