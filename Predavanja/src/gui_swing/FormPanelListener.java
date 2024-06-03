package gui_swing;

import java.util.EventListener;

public interface FormPanelListener extends EventListener {
    //    eventi enkapsuliraju podatke
    void leftPanelEventOccurred(LeftPanelEvent leftPanelEvent);

    void rightPanelEventOccurred(RightPanelEvent rightPanelEvent);

}
