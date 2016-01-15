package code_iq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * https://codeiq.jp/q/2613
 * @author imamura
 *
 */
public class EnglishSentenceSplit {

	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			String str = in.readLine();
			String[] sentences = str.split("\\s");
			StringBuilder builder = new StringBuilder();
			String prevSentence = null;
			List<String> sentenceList = Arrays.asList(sentences);
			for (String sentence : sentenceList) {
				sentence = sentence.trim();
				if (prevSentence != null && isEnd(prevSentence)) {
					System.out.println(builder.toString());
					builder.setLength(0);
					prevSentence = null;
				}
				builder.append(sentence);
				builder.append(" ");
				prevSentence = sentence;
			}
			if (builder.length() != 0) {
				System.out.println(builder.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static boolean isEnd(String sentence) {
		if (sentence.matches("[0-9]*\\.")) {
			return false;
		}
		sentence = sentence.toLowerCase();
		if (sentence.endsWith("mr.")) {
			return false;
		}
		if (sentence.endsWith("ms.")) {
			return false;
		}
		if (sentence.endsWith("mrs.")) {
			return false;
		}
		if (sentence.endsWith("mt.")) {
			return false;
		}
		if (sentence.endsWith(".")) {
			return true;
		}
		if (sentence.endsWith("?")) {
			return true;
		}
		if (sentence.endsWith("!")) {
			return true;
		}
		return false;
	}

}
