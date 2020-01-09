package NguyenDuyNghia.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;



public class BaiTapRenLuyen4_Bai1 {

	static ArrayList<String>quanLySV=new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			do
			{
				menu();
				
			}
			while(true);
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}
	private static void menu()
	{
		System.out.println("Bạn muốn chọn chức năng nào:"
				+ "\n\t1.Thêm Sinh viên" 
				//+ "\n\t2.Xuất danh sách sinh viên" 
				+ "\n\t2.Sửa Sinh Viên" 
				+ "\n\t3.Xóa Sinh viên"
				+ "\n\t4.Tìm Sinh viên"
				+ "\n\t5.Sắp xếp Sinh Viên" 
				+ "\n\t6.Số lượng sinh viên"
				+ "\n\t7.Thoát");
		int kq=new Scanner(System.in).nextInt();
		switch (kq) {
		case 1:
		{
			them();
			break;
		}
		case 2:
		{
			sua();
			break;
		}
		case 3:
		{
			xoa();
			break;
		}
		case 4:
		{
			tim();
			break;
		}
		case 5:
		{
			sapXep();
			break;	
		}
		case 6:
		{
			soLuong();
			break;
		}
		case 7:
		{
			System.exit(7);
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + kq);
		}
	}
	
	private static void them()
	{
		//tạo bộ nhớ cho QuanlySV
		System.out.println("-------");
		xuat();
		System.out.println("-------");
		System.out.println("\nMời bạn thêm tên Sinh Viên:");
		String themSV=new Scanner(System.in).nextLine();
		quanLySV.add(themSV);
	}
	private static void xuat()
	{
		int stt=0;
		for(String s:quanLySV)
		{
			stt++;
			System.out.println(stt+"."+s);
		}
		
	}
	private static void sua()
	{
		System.out.println("-------");
		xuat();
		System.out.println("-------");
		System.out.println("Bạn muốn sửa Sinh viên thứ mấy:");
		int suaSV=new Scanner(System.in).nextInt();
		System.out.println("Mời bạn sửa bạn Sinh viên thứ "+suaSV );
		String tenSvSua=new Scanner(System.in).nextLine();
		quanLySV.set(suaSV-1, tenSvSua);
		System.out.println("-------");
		System.out.println("Danh sách sau khi sửa:");
		System.out.println("-------");
		xuat();
		System.out.println("-------");
		
	}
	private static void xoa()
	{
		System.out.println("-------");
		xuat();
		System.out.println("-------");
		System.out.println("Bạn muốn xóa Sinh viên thứ mấy:");
		int xoaSV=new Scanner(System.in).nextInt();
		
		quanLySV.remove(xoaSV-1);
		System.out.println("-------");
		System.out.println("Danh sách sau khi xóa:");
		System.out.println("-------");
		xuat();
		System.out.println("-------");
	}
	private static void tim()
	{
		int stt=0;
		System.out.println("Mời bạn nhập tên muốn tìm:");
		String timSv=new Scanner(System.in).nextLine();
		for(String s:quanLySV) 
		{
			stt++;
			
			if(s.contains(timSv))
			{
				System.out.println("-------\n"+"Tên Sinh viên bạn muốn tìm là:\n"+(stt+1)+"."+s+"\n"+"-------");
				break;
				
			}
			
		}
		System.out.println("-------");
		System.out.println("Tên Sinh viên bạn tìm không có trong danh sách");
		System.out.println("-------");
	}
	private static void sapXep()
	{
		System.out.println("Danh sách trước khi sắp xếp");
		System.out.println("-------");
		Collections.sort(quanLySV);
		xuat();
		System.out.println("-------");
	}
	private static void soLuong()
	{
		int dem=0;
		for(int i=0;i<quanLySV.size();i++)
		{
			dem++;
		}
		System.out.println("-------");
		System.out.println("Số lượng Sinh viên có trong danh sách hiện tại là:"+dem);
		System.out.println("-------");
		
		
	}

}
