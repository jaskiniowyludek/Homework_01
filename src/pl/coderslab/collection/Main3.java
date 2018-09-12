package pl.coderslab.collection;

public class Main3 {

    public static void main(String[] args) {
        String test = "3wulina4";
        String test2 = "wuina4";
        String test3 = "wuli";
        System.out.println(verifyLogin(test));
        System.out.println(verifyLogin(test2));
        System.out.println(verifyLogin(test3));

    }
    static boolean verifyLogin(String email){
        boolean condition1 = email.matches("^.{5,}$");
        boolean condition2 = email.matches("[\\w-]+");
        boolean condition3 = email.matches("^[a-zA-Z_-][\\w-]+$");
        System.out.println("c1: "+condition1+" c2: "+condition2+" c3: "+condition3);

        return condition1&&condition2&&condition3;
    }
}
//W pliku `Main3.java`
//
//1. Napisz metodę `static boolean verifyLogin(String email)`,
//która zwróci **true** jeżeli ciąg znaków:
//    * Ma minimum 5 znaków.
//    * Zawiera tylko litery, cyfry, znak podkreślenia, myślnik
//    * Nie zaczyna się od cyfry
//
//**false** w przeciwnym wypadku.