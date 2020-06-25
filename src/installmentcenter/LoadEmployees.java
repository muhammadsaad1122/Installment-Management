/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package installmentcenter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class LoadEmployees {
    
    private ArrayList<Employees> employee=new ArrayList<Employees>();
    private FileReader fr=null;
    private BufferedReader br=null;
    public ArrayList getdata()
    {
        try{
            fr=new FileReader("employee.txt");
            br=new BufferedReader(fr);
            String line=br.readLine();
            while(line!=null)
            {
                StringTokenizer str=new StringTokenizer(line," ");
                String name=str.nextToken();
                String father=str.nextToken();
                String cnic=str.nextToken();
                String address=str.nextToken();
                int contact=Integer.parseInt(str.nextToken());
                int salary=Integer.parseInt(str.nextToken());
               Employees obj = new Employees(name,father,cnic,address,contact,salary);
               employee.add(obj);
               
                line=br.readLine();
            }
        }catch(Exception e)
        {
         e.printStackTrace();
            
        }
        return employee;
    }
}
