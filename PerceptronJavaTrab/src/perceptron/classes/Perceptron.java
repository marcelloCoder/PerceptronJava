/**
 * 
 */
package perceptron.classes;

import java.io.Serializable;

/**
 * @author marce
 *
 */
public class Perceptron implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Double Age; 
	private Double SystolicBP; 
	private Double DiastolicBP; 
	private Double BS; 
	private Double BodyTemp;
	private Double HeartRate;
	private int RiskLevel;
	
	public Perceptron() {
		
	}
	
	
	public Perceptron(Double age, Double systolicBP, Double diastolicBP, Double bS, Double bodyTemp, Double heartRate,
			int riskLevel) {
		super();
		this.Age = age;
		this.SystolicBP = systolicBP;
		this.DiastolicBP = diastolicBP;
		this.BS = bS;
		this.BodyTemp = bodyTemp;
		this.HeartRate = heartRate;
		this.RiskLevel = riskLevel;
	}


	public Double getAge() {
		return Age;
	}


	public void setAge(Double age) {
		this.Age = age;
	}


	public Double getSystolicBP() {
		return SystolicBP;
	}


	public void setSystolicBP(Double systolicBP) {
		this.SystolicBP = systolicBP;
	}


	public Double getDiastolicBP() {
		return DiastolicBP;
	}


	public void setDiastolicBP(Double diastolicBP) {
		this.DiastolicBP = diastolicBP;
	}


	public Double getBS() {
		return BS;
	}


	public void setBS(Double bS) {
		this.BS = bS;
	}


	public Double getBodyTemp() {
		return BodyTemp;
	}


	public void setBodyTemp(Double bodyTemp) {
		this.BodyTemp = bodyTemp;
	}


	public Double getHeartRate() {
		return HeartRate;
	}


	public void setHeartRate(Double heartRate) {
		this.HeartRate = heartRate;
	}


	public int getRiskLevel() {
		return RiskLevel;
	}


	public void setRiskLevel(int riskLevel) {
		this.RiskLevel = riskLevel;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Age == null) ? 0 : Age.hashCode());
		result = prime * result + ((BS == null) ? 0 : BS.hashCode());
		result = prime * result + ((BodyTemp == null) ? 0 : BodyTemp.hashCode());
		result = prime * result + ((DiastolicBP == null) ? 0 : DiastolicBP.hashCode());
		result = prime * result + ((HeartRate == null) ? 0 : HeartRate.hashCode());
		result = prime * result + RiskLevel;
		result = prime * result + ((SystolicBP == null) ? 0 : SystolicBP.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perceptron other = (Perceptron) obj;
		if (Age == null) {
			if (other.Age != null)
				return false;
		} else if (!Age.equals(other.Age))
			return false;
		if (BS == null) {
			if (other.BS != null)
				return false;
		} else if (!BS.equals(other.BS))
			return false;
		if (BodyTemp == null) {
			if (other.BodyTemp != null)
				return false;
		} else if (!BodyTemp.equals(other.BodyTemp))
			return false;
		if (DiastolicBP == null) {
			if (other.DiastolicBP != null)
				return false;
		} else if (!DiastolicBP.equals(other.DiastolicBP))
			return false;
		if (HeartRate == null) {
			if (other.HeartRate != null)
				return false;
		} else if (!HeartRate.equals(other.HeartRate))
			return false;
		if (RiskLevel != other.RiskLevel)
			return false;
		if (SystolicBP == null) {
			if (other.SystolicBP != null)
				return false;
		} else if (!SystolicBP.equals(other.SystolicBP))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Perceptron [Age=" + Age + ", SystolicBP=" + SystolicBP + ", DiastolicBP=" + DiastolicBP + ", BS=" + BS
				+ ", BodyTemp=" + BodyTemp + ", HeartRate=" + HeartRate + ", RiskLevel=" + RiskLevel + "]";
	}


	


	

	
	
	
	

}
