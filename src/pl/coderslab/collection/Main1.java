package pl.coderslab.collection;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main1 {

    public static void main(String[] args) {

            File file = new File("/home/ewelina/repositories/Homework_01/src/pl/coderslab/collection/earnings.txt");
        StringBuilder sb = new StringBuilder();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                sb.append(scanner.nextLine()).append("\n");
            }
        }catch (FileNotFoundException e){
            System.out.println("Błąd odczytu z pliku");
        }
        String list = sb.toString();
        String[] empl = list.split("\n");
        List<String> possibleEmpl = new ArrayList<>();
        for (int i = 0; i < empl.length;i++){
           // System.out.println(empl[i]);
            if (!(empl[i].contains("Kowalski")||empl[i].contains("Kowalska"))){
                possibleEmpl.add(empl[i]);
            }
        }
        //System.out.println(possibleEmpl);
        String listOfEmployees = possibleEmpl.toString();
        String[] partsOfEmpl = listOfEmployees.split(" ");
        List<Double> salaries = new ArrayList<>();
        for (int i = 0; i<partsOfEmpl.length;i++){
           try {
               double salary = Double.parseDouble(partsOfEmpl[i]);
               salaries.add(salary);
           }catch (Exception e){
              // System.out.println("Not a number");
           }
        }
        Collections.sort(salaries);
        System.out.println(salaries);
        String firstSalary = String.valueOf(salaries.get(salaries.size()-1));
        String secondSalary = String.valueOf(salaries.get(salaries.size()-2));
        String thirdSalary = String.valueOf(salaries.get(salaries.size()-3));
        System.out.println("salaries: "+firstSalary+" "+secondSalary+" "+thirdSalary);
        List<String> listOFEmployeesWithBiggestSalary = new ArrayList<>();
        for (String elem: possibleEmpl){
            if (elem.contains(firstSalary)||elem.contains(secondSalary)||elem.contains(thirdSalary)){
                listOFEmployeesWithBiggestSalary.add(elem);
            }
        }
        System.out.println("Employees to dismiss:");
        for (String elem:listOFEmployeesWithBiggestSalary){
            System.out.println(elem);
        }
        }

    }


//Ze względu na oszczędności w pewnej firmie planowane są zwolnienia najlepiej opłacanych pracowników,
//którzy nie są spokrewnieni z szefem o nazwisku **Kowalski**.
//
//1. W pliku `Main1.java` napisz program, który wczyta dane z pliku `earnings.txt`.
//
//2. Wyświetli listę 3 pracowników z największymi zarobkami, których nazwisko nie jest takie samo jak
// szefa (Kowalski).
//
//    * Zwróć uwagę że nazwisko to może się odmieniać (Kowalski, Kowalska).
//    * Zwróć uwagę na ułożenie danych w pliku, występują linie które nie zawierają płac.
//    * Zwróć uwagę że ułożenie danych w pliku może się zmieniać.
//    * Zwróć uwagę że kolejność danych w lini może być przestawiona.