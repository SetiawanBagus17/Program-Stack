package Tugas_Praktikum;
import java.util.Scanner;

public class MainStack {
    public static void main(String[] args) {
        int pilihan;
        int data;
        
        Stack result = new Stack();
        
        do {
            System.out.println("===PILIHAN===");
            System.out.println("1. PUSH");
            System.out.println("2. POP ITEM");
            System.out.println("3. LIHAT ISI DATA");
            System.out.println("4. KELUAR");
            System.out.print("Masukkan pilihan : ");
            
            Scanner in = new Scanner(System.in);
            pilihan = in.nextInt();
            
            if (pilihan == 1) {
                System.out.print("Data yang ditambahkan : ");
                data = in.nextInt();
                result.push(data);
                System.out.println("");
            } else if (pilihan == 2){
                result.pop();
                System.out.println("");
            } else if (pilihan ==3){
                result.display();
                System.out.println("");
            } else if (pilihan == 4) {
                System.exit(0);
            } else {
                System.out.println("pilihan tidak ada");
            }
        } while (pilihan != 0);
        
    }
}
