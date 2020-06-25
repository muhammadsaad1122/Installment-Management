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


public class LoadProducts {
    private ArrayList<Product> product=new ArrayList<Product>();
    private FileReader fr=null;
    private BufferedReader br=null;
    public ArrayList getdata()
    {
        try{
            fr=new FileReader("product.txt");
            br=new BufferedReader(fr);
            String line=br.readLine();
            while(line!=null)
            {
                StringTokenizer str=new StringTokenizer(line," ");
                String name=str.nextToken();
                String company=str.nextToken();
               float price=Float.parseFloat(str.nextToken());
               int quantity=Integer.parseInt(str.nextToken());
               Product obj = new Product(name,price,quantity, company,0,new ArrayList<Instalment>());
               product.add(obj);
               
                line=br.readLine();
            }
        }catch(Exception e)
        {
         e.printStackTrace();
            
        }
        return product;
    }
}
