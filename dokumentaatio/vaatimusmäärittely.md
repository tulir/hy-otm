# Vaatimusmäärittely

## Soveluksen tarkoitus
Sovelluksen avulla käyttäjien on mahdollista keskustella toisten käyttäjien kanssa Matrix-protokollan välityksellä.

## Käyttäjät
Sovelluksella on ainoastaan yksi käyttäjätyyppi eli _normaali käyttäjä_.

## Käyttöliittymäluonnos
![Kirjautumisnäkymä](https://img.mau.lu/HIzm2.png)

![Viestinäkymä](https://img.mau.lu/hhj4M.png)

## Perusversion tarjoama toiminnallisuus

### Ennen kirjautumista
* käyttäjä voi kirjautua järjestelmään

### Kirjautumisen jälkeen
* käyttäjä näkee
  * [x] listan huoneista, joihin käyttäjä on liittynyt
  * [x] uudet viestit huoneissa
  * [x] uudet viestit työpöytäilmoituksina
  * [x] viestin tekstin kokonaan, vaikka viesti ei mahtuisi yhdelle riville
  * [ ] kuvat renderöitynä terminaalin värien avulla
* käyttäjä voi
  * [ ] klikata linkkejä avatakseen ne vakioselaimella
  * [ ] klikata kuvia avatakseen ne vakiokuvankatseluohjelmalla
  * [x] liittyä huoneisiin ja poistua huoneista
  * [x] vaihtaa huoneiden välillä
  * [x] selata huoneen viestihistoriaa
  * [x] lähettää viestin huoneeseen
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

* huoneiden asetusten muuttaminen
* käyttäjän asetusten muuttaminen
* ulkoasun konfigurointi
* rekisteröityminen
* formatoitujen viestien lähettäminen
* monirivisten viestien lähettäminen
* formatoitujen viestien näyttäminen (Matrixin tukeman HTML-subsetin renderöinti)
