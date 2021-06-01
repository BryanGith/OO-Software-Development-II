package domein;

import java.util.*;

public class Cryptografie {
    private Deque<Character> stack;
    private Queue<Character> queue;

    private static final Character[] KLINKERS_ARR = {'a', 'e', 'i', 'o', 'u', 'y'};
    private static final Set<Character> KLINKERS_SET = new HashSet<>(Arrays.asList(KLINKERS_ARR));

    public String codeerBericht(String origineel) {
        stack = new ArrayDeque<>();
        queue = new ArrayDeque<>();

        int index = 0;
        while (index < origineel.length()) {
            Character character = null;
            while (index < origineel.length()) {
                character = origineel.charAt(index++);
                if (KLINKERS_SET.contains(Character.toLowerCase(character)))
                    break;
                stack.push(character);
            }
            while (!stack.isEmpty()) {
                queue.offer(stack.pop());
            }
            if (KLINKERS_SET.contains(Character.toLowerCase(character)))
                queue.offer(character);
        }
        String gecodeerd = "";
        while (!queue.isEmpty()) {
            gecodeerd += queue.poll();
        }
        return gecodeerd;
    }

}
