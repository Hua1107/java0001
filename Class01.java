
import Java111Q1.Cal_area;
class Cal_area
{
	  int l;
    int w;
    int h;
    double r;
    void showData1() {
        System.out.println("長 = " +l);
        System.out.println("寬 = " +w);
        System.out.println("高 = " +h);
        System.out.println("半徑 = " +r);
        
        
    }
    void showData2() {
    	 System.out.printf("球形體積 = " + "%.1f", ((double) 3.14159 * r * r * r * 4 / 3));
    	System.out.println("立方體表面積 = " + ((l * w + l * h + h * w) * 2));
}

void showAll() {
    showData2();
    showData1();
}
}
  
public class Class01 {

	
	public static void main(String[] args) {
		  Cal_area area = new Cal_area();
	        area.l = 4;
	        area.w = 5;
	        area.h = 6;
	        area.r = 10;
	        area.showAll();
	}

}
