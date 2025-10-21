public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tenSach, String tacGia,
                         int namXuatBan, double giaCoBan, int soLuong,
                         String monHoc, String capDo) {
        super(maSach, tenSach, tacGia, namXuatBan, giaCoBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public double tinhGiaBan() {
        int soNam = 2025 - namXuatBan;
        return giaCoBan + (soNam * 5000);
    }

    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách "" + tenSach + "" đến " + viTriMoi);
    }

    public String toString() {
        return super.toString() + ", Môn học: " + monHoc + ", Cấp độ: " + capDo +
               ", Giá bán: " + tinhGiaBan();
    }
}