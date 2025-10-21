public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        Sach sg1 = new SachGiaoTrinh("GT001", "Giai tich 1", "Nguyen Van A", 2021, 15, 50000.0, "Toan hoc", "Dai hoc");
        Sach sg2 = new SachGiaoTrinh("GT002", "Vat ly dai cuong", "Le Thi B", 2020, 10, 65000.0, "Vat ly", "Dai hoc");
        
        Sach sg3 = new SachGiaoTrinh("GT003", "Lich su Viet Nam", "Tran Van C", 2025, 20, 40000.0, "Lich su", "Cap 3");

        Sach st1 = new SachTieuThuyet("TT001", "Harry Potter", "J.K. Rowling", 2000, 5, 120000.0, "Gia tuong", true);
        Sach st2 = new SachTieuThuyet("TT002", "De men phieu luu ky", "To Hoai", 1941, 7, 30000.0, "Thieu nhi", false);

        ql.themSach(sg1);
        ql.themSach(sg2);
        ql.themSach(sg3);
        ql.themSach(st1);
        ql.themSach(st2);

        System.out.println("DANH SACH SACH VA GIA BAN UOC TINH:\n");
        ql.hienThiTatCa();

        System.out.println("\nKIEM TRA TRIEN KHAI GIAO DIEN IKiemKe:\n");

        IkiemKe kiemKeSG = (IkiemKe) sg1; 
        
        int soLuongToiThieu1 = 10;
        System.out.print("Kiem tra ton kho sach [" + sg1.getTieuDe() + "] voi SL Toi Thieu (" + soLuongToiThieu1 + "): ");
        boolean ketQua1 = kiemKeSG.kiemTraTonKho(soLuongToiThieu1);
        System.out.println(ketQua1 ? "DU HANG" : "HET HANG"); 

        int soLuongToiThieu2 = 20;
        System.out.print("Kiem tra ton kho sach [" + sg1.getTieuDe() + "] voi SL Toi Thieu (" + soLuongToiThieu2 + "): ");
        boolean ketQua2 = kiemKeSG.kiemTraTonKho(soLuongToiThieu2);
        System.out.println(ketQua2 ? "DU HANG" : "HET HANG"); 

        kiemKeSG.capNhatViTri("Kho A1-Ke 5");

        IkiemKe kiemKeTT = (IkiemKe) st1; 
        
        System.out.print("Kiem tra ton kho sach [" + st1.getTieuDe() + "] voi SL Toi Thieu (5): ");
        System.out.println(kiemKeTT.kiemTraTonKho(5) ? "DU HANG" : "HET HANG"); 

        kiemKeTT.capNhatViTri("Kho T2-Ke 10");
    }
}
