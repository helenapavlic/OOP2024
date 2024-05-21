## gui po paketima
## 1. GuiPredavanje1
početni gui sa jednostavnim sučeljem i praznim prozorom, ima button koji ispisuje da je button kliknut
Model-View-Controller obrazac -> posebno smo kreirali ToolBarListener koji ima metode sendTxtFileContent koja postavlja 
text na TextPanel i clearText koja briše sve sa TextPanela
u MainFrameu imamo adtibut toolBarListener koji je realiziran u konstruktoru (create components metoda)
na ovaj način smo odvojili text panel i tool bar.
U ToolBar klasi također imamo atribut toolBarListener, imamo i setters za taj atribut u toj klasi
u main frameu kroz setters postavimo toolBarlistener.
u ToolBar klasi koristimo realnizirane metode interfacea ToolBarlistener u overraidu actionPerformed metode
actionPerformed metodu imamo jer ToolBar implementira ActionListener