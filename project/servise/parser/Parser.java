package project.servise.parser;

import project.repositories.listStudent.ListStudent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

public class Parser {


    public static void wwpes() throws IOException {

        FileReader fr = new FileReader("student.txt");
        BufferedReader bf = new BufferedReader(fr);

        String st = bf.readLine();

        while((st =bf.readLine())!=null) {

            StringTokenizer stn = new StringTokenizer(st);
            String wq = stn.nextToken();
            String ww = stn.nextToken();
            int we = Integer.parseInt(stn.nextToken());
            StudentParser studentParser = new StudentParser(wq,ww,we);
            System.out.println(wq + " " + ww + " " + we);
            ListStudent.add(studentParser);
        }
    }
}

