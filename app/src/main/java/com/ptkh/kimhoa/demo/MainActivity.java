package com.ptkh.kimhoa.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String thang = "mười";
        switch (thang) {
            case "một":
                Log.d("String", "Không phải tháng 9, là tháng 1");
                break;
            case "hai":
                Log.d("String", "Không phải tháng 9, là tháng 2");
                break;
            case "chín":
                Log.d("String", "Là tháng 9 ");
                break;
            default:
                Log.d("String", "Không xác định");
        }
//                Tạo mảng
                ArrayList<String> arrName = new ArrayList<>();
//                Thêm phần tử
                arrName.add("Kim Hòa"); //0
                arrName.add("Khánh Huyền");//1
                arrName.add("Ngọc Trâm");//2
                arrName.add("Tuyết My");//3
//                Đếm sl phần tử mảng
                Log.d("String", "Size 1: " + arrName.size());
//                Truy cập 1 phần tử
//                Cách 1
                for(int i=0; i<arrName.size(); i++) {
                    Log.d("String", "Phần tử thứ" + i +": "+ arrName.get(i));
                }
                Log.d("String", arrName.get(0));
//                Xóa phần tử

                Log.d("String", "Phần tử bị xóa: " + arrName.remove(0));
                Log.d("String", "Size 2: " + arrName.size());
                Log.d("String", arrName.get(0));
//                Truy cập 1 phần tử
//                Cách 2
                for(String ten: arrName ){
                    Log.d("String", ten);
                }
//    Gọi hàm ThongBao
        ThongBao("Hòa", 20);
        ThongBao("Trâm", 22);
    }
//    Tạo hàm
    private void ThongBao(String ten, int tuoi)
    {
        Log.d("String", "Xin chào bé: " + ten + " "+ tuoi + " tuổi");
    }

    /**
     * Created by Hoa Ngu on 9/12/2017.
     */

    public static class them {
    }
}
