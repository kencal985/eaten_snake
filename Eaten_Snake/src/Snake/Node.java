package Snake;

public class Node {
  private int nodex;
  private int nodey;
  public Node(int nodex,int nodey)
  {
	  this.nodex=nodex;
	  this.nodey=nodey;
	  
  }
  public int getNodex()
  {
	  return nodex;
	  
  }
  public void setnodex(int nodex)
  {
	  this.nodex=nodex;
  }
  public int getnodey()
  {
	  return nodey;
  }
  public void setnodey(int nodey)
  {
	  this.nodey=nodey;
  }
  
}
