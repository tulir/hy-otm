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
Jos käytät `vgo`:ta, aseta `alias go=vgo`

### Testaus
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