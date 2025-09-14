// Problem 23: Browser History Management

import java.util.*;
class BrowserHistoryManagement{
	public static void main(String[] args){
		
		Stack<String> history = new Stack<>();
		
		history.push("Google");
		history.push("YouTube");
		history.push("GFG");
		
		System.out.println(history);
		history.pop();
		System.out.println("Current history: "+history);
	}
}
