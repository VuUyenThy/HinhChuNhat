package VuUyenThy_23730871;

public class HinhChuNhat {
//Khai bao bien kieu private
	private double chieuDai;
	private double chieuRong;

	//Dong goi 
	public double getChieuDai() {
		return chieuDai;
	}
	//Rang buoc 
	public void setChieuDai(double d) {
		if (d>0) {
			this.chieuDai = d;	
		} else {
			System.out.println("Loi");
		}
	}
	
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double r) {
		if (r>0) {
			this.chieuRong = r;	
		} else {
			System.out.println("Loi");
		}	
	}
	
	//Ham tao (constructor)
	public HinhChuNhat(){}
	public HinhChuNhat(double d, double r) {
		if (d>0) {
			this.chieuDai = d;	
		} else {
			System.out.println("Loi");
		}
		
		if (r>0) {
			this.chieuRong = r;	
		} else {
			System.out.println("Loi");
		}	
	}
	
	//Phuong thuc chu vi hinh chu nhat
	public  double getCV() {
		return (getChieuDai()*getChieuRong())*2;
	}
	
	//Phuong thuc dien tich hinh chu nhat
	public  double getDienTich() {
		return (getChieuDai()*getChieuRong());
	}
	
	//Tao mau in tostring 
	public String toString() {
		String s = "";
		s = s + s.format("|%10s|%10s|%10s|%10s|",getChieuDai(),getChieuRong(),getCV(),getDienTich());
	return s;
	}
}












