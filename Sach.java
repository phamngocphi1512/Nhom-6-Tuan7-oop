public abstract class Sach {
    protected String maSach;
    protected String tenSach;
    protected String tacGia;
    protected int namXuatBan;
    protected double giaCoBan;
    protected int soLuong;

    public Sach(String maSach, String tenSach, String tacGia,
                int namXuatBan, double giaCoBan, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.giaCoBan = giaCoBan;
        this.soLuong = soLuong;
    }

    public abstract double tinhGiaBan();

    public String toString() {
        return "Mã: " + maSach + ", Tên: " + tenSach + ", Tác giả: " + tacGia +
               ", Năm XB: " + namXuatBan + ", Giá cơ bản: " + giaCoBan +
               ", Số lượng: " + soLuong;
    }
}