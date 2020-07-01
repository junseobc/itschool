package info;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InfoDAO {

	DBOpen dbopen = null;
	DBClose dbclose = null;
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sql= null;
	
	public InfoDAO() {
		dbopen = new DBOpen();
		System.out.println(dbopen);
		dbclose = new DBClose();
	}
	
	public InfoVO read(String ccode, String pcode) {
		InfoVO vo = null;
		
		try {
			con = dbopen.getConnection();
			sql = new StringBuffer();
			
			sql.append(" select a.ccode ccode, b.cname cname, a.pcode pcode, a.pname pname " );
			sql.append(" from info_tbl a, cinfo_tbl b");
			sql.append(" where a.ccode = b.ccode");
			sql.append(" and a.ccode = ? and a.pcode = ?");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, ccode);
			pstmt.setString(2, pcode);
			rs = pstmt.executeQuery();
		
			if(rs.next() == true) {
				vo = new InfoVO();
				vo.setCcode(rs.getString("ccode"));
				vo.setCname(rs.getString("cname"));
				vo.setPcode(rs.getString("pcode"));
				vo.setPname(rs.getString("pname"));
			}
	    } catch(Exception e) {
	    	e.printStackTrace();
	    }finally {
	    	dbclose.close(con, pstmt, rs);
	    }
		return vo;
	}
}
