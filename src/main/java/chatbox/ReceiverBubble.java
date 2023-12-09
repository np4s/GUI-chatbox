package chatbox;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class ReceiverBubble extends TextBubble {
    
    public ReceiverBubble(String message) {
        super(TextBubble.RECEIVER, message);
        this.setAlignment(Pos.CENTER_LEFT);
        VBox.setMargin(this, new Insets(0, 40, 0, 10));
    }
}
