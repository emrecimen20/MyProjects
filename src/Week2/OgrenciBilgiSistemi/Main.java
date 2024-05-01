package Week2.OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        //Oluşturduğumuz 3 öğretmen objesi.
        Teacher t1= new Teacher("Mahmut Hoca","05449038976","MAT");
        Teacher t2=new Teacher("Fatma Ayşe","0394721389219","FZK");
        Teacher t3=new Teacher("Ali Veli","963890584","KMY");
        //Oluşturduğumuz 3 ders objesi.
        Course mat=new Course("Matematik","MAT101","MAT");
        Course fzk=new Course("Fizik","FZK101","FZK");
        Course kmy=new Course("Kimya","KMY101","KMY");

        mat.addTeacher(t1);
        fzk.addTeacher(t2);
        kmy.addTeacher(t3);

        //Oluşturduğumuz 3 öğrenci objesi.
        Student s1 = new Student("İnek Şaban","203","4",mat,fzk,kmy);
        Student s2=new Student("Güdük Necmi","204","4",mat,fzk,kmy);
        Student s3=new Student("Ferit","87","5",mat,fzk,kmy);

        //Öğrencilerin notlarını giriyoruz ve notları, sözlü notları, ortalaması ve geçip kaldığını ekrana bastırıyoruz.(Metotlarımız sayesinde)
        s1.addBulkExamNote(50,60,70);
        s1.printNote();
        s1.addSozluNote(50,70,90);
        s1.printSozluNote();
        s1.isPassCheck();
        System.out.println("=========================");
        s2.addBulkExamNote(80,90,100);
         s2.printNote();
        s2.addSozluNote(50,70,90);
         s2.printSozluNote();
        s2.isPassCheck();
        System.out.println("=========================");
        s3.addBulkExamNote(40,30,20);
        s3.printNote();
        s3.addSozluNote(50,60,40);
        s1.printSozluNote();
        s3.isPassCheck();
    }
}
