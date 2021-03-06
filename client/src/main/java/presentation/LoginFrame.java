package presentation;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import businessLogicService.loginBLService.LoginBLService;
import businessLogic_Stub.InquireBLStub;
import client.Main;

public class LoginFrame {

	private JFrame loginFrame;
	private JButton loginButton;
	private JButton cancelButton;
	private JButton guestButton;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JTextField jTextField;
	private JPasswordField jPasswordField;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private final int frameWidth = 300;
	private final int frameHeight = 200;
	private LoginBLService bl;

	public LoginFrame(LoginBLService bl) {
		try {
			// 设置为windows风格
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 初始化各种部件
		componentsInstantiation();
		initComponents();

		loginFrame.setVisible(true);
		this.bl = bl;
	}

	private void componentsInstantiation() {

		loginFrame = new JFrame();
		loginButton = new JButton("登录");
		cancelButton = new JButton("取消");
		guestButton = new JButton("访客入口");
		usernameLabel = new JLabel("用户名");
		passwordLabel = new JLabel("密  码");

		jTextField = new JTextField(20);
		jPasswordField = new JPasswordField(20);

		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
	}

	private void initComponents() {
		// 初始化各种登陆界面的组件
		loginFrame
				.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		loginFrame.setResizable(false);
		loginFrame.setTitle("EDMS登录界面");
		// 三行一列
		loginFrame.setLayout(new GridLayout(3, 1));

		// 点击登录按钮 应该执行的监听
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});

		// 取消按钮执行的监听 退出程序
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// 游客访问按钮
		guestButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guestLogin();
			}
		});

		// 第一行是在一个面板上加入usernameLabel和对应的文字框
		panel1.add(usernameLabel);
		panel1.add(jTextField);

		// 第二行在第二个面板上加入passwordLabel和对应的文本框
		panel2.add(passwordLabel);
		panel2.add(jPasswordField);

		// 加入三个按钮
		panel3.add(loginButton);
		panel3.add(cancelButton);
		panel3.add(guestButton);

		// 将三个面板加到我们的loginFrame上面去
		loginFrame.add(panel1);
		loginFrame.add(panel2);
		loginFrame.add(panel3);
		// 设置login的大小
		loginFrame.setSize(frameWidth, frameHeight);
	}

	/**
	 * 登录的一些状况反馈
	 */
	private void login() {

		// 没输入账户名
		if (jTextField.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "请输入用户名", "",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		// 没输入密码
		if (new String(jPasswordField.getPassword()).isEmpty()) {
			JOptionPane.showMessageDialog(null, "请输入密码", "",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		// 获取用户输入的账户名和密码
		String username = jTextField.getText();
		String password = new String(jPasswordField.getPassword());
         //我就想看下 显示一下密码
		System.out.println("账号为："+username);
		System.out.println("密码是："+password);
		// 调用bl层查看是否有该账户的信息
		// 如果账户和密码输入正确则登录
		boolean result = bl.login(username, password);
		if (!result) {
//			// MainFrame frame = new MainFrame();
//			// Main.frame.setView(new SendView(), "填写寄件单");
			Main.frame.setVisible(true);

			JOptionPane.showMessageDialog(null, "后面还没写", "",
					JOptionPane.ERROR_MESSAGE);
			loginFrame.setVisible(false);
		} else {
			JOptionPane.showMessageDialog(null, "用户名或密码不正确", "",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
	}

	private void guestLogin() {
		// MainFrame frame = new MainFrame();
		Main.frame.setView(new LogisticsUI(new InquireBLStub()), "物流信息查询");
		loginFrame.setVisible(false);
	}

	public JFrame getLoginFrame() {
		return loginFrame;
	}

	public int getFrameWidth() {
		return frameWidth;
	}

	public int getFrameHeight() {
		return frameHeight;
	}

}
