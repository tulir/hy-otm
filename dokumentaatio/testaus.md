# Testausdokumentti
Ohjelmaa on testattu automatisoiduin yksikkö- ja integraatiotestein Go:n
testing-paketilla sekä manuaalisesti tapahtunein järjestelmätason testein.

## Yksikkö- ja integraatiotestaus
Testejä on tehty konfiguraatiota hallitsevalle `config`-paketille,
Matrix-palvelimen kanssa kommunikaation hoitavalle `matrix`-paketille
sekä sen alapaketeille `rooms` ja `pushrules`.

`pushrules`- ja `rooms`-paketit sisältävät lähinnä logiikkaa, jota testataan
yksikkötestein.

`matrix`-paketti sisältää lähinnä Matrix-kommunikaatio, jota testataan
korvaamalla HTTP-kommunikaatiofunktio halutunlaisella funktiolla.

### Testauskattavuus
```
$ go test ./... -coverprofile=coverage.out
ok  	maunium.net/go/gomuks/config		0.012s	coverage: 85.4% of statements
ok  	maunium.net/go/gomuks/matrix		0.015s	coverage: 46.6% of statements
ok  	maunium.net/go/gomuks/matrix/pushrules	0.008s	coverage: 89.2% of statements
ok  	maunium.net/go/gomuks/matrix/rooms	0.010s	coverage: 92.6% of statements

$ go tool cover -func=coverage.out
total:	(statements)				70.3%
```

## Järjestelmätestaus
Sovelluksen järjestelmätestaus on suoritettu manuaalisesti.

### Asennus
Sovellus on haettu READMEssä mainitulla komennolla sekä macOS- että Linux-ympäristöissä.

### Toiminnallisuudet
Kaikki määrittelydokumentin ja käyttöohjeen listaamat toiminnallisuudet on
käyty läpi. Kaikkien toiminnallisuuksien yhteydessä on syötekentät yritetty
täyttää myös virheellisillä arvoilla kuten tyhjillä.

## Sovellukseen jääneet laatuongelmat
Sovellus ei ehkä anna järkevää virheilmoitusta, jos konfiguraatio- tai
välimuistitiedostot ovat korruptoituneet tai niiden oikeudet ovat asetettu
väärin.