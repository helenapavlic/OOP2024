## Ispitni rok 23.6.2023. - txt file
**Zadatak 3** ![gentle](https://img.shields.io/badge/complexity-***-yellowgreen) (45 min.)

U ovom zadatku imate zadanu niz gradova:

city_arr = {"Madrid", "Barcelona", "Bogota", "Bakar", "Medina", "Macau", "Benkovac", "Baltimore", "Baku", "Caracas", "Cairo", "Chicago", "Delhi", "Dhaka", "Damaskus", "Drniš", "Giza", "Gospić", "Hamburg", "Harare", "Havana", "Istanbul", "Izmir", "Biograd na moru", "Crikvenica", "Jakarta", "Karachi", "Karlovac", "Dubrovnik", "Hvar", "Honk Kong", "Houston", "Kazan", "Kobe", "Jastrebarsko", "Kaštela", "Solin", "Split", "Vukovar", "Zadar", "Lagos", "London", "Mecca", "Milan", "Makarska", "Medina", "Montreal", "Šibenik", "Napoli", "New York", "Osijek", "Osaka", "Paris", "Perth", "Rome", "Rio de Janeiro", "Novigrad", "Opatija", "Pazin", "Pakrac", "San Diego", "Santa Cruz", "Sao Paulo", "Seoul", "Stockholm", "Tokyo", "Pula", "Senj", "Sinj", "Valencia", "Vienna", "Samobor", "Vinkovci", "Zabok"}

Trebate kreirati igru koja nasumice izabire jedan grad iz zadane liste nakon čega igraču prikazuje duljinu naziva grada (računajući i razmaknice) te prikazuje prvo slovo. Igrač unosi vlastiti pokušaj i čeka odgovor koji se dobije usporedbom unosa i nasumičnog izbora. Za slučaj kada je igrač pogodio ispisuje se pripadajuća poruka `guessed`, a u suprotnom `missed`. Igraču se daje mogućnost da nastavi ili izađe iz igre. Kod nastavka igre prikazuje se koji pokušaj je u tijeku te da se igra nastavlja, dok se za izabrani prekid prikazuje kao poruka o izlazu iz igre. Važno je osigurati klasu `Player` koja će za svakog igrača omogućiti praćenje "podataka" odigranih igara u vidu `guessed` i `missed` vrijednosti, što znači da je na početku prvo potrebno provjeriti postoji li igrač ili treba napraviti novog. Struktura podataka koja prati podatke igre za svakog igrača je tipa ključ-vrijednost.

> **NAPOMENA:** podaci se ovaj put spremaju u txt datoteku ***game_results.txt***

> **NAPOMENA:** ne zaboravite napraviti case folding za gradove i unose

Mogući konzolni izlaz:

```
Ime grada ima ukupno: 5 znakova / slova uključivo s razmaknicama...
Prvo slovo je: i

Probajte pogoditi ime grada...
Unesite ime grada...

Istanbul

Niste pogodili...

Za nastavak 'y' - bilo koji drugi za izlaz...
Nastavak ili ne? y

Bio je ovo 1 pokušaj - nastavljamo dalje

Ime grada ima ukupno: 4 znakova / slova uključivo s razmaknicama...
Prvo slovo je: r

Probajte pogoditi ime grada...
Unesite ime grada...
Rome

POGODAK -> Unos Rome jednak je traženom rome...

Za nastavak 'y' - bilo koji drugi za izlaz...
Nastavak ili ne?  x

Odabrali ste izlaz iz igre. Vaš rezultat je spremljen.
1 pogodak ÷ 1 promašaj
```
