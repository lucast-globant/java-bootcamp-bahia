package player;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormPlayer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Mp3Player r = null;
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPlayer frame = new FormPlayer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormPlayer() {
		r = new Mp3Player();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPlay_2 = new JButton("Play");
		btnPlay_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					r.OpenFile("C:/Users/Public/Music/Sample Music/Kalimba.mp3");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnPlay_2);
		
		JButton btnPlay_1 = new JButton("Pause");
		btnPlay_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					r.Pause();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnPlay_1);
		
		JButton btnPlay = new JButton("Stop");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					r.Stop();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JButton btnContinue = new JButton("Resume");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					r.Resume();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		contentPane.add(btnContinue);
		contentPane.add(btnPlay);
	}

}
