/*Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir).
Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur.
Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.*/

package Week2;
public class MatrisTranspozu {

    //Matrisimizi yazdırdığımız methodumuz.
    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //İlk matrisimiz ve transpozunu alacağımız için yeni bir çok boyutlu matris tanımladım.
        int[][] matris={{2,3,4},{5,6,4}};
        int[][] matrisTranspoze=new int[matris[0].length][matris.length];

        //Yeni matrisin sütun ve satırını eski matrisin satır ve sütununa eşitledim ve böylece transpozu alındı.
        for(int i=0;i<matris.length;i++){
            for(int j=0;j<matris[i].length;j++){
                matrisTranspoze[j][i]=matris[i][j];
            }
        }

        //Matrisi ve bu matrisin transpozunu yazdırdım.
        printMatrix(matris);
        System.out.println("=================");
        printMatrix(matrisTranspoze);


    }

}
