package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    List<String> getAllFunctions(File path){ // path = "src\\week9\\Utils.java"
        List<String> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(path);
            while(sc.hasNext()){
                String func = sc.nextLine();
                if(func.contains("static")) {
                    while (!sc.hasNext("}"))
                        func = func + "\n" + sc.nextLine();
                    func = func + "\n\t}";
                    list.add(func);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public String findFunctionByName(String name){
        String justname = name.substring(0, name.indexOf("(") -1);
        List<String> allFunction = getAllFunctions(new File("src\\week9\\Utils.java"));
        for (int i=0;i < allFunction.size(); i++)
            if (allFunction.get(i).contains(justname))
                return allFunction.get(i);
        return "Function not found";
    }
    public static void main(String[] args) {

        List<String> list = new Task1().getAllFunctions(new File("src/week9/Utils.java"));
        File file = new File("output.txt");
        System.out.println(new Task1().findFunctionByName("main(String[])"));

    }
}
