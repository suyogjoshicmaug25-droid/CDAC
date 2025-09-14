// Problem 10: Electronic Voting System

import java.util.*;
class ElectronicVotingSystem{
	public static void main(String[] args){
		HashSet<Integer> voters = new HashSet<>();
		
		int []list = {201, 202, 203, 202};
		
		for(int a: list){
			voters.add(a);
		}
		
		System.out.println("Total voters: "+voters.size());
	}
}
/*
D:\CDAC\OOPJ\Assignment 5>javac ElectronicVotingSystem.java

D:\CDAC\OOPJ\Assignment 5>java ElectronicVotingSystem
Total voters: 3
*/