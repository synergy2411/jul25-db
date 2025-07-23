package com.sk.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterFileReaderStream {

    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader("source.txt")) ){
            int data;
            while ((data = reader.read()) != -1) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
