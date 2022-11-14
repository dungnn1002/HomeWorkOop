import java.util.ArrayList;

public class PhongBan {
    private String tenPhongBan;
    private byte soNhanVien;
    public final static byte SO_NHAN_VIEN_MAX = 100;
    public ArrayList<Worker> dsnv= new ArrayList<Worker>();


    public PhongBan(String tenPB)
    {
        dsnv = new ArrayList<>(SO_NHAN_VIEN_MAX);
        tenPhongBan = tenPB;
        soNhanVien = 0;
    }
    public boolean themNV(Worker worker)
    {
        if(soNhanVien >= SO_NHAN_VIEN_MAX)
        {
            return  false;
        }
        dsnv.add(worker);
        soNhanVien++;
        return true;
    }
    public Worker xoaNV()
    {
        if(soNhanVien < 0)
        {
            return null;
        }
        Worker tmp = dsnv.get(soNhanVien-1);
        dsnv.remove(tmp);
        soNhanVien--;

        return tmp;
    }
    public double tongLuong()
    {
        double tong = 0.0;
        for (int i= 0; i < soNhanVien; i++)
        {
            tong += dsnv.get(i).payroll();
        }
        return tong;
    }
    public void inTTin()
    {
        System.out.println("TenPB: "+tenPhongBan);
        System.out.println("SoNV: "+soNhanVien);
        System.out.println("Thong tin NV: ");
        for (int i = 0; i < soNhanVien; i++)
        {
            dsnv.get(i).PrintInformation();
        }
    }
}
