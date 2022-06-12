package za.ac.cput.schoolmanagement.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class Helper {
    public static boolean isEmptyOrNull(String str){return StringUtils.isEmpty(str);}
    public static String setEmptyIfNull(String str)
    {
        if(isEmptyOrNull(str)) return StringUtils.EMPTY;
        return str;
    }
    public static void checkStringParam(String paramName,String paramValue)
    {
        if(isEmptyOrNull(paramValue))
            throw new IllegalArgumentException(String.format("Invalid value for param:%s", paramName));
    }

    public static boolean isNullorEmpty(String s)
    {
        return (s==null || s.equals("") || s.isEmpty()||s.equalsIgnoreCase("null"));}
    public static boolean isValidEmail(String email)
    {
        EmailValidator ev=EmailValidator.getInstance();
        return ev.isValid(email);
    }
}
