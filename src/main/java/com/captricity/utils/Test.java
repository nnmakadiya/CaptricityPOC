package com.captricity.utils;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Test{
    public static void main(String[] args)throws IOException{
        String filename = "D:/PROJECTS/Aurotech/Converted/MiTestFile.txt";
        byte[] bArray1 =new byte[5];
        byte[] bArray2 =new byte[5];
        bArray1[0]=28;//A
        bArray1[1]=66;//B
        bArray1[2]=67;//C
        bArray1[3]=68;//D
        bArray1[4]=69;//E
        FileOutputStream  fos = new FileOutputStream(filename);
        fos.write(bArray1);
        fos.close();
        FileInputStream fis = new FileInputStream(filename);
        fis.read(bArray2);
        ByteArrayInputStream bais = new ByteArrayInputStream(bArray2);
        for(int i =0; i< bArray2.length ; i++){
            System.out.println("As the bytem value: "+ bArray2[i]);//as the numeric byte value
            System.out.println("Converted as char to printiong to the screen: "+ String.valueOf((char)bArray2[i]));
        }   
    }
}
