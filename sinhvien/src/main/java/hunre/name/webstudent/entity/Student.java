package hunre.name.webstudent.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_name")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="masv")
	private int maSV;
	
	@Column(name="hoten")
	private String hoTen;
	
	@Column(name="tenkhoa")
	private String tenKhoa;
	
	@Column(name="gioitinh")
	private String gioiTinh;
	
	@Column(name="diemtin")
	private String diemTin;
	
	public Student() {
		
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getTenKhoa() {
		return tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiemTin() {
		return diemTin;
	}

	public void setDiemTin(String diemTin) {
		this.diemTin = diemTin;
	}

	@Override
	public String toString() {
		return "Student [maSV=" + maSV + ", hoTen=" + hoTen + ", tenKhoa=" + tenKhoa + ", gioiTinh=" + gioiTinh
				+ ", diemTin=" + diemTin + "]";
	}
	
	
	
}
