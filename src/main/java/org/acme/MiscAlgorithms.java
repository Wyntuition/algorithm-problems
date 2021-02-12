package org.acme;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.IntStream;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class MiscAlgorithms { 

    /* 

    Practicing algorithms: 
        - Master big O
        - Implement the below basic data structures and algos
        - Try core problems for each section of algorithms/data structures/patterns
        - Practice additional related problems, focusing on quality not quantity, as problem-solving techniques are most important 
            - using the types of data structures
            - Using the concepts, especially time and space complexity
            - cover typical problems with standard coding solutions
        
    Flow: 
        - Listen to everything said as all/most needed, including their example; validate you understand it
            - Write down: example(s), inputs, output (key points, patterns as appropriate)
            - Clarify tou understand the question correctly
            - Be excited, keep trying when stuck, pay attention to interviewer, show how you think about the problem 
            - Ask questions (i.e. in-place or new, )
        - Brute force solution (don't code): 
            - Write solid (no edge case) example and walk through solution 
                - Think about inputs and outputs & solution algorithm 
                - use 1 meaty example, should not too small (complex enough to force thinking through it)
                - avoid edge cases as find the straightforward solution first
            - Develop algorithm solution going through example with steps to solve, mentioning patterns, data structure I should use, etc
                [- walk through what it does, go through example, try to formulate algorithm]
            - Walk through calculating what runtime is 
        - Look for optimizations (don't code)
            - BUD - bottlenecks, unnecessary work, duplicated work
            - potentially re-draw examples/walk thru solution in different way
            - once again, walk through calculating what runtime is to derive it (mention space vs time tradeoff)
        - Walk through best solution in detail
            - once again, walk through what it does and go through examples
            - don't skip steps 
            - talk out load a lot 
            - state implementation details, like data structures, traversal approach, offsets, etc
            - ned to be able to mostly picture your code before writing any  
        - Write the code
            - modularize from very beginning. I.E., write main function, and subfunctions for main tasks (i.e. for getPopulationPeak: getDetals, getRunningTotal)
                - skip implementing simple helper methods; generally modularize code top-down (not bottom up, i.e. writing helpers first)
            - abbreviate the right things: state what objects are without writing them out, skip implementing helper type methods at least at first since they can be trivial and not teach much about your ability (which modularization/clean code will help with)
            - use descriptive enough var names
        - Test 
            - Do a conceptual test, walking through code/logic, like a detailed code review. Mention non-standard code, hotspots like arithmetic and null nodes. 
                - talk out loud what code is doing 
            - Make small tests cases (just as effective than big, and much faster to walk through), then special and edge cases, then big test case if time/needed
            - track values of vars (incl. arrays/etc; diff color is helpful if whiteboard)
            - try some edge cases (i.e. duplicates, negatives, 0/1, ...), ask if I need to validate input 
            + error hotspots (i.e. off-by-one-errors, logic)
            - Finding bugs: think through source, avoiding trying to fix for just current test case 

            SOURCE: https://www.crackingthecodinginterview.com/uploads/6/5/2/8/6528028/cracking_the_coding_skills_-_v6.pdf
        
    Algos:
        From scratch (implementing core data structures; might be asked to modify one)
        Sort (i.e. quick sort, merge sort)
        search (i.e. binary search, breadth-first, depth-first search)
            search & insert implications; read,etc
        Traversal algorithms
            - CombineIntervals
        Greedy algorithms
        Dynamic programming
        Recursion & backtracking
     
    Data structures:
        Some from scratch
            Stack/queue via linked list and resizing array
        Arrays, linked lists
            sliding window
        Hash tables/maps/dictionaries 
            Precomputation [example problem: Find rectangle at origin with biggest sum]
        Trees (+ tries)
        Stacks & queues
            tradeoffs implementing via array vs linked list
        Graphs, vectors
        Heaps

    Concepts: 
        Big-O Time, 
        Big-O Space, 
        Recursion, Memoization / dynamic programming
        Probability, Bit Manipulation

        Subconcepts: 
            - best data structure for algo
            - sliding window
            - two pointers
            - backtracking
            - greedy
            - union find 
            - topological sort 
            - minimax
            - ordered map
            - line sweep
            - Rolling hash
            - suffix array
            

    Core problems:
        - repeated string, minimum distances, counting valleys, jumping on the clouds, sales by match
        - decode ways - https://leetcode.com/problems/decode-ways/solution/ - recursion, memoization 
        - to do: list rest

    */



    /////////// Level 1 

    /* PROBLEM: 2 arrays, find elements in common, when sorted (how sorting changes optimal solution)
        - Brute force: For each in first, go through all in second. 
            - Runtime: O(A*B) since arrays could be different sizes 
        - Optimize: 
            - Bottleneck: Every element of A, we're going O(B) work...searching. How to make faster? 
                Could:
                     throw elements from B into a hash set - O(B), then each lookup would be O(1) = O(A+B) runtime with O(1) space complexity
                     binary search tree - O(A log B) runtime & O(1) space complexity 
                     walk through A and B with 2 pointers (like merging 2 sorted array) - O(A+B) runtime, O(1) space complexity


    */

    /* PROBLEM: Find permutations of s within b
        Category: array 

    */

    /* PROBLEM: Next permutation (leetcode 31)
        -Tags: in-place

        Examples

        nums = 1,2,3 -> 1,2,3
        nums = 321 -> 1,2,3
        nums = 1,1,5 -> 1,5,1



    */


	/* PROBLEM: Permutations in a string (leetcode 46) 
        - Tags:backtracking

        Brute force
        Constraints: all unique numbers, num length < 6, # of #'s less than 11
        Examples
        nums = 1,2,3 -> 1,2,3  1,3 2  2,1,3  2,3,1  3,1,2  3,2,1 
        nums = 0,1 -> 0,1  1,0


        1,2,3
        1 -> 2,3  3,2 ... 

        Go through each number in array, then each other number, then to next number, and so on. 

        N(O^2) 


        Optimize: 

    */
    // static int[][] getAllPermutations(int[] numbers) {
    //     int lenth = numbers.length;
    //     int [][] permutations = new int[][];

    //     for (int i = 0; i < lenth; i++) {

    //     }
    // }







    /* Continuous Subarray Sum (LeetCode 523)
    Given a list of non-negative numbers and a target integer k, 
    write a function to check if the array has a continuous subarray 
    of size at least 2 that sums up to a multiple of k, that is, 
    sums up to n*k where n is also an integer.
        - Tags: core, 

        - Brute force

        Examples

        [23, 2, 4, 6, 7],  k=6
        Output: True
        Explanation: Because [2, 4] is a continuous subarray of size 2 and sums up to 6.

        [23, 2, 6, 4, 7],  k=6
        Output: True
        Explanation: Because [23, 2, 6, 4, 7] is an continuous subarray of size 5 and sums up to 42.





    */ 


    /* PROBLEM: Find rectangle at origin with biggest sum

         6   5  -9   2
        -2  -5  -2   7
         3  -2  10  13
        -8  -3   1  -2

    Subreactangle biggest sum that begins in top-left corner. 

    Brute force: Generate all rectangles, and pick one with biggest sum
        - adding up same things over and over (smaller rectangles, etc)
        
    Optimize: 
        - try reusing, store results for 3 rectangles, add two and subtract one
        


    */








    /* PROBLEM: Merge intervals (LeetCode)

        Given an array of intervals where intervals[i] = [starti, endi] (i.e. {1,2}, {2,4}...)
        merge all overlapping intervals, and return an array
        that cover all the intervals in the input.
        - Constraints: 2 points per interval

        - Category: graph as adjacency list in brute force code, linked list, overlapping values

        Solution 

        - Brute Force
        
        Basic example
        {[2,4]   [8,10]   [1,2]   [3,6]   [11,18], [15,18]}

            1. For each interval, go through all other intervals, determining if it can extend the current one. 
            2. If so, add to the current interval and save to a list of intervals, otherwise add new interval to the list.

            Runtime: O(N^2)

        - Optimize 

        If sorted first, then we only have to check the adjacent interval. 

        1,2    2,4   3,6   8,10   11,18
           1,4     
              1,6   8,10   11,18


            Runtime: sort - O(n log n), iteration - O(N) = O(n log n) dominant
            Space complexity: O(N) as we're storing intervals linearly depending on input

            


        Signature

        int[][] combineIntervals(int[][] intervals) {
        }
    }
    */ 
    static int[][] combineIntervals(int[][] intervals) {
        LinkedList<int[]> mergedIntervals = new LinkedList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for (int[] interval : intervals) {
            // add first interval or new one that isn't connected to current (current start interval is great than end of last interval)
            if (mergedIntervals.isEmpty() || interval[0] > mergedIntervals.getLast()[1] ) { // existing: 1,2, interval: 3,4
                mergedIntervals.add(interval);
            }
            // Overlap occurred
            // Expand the last recorded interval
            // Merge current and previous intervals - whichever right interval coordinate is higher
            else {
                mergedIntervals.getLast()[1] = interval[1];
            }
        }
        
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
    static String runCombineIntervals() {
        StringBuilder output = new StringBuilder("\n\nCombineIntervals\n");
        int[][] example1 = {{2,4}, {8,10}, {1,2}, {3,6}, {11,18}};
        output.append("\nExample 1:\n");
        var result1 = combineIntervals(example1);
        for (int[] x : result1) {
            for (int y : x) {
                output.append(y + " ");
            }
            output.append("\n");
        }
        
        return output.toString();
    }

    /* PROBLEM: 2 sum
        - Category: hash table

        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.

        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Output: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]
        
        - Brute force: Add each element to every other one, to check 2 sum. Runtime: O(N^2)
        
        [1,5,1,1,1,1,1,1,2,1,3], target = 5
    
        - Optimize: 

            Bottleneck: A*A

                Maintain a mapping of each array element to its index using a hash table, so we can just look up the index of a compliment, if it exists.  

                2-pass w/ hash table - 
                    We iterate the array to populate the hash table.
                    Then we iterate it again, checking if each element's compliment (target - n) exists. 
                    
                    We go through numbers array twice, so O(n). Each hash table lookup is O(1). Space complexity is O(n).

                BONUS, even better way? (see below code)
            
            Algorithm & data structures: 
                index for beginning of window; loop for each element at index
    */    

    // Example: target sum 5 for [1,5,1,1,1,1,1,1,2,1,3]
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i); // i.e. {1, 0}, {5, 1}, {1, 2}, etc
        }
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];  // i.e. 5 - 1 = 4, 
            if (map.containsKey(complement) && map.get(complement) != i) { // i.e. for numbers[i] = 1, does 4 exist which would be the compliment? (numbers[1] + 4 = target of 5)
                return new int[] { i, map.get(complement) };
            }
        }
        return new int[] {0,0};
    }
    
    public static String runTwoSum() {
        StringBuilder output = new StringBuilder("\n\nTwo Sum:\n");
        
        int[] example1 = {1,5,1,1,1,1,1,1,2,1,3};
        var example1Answer = twoSum(example1, 5);
        output.append("Indexes that yield target sum 5 for [1,5,1,1,1,1,1,1,2,1,3]: " + example1Answer[0] + ", " + example1Answer[1]);
        
        int[] exampleNoSum = {1,1,1,1,1,1,1,1,1,1,1};
        var answer = twoSum(exampleNoSum, 5);
        output.append("\n No sum found: " + + answer[0] + ", " + answer[1]);
        
        return output.toString();
    }

    /* 1-pass w/ hash table - 
        While we iterate and inserting elements into the table, we also look back to check if current element's complement already exists 
        in the table. If it exists, we have found a solution and return immediately.
        
        We go through the numbers array once, so O(n). Each hash table lookup is O(1). Space complexity is O(n).
    */
    public int[] twoSumOnePassHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    /* PROBLEM: Verifying an Alien Dictionary (Leetcode 953)  
    In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters. 
    
    Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographicaly in this alien language.
        - Tags: easy facebook

        - inputs: array of strings, string for alphabet; output: true/false
        - constraints: word length <=100, # of words <= 20, alphabet length == 26, english lowercase letters

        - Brute Force:

        Example:
        words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
        Output: true
        Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.




    */







    /* PROBLEM: sorted square array
        Category: 
            - arrays, sorting in place so not O(N log N)
            - clever points starting at ends of array since sorted with negatives, putting highest values starting at the end of the new sorted square array
    */
    
    /* PROBLEM: Merge 2 sorted arrays
    */ 

    /* PROBLEM: How would you output all anagrams of a word, given a list of all english words, from a server (how does being on server change optimal approach? It let's us pre-compute and sort then group words so only need to search those start with x,y,z letters)?  
    */




    /* PROBLEM: Divide two integers (LeetCode)
        - Category: hardest medium; bit-shifting, exponential search (often used for searching sorted spaces of unknown size for the first value that past a particular condition)

        - Brute force: 

        Dividend    Divisor
        20          5       = 4
        10          3       = 3.33 -> 3
        7           -3      = -2
        -4          -2      = 2?
        
            - Steps to solve: 

            For each dividend, add the divisor to itself until it's less than the divisor's amount over the dividend. 
            How many times minus one is the answer.

            - Walk through first example, steps/signature: 

            20, 5: while loop adding 5 to itself & incrementing the number of times it did, until it's >= 20.
                Return the number of time. 

            - Runtime: O(N)

        - Optimize: not sure, but here are added cases

        edge
        0           1       = 0
        1           1       = 1
        1000        2       = 500

    */ 
    
    static int manualDivide(int dividend, int divisor) {

        int sum = 0;
        int count = 0;
        while (sum < dividend) {
            sum += Math.abs(divisor);
            count++;
        }

        return count;
    }

    static String runManualDivide() {
        StringBuilder output = new StringBuilder();
        output.append("\n\nManualDivide\n 20 & 5: " + manualDivide(20, 5));
        output.append("\n 7 & -3: " + manualDivide(7, -3));
        return output.toString();
    }


    /* PROBLEM: Given a list of flight start and end times, determine the max numbers of airplanes at the same
        - Tags: Max/most frequent value: Overlapping arrays, tallying linearly


        1. Examples

        7am - 3pm           |   |
        8am - 11:30pm       |
        1pm - 6pm               |
        8pm - 10pm

        1b. Brute force steps (draw lines)

        When a flight's end time is after another's start time, tally plane in the air that hour (or half hour?)

        For each end time, go through each 


    */

    /* PROBLEM (with example flow): Group of people with birth and death years, find the year with the highest population. From https://vimeo.com/158532188, pw: FB_IPS
        - Tags: Max/most frequent value: Overlapping arrays, tallying linearly
        
        2000-2010, 1980-1985, 1975-2003 // too unrealistic examples, not generic & special case - all alive at same time, not big enough sample, plus sorted, so add:
        1803-1809, 1750-1869, 1840-1935, 1975-2005, 1975-2003, 1803-1921, 1894-1921


        Step: draw out examples:

        2000-2010 
        1980-1985 
        1975-2003
        1803-1809 
        1750-1869 
        1840-1935 
        1975-2005 
        1975-2003 
        1803-1921 
        1894-1921

        Brute force: iterate every year from min birth year to max death year, 

            Cost:   

        Optimize: 
            Arranging the examples in a timeline, since that's natural, helps show that: 
                - we can linearly iterate years and increment birth and death counts, 
                - then sum that for each year and track the year with most people alive
                - note: to find the max people alive year, we only need to calculate between the min birth and max birth years, as max death year won't add to max people alive

            So we will implement: 
                - array, with entry for each year starting with min birth thru max birth, 
                - 


        

            Cost: O(P+Y), people alive/dead, sum of people by year 

            Test
                logic: 
                check the things that tend to cause problems (i.e math, edge cases, when loop doesn't execute, precondition checks)
                use small test cases 

    */





    /* PROBLEM: Partition Equal Subset Sum (416 on LeetCode)
        - Category: recursion with dynamic programming


    */






   

    /// Problem: Longest substring without repeating
    ///
    /// Concepts: sliding window via hashset, 
    /// Complexity: 
    /// https://leetcode.com/problems/longest-substring-without-repeating-characters/solution/


    /// Problem: Sales by Match
    /// Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale. 
    /// Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
    /// For example, array = [1,2,1,2,1,3,2] says there are 7 socks and each number represent specific colors. 2 pairs can be created from 1's and 2's.

    public static int matchingPairs(int numberOfSocks, int[] sockColors) {
        return 0;
    }

    public static void runMatchingPairs() {
        int[] sockColors = {1,2,1,2,1,3,2};
        System.out.println("matchingPairs, expecting 2, result: " + matchingPairs(2, sockColors));
    }

    /// Problem: Repeated string
    /// There is a string of lowercase English letters that is repeated infinitely many times. 
    /// Given an integer, find and print the number of letter a's in the first letters of the infinite string.
    public static long repeatedString(String s, long n) {

        // repeat string, parse for a's & add to counter

        // generate string
        //   'abc', 2: 'abc' + 'abc', 3: 'abcabc' + 'abc', 4: 'abcabcabc' + 'a' & done b/c length = 10

        StringBuilder generatedString = new StringBuilder();
        long repetitions = n / s.length() + 1; //todo: round up? Ensure one more rep for partial string
        for (int i = 0; i <= repetitions; i++) {
            generatedString.append(s);
        }

        // Count number of a's


        // Calculate number of a's
        /// count number of a's in input string, multiply by full reps, calculate partial

        return 0;
    }

    public static void runRepeatedString() {
        repeatedString("aba", 10); // expect: 7, because there are 7 a's in the first 10 characters of the repeated string
            // BRUTE FORCE: gen string, parse
            // EQUATION: abaabaabaa, 2 per rep, 10 is 3 reps + 1 a = 7
        repeatedString("aba", 1000000000);
    }

    /* 
    Problem: given binary tree, get average at each level
        - depth-first traversal, collect numbers by level to hash table (level & numbers), go through hash table and calculate average
    */

    /*
    Problem: Minimum distances
    The distance between two array values is the number of indices between them. 
    Given a, find the minimum distance between any pair of equal elements in the array. If no such value exists, return -1.
    */

    public static void runMinimumDistances() {
        //minimumDistances(6, [7, 1, 3, 4, 1, 7]]); // expect: 3
          
    }






    public static Boolean isOneEditApart(String s1, String s2) {
        Integer characterOff = -2;

        String longestString = "";
        String shortString = "";
        if (s1.length() > s2.length()) {
            longestString = s1;
            shortString = s2;
        }
        else { 
            longestString = s2;
            shortString = s1;
        }

        for (int i =  0 ; i < longestString.length(); i++) {
            if (shortString.length() <= i) {
                return false;
            }

            if (longestString.charAt(i) != shortString.charAt(i)) {
                if (characterOff > -1) {
                    return false;
                }
                else {
                    characterOff = i;
                }
            }
        }
        return true;
    }

    // Using square root to calculate if a number is prime is dramatically faster
    public static String runIsPrime() {
        var output = new StringBuilder();

        long start = System.currentTimeMillis();
        var isPrime = isPrime(1000000007);
        long end = System.currentTimeMillis();
        output.append("\n\nIs prime: " + isPrime + ", time: " + (start - end));

        // start = System.currentTimeMillis();
        // isPrime = isPrimeSlow(1000000007);
        // end = System.currentTimeMillis();
        // output.append("\nIs prime slow: " + isPrime + ", time: " + (start - end));

        // start = System.currentTimeMillis();
        // isPrime = isPrimeSlow2(1000000007);
        // end = System.currentTimeMillis();
        // output.append("\nIs prime slow 2: " + isPrime + ", time: " + (start - end));

        return output.toString();
    }

    public static Boolean isPrimeSlow2(long n) {
        return IntStream.rangeClosed(2, (int) n)
                        .noneMatch(l -> (n % l == 0));

    }

    public static Boolean isPrimeSlow(long n) {    
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }   
        return true;
    }

    public static Boolean isPrime(long n) {    
        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                        .noneMatch(l -> (n % l == 0));
    }


    /*** Linked Lists: Min Stack ***

    Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.
    

    Example 1:

    Input
    ["MinStack","push","push","push","getMin","pop","top","getMin"]
    [[],[-2],[0],[-3],[],[],[],[]]

    Output
    [null,null,null,null,-3,null,0,-2]

    Explanation
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    minStack.getMin(); // return -3
    minStack.pop();
    minStack.top();    // return 0
    minStack.getMin(); // return -2

    Solution:
    To make constant time of getMin(), we need to keep track of the minimum element for each element in the stack. Define an element class that holds element value, min value, and pointer to elements below it.

    https://www.programcreek.com/2014/02/leetcode-min-stack-java/. Also see regular stack implementation in Programming Interviews Exposed, 30

    */

    public String runMinStack() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(5);
        minStack.push(0);
        minStack.push(-100);
        return "\n\n--Min stack:\n getMin: " + String.valueOf(minStack.getMin());
    }

    // Linked list data structure structure for min stack to track the min element along with the top value
    class Element {
        public int value;
        public int min;
        public Element next;
     
        public Element(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }

    public class MinStack {

        private Element top;

        /** initialize your data structure here. */
        MinStack() { }
        
        void push(int x) {
            if (top == null) {
                top = new Element(x, x);
            }
            else {
                Element e = new Element(x, Math.min(x, top.min));
                e.next = top;
                top = e;
            }
        }
        /*
            -2 
            +0: 
        */
        
        void pop() {
            
        }
        
        int top() {
            return top.value;
        }
        
        int getMin() {
            return top.min;
        }
    }


    /*** Linked lists: Mth-to-last Element of a Linked List (Programming Interviews Exposed, 41)

    Given a singly-linked list, devise a time and space efficient algorithm to find it, handling relevant error conditions. When m=0, the last element of the list is returned. 

    */


    /*** Linked lists: List Flattening (Programming Interviews Exposed, 44)

    /*** Linked lists: Null or cycle (Programming Interviews Exposed, 47)

    */






    /**** 2D Spiral Array ***
    
    Find the pattern and complete the function:

    int[][] spiral(int n);
    where n is the size of the 2D array.
    Sample Result
    input = 3
    123
    894
    765

    input = 4
    01 02 03 04
    12 13 14 05
    11 16 15 06
    10 09 08 07
    */
    // public static Boolean spiralArray(int n) {

    //     // row, number
    //     // 

    // }


    /// ## Trees

    /* PROBLEM: Binary Tree Right Side View (199 on LeetCode)
    
    Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.    
    
    - Tags: binary tree, tree traversal, depth-first search, breadth-first search 

    Example:

    Input: [1,2,3,null,5,null,4]
    Output: [1, 3, 4]
    Explanation:

    1            <---
    /   \
    2     3         <---
    \     \
    5     4       <---
    */
    
     // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        throw new UnsupportedOperationException();
    }
















    /*
    Symmetric Tree

    Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

    For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

        1
       / \
      2   2
     / \ / \
    3  4 4  3
    
    But the following [1,2,2,null,3,null,3] is not:

        1
       / \ 
      2   2
      \    \
       3    3
    

    Follow up: Solve it both recursively and iteratively.
    */
    public static Boolean isSymmetricTree(int[] tree) {
        

        
        return null;       
    }










    /*
    Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

    For example:
    Given binary tree [3,9,20,null,null,15,7],
        3
    / \
    9  20
        /  \
    15   7
    return its level order traversal as:
    [
    [3],
    [9,20],
    [15,7]
    ]
    */

    /* Minimum depth of a binary tree 

    Given a binary tree, find its minimum depth.

    Input:
            1
          /   \
         3     2
        /
       4           

    Output: 2

    Explanation:
    Minimum depth is between nodes 1 and 2 since
    minimum depth is defined as  the number of nodes
    along the shortest path from the root node down
    to the nearest leaf node.

    Example 2:

    Input:
                10
            /     \
            20       30
            \        \   
            40        60 
                    /
                    2 

    Output: 3

    Explanation:
    Minimum depth is between nodes 10,20 and 40.

    Your Task:  
    You don't need to read input or print anything. Complete the function minDepth() which takes the root node as an input parameter and returns the minimum depth.

    Expected Time Complexity: O(N)
    Expected Auxiliary Space: O(height of the tree)

    Constraints:
    1 ≤ N ≤ 10^5
    */
    // int minDepth(Node root)
	// {
	//     //code here
    // }

    




    /*

    Given a binary tree, find its maximum depth.

    The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

    Note: A leaf is a node with no children.

    Example:

    Given binary tree [3,9,20,null,null,15,7],

        3
    / \
    9  20
        /  \
    15   7
    return its depth = 3.




    Given preorder and inorder traversal of a tree, construct the binary tree.

    Note:
    You may assume that duplicates do not exist in the tree.

    For example, given

    preorder = [3,9,20,15,7]
    inorder = [9,3,15,20,7]
    Return the following binary tree:

        3
    / \
    9  20
        /  \
    15   7







    Given a binary tree, determine if it is height-balanced.

    For this problem, a height-balanced binary tree is defined as:

    a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

    
    Example 1:


    Input: root = [3,9,20,null,null,15,7]
    Output: true
    Example 2:


    Input: root = [1,2,2,3,3,null,null,4,4]
    Output: false
    Example 3:

    Input: root = []
    Output: true
    

    Constraints:

    The number of nodes in the tree is in the range [0, 5000].
    -104 <= Node.val <= 10^4







    Given a binary tree, flatten it to a linked list in-place.

    For example, given the following tree:

        1
    / \
    2   5
    / \   \
    3   4   6
    The flattened tree should look like:

    1
    \
    2
    \
        3
        \
        4
        \
            5
            \
            6








    */

    /* Merge two binary trees (Leet 617)
    
    Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

    You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

    Example 1:

    Input: 
        Tree 1                     Tree 2                  
            1                         2                             
           / \                       / \                            
          3   2                     1   3                        
         /                           \   \                      
        5                             4   7                  
    Output: 
    Merged tree:
            3
            / \
           4   5
          / \   \ 
         5   4   7
    
    Note: The merging process must start from the root nodes of both trees.




    Brute force: 
    - standard example (above), then walk thru

    1. traverse both trees (preorder fashion)
    2. at each step, check if current node != null for both
        If true, 
            a. add the values and update this in the first tree
        If false,
            a. if either the left or right child in the next to call to mergeTrees() is null, return the child that isn't null, to be added as a child to the calling parent in the first tree
    3. The first tree will represent the final merge
    
    - walk through example

    









     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    // class Solution {
    //     public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            
    //     }
    // }


    /* findLongestSubArray ***

    Possible approaches:
    - Brute force: Find longest contigous subarray, for each number, loop through all the numbers and find given sum, and compare against current max lenth you're tracking. 
    - Want to only sub loop through array once, sliding window approach. 
        left & right pointer; move right pointer and add to sum & compare. Once over sum. move left pointer (window), to prevent overlapping subarray comparisons. Right & left vars to track position in array.


    Example: 
    arr = [1,2,3,4,5,6,7,8,9,10]
    s = 15, r = 1,5

    */
    public static int[] findLongestSubArray(int s, int[] arr) { 
        int[] result = new int[] { -1 };

        int sum = 0; //for subarray
        int left = 0; //pointers
        int right = 0;

        while (right < arr.length) {
            // add sum
            sum += arr[right];
            //if goes over sum, move window (left pointer)
            while (sum < s && left < right) {
                // decrement number removed as left pointer moves right
                sum -= arr[left++];
            }
            // if sum equals the sum we're looking for, and is it a longer subarray
            //if (sum == s && (result.length == 1 || result[1] - result[0] < right - left)) {
                if (sum == s && (result.length == 1 || result[1] - result[0] < right - left)) {
                //System.out.println("Result range: " + (result[1] - result[0]) + ", pointer range: " + (right - left));
                result = new int[] {left + 1, right + 1};
            }
            right++; // otherwise increment the right boundary
        }
        return result;
    }

    public static String runFindLongestSubArray() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] longestSubArray = findLongestSubArray(15, arr);
        return "\n\nLongest subarray in [1,2,3,4,5,6,7,8,9,10]: " + longestSubArray[0] + ", " + longestSubArray[1];
    }


    // Basic Calculator II
    // https://leetcode.com/problems/basic-calculator-ii/solution/

    public static String runBasicCalculatoII_Stack() {
        String expression1 = "3+4*4";
        return Integer.toString(basicCalculatorII_Stack(expression1)); // 23
    }

    public static int basicCalculatorII_Stack(String expression) {
        if (expression == null || expression.isEmpty()) return 0;
        int expressionLength = expression.length();
        Stack<Integer> stack = new Stack<Integer>();

        int currentNumber = 0;
        char operation = '+';
        for (int i = 0; i < expressionLength; i++) {
            char currentChar = expression.charAt(i);
            if (Character.isDigit(currentChar)) {
                currentNumber = (currentNumber * 10) - (currentChar - '0');
            }
            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == expressionLength - 1) {
                if (operation == '+') {
                    stack.push(currentNumber);
                }
                if (operation == '-') {
                    stack.push(-currentNumber);
                }
                if (operation == '*') {
                    stack.push(stack.pop() * currentNumber);
                }
                if (operation == '/') {
                    stack.push(stack.pop() / currentNumber);
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }



    // Tree Traversals : inorder, preorder, postorder
        //    Algorithm Inorder(tree)
        //    1. Traverse the left subtree, i.e., call Inorder(left-subtree)
        //    2. Visit the root.
        //    3. Traverse the right subtree, i.e., call Inorder(right-subtree)
    String treeTraversalPostOrder(Node node) {
        if (node == null) return "";

        treeTraversalPostOrder(node.left);
        treeTraversalPostOrder(node.right);
        return node.key + " ";
    }
    String runTreeTraversal() {
        Node node = new Node(1);
        Node node2 = new Node(2);

        node.left = new Node(3);
        node.right = node2;

        return treeTraversalPostOrder(node);
    }

    class Node 
    { 
        int key; 
        Node left, right; 
    
        public Node(int item) 
        { 
            key = item; 
            left = right = null; 
        } 
    } 
    
    /* All Nodes Distance K in Binary Tree (Leet 863, https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/solution/)
    - Category: depth & breadth-first search, binary tree, queue, hashset 

    We are given a binary tree (with root node root), a target node, and an integer value K.

    Return a list of the values of all nodes that have a distance K from the target node.  The answer can be returned in any order. Use TreeNode class here.
    

    Example 1:

    Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, K = 2

    Output: [7,4,1]

    Explanation: 
    The nodes that are a distance 2 from the target node (with value 5)
    have values 7, 4, and 1.

        3
       / \
      5   1
    / |   | \
   6  2   0  8
     / \
    7   4    

    */
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        
        return null; 
    }


}