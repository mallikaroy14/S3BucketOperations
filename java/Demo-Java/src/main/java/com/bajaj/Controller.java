package com.bajaj;

import com.bajaj.students.Students;

import java.sql.SQLException;
import java.util.ArrayList;

public interface Controller {

    public void create() throws SQLException;

    public void display(ArrayList<Students> students);

}
