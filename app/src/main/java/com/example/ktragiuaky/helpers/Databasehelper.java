package com.example.ktragiuaky.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Databasehelper extends SQLiteOpenHelper {



    private static final String DATABASE_NAME = "ContactManager.db";
    private static final int DATABASE_VERSION = 1;
    public Databasehelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String createUnitsTable = "CREATE TABLE IF NOT EXISTS Units (" +
                "unit_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "unit_name TEXT NOT NULL, " +
                "email TEXT NOT NULL, " +
                "website TEXT, " +
                "logo BLOB, " +
                "address TEXT NOT NULL, " +
                "phone TEXT NOT NULL" +
                ");";

        String createEmployeesTable = "CREATE TABLE IF NOT EXISTS Employees (" +
                "employee_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "employee_name TEXT NOT NULL, " +
                "position TEXT, " +
                "email TEXT NOT NULL, " +
                "avatar BLOB, " +
                "unit_id INTEGER NOT NULL, " +
                "FOREIGN KEY (unit_id) REFERENCES Units (unit_id)" +
                ");";

        db.execSQL(createUnitsTable);
        db.execSQL(createEmployeesTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Units");
        db.execSQL("DROP TABLE IF EXISTS Employees");
        onCreate(db);

    }
}
