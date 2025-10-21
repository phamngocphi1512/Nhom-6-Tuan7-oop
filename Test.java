public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach(5);

        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT01", "Lập trình Java", "Nguyễn Văn A",
                2020, 80000, 120, "Công nghệ thông tin", "Đại học");

        SachTieuThuyet st1 = new SachTieuThuyet("TT01", "Harry Potter", "J.K.Rowling",
                2018, 150000, 50, "Phiêu lưu", true);

        ql.themSach(sg1);
        ql.themSach(st1);

        System.out.println("=== DANH SÁCH SÁCH ===");
        ql.hienThiDanhSach();

        System.out.println("\n=== KIỂM TRA GIAO DIỆN IKiemKe ===");
        IKiemKe kiemKe = sg1;
        System.out.println("Đủ tồn kho (>=100)? " + kiemKe.kiemTraTonKho(100));
        kiemKe.capNhatViTri("Kho A1 - Kệ 5");
    }
}