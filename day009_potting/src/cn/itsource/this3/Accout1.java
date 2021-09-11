package cn.itsource.this3;

public class Accout1 {
	private String name;
	
	private String pwd;
	
	private double money;
	
	private boolean vip;
	
	public Accout1 () {}
	
	public Accout1 (String name,String pwd) {
		this.name = name;
		this.pwd = pwd;
	}
	
	public  Accout1 (String name, String pwd, double money, boolean vip) {
		this(name, pwd);
		this.money = money;
		this.vip = vip;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwd() {
		return this.pwd;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public double getMoney() {
		return this.money;
	}
	
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	public boolean isVip() {
		return this.vip;
	}
	
}
