package in.ashokit.bindings;

import java.time.LocalDate;

public class ExInfo {
	
	private String excode;
	private String exmsg;
	private LocalDate exdate;
	
	public String getExcode() {
		return excode;
	}
	public void setExcode(String excode) {
		this.excode = excode;
	}
	public String getExmsg() {
		return exmsg;
	}
	public void setExmsg(String exmsg) {
		this.exmsg = exmsg;
	}
	public LocalDate getExdate() {
		return exdate;
	}
	public void setExdate(LocalDate exdate) {
		this.exdate = exdate;
	}
	
	public ExInfo(String excode, String exmsg, LocalDate exdate) {
		super();
		this.excode = excode;
		this.exmsg = exmsg;
		this.exdate = exdate;
	}
	
	public ExInfo() {
		
	}

}
