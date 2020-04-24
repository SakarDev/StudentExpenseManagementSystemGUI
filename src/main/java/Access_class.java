
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;



public class Access_class {

    public static File file = new File("src\\main\\java\\Files\\file.txt");
    public static File reg_inf = new File("src\\main\\java\\Files\\regInfo.txt");
    public static File Bills = new File("src\\main\\java\\Files\\Bills.txt");
    public static File checkout_confirm = new File("src\\main\\java\\Files\\checkout_confirm.txt");
    public static String first_name = "";
    public static  List <String> users_NamesList = new ArrayList<String>();
    public static List <String> name_sumList = new ArrayList<String>();
    public static List <String> name_sum_pay_recieve_list = new ArrayList<String>();
    public static int totalSum = 0;
    public static File checkout = new File("src\\main\\java\\Files\\checkout.txt");
    
    public void createFiles() throws IOException{
        if(!file.exists())
        file.createNewFile();
        if(!Bills.exists())
        Bills.createNewFile();
        if(!checkout.exists())
        checkout.createNewFile();
        if(!checkout_confirm.exists())
        checkout_confirm.createNewFile();
    }
    public void add_username(String username , String password) throws IOException{
        FileWriter writer = new FileWriter(file, true);
        writer.write(username);
        writer.write(",");
        writer.write(password);
        writer.write("\n");
        writer.close();
    }
    public boolean invalid_username(String username) throws FileNotFoundException, IOException{
        FileReader reader = new FileReader(file);
        BufferedReader bafr = new BufferedReader(reader);
        String str = "";
        while ((str = bafr.readLine()) != null){
            if (str.split(",")[0].equals(username)){
                return true;
            }
        }
        bafr.close();
        reader.close();
        return false;
    }
    public void registering_information(String fname, String lname, String uname, String pass, String phone, String city, String bDate, String gender) throws IOException{
        fname = fname.toUpperCase();
        lname = lname.toUpperCase();
        if(!reg_inf.exists())
        reg_inf.createNewFile();
        FileWriter writer = new FileWriter(reg_inf, true);
        writer.write(fname.charAt(0) + fname.substring(1).toLowerCase() + ",  ");
        writer.write(lname.charAt(0) + lname.substring(1).toLowerCase() + ",  ");
        writer.write(uname + ",  ");
        writer.write(pass + ",  ");
        writer.write(phone + ",  ");
        writer.write(city + ",  ");
        writer.write(bDate + ",  ");
        writer.write(gender + "\n");
        writer.close();
    }
    public boolean login_validaity(String username, String password) throws FileNotFoundException, IOException{
        FileReader reader = new FileReader(file);
        BufferedReader bafr = new BufferedReader(reader);
        String s = "";
        while((s = bafr.readLine()) != null){
            if (s.split(",")[0].equals(username) && s.split(",")[1].equals(password)){
                return true;
            }
        }
        bafr.close();
        reader.close();
        return false;
    }
    public void create_new_file(String username) throws IOException{
        File myFile = new File("src\\main\\java\\Files\\" + username + ".txt");//username rega naiat ba duplicate so bo name ama gwnjawa
        if(!myFile.exists())
        myFile.createNewFile();
        FileWriter writer = new FileWriter(myFile);
        FileReader reader = new FileReader(myFile);
        BufferedReader bafr = new BufferedReader(reader);
        writer.close();
        bafr.close();
        reader.close();
    }
    public String find_user_firstName(String username) throws FileNotFoundException, IOException{
        FileReader reader = new FileReader(reg_inf);
        BufferedReader bafr = new BufferedReader(reader);
        String s ="";
        while((s = bafr.readLine()) != null){
            if(s.split(",  ")[2].equals(username)){
                return (first_name = (s.split(",  ")[0]));
            }
        }
        bafr.close();
        reader.close();
        return null;
    }
    public void importData_fromPersonalFile_toTable() throws IOException{
        User_choice uc = new User_choice();
        Personal_table pt = new Personal_table();
        String username = uc.USERNAME;
        File f = new File ("src\\main\\java\\Files\\" + username + ".txt");
        FileReader fr = new FileReader(f);
        BufferedReader bafar = new BufferedReader(fr);
        DefaultTableModel model = (DefaultTableModel)pt.jTable_personal.getModel();
        Object[] lines = bafar.lines().toArray();
        for (int i = 0; i<lines.length; i++){
            String row[] = lines[i].toString().split(",");
            model.addRow(row);
        }
        bafar.close();
        fr.close();
        pt.setVisible(true);
    }
    public void importData_fromPersonalFile_toTable_ForDELETE() throws FileNotFoundException, IOException{
        User_choice uc = new User_choice();
        personalT_deleteItem pd = new personalT_deleteItem();
        String username = uc.USERNAME;
        File f = new File("src\\main\\java\\Files\\" + username + ".txt");
        FileReader r = new FileReader(f);
        BufferedReader bafar = new BufferedReader(r);
        DefaultTableModel model = (DefaultTableModel) personalT_deleteItem.jTable_personalDeleteItem.getModel();
        Object[] lines = bafar.lines().toArray();
        for (int i = 0; i<lines.length; i++){
            String row[] = lines[i].toString().split(",");
            model.addRow(row);
        }
        bafar.close();
        r.close();
        pd.setVisible(true);
    }
    public void importData_fromGenaralFile_toTable() throws IOException{
        sort_generalTable();
        FileReader fr = new FileReader(Bills);
        BufferedReader bafarR = new BufferedReader(fr);
        Table_general tg = new Table_general();
        DefaultTableModel model = (DefaultTableModel)tg.jTable_general.getModel();
        Object lines[] = bafarR.lines().toArray();
        for (int i = 0; i<lines.length; i++){
            String row[] = lines[i].toString().split(",");
            model.addRow(row);
        }
        bafarR.close();
        fr.close();
        tg.setVisible(true);
    }
    public void sort_generalTable() throws FileNotFoundException, IOException{
        BufferedReader bafarR = new BufferedReader(new FileReader(Bills));
        List<String> lines = new ArrayList<String>();
        String str = "";
        while((str = bafarR.readLine()) != null){
            lines.add(str);
        }
        Collections.sort(lines);      
        FileWriter writer = new FileWriter(Bills);
        writer.write("");
        BufferedWriter bafarW = new BufferedWriter(writer);
        for (String line : lines){
            bafarW.write(line);
            bafarW.write("\n");
        }
        bafarW.close();
        writer.close();
    }
    public void viewAll_checkout() throws FileNotFoundException, IOException{
        storeUnamesFnamesINlist();
        sumGeneral();
        store_sumAndname_list();
        pay_recieve();
        imort_name_sum_pay_recieve_TOtable();
    }
    public void storeUnamesFnamesINlist() throws FileNotFoundException, IOException{
        FileReader r = new FileReader(reg_inf);
        BufferedReader bafar = new BufferedReader(r);
        String s = "";
        users_NamesList.clear();
        while((s = bafar.readLine()) != null){
            users_NamesList.add(s.split(",  ")[2]);
            users_NamesList.add(s.split(",  ")[0]);
        }
    }
    public void sumGeneral() throws FileNotFoundException, IOException{
        FileReader r = new FileReader(Bills);
        BufferedReader bafarR = new BufferedReader(r);
        String s = "";
        totalSum = 0;
        while((s=bafarR.readLine()) != null){
            totalSum +=Integer.parseInt(s.split(",")[2]);
        }
    }
    public void store_sumAndname_list() throws IOException{
        String path = "";
        name_sumList.clear();
        for (int i = 0; i<users_NamesList.size(); i+=2){
            path = "src\\main\\java\\Files\\" + users_NamesList.get(i) + ".txt";
            File f = new File(path);
            FileReader r = new FileReader(f);
            BufferedReader bfr = new BufferedReader(r);
            int sum = 0;
            String s = "";
            while ((s = bfr.readLine()) != null){
                sum += Integer.parseInt(s.split(",")[1]);
            }
            name_sumList.add(users_NamesList.get(i+1));
            name_sumList.add(String.valueOf(sum));
        }
    }
    public void pay_recieve() throws IOException{
        int n = name_sumList.size() / 2;
        int avg = totalSum / n;
        int pay = 0;
        int recieve = 0;
        name_sum_pay_recieve_list.clear();
        for (int i = 0; i<name_sumList.size(); i+=2){
            pay = avg - Integer.parseInt(name_sumList.get(i+1));
            if (pay < 0){
                pay = 0;}
            recieve = Integer.parseInt(name_sumList.get(i+1)) - avg;
            if (recieve < 0){
                recieve = 0;}
            name_sum_pay_recieve_list.add(name_sumList.get(i));
            name_sum_pay_recieve_list.add(name_sumList.get(i+1));
            name_sum_pay_recieve_list.add(String.valueOf(pay));
            name_sum_pay_recieve_list.add(String.valueOf(recieve));
        }
    }
    public void imort_name_sum_pay_recieve_TOtable() throws IOException{
        FileWriter w = new FileWriter(checkout);
        w.write("");
        BufferedWriter bfr = new BufferedWriter(w);
        viewCheckout vc = new viewCheckout();
        for (int i = 0; i<name_sum_pay_recieve_list.size(); i+=4){
            bfr.write(name_sum_pay_recieve_list.get(i)+ ",");
            bfr.write(name_sum_pay_recieve_list.get(i+1) + ",");
            bfr.write(name_sum_pay_recieve_list.get(i+2) + ",");
            bfr.write(name_sum_pay_recieve_list.get(i+3) + "\n");
        }
        bfr.close();
        w.close();
        DefaultTableModel model = (DefaultTableModel) vc.jTable_checkout.getModel();
        FileReader r = new FileReader(checkout);
        BufferedReader bfrRdr = new BufferedReader(r);
        Object all_lines[] = bfrRdr.lines().toArray();
        for (int i = 0; i<all_lines.length; i++){
            String row[] = all_lines[i].toString().split(",");
            model.addRow(row);
        }
        bfrRdr.close();
        r.close();
        vc.setVisible(true);
    }
    public boolean NotpopUp_checkoutMsg() throws FileNotFoundException, IOException{
        User_choice uc = new User_choice();
        String username = uc.USERNAME;
        BufferedReader bafar = new BufferedReader(new FileReader(checkout_confirm));
        String s = "";
        while((s = bafar.readLine()) != null){
            if (s.split(",")[0].equals(username)){
                uc.setVisible(true);
                return true;
            }
        }
        if(checkout_confirm.length() == 0){
            uc.setVisible(true);
            return true;
        }
        return false;
    }
    public void popUp_checkoutMsgToUsers() throws IOException{
        TheMsg msg = new TheMsg();
        if (!NotpopUp_checkoutMsg()){
           msg.setVisible(true);
        }
    }
    public void clearUserFile() throws FileNotFoundException, IOException{
        BufferedReader bfr = new BufferedReader(new FileReader(file));
        String s = "";
        while((s = bfr.readLine()) != null){
                String fileName = s.split(",")[0];
                BufferedWriter writer = new BufferedWriter (new FileWriter("src\\main\\java\\Files\\" + fileName + ".txt"));
                writer.write("");
                writer.close();
            }
    }
    public void clearCheckoutFile() throws IOException{
         BufferedWriter wr = new BufferedWriter (new FileWriter("src\\main\\java\\Files\\checkout.txt"));
         wr.write("");
         wr.close();
    }
}
 