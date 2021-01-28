package com.company;

import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controllers {

    public ListView <String> bigText;
    public TextField littleText;

    public void send(ActionEvent actionEvent) {
        String message = littleText.getText();
        littleText.clear();
        bigText.getItems().add(message);

    }
}
