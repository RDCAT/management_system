package mao.view.mainpage;

import mao.view.aboutpage.AboutView;
import mao.view.attendancepage.AttendanceView;
import mao.view.departmentpage.DepartmentView;
import mao.view.employeepage.EmployeeView;
import mao.view.userpage.UserView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author 豪
 * @date 2018/6/19 22:52
 */
public class MainView extends JFrame {
    private JPanel jPanelCenter;
    private JButton departmentButton, employeeButton, attendanceButton, userButton, aboutButton;
    private Container container = this.getContentPane();

    public MainView() {
        init();
    }

    private void init() {
        setTitle("主界面");

        jPanelCenter = new JPanel();
        jPanelCenter.setLayout(null);

        //部门管理按钮
        departmentButton = new JButton("部门管理");
        departmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DepartmentView();
            }
        });
        departmentButton.setBounds(90, 20, 100, 30);
        jPanelCenter.add(departmentButton);

        //员工管理按钮
        employeeButton = new JButton("员工管理");
        employeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EmployeeView();
            }
        });
        employeeButton.setBounds(90, 60, 100, 30);
        jPanelCenter.add(employeeButton);

        //考勤管理按钮
        attendanceButton = new JButton("考勤管理");
        attendanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AttendanceView();
            }
        });
        attendanceButton.setBounds(90, 100, 100, 30);
        jPanelCenter.add(attendanceButton);

        //用户管理按钮
        userButton = new JButton("用户管理");
        userButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UserView();
            }
        });
        userButton.setBounds(90, 140, 100, 30);
        jPanelCenter.add(userButton);

        //关于按钮
        aboutButton = new JButton("关于");
        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AboutView();
            }
        });
        aboutButton.setBounds(90, 180, 100, 30);
        jPanelCenter.add(aboutButton);
//        add(jPanelCenter, BorderLayout.CENTER);
        container.add(jPanelCenter, "Center");
        setBounds(600, 300, 300, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
