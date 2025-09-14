// Problem 21 : Text Editor Undo System


 import java.util.*;
 class TextEditorUndoSystem{
	 public static void main(String[] args){
		  
		  Stack<String> s = new Stack<>();
		  s.push("Type A");
		  s.push("Type B");
		  s.push("Delete");
		  
		  System.out.println(s);
		  System.out.println(s.pop());
		  System.out.println("Current actions: "+s);
	 }
 }
 /*
 D:\CDAC\OOPJ\Assignment 5>javac TextEditorUndoSystem.java
D:\CDAC\OOPJ\Assignment 5>java TextEditorUndoSystem

[Type A, Type B, Delete]
Delete
Current actions: [Type A, Type B]
 */