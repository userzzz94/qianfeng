package activity.huafeng.com.mymapdemo.util;

import android.app.Application;


import com.baidu.location.LocationClient;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;


/**
 * Created by leovo on 2018-08-28.
 */

public class MyApplication extends Application {
    private static final String TAG = "Init";

    public  LocationClient mLocationClient = null;
    private MyLocationListener myListener = new MyLocationListener();

    @Override
    public void onCreate() {
                super.onCreate();

        // 在SDK各功能组件使用之前都需要调用 SDKInitializer.initialize(getApplicationContext());
        // 因此我们建议该方法放在Application的初始化方法中
        SDKInitializer.initialize(getApplicationContext());
        SDKInitializer.setCoordType( CoordType.BD09LL);// 告诉百度,使用的是百度坐标


    }

    
}

