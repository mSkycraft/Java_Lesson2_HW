package ru.geekbrains;

import java.io.File;

public final class HW1 {

    public static void main(String[] args) {
        boolean flag = false;
        String path = "C:/Windows/";
        File dir = new File(path);
        String[] types = {" ", "txt","pdf","jpg"};
        int count = 0;
        for(int i =0;i<types.length-1;i++){
            System.out.printf("%d Расширение файла: '%s' \n", i+1,types[i]);
            for (File file : dir.listFiles()) {
                String[] fileName = file.getName().split("\\.");
                if(fileName[fileName.length-1].equals(types[i])){
                        count++;
                        if(flag == true){
                            System.out.printf("Файл '%s'\n", file.getName());
                        }
                }
            }
            if(flag == false){
                System.out.printf("Файлов с расширением '%s' - %d \n", types[i], count);
            }
            count = 0;
        }
    }
}