package zad_6_18_06_21.model;

import java.util.EventListener;

public interface FormListener extends EventListener {
    void openNewFrame();
    void clearForm();
    void formPanelEventOccurred(FormPanelEvent formPanelEvent);
}
