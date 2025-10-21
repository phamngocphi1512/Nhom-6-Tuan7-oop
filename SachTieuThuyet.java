public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;
    private boolean laSeries;

    public SachTieuThuyet(String maSach, String tenSach, String tacGia,
                          int namXuatBan, double giaCoBan, int soLuong,
                          String theLoai, boolean laSeries) {
        super(maSach, tenSach, tacGia, namXuatBan, giaCoBan, soLuong);
        this.theLoai = theLoai;
        this.laSeries = laSeries;
    }

    public double tinhGiaBan() {
        if (laSeries) {
            return giaCoBan + 15000;
        } else {
            return giaCoBan;
        }
    }

    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách "" + tenSach + "" đến " + viTriMoi);
    }

    public String toString() {
        return super.toString() + ", Thể loại: " + theLoai +
               ", Series: " + (laSeries ? "Có" : "Không") +
               ", Giá bán: " + tinhGiaBan();
    }
}