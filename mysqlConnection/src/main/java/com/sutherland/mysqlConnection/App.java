package com.sutherland.mysqlConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        EmpDao dao=new EmpDao();
        
        System.out.println(dao.save());
    }
}
