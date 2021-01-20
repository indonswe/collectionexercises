package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    //static List<String> weekDays;
    static List<String> weekDays = new ArrayList<>(Arrays.asList("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"));
    public static void main( String[] args )
    {
        //1
        createList(1);
        System.out.println(App.weekDays);

        //2
        createList(2);
        for(String wDay:weekDays) {
            System.out.println(wDay);
        }
        System.out.println("------------------");
        //3
        List<String> weekDays2= new ArrayList<>(Arrays.asList("MONDAY","TUESDAY","WEDNESDAY","FRIDAY","SATURDAY","SUNDAY"));
        weekDays2.add(3,"THURSDAY");
        for(String wDay:weekDays2) {
            System.out.println(wDay);
        }


    }

    public static void createList(int number){
        weekDays.removeAll(weekDays);
        if (number == 1 || number == 2) {
            weekDays = new ArrayList<>(Arrays.asList("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"));
        }else if (number == 3){
            List<String> weekDays= new ArrayList<>(Arrays.asList("MONDAY","TUESDAY","WEDNESDAY","FRIDAY","SATURDAY","SUNDAY"));
        }
    }
}
