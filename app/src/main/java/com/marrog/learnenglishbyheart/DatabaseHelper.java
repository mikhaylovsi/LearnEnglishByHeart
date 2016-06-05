package com.marrog.learnenglishbyheart;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

/**
 * Created by Сергей on 27.03.2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper implements BaseColumns{

    private static final String DATABASE_NAME = "mydatabase.db";

    private static final int DATABASE_VERSION = 1;

    public static final String DATABASE_TABLE = "words";

    public static final String RUSSIAN_COLUMN = "russian";
    public static final String ENGLISH_COLUMN = "english";

    public static final String DATABASE_CREATE_SCRIPT = "create table "
            + DATABASE_TABLE + " (" + BaseColumns._ID
            + " integer primary key autoincrement, "
            + RUSSIAN_COLUMN + " text not null, "
            + ENGLISH_COLUMN + " text not null);";


    DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DATABASE_CREATE_SCRIPT);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        Log.w("SQLite", "Обновляемся с версии " + oldVersion + " на версию " + newVersion);

        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_TABLE);

        onCreate(db);

    }
}
