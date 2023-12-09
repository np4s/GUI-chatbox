package chatbox;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;

public class TextBubble extends HBox {
    public static final String SENDER = "sender";
    public static final String RECEIVER = "receiver";

    public TextBubble(String turn, String message) {
        Label label = new Label();
        label.setText(message);
        label.setWrapText(true);
        label.setTextFill(Paint.valueOf("white"));
        label.getStyleClass().add(turn);
        this.getChildren().add(label);
    }
}
