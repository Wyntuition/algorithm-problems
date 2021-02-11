package org.acme;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesisTry {

    private HashMap<Character, Character> mappings;
    
    public ValidParenthesisTry() {
        this.mappings = new HashMap<>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    // public boolean isValid(String input) {
    //     var stack = new Stack<Character>();

    //     for (int i=0; i < input.length(); i++) { 
    //         var c = input.charAt(i);

    //         if (this.mappings.containsKey(c)) {
    //             stack.pop();
    //         }

    //         if (c == '{') {
    //             stack.push(input.charAt(i));
    //         }
    //     }
    // }
}
