// Q1:-  Program a multi-threaded producer and consumer 
//with locks on concurrent access to a memory location using C/C++/Golang


import java.io.BufferedReader;
import java.io.InputStreamReader;
 

public class process 
{
	public static void main(String[] args)
     {
		try 
          {
			   String process;
			Process p = Runtime.getRuntime().exec("ps -rf");
			BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((process = input.readLine()) != null)
             {
				System.out.println(process); // This will Run all the process in line
												
			}
			input.close();
		} 
            catch (Exception err)
               {
			      err.printStackTrace();
		     }
    }
}
