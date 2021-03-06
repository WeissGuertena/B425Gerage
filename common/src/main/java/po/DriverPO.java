package po;

import java.io.Serializable;
import java.util.Date;

/**
 * 储存司机信息的PO
 * @author 王栋
 *
 */
public class DriverPO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 司机的编号
	 */
	private String id;
	
	/**
	 * 司机的姓名
	 */
	private String name;
	
	/**
	 * 司机的身份证号
	 */
	private String IDnumber;
	
	/**
	 * 司机的出生日期
	 */
	
	private Date d;
	
	/**
	 * 手机号码
	 */
	
	private String telNumber;
	/**
	 * 司机的所属的机构的编号
	 */
	private String institutionID;
	

	/**
	 * 车牌号
	 */
	private String truckID;
	
	
	
	/**
	 * 工作年限 若不填则为零
	 */
	private int workYears;
	
	/**
	 * 行驶证期限 也就是行驶证的能用到什么时候   额没有行驶证大致猜测一下就是这个功能
	 */
	
	private Date driveLicence;

	
	
	
	

	public DriverPO(String id, String name, String iDnumber, Date d,
			String telNumber, String institutionID, String truckID,
			int workYears, Date driveLicence) {
		super();
		this.id = id;
		this.name = name;
		IDnumber = iDnumber;
		this.d = d;
		this.telNumber = telNumber;
		this.institutionID = institutionID;
		this.truckID = truckID;
		this.workYears = workYears;
		this.driveLicence = driveLicence;
	}

	
	public String getTelNumber() {
		return telNumber;
	}


	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}


	public String getIDnumber() {
		return IDnumber;
	}

	public void setIDnumber(String iDnumber) {
		IDnumber = iDnumber;
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public String getInstitutionID() {
		return institutionID;
	}

	public void setInstitutionID(String institutionID) {
		this.institutionID = institutionID;
	}

	public String getTruckID() {
		return truckID;
	}

	public void setTruckID(String truckID) {
		this.truckID = truckID;
	}

	public int getWorkYears() {
		return workYears;
	}

	public void setWorkYears(int workYears) {
		this.workYears = workYears;
	}

	public Date getDriveLicence() {
		return driveLicence;
	}

	public void setDriveLicence(Date driveLicence) {
		this.driveLicence = driveLicence;
	}

	public DriverPO(){
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String toString(){
		return name;
	}
}
