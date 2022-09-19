class Class1{
	double width;
	double height;
	double depth;
	String method(){
		//to return a value u should change the void to type of return value type
		System.out.println("This is a method from another class");
		return "this is return value";
	}
	void perameters(double w, double h, double d){
		width = w;
		depth = d;
		height = h;
	}
	double volume(){
		return width*depth*height;
	}
}
class Constructor{
	double width;
	double height;
	double depth;
	Constructor(double w, double h, double d){
		//with perameters or without perameters
		width = w;
		height= h;
		depth = d;
	}
	double volume(){
		return width*height*depth;
	}
}
class Classes{
	public static void main(String args[]){
		Class1 class1Object = new Class1();
		class1Object.width = 40;
		class1Object.height = 3;
		class1Object.depth = 50;
		System.out.println(class1Object.width *class1Object.height*class1Object.depth);
		Class1 class1Object1 = new Class1();
		class1Object1.perameters(4,3,5);
		double vol = class1Object1.volume();
		System.out.println("volume from other class with return value "+vol);
		String hello = class1Object.method();
		System.out.println(hello);
		
		Constructor class2Objecct = new Constructor(1,2,3);
		double vol2 = class2Objecct.volume();
		System.out.println("class2 with constuctor volume"+ vol2);
	}
}