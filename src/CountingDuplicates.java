import java.util.ArrayList;
import java.util.Scanner;

public class CountingDuplicates {
	public static int duplicateCount(String word) {
		String word2 = word.toLowerCase();
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> wordList = new ArrayList<String>();
		for (int i = 0; i < word2.length(); i++) {
			wordList.add(word2.substring(i, i + 1));
			if (!words.contains(word2.substring(i, i + 1))) {
				words.add(word2.substring(i, i + 1));
			}
		}
		int numWords = 0;
		System.out.println(words);
		System.out.println(wordList);
		for (int i = 0; i < words.size(); i++) {

			int counter = 0;
			for (int j = 0; j < wordList.size(); j++) {
				if (words.get(i).equals(wordList.get(j))) {
					counter++;
					if (counter == 2) {
						numWords++;
						System.out.println(numWords);

					}
				}
			}

		}
		return numWords;

	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				final String nextLine = scanner.nextLine();
				if (nextLine.trim().isEmpty())
					break;

				System.out.println(duplicateCount(nextLine));
			}
		}
	}
}
