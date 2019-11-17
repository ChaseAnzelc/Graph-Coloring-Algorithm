import java.io.*;
import java.util.Scanner;
import java.util.Stack;


//Chase Anzelc
//Algorithm Design 
//4/18/2019

class ReadData {
	
	public Stack<String> stack = new Stack<String>();
	public int V;

	public ReadData(String filename) {
		File file = new File(filename);
		
		//Scanner input;
		try {
			Scanner input = new Scanner (file);
			
			V = Integer.parseInt(input.nextLine());
			
			
			for(int i = 0; i < V; ++i)
			{
				String node = "";
				
			    for(int j = 0; j < V; ++j)
			    {
			        if(input.hasNextInt())
			        {
			        	//remove each node from graph
			        	node += Integer.toString(input.nextInt());
			        }
			    }
			    //place node onto stack
			    stack.add(node);
			    
			    
			}
			
			input.close();
			
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		
	}
}

public class Color {

	static int[] color;
	static Stack<String> stack = new Stack<String>(); 
	static int V;
	static String node;
	static int numOfColors;
	
	
	
	public static void main(String[] args) {                  
		ReadData data = new ReadData(args[0]); 
		numOfColors = Integer.parseInt(args[1]);
		
		stack = data.stack;
		V =  data.V; 
		
		color = new int[V];
		//remove node from stack
		node = stack.pop();
		//color nodes
		color(0);
		
	}
	
	


public static void color(int v)
{	
    //solution found, print
    if (v == V) {
    	
    	for(int i=0; i < V; i++)
    		System.out.println("Node = " + i + " Color = C" + color[i]);
    
    	System.exit(0);
    }
    //try all colors
    for (int c = 1; c <= numOfColors; c++)
    {
    	//check if color can be used
        if (checkColor(v, c))
        {
            color[V - 1 - v] = c;
            if(v + 1 != V) {
            //remove node from stack
            node = stack.pop();
            }
            //recursive call
            color(v + 1);
        }
    }    
    //solution not found, print
    System.out.println("The graph is not " + numOfColors + " colorable...");
    System.exit(0);
}

//Check if color can be used
public static boolean checkColor(int v, int c)
{	
    for (int i = 0; i < V; i++) {
    	//check if color can be used
        if (node.charAt(i) == '1' && c == color[i]) {
        	//color can't be used
            return false;
        }
    }
    //color is good to use
    return true;
    
}
}