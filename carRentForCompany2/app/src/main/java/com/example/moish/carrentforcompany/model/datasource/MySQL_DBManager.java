package com.example.moish.carrentforcompany.model.datasource;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;

import com.example.moish.carrentforcompany.model.backend.Functions;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by moish on 18/12/2017.
 */

public class MySQL_DBManager implements DB_manager{


    private final String UserName="fischbei";
    private final String WEB_URL = "http://"+UserName+".vlab.jct.ac.il/Academy/";


    private boolean updateFlag = false;


    public void printLog(String message)
    {
        Log.d(this.getClass().getName(),"\n"+message);
    }
    public void printLog(Exception message)
    {
        Log.d(this.getClass().getName(),"Exception-->\n"+message);
    }

    @Override
    public long addStudent(ContentValues values) {
        try {
            String result = PHPtools.POST(WEB_URL + "/addStudent.php", values);
            long id = Long.parseLong(result);
            if (id > 0)
                SetUpdate();
            printLog("addStudent:\n" + result);
            return id;
        } catch (IOException e) {
            printLog("addStudent Exception:\n" + e);
            return -1;
        }
    }

    @Override
    public long addLecturer(ContentValues values) {
        try {
            String result = PHPtools.POST(WEB_URL + "/addLecturer.php", values);
            long id = Long.parseLong(result);
            if (id > 0)
                SetUpdate();
            printLog("addLecturer:\n" +result);
            return id;
        } catch (IOException e) {
            printLog("addLecturer:\n" +e);
        }
        return -1;
    }

    @Override
    public long addCourse(ContentValues values) {
        try {
            String result = PHPtools.POST(WEB_URL + "/addCourse.php", values);
            long id = Long.parseLong(result);
            if (id > 0)
                SetUpdate();
            printLog("addCourse:\n" +result);
            return id;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }


    @Override
    public Cursor getStudents() {
        try {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{

                    Functions.ClientConst.ID,
                    Functions.ClientConst.FIRSTNAME,
                    Functions.ClientConst.LASTTNAME,
                    Functions.ClientConst.PHONE,
                    Functions.ClientConst.EMAIL,
                    Functions.ClientConst.CREDITCARDNUMBER

                    });
            String str = PHPtools.GET(WEB_URL + "/students.php");
            JSONArray array = new JSONObject(str).getJSONArray("students");


            for (int i = 0; i < array.length(); i++) {
                JSONObject jsonObject = null;

                jsonObject = array.getJSONObject(i);

                matrixCursor.addRow(new Object[]{
                        jsonObject.getInt   (Functions.ClientConst.ID),
                        jsonObject.getString(Functions.ClientConst.FIRSTNAME),
                        jsonObject.getString(Functions.ClientConst.LASTTNAME),
                        jsonObject.getString(Functions.ClientConst.PHONE),
                        jsonObject.getString(Functions.ClientConst.EMAIL),
                        jsonObject.getString(Functions.ClientConst.CREDITCARDNUMBER)
                });
            }
            return matrixCursor;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Cursor getLecturer() {
        try {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]
                    {
                            Functions.BranchConst.STREET,
                            Functions.BranchConst.ADESSNUMBER,
                            Functions.BranchConst.CITY,
                            Functions.BranchConst.BRANCHNUMBER,
                            Functions.BranchConst.NUMBEROFPARKINGAVAILABLE,

                    });
            String str = PHPtools.GET(WEB_URL + "/lecturers.php");
            JSONArray array = new JSONObject(str).getJSONArray("lecturers");


            for (int i = 0; i < array.length(); i++) {
                JSONObject jsonObject = null;

                jsonObject = array.getJSONObject(i);

                matrixCursor.addRow(new Object[]{

                        jsonObject.getInt(Functions.BranchConst.STREET),
                        jsonObject.getString(Functions.BranchConst.ADESSNUMBER),
                        jsonObject.getString(Functions.BranchConst.CITY),
                        jsonObject.getInt(Functions.BranchConst.BRANCHNUMBER)
                });
            }
            return matrixCursor;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Cursor getCourses() {
        String[] columns = new String[]
                {
                        Functions.CarModelConst.COMPANY_NAME,
                        Functions.CarModelConst.ENGINE_VOLUME,
                        Functions.CarModelConst.ISAUTOMATIC,
                        Functions.CarModelConst.MODEL_ID,
                        Functions.CarModelConst.MODEL_NAME,
                        Functions.CarModelConst.SEATING,

                };

        MatrixCursor matrixCursor = new MatrixCursor(columns);
        try {
            String str = PHPtools.GET(WEB_URL + "/courses.php");
            JSONArray array = new JSONObject(str).getJSONArray("courses");


            for (int i = 0; i < array.length(); i++) {
                JSONObject jsonObject = null;

                jsonObject = array.getJSONObject(i);

                matrixCursor.addRow(new Object[]{
                        jsonObject.getInt(Functions.CarModelConst.COMPANY_NAME),
                        jsonObject.getString(Functions.CarModelConst.ENGINE_VOLUME),
                        jsonObject.getInt(Functions.CarModelConst.ISAUTOMATIC),
                        jsonObject.getBoolean(Functions.CarModelConst.MODEL_ID),
                        jsonObject.getInt(Functions.CarModelConst.MODEL_NAME)
                });
            }
            return matrixCursor;
        } catch (Exception e) {
            return null;
        }


    }


    @Override
    public boolean removeStudent(long id) {
        return false;
    }

    @Override
    public boolean removeCourse(long id) {
        return false;
    }

    @Override
    public boolean removeLecturer(long id) {
        return false;
    }


    @Override
    public boolean updateLecturer(long id, ContentValues values) {
        return false;
    }

    @Override
    public long addStudentCourse(ContentValues values) {
        try {
            String result = PHPtools.POST(WEB_URL + "/addStudentCourse.php", values);
            long id = Long.parseLong(result);
            if (id > 0)
                SetUpdate();
            printLog("addStudentCourse:\n" +result);
            return id;
        } catch (IOException e) {
            printLog("addStudentCourse:\n" +e);
        }
        return -1;
    }

    @Override
    public boolean updateStudent(long id, ContentValues values) {
        return false;
    }

    @Override
    public boolean updateCourse(long id, ContentValues values) {
        return false;
    }


    private void SetUpdate()
    {
        updateFlag = true;
    }

    @Override
    public boolean isUpdatet() {
        if(updateFlag)
        {
            updateFlag=false;
            return  true;
        }

        return  false;
    }


}