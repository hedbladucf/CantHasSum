/*
 *  Name: Oscar Hedblad
 *  PID: o3415424
 *  COP3503 - Computer Science II
 *  Professor: Dr Sean Szumlanski
 *  
 *  Description: An O(n) algorithm that will take in an array
 *  and calculate the lowest possible result that any subset
 *  of the array CANNOT sum to.
 */

import java.io.*;
import java.util.*;

public class Program1 {
	
	public static int CantHasSum(int[] array){
		// Declaring result variable.
		int result = 0;
		/* Iterating through the sorted array in O(n) time until
		 it has been through the entire length of the array. */
		for(int i = 0; i < array.length; i++){
			if((array[i] - result) > 1){
				return result + 1;
			}
			/* Result gets the value stored in result plus
			 the value stored in the i:th position of the array. */
			result += array[i];
		}
		/* If the result is never found, the program will
		 return the sum + 1; which will always be the correct
		 sum for an array that */
		return result + 1;
	}
}

