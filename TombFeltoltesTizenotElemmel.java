// Tömbkezelő metódussal rendezzünk növekvő sorrendbe egy 15 elemszámú véletlen számokat 
// (1-50 között) tartalmazó tömböt!

package tomb_feltoltes_tizenot_elemmel;

import java.util.Arrays;
import java.util.Random;

public class TombFeltoltesTizenotElemmel {

    public static void main(String[] args) {
        tomb_feltoltes(15, 1, 50);
    }
    
    private static void tomb_feltoltes(int elementNumber, int minValue, int maxValue) {
        Random r = new Random();
        
        int[] tizenot_elemu_tomb = new int[elementNumber];
        
        for (int i = 0; i < elementNumber; i++) {
            tizenot_elemu_tomb[i] = r.nextInt(maxValue - minValue + 1) + minValue;
        }
        
        Arrays.sort(tizenot_elemu_tomb);
        
        System.out.println(Arrays.toString(tizenot_elemu_tomb));
    }
}
