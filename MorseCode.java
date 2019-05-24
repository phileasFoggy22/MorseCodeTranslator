import java.util.HashMap;

public class MorseCode {
	private HashMap<String, String> morseCode = new HashMap<String, String>();

	public MorseCode(HashMap<String, String> morseCode) {
		this.setMorseCode(morseCode);
	}

	public HashMap<String, String> populateMorseCode(HashMap<String, String> morseCode) {

		String[] english = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ",", ".",
				"?" };

		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
				"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "--..--", ".-.-.-",
				"..--.." };

		for (int i = 0; i < english.length; i++) {
			morseCode.put(morse[i], english[i]);
		}

		return morseCode;
	}

	public HashMap<String, String> getMorseCode() {
		return morseCode;
	}

	public void setMorseCode(HashMap<String, String> morseCode) {
		this.morseCode = morseCode;
	}

	public String translateMorse(String morseCodeWord, HashMap<String, String> morseCode) {
		String morseWords = "";
		if (morseCodeWord.length() == 0) {
			morseWords = "";
		} else {
			morseWords = (String) morseCode.get(morseCodeWord);
		}

		System.out.print(morseWords);
		return morseWords;
	}
}
