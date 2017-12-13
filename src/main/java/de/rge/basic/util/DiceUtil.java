package de.rge.basic.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiceUtil {

	public List<Integer> rollD6(Integer noOfDice) {
		return rollDice(noOfDice, 6);
	}

	public List<Integer> rollD8(Integer noOfDice) {
		return rollDice(noOfDice, 8);
	}
	
	private List<Integer> rollDice(Integer noOfDice, Integer range) {
		List<Integer> values = new ArrayList<Integer>();
		for(int dice = 0; dice < noOfDice; dice++) {
			values.add(new Random().nextInt(range) + 1);
		}
		return values;
	}

}
