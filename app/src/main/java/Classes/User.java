package Classes;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Fts4;
import androidx.room.PrimaryKey;

@Fts4(languageId = "lid")
@Entity(tableName = "Users")
public class User {
    @PrimaryKey
    public int uId;

    @ColumnInfo(name = "firstName")
    public String firstName;

    @ColumnInfo(name = "lastName")
    public String lastName;
}