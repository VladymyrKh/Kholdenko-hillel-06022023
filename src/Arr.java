import java.util.Arrays;
public class Arrays {
    public static void main(String[] args) {
        int[] arrayComp=new int[7];
        for (int i=0; i<=arrayComp.length; i++){
            arrayComp[i]=(int)(Math.random()*10);
            System.out.println(Arrays.toString(arrayComp[i]));
        }
    }
}
