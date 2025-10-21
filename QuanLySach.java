public class QuanLySach {
    private Sach[] danhSach;
    private int soLuong;

    public QuanLySach(int kichThuoc) {
        danhSach = new Sach[kichThuoc];
        soLuong = 0;
    }

    public void themSach(Sach s) {
        if (soLuong < danhSach.length) {
            danhSach[soLuong] = s;
            soLuong++;
        }
    }

    public void hienThiDanhSach() {
        for (int i = 0; i < soLuong; i++) {
            System.out.println(danhSach[i].toString());
            System.out.println("→ Giá bán ước tính: " + danhSach[i].tinhGiaBan());
            System.out.println("---------------------------------");
        }
    }
}