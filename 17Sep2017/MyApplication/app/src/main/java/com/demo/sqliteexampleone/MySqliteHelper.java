package com.demo.sqliteexampleone;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ishaq Hassan on 9/17/2017.
 */

public class MySqliteHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "MySQLDB.db";
    private static final int DB_VER = 1;
    private final String TABLE_NAME = "Contacts";
    private final String COLUMN_ID = "id";
    private final String COLUMN_NAME = "name";
    private final String COLUMN_PHONE = "phone";


    public MySqliteHelper(Context context) {
        super(context, DB_NAME, null, DB_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
       /* sqLiteDatabase.execSQL("CREATE TABLE "+TABLE_NAME+"(" +
                COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT," +
                COLUMN_NAME+" VARCHAR(50)," +
                COLUMN_PHONE+" VARCHAR(50)" +
                ")");*/
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Contacts(id INTEGER PRIMARY KEY AUTOINCREMENT,name VARCHAR(50),phone VARCHAR(50))");
    }

    public long addContact(Contact contact){
        ContentValues contentValues = new ContentValues();
        contentValues.put("name",contact.getName());
        contentValues.put("phone",contact.getPhone());
        return getWritableDatabase().insert("Contacts",null,contentValues);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
