package pl.coderslab.collection;

public class Main2 {
    public static void main(String[] args) {
        String reg1 = "^\\d+[.]{1}\\d+$";
        String reg2 = "^[-+]?[0-9]*\\.?[0-9]*([eE][-+]?[0-9]+)?";
        String reg3 = "^([0-2]{1}\\d{1})|(3[0-1]{1})\\/(0{1}[1-9]{1})|(1{1}[0-2]{1})\\/\\d{4}$";
        String reg4 = "^[2-9]{1}\\d{3}\\-(0{1}[1-9]{1})|(1{1}[0-2]{1})\\-([0-2]{1}\\d{1})|(3[0-1]{1})$";
    }
}

//1. W pliku `Main2.java` do zmiennych **reg1**, **reg2**, **reg3**, **reg4** wpisz kolejno wyrażenia regularne, opisujące:
//
//    * liczby zmiennoprzecinkowe (5.65 , 123.123)
//    * liczby w notacji naukowej ( 5.4325e+04 ; 2.0000342E-06)
//    * datę w formacie `dd/mm/yyyy`
//    * datę w formacie `yyyy-mm-dd` - gdzie rok jest powyżej 2000