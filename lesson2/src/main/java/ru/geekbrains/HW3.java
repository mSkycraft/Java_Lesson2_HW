package ru.geekbrains;

import org.json.JSONArray;
import org.json.JSONObject;

public class HW3 {
    public static void main(String[] args) {
        String[] keys = {"фамилия","оценка", "предмет"};
        StringBuilder sBuilder = new StringBuilder();
        JSONArray jArray = new JSONArray("[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]");
        for (Object object : jArray) {
            JSONObject jObj = (JSONObject) object;
            sBuilder.append("Студент ");
            sBuilder.append(jObj.getString(keys[0]));
            sBuilder.append(" получил ");
            sBuilder.append(jObj.getString(keys[1]));
            sBuilder.append(" по предмету ");
            sBuilder.append(jObj.getString(keys[2]));
            System.out.println(sBuilder);
            sBuilder.delete(0, sBuilder.length());
        }
    }
}
