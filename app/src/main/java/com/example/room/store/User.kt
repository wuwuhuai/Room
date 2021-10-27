package com.example.room.store

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastName: String?
){
    companion object{
        fun mock():User{
            return User(123,"林","武淮")
        }

        fun mockUpdate(): User {
            return User(123, "林", "Vinci")
        }
    }
}
