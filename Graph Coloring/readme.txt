CHASE ANZELC
Algorithm Design
ASSIGNMENT 2

PROJECT INFORMATION
In this assignment I created a program to color a graph using stack.
The program outputs the color of nodes if it is colorable by the number of colors 
inputed. If it is not colorable the program will display that it is not.

HOW TO DOWNLOAD FROM BLACKBOARD

1.Download the Assignment2.zip from blackboard to your desktop.
2.Unzip the Assignment2.zip to the desktop.


HOW TO COMPILE
1. open the command prompt
2. type "cd Desktop" to change directory to the desktop 
3. type "cd Assignment2\Assignment2" to change directory to the Assignment2 folder
4. then type "javac Color.java"

//if you want to download to a different location just change directories to that 
location instead and then run line 4


HOW TO RUN
1. type "java Color data1.txt 3" to run the program for the data1.txt file with number of colors as 3
	Expected output -> The graph is not 3 colorable
2. type "java Color data1.txt 4" to run the program for the data1.txt file with number of colors as 4
	Expected output -> 
		Node = 0 Color = C2
		Node = 1 Color = C3
		Node = 2 Color = C4
		Node = 3 Color = C3
		Node = 4 Color = C2
		Node = 5 Color = C1
3. type "java Color data2.txt 3" to run the program for the data2.txt file with number of colors as 3
	Expected output -> 
		Node = 0 Color = C1
		Node = 1 Color = C3
		Node = 2 Color = C1
		Node = 3 Color = C3
		Node = 4 Color = C2
		Node = 5 Color = C3
		Node = 6 Color = C2
		Node = 7 Color = C2
		Node = 8 Color = C1
		Node = 9 Color = C1

