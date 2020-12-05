package RestarauntSYS;

import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;
import javax.swing.event.*;


public class RestarauntSYS extends JFrame implements ActionListener {

    JFrame fileMenu;
    JFrame empMenu;
    JFrame dishMenu;
    JFrame salesMenu;
    private Employees employees;
    private Food food;
    private Sales sales;


    JFrame border = null;

    public static void main(String[] a) {
        (new RestarauntSYS()).Main();
    }

    private void Main() {
        border = new JFrame("RestaurantSYS");
        border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        border.setBounds(700, 400, 400, 350);
        border.setContentPane(new JDesktopPane());

        JMenuBar resMenuBar = new JMenuBar();
        JMenu resMenu = File();
        resMenuBar.add(resMenu);


        resMenuBar.add(resMenu);
        resMenu = Dish();
        resMenuBar.add(resMenu);

        resMenuBar.add(resMenu);
        resMenu = Employees();
        resMenuBar.add(resMenu);


        border.setJMenuBar(resMenuBar);
        border.setVisible(true);
    }

    private JMenu File() {
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);


        JMenuItem fileItem = new JMenuItem("Open");
        fileMenu.add(fileItem);

        fileItem = new JMenuItem("Save");
        fileMenu.add(fileItem);

        fileMenu.addSeparator();

        fileItem = new JMenuItem("Exit");
        fileMenu.add(fileItem);


        return fileMenu;
    }

    private JMenu Dish() {
        JMenu dishMenu = new JMenu("Dishes");
        dishMenu.setMnemonic(KeyEvent.VK_O);


        JMenuItem adDish = new JMenuItem("Add Dish");
        dishMenu.add(adDish);

        JMenuItem delDish = new JMenuItem("Delete Dish");
        dishMenu.add(delDish);

        JMenuItem viewDish = new JMenuItem("View Dish");
        dishMenu.add(viewDish);
        return dishMenu;
    }

    private JMenu Employees() {
        JMenu employeeMenu = new JMenu("Employees");
        employeeMenu.setMnemonic(KeyEvent.VK_0);


        JMenuItem empItem = new JMenuItem("Add Employee");
        employeeMenu.add(empItem);

        empItem = new JMenuItem("Delete Employee");
        employeeMenu.add(empItem);

        empItem = new JMenuItem("View Employees");
        employeeMenu.add(empItem);

        return employeeMenu;
    }




            @Override
            public void actionPerformed (ActionEvent e){

            }


}
