public class Main {
    public static void main(String[] args) {
        Worker a = new Worker("Nguyen Ngoc Dung",5,0.7);
        Worker b = new Worker("Hoang To Uyen",4,0.7);
        PhongBan a1 = new PhongBan("Phong A");
        a1.themNV(a);
        a1.themNV(b);
        a1.inTTin();
        //a1.xoaNV();
        a1.inTTin();
        System.out.println(a1.tongLuong());
    }
}