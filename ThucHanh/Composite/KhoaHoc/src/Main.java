public class Main {
    public static void main(String[] args) {
        KhoaHoc k1= new KhoaHoc(2023,1,"Tin hoc co so",3,100000);
        KhoaHoc k3= new KhoaHoc(2023,1,"Co so du lieu",3,100000);
        KhoaHoc k4= new KhoaHoc(2023,1,"Cau truc du lieu",3,100000);
        KhoaHoc k2= new KhoaHoc(2023,2,"Chay",2,200000);
        KhoaHoc k5= new KhoaHoc(2023,2,"Bơi",2,20000);
        KhoaHoc k6= new KhoaHoc(2023,2,"Bóng đá",2,20000);
        k1.add(k3);
        k1.add(k4);
        k2.add(k5);
        k2.add(k6);
        k1.showall();
        k2.showall();
        System.out.println("Năm học "+k1.getNamHoc()+" Học kỳ "+k1.getKyHoc()+ " Tổng số tín chỉ: "+k1.tongTC()+" chỉ");
        System.out.println("Năm học "+k1.getNamHoc()+" Học kỳ "+k1.getKyHoc()+ " Tổng số học phí: "+k1.tongHocPhi());
        System.out.println("Năm học "+k2.getNamHoc()+" Học kỳ "+k2.getKyHoc()+" Tổng số tín chỉ :"+k2.tongTC()+" chỉ");
        System.out.println("Năm học "+k2.getNamHoc()+" Học kỳ "+k2.getKyHoc()+" Tổng số học phí :"+k2.tongHocPhi());
     }
    }
