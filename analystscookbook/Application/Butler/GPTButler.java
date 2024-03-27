package com.analystscookbook.Application.Butler;

import com.analystscookbook.Application.Butler.API.GPTAPI;

public class GPTButler {
    GPTAPI GPTAPI = new GPTAPI();
    
    public boolean build(){
        return true;
    }

    public void chat(String c){
        GPTAPI.chat(c);
    }    
}
