package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public String createFiles() {
        /** ЗАДАНИЕ НА УСТАНОВКУ: */
        String mainPath = "C:\\Users\\Public\\Games";

// 1. В папке Games создайте несколько директорий: src, res, savegames, temp.
        File src = new File(mainPath, "src");
        File res = new File(mainPath, "res");
        File savegames = new File(mainPath, "savegames");
        File temp = new File(mainPath, "temp");
// 2. В каталоге src создайте две директории: main, test.
        File main = new File(src, "main");
        File test = new File(src, "test");
// 3. В подкаталоге main создайте два файла: Main.java, Utils.java.
        File mainJava = new File(main, "Main.java");
        File utilsJava = new File(main, "Utils.java");

// 4. В каталог res создайте три директории: drawables, vectors, icons.
        File drawables = new File(res, "drawables");
        File vectors = new File(res, "vectors");
        File icons = new File(res, "icons");
        File tempNote = new File("C:\\Users\\Public\\Games\\temp", "temp.txt");

        StringBuilder sb = new StringBuilder();
        if (src.mkdir()) sb.append("Файл src создан \n");
        if (res.mkdir()) sb.append("Файл res создан \n");
        if (savegames.mkdir()) sb.append("Файл savegames создан \n");
        if (temp.mkdir()) sb.append("Файл temp создан \n");
        if (main.mkdir()) sb.append("Файл main in src создан \n");
        if (test.mkdir()) sb.append("Файл test in src создан \n");
        if (mainJava.mkdir()) sb.append("Файл Main.java создан");
        if (utilsJava.mkdir()) sb.append("Файл Utils.java создан");
        if (drawables.mkdir()) sb.append("Файл drawables in res создан \n");
        if (vectors.mkdir()) sb.append("Файл vectors in res создан \n");
        if (icons.mkdir()) sb.append("Файл icons in res создан \n");
        String text = sb.toString();

        try {
            FileWriter sbTemp = new FileWriter(tempNote);
            sbTemp.write(text);
            sbTemp.flush();

        } catch (IOException e) {
            throw new RuntimeException("Oops");
        }
        return "None";
    }
}
