package Week2.OgrenciBilgiSistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;

   public Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
        int sozlu=0;
    }

      public   void addTeacher(Teacher courseTeacher){
          this.courseTeacher= courseTeacher;
    }

   public void printTeacher(){
       if(courseTeacher!=null){
           System.out.println(this.name + "Dersinin Akademisyeni"+ courseTeacher.name);
       }else{
           System.out.println(this.name + "dersine akademisyen atanmamıştır.");
       }
   }


}
