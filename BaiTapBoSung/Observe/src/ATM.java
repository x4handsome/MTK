public class ATM {
        private ITaiKhoanATM taiKhoan;
        public  void attach (ITaiKhoanATM taiKhoan){
            this.taiKhoan = taiKhoan;
        }
        public  void detach(){
            this.taiKhoan = null;
        }
    public static interface ITaiKhoanATM{
        boolean kiemtraSoDu(int soTienRut);
        void thongBao (int soTienRut, boolean thanhCong);
    }

        private boolean kiemtraTienRut(int soTienRut){
            return taiKhoan.kiemtraSoDu(soTienRut);
        }
        public void rutTien(int soTienRut){
            if(taiKhoan!=null){
                if(kiemtraTienRut(soTienRut)){
                    taiKhoan.thongBao(soTienRut,true);
                }
                else{
                    taiKhoan.thongBao(soTienRut, false);
                }
            }
            else{
                System.out.println("Không có thẻ trong máy!!!");
            }
        }

    }
