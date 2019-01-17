package fixedLengthString;


import java.util.ArrayList;
import java.util.List;

public class StringStretcher {

	public static String stretch(String str) {

		String[] sArray = str.split(",");
		StringBuilder fixed = new StringBuilder();

		for (String s : sArray) {
			StringBuilder builder = new StringBuilder(s);
			for (int i = 0; i < 100 - s.length(); i++) {
				builder.append(" ");
			}
			fixed.append(builder);
		}

		return fixed.toString();
	}

	public static List<String> shrink(String str) {
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < str.length() / 100; i++) {
			if (i == 0) {
				list.add(str.substring(i, 100).trim());
			} else {
				list.add(str.substring(i * 100, (i + 1) * 100).trim());
			}

		}

		return list;
	}

	public static void main(String[] args) {
		String string = "get,orders/ids";

		String fixed = stretch(string);
		System.out.println(fixed.length());

		List<String> shrunk = shrink(fixed);
		for (String str : shrunk) {
			System.out.println(str);
		}
	}
}
