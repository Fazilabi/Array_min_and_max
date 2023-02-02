public class Main {
    public static void main(String[] args) {
        int[] list1 = {15, 18, 4, 39, 102, 55, 65};
        //min ve max deyerlerine listin ilkin deyerlerini verirem

        int min = list1[0];
        int max = list1[0];
        for (int i = 0; i < list1.length; i++) {
            // for dongusunde her defe listdeki her bir reqemi digerleri ile
            //muqayise ederek min ve max deyerin hansi oldugunu yoxlayiriq.

            if (list1[i] < min) {
                //yoxlanilan listin her bir reqemi min -a beraberlesdiririk
                min = list1[i];
            }
            if (list1[i] > max) {
                //yoxlanilan listin her bir reqemi max-a beraberlesdiririk
                max = list1[i];
            }

        }
        System.out.println(min);
        System.out.println(max);
        
    }
}