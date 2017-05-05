package action;

import com.opensymphony.xwork2.ActionContext;

public class firstAction {
	private double x;
	private double y;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public String add(){
		ActionContext ac = ActionContext.getContext();
		Integer num = (Integer) ac.getApplication().get("num");
		if(num == null){
			num = 1;
		}
		else{
			num++;
		}
		ac.getApplication().put("num", num);
		return "success";
	}
	public String substruction(){	//¼õ
			
		} 
	public String multipcation(){  //³Ë
		
	}
	public String division(){ 	//³ý
		
	}
}
