package com.analystscookbook.Application.Butler;

import java.io.IOException;
import java.security.GeneralSecurityException;

import com.analystscookbook.Application.Butler.API.SheetsApi;

public class SheetsButler {

    public  boolean build(){
        System.out.println("sheets butler touch");
        SheetsApi sheets = new SheetsApi();
            try {
                sheets.build();
            } catch (GeneralSecurityException  | IOException ioe) {
                System.out.println(ioe);    
               }

        return true;
        }
    }

