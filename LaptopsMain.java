package GB.HomeWorkLapatoops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LaptopsMain {
    //-Создать множество ноутбуков.
    public static void main(String[] args) {
        Laptops laptop1 = new Laptops("Apple", "A2918", 205000, "M3", "Apple M3 8 core 4 ГГц", 4, 13);
        Laptops laptop2 = new Laptops("Huawei", "MCLF-X", 46490, "без ОС", "Intel Core i3 1215U",8, 16);
        Laptops laptop3 = new Laptops("HONOR", "X16 2024 BRN-F5851C", 69990, "Windows 11 Home", "Intel Core i5 12450H 2 ГГц (4.4 ГГц, в режиме Turbo)",8, 16);
        Laptops laptop4 = new Laptops("LENOVO", "82VG00HDPS", 50130, "без ОС", "Intel Core i3 1215U", 4, 16);
        Laptops laptop5 = new Laptops("Apple", "A2992", 271000, "M3", "Apple M3 Pro 11 core 4ГГц", 8, 14);
        Laptops laptop6 = new Laptops("Huawei", "MCLF-X", 46490, "без ОС", "Intel Core i3 1215U",8, 16);
        Laptops laptop7 = new Laptops("Apple", "A2918", 205000, "M3", "Apple M3 8 core 4 ГГц", 4, 13);

        Set<Laptops> unicLaptops = new HashSet<>();
        unicLaptops.add(laptop1);
        unicLaptops.add(laptop2);
        unicLaptops.add(laptop3);
        unicLaptops.add(laptop4);
        unicLaptops.add(laptop5);
        unicLaptops.add(laptop6);
        unicLaptops.add(laptop7);
        
        for (Laptops laptops : unicLaptops) {
            System.out.println(laptops);
        }

        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "объем оперативной памяти");
        mapCrit.put(2, "диагональ");

        Map<String, Integer> filterParams = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        for (Map.Entry<Integer, String> entry : mapCrit.entrySet()) {
            System.out.println("Введите цифру, соответствующую необходимому критерию: " + entry.getValue() + ":");
            int value = sc.nextInt();
            filterParams.put(entry.getValue(), value);
        }
        Set<Laptops> filteredLaptops = new HashSet<>();
        for (Laptops laptop : unicLaptops) {
            if (laptop.getRAM() >= filterParams.get("объем оперативной памяти") &&
                    laptop.getDiagonal() >= filterParams.get("диагональ")) {
                filteredLaptops.add(laptop);
            }
        }
        System.out.println("\nНоутбуки по вашему запросу: ");
        for (Laptops laptop : filteredLaptops) {
            System.out.println(laptop);
        }

    }
}

