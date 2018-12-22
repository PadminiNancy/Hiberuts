package login;
import java.sql.*;

public final class PKGeneratorFactory{

	private static PKGeneratorFactory factory;
	int intPK;
	String stringPK;
	
	private PKGeneratorFactory(){}
	
	public static PKGeneratorFactory getFactory(){
		if (factory==null)
			factory=new PKGeneratorFactory();
		return factory;
	}
	
	public int getIntPrimaryKey(String tableName,String colName){
		try{
			Connection con=DBConnectionFactory.getFactory().getConnection("AdiPool");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select max("+colName+") from "+tableName);
			if(rs.next()){
				intPK=rs.getInt(1);
			}
			else{
				intPK=0;
			}
			intPK++;
			rs.close();
			stmt.close();
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return intPK;
	}
	public String  getStringPrimaryKey(String tableName,String colName){
		try{
			Connection con=DBConnectionFactory.getFactory().getConnection("AdiPool");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select max( to_number("+colName+"))from "+tableName);
			if(rs.next()){
				stringPK=rs.getString(1);
			}
			else{
				stringPK="0";
			}
			intPK=Integer.parseInt(stringPK);
			intPK++;
			stringPK=new Integer(intPK).toString();
			rs.close();
			stmt.close();
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return stringPK;
	}
}