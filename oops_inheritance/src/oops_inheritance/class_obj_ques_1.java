package oops_inheritance;

class Box{
	float width;
	float height;
	float depth;
	Box(float width,float height,float depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	float volume() {
		return width*height*depth;
	}
}


public class class_obj_ques_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box x=new Box(2,2,1);
		System.out.println("Volume of the box "+x.volume());
	}

}
