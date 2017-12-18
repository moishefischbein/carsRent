package com.example.moish.carrentforcompany.model.datasource;

import android.content.ContentValues;
import android.database.Cursor;

/**
 * Created by moish on 18/12/2017.
 */

public interface DB_manager {


    long addStudent(ContentValues values);
    boolean removeStudent(long id);
    boolean updateStudent(long id, ContentValues values);
    Cursor getStudents();

    long addLecturer(ContentValues values);
    boolean removeLecturer(long id);
    boolean updateLecturer(long id, ContentValues values);
    Cursor getLecturer();

    long addCourse(ContentValues values);
    boolean removeCourse(long id);
    boolean updateCourse(long id, ContentValues values);
    Cursor getCourses();

    long addStudentCourse(ContentValues values);

    boolean isUpdatet();
}
