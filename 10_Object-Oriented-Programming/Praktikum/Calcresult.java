import Model.Calc;
import Model.Calculation;

public class Calcresult {
    public static void main(String[] args){
        Calculation myCalc = new Calc(0);
        System.out.println("Penjumlahan :" + myCalc.getAdd());
        System.out.println("Pengurangan :" + myCalc.getSubs());
        System.out.println("Perkalian :" + myCalc.getMulti());
        System.out.println("Pembagian :" + myCalc.getDiv());
        }
    }

