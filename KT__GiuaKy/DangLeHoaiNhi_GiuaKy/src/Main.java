public class Main {
    public static void main(String[] args) {
        KeHoachKyHocNhi kh=new KeHoachKyHocNhi.Builder_Nhi()
                .addSVNhi("61132428","DangLeHoaiNhi","27/02/2001","Ninh Hoa")
                .addMH_Nhi("MTK1","MauThietKe",3)
                .addMHCT_Nhi("MTK2","mauthietke",3)
                .hienThi_Nhi();
        System.out.println(kh.toString());
    }
}