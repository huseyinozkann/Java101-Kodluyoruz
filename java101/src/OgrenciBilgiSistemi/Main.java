package OgrenciBilgiSistemi;

public class Main {
    public static void main(String []args){

        Course mat = new Course("Matematik","MAT101","MAT");
        Course fizik = new Course("Fizik","FZK101","FZK");
        Course kimya = new Course("Kimya","KMY101","KMY");

        Teacher t1 = new Teacher("Ali","90550000000","MAT");
        Teacher t2 = new Teacher("Veli","90550000001","FZK");
        Teacher t3 = new Teacher("Hasan","90550000003","KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("A",3,"1000000",mat,fizik,kimya);
        s1.addBulkExamNote(60,70,45,80,60,20);
        s1.isPass();

        Student s2 = new Student("B",3,"1000001",mat,fizik,kimya);
        s2.addBulkExamNote(60,70,45,80,60,20);
        s2.isPass();

        Student s3 = new Student("A",3,"1000002",mat,fizik,kimya);
        s3.addBulkExamNote(60,70,45,80,60,20);
        s3.isPass();
    }
}
