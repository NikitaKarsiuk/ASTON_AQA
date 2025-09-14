package Lesson_6;

import java.util.*;

public class TelephoneDirectory {
    private Map<String, List<String>> userData;

    public TelephoneDirectory()
    {
        this.userData = new HashMap<>();
    }

    public void add(String surname, String phone)
    {
        userData.computeIfAbsent(surname, k -> new ArrayList<>()).add(phone);
    }

    public List<String> get(String surname)
    {
        return userData.get(surname);
    }
}
