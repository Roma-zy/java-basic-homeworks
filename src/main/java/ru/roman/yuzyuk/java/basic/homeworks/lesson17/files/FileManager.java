package ru.roman.yuzyuk.java.basic.homeworks.lesson17.files;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileManager implements FileManagerImpl {
    final String rootDir = System.getProperty("user.dir");

    public List<String> getFilesInRoot() {
        return Stream.of(new File(rootDir).listFiles())
            .filter(file -> !file.isDirectory() && !file.isHidden())
            .map(File::getName)
            .collect(Collectors.toList());
    }

    public String getFileContent(String fileName) throws IndexOutOfBoundsException {
        File f = new File(rootDir + "/" + fileName);
        try (
                BufferedReader br = new BufferedReader(new FileReader(f));
        ) {
            StringBuilder result = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                result
                    .append(line)
                    .append(System.lineSeparator());
            }

            return result.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    public void writeLineToFile(String fileName, String appendToFile) {
        try (
            FileOutputStream fos = new FileOutputStream(rootDir + "/" + fileName, true);
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        ) {
            osw.append(appendToFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
