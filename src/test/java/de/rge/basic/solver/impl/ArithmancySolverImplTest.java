package de.rge.basic.solver.impl;

import org.junit.Assert;
import org.junit.Test;

import de.rge.basic.solver.ArithmancySolver;

public class ArithmancySolverImplTest {

	private ArithmancySolver sut = new ArithmancySolverImpl();

	@Test
	public void solve_spellFireball() {
		Assert.assertEquals(new Integer(2), sut.solve("Fireball"));
	}

	@Test
	public void solve_spellFireball31() {
		Assert.assertEquals(new Integer(6), sut.solve("Fireball31"));
	}

}
