package browser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private String httpLink = "http://";
    private String addressLink;
    private WebEngine engine;

    @FXML
    TextField addressBar;
    @FXML
    WebView web;

    public void go(ActionEvent actionEvent) {
        addressLink = addressBar.getText().toString();
        engine.load(httpLink + addressLink);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        engine = web.getEngine();
        engine.load(httpLink + "www.google.com");
    }
}
