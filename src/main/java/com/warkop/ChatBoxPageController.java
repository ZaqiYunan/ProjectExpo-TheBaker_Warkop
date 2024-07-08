package com.warkop;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ChatBoxPageController {

    @FXML
    private TextField inputEmail;

    @FXML
    private ImageView sendEmailButton;

    @FXML
    private Label statusLabel;

    @FXML
    private VBox chatBox;

    @FXML
    public void initialize() {
        // Initialization code if needed
    }

    @FXML
    private void handleSendEmail(MouseEvent event) {
        String email = inputEmail.getText();
        if (email.isEmpty()) {
            statusLabel.setText("Silahkan masukkan pesan");
            return;
        }

        // Add the email to the chatbox
        addMessageToChatBox(email);
        inputEmail.clear(); // Clear the input field after sending
    }

    private void addMessageToChatBox(String message) {
        Text text = new Text(message);
        text.setWrappingWidth(chatBox.getPrefWidth());
        chatBox.getChildren().add(text);
    }
}
