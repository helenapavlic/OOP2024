## Ispitni rok 18.06.2021.
### Zadatak 6 gui

Potrebno je da napravite gui prema slici:

![Alt text](/zadatak_6_18_06_21_gui.png)

U Basic info i Games panel izabirete podatke za korisnika / igrača kojeg kreirate. Svaki igrač je objekt Klase Player koja je određena s podacima na prvom GUI-u Player. Id se automatski generira klikom na dugme Subscribe. Dugme Show info postaje aktivno tek kada se kreiraju tri profila igrača. U Info dijelu aplikacije Search criteria su:

 - Player id
 - Skills level

Tek kada se izabere kriterij pretrage klikom na dugme Activate aktivira se samo pripadni element Player id ili combo box Skills level. Po izboru se u tekstualnom području prikazuju:

- a) Svi podaci za igrača ako je izabran id
 - b) Svi igrači s korisničkim imenom i pripadnom id vrijednosti za dani skill level (izlista sve igrače tog nivoa)