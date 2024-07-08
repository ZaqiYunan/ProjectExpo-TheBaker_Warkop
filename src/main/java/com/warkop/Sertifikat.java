package com.warkop;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Sertifikat {

    @FXML
    private Text textNama;

    @FXML
    public void initialize() {
        textNama.setText(AccountModel.getInstance().getAccount().getNamaLengkap());
    }

 
}
