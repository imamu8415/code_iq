package code_iq;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://codeiq.jp/q/2537
 * @author imamura
 *
 */
public class AsqiiTo36 {

	public static void main(String[] args) throws IOException {
		try (Scanner in = new Scanner(System.in)) {
	 		List<String> strList = new ArrayList<String>();
			while (in.hasNext()) {
				String str = in.nextLine();
				strList.add(str);
			}
			if (strList.isEmpty()) {
				return;
			}
			StringBuilder builder = new StringBuilder();
			for (String str : strList) {
				str = str.replace(".", "0");
				str = str.replace("#", "1");
				builder.append(str);
			}
			String binary = builder.toString();
			int i = Integer.parseInt(binary, 2);
			BigInteger gi = new BigInteger(Integer.toString(i));
			System.out.println(gi.toString(36));
		}
	}

}
