package chatbox;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class SenderBubble extends TextBubble {
    
    public SenderBubble(String message) {
        super(TextBubble.SENDER, message);
        this.setAlignment(Pos.CENTER_RIGHT);
        VBox.setMargin(this, new Insets(0, 10, 0, 40));
    }
}
