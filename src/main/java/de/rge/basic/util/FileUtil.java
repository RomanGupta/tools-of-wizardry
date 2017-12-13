package de.rge.basic.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

	public static String readFile(String filePath) throws IOException, FileNotFoundException {
		StringBuilder templateContent = new StringBuilder();
		try (FileReader fileReader = new FileReader(filePath)) {
			char[] buffer = new char[256];
			while (fileReader.read(buffer) > -1) {
				templateContent.append(buffer);
				buffer = new char[256];
			}
		}
		return templateContent.toString().trim();
	}

	public void writeFile(String filePath, String fileContent) {
		try (FileWriter fileWriter = new FileWriter(filePath)) {
			fileWriter.write(fileContent);
			System.out.println("Created file " + filePath);
		} catch (IOException ioe) {
			System.out.println("Couldn't write file \"" + filePath + "\": " + ioe.getMessage());
		}
	}

}
