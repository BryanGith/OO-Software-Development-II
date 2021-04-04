package domein;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class Cryptografie {
	private Deque<Character> stack = new ArrayDeque<>();
	private Deque<Character> queue = new ArrayDeque<>();

	private final Character[] KLINKERS_ARR = { 'a', 'e', 'i', 'o', 'u', 'y' };
	private final Set<Character> KLINKERS_SET = new HashSet<>(Arrays.asList(KLINKERS_ARR));

	public String codeerBericht(String origineel) {
		return origineel;

	}
}
