package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.external.IplApp;
import com.xworkz.abstraction.external.MysqlJdbc;
import com.xworkz.abstraction.external.OracleJdbc;
import com.xworkz.abstraction.internal.Jdbc;


public class JdbcRunner
{
    public static void main(String[] args) {

        Jdbc jdbc=new MysqlJdbc();
        Jdbc jdbc1=new OracleJdbc();  // loose coupling
        // we just replace the jdbc1 instead of jdbc without any change in the class
        // that is loose coupling

        IplApp iplApp=new IplApp(jdbc);  // abstraction
        iplApp.saveTeamInfo();

        /* Abstraction
        * interface is used as variable or implementation
        * interface is used as variable in IplApp class without knowing the implementation
        * interface is implemented in another classes are oracle and mysql
        *
        * now IplApp doesn't know mysql and mysql doesn't know IplApp
        * this two classes are connected by jdbc interface that is abstraction
        * */
    }
}
