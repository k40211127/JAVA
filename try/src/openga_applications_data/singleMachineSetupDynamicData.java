package openga_applications_data;
import java.io.*;
import java.util.*;
public class singleMachineSetupDynamicData {
	public static void main(String[] args) {
		
	}
	public singleMachineSetupDynamicData() {
    }
	  String fileName, message = "";
	  String Instances[] = new String[]{""};
	  int processingTime[];
	  int setupTime[][];
	  int dynamicArrivalTime[];
	  int size;
	  
	  public void setData(String fileName, int size){
		    this.fileName = fileName;
		    this.size = size;
		    dynamicArrivalTime = new int[size];
		    
		    if( fileName == null ){
		        System.out.println( "Specify the file name please.");
		        System.exit(1);
		    }
		  }
	  public void getDataFromFile(){
		    // Read customers from file
		    //System.out.print( "Loading customers from file..." );
		    //to generate file data into message variable.

		    try
		    {
		        File file = new File( fileName );
		        FileInputStream fis = new FileInputStream( file );
		        DataInputStream in = new DataInputStream(fis);
		        BufferedReader br = new BufferedReader(new InputStreamReader(in));
		        String message = "", eachLine = "";

		        while ((eachLine = br.readLine()) != null)   {
		          message += eachLine;
		        }

		        //System.out.println(message);
		        StringTokenizer tokens = new StringTokenizer(message);

		        //to set the coordination and demand of each customer
		        //size = Integer.parseInt(tokens.nextToken());
		        processingTime = new int[size];
		        setupTime = new int[size][size];
		        
		        for(int i = 0 ; i < size ; i ++ ){
		          processingTime[i] = Integer.parseInt(tokens.nextToken());
		        }        

		        for(int i = 0 ; i < size ; i ++ ){
		          for(int j = 0 ; j < size ; j ++ ){
		            setupTime[i][j] = Integer.parseInt(tokens.nextToken());
		          }
		        }
		        
		        //Dynamic Arrival Time
		        for(int i = 0 ; i < size ; i ++ ){
		          dynamicArrivalTime[i] = Integer.parseInt(tokens.nextToken());
		        }                         
		    }   //end try
		    catch( Exception e )
		    {
		        e.printStackTrace();
		        System.out.println(e.toString());
		    }   // end catch
		    //System.out.println( "done" );
		  }
	  public String getFileName(int index){
		    return Instances[index];
		  }

		  public int[] getProcessingTime(){
		    return processingTime;
		  }  

		  public int[][] getSetupTime(){
		    return this.setupTime;
		  }  
		  
		  public int[] getDynamicArrivalTime(){
		    return dynamicArrivalTime;
		  }  

		  public int getSize(){
		    return size;
		  }
  

}
