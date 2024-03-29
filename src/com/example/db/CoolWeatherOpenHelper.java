package com.example.db;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper{
	public CoolWeatherOpenHelper(Context context, String name, CursorFactory factory,
			int  version){
		super (context, name, factory, version);
	}
public static final String CREATE_PROVINCE = "create table Province("
		+"id integer prinary key autoincrement,"
		+"province_name text,"
		+"province_code text)";
	
public static final String CREATE_CITY = "create table Province("
		+"id integer prinary key autoincrement,"
		+"city_name text,"
		+"city_code text)";
		
public static final String CREATE_COUNTY = "create table Province("
		+"id integer prinary key autoincrement,"
		+"county_name text,"
		+"county_code text)";
@Override
public void onCreate(SQLiteDatabase db){
	db.execSQL(CREATE_PROVINCE);
	db.execSQL(CREATE_CITY);
	db.execSQL(CREATE_COUNTY);
}
@Override
public void onUpgrade(SQLiteDatabase db,int oldversion,int newVersion){
	
}

}
