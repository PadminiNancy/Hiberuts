package trans;
import java.io.*;
public class ViewTransBean implements Serializable{
	 public String transno, accno,name,acctype,tratype;
	 public java.sql.Date tdate;
	 public double traamt;
	 
	 public ViewTransBean(){}
	 	
	 public void setTransno(String transno){ this.transno=transno;}
	 public String getTransno(){return transno;}	
	 
	 public void setAccno(String accno){ this.accno=accno;}
	 public String getAccno(){return accno;}
	
	 public void setName(String name){this.name=name;}
	 public String getName(){return name;}
	
	 public void setAcctype(String acctype){this.acctype=acctype;}
	 public String getAcctype(){return acctype;}
	
	 public void setTdate(java.sql.Date tdate){this.tdate=tdate;}
	 public java.sql.Date getTdate(){return tdate;}
	
	 public void setTratype(String tratype){this.tratype=tratype;}
	 public String getTratype(){return tratype;}
	
	 public void setTraamt(double traamt){this.traamt=traamt;}
	 public double getTraamt(){return traamt;}
}