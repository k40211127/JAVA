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
        a.read_csv(); //讀檔
        a.evaluateAll(); //全部運算方法
        a.result_output(); //印出
    }

    public void read_csv() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("Source20171102.csv");
        BufferedReader br = new BufferedReader(fr);

        String str = br.readLine(), temp[];
        while ((str = br.readLine()) != null) { //逐行讀取且扔入 a b c d 四個欄位
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

        for (int i = 0; i < data.length; i++) {
            for (int j=i; j < data.length;j++){
                if (data[i][0].equals(data[j][0])){
                    pid_count += 1;                    
                } else {                                        
                    break;
                }
            }
                      
            int count=0; // 原本程式是 同一人 讀到1筆=進入1次                         
            if (pid_count > 1) {
                for (int j=i;j<(i+pid_count);j++){
                    data[j][5] = String.valueOf(pid_count);  
                    // 現在則是  假如A進入3次 分別為 99 98 97  那麼程式則判斷 99>=99 98 97 三次
                    for (int k=i;k<i+pid_count;k++){
                        if (Integer.parseInt(data[j][1]) >= Integer.parseInt(data[k][1])){
                            count++; 
                        }                      
                    }
                    //此時99年那次=第三次進入 98第二次 97第三次
                    for (int k=1;k<=pid_count;k++){
                        if (count==k){
                           data[j][4] = String.valueOf(k);
                           break; //加速程式運算
                        }
                    }
                    count=0;
                }
                i+=pid_count-1;
            }else{
                    data[i][4] = String.valueOf(1);
                    data[i][5] = String.valueOf(pid_count);         

            }
            pid_count = 0;
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
