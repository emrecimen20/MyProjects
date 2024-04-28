/*Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.*/

package Week1;
public class AsalSayı {
    public static void main(String[] args) {

        /*asal sayıları bulabilmek için iç içe döngü oluşturdum ve ilk döngüdeki i j den 1 sayı önde gitti ve her
        döngüde i nin j ye bölümünden kalana baktım.Eğer kalan 0 ise asal değişkenimi false yaptım
        ve böylece asal değişkenimin true olduğu durumlar 1-100 arası asal sayıları verdi.*/

        for(int i=2;i<100;i++){
            boolean asal=true;
          for (int j=2;j<i;j++){
              if(i%j==0){
                  asal=false;
              }
          }
            if(asal){
                System.out.println(i);
            }
        }
    }
}
