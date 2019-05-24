import java.util.ArrayList;
import java.util.HashMap;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> morseCode = new HashMap<String, String>();
		MorseCode m1 = new MorseCode(morseCode);
		m1.populateMorseCode(morseCode);

		String morseToTranslate = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
		ArrayList<String> morseToTranslateList = new ArrayList<String>();
		String[] morseToTranslateWords;
		String[] morseToTranslateLetters;
		String translatedLetter;
		morseToTranslateWords = morseToTranslate.split("/");

		for (String e : morseToTranslateWords) {
			morseToTranslateLetters = e.split(" ");
			System.out.print(" ");

			for (String m : morseToTranslateLetters) {
				translatedLetter = m1.translateMorse(m, morseCode);
				// System.out.print(translatedLetter);
			}

		}

	}

}
