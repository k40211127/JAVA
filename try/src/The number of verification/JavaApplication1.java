package javaapplication1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class JavaApplication1 {

    ArrayList a = new ArrayList();
    ArrayList b = new ArrayList();
    ArrayList c = new ArrayList();
    ArrayList d = new ArrayList();
    static String data[][];

    public static void main(String[] args) throws IOException  {
        JavaApplication1 a = new JavaApplication1();
        a.read_csv();
        a.evaluateAll();
        a.result_output();
    }

    public void read_csv() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("Source20171102.csv");
        BufferedReader br = new BufferedReader(fr);

        String str = br.readLine(), temp[];
        while ((str = br.readLine()) != null) {
            temp = str.split(",");            
            a.add(temp[0]);
            b.add(temp[1]);
            c.add(temp[2]);
            d.add(temp[3]);
        }
        fr.close();
        br.close();

        data = new String[a.size()][6];
        for (int i = 0; i < a.size(); i++) {
            data[i][0] = (String) a.get(i);
            data[i][1] = (String) b.get(i);
            data[i][2] = (String) c.get(i);
            data[i][3] = (String) d.get(i);
        }
    }

    public static void evaluateAll() {
        int pid_count = 0 ; // 同一人出現總次數
        int sequence_count = 1 ; // 同一人 進入次數
        
        for (int i = 0; i < data.length; i++) {
            for (int j=i; j < data.length;j++){
                if (data[i][0].equals(data[j][0])){
                    pid_count += 1;                    
                } else {                                        
                    break;
                }
            }
                      
            int count=0;
            if (pid_count > 1) {
                for (int j=i;j<(i+pid_count);j++){
                    data[j][5] = String.valueOf(pid_count);   
                    for (int k=i;k<i+pid_count;k++){
                        if (Integer.parseInt(data[j][1]) >= Integer.parseInt(data[k][1])){
                            count++; 
                        }                      
                    }
                    for (int k=1;k<=pid_count;k++){
                        if (count==k){
                           data[j][4] = String.valueOf(k);
                        }
                    }
                    count=0; 
//                    sequence_count+=1;
//                    data[j][4] = String.valueOf(sequence_count);                    
                }
                i+=pid_count-1;
                sequence_count = 1;
            }else{
                    data[i][4] = String.valueOf(sequence_count);
                    data[i][5] = String.valueOf(pid_count);         

            }
            pid_count = 0;sequence_count = 1;
        }
    }

    public void result_output() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < 6; j++) {
                if (j!=5) {
                    System.out.print(data[i][j] + "\t");}
                else {
                    System.out.print(data[i][j]);                
                }
            }System.out.println();
        }
    }
    
}
