package Controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import DAO.DbController;
import javafx.scene.control.TableView;

public class DaftarSayuranController implements Initializable {
    
    @FXML
    private Button btn_kembali;

    @FXML
    private TableView<Sayuran> tabel_sayuran;
    
    @FXML
    private TableColumn<Sayuran, String> kolom_nama_sayur;
    
    @FXML
    private TableColumn<Sayuran, String> kolom_deskripsi_sayur;

    String query = null;
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    Sayuran sayuran = null;

    ObservableList<Sayuran> daftarSayuran = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        loadData();

        btn_kembali.setOnAction((ActionEvent event) -> {
            Fungsi.ChangeScene(event, "/UI/Home.fxml", "Home");
        });
    }

    @FXML
    private void refreshTable() {

        try {
            daftarSayuran.clear();

            query = "SELECT id_sayuran, nama_sayuran, deskripsi_sayuran FROM sayuran";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                daftarSayuran.add(new Sayuran(
                        resultSet.getString("id_sayuran"),
                        resultSet.getString("nama_sayuran"),
                        resultSet.getString("deskripsi_sayuran")
                ));
                tabel_sayuran.setItems(daftarSayuran);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void loadData() {

        connection = DbController.getConn();
        refreshTable();

        kolom_nama_sayur.setCellValueFactory(new PropertyValueFactory<>("nama_sayuran"));
        kolom_deskripsi_sayur.setCellValueFactory(new PropertyValueFactory<>("deskripsi_sayuran"));

    }
}
