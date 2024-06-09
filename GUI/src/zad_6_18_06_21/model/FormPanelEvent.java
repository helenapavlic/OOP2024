package zad_6_18_06_21.model;

import java.util.EventObject;

public class FormPanelEvent extends EventObject {
//    basic info
    private String playerName;
    private int totalGamesPlayed;
    private String skillsLevel;
    private boolean automaticallyAdd;
    private boolean chooseGroup;

//    games
    private String subscribeTo;
    private boolean isSelectedNewsletter;
    private boolean isSelectedGetMagazine;
    private boolean isSelectedSpecialOffers;
    private String generatedId;


    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public FormPanelEvent(Object source) {
        super(source);
    }

    public FormPanelEvent(Object source, String playerName, int totalGamesPlayed, String skillsLevel, boolean automaticallyAdd, boolean chooseGroup, String subscribeTo, boolean isSelectedNewsletter, boolean isSelectedGetMagazine, boolean isSelectedSpecialOffers, String generatedId) {
        super(source);
        this.playerName = playerName;
        this.totalGamesPlayed = totalGamesPlayed;
        this.skillsLevel = skillsLevel;
        this.automaticallyAdd = automaticallyAdd;
        this.chooseGroup = chooseGroup;
        this.subscribeTo = subscribeTo;
        this.isSelectedNewsletter = isSelectedNewsletter;
        this.isSelectedGetMagazine = isSelectedGetMagazine;
        this.isSelectedSpecialOffers = isSelectedSpecialOffers;
        this.generatedId = generatedId;
    }
}
