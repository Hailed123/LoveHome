package com.example.library.jsonpackage;

import android.util.Log;

import com.example.library.entitypackage.Entity;
import com.example.library.httppackage.Item_http_library;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;

/**
 * Created by tanyang on 2016/8/10.
 */
public class Json {
    //首页的数据填充
    public  static ArrayList<Entity> home_listview_json (JSONObject jsonObject) {
       ArrayList<Entity> home_listview_arraylist=null;
        Log.e("tag","545555555afafaf");
         try{
             String status=jsonObject.getString("msg");
             if(status.equals("success")){
                 Log.e("tag","aasfafafafafaf");
                     String a=jsonObject.getString("list");
                     Gson gson=new Gson();
                     home_listview_arraylist=gson.fromJson(a,new TypeToken<ArrayList<Entity>>(){}.getType());
                 Log.e("ggg",a);
                 Log.e("afaf",home_listview_arraylist.get(0).getBusiness_location());
                 }
         }catch (Exception e){e.printStackTrace();}
        return home_listview_arraylist;
    }

}
