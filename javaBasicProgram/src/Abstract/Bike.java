package Abstract;

abstract class Bike{
	abstract void run();
	void speed( int spd) {
		System.out.println("bike speed"+spd);
	}
	class honda4 extends Bike {
		void run() {
			System.out.println("running safely");
		}
		void speed(int spd) {
			System.out.println("honda4 speed:  "+spd);
			super.speed(120);
		}
		void color() {
			System.out.println("honda1 color is blue");
			
		}
	}
	
class abstractClass1{
	public void main(String[] args) {
		honda4 obj =new honda4();
		obj.run();
		obj.speed(60);
		obj.color();
		Bike b2=new honda4();
		b2.run();
		b2.speed(20);

	}
}
}
