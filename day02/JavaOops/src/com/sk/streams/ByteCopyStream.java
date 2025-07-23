package com.sk.streams;

import java.io.*;

public class ByteCopyStream {
    public static void main(String[] args) {

        BufferedOutputStream output = null;
        try(BufferedInputStream input = new BufferedInputStream(new FileInputStream("source.txt"))){
             output = new BufferedOutputStream(new FileOutputStream("destination.txt"));
            int data;
            while((data = input.read()) != -1){
                System.out.print(data + " ");
                output.write(data);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        } finally {
            if(output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
