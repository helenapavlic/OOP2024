package GuiPredavanje2;

import java.util.EventListener;

public interface FormListener extends EventListener {
    void leftPanelEventOccurred(LeftFormEvent lfe);
    void rightPanelEventOccurred(RightFormEvent rfe);
}
