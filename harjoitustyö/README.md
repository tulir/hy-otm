Tämä kansio sisältää harjoitustyön dokumentaation turhat osat.
Itse projekti (mukaanlukien testit ja relevantti dokumentaatio)
löytyy [gomuks](https://github.com/tulir/gomuks)-reposta.

## Dokumentaatio
* [Vaatimusmäärittely](vaatimusmäärittely.md)
* [Tuntikirjanpito](tuntikirjanpito.md)

## Toiminnot

### Testaus
Testien suoritus:
```bash
$ go test
```

Testikattavuusraportin generointi:
```
$ go test -coverprofile=coverage.out
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