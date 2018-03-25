package com.mycompany.unicafe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {
	private Maksukortti kortti;
	private int alkuraha;

	@Before
	public void setUp() {
		alkuraha = 1000;
		kortti = new Maksukortti(alkuraha);
	}

	@Test
	public void luotuKorttiOlemassa() {
		assertNotNull(kortti);
	}

	@Test
	public void saldoVahenee() {
		kortti.otaRahaa(500);
		assertEquals(alkuraha - 500, kortti.saldo());
	}

	@Test
	public void saldoEiVahene() {
		kortti.otaRahaa(900100);
		assertEquals(alkuraha, kortti.saldo());
	}

	@Test
	public void latausToimii() {
		kortti.lataaRahaa(500);
		assertEquals(alkuraha+500, kortti.saldo());
	}

	@Test
	public void toStringToimii() {
		assertEquals("saldo: 10.0", kortti.toString());
	}
}
