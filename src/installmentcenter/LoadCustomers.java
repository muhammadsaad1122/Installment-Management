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


public class LoadCustomers {
    private ArrayList<Customers> customer=new ArrayList<Customers>();
    private FileReader fr=null;
    private BufferedReader br=null;
    public ArrayList getdata()
    {
        try{
            fr=new FileReader("customer.txt");
            br=new BufferedReader(fr);
            String line=br.readLine();
            while(line!=null)
            {
                StringTokenizer str=new StringTokenizer(line," ");
                String name=str.nextToken();
                String father=str.nextToken();
                String cnic=str.nextToken();
                String address=str.nextToken();
                String contact=(str.nextToken());
                String accountnum=str.nextToken();
                String intrst=str.nextToken();
                String intrstAmunt=str.nextToken();
                String monthly=str.nextToken();
                String pdate=str.nextToken();
                String endate=str.nextToken();
                int num=Integer.parseInt(str.nextToken());
                ArrayList<Product> products=new ArrayList<Product>();
                for(int j=0;j<num;j++)
                {
                    String lin2=br.readLine();
                    StringTokenizer st=new StringTokenizer(lin2," ");
                    String pname=st.nextToken();
                String company=st.nextToken();
               float price=Float.parseFloat(st.nextToken());
               int quantity=Integer.parseInt(st.nextToken());
               int totel=Integer.parseInt(st.nextToken());
               int instal=Integer.parseInt(st.nextToken());
               ArrayList<Instalment> instalment=new ArrayList<Instalment>();
               for(int k=0;k<instal;k++)
               {
                   String lin3=br.readLine();
                   StringTokenizer s=new StringTokenizer(lin3," ");
                   float monthley=Float.parseFloat(s.nextToken());
                   float remaing=Float.parseFloat(s.nextToken());
                   String date=s.nextToken();
                   Instalment instobj=new Instalment(monthley,remaing,date);
                   instalment.add(instobj);
               }
               Product obj = new Product(pname,price,quantity, company,totel,instalment);
               products.add(obj);
                }
               Customers obj = new Customers(name,father,cnic,address,contact,accountnum,intrst,intrstAmunt,monthly,pdate,endate,products);
               customer.add(obj);
               
                line=br.readLine();
            }
            br.close();
            fr.close();
        }catch(Exception e)
        {
         e.printStackTrace();
            
        }
        return customer;
    }
}
