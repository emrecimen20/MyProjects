package Week2.OgrenciBilgiSistemi;

/*Student Sınıfı Özellikleri :
Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
 */
public class Student {
    String name;
    String stuNo;
    String classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

   public Student(String name,String stuNo,String classes,Course mat,Course fizik,Course kimya){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        this.avarage=0.0;
        this.isPass=false;
    }
    //Notlarımızın 0 ile 100 arasında olmasını sağladım.
   public void addBulkExamNote(int note1,int note2,int note3){
       if(note1>0 && note1<=100){
           this.mat.note=note1;
       }

       if(note2>0 && note2<=100){
           this.fizik.note=note2;
       }

       if(note3>0 && note3<=100){
           this.kimya.note=note3;
       }

   }

   //Sözlü notu ekleme metodu.
 public void addSozluNote(int sozlu1,int sozlu2,int sozlu3){
      this.mat.sozlu=sozlu1;
      this.fizik.sozlu=sozlu2;
      this.kimya.sozlu=sozlu3;
 }
//ortalama hesaplama metodu.
public void calAverage(){
       this.avarage=((this.mat.note*0.80)+(this.mat.sozlu*0.20)+(this.fizik.note*0.80)+(this.fizik.sozlu*0.20)+(this.kimya.note*0.80)+(this.kimya.sozlu*0.20))/3.0;
     System.out.println("Not Ortalamaları :"+this.avarage);
 }

 //isPass ve isPassCheck öğrencinin ortalamasına bakarak sınıfı geçtiğini veya kaldığını söyleyen metot.
 public boolean isPass(){
       calAverage();
       if(this.avarage>=55){
          return this.isPass=true;
       }else{
          return  this.isPass=false;
       }
 }

 void isPassCheck(){
       isPass();
       if(this.isPass==true){
           System.out.println("Sınıfı Geçti.");
       }else{
           System.out.println("Sınıfta Kaldı.");
       }
 }





   public void printSozluNote(){
        System.out.println(mat.name + " Sözlü Notu\t:" + mat.sozlu);
        System.out.println(fizik.name + " Sözlü Notu\t:" + fizik.sozlu);
        System.out.println(kimya.name + " Sözlü Notu\t:" + kimya.sozlu);
    }

  public void printNote(){
       System.out.println(mat.name + " Notu\t:" + mat.note);
       System.out.println(fizik.name + " Notu\t:" + fizik.note);
       System.out.println(kimya.name + " Notu\t:" + kimya.note);
   }

}
