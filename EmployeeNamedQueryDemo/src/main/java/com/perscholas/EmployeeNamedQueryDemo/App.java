package com.perscholas.EmployeeNamedQueryDemo;


import com.perscholas.controller.EmployeeController;
public class App 
{    public static void main( String[] args )
    {
     //TODO add named queries
        EmployeeController e = new EmployeeController();
        //e.createEmployeeTable();
        //e.findEmployeeByName();
       // e.findEmployeeById();
        e.ShowOfficeCodesAsDepartment();
    }
}