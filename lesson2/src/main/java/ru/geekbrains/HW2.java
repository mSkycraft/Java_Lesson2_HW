package ru.geekbrains;

import org.json.JSONObject;

public class HW2 {
    public static void main(String[] args) {
        String startString = "select * from students where ";
        StringBuilder sBuilder = new StringBuilder(startString);
        JSONObject jObj = new JSONObject("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");
        String[] keys = {"name","country", "city", "age"};
        for(int i =0; i<keys.length-1;i++){
            if(jObj.getString(keys[i])!=null){
                if(sBuilder.length()>startString.length()){
                    sBuilder.append(" and ");
                }
                sBuilder.append(keys[i]);
                sBuilder.append(" = ");
                sBuilder.append(jObj.getString(keys[i]));
            }
        }
        System.out.println(sBuilder);
    }
}
