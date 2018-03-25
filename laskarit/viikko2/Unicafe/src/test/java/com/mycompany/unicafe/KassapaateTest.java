package com.mycompany.unicafe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KassapaateTest {
	private Kassapaate paate;
	private Maksukortti kortti;

	@Before
	public void setUp() {
		kortti = new Maksukortti(1000);
		paate = new Kassapaate();
	}

	@Test
	public void luontiToimii() {
		assertEquals(1000, kortti.saldo());
		assertEquals(0, paate.edullisiaLounaitaMyyty());
		assertEquals(0, paate.maukkaitaLounaitaMyyty());
		assertEquals(100000, paate.kassassaRahaa());
	}

	@Test
	public void kateisOstoToimii1() {
		assertEquals(60, paate.syoEdullisesti(300));
		assertEquals(100240, paate.kassassaRahaa());
		assertEquals(1, paate.edullisiaLounaitaMyyty());
	}

	@Test
	public void kateisOstoToimii2() {
		assertEquals(200, paate.syoMaukkaasti(600));
		assertEquals(100400, paate.kassassaRahaa());
		assertEquals(1, paate.maukkaitaLounaitaMyyty());
	}

	@Test
	public void kateisOstoEiToimi1() {
		assertEquals(50, paate.syoEdullisesti(50));
		assertEquals(100000, paate.kassassaRahaa());
		assertEquals(0, paate.edullisiaLounaitaMyyty());
	}

	@Test
	public void kateisOstoEiToimi2() {
		assertEquals(399, paate.syoMaukkaasti(399));
		assertEquals(100000, paate.kassassaRahaa());
		assertEquals(0, paate.maukkaitaLounaitaMyyty());
	}

	@Test
	public void korttiOstoToimii1() {
		assertTrue(paate.syoEdullisesti(kortti));
		assertEquals(100000, paate.kassassaRahaa());
		assertEquals(1, paate.edullisiaLounaitaMyyty());
	}

	@Test
	public void korttiOstoToimii2() {
		assertTrue(paate.syoMaukkaasti(kortti));
		assertEquals(100000, paate.kassassaRahaa());
		assertEquals(1, paate.maukkaitaLounaitaMyyty());
	}

	@Test
	public void korttiOstoEiToimi1() {
		kortti.otaRahaa(899);
		assertFalse(paate.syoEdullisesti(kortti));
		assertEquals(100000, paate.kassassaRahaa());
		assertEquals(0, paate.edullisiaLounaitaMyyty());
	}

	@Test
	public void korttiOstoEiToimi2() {
		kortti.otaRahaa(700);
		assertFalse(paate.syoMaukkaasti(kortti));
		assertEquals(100000, paate.kassassaRahaa());
		assertEquals(0, paate.maukkaitaLounaitaMyyty());
	}

	@Test
	public void rahanLatausToimii() {
		paate.lataaRahaaKortille(kortti, 500);
		assertEquals(100500, paate.kassassaRahaa());
		assertEquals(1500, kortti.saldo());
	}

	@Test
	public void rahanLatausEiToimi() {
		paate.lataaRahaaKortille(kortti, -500);
		assertEquals(100000, paate.kassassaRahaa());
		assertEquals(1000, kortti.saldo());
	}
}
