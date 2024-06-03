package gui_swing;

import java.util.EventListener;

public interface ToolBarListener extends EventListener {
    //sucelje extenda drugo sucelje -> eventListener

    void ToolBarEventOccurred(ToolBarEvent toolBarEvent);
}
