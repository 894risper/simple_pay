package payroll_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class payroll {

	private JFrame frame;
	private JTextField employeenameTF;
	private JTextField RateperhourTF;
	private JTextField hoursTF;
	private JTextField daysTF;
	private JTextField grosssalaryTF;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField monthlywage;
	private JTextField philhealth;
	private JTextField sus;
	private JTextField DeductionTF;
	private JLabel lblNewLabel_7;
	private JTextField netsalary;
	private JTextField grossTF;
	private JTextField deductTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payroll window = new payroll();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public payroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.setBounds(100, 100, 1033, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Payroll System");
		lblNewLabel.setBounds(357, 11, 236, 72);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel EmployeeName = new JLabel("Employee Name:");
		EmployeeName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		EmployeeName.setBounds(79, 90, 125, 25);
		frame.getContentPane().add(EmployeeName);
		
		employeenameTF = new JTextField();
		employeenameTF.setBounds(204, 94, 162, 20);
		frame.getContentPane().add(employeenameTF);
		employeenameTF.setColumns(10);
		
		JLabel rateperhour = new JLabel("Rate Per Hour:");
		rateperhour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rateperhour.setBounds(79, 126, 101, 33);
		frame.getContentPane().add(rateperhour);
		
		RateperhourTF = new JTextField();
		RateperhourTF.setBounds(204, 134, 162, 25);
		frame.getContentPane().add(RateperhourTF);
		RateperhourTF.setColumns(10);
		
		JLabel hoursperday = new JLabel("Hour Per Day:");
		hoursperday.setFont(new Font("Tahoma", Font.PLAIN, 15));
		hoursperday.setBounds(89, 170, 101, 25);
		frame.getContentPane().add(hoursperday);
		
		hoursTF = new JTextField();
		hoursTF.setBounds(204, 170, 162, 25);
		frame.getContentPane().add(hoursTF);
		hoursTF.setColumns(10);
		
		JLabel days = new JLabel("Number of days worked:");
		days.setFont(new Font("Tahoma", Font.PLAIN, 15));
		days.setBounds(18, 206, 162, 25);
		frame.getContentPane().add(days);
		
		daysTF = new JTextField();
		daysTF.setBounds(204, 206, 162, 25);
		frame.getContentPane().add(daysTF);
		daysTF.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("GROSS SALARY :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(37, 242, 157, 51);
		frame.getContentPane().add(lblNewLabel_1);
		
		grosssalaryTF = new JTextField();
		grosssalaryTF.setEditable(false);
		grosssalaryTF.setBounds(204, 253, 162, 25);
		frame.getContentPane().add(grosssalaryTF);
		grosssalaryTF.setColumns(10);
		
		lblNewLabel_2 = new JLabel("TOTAL DEDUCTION :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(439, 253, 175, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setBackground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(431, 94, 220, 21);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("TAX 15% of Monthly Wage");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(416, 137, 198, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Philhealth 5%");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(506, 177, 87, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("SSS 2%");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(541, 217, 52, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		monthlywage = new JTextField();
		monthlywage.setEditable(false);
		monthlywage.setBounds(624, 134, 86, 25);
		frame.getContentPane().add(monthlywage);
		monthlywage.setColumns(10);
		
		philhealth = new JTextField();
		philhealth.setEditable(false);
		philhealth.setColumns(10);
		philhealth.setBounds(624, 174, 86, 25);
		frame.getContentPane().add(philhealth);
		
		sus = new JTextField();
		sus.setEditable(false);
		sus.setColumns(10);
		sus.setBounds(624, 210, 86, 25);
		frame.getContentPane().add(sus);
		
		DeductionTF = new JTextField();
		DeductionTF.setEditable(false);
		DeductionTF.setColumns(10);
		DeductionTF.setBounds(624, 260, 86, 25);
		frame.getContentPane().add(DeductionTF);
		
		lblNewLabel_7 = new JLabel("NET SALARY :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setBounds(733, 260, 157, 33);
		frame.getContentPane().add(lblNewLabel_7);
		
		netsalary = new JTextField();
		netsalary.setEditable(false);
		netsalary.setBounds(879, 268, 101, 25);
		frame.getContentPane().add(netsalary);
		netsalary.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Gross Salary:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(781, 119, 93, 24);
		frame.getContentPane().add(lblNewLabel_8);
		
		grossTF = new JTextField();
		grossTF.setEditable(false);
		grossTF.setColumns(10);
		grossTF.setBounds(879, 118, 101, 25);
		frame.getContentPane().add(grossTF);
		
		JLabel lblNewLabel_9 = new JLabel("Deduction:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(791, 154, 83, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		deductTF = new JTextField();
		deductTF.setEditable(false);
		deductTF.setColumns(10);
		deductTF.setBounds(879, 153, 101, 25);
		frame.getContentPane().add(deductTF);
		
		JButton btnNewButton = new JButton("Compute");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rate,hour,days,gross,tax,phil,deduct,net,sss;
				rate=Integer.valueOf(RateperhourTF.getText());
				hour=Integer.valueOf(hoursTF.getText());
				days=Integer.valueOf(daysTF.getText());
				gross=rate*hour*days;
				
				grosssalaryTF.setText(String.valueOf(gross));
				tax=(gross*15)/100;
				monthlywage.setText(String.valueOf(tax));
				sss=(gross*2)/100;
				sus.setText(String.valueOf(sss));
				phil=(gross*5)/100;
				philhealth.setText(String.valueOf(phil));
				deduct=phil+tax+sss;
				DeductionTF.setText(String.valueOf(deduct));
				
				net=gross-deduct;
				netsalary.setText(String.valueOf(net));
				grossTF.setText(String.valueOf(gross));
				deductTF.setText(String.valueOf(deduct));	
				
				
				
			}
		});
		btnNewButton.setBackground(new Color(0, 64, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(461, 313, 132, 51);
		frame.getContentPane().add(btnNewButton);
	}
}
