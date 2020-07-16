package lecOOPS;

public class Polynomial {
  private int[] degreeCoeff;
  public Polynomial() {
	  degreeCoeff=new int[5];
  }
  public void setCoefficient(int degree, int coeff){
   if(degree>=degreeCoeff.length) {
	   int[] temp=degreeCoeff;
	   degreeCoeff=new int[degree+1];
	   for(int i=0;i<temp.length;i++) {
		   degreeCoeff[i]=temp[i];
	   }}
	   degreeCoeff[degree]=coeff;
   
		
	}
	
	 
	public void print(){
		for(int i=0;i<degreeCoeff.length;i++) {
			if(degreeCoeff[i]!=0) {
				System.out.print(degreeCoeff[i]+"x"+i+" ");
			}
		}
	}

	
	
	public Polynomial add(Polynomial second){

		Polynomial third=new  Polynomial();
		int i=0,j=0;
		while(i<this.degreeCoeff.length && j<second.degreeCoeff.length) {
			third.setCoefficient(i, this.degreeCoeff[i]+second.degreeCoeff[j]);
			i++;
			j++;
		}
		while(i<this.degreeCoeff.length) {
			third.setCoefficient(i, this.degreeCoeff[i]);
			i++;
		}
		while(j<second.degreeCoeff.length) {
			third.setCoefficient(j,second.degreeCoeff[j]);
			j++;
		}
		return third;
	}
	
	
	public Polynomial subtract(Polynomial second){
		Polynomial third=new  Polynomial();
		int i=0,j=0;
		while(i<this.degreeCoeff.length && j<second.degreeCoeff.length) {
			third.setCoefficient(i, this.degreeCoeff[i]-second.degreeCoeff[j]);
			i++;
			j++;
		}
		while(i<this.degreeCoeff.length) {
			third.setCoefficient(i, this.degreeCoeff[i]);
			i++;
		}
		while(j<second.degreeCoeff.length) {
			third.setCoefficient(j,-second.degreeCoeff[j]);
			j++;
		}
		return third;
	}
	
	
	public Polynomial multiply(Polynomial second){
		Polynomial third=new Polynomial();
		for(int i=0;i<this.degreeCoeff.length;i++) {
			for(int j=0;j< second.degreeCoeff.length;j++) {
				
				int newdegree=i+j;
				int newcoeff=this.degreeCoeff[i]*second.degreeCoeff[j];
				if(newdegree<third.degreeCoeff.length) {
					int oldval=third.degreeCoeff[newdegree];
					newcoeff=oldval+newcoeff;
				}
				third.setCoefficient(newdegree, newcoeff);
			}
			
		}
		return third;
	}

}
