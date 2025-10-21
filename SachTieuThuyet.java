public class SachTieuThuyet extends Sach implements IkiemKe {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        double giaThem = laSachSeries ? 15000.0 : 0.0;
        return getGiaCoBan() + giaThem;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach [" + getTieuDe() + "] den khu vuc: [" + viTriMoi + "].");
    }

    @Override
    public String toString() {
        return super.toString() + ", The loai: " + theLoai + ", La series: " + (laSachSeries ? "Co" : "Khong");
    }
}
