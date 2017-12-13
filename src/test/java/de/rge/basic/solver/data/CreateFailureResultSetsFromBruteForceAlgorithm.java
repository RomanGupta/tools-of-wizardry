package de.rge.basic.solver.data;

import static de.rge.basic.util.PermutationUtil.RANGE_1_TO_8;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import de.rge.basic.solver.SacredGeometrySolver;
import de.rge.basic.solver.impl.SacredGeometrySolverImpl;
import de.rge.basic.util.FileUtil;
import de.rge.basic.util.PermutationUtil;

public class CreateFailureResultSetsFromBruteForceAlgorithm {

	private static final String PATH_TO_FAILURE_SETS = "./src/main/java/de/rge/data/";
	private static int SPELL_LEVEL_BEGIN = 1;
	private static int SPELL_LEVEL_END = 9;
	private static int NO_OF_VALUES_BEGIN = 1;
	private static int NO_OF_VALUES_END = 6;
	private static int VALUE_RANGE = RANGE_1_TO_8;

	private static String FailureResultTemplate;

	private SacredGeometrySolver sacredGeometrySolver = new SacredGeometrySolverImpl();

	private PermutationUtil permutationUtil = new PermutationUtil();
	
	private FileUtil fileUtil = new FileUtil();

	@BeforeClass
	public static void loadTemplate() throws Exception {
		FailureResultTemplate = FileUtil.readFile(PATH_TO_FAILURE_SETS + "FailureResultSetTemplate.java");
	}

	@Test
	public void createData() {
		for (int spellLevel = SPELL_LEVEL_BEGIN; spellLevel <= SPELL_LEVEL_END; spellLevel++) {
			createData(spellLevel);
		}
	}

	private void createData(int spellLevel) {
		for (int noOfValues = NO_OF_VALUES_BEGIN; noOfValues <= NO_OF_VALUES_END; noOfValues++) {
			String combinationEntries = createCombinationEntriesForNoOfValues(spellLevel, initializeValues(noOfValues));
			if (!combinationEntries.isEmpty()) {
				String className = determineClassName(spellLevel, noOfValues);
				fileUtil.writeFile(PATH_TO_FAILURE_SETS + className + ".java", assembleFileContent(className, combinationEntries));
			}
		}
	}

	private String assembleFileContent(String className, String combinationEntries) {
		String fileContent = FailureResultTemplate;
		fileContent = fileContent.replace("FailureResultSetTemplate", className);
		fileContent = fileContent.replace("// import java.util.Arrays;\r\n", "import java.util.Arrays;\r\n");
		fileContent = fileContent.replace("// %INSERT_COMBINATION_ENTRIES_HERE%\r\n", combinationEntries);
		return fileContent;
	}

	private String determineClassName(int spellLevel, int noOfValues) {
		return "FailureResultSetSpellLevel" + spellLevel + "Values" + (noOfValues < 10 ? "0" : "") + noOfValues;
	}

	private List<Integer> initializeValues(int noOfValues) {
		List<Integer> values = new ArrayList<>(noOfValues);
		for (int ctr = 0; ctr < noOfValues - 1; ctr++) {
			values.add(1);
		}
		values.add(0);
		return values;
	}

	private String createCombinationEntriesForNoOfValues(Integer spellLevel, List<Integer> values) {
		try (Formatter output = new Formatter(new StringBuilder())) {
			while (permutationUtil.hasNextCombination(values, VALUE_RANGE)) {
				permutationUtil.setNextCombination(values, values.size() - 1, VALUE_RANGE);
				boolean result = sacredGeometrySolver.solve(spellLevel, values);
				if (!result) {
					output.format("\t\ttemp.add(Arrays.asList(%s));\n", convertValuesToString(values));
				}
				System.out.println("--> Processed: " + values + "; " + (result ? "SUCCESS" : "FAILURE"));
			}
			return output.toString();
		}
	}

	private String convertValuesToString(List<Integer> values) {
		String strValues = values.toString();
		return strValues.substring(1, strValues.length() - 1);
	}

}
