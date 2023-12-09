package chatbox;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;

public class MainScreenController implements Initializable {
    @FXML
    ScrollPane scroll;
    @FXML
    VBox history;
    @FXML
    Button sendBtn;
    @FXML
    TextArea textBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sendBtn.setOnAction(e -> {
            sendMessage();
            autoReply();
        });
        textBox.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                sendMessage();
                autoReply();
            }
        });
    }

    private void sendMessage() {
        String message = textBox.getText();
        message = message.trim();
        textBox.setText("");
        if (message.equals("")) {
            return;
        }
        SenderBubble senderBubble = new SenderBubble(message);
        history.getChildren().add(senderBubble);
        scroll.setVvalue(1.0);
    }

    private void autoReply() {
        ReceiverBubble receiverBubble = new ReceiverBubble("Ừ anh sai\r\n"
                + "Thì anh sai\r\n"
                + "Nhưng mà anh sai vì anh là chính mình\r\n"
                + "Nhiều khi thất tình\r\n"
                + "Để không mất mình\r\n"
                + "Thế nhưng nhiều khi");
        history.getChildren().add(receiverBubble);
        scroll.setVvalue(1.0);
    }
}
