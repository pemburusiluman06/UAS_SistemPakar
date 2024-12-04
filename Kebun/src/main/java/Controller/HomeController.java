package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class HomeController implements Initializable {

    @FXML
    private Button btn_lihat_daftar_tanaman;
    
    @FXML
    private Button btn_mulai; 

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    btn_lihat_daftar_tanaman.setOnAction((ActionEvent event) -> {
        Fungsi.ChangeScene(event, "/UI/DaftarSayuran.fxml", "Daftar Sayuran");
    });
    
    btn_mulai.setOnAction((ActionEvent event) -> {
        Fungsi.ChangeScene(event, "/UI/SistemPakar.fxml", "SistemPakar!");
    });
    }
}
