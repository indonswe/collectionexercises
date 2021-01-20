package org.example;

import java.util.*;

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
        System.out.println("------------------");
        //4
        List<String> weekDays3= new ArrayList<>(Arrays.asList("MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"));
        List<String> newList = weekDays3.subList(0,3);
        for(String wDay:newList) {
            System.out.println(wDay);
        }
        //5
        Set<String> daysOfWeek = new HashSet<>();

        // Adding new elements to the HashSet
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        System.out.println(daysOfWeek);

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
