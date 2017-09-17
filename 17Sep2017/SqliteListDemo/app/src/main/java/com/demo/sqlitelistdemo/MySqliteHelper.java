package com.demo.sqlitelistdemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

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

    public ArrayList<Contact> getContacts(){
        ArrayList<Contact> contacts = new ArrayList<>();
        String[] cols = new String[]{
          "id","name","phone"
        };
        Cursor cursor = getReadableDatabase().query("Contacts",cols,null,null,null,null,null);
        while (cursor.moveToNext()){
            int nameColumnIndex = cursor.getColumnIndex("name");
            String name = cursor.getString(nameColumnIndex);
            int phoneColumnIndex = cursor.getColumnIndex("phone");
            String phone = cursor.getString(phoneColumnIndex);
            int idColumnIndex = cursor.getColumnIndex("id");
            int id = cursor.getInt(idColumnIndex);
            contacts.add(new Contact(id,name,phone));
        }
        return contacts;
    }

    public void delContact(int id){
        String[] args = new String[]{
            String.valueOf(id)
        };
        getWritableDatabase().delete("Contacts","id = ?",args);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
