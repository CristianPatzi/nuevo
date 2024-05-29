package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HoraTest {
	Hora h1 = new Hora();
	@Test
	void test() {
		System.out.println(h1.validarHora(-1,-1,-1));
	}
	@Test
	void test2() {
		System.out.println(h1.validarHora(1,1,24));
	}
	@Test
	void test3() {
		System.out.println(h1.validarHora(1,60,20));
	}
	@Test
	void tes4t() {
		System.out.println(h1.validarHora(60,40,20));
	}
}
