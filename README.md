# OTM
Harjoitustyö on Go:lla kirjoitettu terminaalipohjainen (ncurses-tyylinen)
asiakasohjelma Matrix-protokollalle.

* Tästä reposta löytyy
  * [dokumentaatio](dokumentaatio)
  * [releaset](https://github.com/tulir/hy-otm/releases), koska ohjelma ei ole
    haluamallani tasolla oikeita releaseja varten
  * [laskarit](laskarit)
* [gomuks](https://github.com/tulir/gomuks)-reposta löytyy
  * itse projekti
  * testit

## Dokumentaatio
* [Vaatimusmäärittely](dokumentaatio/vaatimusmäärittely.md)
* [Tuntikirjanpito](dokumentaatio/tuntikirjanpito.md)
* [Arkkitehtuuri](dokumentaatio/arkkitehtuuri.md)
* [Käyttöohje](dokumentaatio/käyttöohje.md)

## Toiminnot
Mavenia vastaavana riippuvuuksien hallintajärjestelmänä käytetään [dep](https://github.com/golang/dep)
-järjestelmää. `dep`:ssä riippuvuudet tallennetaan git-repositorioon vendor-kansion
alle, ja ne saa tarvittaessa päivitettyä komennolla `dep ensure -update`. Käyttäjien
ei kuitenkaan tarvitse päivittää riippuvuuksia itse, vaan riittää, että repositorio
päivitetään.

Toiminnoissa mainittu `$GOPATH`-kansio on yleensä `$HOME/go`. `GOPATH`ia voi
muuttaa asettamalla ympäristömuuttujan ennen `go`-komennon ajamista, esim:
`export GOPATH=$HOME/new_gopath`

### Asennus
Asenna [Go:n standardityökalut](https://golang.org/dl/).

Asenna gomuks:
```bash
$ go get -u maunium.net/go/gomuks
```
Tämä komento lataa tai päivittää gomuksin kansioon `$GOPATH/src/maunium.net/go/gomuks`,
hakee kaikki riippuvuudet ja kompiloi ohjelman kansioon `$GOPATH/bin`.

Gomuksin päivitystä varten riittää, että ajaa asennuskomennon uudestaan.

### Testaus
Varmista, että assert-kirjasto on asennettu:
```bash
$ go get github.com/stretchr/testify/assert
```

Testien suoritus:
```bash
$ go test ./... -coverprofile=coverage.out
```

Testikattavuusraportin generointi (raportti avautuu selaimessa):
```
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

TAI tiedosto `$GOPATH/bin`:iin:
```bash
$ go install
```

### GoDoc
https://godoc.org/maunium.net/go/gomuks

### Tyylin tarkistus
Asenna golint:
```bash
$ go get -u golang.org/x/lint/golint
```

Aja golint. `grep`-osiot poistavat varoitukset puuttuvasta dokumentaatiosta ja kaikki tarkistukset ulkoisilta kirjastoilta.
```bash
$ golint ./... | grep -v "should have comment" | grep -v "vendor/"
```

Tyyliongelmat tulostetaan stdout:iin. Mitään muuta ei tulosteta, eli tyyliongelmien puuttuessa mitään ei tulosteta.
