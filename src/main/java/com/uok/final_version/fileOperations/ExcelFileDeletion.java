package com.uok.final_version.fileOperations;

import java.io.File;

public class ExcelFileDeletion {

    public String filepath;
    public ExcelFileDeletion(String filepath){
        this.filepath = filepath;

    }

    public boolean deleteFileAfterMail(){

        File file = new File(filepath);

        if(file.delete())
        {
            System.out.println("File deleted successfully");
            return true;
        }
        else
        {
            System.out.println("Failed to delete the file");
            return false;
        }



    }
}
