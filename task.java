import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class task{
    public static void main(String[] args) {
        hw lap1=new hw("300Map",1236,"Simple");
        lap1.setColor("black");
        lap1.setHDD(700);
        lap1.setOS("Windows");
        lap1.setRAM(8);
        
        hw lap2=new hw("LaLa",6467,"Sunny");
        lap2.setColor("yellow");
        lap2.setHDD(1000);
        lap2.setOS("Linux");
        lap2.setRAM(8);

        hw lap3=new hw("Totoro",67201,"Moon");
        lap3.setColor("red");
        lap3.setHDD(900);
        lap3.setOS("Windows");
        lap3.setRAM(16);

        hw lap4=new hw("Sky",1111,"Java");
        lap4.setColor("blue");
        lap4.setHDD(700);
        lap4.setOS("Linux");
        lap4.setRAM(8);

        hw lap5=new hw(" ",8438483," ");
        lap5.setColor(" ");
        lap5.setHDD(1000);
        lap5.setOS(" ");
        lap5.setRAM(8);

        HashSet <hw> laptops = new HashSet<>(Arrays.asList(lap1,lap2,lap3,lap4,lap5));
        HashSet <hw> res = new HashSet<>();

        System.out.println("Приветствую");
        System.out.print("Введите данные, соответствующие необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(n!=5){
        if(n==1){
            System.out.println("Введите минимальный объем оперативной памяти");
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("RAM", temp);
        }
        if(n==2){
            System.out.println("Введите минимальный объем ЖД" );
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("HDD", temp);
        }
        if(n==3){
            System.out.println("Какая ОС Вас интересует?");
            String temp = sc.nextLine();
            filters.put("OS", temp);
        }
        if(n==4){
            System.out.println("Выберите цвет");
            String temp = sc.nextLine();
            filters.put("color", temp);
        }
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        n = sc.nextInt();
        sc.nextLine();
    }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("RAM")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    hw lap = (hw) it.next();
                    if(lap.getRAM()>=(Integer)entry.getValue()){
                        res.add(lap);
                    }
                }
                }
             if(entry.getKey().equals("HDD")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    hw lap = (hw)it.next();
                    if(lap.getHDD()>=(Integer)entry.getValue()){
                        res.add(lap);
                        }
                    }
                    }
            if(entry.getKey().equals("OS")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    hw lap = (hw)it.next();
                        if(lap.getOS().equals(entry.getValue())){
                            res.add(lap);
                            }
                        }
                        }
            if(entry.getKey().equals("color")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    hw lap = (hw)it.next();
                        if(lap.getColor().equals(entry.getValue())){
                            res.add(lap);
                                    }
                                }
                                }
            }
        
            Iterator it = res.iterator();
            while(it.hasNext()){
                hw lap = (hw)it.next();
            System.out.println(lap.toString());
            System.out.println();
        }
        
        
    }}