package org.acme;

public class MiscAlgorithmSolutions { 

    /* PROBLEM: Merge intervals (LeetCode)
        Given an array of intervals where intervals[i] = [starti, endi], 
        merge all overlapping intervals, and return array  
        that cover all the intervals in the input.
        - Category: graph as adjacency list in brute force code, linked list, overlapping values

        
        - Constraints: 2 points per interval

        - Brute Force

        2,4   8,10   1,2   3,6   11,18

        - For each interval, go through all other intervals, determining if it can extend the current one. 
        If so, add to the current interval and save to a list of intervals, otherwise add new interval to the list.

            - Runtime: O(N^2)

        - Optimize 

        If sorted first, then we only have to check the next interval. 

        1,2    2,4   3,6   8,10   11,18
           1,4     
              1,6   8,10   11,18


            Runtime: sort - O(n log n), iteration - O(N); 
            Space complexity: O(N) as we're storing intervals linearly depending on input
    */ 
    // int[][] combineIntervals(int[][] intervals) {
        
    // }



}