//Purpose is to read data from file and created a link list/ arry for data man
import java.io.*;

public class ReadData
{
  public static void main(String[] args)
    throws IOException
  {
    File file = new File("LabHashingInput.text");
    BufferedReader Fs = new BufferedReader(new FileReader(file));
    String line;
    String[][] container = new String[6][10]; 
    int col = 0;
    int row = 0;

    while((line= Fs.readLine()) != null){
      if(line.isEmpty()){
       line=Fs.readLine();
       row++;
       col = 0;
      }
      container[row][col] = line;
      col++;      
      
    }

    for (int i = 0; i < 5; i++){
      for(int j = 0; j < 10; j++){
        System.out.print(" " +container[i][j]);
      }
      System.out.println();
    }


  }
}