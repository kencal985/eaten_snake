package Snake;

import java.awt.Color;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JTextArea;



public class Snakegameview extends Frame {
  private JLabel jl;
  private DrawView drawview;
  private Panel panel;
  private JLabel scoreTitle;
  private JLabel score;
  private Panel rule;
  private JTextArea hint;
  private Random random;
  private static boolean gamestate=true;
  private static int gamescore=0;
  private snake snake;
  private Node egg;
  private gamerunThread grt;
  private static Thread thread;
  public Snakegameview()
  {
	  random =new Random();
	  //初始化snake
	  snake=new Snake(10*DrawView.VIEWNUMBER+random.nextInt(19)*DrawView.VIEWNUMBER,
	10*DrawView.VIEWNUMBER+random.nextInt(19)*DrawView.VIEWNUMBER,this );
	  //初始化苹果
	  egg=new Node(random.nextInt(DrawView.VIEWWIDTH-1)*DrawView.VIEWNUMBER,
			  random.nextInt(DrawView.VIEW_WIDTH-1)*DrawView.VIEW_NUMBER);
	  //初始化画板
	  drawview=new DrawView(snake,egg);
	  grt=new gamerunThread(drawview,snake);
	  thread=new Thread(grt);
	  jl=new JLabel("SnakeGame-3.0",JLabel.CENTER);
	  panel=new Panel();
	  scoreTitle=new JLabel("Score",JLabel.CENTER);
	  score=new JLabel("Score",JLabel.CENTER);
	  rule=new Panel();
	  hint=new JTextArea("操作方式[esc]退出");
	  //设置鸡蛋	  
  }
  public void setegg(int eggx, int eggy)
  {
	  this.egg.setnodex(eggx);
	  this.egg.setnodey(eggy);
  }
  //获得
  public JLabel getTextArea()
  {
	  return score;
  }
  public static void main(String []args)
  {
	  new Snakegameview().showview();
	  thread.start();
  }
  public void showview()
  {
	  jl.setFont(new Font("宋体",1,18));
	  jl.setForeground(Color.white);
	  jl.setBounds(0, 0, DrawView.VIEW_HEIGHT * DrawView.VIEWNUMBER + 70, 40);
	  panel.setLayout(null);
	  panel.setBackground(new Color(51,51,51));
  }
}
