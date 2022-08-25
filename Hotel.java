package collections;

public class Hotel {
	static Veg menuCard(char choice) {
		if(choice=='1'||choice=='1') {
			Veg v=new Veg();
			return v;
		}
		else {
			return null;
		}
	}
	Veg orderFood1(char choice){
		if(choice=='1') {
			Idly i=new Idly();
			return i;
		}
		else if(choice=='2') {
			Dosa d=new Dosa();
			return d;
		}
		else if(choice=='3') {
			Poori p=new Poori();
			return p;
		}
		else {
			return null;
		}

	}

	NonVeg orderFood2(char choice){
		if(choice=='1') {
			Biriyani b=new Biriyani();
			return b;
		}
		else if(choice=='2') {
			Soup s=new Soup();
			return s;
		}

		else {
			return null;
		}

	}
}

