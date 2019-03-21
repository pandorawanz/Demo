package com.jrg;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File file1 = new File ("res/in.txt");
        File file2 = new File ("res/out.txt");
        FileHelper.copy(file1,file2);
    }
}