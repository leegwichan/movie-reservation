package com.project.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    private Reader() {}

    public static List<String> read(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            return read(reader);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static List<String> read(BufferedReader reader) throws IOException {
        List<String> text = new ArrayList<>();

        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }

            text.add(line);
        }

        return text;
    }
}
