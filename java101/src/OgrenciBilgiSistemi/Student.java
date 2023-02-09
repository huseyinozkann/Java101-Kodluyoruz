package OgrenciBilgiSistemi;

public class Student {
    String name, stuNo;
    int classes;
    Course c1, c2, c3;
    double avarage;
    boolean isPass;

    public Student(String name, int classes, String stuNo, Course c1, Course c2, Course c3){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int c1Note1, int c1Note2, int c2Note1, int c2Note2, int c3Note1, int c3Note2){

        if ((c1Note1 >= 0 && c1Note1 <= 100) && (c1Note2 >= 0 && c1Note2 <= 100)){
            this.c1.note = ((c1Note1 * 0.80) + (c1Note2 * 0.20));
        }

        if ((c2Note1 >= 0 && c2Note1 <= 100) && (c2Note2 >= 0 && c2Note2 <= 100)){
            this.c2.note = ((c2Note1 * 0.80) + (c2Note2 * 0.20));
        }

        if ((c3Note1 >= 0 && c3Note1 <= 100) && (c3Note2 >= 0 && c3Note2 <= 100)){
            this.c3.note = ((c3Note1 * 0.80) + (c3Note2 * 0.20));
        }
    }

    public void isPass(){
        if (this.c1.note == 0 || this.c2.note == 0 || this.c3.note == 0){
            System.out.println("Notlar Tam Olarak Girilmemiş !");
        }else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " +this.avarage);
            if (this.isPass){
                System.out.println("Sınıfı Geçti !");
            }else {
                System.out.println("Sınıfta Kaldı !");
            }
        }
    }
    public void calcAvarage() {
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
    }

    public boolean isCheckPass(){
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println(this.c1.name + " Notu : " + this.c1.note);
        System.out.println(this.c2.name + " Notu : " + this.c2.note);
        System.out.println(this.c3.name + " Notu : " + this.c3.note);

    }
}
