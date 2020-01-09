package NguyenDuyNghia.com;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaiTapRenLuyen4_Bai2 {
	static HashMap<String, String> qlSV=new HashMap<String, String>();
	static Collection<String>values=qlSV.values();
	static Collection<String>keys=qlSV.keySet();
	


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
				+ "\n\t5.Xuất mã Sinh Viên" 
				+ "\n\t6.Xuất tên Sinh viên"
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
			xuatMa();
			break;	
		}
		case 6:
		{
			xuatTen();
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
	private static void xuatTen() {
		// TODO Auto-generated method stub
		System.out.println("Danh sách tên SV là");
		for(String s:values)
		{
			System.out.println(s);
			
		}
		
	}
	private static void xuatMa() {
		// TODO Auto-generated method stub
		
		System.out.println("Danh sách mã SV là");
		for(String s:keys)
		{
			System.out.println(s);
			
		}
		
	}
	private static void tim() {
		// TODO Auto-generated method stub
		
		//Xuất danh sách SV sau mỗi lần thao tác
		System.out.println("-----");
		System.out.println("Danh sách Sinh viên");
		for(String s:keys)
		{
			
			if(qlSV.containsKey(s))
			{
				System.out.println(s+"."+qlSV.get(s));
			}
		}
		System.out.println("-----");
		
		System.out.println("Mời bạn nhập tên Sinh viên muốn tìm: ");
		String tim=new Scanner(System.in).nextLine();
		String ten="";
		
		for(Map.Entry<String, String> entry:qlSV.entrySet())
		{
			ten=entry.getValue();
			if(ten.contains(tim))
			{
				System.out.println("Sinh viên bạn muốn tìm:");
				System.out.println(entry.getKey()+". "+ten);
				
			}
		}
		if(ten=="")
		{
			System.out.println("Danh sách không có Sinh viên bạn cần tìm");
		}
		
		
		
	}
	private static void xoa() {
		// TODO Auto-generated method stub
		System.out.println("-----");
		System.out.println("Danh sách Sinh viên");
		for(String s:keys)
		{
			
			if(qlSV.containsKey(s))
			{
				System.out.println(s+"."+qlSV.get(s));
			}
		}
		System.out.println("-----");
		
		System.out.println("Bạn muốn xóa Sinh viên nào: ");
		String xoa=new Scanner(System.in).nextLine();
		for(String s:values)
		{
			if(s.contains(xoa))
			{
				System.out.println(s);
			}
		}
		
	}
	private static void sua() {
		// TODO Auto-generated method stub
		System.out.println("-----");
		System.out.println("Danh sách Sinh viên");
		for(String s:keys)
		{
			
			if(qlSV.containsKey(s))
			{
				System.out.println(s+"."+qlSV.get(s));
			}
		}
		System.out.println("-----");
		
		System.out.println("Mời bạn nhập mã SV cần sửa: ");
		String ma = new Scanner(System.in).nextLine();
		System.out.println("Bạn muốn sửa MSSV hay Tên SV:\n Nhấn 1 để sửa tên \n Nhấn 0 để sửa mã ");
		int kt=new Scanner(System.in).nextInt();
		switch(kt)
		{
		case 1:
			{
				System.out.println("Mời bạn sửa tên SV: ");
			    String ten=new Scanner(System.in).nextLine();
			    if(qlSV.containsKey(ma))
			    {
			    	qlSV.replace(ma, ten);
			    }
			}
			
			break;
		case 2:
			break;
		}
		
		//Xuất danh sách sau khi sửa
		System.out.println("-----");
		System.out.println("Danh sách Sinh viên sau khi sửa:");
		for(String s:keys)
		{
			
			if(qlSV.containsKey(s))
			{
				System.out.println(s+"."+qlSV.get(s));
			}
		}
		System.out.println("-----");
		
		
	}
	private static void them() {
		// TODO Auto-generated method stub
		System.out.println("Mời bạn nhập mã SV: ");
		String ma = new Scanner(System.in).nextLine();
		
		if(qlSV.containsKey(ma))
		{
			System.out.println("Sinh viên bạn nhập đã tồn tại, vui lòng kiểm tra lại");
			
		}
		else {
			System.out.println("Mời bạn nhập tên SV: ");
			String ten=new Scanner(System.in).nextLine();
			qlSV.put(ma, ten);
		}
		
		
		Collection<String>values=qlSV.values();
		Collection<String>key=qlSV.keySet();

		System.out.println("-----");
		System.out.println("Danh sách Sinh viên");
		for(String s:key)
		{
			
			if(qlSV.containsKey(s))
			{
				System.out.println(s+"."+qlSV.get(s));
			}
		}
		System.out.println("-----");
		
		
	}
	

}
