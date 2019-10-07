package Snake;

import java.util.LinkedList;
import java.util.Random;

public class snake {
  private LinkedList<Node> snakebody;
  private Random random;
  private Snakegameview snakegameview;
  int direction=0;//设置snake方向 0上，1右，2下，3左
  public snake(int snakeheadx,int snakeheady,Snakegameview snakegameview)
  {
	  random=new Random();
	  snakebody=new LinkedList<>();
	  snakebody.add(new Node(snakeheadx,snakeheady));
	  this.snakegameview=snakegameview;
  }
  public int getirection()
  {
	  return direction;
  }
  public void setdirection(int direction)
  {
	  this.direction=direction;
  }
  public Node getsnakehead()
  {
	  return snakebody.getFirst();
  }
  public LinkedList<Node> getsnakebody()
  {
	  return snakebody;
  }
  //控制大蛇的移动
  public void snakemove()
  {
	  switch(direction)
	  {
	  case 0:
		  snakebody.addFirst(new Node(getsnakehead().getNodex(),getsnakehead().getnodey()-DrawView.VIENUMBER));break;
	  case 1:
		  snakebody.addFirst(new Node(getsnakehead().getNodex()+DrawView.VIEWNUMBER,getsnakehead().getnodey()));break;
	  case 2:
		  snakebody.addFirst(new Node(getsnakehead().getNodex(),getsnakehead().getnodey()+DrawView.VIEWNUMBER));break;
	  case 3:
		  snakebody.addFirst(new Node(getsnakehead().getNodex()-DrawView.VIEWNUMBER,getsnakehead().getnodey()));break;		  
	  }
	 snakebody.removeLast(); 
  }
  public void eategg(Node egg)
  {
	  if(snakebody.getFirst().getNodex()==egg.getNodex()&&snakebody.getFirst().getnodey()==egg.getnodey())
	  {
		  snakebody.add(egg);
		  snakegameview.setegg(random.nextInt(DrawView.VIEWWIDTH)-1)*DrawView.VIEWNUMBER,
		                       random.nextInt(DrawView.VIEWWIDTH)-1)*DrawView.VIEWNUMBER);
		  Snakegameview.gameScore=Snakegameview.gameScore+5;
		  Snakegameview.getTextArea().setText(Snakegameview.gameScore + "");
		  System.out.println("吃到苹果了");
	  }
  }
  public void snakeruninterface()
  {
	  if(this.getsnakehead().getNodex()<0||this.getsnakehead().getnodey()<0||this.getsnakehead().getNodex()>(DrawView.VIEW_WIDTH*DrawView.VIEWNUMBER)||
			  (this.getsnakehead().getnodey())>(DrawView.VIEW_WIDTH*DrawView.VIEWBUMBER))
	  {
		  Snakegameview.gamestate=false; 
	  }
  }
}
