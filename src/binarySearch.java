import java.util.Scanner;
public class binarySearch {
    static Scanner input = new Scanner(System.in);
    public static void shorting(String[] string){
        for (int i = 0; i < string.length - 1; i++) {
            int min = i;
            
            for (int elemen = 1 + 1; elemen < string.length; elemen++) {
                if (string[elemen].compareTo(string[min]) < 0) {
                    min = elemen;
                }
            }
            
            String temp = string[i];
            string[i] = string[min];
            string[min] = temp;
        }
    }
    
    public static void bs(String[] string){
        int top = string.length - 1;
        int bottom = 0;
        
        System.out.println("Masukkan string yang dicari : ");
        String search = input.next();
        boolean notFound = true;
        
        while (notFound) {            
            int start = (top + bottom) / 2;
            if (string[start].equals(search)) {
                notFound = false;
                System.out.println("Data " + search + " Ditemukan");
            }else if (bottom > top) {
                System.out.println("Data " + search + " Tidak ditemukan");
                break;
            }else{
                if (string[start].compareTo(search) < 0) {
                    bottom = start + 1;
                }else{
                    top = start - 1;
                }
            }
        }
    }
    
    public static void main(String[] args){
        String string[];
        System.out.println("Masukkan jumlah string : ");
        string = new String[input.nextInt()];
        
        for (int i = 0; i < string.length; i++) {
            System.out.println("Masukkan string ke " + (i + 1) + " :");
            string[i] = input.next();
        }
        
        shorting(string);
        bs(string);
    }
}

