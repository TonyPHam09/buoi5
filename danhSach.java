package tuan5;
import java.util.ArrayList;

public class danhSach {
	private ArrayList<phongHoc> danhsach;
	public danhSach() {
		danhsach = new ArrayList<>();
	}
	public void add(phongHoc phongHoc) {
		if(!allow(phongHoc.getMaphong())) {
			danhsach.add(phongHoc);
		}
		else {
			System.out.println("da ton tai, xin nhap lai: ");
		}
	}
	public boolean allow(String maphong) {
		for(phongHoc phongHoc : danhsach) {
			if(phongHoc.getMaphong().equals(maphong)) {
				return true;
			}
		}
		return false;
	}
}
