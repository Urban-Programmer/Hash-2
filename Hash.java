//Grabs data from linked/arry and inserts it into a Hash table
import java.io.*;
import java.util.*;
import java.util.Hashtable;
import java.util.Enumeration; 




public class Hash{
  
  int tableSize = 120;
  int [] hashTable;
  Hash(){
    Enumeration name;
    String key;
    Hashtable<String, String> table = new Hashtable<String, String>();
    table.put("1998", "Aaron");
    table.put("2021", "Paige");
    name = table.keys();

    while(name.hasMoreElements()){
      key = (String) name.nextElement();
      System.out.println("Key: " + key + " Value: " + table.get(key));

    }
  }

  Hash(int bucketSize, double modDiv){

  }

  
  void print(){
    //Prints table /w Data Vals, Stats, and Items unabled to be stored 

  }
    

};