package dsa;

import java.util.HashMap;
import java.util.Stack;

public class Brackets {
    public static boolean matchBrackets(String bracketString){
        HashMap <Character, Character> brackets = new HashMap<>();
        brackets.put('{', '}');
        brackets.put('[', ']');
        brackets.put('(', ')');
        brackets.put('<', '>');

        if (bracketString.length() == 0){
            return false;
        }

        Stack <Character> characterStack = new Stack<>();
        for (int i = 0; i < bracketString.length(); i++) {
            char character = bracketString.charAt(i);
            if(brackets.containsKey(character)){
                characterStack.push(character);
            } else if (brackets.containsValue(character)) {
                if(!(characterStack.isEmpty()) && brackets.get(characterStack.peek()) == character){
                    characterStack.pop();
                }
                else {
                    return false;
                }

            }
            else{
                return false;
            }
        }
        return characterStack.isEmpty();
    }

}

