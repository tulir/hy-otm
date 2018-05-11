# Vaatimusmäärittely

## Soveluksen tarkoitus
Sovelluksen avulla käyttäjien on mahdollista keskustella toisten käyttäjien kanssa Matrix-protokollan välityksellä.

## Käyttäjät
Sovelluksella ei ole eri käyttäjätyyppejä.

## Käyttöliittymäluonnos
![Kirjautumisnäkymä](https://img.mau.lu/HIzm2.png)

![Viestinäkymä](https://img.mau.lu/hhj4M.png)

## Perusversion tarjoama toiminnallisuus
* Ohjelman on toimittava yleisillä terminaaliemulaattoreilla yleisillä
  GNU/Linux-jakeluilla ja iTermillä macOS-käyttöjärjestelmällä. Täydellinen
  Terminal.app-tuki ei ole vaadittu kyseisen terminaalin puutteiden vuoksi.
  Windows-tuki ei ole vaadittu.

### Ennen kirjautumista
* Käyttäjä voi kirjautua järjestelmään

### Kirjautumisen jälkeen
* Käyttäjä näkee
  * listan huoneista, joihin käyttäjä on liittynyt
  * uudet viestit huoneissa
  * uudet viestit työpöytäilmoituksina
  * viestin tekstin kokonaan, vaikka viesti ei mahtuisi yhdelle riville
  * kuvat renderöitynä terminaalin värien avulla
  * pienen HTML-osajoukon renderöitynä terminaalin tyylien avulla
* Käyttäjä voi
  * klikata kuvia avatakseen ne vakiokuvankatseluohjelmalla
  * liittyä huoneisiin ja poistua huoneista
  * vaihtaa huoneiden välillä
  * selata huoneen viestihistoriaa
  * lähettää viestin huoneeseen
    * lähettää formatoituja viestejä
  * luoda huoneita
  * kutsua muita käyttäjiä huoneeseen

## Jatkokehitysideoita
* Huoneiden luonti
* Käyttäjien kutsuminen huoneisiin
* Huoneiden asetusten muuttaminen
* Käyttäjän asetusten muuttaminen
* Klikkaustoimintoja viesteihin (esim linkkien klikkaaminen niiden avaamista varten)
* Ulkoasun konfigurointi
* Rekisteröityminen
* Monirivisten viestien lähettäminen
* Huoneiden moderointi
