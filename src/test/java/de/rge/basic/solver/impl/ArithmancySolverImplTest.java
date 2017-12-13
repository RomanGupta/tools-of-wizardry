package de.rge.basic.solver.impl;

import de.rge.basic.solver.ArithmancySolver;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArithmancySolverImplTest {

	private ArithmancySolver sut = new ArithmancySolverImpl();

	@Test
	public void solve_spellFireball() {
		assertThat(sut.solve("Fireball")).isEqualTo(2);
	}

	@Test
	public void solve_spellFireball31() {
		assertThat(sut.solve("Fireball31")).isEqualTo(6);
	}

}
