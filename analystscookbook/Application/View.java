package com.analystscookbook.Application;
import java.util.Scanner;

public class View {
    public String boot(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("input message");
        String i = sc.nextLine();
        return(i);
    }
}
