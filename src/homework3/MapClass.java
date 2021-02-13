package homework3;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    private Map<String, String> stringStringMap = new HashMap<>();
    public MapClass(Map<String, String> stringStringMap) {
        this.stringStringMap = stringStringMap;
    }
    public Boolean registration(String nickname, String realname){
        if(stringStringMap.containsKey(nickname)){
            System.out.println("Ник уже занят");
            return false;

        }else{
            stringStringMap.put(nickname, realname);
            System.out.println("Регистрация пользователя "+ nickname+ " прошла успешно");
            return true;
        }

    }
    public Boolean remove(String nickname){
        if(stringStringMap.containsKey(nickname)){
            stringStringMap.remove(nickname);
            System.out.println("Пользователь удален");
            return true;

        }else{
            System.out.println("Мы не можем удалить данного пользователя");
            return false;
        }
    }



}
