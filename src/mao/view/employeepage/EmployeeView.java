package mao.view.employeepage;

import javax.swing.*;
import java.awt.*;

/**
 * @author 豪
 * @date 2018/6/20 10:56
 */
public class EmployeeView extends JFrame {
    private JPanel jPanelCenter;
    private JButton addEmployeeButton, findEmployeeButton, returnButton;
    private Container container = this.getContentPane();

    public EmployeeView() {
        init();
    }

    private void init() {
        setTitle("员工管理界面");

    }
}
