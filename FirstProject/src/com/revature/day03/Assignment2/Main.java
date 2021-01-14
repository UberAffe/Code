package com.revature.day03.Assignment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {  
		BufferedReader inputStream = null;
        BufferedWriter outputStream = null;
        try {
            inputStream =
                new BufferedReader(new FileReader("myfile01.txt"));
            outputStream =
                    	new BufferedWriter(new FileWriter("lineOut.txt"));
            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.write(l);
                outputStream.write("\n");
               
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
