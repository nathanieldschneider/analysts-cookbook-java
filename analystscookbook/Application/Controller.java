package com.analystscookbook.Application;

import com.analystscookbook.Application.Butler.GPTButler;
import com.analystscookbook.Application.Butler.SheetsButler;


public class Controller {

    public void fire(){
       
        SheetsButler sheetsButler = new SheetsButler();
        GPTButler gptButler = new GPTButler();
        View view = new View();
        gptButler.build();
        gptButler.chat(view.boot());
        sheetsButler.build();

    }
}
