public class bubleShort {
    public static void main(String[] args){
        int[] a = {1,3,-1,-3,5,2,7};
        
        System.out.println("Sebelum di sort");
        for (int x = 0; x < a.length; x++) {
            System.out.print(" " + a[x]);
        }
        
        System.out.println("");
        System.out.println("Sesudah di sort");
        for (int i = (a.length-1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[(j+1)]) {
                    int temp = a[(j+1)];
                    a[(j+1)] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        
        System.out.println("");
    }
}
