package lect8;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        String Name = "Alina";
        String Surname = "Sergeevna";
        String Lastname = "Miroshnik";
        String s = Surname;
        String s1 = Name;
        String s2 = Name + " " + Surname + " " + Lastname;
        System.out.println(s1);
        System.out.println(s2);
        String[] arr = Name.split(" ", 1);
        String[] arr1 = Surname.split(" ", 1);
        String[] arr2 = Lastname.split(" ", 1);
        System.out.println(arr[0].charAt(0)+ " "+arr1[0].charAt(0) +" "+arr2[0].charAt(0));

        /*System.out.println(getInitials("Miroshnik Alina Sergeevna"));*/
        StringBuilder sb = new StringBuilder();
        sb.append(Name);
        sb.append(",");
        sb.append(Surname);
        sb.append(Lastname);
        System.out.println(sb);
    }

    /*public static String getInitials(String str){
        String [] tempArray = str.split("");
        String result = tempArray[0]+"";
        for (int i = 1; i < tempArray.length; i++){
            result += tempArray[i].substring(0,1).toUpperCase() +".";
        }
        return result.trim();*/

}
