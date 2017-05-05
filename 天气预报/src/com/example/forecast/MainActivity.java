package com.example.forecast;

import java.util.ArrayList;

import net.youmi.android.AdManager;
import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;

import org.apache.http.Header;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.TextHttpResponseHandler;

public class MainActivity extends Activity {
	public static final String rootURL="http://wthrcdn.etouch.cn/weather_mini?city=";
	private Button btnQuery;
	private EditText etCity;
	private ListView lv;
	private ArrayList<Day> forecast;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		AdManager.getInstance(this).init("ba3df4f652134492",
				"40fabb9d52b6a74b", false);
		//实例化广告条
		AdView adView = new AdView(this, AdSize.FIT_SCREEN);
		//获取要嵌入广告条的布局
	LinearLayout adLayout=(LinearLayout)findViewById(R.id.adLayout);
		//将广告条加入到布局中
	adLayout.addView(adView);

		initView();
		initData();
		
	}

	private void initView() {
		etCity = (EditText) findViewById(R.id.et_city);
		btnQuery = (Button) findViewById(R.id.btn_query);
		lv = (ListView) findViewById(R.id.lv_forecast);
		
	}

	private void initData() {
		btnQuery.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
					
				
				 String name = etCity.getText().toString().trim();
				if (TextUtils.isEmpty(name)) {
					Toast.makeText(getApplicationContext(), "输入的城市名为空", 0).show();
				}else {
					 String url=rootURL+name;
					 AsyncHttpClient c = new AsyncHttpClient();
					 c.get(url, new TextHttpResponseHandler() {
						@Override
						public void onSuccess(int statusCode, Header[] headers,
								String responseString) {
							try {
								
							String cityJson = responseString;
							 String s=cityJson;
							 Json object = JSON.parseObject(s, Json.class);
							 String cityName = object.getData().getCity();
							 forecast = object.getData().getForecast();
							} catch (Exception e) {
								Toast.makeText(getApplicationContext(), "该城市不存在", 0).show();
							}
							 lv.setAdapter(myAdapter);
						}
						
						@Override
						public void onFailure(int statusCode, Header[] headers,
								String responseString, Throwable throwable) {
							Toast.makeText(getApplicationContext(), "服务器错误", 0).show();
						}
					});
				}	
				}	
			
		});
	
	}
	private BaseAdapter myAdapter=new BaseAdapter() {
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View view = View.inflate(getApplicationContext(), R.layout.item, null);
			TextView date=(TextView) view.findViewById(R.id.tv_date);
			TextView weather=(TextView)view.findViewById(R.id.tv_weather);
			TextView hight=(TextView)view.findViewById(R.id.tv_high);
			TextView low=(TextView)view.findViewById(R.id.tv_low);
			date.setText(forecast.get(position).getDate());
			weather.setText(forecast.get(position).getType());
			hight.setText(forecast.get(position).getHigh());
			low.setText(forecast.get(position).getLow());
			return view;
			
		}
		
		@Override
		public long getItemId(int position) {
			return 0;
		}
		
		@Override
		public Object getItem(int arg0) {
			return null;
		}
		
		@Override
		public int getCount() {
			return forecast.size();
		}
	};
	}
