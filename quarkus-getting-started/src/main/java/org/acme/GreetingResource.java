package org.acme;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return runAlgorithms();
    }

    private String runAlgorithms() {
        var output = new StringBuilder();
        output.append(runQuickSort());

        var validParenthesis = new ValidParenthesis();
        output.append("\nValidParenthesis.isValid=" + validParenthesis.isValid("(())"));
        output.append("\nValidParenthesis.isValid=" + validParenthesis.isValid("([()])"));
        output.append("\nValidParenthesis.isValid=" + validParenthesis.isValid("([(]))"));

        output.append("\n\nisOneEdit, dog, dogs: " + MiscAlgorithms.isOneEditApart("dog", "dogs"));
        output.append("\n\nisOneEdit, dog, cat: " + MiscAlgorithms.isOneEditApart("dog", "cat"));
        output.append("\n\nisOneEdit, dog, doggy: " + MiscAlgorithms.isOneEditApart("dog", "doggy"));
        output.append("\n\nisOneEdit, fog, bog: " + MiscAlgorithms.isOneEditApart("foggy", "boggy"));

        output.append(MiscAlgorithms.runIsPrime());

        output.append(MiscAlgorithms.runFindLongestSubArray());

        var miscAlgorithms = new MiscAlgorithms();
        output.append(miscAlgorithms.runMinStack());

        output.append("\n\nrunBasicCalculatoII_Stack: " + MiscAlgorithms.runBasicCalculatoII_Stack());

        output.append(MiscAlgorithms.runTwoSum());

        output.append(MiscAlgorithms.runManualDivide());

        output.append(MiscAlgorithms.runCombineIntervals());

        //output.append(miscAlgorithms.runTreeTraversal());

        return output.toString();
    }

	private String runQuickSort() {
        var output = new StringBuilder("Running sorting algorithms...\n");

        QuickSort quickSort = new QuickSort();

        Integer[] unsortedInt = new Integer[]{0, 5, 9, 2, 1, 3, 4, 8, 6, 7};
        output.append(Arrays.toString(quickSort.sort(unsortedInt)));
        output.append("\n");

        Character[] unsortedChar = new Character[]{'f', 'h', 'c', 'a', 'b', 'd', 'g', 'e'};
        output.append(Arrays.toString(quickSort.sort(unsortedChar)));

        return output.toString();
    }

}