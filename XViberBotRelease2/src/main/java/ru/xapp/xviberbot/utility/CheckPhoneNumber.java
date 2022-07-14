package ru.xapp.xviberbot.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CheckPhoneNumber {
    String phoneNumber;
    Pattern pattern = Pattern.compile("(\\+77770549796)");
    public CheckPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public boolean perform() {
        Matcher matcher = pattern.matcher(this.phoneNumber);
        if (matcher.matches()){
            return true;
        } else {
            return false;
        }
    }
}
