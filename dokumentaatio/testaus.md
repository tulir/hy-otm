# Testausdokumentti
Ohjelmaa on testattu automatisoiduin yksikkö- ja integraatiotestein Go:n
testing-paketilla sekä manuaalisesti tapahtunein järjestelmätason testein.

## Yksikkö- ja integraatiotestaus
```
$ go test ./... -coverprofile=coverage.out
ok  	maunium.net/go/gomuks/config		0.012s	coverage: 85.4% of statements
ok  	maunium.net/go/gomuks/matrix		0.015s	coverage: 46.6% of statements
ok  	maunium.net/go/gomuks/matrix/pushrules	0.008s	coverage: 89.2% of statements
ok  	maunium.net/go/gomuks/matrix/rooms	0.010s	coverage: 92.6% of statements

$ go tool cover -func=coverage.out
total:	(statements)				70.3%
```

## Sovellukseen jääneet laatuongelmat
Sovellus ei ehkä anna järkevää virheilmoitusta, jos konfiguraatio- tai
välimuistitiedostot ovat korruptoituneet tai niiden oikeudet ovat asetettu
väärin.