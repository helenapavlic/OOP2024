package GuiVjezba10Zadatak1;

import java.util.EventListener;

public interface FormPanelListener extends EventListener {
    void sendText(String text);
    void reset();
}
