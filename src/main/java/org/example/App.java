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
        //6
        Set<String> daysOfWeekToArrayString = new HashSet<>();

        // Adding new elements to the HashSet
        daysOfWeekToArrayString.add("Monday");
        daysOfWeekToArrayString.add("Tuesday");
        daysOfWeekToArrayString.add("Wednesday");
        daysOfWeekToArrayString.add("Thursday");
        daysOfWeekToArrayString.add("Friday");
        daysOfWeekToArrayString.add("Saturday");
        daysOfWeekToArrayString.add("Sunday");
        ArrayList<String> namesList = new ArrayList<>(daysOfWeekToArrayString);

        System.out.println(namesList);

        //7
        Set<String> daysOfWeekAndSort = new HashSet<>();

        // Adding new elements to the HashSet
        daysOfWeekAndSort.add("Monday");
        daysOfWeekAndSort.add("Tuesday");
        daysOfWeekAndSort.add("Wednesday");
        daysOfWeekAndSort.add("Thursday");
        daysOfWeekAndSort.add("Friday");
        daysOfWeekAndSort.add("Saturday");
        daysOfWeekAndSort.add("Sunday");
        ArrayList<String> x = new ArrayList<>(daysOfWeekAndSort);
        ArrayList<String> copy = null;

        String temp;
        for (int i = 0; i < x.size() - 1; i++) {
            for (int j = i + 1; j < x.size(); j++) {
                if (x.get(i).compareToIgnoreCase(x.get(j)) > 0) {
                    temp = x.get(i);
                    x.set(i,x.get(j));
                    x.set(j,temp);

                }
            }
        }
        System.out.println(x);
        //8
        Set<String> daysOfWeeks = new HashSet<>();

        // Adding new elements to the HashSet
        daysOfWeeks.add("Monday");
        daysOfWeeks.add("Tuesday");
        daysOfWeeks.add("Wednesday");
        daysOfWeeks.add("Thursday");
        daysOfWeeks.add("Friday");
        daysOfWeeks.add("Saturday");
        daysOfWeeks.add("Sunday");
        System.out.println(daysOfWeeks);

        TreeSet<String> treeSet = new TreeSet<String>(daysOfWeeks);

        System.out.println( treeSet);

        //9

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Xpeng");
        map.put(2,"Nio");
        map.put(3,"Byd");

        System.out.println(map);

        //System.out.println(map.get(1));
        //System.out.println(map.get(2));
        //System.out.println(map.get(3));


        /*for (int i = 0, j = 1; i < productArray.length-1; i++, j++) {
            onlyProductsArray[i]= productArray[j];
            prodIdAndNames = ("Productid: "+onlyProductsArray[i].productId+" Name: "+onlyProductsArray[i].name);

            stringProductsArray[i]=prodIdAndNames;

        }*/





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
