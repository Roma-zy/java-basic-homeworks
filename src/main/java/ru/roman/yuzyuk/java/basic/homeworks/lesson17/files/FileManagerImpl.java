package ru.roman.yuzyuk.java.basic.homeworks.lesson17.files;

import java.io.File;
import java.util.List;

public interface FileManagerImpl {
    public List<String> getFilesInRoot ();
    public String getFileContent (String fileName);
    public void writeLineToFile (String filename, String symbol);
}
