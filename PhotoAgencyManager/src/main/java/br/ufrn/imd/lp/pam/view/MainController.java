package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void RegisterNewClient() throws IOException {
        Parent tripViewParent = FXMLLoader.load(getClass().getResource("clientRegister.fxml")); // Carregando o arquivo fxml

        // Pegando informações da stage
        Stage window = new Stage();
        window.setResizable(false);
        window.setScene(new Scene(tripViewParent));
        window.show();
    }

    public void RegisterNewTrip() throws IOException {
        Parent tripViewParent = FXMLLoader.load(getClass().getResource("tripRegister.fxml")); // Carregando o arquivo fxml

        // Pegando informações da stage
        Stage window = new Stage();
        window.setResizable(false);
        window.setScene(new Scene(tripViewParent));
        window.show();
    }

    public void RegisterNewCompany() throws IOException {
        Parent tripViewParent = FXMLLoader.load(getClass().getResource("companyRegister.fxml")); // Carregando o arquivo fxml

        // Pegando informações da stage
        Stage window = new Stage();
        window.setResizable(false);
        window.setScene(new Scene(tripViewParent));
        window.show();
    }

    public void PhotographerLogin(ActionEvent event) throws Exception
    {
        Parent tripViewParent = FXMLLoader.load(getClass().getResource("photographerView.fxml")); // Carregando o arquivo fxml
       // Scene tripViewScene = new Scene(tripViewParent); // Colocando em uma nova scene

        // Pegando informações da stage
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(new Scene(tripViewParent));
        window.show();
    }


}

