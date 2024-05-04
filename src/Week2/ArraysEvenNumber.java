
//Dizideki tekrar eden çift sayıları bulan program.
package Week2;
public class ArraysEvenNumber {

    //Bu metodu yeni diziye, tekrar eden sayılardan sadece birini koymak için yazdık.
    static boolean isFind(int[] arr,int value){
        for(int i: arr){
            if(value==i){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list={4,7,4,4,2,8,10,21,10,33,8};
        int[] duplicate=new int[list.length]; //Tekrar eden çift sayıları ekleyeceğimiz yeni dizi oluşturdum.
        int startIndex=0; //Yeni dizimin index numarasını bu değişken olarak belirledim.
        for(int i=0; i<list.length;i++){
            for(int j=0;j<list.length;j++){
                if((i!=j) && (list[i]==list[j]) && (list[i]%2==0)){
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++]=list[i];
                    }
                    break;
                }
            }
        }
        //Yeni dizimi foreach ile dönerek sadece tekrar eden sayıları ekrana bastıdım.
        for(int i:duplicate){
            if(i!=0){
                System.out.println(i);
            }
        }
    }
}
