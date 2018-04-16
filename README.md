# OTM-laskarit

Harjoitustyö on Go:lla kirjoitettu terminaalipohjainen (ncurses-tyylillä)
asiakasohjelma Matrix-protokollalle. Itse projekti löytyy [gomuks](https://github.com/tulir/gomuks)-reposta,
ja kurssin vaatima dokumentaatio tämän repon kansiosta [/dokumentaatio](dokumentaatio).

Mavenia vastaavana riippuvuuksien hallintajärjestelmänä käytetään
[vgo](https://github.com/golang/go/wiki/vgo)-prototyyppiä, jonka
on tarkoitus olla tulevaisuudessa Go:n virallinen pakettimanageri.

`vgo`:n käyttö ei ole pakollista, ja tavallinen `go`-komento toimii
myös. `go`-komentoa käyttäessä riippuvuuksien versioita ei tosin
tarkisteta, vaan komento lataa aina uusimman version.

## Dokumentaatio
* [Vaatimusmäärittely](dokumentaatio/vaatimusmäärittely.md)
* [Tuntikirjanpito](dokumentaatio/tuntikirjanpito.md)

## Toiminnot

Toiminnoissa mainittu `$GOPATH`-kansio on yleensä `$HOME/go`.

`GOPATH`ia voi muuttaa asettamalla ympäristömuuttujan ennen `go`-komennon ajamista, esim: `export GOPATH=$HOME/new_gopath`

### Asennus
Asenna [Go:n standardityökalut](https://golang.org/dl/).

Asenna gomuks:
```bash
$ go get -u maunium.net/go/gomuks
```
Tämä komento lataa tai päivittää gomuksin kansioon `$GOPATH/src/maunium.net/go/gomuks`,
hakee kaikki riippuvuudet ja kompiloi ohjelman kansioon `$GOPATH/bin`.

Jos käytät vgo:ta, kloonaa gomuks kansioon `$GOPATH/src/maunium.net/go/gomuks` ja aja siellä `vgo get -u`

Gomuksin päivitystä varten riittää, että ajaa asennuskomennon uudestaan.

### Testaus
Varmista, että assert-kirjasto on asennettu:
```bash
$ go get github.com/stretchr/testify/assert
```

Testien suoritus:
```bash
$ go test ./...
```

Testikattavuusraportin generointi:
```
$ go test ./... -coverprofile=coverage.out
$ go tool cover -html=coverage.out
```

Raportin voi halutessaan tallentaa tiedostoon selaimen avaamisen sijasta:
```
$ go tool cover -html=coverage.out -o coverage.html
```

### Suoritettavan tiedoston generointi
Tiedosto nykyiseen hakemistoon:
```bash
$ go build
```

Tiedosto `$GOPATH/bin`:iin:
```bash
$ go install
```

### GoDoc
https://godoc.org/maunium.net/go/gomuks

### Tyylin tarkistus
Asenna gometalinter:
```bash
$ go get -u github.com/alecthomas/gometalinter
```

Aja gometalinter:
```bash
$ gometalinter
```

Tyyliongelmat tulostetaan