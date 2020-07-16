package lecOOPS;

public class ComplexNos {
  private int real;
  private int imag;
  
  public ComplexNos(int real,int imag) {
	  this.real=real;
	  this.imag=imag;
  }
  void add(ComplexNos c2) {
	  int realpart=this.real+c2.real;
	  int imagpart=this.imag+c2.imag;
	  this.real=realpart;
	  this.imag=imagpart;
  }
  void multiply(ComplexNos c2){
	  int realpart=(this.real*c2.real)-(this.imag*c2.imag);
	  int imagpart=(this.real*c2.imag)+(this.imag*c2.real);
	  this.real=realpart;
	  this.imag=imagpart;
  }
  void print() {
	  System.out.println(this.real+" + i"+this.imag);
  }
} 
