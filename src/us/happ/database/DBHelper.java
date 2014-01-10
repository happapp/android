package us.happ.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// TODO
// Convert to singleton class
public class DBHelper extends SQLiteOpenHelper {
	public static final String DB_NAME = "happ.db";
	public static final int DB_VERSION = 1;

	public DBHelper(Context context) {
		super(context, DB_NAME, null, DB_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
		GroupTable.onCreate(database);
	}

	@Override
	public void onUpgrade(SQLiteDatabase database, int oldVer, int newVer) {
		GroupTable.onUpgrade(database, oldVer, newVer);
	}
}
