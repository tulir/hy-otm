# Vaatimusmäärittely

## Soveluksen tarkoitus
Sovelluksen avulla käyttäjien on mahdollista keskustella toisten käyttäjien kanssa Matrix-protokollan välityksellä.

## Käyttäjät
Sovelluksella ei ole eri käyttäjätyyppejä.

## Käyttöliittymäluonnos
![Kirjautumisnäkymä](https://img.mau.lu/HIzm2.png)

![Viestinäkymä](https://img.mau.lu/hhj4M.png)

## Perusversion tarjoama toiminnallisuus
* Ohjelman on toimittava yleisillä terminaaliemulaattoreilla yleisillä GNU/Linux-jakeluilla ja macOS-käyttöjärjestelmällä. Windows-tuki ei ole vaadittu.

### Ennen kirjautumista
* Käyttäjä voi kirjautua järjestelmään

### Kirjautumisen jälkeen
* Käyttäjä näkee
  * [x] listan huoneista, joihin käyttäjä on liittynyt
  * [x] uudet viestit huoneissa
  * [x] uudet viestit työpöytäilmoituksina
  * [x] viestin tekstin kokonaan, vaikka viesti ei mahtuisi yhdelle riville
  * [x] kuvat renderöitynä terminaalin värien avulla
  * [x] Pienen HTML-osajoukon renderöinti terminaalin tyylien avulla
* Käyttäjä voi
  * [ ] klikata linkkejä avatakseen ne vakioselaimella
  * [x] klikata kuvia avatakseen ne vakiokuvankatseluohjelmalla
  * [x] liittyä huoneisiin ja poistua huoneista
  * [x] vaihtaa huoneiden välillä
  * [x] selata huoneen viestihistoriaa
  * [x] lähettää viestin huoneeseen
    * [x] lähettää formatoituja viestejä
  * [ ] luoda huoneita
  * [ ] kutsua muita käyttäjiä huoneeseen
  * [ ] moderoida huoneita
    * [ ] poistaa käyttäjiä huoneesta
    * [ ] antaa käyttäjille porttikielto huoneeseen
    * [ ] hiljentää käyttäjä
    * [ ] antaa muille käyttäjille lupa moderoida huonetta
  * [ ] kirjautua ulos

## Jatkokehitysideoita
Perusversion jälkeen järjestelmää täydennetään ajan salliessa esim. seuraavilla toiminnallisuuksilla

* Huoneiden asetusten muuttaminen
* Käyttäjän asetusten muuttaminen
* Ulkoasun konfigurointi
* Rekisteröityminen
* Monirivisten viestien lähettäminen