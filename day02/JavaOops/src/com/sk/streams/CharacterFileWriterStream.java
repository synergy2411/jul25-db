package com.sk.streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterFileWriterStream {
    public static void main(String[] args) {
        try(BufferedWriter  writer = new BufferedWriter(new FileWriter("destination.txt"))){
            String data = "Should write using the character file writer!!!!";
            writer.write(data);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
