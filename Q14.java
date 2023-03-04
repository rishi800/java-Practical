import javax.swing.*;
public class Q14 {
    public static void main(String[] args) {
        int ar1[][] = new int[3][3];
        int ar2[][] = new int[3][3];
        int ar3[][] = new int[3][3];
        int i,j,k;
        System.out.println("Entre First Array Value:");
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                ar1[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Entre Value:"));
            }
        }
        System.out.println("Entre Second Array Value:");
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                ar2[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Entre Value:"));
            }
        }
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                ar3[i][j]=0;
                for ( k = 0; k < 3; k++) {
                    ar3[i][j]+=ar1[i][k]*ar2[k][j];
                }
            }
        }
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                System.out.print(ar3[i][j]+" ");
            }System.out.println();
        }
    }
}
