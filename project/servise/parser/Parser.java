package project.servise.parser;

import project.model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Parser {

    public static void parser() throws IOException {

        try{
        FileReader fr = new FileReader("student.txt");
        BufferedReader bf = new BufferedReader(fr);

        String st = bf.readLine();

        while((st =bf.readLine())!=null) {

            StringTokenizer stn = new StringTokenizer(st);

            String firstName = stn.nextToken();
            String lastName = stn.nextToken();
            int age = Integer.parseInt(stn.nextToken());

            Student studentParser = new Student(firstName,lastName,age);

        }
            fr.close();
            bf.close();

        }catch(IOException e){
        e.printStackTrace();
        }
    }
}

