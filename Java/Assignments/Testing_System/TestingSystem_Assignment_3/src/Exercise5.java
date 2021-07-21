public class Exercise5 {
/*    public static void Question_1(){
        String TenNV = "Nguyễn Văn A";
        int MaNV = 1;
        String Group = "Gr1";
        System.out.println();
    }*/
    int MaNV;
    String TenNV;
    String Group;

    Exercise5(int rollno, String name, String city) {
        this.MaNV = rollno;
        this.TenNV = name;
        this.Group = city;
    }

    // Ghi đè phương thức toString()
    public String toString() {
        return MaNV + " " + TenNV + " " + Group;
    }
    public static void main(String[] args) {
        Exercise5 qs1 = new Exercise5(1 , "Nguyễn Văn A" , "Gr1");
        System.out.println(qs1);
    }
}
