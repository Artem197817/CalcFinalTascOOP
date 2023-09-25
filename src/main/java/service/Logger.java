package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class Logger {

    @Autowired
    public Logger() {
    }

    public void log(String message) {
        File file = new File("log.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(message + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
